// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public interface assuan_register_pre_cmd_notify$fnc {

    int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
    static MemoryAddress allocate(assuan_register_pre_cmd_notify$fnc fi) {
        return RuntimeHelper.upcallStub(assuan_register_pre_cmd_notify$fnc.class, fi, constants$1417.assuan_register_pre_cmd_notify$fnc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
    }
    static MemoryAddress allocate(assuan_register_pre_cmd_notify$fnc fi, ResourceScope scope) {
        return RuntimeHelper.upcallStub(assuan_register_pre_cmd_notify$fnc.class, fi, constants$1417.assuan_register_pre_cmd_notify$fnc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
    }
    static assuan_register_pre_cmd_notify$fnc ofAddress(MemoryAddress addr) {
        return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
            try {
                return (int)constants$1417.assuan_register_pre_cmd_notify$fnc$MH.invokeExact((Addressable)addr, x0, x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


