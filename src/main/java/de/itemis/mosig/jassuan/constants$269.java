// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$269 {

    static final MemoryLayout GUID_BATTERY_PERCENTAGE_REMAINING$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BATTERY_PERCENTAGE_REMAINING$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_BATTERY_PERCENTAGE_REMAINING", constants$269.GUID_BATTERY_PERCENTAGE_REMAINING$LAYOUT);
    static final MemoryLayout GUID_GLOBAL_USER_PRESENCE$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_GLOBAL_USER_PRESENCE$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_GLOBAL_USER_PRESENCE", constants$269.GUID_GLOBAL_USER_PRESENCE$LAYOUT);
    static final MemoryLayout GUID_SESSION_DISPLAY_STATUS$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SESSION_DISPLAY_STATUS$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_SESSION_DISPLAY_STATUS", constants$269.GUID_SESSION_DISPLAY_STATUS$LAYOUT);
    static final MemoryLayout GUID_SESSION_USER_PRESENCE$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_SESSION_USER_PRESENCE$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_SESSION_USER_PRESENCE", constants$269.GUID_SESSION_USER_PRESENCE$LAYOUT);
    static final MemoryLayout GUID_IDLE_BACKGROUND_TASK$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_IDLE_BACKGROUND_TASK$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_IDLE_BACKGROUND_TASK", constants$269.GUID_IDLE_BACKGROUND_TASK$LAYOUT);
    static final MemoryLayout GUID_BACKGROUND_TASK_NOTIFICATION$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment GUID_BACKGROUND_TASK_NOTIFICATION$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "GUID_BACKGROUND_TASK_NOTIFICATION", constants$269.GUID_BACKGROUND_TASK_NOTIFICATION$LAYOUT);
}


