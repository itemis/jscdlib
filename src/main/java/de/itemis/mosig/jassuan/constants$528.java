// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$528 {

    static final FunctionDescriptor FlattenPath$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FlattenPath$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FlattenPath",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$528.FlattenPath$FUNC, false
    );
    static final FunctionDescriptor GetPath$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetPath$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetPath",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$528.GetPath$FUNC, false
    );
    static final FunctionDescriptor PathToRegion$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle PathToRegion$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PathToRegion",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$528.PathToRegion$FUNC, false
    );
    static final FunctionDescriptor PolyDraw$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PolyDraw$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PolyDraw",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$528.PolyDraw$FUNC, false
    );
    static final FunctionDescriptor SelectClipPath$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SelectClipPath$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SelectClipPath",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$528.SelectClipPath$FUNC, false
    );
    static final FunctionDescriptor SetArcDirection$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetArcDirection$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetArcDirection",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$528.SetArcDirection$FUNC, false
    );
}


