// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1406 {

    static final FunctionDescriptor gpgrt_log_get_prefix$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_log_get_prefix$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_log_get_prefix",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1406.gpgrt_log_get_prefix$FUNC, false
    );
    static final FunctionDescriptor gpgrt_log_test_fd$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle gpgrt_log_test_fd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_log_test_fd",
        "(I)I",
        constants$1406.gpgrt_log_test_fd$FUNC, false
    );
    static final FunctionDescriptor gpgrt_log_get_fd$FUNC = FunctionDescriptor.of(C_INT);
    static final MethodHandle gpgrt_log_get_fd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_log_get_fd",
        "()I",
        constants$1406.gpgrt_log_get_fd$FUNC, false
    );
    static final FunctionDescriptor gpgrt_log_get_stream$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle gpgrt_log_get_stream$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_log_get_stream",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$1406.gpgrt_log_get_stream$FUNC, false
    );
    static final FunctionDescriptor gpgrt_log$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER
    );
    static final MethodHandle gpgrt_log$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_log",
        "(ILjdk/incubator/foreign/MemoryAddress;[Ljava/lang/Object;)V",
        constants$1406.gpgrt_log$FUNC, true
    );
    static final FunctionDescriptor gpgrt_logv$FUNC = FunctionDescriptor.ofVoid(
        C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_logv$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_logv",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1406.gpgrt_logv$FUNC, false
    );
}


