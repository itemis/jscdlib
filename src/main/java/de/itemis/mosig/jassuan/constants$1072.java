// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1072 {

    static final FunctionDescriptor ITypeInfo_GetTypeAttr_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetTypeAttr_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetTypeAttr_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1072.ITypeInfo_GetTypeAttr_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetTypeAttr_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetTypeAttr_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetTypeAttr_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1072.ITypeInfo_GetTypeAttr_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetFuncDesc_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetFuncDesc_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetFuncDesc_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1072.ITypeInfo_GetFuncDesc_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetFuncDesc_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetFuncDesc_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetFuncDesc_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1072.ITypeInfo_GetFuncDesc_Stub$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetVarDesc_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetVarDesc_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetVarDesc_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1072.ITypeInfo_GetVarDesc_Proxy$FUNC, false
    );
    static final FunctionDescriptor ITypeInfo_GetVarDesc_Stub$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ITypeInfo_GetVarDesc_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ITypeInfo_GetVarDesc_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1072.ITypeInfo_GetVarDesc_Stub$FUNC, false
    );
}


