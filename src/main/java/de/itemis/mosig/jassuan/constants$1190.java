// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1190 {

    static final FunctionDescriptor CoInternetCompareUrl$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CoInternetCompareUrl$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoInternetCompareUrl",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1190.CoInternetCompareUrl$FUNC, false
    );
    static final FunctionDescriptor CoInternetGetProtocolFlags$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CoInternetGetProtocolFlags$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoInternetGetProtocolFlags",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1190.CoInternetGetProtocolFlags$FUNC, false
    );
    static final FunctionDescriptor CoInternetQueryInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CoInternetQueryInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoInternetQueryInfo",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$1190.CoInternetQueryInfo$FUNC, false
    );
    static final FunctionDescriptor CoInternetGetSession$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CoInternetGetSession$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoInternetGetSession",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$1190.CoInternetGetSession$FUNC, false
    );
    static final FunctionDescriptor CoInternetGetSecurityUrl$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle CoInternetGetSecurityUrl$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoInternetGetSecurityUrl",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$1190.CoInternetGetSecurityUrl$FUNC, false
    );
    static final FunctionDescriptor AsyncInstallDistributionUnit$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle AsyncInstallDistributionUnit$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AsyncInstallDistributionUnit",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1190.AsyncInstallDistributionUnit$FUNC, false
    );
}


