// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$4 {

    static final FunctionDescriptor __ms_fprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle __ms_fprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__ms_fprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$4.__ms_fprintf$FUNC, true
    );
    static final FunctionDescriptor __ms_vfprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle __ms_vfprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__ms_vfprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$4.__ms_vfprintf$FUNC, false
    );
    static final FunctionDescriptor __ms_sprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle __ms_sprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__ms_sprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$4.__ms_sprintf$FUNC, true
    );
    static final FunctionDescriptor __ms_vsprintf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle __ms_vsprintf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__ms_vsprintf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$4.__ms_vsprintf$FUNC, false
    );
    static final FunctionDescriptor sscanf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle sscanf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "sscanf",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$4.sscanf$FUNC, true
    );
    static final FunctionDescriptor scanf$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle scanf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "scanf",
        "(Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)I",
        constants$4.scanf$FUNC, true
    );
}


