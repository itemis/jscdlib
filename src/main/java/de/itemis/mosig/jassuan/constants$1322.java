// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1322 {

    static final FunctionDescriptor PrintDlgExW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle PrintDlgExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PrintDlgExW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1322.PrintDlgExW$FUNC, false
    );
    static final FunctionDescriptor CommDlgExtendedError$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle CommDlgExtendedError$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CommDlgExtendedError",
        "()I",
        constants$1322.CommDlgExtendedError$FUNC, false
    );
    static final FunctionDescriptor LPPAGEPAINTHOOK$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle LPPAGEPAINTHOOK$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$1322.LPPAGEPAINTHOOK$FUNC, false
    );
    static final FunctionDescriptor LPPAGESETUPHOOK$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle LPPAGESETUPHOOK$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IJJ)J",
        constants$1322.LPPAGESETUPHOOK$FUNC, false
    );
}


