// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$649 {

    static final FunctionDescriptor GetDisplayConfigBufferSizes$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDisplayConfigBufferSizes$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDisplayConfigBufferSizes",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$649.GetDisplayConfigBufferSizes$FUNC, false
    );
    static final FunctionDescriptor SetDisplayConfig$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetDisplayConfig$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetDisplayConfig",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$649.SetDisplayConfig$FUNC, false
    );
    static final FunctionDescriptor QueryDisplayConfig$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryDisplayConfig$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryDisplayConfig",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$649.QueryDisplayConfig$FUNC, false
    );
    static final FunctionDescriptor DisplayConfigGetDeviceInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle DisplayConfigGetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DisplayConfigGetDeviceInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$649.DisplayConfigGetDeviceInfo$FUNC, false
    );
    static final FunctionDescriptor DisplayConfigSetDeviceInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle DisplayConfigSetDeviceInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DisplayConfigSetDeviceInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$649.DisplayConfigSetDeviceInfo$FUNC, false
    );
    static final FunctionDescriptor SystemParametersInfoA$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SystemParametersInfoA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SystemParametersInfoA",
        "(IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$649.SystemParametersInfoA$FUNC, false
    );
}


