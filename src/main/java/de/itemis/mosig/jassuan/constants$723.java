// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$723 {

    static final FunctionDescriptor WNetAddConnectionA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle WNetAddConnectionA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetAddConnectionA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$723.WNetAddConnectionA$FUNC, false
    );
    static final FunctionDescriptor WNetAddConnectionW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle WNetAddConnectionW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetAddConnectionW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$723.WNetAddConnectionW$FUNC, false
    );
    static final FunctionDescriptor WNetAddConnection2A$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle WNetAddConnection2A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetAddConnection2A",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$723.WNetAddConnection2A$FUNC, false
    );
    static final FunctionDescriptor WNetAddConnection2W$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle WNetAddConnection2W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetAddConnection2W",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$723.WNetAddConnection2W$FUNC, false
    );
    static final FunctionDescriptor WNetAddConnection3A$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle WNetAddConnection3A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetAddConnection3A",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$723.WNetAddConnection3A$FUNC, false
    );
    static final FunctionDescriptor WNetAddConnection3W$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle WNetAddConnection3W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetAddConnection3W",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$723.WNetAddConnection3W$FUNC, false
    );
}


