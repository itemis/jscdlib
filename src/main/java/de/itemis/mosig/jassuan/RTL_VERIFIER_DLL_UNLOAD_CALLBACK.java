// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface RTL_VERIFIER_DLL_UNLOAD_CALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, jdk.incubator.foreign.MemoryAddress x3);
    static MemoryAddress allocate(RTL_VERIFIER_DLL_UNLOAD_CALLBACK fi) {
        return RuntimeHelper.upcallStub(RTL_VERIFIER_DLL_UNLOAD_CALLBACK.class, fi, constants$280.RTL_VERIFIER_DLL_UNLOAD_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(RTL_VERIFIER_DLL_UNLOAD_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(RTL_VERIFIER_DLL_UNLOAD_CALLBACK.class, fi, constants$280.RTL_VERIFIER_DLL_UNLOAD_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static RTL_VERIFIER_DLL_UNLOAD_CALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, long x2, jdk.incubator.foreign.MemoryAddress x3) -> {
            try {
                constants$280.RTL_VERIFIER_DLL_UNLOAD_CALLBACK$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


