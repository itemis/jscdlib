// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$652 {

    static final FunctionDescriptor GetMonitorInfoW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetMonitorInfoW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMonitorInfoW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$652.GetMonitorInfoW$FUNC, false
    );
    static final FunctionDescriptor EnumDisplayMonitors$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle EnumDisplayMonitors$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumDisplayMonitors",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$652.EnumDisplayMonitors$FUNC, false
    );
    static final FunctionDescriptor WINEVENTPROC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle WINEVENTPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IIII)V",
        constants$652.WINEVENTPROC$FUNC, false
    );
    static final FunctionDescriptor NotifyWinEvent$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle NotifyWinEvent$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NotifyWinEvent",
        "(ILjdk/incubator/foreign/MemoryAddress;II)V",
        constants$652.NotifyWinEvent$FUNC, false
    );
    static final FunctionDescriptor SetWinEventHook$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle SetWinEventHook$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetWinEventHook",
        "(IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;III)Ljdk/incubator/foreign/MemoryAddress;",
        constants$652.SetWinEventHook$FUNC, false
    );
}


