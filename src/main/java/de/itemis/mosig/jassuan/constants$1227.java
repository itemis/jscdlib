// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1227 {

    static final FunctionDescriptor VarDateFromUI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle VarDateFromUI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromUI8",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1227.VarDateFromUI8$FUNC, false
    );
    static final FunctionDescriptor VarDateFromDec$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle VarDateFromDec$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromDec",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1227.VarDateFromDec$FUNC, false
    );
    static final FunctionDescriptor VarCyFromUI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarCyFromUI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarCyFromUI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1227.VarCyFromUI1$FUNC, false
    );
    static final FunctionDescriptor VarCyFromI2$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarCyFromI2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarCyFromI2",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1227.VarCyFromI2$FUNC, false
    );
    static final FunctionDescriptor VarCyFromI4$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarCyFromI4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarCyFromI4",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1227.VarCyFromI4$FUNC, false
    );
    static final FunctionDescriptor VarCyFromI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle VarCyFromI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarCyFromI8",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1227.VarCyFromI8$FUNC, false
    );
}


