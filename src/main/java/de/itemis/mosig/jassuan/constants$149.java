// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$149 {

    static final FunctionDescriptor _get_errno$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _get_errno$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_get_errno",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$149._get_errno$FUNC, false
    );
    static final FunctionDescriptor __doserrno$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle __doserrno$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "__doserrno",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$149.__doserrno$FUNC, false
    );
    static final FunctionDescriptor _set_doserrno$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG
    );
    static final MethodHandle _set_doserrno$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_set_doserrno",
        "(I)I",
        constants$149._set_doserrno$FUNC, false
    );
    static final FunctionDescriptor _get_doserrno$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle _get_doserrno$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_get_doserrno",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$149._get_doserrno$FUNC, false
    );
    static final MemoryLayout _sys_errlist$LAYOUT = MemoryLayout.sequenceLayout(1, C_POINTER);
    static final MemorySegment _sys_errlist$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "_sys_errlist", constants$149._sys_errlist$LAYOUT);
    static final MemoryLayout _sys_nerr$LAYOUT = C_INT;
    static final VarHandle _sys_nerr$VH = constants$149._sys_nerr$LAYOUT.varHandle(int.class);
    static final MemorySegment _sys_nerr$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "_sys_nerr", constants$149._sys_nerr$LAYOUT);
}


