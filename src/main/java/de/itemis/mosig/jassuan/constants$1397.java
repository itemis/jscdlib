// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1397 {

    static final FunctionDescriptor _gpgrt_putc_overflow$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle _gpgrt_putc_overflow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_gpgrt_putc_overflow",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1397._gpgrt_putc_overflow$FUNC, false
    );
    static final FunctionDescriptor gpgrt_ungetc$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gpgrt_ungetc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_ungetc",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1397.gpgrt_ungetc$FUNC, false
    );
    static final FunctionDescriptor gpgrt_read$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle gpgrt_read$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_read",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1397.gpgrt_read$FUNC, false
    );
    static final FunctionDescriptor gpgrt_write$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle gpgrt_write$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_write",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1397.gpgrt_write$FUNC, false
    );
    static final FunctionDescriptor gpgrt_write_sanitized$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_write_sanitized$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_write_sanitized",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1397.gpgrt_write_sanitized$FUNC, false
    );
    static final FunctionDescriptor gpgrt_write_hexstring$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gpgrt_write_hexstring$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_write_hexstring",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1397.gpgrt_write_hexstring$FUNC, false
    );
}


