// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$526 {

    static final FunctionDescriptor StartDocW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle StartDocW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "StartDocW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$526.StartDocW$FUNC, false
    );
    static final FunctionDescriptor EndDoc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle EndDoc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EndDoc",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$526.EndDoc$FUNC, false
    );
    static final FunctionDescriptor StartPage$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle StartPage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "StartPage",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$526.StartPage$FUNC, false
    );
    static final FunctionDescriptor EndPage$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle EndPage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EndPage",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$526.EndPage$FUNC, false
    );
    static final FunctionDescriptor AbortDoc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle AbortDoc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "AbortDoc",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$526.AbortDoc$FUNC, false
    );
    static final FunctionDescriptor SetAbortProc$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetAbortProc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetAbortProc",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$526.SetAbortProc$FUNC, false
    );
}


