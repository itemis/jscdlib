package com.itemis.jscdlib;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.jscdlib.AssuanLibNative.ASSUAN_INVALID_PID;
import static com.itemis.jscdlib.AssuanLibNative.ASSUAN_SOCKET_CONNECT_FDPASSING;
import static java.util.Objects.requireNonNull;
import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;
import static jdk.incubator.foreign.MemoryAddress.NULL;

import com.google.common.collect.ImmutableSet;
import com.itemis.jscdlib.internal.memory.LongPointerSegment;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblem;
import com.itemis.jscdlib.problem.JScdProblems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Set;
import java.util.function.Consumer;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.FunctionDescriptor;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

/**
 * Provides convenient Java versions of libassuan based functionality.
 *
 * @see <a href=
 *      "https://gnupg.org/software/libassuan/index.html">https://gnupg.org/software/libassuan/index.html</a>
 *
 */
public final class AssuanLibHandle implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(AssuanLibHandle.class);

    private static final CLinker LINKER = CLinker.getInstance();
    private static final Set<JScdProblem> NON_FATAL_PROBLEMS = ImmutableSet.of(JScdProblems.SCARD_S_SUCCESS);

    private final LongPointerSegment ctxPtr;
    private final MemoryAddress ctxAddr;
    private final AssuanLibNative nativeBridge;
    private final ResourceScope myScope;

    /**
     * Create a new instance and initialize resources. Be aware that after construction, this object
     * holds resources, so it might be a bad idea to construct many instances of this object in
     * advance.
     *
     * @param nativeBridge OS dependent implementation to use when calling low level library
     *        functions.
     * @param socketDiscovery Used to determine the scdaemon socket file to use for communication to
     *        the daemon.
     */
    public AssuanLibHandle(AssuanLibNative nativeBridge, JScdSocketDiscovery socketDiscovery) {
        this.nativeBridge = requireNonNull(nativeBridge, "nativeBridge");
        requireNonNull(socketDiscovery, "socketDiscovery");

        try {
            myScope = ResourceScope.newConfinedScope();
            ctxPtr = new LongPointerSegment(myScope);
            throwIfNoSuccess(nativeBridge.assuanNew(ctxPtr.address()));
            ctxAddr = ctxPtr.getContainedAddress();

            var socketName = CLinker.toCString(socketDiscovery.discover().toString(), myScope).address();
            throwIfNoSuccess(nativeBridge.assuanSocketConnect(ctxAddr, socketName, ASSUAN_INVALID_PID, ASSUAN_SOCKET_CONNECT_FDPASSING));
        } catch (Throwable t) {
            close();
            throw t;
        }
    }

    /**
     * <p>
     * Send a command to the scdaemon.
     * </p>
     * <p>
     * Be aware that for some commands, scdaemon uses the response callback and for others the
     * status callback.
     * </p>
     * <p>
     * Be also aware that consumers are called synchronously, i. e. this method won't return if one
     * of the consumers blocks.
     * </p>
     *
     * @param command The command to send.
     * @param responseConsumer Called when scdaemon responds with data.
     * @param statusConsumer Called when scdaemon responds with status lines.
     */
    public void sendCommand(String command, Consumer<String> responseConsumer, Consumer<String> statusConsumer) {
        var callback = new TransactCallback(responseConsumer, statusConsumer);

        MethodHandle data_cbJava = null;
        MethodHandle inquire_cbJava = null;
        MethodHandle status_cbJava = null;
        try {
            data_cbJava = MethodHandles.lookup().bind(callback, "data_cb",
                MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, long.class));
            inquire_cbJava = MethodHandles.lookup().bind(callback, "inquire_cb",
                MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class));
            status_cbJava = MethodHandles.lookup().bind(callback, "status_cb",
                MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class));
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException("Implementation problem: Could not find callback method: ", e);
        }

        try (var transactScope = ResourceScope.newConfinedScope()) {
            var data_cbC = LINKER.upcallStub(data_cbJava, FunctionDescriptor.of(C_INT, C_POINTER, C_POINTER, C_LONG_LONG), transactScope);
            var inquire_cbC = LINKER.upcallStub(inquire_cbJava, FunctionDescriptor.of(C_INT, C_POINTER, C_POINTER), transactScope);
            var status_cbC = LINKER.upcallStub(status_cbJava, FunctionDescriptor.of(C_INT, C_POINTER, C_POINTER), transactScope);
            var cmdAddr = CLinker.toCString(command, transactScope).address();
            throwIfNoSuccess(nativeBridge.assuanTransact(ctxAddr, cmdAddr, data_cbC.address(), NULL, inquire_cbC.address(), NULL, status_cbC.address(), NULL));
        }
    }

    /**
     * Release resources hold by this instance. When this method returns, this instance must not be
     * used anymore.
     */
    @Override
    public final void close() {
        if (ctxAddr != null) {
            if (myScope.isAlive()) {
                synchronized (this) {
                    if (myScope.isAlive()) {
                        try {
                            nativeBridge.assuanRelease(ctxAddr);
                        } catch (Throwable t) {
                            LOG.warn(
                                "Possible ressource leak: Operation assuanRelease could not release assuan context. Reason: " + pretty(t));
                        } finally {
                            myScope.close();
                        }
                    }
                }
            }
        }
    }

    private JScdProblem throwIfNoSuccess(long errorCode) {
        var problem = JScdProblems.fromError(errorCode);
        if (!NON_FATAL_PROBLEMS.contains(problem)) {
            throw new JScdException(problem);
        }

        return problem;
    }

    private static final class TransactCallback {
        private final int SUCCESS = (int) JScdProblems.SCARD_S_SUCCESS.errorCode();

        private final Consumer<String> responseConsumer;
        private final Consumer<String> statusConsumer;

        public TransactCallback(Consumer<String> responseConsumer, Consumer<String> statusConsumer) {
            this.responseConsumer = responseConsumer;
            this.statusConsumer = statusConsumer;
        }

        // False positive. Used as a function pointer callback by C-code.
        @SuppressWarnings("unused")
        public int data_cb(MemoryAddress allLines, MemoryAddress currentLine, long lineLength) {
            responseConsumer.accept(CLinker.toJavaString(currentLine));
            return SUCCESS;
        }

        // False positive. Used as a function pointer callback by C-code.
        @SuppressWarnings("unused")
        public int inquire_cb(MemoryAddress allLines, MemoryAddress currentLine) {
            return SUCCESS;
        }

        // False positive. Used as a function pointer callback by C-code.
        @SuppressWarnings("unused")
        public int status_cb(MemoryAddress allLines, MemoryAddress currentLine) {
            statusConsumer.accept(CLinker.toJavaString(currentLine));
            return SUCCESS;
        }
    }
}
