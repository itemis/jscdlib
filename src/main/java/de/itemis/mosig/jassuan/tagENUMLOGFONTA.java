// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagENUMLOGFONTA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("lfHeight"),
            C_LONG.withName("lfWidth"),
            C_LONG.withName("lfEscapement"),
            C_LONG.withName("lfOrientation"),
            C_LONG.withName("lfWeight"),
            C_CHAR.withName("lfItalic"),
            C_CHAR.withName("lfUnderline"),
            C_CHAR.withName("lfStrikeOut"),
            C_CHAR.withName("lfCharSet"),
            C_CHAR.withName("lfOutPrecision"),
            C_CHAR.withName("lfClipPrecision"),
            C_CHAR.withName("lfQuality"),
            C_CHAR.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("lfFaceName")
        ).withName("elfLogFont"),
        MemoryLayout.sequenceLayout(64, C_CHAR).withName("elfFullName"),
        MemoryLayout.sequenceLayout(32, C_CHAR).withName("elfStyle")
    ).withName("tagENUMLOGFONTA");
    public static MemoryLayout $LAYOUT() {
        return tagENUMLOGFONTA.$struct$LAYOUT;
    }
    public static MemorySegment elfLogFont$slice(MemorySegment seg) {
        return seg.asSlice(0, 60);
    }
    public static MemorySegment elfFullName$slice(MemorySegment seg) {
        return seg.asSlice(60, 64);
    }
    public static MemorySegment elfStyle$slice(MemorySegment seg) {
        return seg.asSlice(124, 32);
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


