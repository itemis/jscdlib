// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$502 {

    static final FunctionDescriptor GetTextColor$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle GetTextColor$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetTextColor",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$502.GetTextColor$FUNC, false
    );
    static final FunctionDescriptor GetTextExtentPointA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetTextExtentPointA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetTextExtentPointA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$502.GetTextExtentPointA$FUNC, false
    );
    static final FunctionDescriptor GetTextExtentPointW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetTextExtentPointW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetTextExtentPointW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$502.GetTextExtentPointW$FUNC, false
    );
    static final FunctionDescriptor GetTextExtentPoint32A$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetTextExtentPoint32A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetTextExtentPoint32A",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$502.GetTextExtentPoint32A$FUNC, false
    );
    static final FunctionDescriptor GetTextExtentPoint32W$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetTextExtentPoint32W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetTextExtentPoint32W",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$502.GetTextExtentPoint32W$FUNC, false
    );
    static final FunctionDescriptor GetTextExtentExPointA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetTextExtentExPointA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetTextExtentExPointA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$502.GetTextExtentExPointA$FUNC, false
    );
}


