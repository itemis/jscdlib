// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$843 {

    static final FunctionDescriptor CryptGetKeyParam$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptGetKeyParam$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptGetKeyParam",
        "(JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$843.CryptGetKeyParam$FUNC, false
    );
    static final FunctionDescriptor CryptSetHashParam$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptSetHashParam$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSetHashParam",
        "(JILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$843.CryptSetHashParam$FUNC, false
    );
    static final FunctionDescriptor CryptGetHashParam$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptGetHashParam$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptGetHashParam",
        "(JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$843.CryptGetHashParam$FUNC, false
    );
    static final FunctionDescriptor CryptSetProvParam$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptSetProvParam$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptSetProvParam",
        "(JILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$843.CryptSetProvParam$FUNC, false
    );
    static final FunctionDescriptor CryptGetProvParam$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptGetProvParam$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptGetProvParam",
        "(JILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$843.CryptGetProvParam$FUNC, false
    );
    static final FunctionDescriptor CryptGetUserKey$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CryptGetUserKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptGetUserKey",
        "(JILjdk/incubator/foreign/MemoryAddress;)I",
        constants$843.CryptGetUserKey$FUNC, false
    );
}


