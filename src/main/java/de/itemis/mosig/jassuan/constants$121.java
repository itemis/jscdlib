// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$121 {

    static final FunctionDescriptor _iswspace_l$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _iswspace_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_iswspace_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$121._iswspace_l$FUNC, false
    );
    static final FunctionDescriptor iswpunct$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle iswpunct$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "iswpunct",
        "(S)I",
        constants$121.iswpunct$FUNC, false
    );
    static final FunctionDescriptor _iswpunct_l$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _iswpunct_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_iswpunct_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$121._iswpunct_l$FUNC, false
    );
    static final FunctionDescriptor iswalnum$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle iswalnum$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "iswalnum",
        "(S)I",
        constants$121.iswalnum$FUNC, false
    );
    static final FunctionDescriptor _iswalnum_l$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _iswalnum_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_iswalnum_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$121._iswalnum_l$FUNC, false
    );
    static final FunctionDescriptor iswprint$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle iswprint$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "iswprint",
        "(S)I",
        constants$121.iswprint$FUNC, false
    );
}


