// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$887 {

    static final FunctionDescriptor CertSetCRLContextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertSetCRLContextProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertSetCRLContextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$887.CertSetCRLContextProperty$FUNC, false
    );
    static final FunctionDescriptor CertGetCRLContextProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetCRLContextProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetCRLContextProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$887.CertGetCRLContextProperty$FUNC, false
    );
    static final FunctionDescriptor CertEnumCRLContextProperties$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertEnumCRLContextProperties$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertEnumCRLContextProperties",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$887.CertEnumCRLContextProperties$FUNC, false
    );
    static final FunctionDescriptor CertFindCertificateInCRL$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertFindCertificateInCRL$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertFindCertificateInCRL",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$887.CertFindCertificateInCRL$FUNC, false
    );
    static final FunctionDescriptor CertIsValidCRLForCertificate$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertIsValidCRLForCertificate$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertIsValidCRLForCertificate",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$887.CertIsValidCRLForCertificate$FUNC, false
    );
    static final FunctionDescriptor CertAddEncodedCertificateToStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertAddEncodedCertificateToStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertAddEncodedCertificateToStore",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$887.CertAddEncodedCertificateToStore$FUNC, false
    );
}


