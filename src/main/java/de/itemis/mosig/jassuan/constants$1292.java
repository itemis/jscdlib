// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1292 {

    static final FunctionDescriptor OpenPrinterW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OpenPrinterW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenPrinterW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1292.OpenPrinterW$FUNC, false
    );
    static final FunctionDescriptor ResetPrinterA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ResetPrinterA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ResetPrinterA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1292.ResetPrinterA$FUNC, false
    );
    static final FunctionDescriptor ResetPrinterW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ResetPrinterW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ResetPrinterW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1292.ResetPrinterW$FUNC, false
    );
    static final FunctionDescriptor SetJobA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetJobA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetJobA",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$1292.SetJobA$FUNC, false
    );
    static final FunctionDescriptor SetJobW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetJobW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetJobW",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$1292.SetJobW$FUNC, false
    );
    static final FunctionDescriptor GetJobA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetJobA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetJobA",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1292.GetJobA$FUNC, false
    );
}


