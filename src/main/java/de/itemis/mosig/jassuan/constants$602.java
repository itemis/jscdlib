// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$602 {

    static final FunctionDescriptor HiliteMenuItem$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle HiliteMenuItem$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "HiliteMenuItem",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$602.HiliteMenuItem$FUNC, false
    );
    static final FunctionDescriptor GetMenuStringA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle GetMenuStringA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMenuStringA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)I",
        constants$602.GetMenuStringA$FUNC, false
    );
    static final FunctionDescriptor GetMenuStringW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle GetMenuStringW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMenuStringW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)I",
        constants$602.GetMenuStringW$FUNC, false
    );
    static final FunctionDescriptor GetMenuState$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle GetMenuState$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMenuState",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$602.GetMenuState$FUNC, false
    );
    static final FunctionDescriptor DrawMenuBar$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle DrawMenuBar$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DrawMenuBar",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$602.DrawMenuBar$FUNC, false
    );
    static final FunctionDescriptor GetSystemMenu$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetSystemMenu$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetSystemMenu",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$602.GetSystemMenu$FUNC, false
    );
}


