// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$705 {

    static final FunctionDescriptor GetFileVersionInfoSizeA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoSizeA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoSizeA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$705.GetFileVersionInfoSizeA$FUNC, false
    );
    static final FunctionDescriptor GetFileVersionInfoSizeW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoSizeW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoSizeW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$705.GetFileVersionInfoSizeW$FUNC, false
    );
    static final FunctionDescriptor GetFileVersionInfoSizeExA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoSizeExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoSizeExA",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$705.GetFileVersionInfoSizeExA$FUNC, false
    );
    static final FunctionDescriptor GetFileVersionInfoSizeExW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoSizeExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoSizeExW",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$705.GetFileVersionInfoSizeExW$FUNC, false
    );
    static final FunctionDescriptor GetFileVersionInfoA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoA",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$705.GetFileVersionInfoA$FUNC, false
    );
    static final FunctionDescriptor GetFileVersionInfoW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetFileVersionInfoW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileVersionInfoW",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$705.GetFileVersionInfoW$FUNC, false
    );
}


