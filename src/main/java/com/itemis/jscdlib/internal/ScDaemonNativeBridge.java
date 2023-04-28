package com.itemis.jscdlib.internal;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentScope;
import java.lang.foreign.SymbolLookup;
import java.util.function.Function;

import jdk.jfr.MemoryAddress;

public final class ScDaemonNativeBridge extends NativeBase implements AutoCloseable {

    private final FluffyNativeMethodHandle<Long> assuanNew;
    private final FluffyNativeMethodHandle<Long> assuanRelease;
    private final FluffyNativeMethodHandle<Long> assuanSocketConnect;
    private final FluffyNativeMethodHandle<Long> assuanTransact;

    private final Arena myArena;

    /**
     * Create a new instance.
     *
     * @param libSup - Creates a "Connection" to the underlying native library in form of a
     *        {@link SymbolLookup}. The connection will be closed if {@link #close()} is called.
     */
    public ScDaemonNativeBridge(Function<SegmentScope, SymbolLookup> libSup) {
        myArena = Arena.openConfined();
        var lib = libSup.apply(myArena.scope());

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

    /**
     * Create a new assuan context with default arguments.
     *
     * @param p_ctx Pointer of pointer segment. Will hold the pointer to the created ctx upon
     *        successful return.
     * @return gpg_error_t - 0 for success, error code else.
     */
    public long assuanNew(MemorySegment p_ctx) {
        return callNativeFunction(() -> assuanNew.call(p_ctx));
    }

    /**
     * Release all resources associated with {@code ctx}.
     *
     * @param ctx Pointer to ctx created with {@link #assuanNew(MemoryAddress)}.
     */
    public void assuanRelease(MemorySegment ctx) {
        callNativeVoidFunction(() -> assuanRelease.call(ctx));
    }

    /**
     * Connect to an assuan socket (to the scdaemon).
     *
     * @param ctx Pointer to ctx created with {@link #assuanNew(MemoryAddress)}.
     * @param name Unix domain socket to connect to. May be a URI to a file.
     * @param server_pid Currently unused. Use ASSUAN_INVALID_PID (-1)
     * @param flags Undocumented. Use ASSUAN_SOCKET_CONNECT_FDPASSING (1)
     * @return gpg_error_t - 0 for success, error code else.
     */
    public long assuanSocketConnect(MemorySegment ctx, MemorySegment name, int server_pid, int flags) {
        return callNativeFunction(() -> assuanSocketConnect.call(ctx, name, server_pid, flags));
    }

    /**
     * <p>
     * Send a command to the smart card daemon (scdaemon).
     * </p>
     * <p>
     * Use
     * {@link CLinker#upcallStub(java.lang.invoke.MethodHandle, jdk.incubator.foreign.FunctionDescriptor)}
     * to provide proper callbacks.
     * </p>
     * <p>
     * Required callback signatures are:
     * <ul>
     * <li>gpg_error_t (*data_cb)(void *, const void *, size_t)</li>
     * <li>gpg_error_t (*inquire_cb)(void*, const char *)</li>
     * <li>gpg_error_t (*status_cb)(void*, const char *)</li>
     * </ul>
     * </p>
     *
     * @see https://www.gnupg.org/documentation/manuals/assuan/Client-code.html
     *
     * @param ctx Pointer to Assuan ctx
     * @param command Pointer to command string
     * @param data_cb Callback method for returned data.
     * @param data_cb_arg Will be passed to the callback along other things. May be
     *        {@link MemoryAddress#NULL}.
     * @param inquire_cb Callback method if the daemon needs more information from the client.
     * @param inquire_cb_arg Will be passed to the callback along other things. May be
     *        {@link MemoryAddress#NULL}.
     * @param status_cb Called for status lines returned from the daemon.
     * @param status_cb_arg Will be passed to the callback along other things. May be
     *        {@link MemoryAddress#NULL}.
     * @return gpg_error_t
     */
    public long assuanTransact(MemorySegment ctx, MemorySegment command, MemorySegment data_cb,
            MemorySegment data_cb_arg, MemorySegment inquire_cb,
            MemorySegment inquire_cb_arg, MemorySegment status_cb, MemorySegment status_cb_arg) {
        return callNativeFunction(() -> assuanTransact.call(ctx, command, data_cb, data_cb_arg, inquire_cb,
            inquire_cb_arg, status_cb, status_cb_arg));
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
