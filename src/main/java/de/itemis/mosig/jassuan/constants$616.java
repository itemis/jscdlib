// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$616 {

    static final FunctionDescriptor ScrollWindowEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ScrollWindowEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ScrollWindowEx",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$616.ScrollWindowEx$FUNC, false
    );
    static final FunctionDescriptor SetScrollPos$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle SetScrollPos$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetScrollPos",
        "(Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$616.SetScrollPos$FUNC, false
    );
    static final FunctionDescriptor GetScrollPos$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GetScrollPos$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetScrollPos",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$616.GetScrollPos$FUNC, false
    );
    static final FunctionDescriptor SetScrollRange$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle SetScrollRange$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetScrollRange",
        "(Ljdk/incubator/foreign/MemoryAddress;IIII)I",
        constants$616.SetScrollRange$FUNC, false
    );
    static final FunctionDescriptor GetScrollRange$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetScrollRange$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetScrollRange",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$616.GetScrollRange$FUNC, false
    );
    static final FunctionDescriptor ShowScrollBar$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle ShowScrollBar$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ShowScrollBar",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$616.ShowScrollBar$FUNC, false
    );
}


