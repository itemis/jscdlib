// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$824 {

    static final FunctionDescriptor RpcAsyncCancelCall$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle RpcAsyncCancelCall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcAsyncCancelCall",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$824.RpcAsyncCancelCall$FUNC, false
    );
    static final FunctionDescriptor RpcAsyncCleanupThread$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle RpcAsyncCleanupThread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcAsyncCleanupThread",
        "(I)I",
        constants$824.RpcAsyncCleanupThread$FUNC, false
    );
    static final FunctionDescriptor RpcErrorStartEnumeration$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcErrorStartEnumeration$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcErrorStartEnumeration",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$824.RpcErrorStartEnumeration$FUNC, false
    );
    static final FunctionDescriptor RpcErrorGetNextRecord$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle RpcErrorGetNextRecord$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcErrorGetNextRecord",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$824.RpcErrorGetNextRecord$FUNC, false
    );
    static final FunctionDescriptor RpcErrorEndEnumeration$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcErrorEndEnumeration$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcErrorEndEnumeration",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$824.RpcErrorEndEnumeration$FUNC, false
    );
    static final FunctionDescriptor RpcErrorResetEnumeration$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcErrorResetEnumeration$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcErrorResetEnumeration",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$824.RpcErrorResetEnumeration$FUNC, false
    );
}


