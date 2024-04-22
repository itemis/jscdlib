package com.itemis.jscdlib;

import static ch.qos.logback.classic.Level.WARN;
import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static com.itemis.fluffyj.tests.FluffyTestHelper.assertNullArgNotAccepted;
import static com.itemis.fluffyj.tests.exceptions.ExpectedExceptions.EXPECTED_CHECKED_EXCEPTION;
import static com.itemis.jscdlib.ScDaemonHandle.ASSUAN_INVALID_PID;
import static com.itemis.jscdlib.ScDaemonHandle.ASSUAN_SOCKET_CONNECT_FDPASSING;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.itemis.fluffyj.tests.logging.FluffyTestAppender;
import com.itemis.jscdlib.discovery.JScdEnvSocketDiscovery;
import com.itemis.jscdlib.internal.ScDaemonNativeBridge;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;
import org.mockito.stubbing.Stubber;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.file.Paths;

class ScDaemonHandleTest {

    private static final Answer<Long> SUCCESS = invocation -> JScdProblems.SCARD_S_SUCCESS.errorCode();

    @RegisterExtension
    FluffyTestAppender logAssert = new FluffyTestAppender();

    private ScDaemonNativeBridge bridgeMock;
    private JScdEnvSocketDiscovery socketDiscoveryMock;
    private AssuanMethodInvocations invocations;
    private Arena testArena;

    private ScDaemonHandle underTest;

    @BeforeEach
    void setUp() {
        bridgeMock = mock(ScDaemonNativeBridge.class);
        socketDiscoveryMock = mock(JScdEnvSocketDiscovery.class);
        invocations = new AssuanMethodInvocations();
        testArena = Arena.ofShared();

        when(socketDiscoveryMock.discover()).thenReturn(Paths.get("scdaemon.socket.file"));

        assuanNewReturns(SUCCESS);
        assuanSocketConnectReturns(SUCCESS);
        assuanTransactReturns(SUCCESS);

        underTest = constructUnderTest();

        verify(bridgeMock).assuanNew(any(MemorySegment.class));
        verify(bridgeMock).assuanSocketConnect(eq(invocations.ctx), any(MemorySegment.class),
            eq(ASSUAN_INVALID_PID),
            eq(ASSUAN_SOCKET_CONNECT_FDPASSING));
    }

    @AfterEach
    void tearDown() {
        if (underTest != null) {
            underTest.close();
        }
    }

    @Test
    void constructorDoesNotAcceptNullAsNativeBridge() {
        assertNullArgNotAccepted(() -> new ScDaemonHandle(null, socketDiscoveryMock), "bridge");
    }

    @Test
    void constructorDoesNotAcceptNullAsSocketDiscovery() {
        assertNullArgNotAccepted(() -> new ScDaemonHandle(bridgeMock, null), "socketDiscovery");
    }

    @Test
    void close_calls_release_correctly() {
        try (var l = constructUnderTest()) {

        } finally {
            verify(bridgeMock).assuanRelease(eq(invocations.ctx));
        }
    }

    @Test
    void constructor_throws_jscdException_if_assuan_new_fails() {
        final var expectedProblem = JScdProblems.SCARD_E_NO_MEMORY;

        assuanNewReturns(invocation -> expectedProblem.errorCode());

        try (var localUnderTest = constructUnderTest()) {
            Assertions.fail("No exception was thrown");
        } catch (final Exception e) {
            assertThat(e).as("Expected exception in case of an error in smart card native code.")
                .isInstanceOf(JScdException.class)
                .hasFieldOrPropertyWithValue("problem", expectedProblem);
        }
    }

    @Test
    void constructor_throws_jscdException_if_socket_connect_fails() {
        final var expectedProblem = JScdProblems.SCARD_E_NO_MEMORY;

        assuanSocketConnectReturns(invocation -> expectedProblem.errorCode());

        try (var localUnderTest = constructUnderTest()) {
            Assertions.fail("No exception was thrown");
        } catch (final Exception e) {
            assertThat(e).as("Expected exception in case of an error in smart card native code.")
                .isInstanceOf(JScdException.class)
                .hasFieldOrPropertyWithValue("problem", expectedProblem);
        }
    }

    @Test
    void sendCommand_happyPath() {
        final var expectedCommand = "SERIALNO";

        underTest.sendCommand(expectedCommand, line -> System.out.println(line), line -> System.out.println(line));

        verify(bridgeMock).assuanTransact(eq(invocations.ctx), any(MemorySegment.class), any(MemorySegment.class),
            eq(MemorySegment.NULL),
            any(MemorySegment.class), eq(MemorySegment.NULL), any(MemorySegment.class), eq(MemorySegment.NULL));
        assertThat(invocations.command).as("Unexpected command").isEqualTo(expectedCommand);
    }

    @Test
    void send_command_throws_jscdException_if_transact_fails() {
        final var expectedProblem = JScdProblems.SCARD_E_NO_MEMORY;

        assuanTransactReturns(invocation -> expectedProblem.errorCode());

        assertThatThrownBy(() -> underTest.sendCommand("command", System.out::println, System.out::println))
            .as("Expected exception in case of an error in smart card native code.")
            .isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem", expectedProblem);
    }

    @Test
    void errors_during_release_ctx_are_logged_no_exception_is_thrown() {
        assuanReleaseReturns(invocation -> {
            throw EXPECTED_CHECKED_EXCEPTION;
        });

        assertDoesNotThrow(() -> underTest.close());

        logAssert.assertLogContains(WARN,
            "Possible ressource leak: Operation assuanRelease could not release assuan context. Reason: "
                + pretty(EXPECTED_CHECKED_EXCEPTION));
    }

    @Test
    void calling_close_twice_does_not_call_release_twice() {
        assertDoesNotThrow(() -> {
            underTest.close();
            underTest.close();
        });

        verify(bridgeMock).assuanRelease(any(MemorySegment.class));
    }

    private static final class AssuanMethodInvocations {
        MemorySegment ctx = null;
        String command = null;
    }

    private void assuanNewReturns(final Answer<Long> answer) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.assuanNew(any(MemorySegment.class))).thenAnswer(invocation -> {
            final var ctxSeg = segment().of("Assuan ctx lives here").allocate(testArena);
            final var ctxPtrSegPtr = invocation.getArgument(0, MemorySegment.class);
            final var ctxPtrSeg =
                MemorySegment.ofAddress(ctxPtrSegPtr.address()).reinterpret(ValueLayout.ADDRESS.byteSize());
            ctxPtrSeg.set(ValueLayout.ADDRESS, 0, ctxSeg.address());
            invocations.ctx = ctxSeg.address();
            return answer.answer(invocation);
        });
    }

    private void assuanSocketConnectReturns(final Answer<Long> answer) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.assuanSocketConnect(any(MemorySegment.class), any(MemorySegment.class), eq(ASSUAN_INVALID_PID),
            eq(ASSUAN_SOCKET_CONNECT_FDPASSING)))
                .thenAnswer(answer);
    }

    private void assuanTransactReturns(final Answer<Long> answer) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        Mockito.mock(Object.class);

        when(bridgeMock.assuanTransact(any(MemorySegment.class), any(MemorySegment.class), any(MemorySegment.class),
            any(MemorySegment.class),
            any(MemorySegment.class), any(MemorySegment.class), any(MemorySegment.class), any(MemorySegment.class)))
                .thenAnswer(invocation -> {
                    invocations.command = invocation.getArgument(1, MemorySegment.class).getString(0);
                    return answer.answer(invocation);
                });
    }

    private void assuanReleaseReturns(final Answer<Void> answer) {
        // Workaround for
        // https://github.com/eclipse-jdt/eclipse.jdt.core/issues/456
        final var stubber = Mockito.doAnswer(answer);
        try {
            final var whenMethod = Stubber.class.getMethod("when", Object.class);
            ((ScDaemonNativeBridge) whenMethod.invoke(stubber, bridgeMock)).assuanRelease(any(MemorySegment.class));
        } catch (final Exception e) {
            Assertions.fail("Could not mock call.", e);
        }
    }

    private ScDaemonHandle constructUnderTest() {
        return new ScDaemonHandle(bridgeMock, socketDiscoveryMock);
    }
}
