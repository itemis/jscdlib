package com.itemis.jscdlib.internal;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;
import com.itemis.jscdlib.AssuanLibNative;

import java.lang.foreign.MemoryAddress;
import java.lang.foreign.SymbolLookup;

public class AssuanLibNativeWinImpl extends NativeBase implements AssuanLibNative {

    private final FluffyNativeMethodHandle<Long> assuanNew;
    private final FluffyNativeMethodHandle<Long> assuanRelease;
    private final FluffyNativeMethodHandle<Long> assuanSocketConnect;
    private final FluffyNativeMethodHandle<Long> assuanTransact;

    public AssuanLibNativeWinImpl() {
        System.loadLibrary("libassuan6-0");
        var lib = SymbolLookup.loaderLookup();

        assuanNew = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_new")
            .args(ADDRESS);

        assuanRelease = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_release")
            .args(ADDRESS);

        assuanSocketConnect = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_socket_connect")
            .args(ADDRESS, ADDRESS, JAVA_INT, JAVA_INT);

        assuanTransact = FluffyNativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_transact")
            .args(ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS, ADDRESS);
    }

    @Override
    public long assuanNew(MemoryAddress p_ctx) {
        return callNativeFunction(() -> assuanNew.call(p_ctx));
    }

    @Override
    public void assuanRelease(MemoryAddress ctx) {
        callNativeVoidFunction(() -> assuanRelease.call(ctx));
    }

    @Override
    public long assuanSocketConnect(MemoryAddress ctx, MemoryAddress name, int server_pid, int flags) {
        return callNativeFunction(() -> assuanSocketConnect.call(ctx, name, server_pid, flags));
    }

    @Override
    public long assuanTransact(MemoryAddress ctx, MemoryAddress command, MemoryAddress data_cb,
            MemoryAddress data_cb_arg, MemoryAddress inquire_cb,
            MemoryAddress inquire_cb_arg, MemoryAddress status_cb, MemoryAddress status_cb_arg) {
        return callNativeFunction(() -> assuanTransact.call(ctx, command, data_cb, data_cb_arg, inquire_cb,
            inquire_cb_arg, status_cb, status_cb_arg));
    }
}

