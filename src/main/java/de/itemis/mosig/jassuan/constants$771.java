// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$771 {

    static final FunctionDescriptor mmioSetBuffer$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT
    );
    static final MethodHandle mmioSetBuffer$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mmioSetBuffer",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$771.mmioSetBuffer$FUNC, false
    );
    static final FunctionDescriptor mmioFlush$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle mmioFlush$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mmioFlush",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$771.mmioFlush$FUNC, false
    );
    static final FunctionDescriptor mmioAdvance$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle mmioAdvance$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mmioAdvance",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$771.mmioAdvance$FUNC, false
    );
    static final FunctionDescriptor mmioSendMessage$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle mmioSendMessage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mmioSendMessage",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$771.mmioSendMessage$FUNC, false
    );
    static final FunctionDescriptor mmioDescend$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle mmioDescend$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mmioDescend",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$771.mmioDescend$FUNC, false
    );
    static final FunctionDescriptor mmioAscend$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle mmioAscend$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mmioAscend",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$771.mmioAscend$FUNC, false
    );
}


