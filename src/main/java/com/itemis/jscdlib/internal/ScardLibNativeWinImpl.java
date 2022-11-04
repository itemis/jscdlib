package com.itemis.jscdlib.internal;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;
import com.itemis.jscdlib.ScardLibNative;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SymbolLookup;

public class ScardLibNativeWinImpl extends NativeBase implements ScardLibNative {

    private final FluffyNativeMethodHandle<Long> establishCtx;
    private final FluffyNativeMethodHandle<Long> listReaders;
    private final FluffyNativeMethodHandle<Long> freeMem;
    private final FluffyNativeMethodHandle<Long> releaseCtx;

    public ScardLibNativeWinImpl() {
        System.loadLibrary("winscard");
        var lib = SymbolLookup.loaderLookup();
        establishCtx = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(JAVA_LONG, ADDRESS, ADDRESS, ADDRESS);

        listReaders = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardListReadersA")
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

    @Override
    public long sCardEstablishContext(long dwScope, MemoryAddress pvReserved1, MemoryAddress pvReserved2,
            MemoryAddress phContext) {
        return callNativeFunction(() -> establishCtx.call(dwScope, pvReserved1, pvReserved2, phContext));
    }

    @Override
    public long sCardListReadersA(MemoryAddress hContext, MemoryAddress mszGroups, MemoryAddress mszReaders,
            MemoryAddress pcchReaders) {
        return callNativeFunction(() -> listReaders.call(hContext, mszGroups, mszReaders, pcchReaders));
    }

    @Override
    public long sCardFreeMemory(MemoryAddress hContext, MemoryAddress pvMem) {
        return callNativeFunction(() -> freeMem.call(hContext, pvMem));
    }

    @Override
    public long sCardReleaseContext(MemoryAddress hContext) {
        return callNativeFunction(() -> releaseCtx.call(hContext));
    }
}
