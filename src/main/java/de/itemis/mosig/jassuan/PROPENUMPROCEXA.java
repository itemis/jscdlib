// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PROPENUMPROCEXA {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, long x3);
    static MemoryAddress allocate(PROPENUMPROCEXA fi) {
        return RuntimeHelper.upcallStub(PROPENUMPROCEXA.class, fi, constants$546.PROPENUMPROCEXA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I");
    }
    static MemoryAddress allocate(PROPENUMPROCEXA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PROPENUMPROCEXA.class, fi, constants$546.PROPENUMPROCEXA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
    }
    static PROPENUMPROCEXA ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, long x3) -> {
            try {
                return (int)constants$547.PROPENUMPROCEXA$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


