// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$991 {

    static final MemoryLayout CLSID_CCDFormDialog$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDFormDialog$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CCDFormDialog", constants$991.CLSID_CCDFormDialog$LAYOUT);
    static final MemoryLayout CLSID_CCDCommandButton$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDCommandButton$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CCDCommandButton", constants$991.CLSID_CCDCommandButton$LAYOUT);
    static final MemoryLayout CLSID_CCDComboBox$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDComboBox$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CCDComboBox", constants$991.CLSID_CCDComboBox$LAYOUT);
    static final MemoryLayout CLSID_CCDTextBox$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDTextBox$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CCDTextBox", constants$991.CLSID_CCDTextBox$LAYOUT);
    static final MemoryLayout CLSID_CCDCheckBox$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDCheckBox$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CCDCheckBox", constants$991.CLSID_CCDCheckBox$LAYOUT);
    static final MemoryLayout CLSID_CCDLabel$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment CLSID_CCDLabel$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "CLSID_CCDLabel", constants$991.CLSID_CCDLabel$LAYOUT);
}


