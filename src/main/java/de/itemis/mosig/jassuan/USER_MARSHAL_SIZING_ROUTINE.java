// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface USER_MARSHAL_SIZING_ROUTINE {

    int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(USER_MARSHAL_SIZING_ROUTINE fi) {
        return RuntimeHelper.upcallStub(USER_MARSHAL_SIZING_ROUTINE.class, fi, constants$929.USER_MARSHAL_SIZING_ROUTINE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(USER_MARSHAL_SIZING_ROUTINE fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(USER_MARSHAL_SIZING_ROUTINE.class, fi, constants$929.USER_MARSHAL_SIZING_ROUTINE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static USER_MARSHAL_SIZING_ROUTINE ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (int)constants$929.USER_MARSHAL_SIZING_ROUTINE$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


