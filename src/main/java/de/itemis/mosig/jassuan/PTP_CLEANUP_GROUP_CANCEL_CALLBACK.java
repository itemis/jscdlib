// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PTP_CLEANUP_GROUP_CANCEL_CALLBACK {

    void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(PTP_CLEANUP_GROUP_CANCEL_CALLBACK fi) {
        return RuntimeHelper.upcallStub(PTP_CLEANUP_GROUP_CANCEL_CALLBACK.class, fi, constants$282.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(PTP_CLEANUP_GROUP_CANCEL_CALLBACK fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PTP_CLEANUP_GROUP_CANCEL_CALLBACK.class, fi, constants$282.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static PTP_CLEANUP_GROUP_CANCEL_CALLBACK ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                constants$282.PTP_CLEANUP_GROUP_CANCEL_CALLBACK$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


