package com.itemis.jscdlib.internal;

import static jdk.incubator.foreign.CLinker.C_LONG_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

import com.itemis.fluffyj.memory.NativeMethodHandle;
import com.itemis.jscdlib.ScardLibNative;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.SymbolLookup;

public class ScardLibNativeWinImpl extends NativeBase implements ScardLibNative {

    private final NativeMethodHandle<Long> establishCtx;
    private final NativeMethodHandle<Long> listReaders;
    private final NativeMethodHandle<Long> freeMem;
    private final NativeMethodHandle<Long> releaseCtx;

    public ScardLibNativeWinImpl() {
        System.loadLibrary("winscard");
        var lib = SymbolLookup.loaderLookup();
        establishCtx = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(C_LONG_LONG, C_POINTER, C_POINTER, C_POINTER);

        listReaders = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardListReadersA")
            .args(C_POINTER, C_POINTER, C_POINTER, C_POINTER);

        freeMem = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardFreeMemory")
            .args(C_POINTER, C_POINTER);

        releaseCtx = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardReleaseContext")
            .args(C_POINTER);
    }

    @Override
    public long sCardEstablishContext(long dwScope, MemoryAddress pvReserved1, MemoryAddress pvReserved2, MemoryAddress phContext) {
        return callNativeFunction(() -> establishCtx.call(dwScope, pvReserved1, pvReserved2, phContext));
    }

    @Override
    public long sCardListReadersA(MemoryAddress hContext, MemoryAddress mszGroups, MemoryAddress mszReaders, MemoryAddress pcchReaders) {
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
