// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$617 {

    static final FunctionDescriptor EnableScrollBar$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle EnableScrollBar$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnableScrollBar",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$617.EnableScrollBar$FUNC, false
    );
    static final FunctionDescriptor SetPropA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetPropA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetPropA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$617.SetPropA$FUNC, false
    );
    static final FunctionDescriptor SetPropW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetPropW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetPropW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$617.SetPropW$FUNC, false
    );
    static final FunctionDescriptor GetPropA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetPropA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetPropA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$617.GetPropA$FUNC, false
    );
    static final FunctionDescriptor GetPropW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetPropW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetPropW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$617.GetPropW$FUNC, false
    );
    static final FunctionDescriptor RemovePropA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RemovePropA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RemovePropA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$617.RemovePropA$FUNC, false
    );
}


