// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1232 {

    static final FunctionDescriptor VarBstrFromUI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarBstrFromUI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarBstrFromUI8",
        "(JIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1232.VarBstrFromUI8$FUNC, false
    );
    static final FunctionDescriptor VarBstrFromDec$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarBstrFromDec$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarBstrFromDec",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1232.VarBstrFromDec$FUNC, false
    );
    static final FunctionDescriptor VarBoolFromUI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarBoolFromUI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarBoolFromUI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1232.VarBoolFromUI1$FUNC, false
    );
    static final FunctionDescriptor VarBoolFromI2$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarBoolFromI2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarBoolFromI2",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1232.VarBoolFromI2$FUNC, false
    );
    static final FunctionDescriptor VarBoolFromI4$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarBoolFromI4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarBoolFromI4",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1232.VarBoolFromI4$FUNC, false
    );
    static final FunctionDescriptor VarBoolFromI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle VarBoolFromI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarBoolFromI8",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1232.VarBoolFromI8$FUNC, false
    );
}


