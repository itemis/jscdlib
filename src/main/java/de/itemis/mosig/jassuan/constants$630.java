// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$630 {

    static final FunctionDescriptor GetWindowWord$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetWindowWord$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetWindowWord",
        "(Ljdk/incubator/foreign/MemoryAddress;I)S",
        constants$630.GetWindowWord$FUNC, false
    );
    static final FunctionDescriptor SetWindowWord$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER,
        C_INT,
        C_SHORT
    );
    static final MethodHandle SetWindowWord$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetWindowWord",
        "(Ljdk/incubator/foreign/MemoryAddress;IS)S",
        constants$630.SetWindowWord$FUNC, false
    );
    static final FunctionDescriptor GetWindowLongA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetWindowLongA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetWindowLongA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$630.GetWindowLongA$FUNC, false
    );
    static final FunctionDescriptor GetWindowLongW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetWindowLongW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetWindowLongW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$630.GetWindowLongW$FUNC, false
    );
    static final FunctionDescriptor SetWindowLongA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle SetWindowLongA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetWindowLongA",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$630.SetWindowLongA$FUNC, false
    );
    static final FunctionDescriptor SetWindowLongW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle SetWindowLongW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetWindowLongW",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$630.SetWindowLongW$FUNC, false
    );
}


