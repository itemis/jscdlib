// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1224 {

    static final FunctionDescriptor VarR8FromI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarR8FromI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarR8FromI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1224.VarR8FromI1$FUNC, false
    );
    static final FunctionDescriptor VarR8FromUI2$FUNC = FunctionDescriptor.of(C_LONG,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle VarR8FromUI2$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarR8FromUI2",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1224.VarR8FromUI2$FUNC, false
    );
    static final FunctionDescriptor VarR8FromUI4$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle VarR8FromUI4$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarR8FromUI4",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1224.VarR8FromUI4$FUNC, false
    );
    static final FunctionDescriptor VarR8FromUI8$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle VarR8FromUI8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarR8FromUI8",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1224.VarR8FromUI8$FUNC, false
    );
    static final FunctionDescriptor VarR8FromDec$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle VarR8FromDec$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarR8FromDec",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1224.VarR8FromDec$FUNC, false
    );
    static final FunctionDescriptor VarDateFromUI1$FUNC = FunctionDescriptor.of(C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle VarDateFromUI1$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "VarDateFromUI1",
        "(BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1224.VarDateFromUI1$FUNC, false
    );
}


