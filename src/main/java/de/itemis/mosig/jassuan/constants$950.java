// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$950 {

    static final FunctionDescriptor NdrConformantVaryingStructFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrConformantVaryingStructFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConformantVaryingStructFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$950.NdrConformantVaryingStructFree$FUNC, false
    );
    static final FunctionDescriptor NdrComplexStructFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrComplexStructFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrComplexStructFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$950.NdrComplexStructFree$FUNC, false
    );
    static final FunctionDescriptor NdrFixedArrayFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrFixedArrayFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrFixedArrayFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$950.NdrFixedArrayFree$FUNC, false
    );
    static final FunctionDescriptor NdrConformantArrayFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrConformantArrayFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConformantArrayFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$950.NdrConformantArrayFree$FUNC, false
    );
    static final FunctionDescriptor NdrConformantVaryingArrayFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrConformantVaryingArrayFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrConformantVaryingArrayFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$950.NdrConformantVaryingArrayFree$FUNC, false
    );
    static final FunctionDescriptor NdrVaryingArrayFree$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle NdrVaryingArrayFree$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NdrVaryingArrayFree",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$950.NdrVaryingArrayFree$FUNC, false
    );
}


