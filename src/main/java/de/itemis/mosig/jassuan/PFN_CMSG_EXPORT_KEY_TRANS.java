// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface PFN_CMSG_EXPORT_KEY_TRANS {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
    static MemoryAddress allocate(PFN_CMSG_EXPORT_KEY_TRANS fi) {
        return RuntimeHelper.upcallStub(PFN_CMSG_EXPORT_KEY_TRANS.class, fi, constants$871.PFN_CMSG_EXPORT_KEY_TRANS$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(PFN_CMSG_EXPORT_KEY_TRANS fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(PFN_CMSG_EXPORT_KEY_TRANS.class, fi, constants$871.PFN_CMSG_EXPORT_KEY_TRANS$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static PFN_CMSG_EXPORT_KEY_TRANS ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
            try {
                return (int)constants$872.PFN_CMSG_EXPORT_KEY_TRANS$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


