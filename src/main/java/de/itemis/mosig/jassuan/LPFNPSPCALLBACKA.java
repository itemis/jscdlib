// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface LPFNPSPCALLBACKA {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(LPFNPSPCALLBACKA fi) {
        return RuntimeHelper.upcallStub(LPFNPSPCALLBACKA.class, fi, constants$1289.LPFNPSPCALLBACKA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(LPFNPSPCALLBACKA fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(LPFNPSPCALLBACKA.class, fi, constants$1289.LPFNPSPCALLBACKA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static LPFNPSPCALLBACKA ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (int)constants$1289.LPFNPSPCALLBACKA$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


