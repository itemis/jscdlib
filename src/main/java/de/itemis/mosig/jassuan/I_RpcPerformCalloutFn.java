// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface I_RpcPerformCalloutFn {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
    static MemoryAddress allocate(I_RpcPerformCalloutFn fi) {
        return RuntimeHelper.upcallStub(I_RpcPerformCalloutFn.class, fi, constants$812.I_RpcPerformCalloutFn$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
    }
    static MemoryAddress allocate(I_RpcPerformCalloutFn fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(I_RpcPerformCalloutFn.class, fi, constants$812.I_RpcPerformCalloutFn$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
    }
    static I_RpcPerformCalloutFn ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
            try {
                return (int)constants$812.I_RpcPerformCalloutFn$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


