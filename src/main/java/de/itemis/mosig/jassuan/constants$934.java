// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$934 {

    static final FunctionDescriptor NdrPointerMarshall$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrPointerMarshall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrPointerMarshall",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.NdrPointerMarshall$FUNC, false
    );
    static final FunctionDescriptor NdrCsArrayMarshall$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrCsArrayMarshall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrCsArrayMarshall",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.NdrCsArrayMarshall$FUNC, false
    );
    static final FunctionDescriptor NdrCsTagMarshall$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrCsTagMarshall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrCsTagMarshall",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.NdrCsTagMarshall$FUNC, false
    );
    static final FunctionDescriptor NdrSimpleStructMarshall$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrSimpleStructMarshall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrSimpleStructMarshall",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.NdrSimpleStructMarshall$FUNC, false
    );
    static final FunctionDescriptor NdrConformantStructMarshall$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrConformantStructMarshall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConformantStructMarshall",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.NdrConformantStructMarshall$FUNC, false
    );
    static final FunctionDescriptor NdrConformantVaryingStructMarshall$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrConformantVaryingStructMarshall$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConformantVaryingStructMarshall",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$934.NdrConformantVaryingStructMarshall$FUNC, false
    );
}


