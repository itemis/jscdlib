// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagENUMTEXTMETRICA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("tmHeight"),
                C_LONG.withName("tmAscent"),
                C_LONG.withName("tmDescent"),
                C_LONG.withName("tmInternalLeading"),
                C_LONG.withName("tmExternalLeading"),
                C_LONG.withName("tmAveCharWidth"),
                C_LONG.withName("tmMaxCharWidth"),
                C_LONG.withName("tmWeight"),
                C_LONG.withName("tmOverhang"),
                C_LONG.withName("tmDigitizedAspectX"),
                C_LONG.withName("tmDigitizedAspectY"),
                C_CHAR.withName("tmFirstChar"),
                C_CHAR.withName("tmLastChar"),
                C_CHAR.withName("tmDefaultChar"),
                C_CHAR.withName("tmBreakChar"),
                C_CHAR.withName("tmItalic"),
                C_CHAR.withName("tmUnderlined"),
                C_CHAR.withName("tmStruckOut"),
                C_CHAR.withName("tmPitchAndFamily"),
                C_CHAR.withName("tmCharSet"),
                MemoryLayout.paddingLayout(24),
                C_LONG.withName("ntmFlags"),
                C_INT.withName("ntmSizeEM"),
                C_INT.withName("ntmCellHeight"),
                C_INT.withName("ntmAvgWidth")
            ).withName("ntmTm"),
            MemoryLayout.structLayout(
                MemoryLayout.sequenceLayout(4, C_LONG).withName("fsUsb"),
                MemoryLayout.sequenceLayout(2, C_LONG).withName("fsCsb")
            ).withName("ntmFontSig")
        ).withName("etmNewTextMetricEx"),
        MemoryLayout.structLayout(
            C_LONG.withName("axlReserved"),
            C_LONG.withName("axlNumAxes"),
            MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
                C_LONG.withName("axMinValue"),
                C_LONG.withName("axMaxValue"),
                MemoryLayout.sequenceLayout(16, C_CHAR).withName("axAxisName")
            ).withName("tagAXISINFOA")).withName("axlAxisInfo")
        ).withName("etmAxesList")
    ).withName("tagENUMTEXTMETRICA");
    public static MemoryLayout $LAYOUT() {
        return tagENUMTEXTMETRICA.$struct$LAYOUT;
    }
    public static MemorySegment etmNewTextMetricEx$slice(MemorySegment seg) {
        return seg.asSlice(0, 96);
    }
    public static MemorySegment etmAxesList$slice(MemorySegment seg) {
        return seg.asSlice(96, 392);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocate(ResourceScope scope) { return allocate(SegmentAllocator.ofScope(scope)); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment allocateArray(int len, ResourceScope scope) {
        return allocateArray(len, SegmentAllocator.ofScope(scope));
    }
    public static MemorySegment ofAddress(MemoryAddress addr, ResourceScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


