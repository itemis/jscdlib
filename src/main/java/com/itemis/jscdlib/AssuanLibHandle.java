package com.itemis.jscdlib;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static com.itemis.jscdlib.AssuanLibNative.ASSUAN_INVALID_PID;
import static com.itemis.jscdlib.AssuanLibNative.ASSUAN_SOCKET_CONNECT_FDPASSING;
import static java.util.Objects.requireNonNull;
import static jdk.incubator.foreign.CLinker.toJavaString;
import static jdk.incubator.foreign.MemoryAddress.NULL;
import static jdk.incubator.foreign.ResourceScope.newConfinedScope;

import com.google.common.collect.ImmutableSet;
import com.itemis.fluffyj.memory.api.FluffyPointer;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblem;
import com.itemis.jscdlib.problem.JScdProblems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.function.Consumer;

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

    private static final Set<JScdProblem> NON_FATAL_PROBLEMS = ImmutableSet.of(JScdProblems.SCARD_S_SUCCESS);

    private final FluffyPointer ctxPtr;
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
            myScope = newConfinedScope();
            ctxPtr = pointer().allocate(myScope);
            throwIfNoSuccess(nativeBridge.assuanNew(ctxPtr.address()));
            ctxAddr = ctxPtr.getValue();
            var socketName =
                segment().of(socketDiscovery.discover().toString()).allocate(myScope).address();
            throwIfNoSuccess(nativeBridge.assuanSocketConnect(ctxAddr, socketName,
                ASSUAN_INVALID_PID, ASSUAN_SOCKET_CONNECT_FDPASSING));
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

        try (var transactScope = newConfinedScope()) {
            var dataCbPtr = pointer().toCFunc("data_cb").of(callback).autoBindTo(transactScope);
            var inquireCbPtr = pointer().toCFunc("inquire_cb").of(callback).autoBindTo(transactScope);
            var statusCbPtr = pointer().toCFunc("status_cb").of(callback).autoBindTo(transactScope);
            var cmdAddr = segment().of(command).allocate(transactScope).address();
            throwIfNoSuccess(nativeBridge.assuanTransact(ctxAddr, cmdAddr, dataCbPtr, NULL, inquireCbPtr, NULL, statusCbPtr, NULL));
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

    protected static final class TransactCallback {
        private final int SUCCESS = (int) JScdProblems.SCARD_S_SUCCESS.errorCode();

        private final Consumer<String> responseConsumer;
        private final Consumer<String> statusConsumer;

        public TransactCallback(Consumer<String> responseConsumer, Consumer<String> statusConsumer) {
            this.responseConsumer = responseConsumer;
            this.statusConsumer = statusConsumer;
        }

        public int data_cb(MemoryAddress allLines, MemoryAddress currentLine, long lineLength) {
            responseConsumer.accept(toJavaString(currentLine));
            return SUCCESS;
        }

        public int inquire_cb(MemoryAddress allLines, MemoryAddress currentLine) {
            return SUCCESS;
        }

        public int status_cb(MemoryAddress allLines, MemoryAddress currentLine) {
            statusConsumer.accept(toJavaString(currentLine));
            return SUCCESS;
        }
    }
}
