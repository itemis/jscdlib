// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PGET_RUNTIME_FUNCTION_CALLBACK {

    jdk.incubator.foreign.MemoryAddress apply(long x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PGET_RUNTIME_FUNCTION_CALLBACK fi) {
        return RuntimeHelper.upcallStub(PGET_RUNTIME_FUNCTION_CALLBACK.class, fi, constants$249.PGET_RUNTIME_FUNCTION_CALLBACK$FUNC, "(JLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PGET_RUNTIME_FUNCTION_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PGET_RUNTIME_FUNCTION_CALLBACK.class, fi, constants$249.PGET_RUNTIME_FUNCTION_CALLBACK$FUNC, "(JLjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PGET_RUNTIME_FUNCTION_CALLBACK ofAddress(MemoryAddress addr) {
        return (long x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$249.PGET_RUNTIME_FUNCTION_CALLBACK$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


