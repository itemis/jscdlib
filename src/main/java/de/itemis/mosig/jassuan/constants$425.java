// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$425 {

    static final FunctionDescriptor GlobalFindAtomA$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER
    );
    static final MethodHandle GlobalFindAtomA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GlobalFindAtomA",
        "(Ljdk/incubator/foreign/MemoryAddress;)S",
        constants$425.GlobalFindAtomA$FUNC, false
    );
    static final FunctionDescriptor GlobalFindAtomW$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER
    );
    static final MethodHandle GlobalFindAtomW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GlobalFindAtomW",
        "(Ljdk/incubator/foreign/MemoryAddress;)S",
        constants$425.GlobalFindAtomW$FUNC, false
    );
    static final FunctionDescriptor GlobalGetAtomNameA$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GlobalGetAtomNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GlobalGetAtomNameA",
        "(SLjdk/incubator/foreign/MemoryAddress;I)I",
        constants$425.GlobalGetAtomNameA$FUNC, false
    );
    static final FunctionDescriptor GlobalGetAtomNameW$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle GlobalGetAtomNameW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GlobalGetAtomNameW",
        "(SLjdk/incubator/foreign/MemoryAddress;I)I",
        constants$425.GlobalGetAtomNameW$FUNC, false
    );
    static final FunctionDescriptor AddAtomA$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER
    );
    static final MethodHandle AddAtomA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AddAtomA",
        "(Ljdk/incubator/foreign/MemoryAddress;)S",
        constants$425.AddAtomA$FUNC, false
    );
    static final FunctionDescriptor AddAtomW$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER
    );
    static final MethodHandle AddAtomW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AddAtomW",
        "(Ljdk/incubator/foreign/MemoryAddress;)S",
        constants$425.AddAtomW$FUNC, false
    );
}


