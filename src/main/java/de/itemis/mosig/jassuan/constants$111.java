// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$111 {

    static final FunctionDescriptor _XcptFilter$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle _XcptFilter$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_XcptFilter",
        "(ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$111._XcptFilter$FUNC, false
    );
    static final FunctionDescriptor PEXCEPTION_HANDLER$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PEXCEPTION_HANDLER$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$111.PEXCEPTION_HANDLER$FUNC, false
    );
    static final MemoryLayout __imp__pctype$LAYOUT = C_POINTER;
    static final VarHandle __imp__pctype$VH = MemoryHandles.asAddressVarHandle(constants$111.__imp__pctype$LAYOUT.varHandle(long.class));
    static final MemorySegment __imp__pctype$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "__imp__pctype", constants$111.__imp__pctype$LAYOUT);
    static final MemoryLayout __imp__wctype$LAYOUT = C_POINTER;
    static final VarHandle __imp__wctype$VH = MemoryHandles.asAddressVarHandle(constants$111.__imp__wctype$LAYOUT.varHandle(long.class));
    static final MemorySegment __imp__wctype$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "__imp__wctype", constants$111.__imp__wctype$LAYOUT);
    static final MemoryLayout __imp__pwctype$LAYOUT = C_POINTER;
    static final VarHandle __imp__pwctype$VH = MemoryHandles.asAddressVarHandle(constants$111.__imp__pwctype$LAYOUT.varHandle(long.class));
    static final MemorySegment __imp__pwctype$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "__imp__pwctype", constants$111.__imp__pwctype$LAYOUT);
}


