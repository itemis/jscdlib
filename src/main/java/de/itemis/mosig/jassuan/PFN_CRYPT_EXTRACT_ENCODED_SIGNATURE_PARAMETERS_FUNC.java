// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC {

    int apply(int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC fi) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC.class, fi, constants$897.PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC.class, fi, constants$897.PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$FUNC, "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC ofAddress(MemoryAddress addr) {
        return (int x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                return (int)constants$897.PFN_CRYPT_EXTRACT_ENCODED_SIGNATURE_PARAMETERS_FUNC$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


