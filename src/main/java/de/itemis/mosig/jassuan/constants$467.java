// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$467 {

    static final FunctionDescriptor SetVolumeMountPointW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetVolumeMountPointW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetVolumeMountPointW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$467.SetVolumeMountPointW$FUNC, false
    );
    static final FunctionDescriptor GetVolumeNameForVolumeMountPointA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetVolumeNameForVolumeMountPointA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetVolumeNameForVolumeMountPointA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$467.GetVolumeNameForVolumeMountPointA$FUNC, false
    );
    static final FunctionDescriptor GetVolumePathNameA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetVolumePathNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetVolumePathNameA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$467.GetVolumePathNameA$FUNC, false
    );
    static final FunctionDescriptor GetVolumePathNamesForVolumeNameA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetVolumePathNamesForVolumeNameA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetVolumePathNamesForVolumeNameA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$467.GetVolumePathNamesForVolumeNameA$FUNC, false
    );
    static final FunctionDescriptor CreateActCtxA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateActCtxA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateActCtxA",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$467.CreateActCtxA$FUNC, false
    );
    static final FunctionDescriptor CreateActCtxW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateActCtxW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateActCtxW",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$467.CreateActCtxW$FUNC, false
    );
}


