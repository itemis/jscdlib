// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface RPC_SECURITY_CALLBACK_FN {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(RPC_SECURITY_CALLBACK_FN fi) {
        return RuntimeHelper.upcallStub(RPC_SECURITY_CALLBACK_FN.class, fi, constants$775.RPC_SECURITY_CALLBACK_FN$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(RPC_SECURITY_CALLBACK_FN fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(RPC_SECURITY_CALLBACK_FN.class, fi, constants$775.RPC_SECURITY_CALLBACK_FN$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static RPC_SECURITY_CALLBACK_FN ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$775.RPC_SECURITY_CALLBACK_FN$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


