// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$877 {

    static final FunctionDescriptor PFN_CERT_STORE_PROV_READ_CRL$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle PFN_CERT_STORE_PROV_READ_CRL$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$877.PFN_CERT_STORE_PROV_READ_CRL$FUNC, false
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_WRITE_CRL$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFN_CERT_STORE_PROV_WRITE_CRL$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$877.PFN_CERT_STORE_PROV_WRITE_CRL$FUNC, false
    );
    static final FunctionDescriptor PFN_CERT_STORE_PROV_DELETE_CRL$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle PFN_CERT_STORE_PROV_DELETE_CRL$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$877.PFN_CERT_STORE_PROV_DELETE_CRL$FUNC, false
    );
}


