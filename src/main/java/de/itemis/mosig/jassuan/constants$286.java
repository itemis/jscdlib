// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$286 {

    static final FunctionDescriptor FARPROC$FUNC = FunctionDescriptor.of(C_LONG_LONG);
    static final MethodHandle FARPROC$MH = RuntimeHelper.downcallHandle(
        "()J",
        constants$286.FARPROC$FUNC, false
    );
    static final FunctionDescriptor NEARPROC$FUNC = FunctionDescriptor.of(C_LONG_LONG);
    static final MethodHandle NEARPROC$MH = RuntimeHelper.downcallHandle(
        "()J",
        constants$286.NEARPROC$FUNC, false
    );
    static final FunctionDescriptor PROC$FUNC = FunctionDescriptor.of(C_LONG_LONG);
    static final MethodHandle PROC$MH = RuntimeHelper.downcallHandle(
        "()J",
        constants$286.PROC$FUNC, false
    );
    static final FunctionDescriptor LPOVERLAPPED_COMPLETION_ROUTINE$FUNC = FunctionDescriptor.ofVoid(
        C_LONG,
        C_LONG,
        C_POINTER
    );
}


