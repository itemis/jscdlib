// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$305 {

    static final FunctionDescriptor GetDiskFreeSpaceExA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDiskFreeSpaceExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDiskFreeSpaceExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$305.GetDiskFreeSpaceExA$FUNC, false
    );
    static final FunctionDescriptor GetDiskFreeSpaceExW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDiskFreeSpaceExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetDiskFreeSpaceExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$305.GetDiskFreeSpaceExW$FUNC, false
    );
    static final FunctionDescriptor GetFileAttributesExA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetFileAttributesExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileAttributesExA",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$305.GetFileAttributesExA$FUNC, false
    );
    static final FunctionDescriptor GetFileAttributesExW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetFileAttributesExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetFileAttributesExW",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$305.GetFileAttributesExW$FUNC, false
    );
    static final FunctionDescriptor LockFileEx$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle LockFileEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LockFileEx",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;)I",
        constants$305.LockFileEx$FUNC, false
    );
    static final FunctionDescriptor ReadFile$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ReadFile$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ReadFile",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$305.ReadFile$FUNC, false
    );
}


