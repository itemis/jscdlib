// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$476 {

    static final FunctionDescriptor GetEnabledXStateFeatures$FUNC = FunctionDescriptor.of(C_LONG_LONG);
    static final MethodHandle GetEnabledXStateFeatures$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetEnabledXStateFeatures",
        "()J",
        constants$476.GetEnabledXStateFeatures$FUNC, false
    );
    static final FunctionDescriptor GetXStateFeaturesMask$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetXStateFeaturesMask$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetXStateFeaturesMask",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$476.GetXStateFeaturesMask$FUNC, false
    );
    static final FunctionDescriptor LocateXStateFeature$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle LocateXStateFeature$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LocateXStateFeature",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$476.LocateXStateFeature$FUNC, false
    );
    static final FunctionDescriptor SetXStateFeaturesMask$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle SetXStateFeaturesMask$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetXStateFeaturesMask",
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$476.SetXStateFeaturesMask$FUNC, false
    );
    static final FunctionDescriptor EnableThreadProfiling$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle EnableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnableThreadProfiling",
        "(Ljdk/incubator/foreign/MemoryAddress;IJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$476.EnableThreadProfiling$FUNC, false
    );
    static final FunctionDescriptor DisableThreadProfiling$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle DisableThreadProfiling$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DisableThreadProfiling",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$476.DisableThreadProfiling$FUNC, false
    );
}


