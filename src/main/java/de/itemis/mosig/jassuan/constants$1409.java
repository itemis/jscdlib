// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1409 {

    static final FunctionDescriptor _gpgrt_log_assert$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _gpgrt_log_assert$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_gpgrt_log_assert",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)V",
        constants$1409._gpgrt_log_assert$FUNC, false
    );
    static final FunctionDescriptor gpgrt_argparse$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_argparse$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_argparse",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1409.gpgrt_argparse$FUNC, false
    );
    static final FunctionDescriptor gpgrt_argparser$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_argparser$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_argparser",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1409.gpgrt_argparser$FUNC, false
    );
    static final FunctionDescriptor gpgrt_usage$FUNC = FunctionDescriptor.ofVoid(
        C_INT
    );
    static final MethodHandle gpgrt_usage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_usage",
        "(I)V",
        constants$1409.gpgrt_usage$FUNC, false
    );
    static final FunctionDescriptor gpgrt_strusage$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle gpgrt_strusage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_strusage",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1409.gpgrt_strusage$FUNC, false
    );
    static final FunctionDescriptor gpgrt_set_strusage$f$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
}


