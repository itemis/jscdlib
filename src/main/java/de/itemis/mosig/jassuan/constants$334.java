// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$334 {

    static final FunctionDescriptor FreeEnvironmentStringsA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FreeEnvironmentStringsA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FreeEnvironmentStringsA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$334.FreeEnvironmentStringsA$FUNC, false
    );
    static final FunctionDescriptor FreeEnvironmentStringsW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FreeEnvironmentStringsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FreeEnvironmentStringsW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$334.FreeEnvironmentStringsW$FUNC, false
    );
    static final FunctionDescriptor GetEnvironmentVariableA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetEnvironmentVariableA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$334.GetEnvironmentVariableA$FUNC, false
    );
    static final FunctionDescriptor GetEnvironmentVariableW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle GetEnvironmentVariableW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetEnvironmentVariableW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$334.GetEnvironmentVariableW$FUNC, false
    );
    static final FunctionDescriptor SetEnvironmentVariableA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetEnvironmentVariableA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetEnvironmentVariableA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$334.SetEnvironmentVariableA$FUNC, false
    );
    static final FunctionDescriptor SetEnvironmentVariableW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetEnvironmentVariableW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetEnvironmentVariableW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$334.SetEnvironmentVariableW$FUNC, false
    );
}


