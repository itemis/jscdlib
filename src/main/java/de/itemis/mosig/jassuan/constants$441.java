// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$441 {

    static final FunctionDescriptor GetNamedPipeClientComputerNameA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetNamedPipeClientComputerNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNamedPipeClientComputerNameA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$441.GetNamedPipeClientComputerNameA$FUNC, false
    );
    static final FunctionDescriptor WaitNamedPipeA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle WaitNamedPipeA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WaitNamedPipeA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$441.WaitNamedPipeA$FUNC, false
    );
    static final FunctionDescriptor CallNamedPipeA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CallNamedPipeA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CallNamedPipeA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$441.CallNamedPipeA$FUNC, false
    );
    static final FunctionDescriptor CallNamedPipeW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CallNamedPipeW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CallNamedPipeW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$441.CallNamedPipeW$FUNC, false
    );
    static final FunctionDescriptor CreateNamedPipeA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateNamedPipeA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateNamedPipeA",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIIIILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$441.CreateNamedPipeA$FUNC, false
    );
    static final FunctionDescriptor GetNamedPipeHandleStateA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetNamedPipeHandleStateA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNamedPipeHandleStateA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$441.GetNamedPipeHandleStateA$FUNC, false
    );
}


