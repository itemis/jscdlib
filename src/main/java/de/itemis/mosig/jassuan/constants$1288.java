// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1288 {

    static final FunctionDescriptor SCardDlgExtendedError$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle SCardDlgExtendedError$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardDlgExtendedError",
        "()I",
        constants$1288.SCardDlgExtendedError$FUNC, false
    );
    static final FunctionDescriptor SCardGetTransmitCount$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle SCardGetTransmitCount$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardGetTransmitCount",
        "(JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1288.SCardGetTransmitCount$FUNC, false
    );
    static final FunctionDescriptor SCardReadCacheA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SCardReadCacheA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardReadCacheA",
        "(JLjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1288.SCardReadCacheA$FUNC, false
    );
    static final FunctionDescriptor SCardReadCacheW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SCardReadCacheW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardReadCacheW",
        "(JLjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1288.SCardReadCacheW$FUNC, false
    );
    static final FunctionDescriptor SCardWriteCacheA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SCardWriteCacheA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardWriteCacheA",
        "(JLjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1288.SCardWriteCacheA$FUNC, false
    );
    static final FunctionDescriptor SCardWriteCacheW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SCardWriteCacheW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SCardWriteCacheW",
        "(JLjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1288.SCardWriteCacheW$FUNC, false
    );
}


