// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface gpgrt_mopen$func_free {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(gpgrt_mopen$func_free fi) {
        return RuntimeHelper.upcallStub(gpgrt_mopen$func_free.class, fi, constants$1389.gpgrt_mopen$func_free$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(gpgrt_mopen$func_free fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(gpgrt_mopen$func_free.class, fi, constants$1389.gpgrt_mopen$func_free$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static gpgrt_mopen$func_free ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$1389.gpgrt_mopen$func_free$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


