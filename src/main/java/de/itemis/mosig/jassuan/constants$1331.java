// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1331 {

    static final FunctionDescriptor NotifyBootConfigStatus$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle NotifyBootConfigStatus$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NotifyBootConfigStatus",
        "(I)I",
        constants$1331.NotifyBootConfigStatus$FUNC, false
    );
    static final FunctionDescriptor OpenSCManagerA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle OpenSCManagerA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenSCManagerA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1331.OpenSCManagerA$FUNC, false
    );
    static final FunctionDescriptor OpenSCManagerW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle OpenSCManagerW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenSCManagerW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1331.OpenSCManagerW$FUNC, false
    );
    static final FunctionDescriptor OpenServiceA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle OpenServiceA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenServiceA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1331.OpenServiceA$FUNC, false
    );
    static final FunctionDescriptor OpenServiceW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle OpenServiceW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenServiceW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1331.OpenServiceW$FUNC, false
    );
    static final FunctionDescriptor QueryServiceConfigA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle QueryServiceConfigA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryServiceConfigA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1331.QueryServiceConfigA$FUNC, false
    );
}


