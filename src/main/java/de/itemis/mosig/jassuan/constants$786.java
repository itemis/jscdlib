// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$786 {

    static final FunctionDescriptor RpcMgmtStopServerListening$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle RpcMgmtStopServerListening$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtStopServerListening",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$786.RpcMgmtStopServerListening$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtWaitServerListen$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle RpcMgmtWaitServerListen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtWaitServerListen",
        "()I",
        constants$786.RpcMgmtWaitServerListen$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtSetServerStackSize$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle RpcMgmtSetServerStackSize$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtSetServerStackSize",
        "(I)I",
        constants$786.RpcMgmtSetServerStackSize$FUNC, false
    );
    static final FunctionDescriptor RpcSsDontSerializeContext$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle RpcSsDontSerializeContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcSsDontSerializeContext",
        "()V",
        constants$786.RpcSsDontSerializeContext$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtEnableIdleCleanup$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle RpcMgmtEnableIdleCleanup$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtEnableIdleCleanup",
        "()I",
        constants$786.RpcMgmtEnableIdleCleanup$FUNC, false
    );
    static final FunctionDescriptor RpcMgmtInqIfIds$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RpcMgmtInqIfIds$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RpcMgmtInqIfIds",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$786.RpcMgmtInqIfIds$FUNC, false
    );
}


