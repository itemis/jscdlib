// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface ENUMRESLANGPROCW {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, short x3, long x4);
    static MemoryAddress allocate(ENUMRESLANGPROCW fi) {
        return RuntimeHelper.upcallStub(ENUMRESLANGPROCW.class, fi, constants$314.ENUMRESLANGPROCW$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;SJ)I");
    }
    static MemoryAddress allocate(ENUMRESLANGPROCW fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(ENUMRESLANGPROCW.class, fi, constants$314.ENUMRESLANGPROCW$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;SJ)I", scope);
    }
    static ENUMRESLANGPROCW ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, short x3, long x4) -> {
            try {
                return (int)constants$314.ENUMRESLANGPROCW$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


