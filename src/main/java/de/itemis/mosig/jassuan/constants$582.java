// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$582 {

    static final FunctionDescriptor SetDialogDpiChangeBehavior$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle SetDialogDpiChangeBehavior$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetDialogDpiChangeBehavior",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$582.SetDialogDpiChangeBehavior$FUNC, false
    );
    static final FunctionDescriptor GetDialogDpiChangeBehavior$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle GetDialogDpiChangeBehavior$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDialogDpiChangeBehavior",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$582.GetDialogDpiChangeBehavior$FUNC, false
    );
    static final FunctionDescriptor CallMsgFilterA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CallMsgFilterA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CallMsgFilterA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$582.CallMsgFilterA$FUNC, false
    );
    static final FunctionDescriptor CallMsgFilterW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle CallMsgFilterW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CallMsgFilterW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$582.CallMsgFilterW$FUNC, false
    );
    static final FunctionDescriptor OpenClipboard$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle OpenClipboard$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenClipboard",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$582.OpenClipboard$FUNC, false
    );
    static final FunctionDescriptor CloseClipboard$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle CloseClipboard$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CloseClipboard",
        "()I",
        constants$582.CloseClipboard$FUNC, false
    );
}


