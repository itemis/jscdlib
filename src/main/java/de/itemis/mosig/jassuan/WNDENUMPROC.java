// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface WNDENUMPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(WNDENUMPROC fi) {
        return RuntimeHelper.upcallStub(WNDENUMPROC.class, fi, constants$545.WNDENUMPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I");
    }
    static MemoryAddress allocate(WNDENUMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(WNDENUMPROC.class, fi, constants$545.WNDENUMPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
    }
    static WNDENUMPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                return (int)constants$545.WNDENUMPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


