// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_FREE_ENCODED_OBJECT_FUNC {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(PFN_FREE_ENCODED_OBJECT_FUNC fi) {
        return RuntimeHelper.upcallStub(PFN_FREE_ENCODED_OBJECT_FUNC.class, fi, constants$912.PFN_FREE_ENCODED_OBJECT_FUNC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PFN_FREE_ENCODED_OBJECT_FUNC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_FREE_ENCODED_OBJECT_FUNC.class, fi, constants$912.PFN_FREE_ENCODED_OBJECT_FUNC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PFN_FREE_ENCODED_OBJECT_FUNC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                constants$913.PFN_FREE_ENCODED_OBJECT_FUNC$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


