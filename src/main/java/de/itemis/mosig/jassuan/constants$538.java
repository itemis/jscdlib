// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$538 {

    static final FunctionDescriptor CreateColorSpaceW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateColorSpaceW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateColorSpaceW",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$538.CreateColorSpaceW$FUNC, false
    );
    static final FunctionDescriptor SetColorSpace$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetColorSpace$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetColorSpace",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$538.SetColorSpace$FUNC, false
    );
    static final FunctionDescriptor DeleteColorSpace$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle DeleteColorSpace$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DeleteColorSpace",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$538.DeleteColorSpace$FUNC, false
    );
    static final FunctionDescriptor GetICMProfileA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetICMProfileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetICMProfileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$538.GetICMProfileA$FUNC, false
    );
    static final FunctionDescriptor GetICMProfileW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetICMProfileW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetICMProfileW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$538.GetICMProfileW$FUNC, false
    );
    static final FunctionDescriptor SetICMProfileA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetICMProfileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetICMProfileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$538.SetICMProfileA$FUNC, false
    );
}


