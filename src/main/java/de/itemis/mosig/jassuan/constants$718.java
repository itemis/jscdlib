// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$718 {

    static final FunctionDescriptor InitiateSystemShutdownW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT
    );
    static final MethodHandle InitiateSystemShutdownW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitiateSystemShutdownW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$718.InitiateSystemShutdownW$FUNC, false
    );
    static final FunctionDescriptor AbortSystemShutdownA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle AbortSystemShutdownA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AbortSystemShutdownA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$718.AbortSystemShutdownA$FUNC, false
    );
    static final FunctionDescriptor AbortSystemShutdownW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle AbortSystemShutdownW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AbortSystemShutdownW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$718.AbortSystemShutdownW$FUNC, false
    );
    static final FunctionDescriptor InitiateSystemShutdownExA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle InitiateSystemShutdownExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitiateSystemShutdownExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIII)I",
        constants$718.InitiateSystemShutdownExA$FUNC, false
    );
    static final FunctionDescriptor InitiateSystemShutdownExW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle InitiateSystemShutdownExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitiateSystemShutdownExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IIII)I",
        constants$718.InitiateSystemShutdownExW$FUNC, false
    );
    static final FunctionDescriptor RegSaveKeyExA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle RegSaveKeyExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RegSaveKeyExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$718.RegSaveKeyExA$FUNC, false
    );
}


