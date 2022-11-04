package com.itemis.jscdlib.internal;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;
import com.itemis.jscdlib.ScardLibNative;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SymbolLookup;

public class ScardLibNativeLinuxImpl extends NativeBase implements ScardLibNative {

    private static final Logger LOG = LoggerFactory.getLogger(ScardLibNativeLinuxImpl.class);

    private final FluffyNativeMethodHandle<Long> establishCtx;
    private final FluffyNativeMethodHandle<Long> listReaders;
    private final FluffyNativeMethodHandle<Long> freeMem;
    private final FluffyNativeMethodHandle<Long> releaseCtx;

    public ScardLibNativeLinuxImpl() {
        var lib = loadLib();
        establishCtx = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardEstablishContext")
            .args(JAVA_LONG, ADDRESS, ADDRESS, ADDRESS);

        listReaders = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("SCardListReaders")
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
