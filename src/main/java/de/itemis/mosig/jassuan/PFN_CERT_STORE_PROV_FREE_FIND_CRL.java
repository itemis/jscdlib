// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CERT_STORE_PROV_FREE_FIND_CRL {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_FREE_FIND_CRL fi) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_FREE_FIND_CRL.class, fi, constants$881.PFN_CERT_STORE_PROV_FREE_FIND_CRL$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
    }
    static MemoryAddress allocate(PFN_CERT_STORE_PROV_FREE_FIND_CRL fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CERT_STORE_PROV_FREE_FIND_CRL.class, fi, constants$881.PFN_CERT_STORE_PROV_FREE_FIND_CRL$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static PFN_CERT_STORE_PROV_FREE_FIND_CRL ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
            try {
                return (int)constants$881.PFN_CERT_STORE_PROV_FREE_FIND_CRL$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


