// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$848 {

    static final FunctionDescriptor CryptDuplicateHash$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CryptDuplicateHash$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptDuplicateHash",
        "(JLjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$848.CryptDuplicateHash$FUNC, false
    );
    static final FunctionDescriptor GetEncSChannel$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetEncSChannel$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetEncSChannel",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$848.GetEncSChannel$FUNC, false
    );
    static final FunctionDescriptor BCryptOpenAlgorithmProvider$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle BCryptOpenAlgorithmProvider$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptOpenAlgorithmProvider",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$848.BCryptOpenAlgorithmProvider$FUNC, false
    );
    static final FunctionDescriptor BCryptEnumAlgorithms$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle BCryptEnumAlgorithms$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptEnumAlgorithms",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$848.BCryptEnumAlgorithms$FUNC, false
    );
    static final FunctionDescriptor BCryptEnumProviders$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle BCryptEnumProviders$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptEnumProviders",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$848.BCryptEnumProviders$FUNC, false
    );
    static final FunctionDescriptor BCryptGetProperty$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle BCryptGetProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "BCryptGetProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$848.BCryptGetProperty$FUNC, false
    );
}


