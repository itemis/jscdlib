// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface _onexit_t {

    int apply();
    static MemoryAddress allocate(_onexit_t fi) {
        return RuntimeHelper.upcallStub(_onexit_t.class, fi, constants$96._onexit_t$FUNC, "()I");
    }
    static MemoryAddress allocate(_onexit_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(_onexit_t.class, fi, constants$96._onexit_t$FUNC, "()I", scope);
    }
    static _onexit_t ofAddress(MemoryAddress addr) {
        return () -> {
            try {
                return (int)constants$96._onexit_t$MH.invokeExact((Addressable)addr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


