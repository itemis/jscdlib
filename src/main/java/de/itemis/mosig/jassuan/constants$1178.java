// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1178 {

    static final MemoryLayout IID_IAuthenticateEx$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IAuthenticateEx$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IAuthenticateEx", constants$1178.IID_IAuthenticateEx$LAYOUT);
    static final MemoryLayout IID_IHttpNegotiate$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IHttpNegotiate$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IHttpNegotiate", constants$1178.IID_IHttpNegotiate$LAYOUT);
    static final MemoryLayout IID_IHttpNegotiate2$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IHttpNegotiate2$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IHttpNegotiate2", constants$1178.IID_IHttpNegotiate2$LAYOUT);
    static final MemoryLayout IID_IHttpNegotiate3$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IHttpNegotiate3$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IHttpNegotiate3", constants$1178.IID_IHttpNegotiate3$LAYOUT);
    static final MemoryLayout IID_IWinInetFileStream$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWinInetFileStream$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IWinInetFileStream", constants$1178.IID_IWinInetFileStream$LAYOUT);
    static final MemoryLayout IID_IWindowForBindingUI$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IWindowForBindingUI$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IWindowForBindingUI", constants$1178.IID_IWindowForBindingUI$LAYOUT);
}


