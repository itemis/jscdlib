// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1004 {

    static final FunctionDescriptor CoQueryProxyBlanket$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoQueryProxyBlanket$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoQueryProxyBlanket",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1004.CoQueryProxyBlanket$FUNC, false
    );
    static final FunctionDescriptor CoSetProxyBlanket$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CoSetProxyBlanket$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoSetProxyBlanket",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$1004.CoSetProxyBlanket$FUNC, false
    );
    static final FunctionDescriptor CoCopyProxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoCopyProxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoCopyProxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1004.CoCopyProxy$FUNC, false
    );
    static final FunctionDescriptor CoQueryClientBlanket$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoQueryClientBlanket$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoQueryClientBlanket",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1004.CoQueryClientBlanket$FUNC, false
    );
    static final FunctionDescriptor CoImpersonateClient$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoImpersonateClient$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoImpersonateClient",
        "()I",
        constants$1004.CoImpersonateClient$FUNC, false
    );
    static final FunctionDescriptor CoRevertToSelf$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoRevertToSelf$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRevertToSelf",
        "()I",
        constants$1004.CoRevertToSelf$FUNC, false
    );
}


