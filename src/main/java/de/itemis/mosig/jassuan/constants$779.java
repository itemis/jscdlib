// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$779 {

    static final FunctionDescriptor RpcStringFreeW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcStringFreeW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcStringFreeW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$779.RpcStringFreeW$FUNC, false
    );
    static final FunctionDescriptor RpcIfInqId$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcIfInqId$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcIfInqId",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$779.RpcIfInqId$FUNC, false
    );
    static final FunctionDescriptor RpcNetworkIsProtseqValidA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNetworkIsProtseqValidA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNetworkIsProtseqValidA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$779.RpcNetworkIsProtseqValidA$FUNC, false
    );
    static final FunctionDescriptor RpcNetworkIsProtseqValidW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcNetworkIsProtseqValidW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcNetworkIsProtseqValidW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$779.RpcNetworkIsProtseqValidW$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtInqComTimeout$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcMgmtInqComTimeout$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtInqComTimeout",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$779.RpcMgmtInqComTimeout$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtSetComTimeout$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle RpcMgmtSetComTimeout$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtSetComTimeout",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$779.RpcMgmtSetComTimeout$FUNC, false
    );
}


