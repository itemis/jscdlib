// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$60 {

    static final FunctionDescriptor _strncoll_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _strncoll_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strncoll_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$60._strncoll_l$FUNC, false
    );
    static final FunctionDescriptor _strnicoll$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle _strnicoll$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strnicoll",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$60._strnicoll$FUNC, false
    );
    static final FunctionDescriptor _strnicoll_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle _strnicoll_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strnicoll_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;JLjdk/incubator/foreign/MemoryAddress;)I",
        constants$60._strnicoll_l$FUNC, false
    );
    static final FunctionDescriptor strcspn$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle strcspn$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strcspn",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)J",
        constants$60.strcspn$FUNC, false
    );
    static final FunctionDescriptor _strerror$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle _strerror$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_strerror",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$60._strerror$FUNC, false
    );
    static final FunctionDescriptor strerror$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle strerror$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "strerror",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$60.strerror$FUNC, false
    );
}


