// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1028 {

    static final FunctionDescriptor IDataObject_RemoteGetDataHere_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IDataObject_RemoteGetDataHere_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IDataObject_RemoteGetDataHere_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1028.IDataObject_RemoteGetDataHere_Proxy$FUNC, false
    );
    static final FunctionDescriptor IDataObject_RemoteGetDataHere_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IDataObject_RemoteGetDataHere_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IDataObject_RemoteGetDataHere_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1028.IDataObject_RemoteGetDataHere_Stub$FUNC, false
    );
    static final FunctionDescriptor IDataObject_RemoteSetData_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle IDataObject_RemoteSetData_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IDataObject_RemoteSetData_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1028.IDataObject_RemoteSetData_Proxy$FUNC, false
    );
    static final FunctionDescriptor IDataObject_RemoteSetData_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IDataObject_RemoteSetData_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IDataObject_RemoteSetData_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1028.IDataObject_RemoteSetData_Stub$FUNC, false
    );
    static final FunctionDescriptor IDataObject_GetData_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IDataObject_GetData_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IDataObject_GetData_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1028.IDataObject_GetData_Proxy$FUNC, false
    );
    static final FunctionDescriptor IDataObject_GetData_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IDataObject_GetData_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IDataObject_GetData_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1028.IDataObject_GetData_Stub$FUNC, false
    );
}


