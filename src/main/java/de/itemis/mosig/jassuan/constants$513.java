// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$513 {

    static final FunctionDescriptor SetDCPenColor$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetDCPenColor$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetDCPenColor",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$513.SetDCPenColor$FUNC, false
    );
    static final FunctionDescriptor SetBkMode$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetBkMode$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetBkMode",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$513.SetBkMode$FUNC, false
    );
    static final FunctionDescriptor SetBitmapBits$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle SetBitmapBits$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetBitmapBits",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$513.SetBitmapBits$FUNC, false
    );
    static final FunctionDescriptor SetBoundsRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetBoundsRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetBoundsRect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$513.SetBoundsRect$FUNC, false
    );
    static final FunctionDescriptor SetDIBits$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetDIBits$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetDIBits",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$513.SetDIBits$FUNC, false
    );
    static final FunctionDescriptor SetDIBitsToDevice$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_LONG,
        C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetDIBitsToDevice$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetDIBitsToDevice",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIIIIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$513.SetDIBitsToDevice$FUNC, false
    );
}


