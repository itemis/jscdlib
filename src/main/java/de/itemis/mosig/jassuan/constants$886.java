// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$886 {

    static final FunctionDescriptor CertEnumCertificateContextProperties$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertEnumCertificateContextProperties$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertEnumCertificateContextProperties",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$886.CertEnumCertificateContextProperties$FUNC, false
    );
    static final FunctionDescriptor CertDeleteCertificateFromStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle CertDeleteCertificateFromStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertDeleteCertificateFromStore",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$886.CertDeleteCertificateFromStore$FUNC, false
    );
    static final FunctionDescriptor CertCreateCTLEntryFromCertificateContextProperties$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertCreateCTLEntryFromCertificateContextProperties$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertCreateCTLEntryFromCertificateContextProperties",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$886.CertCreateCTLEntryFromCertificateContextProperties$FUNC, false
    );
    static final FunctionDescriptor CertSetCertificateContextPropertiesFromCTLEntry$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertSetCertificateContextPropertiesFromCTLEntry$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertSetCertificateContextPropertiesFromCTLEntry",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$886.CertSetCertificateContextPropertiesFromCTLEntry$FUNC, false
    );
    static final FunctionDescriptor CertGetCRLFromStore$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetCRLFromStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetCRLFromStore",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$886.CertGetCRLFromStore$FUNC, false
    );
    static final FunctionDescriptor CertCreateCRLContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CertCreateCRLContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertCreateCRLContext",
        "(ILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$886.CertCreateCRLContext$FUNC, false
    );
}


