// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$37 {

    static final FunctionDescriptor _snscanf_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _snscanf_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_snscanf_l",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$37._snscanf_l$FUNC, true
    );
    static final FunctionDescriptor _snscanf_s_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _snscanf_s_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_snscanf_s_l",
        "(Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$37._snscanf_s_l$FUNC, true
    );
    static final FunctionDescriptor vfprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle vfprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "vfprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$37.vfprintf_s$FUNC, false
    );
    static final FunctionDescriptor vprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle vprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "vprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$37.vprintf_s$FUNC, false
    );
    static final FunctionDescriptor vsnprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle vsnprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "vsnprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$37.vsnprintf_s$FUNC, false
    );
    static final FunctionDescriptor _vsnprintf_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _vsnprintf_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_vsnprintf_s",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$37._vsnprintf_s$FUNC, false
    );
}


