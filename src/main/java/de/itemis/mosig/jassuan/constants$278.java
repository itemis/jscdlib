// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$278 {

    static final FunctionDescriptor WORKERCALLBACKFUNC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle WORKERCALLBACKFUNC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$278.WORKERCALLBACKFUNC$FUNC, false
    );
    static final FunctionDescriptor APC_CALLBACK_FUNCTION$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle APC_CALLBACK_FUNCTION$MH = RuntimeHelper.downcallHandle(
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$278.APC_CALLBACK_FUNCTION$FUNC, false
    );
    static final FunctionDescriptor WAITORTIMERCALLBACKFUNC$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle WAITORTIMERCALLBACKFUNC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;B)V",
        constants$278.WAITORTIMERCALLBACKFUNC$FUNC, false
    );
}


