// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$964 {

    static final FunctionDescriptor NdrFullPointerXlatInit$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle NdrFullPointerXlatInit$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFullPointerXlatInit",
        "(II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$964.NdrFullPointerXlatInit$FUNC, false
    );
    static final FunctionDescriptor NdrFullPointerXlatFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle NdrFullPointerXlatFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFullPointerXlatFree",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$964.NdrFullPointerXlatFree$FUNC, false
    );
    static final FunctionDescriptor NdrFullPointerQueryPointer$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle NdrFullPointerQueryPointer$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFullPointerQueryPointer",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;BLjdk/incubator/foreign/MemoryAddress;)I",
        constants$964.NdrFullPointerQueryPointer$FUNC, false
    );
    static final FunctionDescriptor NdrFullPointerQueryRefId$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_CHAR,
        C_POINTER
    );
    static final MethodHandle NdrFullPointerQueryRefId$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFullPointerQueryRefId",
        "(Ljdk/incubator/foreign/MemoryAddress;IBLjdk/incubator/foreign/MemoryAddress;)I",
        constants$964.NdrFullPointerQueryRefId$FUNC, false
    );
    static final FunctionDescriptor NdrFullPointerInsertRefId$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle NdrFullPointerInsertRefId$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFullPointerInsertRefId",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$964.NdrFullPointerInsertRefId$FUNC, false
    );
    static final FunctionDescriptor NdrFullPointerFree$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrFullPointerFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFullPointerFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$964.NdrFullPointerFree$FUNC, false
    );
}


