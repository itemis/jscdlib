// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$496 {

    static final FunctionDescriptor GetCharABCWidthsFloatA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetCharABCWidthsFloatA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetCharABCWidthsFloatA",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$496.GetCharABCWidthsFloatA$FUNC, false
    );
    static final FunctionDescriptor GetCharABCWidthsFloatW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetCharABCWidthsFloatW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetCharABCWidthsFloatW",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$496.GetCharABCWidthsFloatW$FUNC, false
    );
    static final FunctionDescriptor GetClipBox$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetClipBox$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetClipBox",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$496.GetClipBox$FUNC, false
    );
    static final FunctionDescriptor GetClipRgn$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetClipRgn$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetClipRgn",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$496.GetClipRgn$FUNC, false
    );
    static final FunctionDescriptor GetMetaRgn$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetMetaRgn$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMetaRgn",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$496.GetMetaRgn$FUNC, false
    );
    static final FunctionDescriptor GetCurrentObject$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetCurrentObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetCurrentObject",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$496.GetCurrentObject$FUNC, false
    );
}


