// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$91 {

    static final FunctionDescriptor _wsopen_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle _wsopen_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wsopen_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;III)I",
        constants$91._wsopen_s$FUNC, false
    );
    static final FunctionDescriptor _wopen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _wopen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wopen",
        "(Ljdk/incubator/foreign/MemoryAddress;I[Ljava/lang/Object;)I",
        constants$91._wopen$FUNC, true
    );
    static final FunctionDescriptor _wsopen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle _wsopen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wsopen",
        "(Ljdk/incubator/foreign/MemoryAddress;II[Ljava/lang/Object;)I",
        constants$91._wsopen$FUNC, true
    );
    static final FunctionDescriptor __lock_fhandle$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle __lock_fhandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__lock_fhandle",
        "(I)I",
        constants$91.__lock_fhandle$FUNC, false
    );
    static final FunctionDescriptor _unlock_fhandle$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle _unlock_fhandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_unlock_fhandle",
        "(I)V",
        constants$91._unlock_fhandle$FUNC, false
    );
    static final FunctionDescriptor _get_osfhandle$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _get_osfhandle$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_get_osfhandle",
        "(I)J",
        constants$91._get_osfhandle$FUNC, false
    );
}


