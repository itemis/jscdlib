// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$253 {

    static final MemoryLayout GUID_VIDEO_ADAPTIVE_POWERDOWN$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ADAPTIVE_POWERDOWN$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_VIDEO_ADAPTIVE_POWERDOWN", constants$253.GUID_VIDEO_ADAPTIVE_POWERDOWN$LAYOUT);
    static final MemoryLayout GUID_MONITOR_POWER_ON$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_MONITOR_POWER_ON$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_MONITOR_POWER_ON", constants$253.GUID_MONITOR_POWER_ON$LAYOUT);
    static final MemoryLayout GUID_DEVICE_POWER_POLICY_VIDEO_BRIGHTNESS$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVICE_POWER_POLICY_VIDEO_BRIGHTNESS$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_DEVICE_POWER_POLICY_VIDEO_BRIGHTNESS", constants$253.GUID_DEVICE_POWER_POLICY_VIDEO_BRIGHTNESS$LAYOUT);
    static final MemoryLayout GUID_DEVICE_POWER_POLICY_VIDEO_DIM_BRIGHTNESS$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_DEVICE_POWER_POLICY_VIDEO_DIM_BRIGHTNESS$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_DEVICE_POWER_POLICY_VIDEO_DIM_BRIGHTNESS", constants$253.GUID_DEVICE_POWER_POLICY_VIDEO_DIM_BRIGHTNESS$LAYOUT);
    static final MemoryLayout GUID_VIDEO_CURRENT_MONITOR_BRIGHTNESS$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_CURRENT_MONITOR_BRIGHTNESS$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_VIDEO_CURRENT_MONITOR_BRIGHTNESS", constants$253.GUID_VIDEO_CURRENT_MONITOR_BRIGHTNESS$LAYOUT);
    static final MemoryLayout GUID_VIDEO_ADAPTIVE_DISPLAY_BRIGHTNESS$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_VIDEO_ADAPTIVE_DISPLAY_BRIGHTNESS$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_VIDEO_ADAPTIVE_DISPLAY_BRIGHTNESS", constants$253.GUID_VIDEO_ADAPTIVE_DISPLAY_BRIGHTNESS$LAYOUT);
}


