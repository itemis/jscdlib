// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1041 {

    static final FunctionDescriptor CoRegisterMallocSpy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle CoRegisterMallocSpy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRegisterMallocSpy",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1041.CoRegisterMallocSpy$FUNC, false
    );
    static final FunctionDescriptor CoRevokeMallocSpy$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CoRevokeMallocSpy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRevokeMallocSpy",
        "()I",
        constants$1041.CoRevokeMallocSpy$FUNC, false
    );
    static final FunctionDescriptor CoCreateStandardMalloc$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CoCreateStandardMalloc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoCreateStandardMalloc",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1041.CoCreateStandardMalloc$FUNC, false
    );
    static final FunctionDescriptor CoRegisterInitializeSpy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CoRegisterInitializeSpy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRegisterInitializeSpy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1041.CoRegisterInitializeSpy$FUNC, false
    );
    static final FunctionDescriptor CoRevokeInitializeSpy$FUNC = FunctionDescriptor.of(C_LONG,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER")
    );
    static final MethodHandle CoRevokeInitializeSpy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoRevokeInitializeSpy",
        "(Ljdk/incubator/foreign/MemorySegment;)I",
        constants$1041.CoRevokeInitializeSpy$FUNC, false
    );
    static final FunctionDescriptor CoGetSystemSecurityPermissions$FUNC = FunctionDescriptor.of(C_LONG,
        C_INT,
        C_POINTER
    );
    static final MethodHandle CoGetSystemSecurityPermissions$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CoGetSystemSecurityPermissions",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1041.CoGetSystemSecurityPermissions$FUNC, false
    );
}


