// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1257 {

    static final FunctionDescriptor VarFormatPercent$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarFormatPercent$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarFormatPercent",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1257.VarFormatPercent$FUNC, false
    );
    static final FunctionDescriptor VarFormatCurrency$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarFormatCurrency$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarFormatCurrency",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1257.VarFormatCurrency$FUNC, false
    );
    static final FunctionDescriptor VarWeekdayName$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarWeekdayName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarWeekdayName",
        "(IIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1257.VarWeekdayName$FUNC, false
    );
    static final FunctionDescriptor VarMonthName$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarMonthName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarMonthName",
        "(IIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1257.VarMonthName$FUNC, false
    );
    static final FunctionDescriptor VarFormatFromTokens$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle VarFormatFromTokens$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarFormatFromTokens",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$1257.VarFormatFromTokens$FUNC, false
    );
    static final FunctionDescriptor VarTokenizeFormatString$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarTokenizeFormatString$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarTokenizeFormatString",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1257.VarTokenizeFormatString$FUNC, false
    );
}


