// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$606 {

    static final FunctionDescriptor TrackPopupMenu$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle TrackPopupMenu$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TrackPopupMenu",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$606.TrackPopupMenu$FUNC, false
    );
    static final FunctionDescriptor TrackPopupMenuEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle TrackPopupMenuEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TrackPopupMenuEx",
        "(Ljdk/incubator/foreign/MemoryAddress;IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$606.TrackPopupMenuEx$FUNC, false
    );
    static final FunctionDescriptor GetMenuInfo$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetMenuInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetMenuInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$606.GetMenuInfo$FUNC, false
    );
    static final FunctionDescriptor SetMenuInfo$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetMenuInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetMenuInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$606.SetMenuInfo$FUNC, false
    );
    static final FunctionDescriptor EndMenu$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle EndMenu$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EndMenu",
        "()I",
        constants$606.EndMenu$FUNC, false
    );
    static final FunctionDescriptor CalculatePopupWindowPosition$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CalculatePopupWindowPosition$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CalculatePopupWindowPosition",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$606.CalculatePopupWindowPosition$FUNC, false
    );
}


