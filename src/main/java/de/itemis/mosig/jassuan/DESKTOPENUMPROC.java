// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface DESKTOPENUMPROC {

    int apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
    static MemoryAddress allocate(DESKTOPENUMPROC fi) {
        return RuntimeHelper.upcallStub(DESKTOPENUMPROC.class, fi, constants$551.DESKTOPENUMPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I");
    }
    static MemoryAddress allocate(DESKTOPENUMPROC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(DESKTOPENUMPROC.class, fi, constants$551.DESKTOPENUMPROC$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
    }
    static DESKTOPENUMPROC ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
            try {
                return (int)constants$552.DESKTOPENUMPROC$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


