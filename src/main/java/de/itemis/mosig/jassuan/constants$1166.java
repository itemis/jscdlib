// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1166 {

    static final MemoryLayout CLSID_SBS_UrlMkBindCtx$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_UrlMkBindCtx$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_UrlMkBindCtx", constants$1166.CLSID_SBS_UrlMkBindCtx$LAYOUT);
    static final MemoryLayout CLSID_SBS_SoftDistExt$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_SoftDistExt$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_SoftDistExt", constants$1166.CLSID_SBS_SoftDistExt$LAYOUT);
    static final MemoryLayout CLSID_SBS_CdlProtocol$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_CdlProtocol$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_CdlProtocol", constants$1166.CLSID_SBS_CdlProtocol$LAYOUT);
    static final MemoryLayout CLSID_SBS_ClassInstallFilter$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_ClassInstallFilter$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_ClassInstallFilter", constants$1166.CLSID_SBS_ClassInstallFilter$LAYOUT);
    static final MemoryLayout CLSID_SBS_InternetSecurityManager$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_InternetSecurityManager$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_InternetSecurityManager", constants$1166.CLSID_SBS_InternetSecurityManager$LAYOUT);
    static final MemoryLayout CLSID_SBS_InternetZoneManager$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_SBS_InternetZoneManager$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_SBS_InternetZoneManager", constants$1166.CLSID_SBS_InternetZoneManager$LAYOUT);
}


