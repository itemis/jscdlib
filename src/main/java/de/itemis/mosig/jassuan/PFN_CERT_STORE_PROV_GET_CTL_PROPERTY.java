// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CERT_STORE_PROV_GET_CTL_PROPERTY {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_GET_CTL_PROPERTY fi) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_GET_CTL_PROPERTY.class, fi, constants$882.PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_GET_CTL_PROPERTY fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_GET_CTL_PROPERTY.class, fi, constants$882.PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFN_CERT_STORE_PROV_GET_CTL_PROPERTY ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, int x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
            try {
                return (int)constants$882.PFN_CERT_STORE_PROV_GET_CTL_PROPERTY$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


