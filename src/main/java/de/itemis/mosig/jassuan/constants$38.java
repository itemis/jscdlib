// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$38 {

    static final FunctionDescriptor vsprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle vsprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "vsprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$38.vsprintf_s$FUNC, false
    );
    static final FunctionDescriptor sprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle sprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "sprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$38.sprintf_s$FUNC, true
    );
    static final FunctionDescriptor _snprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _snprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_snprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$38._snprintf_s$FUNC, true
    );
    static final FunctionDescriptor _fprintf_p$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _fprintf_p$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_fprintf_p",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$38._fprintf_p$FUNC, true
    );
    static final FunctionDescriptor _printf_p$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _printf_p$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_printf_p",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$38._printf_p$FUNC, true
    );
    static final FunctionDescriptor _sprintf_p$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _sprintf_p$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_sprintf_p",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$38._sprintf_p$FUNC, true
    );
}


