// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$160 {

    static final FunctionDescriptor _mbstrlen$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _mbstrlen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mbstrlen",
        "(Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$160._mbstrlen$FUNC, false
    );
    static final FunctionDescriptor _mbstrlen_l$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _mbstrlen_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mbstrlen_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$160._mbstrlen_l$FUNC, false
    );
    static final FunctionDescriptor _mbstrnlen$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle _mbstrnlen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mbstrnlen",
        "(Ljdk/incubator/foreign/MemoryAddress;J)J",
        constants$160._mbstrnlen$FUNC, false
    );
    static final FunctionDescriptor _mbstrnlen_l$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _mbstrnlen_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mbstrnlen_l",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)J",
        constants$160._mbstrnlen_l$FUNC, false
    );
    static final FunctionDescriptor mbtowc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle mbtowc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mbtowc",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$160.mbtowc$FUNC, false
    );
    static final FunctionDescriptor _mbtowc_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _mbtowc_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mbtowc_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$160._mbtowc_l$FUNC, false
    );
}


