// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$119 {

    static final FunctionDescriptor isblank$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle isblank$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "isblank",
        "(I)I",
        constants$119.isblank$FUNC, false
    );
    static final FunctionDescriptor iswalpha$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle iswalpha$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "iswalpha",
        "(S)I",
        constants$119.iswalpha$FUNC, false
    );
    static final FunctionDescriptor _iswalpha_l$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _iswalpha_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_iswalpha_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$119._iswalpha_l$FUNC, false
    );
    static final FunctionDescriptor iswupper$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle iswupper$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "iswupper",
        "(S)I",
        constants$119.iswupper$FUNC, false
    );
    static final FunctionDescriptor _iswupper_l$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT,
        C_POINTER
    );
    static final MethodHandle _iswupper_l$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_iswupper_l",
        "(SLjdk/incubator/foreign/MemoryAddress;)I",
        constants$119._iswupper_l$FUNC, false
    );
    static final FunctionDescriptor iswlower$FUNC = FunctionDescriptor.of(C_INT,
        C_SHORT
    );
    static final MethodHandle iswlower$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "iswlower",
        "(S)I",
        constants$119.iswlower$FUNC, false
    );
}


