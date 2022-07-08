package com.itemis.jscdlib.internal;

import static jdk.incubator.foreign.CLinker.C_INT;
import static jdk.incubator.foreign.CLinker.C_POINTER;

import com.itemis.fluffyj.memory.NativeMethodHandle;
import com.itemis.jscdlib.AssuanLibNative;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.SymbolLookup;

public class AssuanLibNativeLinuxImpl extends NativeBase implements AssuanLibNative {

    private static final Logger LOG = LoggerFactory.getLogger(AssuanLibNativeLinuxImpl.class);

    private final NativeMethodHandle<Long> assuanNew;
    private final NativeMethodHandle<Long> assuanRelease;
    private final NativeMethodHandle<Long> assuanSocketConnect;
    private final NativeMethodHandle<Long> assuanTransact;

    public AssuanLibNativeLinuxImpl() {
        var lib = loadLib();

        assuanNew = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_new")
            .args(C_POINTER);

        assuanRelease = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_release")
            .args(C_POINTER);

        assuanSocketConnect = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_socket_connect")
            .args(C_POINTER, C_POINTER, C_INT, C_INT);

        assuanTransact = NativeMethodHandle
            .fromCLib(lib)
            .returnType(long.class)
            .func("assuan_transact")
            .args(C_POINTER, C_POINTER, C_POINTER, C_POINTER, C_POINTER, C_POINTER, C_POINTER, C_POINTER);
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
    public long assuanTransact(MemoryAddress ctx, MemoryAddress command, MemoryAddress data_cb, MemoryAddress data_cb_arg, MemoryAddress inquire_cb,
            MemoryAddress inquire_cb_arg, MemoryAddress status_cb, MemoryAddress status_cb_arg) {
        return callNativeFunction(() -> assuanTransact.call(ctx, command, data_cb, data_cb_arg, inquire_cb, inquire_cb_arg, status_cb, status_cb_arg));
    }

    private final SymbolLookup loadLib() {
        try {
            System.loadLibrary("libassuan.so.0");
        } catch (UnsatisfiedLinkError outerE) {
            var msg = "Could not get a handle on lib.";
            LOG.debug(msg, outerE);
            try {
                System.loadLibrary("libassuan.so");
            } catch (UnsatisfiedLinkError innerE) {
                LOG.error(msg + " Giving up.", innerE);
                throw innerE;
            }
        }

        return SymbolLookup.loaderLookup();
    }
}

