// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1055 {

    static final FunctionDescriptor IViewObject_RemoteDraw_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IViewObject_RemoteDraw_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IViewObject_RemoteDraw_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;IIJLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1055.IViewObject_RemoteDraw_Proxy$FUNC, false
    );
    static final FunctionDescriptor IViewObject_RemoteDraw_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IViewObject_RemoteDraw_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IViewObject_RemoteDraw_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1055.IViewObject_RemoteDraw_Stub$FUNC, false
    );
    static final FunctionDescriptor IViewObject_RemoteGetColorSet_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle IViewObject_RemoteGetColorSet_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IViewObject_RemoteGetColorSet_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;IIJLjdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1055.IViewObject_RemoteGetColorSet_Proxy$FUNC, false
    );
    static final FunctionDescriptor IViewObject_RemoteGetColorSet_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IViewObject_RemoteGetColorSet_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IViewObject_RemoteGetColorSet_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1055.IViewObject_RemoteGetColorSet_Stub$FUNC, false
    );
    static final FunctionDescriptor IViewObject_RemoteFreeze_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle IViewObject_RemoteFreeze_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IViewObject_RemoteFreeze_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;IIJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1055.IViewObject_RemoteFreeze_Proxy$FUNC, false
    );
    static final FunctionDescriptor IViewObject_RemoteFreeze_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IViewObject_RemoteFreeze_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IViewObject_RemoteFreeze_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1055.IViewObject_RemoteFreeze_Stub$FUNC, false
    );
}


