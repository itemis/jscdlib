// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface NDR_NOTIFY2_ROUTINE {

    void apply(byte x0);
    static MemoryAddress allocate(NDR_NOTIFY2_ROUTINE fi) {
        return RuntimeHelper.upcallStub(NDR_NOTIFY2_ROUTINE.class, fi, constants$926.NDR_NOTIFY2_ROUTINE$FUNC, "(B)V");
    }
    static MemoryAddress allocate(NDR_NOTIFY2_ROUTINE fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(NDR_NOTIFY2_ROUTINE.class, fi, constants$926.NDR_NOTIFY2_ROUTINE$FUNC, "(B)V", scope);
    }
    static NDR_NOTIFY2_ROUTINE ofAddress(MemoryAddress addr) {
        return (byte x0) -> {
            try {
                constants$926.NDR_NOTIFY2_ROUTINE$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


