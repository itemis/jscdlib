// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$26 {

    static final FunctionDescriptor fgetws$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle fgetws$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "fgetws",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26.fgetws$FUNC, false
    );
    static final FunctionDescriptor fputws$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle fputws$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "fputws",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$26.fputws$FUNC, false
    );
    static final FunctionDescriptor _getws$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle _getws$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_getws",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$26._getws$FUNC, false
    );
    static final FunctionDescriptor _putws$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _putws$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_putws",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$26._putws$FUNC, false
    );
    static final FunctionDescriptor _scwprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _scwprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_scwprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$26._scwprintf$FUNC, true
    );
    static final FunctionDescriptor _swprintf_c$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _swprintf_c$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_swprintf_c",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$26._swprintf_c$FUNC, true
    );
}


