package com.itemis.jscdlib.internal;

import static jdk.incubator.foreign.CLinker.C_LONG;
import static jdk.incubator.foreign.CLinker.C_POINTER;

import com.itemis.fluffyj.memory.NativeMethodHandle;
import com.itemis.jscdlib.ScardLibNative;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.SymbolLookup;

public class ScardLibNativeLinuxImpl extends NativeBase implements ScardLibNative {

    private static final Logger LOG = LoggerFactory.getLogger(ScardLibNativeLinuxImpl.class);

    private final NativeMethodHandle<Long> establishCtx;
    private final NativeMethodHandle<Long> listReaders;
    private final NativeMethodHandle<Long> freeMem;
    private final NativeMethodHandle<Long> releaseCtx;

    public ScardLibNativeLinuxImpl() {
        var lib = loadLib();
        establishCtx = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(C_LONG, C_POINTER, C_POINTER, C_POINTER);

        listReaders = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardListReaders")
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

    private final SymbolLookup loadLib() {
        // See
        // https://github.com/gpg/gnupg/blob/25ae80b8eb6e9011049d76440ad7d250c1d02f7c/scd/scdaemon.c#L210
        try {
            System.loadLibrary("libpcsclite.so.1");
        } catch (UnsatisfiedLinkError outerE) {
            var msg = "Could not get a handle on lib.";
            LOG.debug(msg, outerE);
            try {
                System.loadLibrary("libpcsclite.so");
            } catch (UnsatisfiedLinkError innerE) {
                LOG.error(msg + " Giving up.", innerE);
                throw innerE;
            }
        }

        return SymbolLookup.loaderLookup();
    }
}
