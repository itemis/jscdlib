// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1260 {

    static final FunctionDescriptor DispInvoke$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_SHORT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle DispInvoke$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DispInvoke",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ISLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1260.DispInvoke$FUNC, false
    );
    static final FunctionDescriptor CreateDispTypeInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateDispTypeInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateDispTypeInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1260.CreateDispTypeInfo$FUNC, false
    );
    static final FunctionDescriptor CreateStdDispatch$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateStdDispatch$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateStdDispatch",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1260.CreateStdDispatch$FUNC, false
    );
    static final FunctionDescriptor DispCallFunc$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT,
        C_SHORT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle DispCallFunc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DispCallFunc",
        "(Ljdk/incubator/foreign/MemoryAddress;JISILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1260.DispCallFunc$FUNC, false
    );
    static final FunctionDescriptor RegisterActiveObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle RegisterActiveObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegisterActiveObject",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1260.RegisterActiveObject$FUNC, false
    );
    static final FunctionDescriptor RevokeActiveObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle RevokeActiveObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RevokeActiveObject",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1260.RevokeActiveObject$FUNC, false
    );
}


