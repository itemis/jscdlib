// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CMSG_ALLOC {

    jdk.incubator.foreign.MemoryAddress apply(long x0);
    static MemoryAddress allocate(PFN_CMSG_ALLOC fi) {
        return RuntimeHelper.upcallStub(PFN_CMSG_ALLOC.class, fi, constants$869.PFN_CMSG_ALLOC$FUNC, "(J)Ljdk/incubator/foreign/MemoryAddress;");
    }
    static MemoryAddress allocate(PFN_CMSG_ALLOC fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CMSG_ALLOC.class, fi, constants$869.PFN_CMSG_ALLOC$FUNC, "(J)Ljdk/incubator/foreign/MemoryAddress;", scope);
    }
    static PFN_CMSG_ALLOC ofAddress(MemoryAddress addr) {
        return (long x0) -> {
            try {
                return (jdk.incubator.foreign.MemoryAddress)constants$870.PFN_CMSG_ALLOC$MH.invokeExact((Addressable)addr, x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


