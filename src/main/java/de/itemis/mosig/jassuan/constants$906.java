// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$906 {

    static final FunctionDescriptor CryptHashPublicKeyInfo$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptHashPublicKeyInfo$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptHashPublicKeyInfo",
        "(JIIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$906.CryptHashPublicKeyInfo$FUNC, false
    );
    static final FunctionDescriptor CertRDNValueToStrA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertRDNValueToStrA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertRDNValueToStrA",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$906.CertRDNValueToStrA$FUNC, false
    );
    static final FunctionDescriptor CertRDNValueToStrW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertRDNValueToStrW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertRDNValueToStrW",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$906.CertRDNValueToStrW$FUNC, false
    );
    static final FunctionDescriptor CertNameToStrA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertNameToStrA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertNameToStrA",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$906.CertNameToStrA$FUNC, false
    );
    static final FunctionDescriptor CertNameToStrW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertNameToStrW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertNameToStrW",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$906.CertNameToStrW$FUNC, false
    );
    static final FunctionDescriptor CertStrToNameA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertStrToNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertStrToNameA",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$906.CertStrToNameA$FUNC, false
    );
}


