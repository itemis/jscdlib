package com.itemis.jscdlib.internal;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.MemorySession;
import java.lang.foreign.SymbolLookup;
import java.util.function.Function;

public final class ScardLibNativeBridge extends NativeBase implements AutoCloseable {

    private final FluffyNativeMethodHandle<Long> establishCtx;
    private final FluffyNativeMethodHandle<Long> listReaders;
    private final FluffyNativeMethodHandle<Long> freeMem;
    private final FluffyNativeMethodHandle<Long> releaseCtx;

    private final MemorySession mySession;

    /**
     * Create a new instance.
     *
     * @param libSup - Creates a "Connection" to the underlying native library in form of a
     *        {@link SymbolLookup}. The connection will be closed if the provided
     *        {@link MemorySession} is closed.
     */
    public ScardLibNativeBridge(Function<MemorySession, SymbolLookup> libSup) {
        mySession = MemorySession.openConfined();
        var lib = libSup.apply(mySession);

        establishCtx = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(JAVA_LONG, ADDRESS, ADDRESS, ADDRESS);

        var suffix = new OsDetector().isWindows() ? "A" : "";
        listReaders = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardListReaders" + suffix)
            .args(ADDRESS, ADDRESS, ADDRESS, ADDRESS);

        freeMem = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardFreeMemory")
            .args(ADDRESS, ADDRESS);

        releaseCtx = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardReleaseContext")
            .args(ADDRESS);
    }

    /**
     * See <a href=
     * "https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardestablishcontext">https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardestablishcontext</a>
     *
     * @param dwScope - {@link #PCSC_SCOPE_SYSTEM} or {@link #PCSC_SCOPE_USER}.
     * @param pvReserved1 - Reserved for future use and must be {@link MemoryAddress#NULL}.
     * @param pvReserved2 - Reserved for future use and must be {@link MemoryAddress#NULL}.
     * @param phContext
     * @return {@link #SCARD_S_SUCCESS} if success, else error code according to <a href=
     *         "https://docs.microsoft.com/en-us/windows/win32/secauthn/authentication-return-values">SmartCard
     *         return values</a>.
     */
    public long sCardEstablishContext(long dwScope, MemoryAddress pvReserved1, MemoryAddress pvReserved2,
            MemoryAddress phContext) {
        return callNativeFunction(() -> establishCtx.call(dwScope, pvReserved1, pvReserved2, phContext));
    }

    /**
     * See <a href=
     * "https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardlistreadersa">https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardlistreadersa</a>
     *
     * @param hContext
     * @param mszGroups
     * @param mszReaders
     * @param pcchReaders
     * @return {@link #SCARD_S_SUCCESS} if success, else error code according to <a href=
     *         "https://docs.microsoft.com/en-us/windows/win32/secauthn/authentication-return-values">SmartCard
     *         return values</a>.
     */
    public long sCardListReaders(MemoryAddress hContext, MemoryAddress mszGroups, MemoryAddress mszReaders,
            MemoryAddress pcchReaders) {
        return callNativeFunction(() -> listReaders.call(hContext, mszGroups, mszReaders, pcchReaders));
    }

    /**
     * See <a href=
     * "https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardfreememory">https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardfreememory</a>
     *
     * @param hContext
     * @param pvMem - Memory block to be released.
     * @return {@link #SCARD_S_SUCCESS} if success, else error code according to <a href=
     *         "https://docs.microsoft.com/en-us/windows/win32/secauthn/authentication-return-values">SmartCard
     *         return values</a>.
     */
    public long sCardFreeMemory(MemoryAddress hContext, MemoryAddress pvMem) {
        return callNativeFunction(() -> freeMem.call(hContext, pvMem));
    }

    /**
     * See <a href=
     * "https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardreleasecontext">https://docs.microsoft.com/en-us/windows/win32/api/winscard/nf-winscard-scardreleasecontext</a>
     *
     * @param hContext
     * @return {@link #SCARD_S_SUCCESS} if success, else error code according to <a href=
     *         "https://docs.microsoft.com/en-us/windows/win32/secauthn/authentication-return-values">SmartCard
     *         return values</a>.
     */
    public long sCardReleaseContext(MemoryAddress hContext) {
        return callNativeFunction(() -> releaseCtx.call(hContext));
    }

    @Override
    public void close() {
        if (mySession.isAlive()) {
            synchronized (this) {
                if (mySession.isAlive()) {
                    mySession.close();
                }
            }
        }
    }
}
