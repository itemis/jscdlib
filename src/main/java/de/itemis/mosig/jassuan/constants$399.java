// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$399 {

    static final FunctionDescriptor SetThreadIdealProcessor$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetThreadIdealProcessor$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadIdealProcessor",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$399.SetThreadIdealProcessor$FUNC, false
    );
    static final FunctionDescriptor CreateFiberEx$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CreateFiberEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateFiberEx",
        "(JJILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$399.CreateFiberEx$FUNC, false
    );
    static final FunctionDescriptor DeleteFiber$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle DeleteFiber$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DeleteFiber",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$399.DeleteFiber$FUNC, false
    );
    static final FunctionDescriptor SwitchToFiber$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle SwitchToFiber$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SwitchToFiber",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$399.SwitchToFiber$FUNC, false
    );
    static final FunctionDescriptor ConvertFiberToThread$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle ConvertFiberToThread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ConvertFiberToThread",
        "()I",
        constants$399.ConvertFiberToThread$FUNC, false
    );
    static final FunctionDescriptor ConvertThreadToFiberEx$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle ConvertThreadToFiberEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ConvertThreadToFiberEx",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$399.ConvertThreadToFiberEx$FUNC, false
    );
}


