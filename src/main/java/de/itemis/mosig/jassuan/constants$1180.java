// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1180 {

    static final MemoryLayout IID_IUriBuilder$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IUriBuilder$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IUriBuilder", constants$1180.IID_IUriBuilder$LAYOUT);
    static final MemoryLayout IID_IUriBuilderFactory$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IUriBuilderFactory$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IUriBuilderFactory", constants$1180.IID_IUriBuilderFactory$LAYOUT);
    static final FunctionDescriptor CreateIUriBuilder$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG_LONG,
        C_POINTER
    );
    static final MethodHandle CreateIUriBuilder$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateIUriBuilder",
        "(Ljdk/incubator/foreign/MemoryAddress;IJLjdk/incubator/foreign/MemoryAddress;)I",
        constants$1180.CreateIUriBuilder$FUNC, false
    );
    static final MemoryLayout IID_IWinInetInfo$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetInfo$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IWinInetInfo", constants$1180.IID_IWinInetInfo$LAYOUT);
    static final FunctionDescriptor IWinInetInfo_RemoteQueryOption_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IWinInetInfo_RemoteQueryOption_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IWinInetInfo_RemoteQueryOption_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1180.IWinInetInfo_RemoteQueryOption_Proxy$FUNC, false
    );
    static final FunctionDescriptor IWinInetInfo_RemoteQueryOption_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IWinInetInfo_RemoteQueryOption_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IWinInetInfo_RemoteQueryOption_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1180.IWinInetInfo_RemoteQueryOption_Stub$FUNC, false
    );
}


