// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$169 {

    static final FunctionDescriptor _wtoi$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _wtoi$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wtoi",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$169._wtoi$FUNC, false
    );
    static final FunctionDescriptor _wtoi_l$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wtoi_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wtoi_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$169._wtoi_l$FUNC, false
    );
    static final FunctionDescriptor _wtol$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle _wtol$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wtol",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$169._wtol$FUNC, false
    );
    static final FunctionDescriptor _wtol_l$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle _wtol_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_wtol_l",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$169._wtol_l$FUNC, false
    );
    static final FunctionDescriptor _i64tow$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _i64tow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_i64tow",
        "(JLjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$169._i64tow$FUNC, false
    );
    static final FunctionDescriptor _ui64tow$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _ui64tow$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_ui64tow",
        "(JLjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$169._ui64tow$FUNC, false
    );
}


