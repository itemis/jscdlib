// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$145 {

    static final FunctionDescriptor _mm_setr_pi8$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR,
        C_CHAR
    );
    static final MethodHandle _mm_setr_pi8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_setr_pi8",
        "(BBBBBBBB)J",
        constants$145._mm_setr_pi8$FUNC, false
    );
    static final FunctionDescriptor _itow_s$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _itow_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_itow_s",
        "(ILjdk/incubator/foreign/MemoryAddress;JI)I",
        constants$145._itow_s$FUNC, false
    );
    static final FunctionDescriptor _ltow_s$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _ltow_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_ltow_s",
        "(ILjdk/incubator/foreign/MemoryAddress;JI)I",
        constants$145._ltow_s$FUNC, false
    );
    static final FunctionDescriptor _ultow_s$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _ultow_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_ultow_s",
        "(ILjdk/incubator/foreign/MemoryAddress;JI)I",
        constants$145._ultow_s$FUNC, false
    );
    static final FunctionDescriptor _wgetenv_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _wgetenv_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wgetenv_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$145._wgetenv_s$FUNC, false
    );
    static final FunctionDescriptor _wdupenv_s$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wdupenv_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wdupenv_s",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$145._wdupenv_s$FUNC, false
    );
}


