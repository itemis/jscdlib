// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$687 {

    static final FunctionDescriptor GetDurationFormatEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetDurationFormatEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDurationFormatEx",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$687.GetDurationFormatEx$FUNC, false
    );
    static final FunctionDescriptor GetNumberFormatEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetNumberFormatEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNumberFormatEx",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$687.GetNumberFormatEx$FUNC, false
    );
    static final FunctionDescriptor GetCurrencyFormatEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetCurrencyFormatEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetCurrencyFormatEx",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$687.GetCurrencyFormatEx$FUNC, false
    );
    static final FunctionDescriptor GetUserDefaultLocaleName$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetUserDefaultLocaleName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetUserDefaultLocaleName",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$687.GetUserDefaultLocaleName$FUNC, false
    );
    static final FunctionDescriptor GetSystemDefaultLocaleName$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetSystemDefaultLocaleName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemDefaultLocaleName",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$687.GetSystemDefaultLocaleName$FUNC, false
    );
    static final FunctionDescriptor GetNLSVersionEx$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetNLSVersionEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNLSVersionEx",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$687.GetNLSVersionEx$FUNC, false
    );
}


