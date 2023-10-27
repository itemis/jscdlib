package com.itemis.jscdlib;

import static ch.qos.logback.classic.Level.WARN;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static com.itemis.jscdlib.SCardLibHandle.PCSC_SCOPE_SYSTEM;
import static com.itemis.jscdlib.SCardLibHandle.SCARD_ALL_READERS;
import static com.itemis.jscdlib.SCardLibHandle.SCARD_AUTOALLOCATE;
import static com.itemis.jscdlib.problem.JScdProblems.SCARD_E_NO_MEMORY;
import static com.itemis.jscdlib.problem.JScdProblems.SCARD_E_NO_READERS_AVAILABLE;
import static com.itemis.jscdlib.problem.JScdProblems.SCARD_S_SUCCESS;
import static java.lang.foreign.MemorySegment.NULL;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.ArgumentMatchers.same;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.itemis.fluffyj.memory.FluffyMemory;
import com.itemis.fluffyj.memory.internal.StringSegment;
import com.itemis.fluffyj.tests.FluffyTestHelper;
import com.itemis.fluffyj.tests.logging.FluffyTestAppender;
import com.itemis.jscdlib.internal.ScardLibNativeBridge;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblem;
import com.itemis.jscdlib.problem.JScdProblems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

class SCardLibHandleTest {

    private static final Logger LOG = LoggerFactory.getLogger(SCardLibHandleTest.class);

    private static final String READER_ONE = "readerOne";
    private static final String READER_TWO = "readerTwo";

    @RegisterExtension
    FluffyTestAppender logAssert = new FluffyTestAppender();

    private SCardMethodInvocations invocations;
    private ScardLibNativeBridge bridgeMock;
    private Arena testArena;

    private SCardLibHandle underTest;

    @BeforeEach
    void setUp() {
        bridgeMock = mock(ScardLibNativeBridge.class);
        invocations = new SCardMethodInvocations();
        testArena = Arena.ofShared();

        setupAllMethodsSuccess();

        underTest = new SCardLibHandle(bridgeMock);
    }

    @AfterEach
    void tearDown() {
        if (underTest != null) {
            try {
                underTest.close();
            } catch (final Exception e) {
                LOG.warn("Possible ressource leak. Could not close JScd test handle.", e);
            }
        }

        if (testArena != null && testArena.scope().isAlive()) {
            try {
                testArena.close();
            } catch (final Exception e) {
                LOG.warn("Possible ressource leak. Could not close test memory session.", e);
            }
        }
    }

    @Test
    void test_handle_is_final() {
        FluffyTestHelper.assertFinal(SCardLibHandle.class);
    }

    @Test
    void test_handle_is_autoclosable() {
        assertThat(AutoCloseable.class).as("JScd handles must be autoclossable").isAssignableFrom(SCardLibHandle.class);
    }

    @Test
    void test_listReaders_returns_list() {
        setupAvailableReaders(READER_ONE);
        assertThat(underTest.listReaders()).as("Method must return a list").isInstanceOf(List.class);
    }

    @Test
    void test_listReaders_returns_immutable_list() {
        setupAvailableReaders(READER_ONE);
        assertThatThrownBy(() -> underTest.listReaders().add("testString")).as("list of readers must be immutable")
            .isInstanceOf(UnsupportedOperationException.class);
    }

    @Test
    void when_one_reader_is_available_return_its_name_as_list() {
        setupAvailableReaders(READER_ONE);
        assertThat(underTest.listReaders()).containsExactly(READER_ONE);
    }

    @Test
    void when_multiple_readers_are_available_return_their_names_as_list() {
        setupAvailableReaders(READER_ONE, READER_TWO);
        assertThat(underTest.listReaders()).containsExactly(READER_ONE, READER_TWO);
    }

    @Test
    void when_no_readers_are_available_return_empty_list() {
        setupAvailableReaders(SCARD_E_NO_READERS_AVAILABLE);
        assertThat(underTest.listReaders()).isEmpty();
    }

    @Test
    void when_no_readers_are_available_cleanup_correctly() {
        setupAvailableReaders(SCARD_E_NO_READERS_AVAILABLE);
        underTest.listReaders();
        assertThat(invocations.readerListPtr)
            .describedAs("The readerListPtr must be set even if listReaders returns no readers.").isNotNull();
        verify(bridgeMock).sCardFreeMemory(invocations.hContext, invocations.readerListPtr);
        verify(bridgeMock).sCardReleaseContext(invocations.hContext);
    }

    @Test
    void when_establish_ctx_fails_skip_cleanup() {
        establishContextReturns(SCARD_E_NO_MEMORY);
        assertThatThrownBy(() -> underTest.listReaders()).isInstanceOf(JScdException.class);
        verify(bridgeMock, never()).sCardFreeMemory(nullable(MemorySegment.class), nullable(MemorySegment.class));
        verify(bridgeMock, never()).sCardReleaseContext(nullable(MemorySegment.class));
    }

    @Test
    void when_establish_listReaders_fails_skip_freeMem() {
        setupAvailableReaders(SCARD_E_NO_MEMORY);
        assertThatThrownBy(() -> underTest.listReaders()).isInstanceOf(JScdException.class);
        verify(bridgeMock, never()).sCardFreeMemory(nullable(MemorySegment.class), nullable(MemorySegment.class));
        verify(bridgeMock).sCardReleaseContext(any(MemorySegment.class));
    }

    /**
     * We cannot test against a real winscard.dll. Thus, we must make sure, the correct calls are
     * made in expected order.
     */
    @Test
    void list_readers_happy_path_runs_expected_calls() {
        setupAvailableReaders(READER_ONE);

        assertThatNoException().isThrownBy(() -> underTest.listReaders());

        final var inOrder = inOrder(bridgeMock);
        inOrder.verify(bridgeMock).sCardEstablishContext(eq(PCSC_SCOPE_SYSTEM), same(NULL), same(NULL),
            any(MemorySegment.class));
        inOrder.verify(bridgeMock)
            .sCardListReaders(eq(invocations.hContext), eq(SCARD_ALL_READERS), any(MemorySegment.class),
                any(MemorySegment.class));
        inOrder.verify(bridgeMock).sCardFreeMemory(eq(invocations.hContext), eq(invocations.readerListPtr));
        inOrder.verify(bridgeMock).sCardReleaseContext(eq(invocations.hContext));
    }

    @Test
    void list_readers_throws_jscdException_if_establish_context_fails() {
        final var expectedProblem = SCARD_E_NO_MEMORY;
        establishContextReturns(expectedProblem);
        assertThatThrownBy(() -> underTest.listReaders())
            .as("Expected exception in case of an error in smart card native code.")
            .isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem", expectedProblem);
    }

    @Test
    void list_readers_throws_jscdException_if_scardListReaders_fails() {
        final var expectedProblem = SCARD_E_NO_MEMORY;
        setupAvailableReaders(expectedProblem);
        assertThatThrownBy(() -> underTest.listReaders())
            .as("Expected exception in case of an error in smart card native code.")
            .isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem", expectedProblem);
    }

    @Test
    void list_readers_throws_jscdException_if_an_unknown_error_code_is_encountered() {
        final var errorWithUnknownErrorCode = new JScdProblem() {

            @Override
            public String errorName() {
                return "testError";
            }

            @Override
            public long errorCode() {
                return -1;
            }

            @Override
            public String description() {
                return "Expected test error";
            }
        };
        establishContextReturns(errorWithUnknownErrorCode);
        assertThatThrownBy(() -> underTest.listReaders())
            .as("Expected exception in case smart card native code returns an unknown error code.")
            .isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem", JScdProblems.UNKNOWN_ERROR_CODE);
    }

    @Test
    void errors_during_free_mem_are_logged_no_exception_is_thrown() {
        final var expectedProblem = SCARD_E_NO_MEMORY;
        freeMemReturns(expectedProblem);

        assertDoesNotThrow(() -> underTest.listReaders());

        logAssert.assertLogContains(WARN,
            "Possible ressource leak: Operation listReaders could not free memory. Reason: " + expectedProblem + ": "
                + expectedProblem.description());
    }

    @Test
    void errors_during_release_ctx_are_logged_no_exception_is_thrown() {
        final var expectedProblem = SCARD_E_NO_MEMORY;
        releaseCtxReturns(expectedProblem);

        assertDoesNotThrow(() -> underTest.listReaders());

        logAssert.assertLogContains(WARN,
            "Possible ressource leak: Operation listReaders could not release scard context. Reason: " + expectedProblem
                + ": "
                + expectedProblem.description());
    }

    private void establishContextReturns(final JScdProblem expectedProblem) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.sCardEstablishContext(anyLong(), any(MemorySegment.class), any(MemorySegment.class),
            any(MemorySegment.class)))
                .thenReturn(expectedProblem.errorCode());
    }

    private void freeMemReturns(final JScdProblem expectedProblem) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.sCardFreeMemory(any(MemorySegment.class), any(MemorySegment.class)))
            .thenReturn(expectedProblem.errorCode());
    }

    private void releaseCtxReturns(final JScdProblem expectedProblem) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.sCardReleaseContext(any(MemorySegment.class))).thenReturn(expectedProblem.errorCode());
    }

    private void setupAllMethodsSuccess() {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.sCardEstablishContext(anyLong(), any(MemorySegment.class), any(MemorySegment.class),
            any(MemorySegment.class)))
                .thenAnswer(invocation -> {
                    final var ctx = segment().of("sCardCtx lives here").allocate(testArena);
                    final var ctxPtr = invocation.getArgument(3, MemorySegment.class);
                    final var ctxPtrSeg =
                        MemorySegment.ofAddress(ctxPtr.address()).reinterpret(ValueLayout.ADDRESS.byteSize());
                    ctxPtrSeg.set(ValueLayout.ADDRESS, 0, ctx.address());
                    invocations.hContext = ctx.address();
                    return SCARD_S_SUCCESS.errorCode();
                });

        setupAvailableReaders(SCARD_S_SUCCESS);
        freeMemReturns(SCARD_S_SUCCESS);
        releaseCtxReturns(SCARD_S_SUCCESS);
    }

    private void setupAvailableReaders(final JScdProblem expectedProblem, final String... readerNames) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.sCardListReaders(any(MemorySegment.class), any(MemorySegment.class), any(MemorySegment.class),
            any(MemorySegment.class))).then(invocation -> {
                final var addrOfReaderListPtr = invocation.getArgument(2, MemorySegment.class);
                final var addrOfReaderListLength = invocation.getArgument(3, MemorySegment.class);

                final var readerListMultiStringBuilder = new StringBuilder("");
                Arrays.stream(readerNames).forEach(reader -> {
                    readerListMultiStringBuilder.append(reader);
                    readerListMultiStringBuilder.append('\0');
                });
                readerListMultiStringBuilder.append('\0');
                final var readerListMultiString = readerListMultiStringBuilder.toString();
                final var readerList = new StringSegment(readerListMultiString, testArena);

                final var addrOfReaderList =
                    MemorySegment.ofAddress(addrOfReaderListPtr.address()).reinterpret(ValueLayout.ADDRESS.byteSize());
                addrOfReaderList.set(ValueLayout.ADDRESS, 0, readerList.address());
                final var r = FluffyMemory.pointer().to(addrOfReaderListLength.address()).as(Integer.class)
                    .allocate(testArena);
                assertThat(r.dereference()).as("Provided reader list length must be unset.")
                    .isEqualTo(SCARD_AUTOALLOCATE);
                final var readerListLengthSeg = MemorySegment.ofAddress(addrOfReaderListLength.address())
                    .reinterpret(ValueLayout.ADDRESS.byteSize());
                readerListLengthSeg.set(ValueLayout.JAVA_INT, 0,
                    readerListMultiString.getBytes(StandardCharsets.UTF_8).length);

                invocations.readerListPtr = readerList.address();
                return expectedProblem.errorCode();
            });
    }

    private void setupAvailableReaders(final String... readerNames) {
        setupAvailableReaders(SCARD_S_SUCCESS, readerNames);
    }

    private static final class SCardMethodInvocations {
        MemorySegment hContext = null;
        MemorySegment readerListPtr = null;
    }
}
