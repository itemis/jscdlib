// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$442 {

    static final FunctionDescriptor GetNamedPipeHandleStateW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetNamedPipeHandleStateW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetNamedPipeHandleStateW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$442.GetNamedPipeHandleStateW$FUNC, false
    );
    static final FunctionDescriptor ReplaceFileA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ReplaceFileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ReplaceFileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$442.ReplaceFileA$FUNC, false
    );
    static final FunctionDescriptor ReplaceFileW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ReplaceFileW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ReplaceFileW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$442.ReplaceFileW$FUNC, false
    );
    static final FunctionDescriptor CreateHardLinkA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateHardLinkA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateHardLinkA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$442.CreateHardLinkA$FUNC, false
    );
    static final FunctionDescriptor CreateHardLinkW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateHardLinkW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateHardLinkW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$442.CreateHardLinkW$FUNC, false
    );
    static final FunctionDescriptor CreateHardLinkTransactedA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateHardLinkTransactedA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateHardLinkTransactedA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$442.CreateHardLinkTransactedA$FUNC, false
    );
}


