// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface RPC_DISPATCH_FUNCTION {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(RPC_DISPATCH_FUNCTION fi) {
        return RuntimeHelper.upcallStub(RPC_DISPATCH_FUNCTION.class, fi, constants$798.RPC_DISPATCH_FUNCTION$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(RPC_DISPATCH_FUNCTION fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(RPC_DISPATCH_FUNCTION.class, fi, constants$798.RPC_DISPATCH_FUNCTION$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static RPC_DISPATCH_FUNCTION ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$798.RPC_DISPATCH_FUNCTION$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


