// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$104 {

    static final FunctionDescriptor _getdllprocaddr$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle _getdllprocaddr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_getdllprocaddr",
        "(JLjdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$104._getdllprocaddr$FUNC, false
    );
    static final FunctionDescriptor getpid$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle getpid$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "getpid",
        "()I",
        constants$104.getpid$FUNC, false
    );
    static final FunctionDescriptor cwait$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle cwait$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "cwait",
        "(Ljdk/incubator/foreign/MemoryAddress;JI)J",
        constants$104.cwait$FUNC, false
    );
    static final FunctionDescriptor execl$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle execl$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "execl",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)J",
        constants$104.execl$FUNC, true
    );
    static final FunctionDescriptor execle$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle execle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "execle",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)J",
        constants$104.execle$FUNC, true
    );
    static final FunctionDescriptor execlp$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle execlp$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "execlp",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)J",
        constants$104.execlp$FUNC, true
    );
}


