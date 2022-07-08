package com.itemis.jscdlib;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static com.itemis.fluffyj.memory.FluffyMemory.segment;
import static com.itemis.jscdlib.ScardLibNative.PCSC_SCOPE_SYSTEM;
import static com.itemis.jscdlib.ScardLibNative.SCARD_ALL_READERS;
import static com.itemis.jscdlib.ScardLibNative.SCARD_AUTOALLOCATE;
import static com.itemis.jscdlib.problem.JScdProblems.SCARD_E_NO_READERS_AVAILABLE;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.requireNonNull;
import static jdk.incubator.foreign.MemoryAddress.NULL;
import static jdk.incubator.foreign.ResourceScope.newConfinedScope;

import com.google.common.collect.ImmutableSet;
import com.itemis.jscdlib.problem.JScdException;
import com.itemis.jscdlib.problem.JScdProblem;
import com.itemis.jscdlib.problem.JScdProblems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

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
    private static final Set<JScdProblem> NON_FATAL_PROBLEMS = ImmutableSet.of(JScdProblems.SCARD_S_SUCCESS, JScdProblems.SCARD_E_NO_READERS_AVAILABLE);

    private final ScardLibNative nativeBridge;
    private final ResourceScope myScope;

    public SCardLibHandle(ScardLibNative nativeBridge) {
        this.nativeBridge = requireNonNull(nativeBridge, "nativeBridge");

        myScope = newConfinedScope();
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
        List<String> result = new ArrayList<>();
        var ctxEstablished = false;
        var listReadersReturned = false;

        try (var listReadersScope = newConfinedScope()) {
            var ctxPtrSeg = pointer().allocate(listReadersScope);
            var readerListPtrSeg = pointer().of(String.class).allocate(listReadersScope);
            MemoryAddress ptrToFirstEntryInReaderList = null;
            try {
                var readerListLength = segment().of(SCARD_AUTOALLOCATE).allocate(listReadersScope);

                throwIfNoSuccess(nativeBridge.sCardEstablishContext(PCSC_SCOPE_SYSTEM, NULL, NULL, ctxPtrSeg.address()));
                ctxEstablished = true;

                var listReadersProblem = throwIfNoSuccess(
                    nativeBridge.sCardListReadersA(ctxPtrSeg.getValue(), SCARD_ALL_READERS, readerListPtrSeg.address(), readerListLength.address()));
                listReadersReturned = true;
                ptrToFirstEntryInReaderList = readerListPtrSeg.getValue();
                if (listReadersProblem != SCARD_E_NO_READERS_AVAILABLE) {
                    final var TRAILING_NULL = 1;
                    var remainingLength = readerListLength.getValue() - TRAILING_NULL;
                    var localReaderListPtrSeg = readerListPtrSeg;
                    while (remainingLength > 0) {
                        var currentReader = localReaderListPtrSeg.dereference();
                        result.add(currentReader);
                        var nextOffset = currentReader.getBytes(UTF_8).length + TRAILING_NULL;
                        var addressOfNextEntry = readerListPtrSeg.getValue().addOffset(nextOffset);
                        localReaderListPtrSeg = pointer().to(addressOfNextEntry).as(String.class).allocate(listReadersScope);
                        remainingLength -= nextOffset;
                    }
                }
            } finally {
                if (ctxEstablished) {
                    if (listReadersReturned) {
                        logIfNoSuccess(nativeBridge.sCardFreeMemory(ctxPtrSeg.getValue(), ptrToFirstEntryInReaderList),
                            "Possible ressource leak: Operation listReaders could not free memory.");
                    }
                    logIfNoSuccess(nativeBridge.sCardReleaseContext(ctxPtrSeg.getValue()),
                        "Possible ressource leak: Operation listReaders could not release scard context.");
                }
            }
        }
        return Collections.unmodifiableList(result);
    }

    private JScdProblem throwIfNoSuccess(long errorCode) {
        var problem = JScdProblems.fromError(errorCode);
        if (!NON_FATAL_PROBLEMS.contains(problem)) {
            throw new JScdException(problem);
        }

        return problem;
    }

    private void logIfNoSuccess(long errorCode, String errMsg) {
        if (errorCode != JScdProblems.SCARD_S_SUCCESS.errorCode()) {
            var problem = JScdProblems.fromError(errorCode);

            LOG.warn(errMsg + " Reason: " + problem + ": " + problem.description());
        }
    }

    private void safeClose(ResourceScope scope) {
        try {
            scope.close();
        } catch (Throwable t) {
            LOG.warn(
                "Possible ressource leak: Could not close resource scope. Reason: " + pretty(t));
        }
    }

    @Override
    public void close() throws Exception {
        if (!myScope.isAlive()) {
            synchronized (this) {
                if (!myScope.isAlive()) {
                    try {
                        safeClose(myScope);
                    } catch (Throwable t) {
                        LOG.warn(
                            "Possible ressource leak: Could not close resource scope. Reason: " + pretty(t));
                    }
                }
            }
        }
    }
}
