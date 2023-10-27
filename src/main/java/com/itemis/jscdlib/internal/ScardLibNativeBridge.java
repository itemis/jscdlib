package com.itemis.jscdlib.internal;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.util.function.Function;

public final class ScardLibNativeBridge extends NativeBase implements AutoCloseable {

    private final FluffyNativeMethodHandle<Long> establishCtx;
    private final FluffyNativeMethodHandle<Long> listReaders;
    private final FluffyNativeMethodHandle<Long> freeMem;
    private final FluffyNativeMethodHandle<Long> releaseCtx;

    private final Arena myArena;

    /**
     * Create a new instance.
     *
     * @param libSup - Creates a "Connection" to the underlying native library in form of a
     *        {@link SymbolLookup}. The connection will be closed when {@link #close()} is called.
     */
    public ScardLibNativeBridge(final Function<Arena, SymbolLookup> libSup) {
        myArena = Arena.ofShared();
        final var lib = libSup.apply(myArena);

        establishCtx = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(JAVA_LONG, ADDRESS, ADDRESS, ADDRESS);

        final var suffix = new OsDetector().isWindows() ? "A" : "";
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
     * @param pvReserved1 - Reserved for future use and must be {@link MemorySegment#NULL}
     * @param pvReserved2 - Reserved for future use and must be {@link MemorySegment#NULL}.
     * @param phContext
     * @return {@link #SCARD_S_SUCCESS} if success, else error code according to <a href=
     *         "https://docs.microsoft.com/en-us/windows/win32/secauthn/authentication-return-values">SmartCard
     *         return values</a>.
     */
    public long sCardEstablishContext(final long dwScope, final MemorySegment pvReserved1,
            final MemorySegment pvReserved2,
            final MemorySegment phContext) {
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
    public long sCardListReaders(final MemorySegment hContext, final MemorySegment mszGroups,
            final MemorySegment mszReaders,
            final MemorySegment pcchReaders) {
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
    public long sCardFreeMemory(final MemorySegment hContext, final MemorySegment pvMem) {
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
    public long sCardReleaseContext(final MemorySegment hContext) {
        return callNativeFunction(() -> releaseCtx.call(hContext));
    }

    @Override
    public void close() {
        if (myArena.scope().isAlive()) {
            synchronized (this) {
                if (myArena.scope().isAlive()) {
                    myArena.close();
                }
            }
        }
    }
}
