// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1310 {

    static final FunctionDescriptor DeletePortA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle DeletePortA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DeletePortA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1310.DeletePortA$FUNC, false
    );
    static final FunctionDescriptor DeletePortW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle DeletePortW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DeletePortW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1310.DeletePortW$FUNC, false
    );
    static final FunctionDescriptor XcvDataW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle XcvDataW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "XcvDataW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1310.XcvDataW$FUNC, false
    );
    static final FunctionDescriptor GetDefaultPrinterA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDefaultPrinterA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDefaultPrinterA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1310.GetDefaultPrinterA$FUNC, false
    );
    static final FunctionDescriptor GetDefaultPrinterW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDefaultPrinterW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDefaultPrinterW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1310.GetDefaultPrinterW$FUNC, false
    );
    static final FunctionDescriptor SetDefaultPrinterA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SetDefaultPrinterA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetDefaultPrinterA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1310.SetDefaultPrinterA$FUNC, false
    );
}


