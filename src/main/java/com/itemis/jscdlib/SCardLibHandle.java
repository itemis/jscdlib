package com.itemis.jscdlib;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static com.itemis.jscdlib.problem.JScdProblems.SCARD_E_NO_READERS_AVAILABLE;
import static java.lang.foreign.MemorySegment.NULL;
import static java.util.Objects.requireNonNull;

import com.itemis.jscdlib.internal.ScardLibNativeBridge;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblem;
import com.itemis.jscdlib.problem.JScdProblems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * <p>
 * Provides convenient Java versions of SCard based functionality.
 *
 * @see <a href=
 *      "https://docs.microsoft.com/en-us/windows/win32/api/winscard/">https://docs.microsoft.com/en-us/windows/win32/api/winscard/</a>
 *      </p>
 */
public final class SCardLibHandle implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(SCardLibHandle.class);

    /**
     * According to the spec, this is a null pointer.
     */
    static final MemorySegment SCARD_ALL_READERS = NULL;

    /**
     * Use this value to signal that a lib should automatically allocate memory for lists or arrays.
     */
    static final int SCARD_AUTOALLOCATE = -1;

    /**
     * Database operations are performed within the domain of the user.
     */
    static final long PCSC_SCOPE_SYSTEM = 2;

    /**
     * Database operations are performed within the domain of the system. The calling application
     * must have appropriate access permissions for any database actions.
     */
    static final long PCSC_SCOPE_USER = 0;

    private static final Set<JScdProblem> NON_FATAL_PROBLEMS =
        Set.of(JScdProblems.SCARD_S_SUCCESS, JScdProblems.SCARD_E_NO_READERS_AVAILABLE);

    private final ScardLibNativeBridge bridge;
    private final Arena myArena;

    public SCardLibHandle(final ScardLibNativeBridge bridge) {
        this.bridge = requireNonNull(bridge, "bridge");

        myArena = Arena.ofShared();
    }

    /**
     * <p>
     * Query the OS for available smart card readers.
     * </p>
     * <p>
     * <b>Be aware:</b> The current implementation of this method allocates and destroys resources
     * each time this method is called, which is a very costly operation. Thus it is not a good idea
     * to call this method very often in small amount of time.
     * </p>
     *
     * @return A list of available reader names or empty list if none is available.
     * @throws JScdException if something went wrong.
     */
    public List<String> listReaders() {
        final List<String> result = new ArrayList<>();
        var ctxEstablished = false;
        var listReadersReturned = false;

        try (var listReadersArena = Arena.ofConfined()) {
            final var ctxPtrSeg = pointer().allocate(listReadersArena);
            final var readerListPtrSeg = pointer().of(String.class).allocate(listReadersArena);
            MemorySegment ptrToFirstEntryInReaderList = null;
            try {
                final var readerListLength = segment().of(SCARD_AUTOALLOCATE).allocate(listReadersArena);

                throwIfNoSuccess(
                    bridge.sCardEstablishContext(PCSC_SCOPE_SYSTEM, NULL, NULL, ctxPtrSeg.address()));
                ctxEstablished = true;

                final var listReadersProblem = throwIfNoSuccess(
                    bridge.sCardListReaders(ctxPtrSeg.getValue(), SCARD_ALL_READERS, readerListPtrSeg.address(),
                        readerListLength.address()));
                listReadersReturned = true;
                ptrToFirstEntryInReaderList = readerListPtrSeg.getValue();
                if (listReadersProblem != SCARD_E_NO_READERS_AVAILABLE) {
                    var currentOffset = 0;
                    final var localReaderListPtrSeg = readerListPtrSeg.rawDereference();
                    final Integer maxOffset = readerListLength.getValue() - 1;
                    while (currentOffset < maxOffset) {
                        final var currentReader = localReaderListPtrSeg.getString(currentOffset);
                        result.add(currentReader);
                        currentOffset += currentReader.length() + 1;
                    }
                }
            } finally {
                if (ctxEstablished) {
                    if (listReadersReturned) {
                        logIfNoSuccess(bridge.sCardFreeMemory(ctxPtrSeg.getValue(), ptrToFirstEntryInReaderList),
                            "Possible ressource leak: Operation listReaders could not free memory.");
                    }
                    logIfNoSuccess(bridge.sCardReleaseContext(ctxPtrSeg.getValue()),
                        "Possible ressource leak: Operation listReaders could not release scard context.");
                }
            }
        }
        return Collections.unmodifiableList(result);
    }

    private JScdProblem throwIfNoSuccess(final long errorCode) {
        final var problem = JScdProblems.fromError(errorCode);
        if (!NON_FATAL_PROBLEMS.contains(problem)) {
            throw new JScdException(problem);
        }

        return problem;
    }

    private void logIfNoSuccess(final long errorCode, final String errMsg) {
        if (errorCode != JScdProblems.SCARD_S_SUCCESS.errorCode()) {
            final var problem = JScdProblems.fromError(errorCode);
            final var logMsg = (errMsg + " Reason: %s: %s").formatted(problem, problem.description());
            LOG.warn(logMsg);
        }
    }

    private void safeClose(final Arena arena) {
        try {
            arena.close();
        } catch (final Throwable t) {
            LOG.warn(
                "Possible ressource leak: Could not close arena. Reason: " + pretty(t));
        }
    }

    @Override
    public void close() throws Exception {
        if (!myArena.scope().isAlive()) {
            synchronized (this) {
                if (!myArena.scope().isAlive()) {
                    safeClose(myArena);
                    bridge.close();
                }
            }
        }
    }
}
