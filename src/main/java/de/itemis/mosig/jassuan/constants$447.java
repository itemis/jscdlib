// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$447 {

    static final FunctionDescriptor GetOldestEventLogRecord$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetOldestEventLogRecord$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetOldestEventLogRecord",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$447.GetOldestEventLogRecord$FUNC, false
    );
    static final FunctionDescriptor OpenEventLogA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OpenEventLogA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenEventLogA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$447.OpenEventLogA$FUNC, false
    );
    static final FunctionDescriptor OpenEventLogW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OpenEventLogW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenEventLogW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$447.OpenEventLogW$FUNC, false
    );
    static final FunctionDescriptor RegisterEventSourceA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RegisterEventSourceA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegisterEventSourceA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$447.RegisterEventSourceA$FUNC, false
    );
    static final FunctionDescriptor RegisterEventSourceW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RegisterEventSourceW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegisterEventSourceW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$447.RegisterEventSourceW$FUNC, false
    );
    static final FunctionDescriptor OpenBackupEventLogA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle OpenBackupEventLogA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "OpenBackupEventLogA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$447.OpenBackupEventLogA$FUNC, false
    );
}


