// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PGET_SYSTEM_WOW64_DIRECTORY_W {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
    static MemoryAddress allocate(PGET_SYSTEM_WOW64_DIRECTORY_W fi) {
        return RuntimeHelper.upcallStub(PGET_SYSTEM_WOW64_DIRECTORY_W.class, fi, constants$431.PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
    }
    static MemoryAddress allocate(PGET_SYSTEM_WOW64_DIRECTORY_W fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PGET_SYSTEM_WOW64_DIRECTORY_W.class, fi, constants$431.PGET_SYSTEM_WOW64_DIRECTORY_W$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static PGET_SYSTEM_WOW64_DIRECTORY_W ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
            try {
                return (int)constants$431.PGET_SYSTEM_WOW64_DIRECTORY_W$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


