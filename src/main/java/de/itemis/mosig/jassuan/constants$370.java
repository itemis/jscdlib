// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$370 {

    static final FunctionDescriptor CreateMutexExA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CreateMutexExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateMutexExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$370.CreateMutexExA$FUNC, false
    );
    static final FunctionDescriptor CreateMutexExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CreateMutexExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateMutexExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$370.CreateMutexExW$FUNC, false
    );
    static final FunctionDescriptor CreateEventExA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CreateEventExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateEventExA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$370.CreateEventExA$FUNC, false
    );
    static final FunctionDescriptor CreateEventExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CreateEventExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateEventExW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$370.CreateEventExW$FUNC, false
    );
    static final FunctionDescriptor CreateSemaphoreExW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CreateSemaphoreExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateSemaphoreExW",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$370.CreateSemaphoreExW$FUNC, false
    );
    static final FunctionDescriptor PTIMERAPCROUTINE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_LONG
    );
}


