// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$548 {

    static final FunctionDescriptor EDITWORDBREAKPROCW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle EDITWORDBREAKPROCW$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$548.EDITWORDBREAKPROCW$FUNC, false
    );
    static final FunctionDescriptor DRAWSTATEPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_INT,
        C_INT
    );
    static final MethodHandle DRAWSTATEPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JJII)I",
        constants$548.DRAWSTATEPROC$FUNC, false
    );
    static final FunctionDescriptor PROPENUMPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PROPENUMPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$548.PROPENUMPROC$FUNC, false
    );
    static final FunctionDescriptor PROPENUMPROCEX$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
}


