// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface gpgrt_cookie_close_function_t {

    int apply(jdk.incubator.foreign.MemoryAddress x0);
    static MemoryAddress allocate(gpgrt_cookie_close_function_t fi) {
        return RuntimeHelper.upcallStub(gpgrt_cookie_close_function_t.class, fi, constants$1388.gpgrt_cookie_close_function_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(gpgrt_cookie_close_function_t fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(gpgrt_cookie_close_function_t.class, fi, constants$1388.gpgrt_cookie_close_function_t$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static gpgrt_cookie_close_function_t ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0) -> {
            try {
                return (int)constants$1388.gpgrt_cookie_close_function_t$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


