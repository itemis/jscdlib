package com.itemis.jscdlib;

import static ch.qos.logback.classic.Level.WARN;
import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static com.itemis.fluffyj.memory.api.FluffyPointer.FLUFFY_POINTER_BYTE_ORDER;
import static com.itemis.fluffyj.tests.FluffyTestHelper.assertNullArgNotAccepted;
import static com.itemis.fluffyj.tests.exceptions.ExpectedExceptions.EXPECTED_CHECKED_EXCEPTION;
import static com.itemis.jscdlib.AssuanLibNative.ASSUAN_INVALID_PID;
import static com.itemis.jscdlib.AssuanLibNative.ASSUAN_SOCKET_CONNECT_FDPASSING;
import static jdk.incubator.foreign.MemoryLayouts.ADDRESS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.itemis.fluffyj.tests.logging.FluffyTestAppender;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblems;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.mockito.stubbing.Answer;

import java.nio.file.Paths;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public class AssuanLibHandleTest {

    private static final Answer<Long> SUCCESS = invocation -> JScdProblems.SCARD_S_SUCCESS.errorCode();

    @RegisterExtension
    FluffyTestAppender logAssert = new FluffyTestAppender();

    private AssuanLibNative nativeMock;
    private JScdEnvSocketDiscovery socketDiscoveryMock;
    private AssuanMethodInvocations invocations;
    private ResourceScope testMemoryScope;

    private AssuanLibHandle underTest;

    @BeforeEach
    public void setUp() {
        nativeMock = mock(AssuanLibNative.class);
        socketDiscoveryMock = mock(JScdEnvSocketDiscovery.class);
        invocations = new AssuanMethodInvocations();
        testMemoryScope = ResourceScope.newConfinedScope();

        when(socketDiscoveryMock.discover()).thenReturn(Paths.get("scdaemon.socket.file"));

        assuanNewReturns(SUCCESS);
        assuanSocketConnectReturns(SUCCESS);
        assuanTransactReturns(SUCCESS);

        underTest = constructUnderTest();

        verify(nativeMock).assuanNew(any(MemoryAddress.class));
        verify(nativeMock).assuanSocketConnect(eq(invocations.ctx), any(MemoryAddress.class), eq(ASSUAN_INVALID_PID),
            eq(ASSUAN_SOCKET_CONNECT_FDPASSING));
    }

    @AfterEach
    public void tearDown() {
        if (underTest != null) {
            underTest.close();
        }
    }

    @Test
    public void constructorDoesNotAcceptNullAsNativeBridge() {
        assertNullArgNotAccepted(() -> new AssuanLibHandle(null, socketDiscoveryMock), "nativeBridge");
    }

    @Test
    public void constructorDoesNotAcceptNullAsSocketDiscovery() {
        assertNullArgNotAccepted(() -> new AssuanLibHandle(nativeMock, null), "socketDiscovery");
    }

    @Test
    public void close_calls_release_correctly() {
        try (var l = constructUnderTest()) {

        } finally {
            verify(nativeMock).assuanRelease(eq(invocations.ctx));
        }
    }

    @Test
    public void constructor_throws_jscdException_if_assuan_new_fails() {
        var expectedProblem = JScdProblems.SCARD_E_NO_MEMORY;

        assuanNewReturns(invocation -> expectedProblem.errorCode());

        try (var localUnderTest = constructUnderTest()) {
            Assertions.fail("No exception was thrown");
        } catch (Exception e) {
            assertThat(e).as("Expected exception in case of an error in smart card native code.")
                .isInstanceOf(JScdException.class)
                .hasFieldOrPropertyWithValue("problem", expectedProblem);
        }
    }

    @Test
    public void constructor_throws_jscdException_if_socket_connect_fails() {
        var expectedProblem = JScdProblems.SCARD_E_NO_MEMORY;

        assuanSocketConnectReturns(invocation -> expectedProblem.errorCode());

        try (var localUnderTest = constructUnderTest()) {
            Assertions.fail("No exception was thrown");
        } catch (Exception e) {
            assertThat(e).as("Expected exception in case of an error in smart card native code.")
                .isInstanceOf(JScdException.class)
                .hasFieldOrPropertyWithValue("problem", expectedProblem);
        }
    }

    @Test
    public void sendCommand_happyPath() {
        var expectedCommand = "SERIALNO";

        underTest.sendCommand(expectedCommand, line -> System.out.println(line), line -> System.out.println(line));

        verify(nativeMock).assuanTransact(eq(invocations.ctx), any(MemoryAddress.class), any(MemoryAddress.class), eq(MemoryAddress.NULL),
            any(MemoryAddress.class), eq(MemoryAddress.NULL), any(MemoryAddress.class), eq(MemoryAddress.NULL));
        assertThat(invocations.command).as("Unexpected command").isEqualTo(expectedCommand);
    }

    @Test
    public void send_command_throws_jscdException_if_transact_fails() {
        var expectedProblem = JScdProblems.SCARD_E_NO_MEMORY;

        assuanTransactReturns(invocation -> expectedProblem.errorCode());

        assertThatThrownBy(() -> underTest.sendCommand("command", System.out::println, System.out::println))
            .as("Expected exception in case of an error in smart card native code.")
            .isInstanceOf(JScdException.class)
            .hasFieldOrPropertyWithValue("problem", expectedProblem);
    }

    @Test
    public void errors_during_release_ctx_are_logged_no_exception_is_thrown() {
        assuanReleaseReturns(invocation -> {
            throw EXPECTED_CHECKED_EXCEPTION;
        });

        assertDoesNotThrow(() -> underTest.close());

        logAssert.assertLogContains(WARN,
            "Possible ressource leak: Operation assuanRelease could not release assuan context. Reason: " + pretty(EXPECTED_CHECKED_EXCEPTION));
    }

    @Test
    public void calling_close_twice_does_not_call_release_twice() {
        assertDoesNotThrow(() -> {
            underTest.close();
            underTest.close();
        });

        verify(nativeMock).assuanRelease(any(MemoryAddress.class));
    }

    private static final class AssuanMethodInvocations {
        MemoryAddress ctx = null;
        String command = null;
    }

    private void assuanNewReturns(Answer<Long> answer) {
        when(nativeMock.assuanNew(any(MemoryAddress.class))).thenAnswer(invocation -> {
            var ctxPtrSegPtr = invocation.getArgument(0, MemoryAddress.class).asSegment(ADDRESS.byteSize(), testMemoryScope);
            var ctxSeg = segment().of("Assuan ctx lives here").allocate(testMemoryScope);
            ctxPtrSegPtr.asByteBuffer().order(FLUFFY_POINTER_BYTE_ORDER).putLong(ctxSeg.address().toRawLongValue());
            invocations.ctx = ctxSeg.address();
            return answer.answer(invocation);
        });
    }

    private void assuanSocketConnectReturns(Answer<Long> answer) {
        when(nativeMock.assuanSocketConnect(any(MemoryAddress.class), any(MemoryAddress.class), eq(ASSUAN_INVALID_PID), eq(ASSUAN_SOCKET_CONNECT_FDPASSING)))
            .thenAnswer(answer);
    }

    private void assuanTransactReturns(Answer<Long> answer) {
        when(nativeMock.assuanTransact(any(MemoryAddress.class), any(MemoryAddress.class), any(MemoryAddress.class), any(MemoryAddress.class),
            any(MemoryAddress.class), any(MemoryAddress.class), any(MemoryAddress.class), any(MemoryAddress.class))).thenAnswer(invocation -> {
                var commandStrPtr = pointer().to(invocation.getArgument(1, MemoryAddress.class)).as(String.class).allocate(testMemoryScope);
                invocations.command = commandStrPtr.dereference();
                return answer.answer(invocation);
            });
    }

    private void assuanReleaseReturns(Answer<Void> answer) {
        doAnswer(answer).when(nativeMock).assuanRelease(any(MemoryAddress.class));
    }

    private AssuanLibHandle constructUnderTest() {
        return new AssuanLibHandle(nativeMock, socketDiscoveryMock);
    }
}
