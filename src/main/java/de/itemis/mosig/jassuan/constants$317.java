// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$317 {

    static final FunctionDescriptor FreeResource$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FreeResource$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FreeResource",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$317.FreeResource$FUNC, false
    );
    static final FunctionDescriptor LoadLibraryExA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle LoadLibraryExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LoadLibraryExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$317.LoadLibraryExA$FUNC, false
    );
    static final FunctionDescriptor LoadLibraryExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle LoadLibraryExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LoadLibraryExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$317.LoadLibraryExW$FUNC, false
    );
    static final FunctionDescriptor LoadResource$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle LoadResource$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LoadResource",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$317.LoadResource$FUNC, false
    );
    static final FunctionDescriptor LoadStringA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle LoadStringA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LoadStringA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$317.LoadStringA$FUNC, false
    );
    static final FunctionDescriptor LoadStringW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle LoadStringW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LoadStringW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$317.LoadStringW$FUNC, false
    );
}


