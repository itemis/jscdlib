// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1398 {

    static final FunctionDescriptor gpgrt_fread$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle gpgrt_fread$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fread",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)J",
        constants$1398.gpgrt_fread$FUNC, false
    );
    static final FunctionDescriptor gpgrt_fwrite$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle gpgrt_fwrite$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fwrite",
        "(Ljdk/incubator/foreign/MemoryAddress;JJLjdk/incubator/foreign/MemoryAddress;)J",
        constants$1398.gpgrt_fwrite$FUNC, false
    );
    static final FunctionDescriptor gpgrt_fgets$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle gpgrt_fgets$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fgets",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1398.gpgrt_fgets$FUNC, false
    );
    static final FunctionDescriptor gpgrt_fputs$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_fputs$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fputs",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1398.gpgrt_fputs$FUNC, false
    );
    static final FunctionDescriptor gpgrt_fputs_unlocked$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_fputs_unlocked$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_fputs_unlocked",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1398.gpgrt_fputs_unlocked$FUNC, false
    );
    static final FunctionDescriptor gpgrt_getline$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle gpgrt_getline$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "gpgrt_getline",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$1398.gpgrt_getline$FUNC, false
    );
}


