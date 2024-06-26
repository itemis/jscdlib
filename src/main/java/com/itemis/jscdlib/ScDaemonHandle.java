package com.itemis.jscdlib;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static java.lang.foreign.MemorySegment.NULL;
import static java.util.Objects.requireNonNull;

import com.itemis.fluffyj.memory.FluffyMemory;
import com.itemis.fluffyj.memory.api.FluffyPointer;
import com.itemis.jscdlib.discovery.JScdSocketDiscovery;
import com.itemis.jscdlib.internal.ScDaemonNativeBridge;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblem;
import com.itemis.jscdlib.problem.JScdProblems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Set;
import java.util.function.Consumer;

/**
 * Provides a convenient Java interface to SCDaemon functionality.
 */
public final class ScDaemonHandle implements AutoCloseable {
    private static final Logger LOG = LoggerFactory.getLogger(ScDaemonHandle.class);

    /**
     * If you don’t know the server’s process ID (PID), pass ASSUAN_INVALID_PID.
     *
     * @see https://www.gnupg.org/documentation/manuals/assuan/Client-code.html
     */
    static final int ASSUAN_INVALID_PID = 0;
    /**
     * With flags set to ASSUAN_SOCKET_CONNECT_FDPASSING, sendmsg and recvmesg are used for input
     * and output and thereby enable the use of descriptor passing.
     *
     * @see https://www.gnupg.org/documentation/manuals/assuan/Client-code.html
     */
    static final int ASSUAN_SOCKET_CONNECT_FDPASSING = 1;

    private static final Set<JScdProblem> NON_FATAL_PROBLEMS = Set.of(JScdProblems.SCARD_S_SUCCESS);

    private final FluffyPointer ctxPtr;
    private final MemorySegment ctxAddr;
    private final ScDaemonNativeBridge bridge;
    private final Arena myArena;

    /**
     * Create a new instance and initialize resources. Be aware that after construction, this object
     * holds resources, so it might be a bad idea to construct many instances of this object in
     * advance.
     *
     * @param bridge OS dependent implementation to use when calling low level library functions.
     * @param socketDiscovery Used to determine the scdaemon socket file to use for communication to
     *        the daemon.
     */
    public ScDaemonHandle(final ScDaemonNativeBridge bridge, final JScdSocketDiscovery socketDiscovery) {
        this.bridge = requireNonNull(bridge, "bridge");
        requireNonNull(socketDiscovery, "socketDiscovery");

        try {
            myArena = Arena.ofShared();
            ctxPtr = pointer().allocate(myArena);
            throwIfNoSuccess(bridge.assuanNew(ctxPtr.address()));
            ctxAddr = ctxPtr.getValue();
            final var socketName =
                segment().of(socketDiscovery.discover().toString()).allocate(myArena).address();
            throwIfNoSuccess(bridge.assuanSocketConnect(ctxAddr, socketName,
                ASSUAN_INVALID_PID, ASSUAN_SOCKET_CONNECT_FDPASSING));
        } catch (final Throwable t) {
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
    public void sendCommand(final String command, final Consumer<String> responseConsumer,
            final Consumer<String> statusConsumer) {
        final var callback = new TransactCallback(responseConsumer, statusConsumer);

        try (var transactArena = Arena.ofConfined()) {
            final var dataCbPtr = pointer().toCFunc("data_cb").of(callback).autoBindTo(transactArena);
            final var inquireCbPtr = pointer().toCFunc("inquire_cb").of(callback).autoBindTo(transactArena);
            final var statusCbPtr = pointer().toCFunc("status_cb").of(callback).autoBindTo(transactArena);
            final var cmdAddr = transactArena.allocateFrom(command);
            throwIfNoSuccess(
                bridge.assuanTransact(ctxAddr, cmdAddr, dataCbPtr, NULL, inquireCbPtr, NULL,
                    statusCbPtr, NULL));
        }
    }

    /**
     * Release resources hold by this instance. When this method returns, this instance must not be
     * used anymore.
     */
    @Override
    public void close() {
        if (ctxAddr != null && (myArena.scope().isAlive())) {
            synchronized (this) {
                if (myArena.scope().isAlive()) {
                    try {
                        bridge.assuanRelease(ctxAddr);
                    } catch (final Throwable t) {
                        LOG.warn(
                            "Possible ressource leak: Operation assuanRelease could not release assuan context. Reason: "
                                + pretty(t));
                    } finally {
                        try {
                            bridge.close();
                        } finally {
                            myArena.close();
                        }
                    }
                }
            }

        }
    }

    private JScdProblem throwIfNoSuccess(final long errorCode) {
        final var problem = JScdProblems.fromError(errorCode);
        if (!NON_FATAL_PROBLEMS.contains(problem)) {
            throw new JScdException(problem);
        }

        return problem;
    }

    protected static final class TransactCallback {
        private static final int SUCCESS = (int) JScdProblems.SCARD_S_SUCCESS.errorCode();

        private final Consumer<String> responseConsumer;
        private final Consumer<String> statusConsumer;

        public TransactCallback(final Consumer<String> responseConsumer, final Consumer<String> statusConsumer) {
            this.responseConsumer = responseConsumer;
            this.statusConsumer = statusConsumer;
        }

        public int data_cb(final MemorySegment allLines, final MemorySegment currentLinePtr, final long lineLength) {
            responseConsumer.accept(deref(currentLinePtr));
            return SUCCESS;
        }

        public int inquire_cb(final MemorySegment allLines, final MemorySegment currentLinePtr) {
            return SUCCESS;
        }

        public int status_cb(final MemorySegment allLines, final MemorySegment currentLinePtr) {
            statusConsumer.accept(deref(currentLinePtr));
            return SUCCESS;
        }

        private String deref(final MemorySegment strPtr) {
            return FluffyMemory.dereference(strPtr).as(String.class);
        }
    }
}
