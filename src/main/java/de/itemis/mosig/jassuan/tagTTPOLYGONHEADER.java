// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagTTPOLYGONHEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cb"),
        C_LONG.withName("dwType"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_SHORT.withName("fract"),
                C_SHORT.withName("value")
            ).withName("x"),
            MemoryLayout.structLayout(
                C_SHORT.withName("fract"),
                C_SHORT.withName("value")
            ).withName("y")
        ).withName("pfxStart")
    ).withName("tagTTPOLYGONHEADER");
    public static MemoryLayout $LAYOUT() {
        return tagTTPOLYGONHEADER.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return tagTTPOLYGONHEADER.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)tagTTPOLYGONHEADER.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        tagTTPOLYGONHEADER.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)tagTTPOLYGONHEADER.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        tagTTPOLYGONHEADER.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwType"));
    public static VarHandle dwType$VH() {
        return tagTTPOLYGONHEADER.dwType$VH;
    }
    public static int dwType$get(MemorySegment seg) {
        return (int)tagTTPOLYGONHEADER.dwType$VH.get(seg);
    }
    public static void dwType$set( MemorySegment seg, int x) {
        tagTTPOLYGONHEADER.dwType$VH.set(seg, x);
    }
    public static int dwType$get(MemorySegment seg, long index) {
        return (int)tagTTPOLYGONHEADER.dwType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwType$set(MemorySegment seg, long index, int x) {
        tagTTPOLYGONHEADER.dwType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pfxStart$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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


