// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$369 {

    static final FunctionDescriptor InitOnceComplete$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle InitOnceComplete$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitOnceComplete",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$369.InitOnceComplete$FUNC, false
    );
    static final FunctionDescriptor InitializeConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle InitializeConditionVariable$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitializeConditionVariable",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$369.InitializeConditionVariable$FUNC, false
    );
    static final FunctionDescriptor WakeConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle WakeConditionVariable$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WakeConditionVariable",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$369.WakeConditionVariable$FUNC, false
    );
    static final FunctionDescriptor WakeAllConditionVariable$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle WakeAllConditionVariable$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WakeAllConditionVariable",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$369.WakeAllConditionVariable$FUNC, false
    );
    static final FunctionDescriptor SleepConditionVariableCS$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SleepConditionVariableCS$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SleepConditionVariableCS",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$369.SleepConditionVariableCS$FUNC, false
    );
    static final FunctionDescriptor SleepConditionVariableSRW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle SleepConditionVariableSRW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SleepConditionVariableSRW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$369.SleepConditionVariableSRW$FUNC, false
    );
}


