// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1031 {

    static final MemoryLayout FMTID_VideoSummaryInformation$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_VideoSummaryInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "FMTID_VideoSummaryInformation", constants$1031.FMTID_VideoSummaryInformation$LAYOUT);
    static final MemoryLayout FMTID_MediaFileSummaryInformation$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment FMTID_MediaFileSummaryInformation$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "FMTID_MediaFileSummaryInformation", constants$1031.FMTID_MediaFileSummaryInformation$LAYOUT);
    static final MemoryLayout IID_IClassActivator$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IClassActivator$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IClassActivator", constants$1031.IID_IClassActivator$LAYOUT);
    static final MemoryLayout IID_IFillLockBytes$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IFillLockBytes$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IFillLockBytes", constants$1031.IID_IFillLockBytes$LAYOUT);
    static final FunctionDescriptor IFillLockBytes_RemoteFillAppend_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle IFillLockBytes_RemoteFillAppend_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IFillLockBytes_RemoteFillAppend_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1031.IFillLockBytes_RemoteFillAppend_Proxy$FUNC, false
    );
    static final FunctionDescriptor IFillLockBytes_RemoteFillAppend_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IFillLockBytes_RemoteFillAppend_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IFillLockBytes_RemoteFillAppend_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1031.IFillLockBytes_RemoteFillAppend_Stub$FUNC, false
    );
}


