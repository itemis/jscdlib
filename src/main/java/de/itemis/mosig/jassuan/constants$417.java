// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$417 {

    static final FunctionDescriptor OpenFile$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle OpenFile$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenFile",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$417.OpenFile$FUNC, false
    );
    static final FunctionDescriptor _lopen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _lopen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_lopen",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$417._lopen$FUNC, false
    );
    static final FunctionDescriptor _lcreat$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _lcreat$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_lcreat",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$417._lcreat$FUNC, false
    );
    static final FunctionDescriptor _lread$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _lread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_lread",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$417._lread$FUNC, false
    );
    static final FunctionDescriptor _lwrite$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _lwrite$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_lwrite",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$417._lwrite$FUNC, false
    );
    static final FunctionDescriptor _hread$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle _hread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_hread",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$417._hread$FUNC, false
    );
}


