// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$62 {

    static final FunctionDescriptor strncpy$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle strncpy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strncpy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.strncpy$FUNC, false
    );
    static final FunctionDescriptor _strnset$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG_LONG
    );
    static final MethodHandle _strnset$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strnset",
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62._strnset$FUNC, false
    );
    static final FunctionDescriptor _strnset_l$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _strnset_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strnset_l",
        "(Ljdk/incubator/foreign/MemoryAddress;IJLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62._strnset_l$FUNC, false
    );
    static final FunctionDescriptor strpbrk$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle strpbrk$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strpbrk",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.strpbrk$FUNC, false
    );
    static final FunctionDescriptor strrchr$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle strrchr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strrchr",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62.strrchr$FUNC, false
    );
    static final FunctionDescriptor _strrev$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle _strrev$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strrev",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$62._strrev$FUNC, false
    );
}


