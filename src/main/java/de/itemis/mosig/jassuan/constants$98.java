// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$98 {

    static final FunctionDescriptor _beginthreadex_proc_type$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _beginthreadex_proc_type$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$98._beginthreadex_proc_type$FUNC, false
    );
    static final FunctionDescriptor _beginthread$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _beginthread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_beginthread",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)J",
        constants$98._beginthread$FUNC, false
    );
    static final FunctionDescriptor _beginthreadex$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _beginthreadex$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_beginthreadex",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)J",
        constants$98._beginthreadex$FUNC, false
    );
    static final FunctionDescriptor abort$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle abort$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "abort",
        "()V",
        constants$98.abort$FUNC, false
    );
    static final FunctionDescriptor _tls_callback_type$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_LONG,
        C_POINTER
    );
}


