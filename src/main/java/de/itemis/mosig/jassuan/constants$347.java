// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$347 {

    static final FunctionDescriptor QueryInterruptTimePrecise$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle QueryInterruptTimePrecise$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryInterruptTimePrecise",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$347.QueryInterruptTimePrecise$FUNC, false
    );
    static final FunctionDescriptor QueryUnbiasedInterruptTimePrecise$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle QueryUnbiasedInterruptTimePrecise$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryUnbiasedInterruptTimePrecise",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$347.QueryUnbiasedInterruptTimePrecise$FUNC, false
    );
    static final FunctionDescriptor QueryInterruptTime$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle QueryInterruptTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryInterruptTime",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$347.QueryInterruptTime$FUNC, false
    );
    static final FunctionDescriptor QueryUnbiasedInterruptTime$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle QueryUnbiasedInterruptTime$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryUnbiasedInterruptTime",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$347.QueryUnbiasedInterruptTime$FUNC, false
    );
    static final FunctionDescriptor QueryAuxiliaryCounterFrequency$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle QueryAuxiliaryCounterFrequency$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "QueryAuxiliaryCounterFrequency",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$347.QueryAuxiliaryCounterFrequency$FUNC, false
    );
    static final FunctionDescriptor ConvertAuxiliaryCounterToPerformanceCounter$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ConvertAuxiliaryCounterToPerformanceCounter$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ConvertAuxiliaryCounterToPerformanceCounter",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$347.ConvertAuxiliaryCounterToPerformanceCounter$FUNC, false
    );
}


