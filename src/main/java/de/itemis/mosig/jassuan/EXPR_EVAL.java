// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface EXPR_EVAL {

    void apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(EXPR_EVAL fi) {
        return RuntimeHelper.upcallStub(EXPR_EVAL.class, fi, constants$928.EXPR_EVAL$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
    }
    static MemoryAddress allocate(EXPR_EVAL fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(EXPR_EVAL.class, fi, constants$928.EXPR_EVAL$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
    }
    static EXPR_EVAL ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                constants$928.EXPR_EVAL$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


