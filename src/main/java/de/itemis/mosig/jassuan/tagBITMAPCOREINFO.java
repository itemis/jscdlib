// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagBITMAPCOREINFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("bcSize"),
            C_SHORT.withName("bcWidth"),
            C_SHORT.withName("bcHeight"),
            C_SHORT.withName("bcPlanes"),
            C_SHORT.withName("bcBitCount")
        ).withName("bmciHeader"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            C_CHAR.withName("rgbtBlue"),
            C_CHAR.withName("rgbtGreen"),
            C_CHAR.withName("rgbtRed")
        ).withName("tagRGBTRIPLE")).withName("bmciColors"),
        MemoryLayout.paddingLayout(8)
    ).withName("tagBITMAPCOREINFO");
    public static MemoryLayout $LAYOUT() {
        return tagBITMAPCOREINFO.$struct$LAYOUT;
    }
    public static MemorySegment bmciHeader$slice(MemorySegment seg) {
        return seg.asSlice(0, 12);
    }
    public static MemorySegment bmciColors$slice(MemorySegment seg) {
        return seg.asSlice(12, 3);
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


