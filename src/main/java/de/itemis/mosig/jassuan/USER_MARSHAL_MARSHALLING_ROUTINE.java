// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface USER_MARSHAL_MARSHALLING_ROUTINE {

    jdk.incubator.foreign.MemoryAddress apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
    static MemoryAddress allocate(USER_MARSHAL_MARSHALLING_ROUTINE fi) {
        return RuntimeHelper.upcallStub(USER_MARSHAL_MARSHALLING_ROUTINE.class, fi, constants$930.USER_MARSHAL_MARSHALLING_ROUTINE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(USER_MARSHAL_MARSHALLING_ROUTINE fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(USER_MARSHAL_MARSHALLING_ROUTINE.class, fi, constants$930.USER_MARSHAL_MARSHALLING_ROUTINE$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static USER_MARSHAL_MARSHALLING_ROUTINE ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$930.USER_MARSHAL_MARSHALLING_ROUTINE$MH.invokeExact((Addressable)addr, x0, x1, x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


