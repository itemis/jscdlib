// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface LPMIDICALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3, long x4);
    static MemoryAddress allocate(LPMIDICALLBACK fi) {
        return RuntimeHelper.upcallStub(LPMIDICALLBACK.class, fi, constants$753.LPMIDICALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJJ)V");
    }
    static MemoryAddress allocate(LPMIDICALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(LPMIDICALLBACK.class, fi, constants$753.LPMIDICALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IJJJ)V", scope);
    }
    static LPMIDICALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, long x2, long x3, long x4) -> {
            try {
                constants$754.LPMIDICALLBACK$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


