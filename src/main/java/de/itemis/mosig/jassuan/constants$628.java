// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$628 {

    static final FunctionDescriptor InvertRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle InvertRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InvertRect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$628.InvertRect$FUNC, false
    );
    static final FunctionDescriptor SetRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle SetRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetRect",
        "(Ljdk/incubator/foreign/MemoryAddress;IIII)I",
        constants$628.SetRect$FUNC, false
    );
    static final FunctionDescriptor SetRectEmpty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SetRectEmpty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetRectEmpty",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$628.SetRectEmpty$FUNC, false
    );
    static final FunctionDescriptor CopyRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CopyRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CopyRect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$628.CopyRect$FUNC, false
    );
    static final FunctionDescriptor InflateRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle InflateRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InflateRect",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$628.InflateRect$FUNC, false
    );
    static final FunctionDescriptor IntersectRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IntersectRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IntersectRect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$628.IntersectRect$FUNC, false
    );
}


