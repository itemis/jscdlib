// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMONITORINFOEXW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("cbSize"),
            MemoryLayout.structLayout(
                C_LONG.withName("left"),
                C_LONG.withName("top"),
                C_LONG.withName("right"),
                C_LONG.withName("bottom")
            ).withName("rcMonitor"),
            MemoryLayout.structLayout(
                C_LONG.withName("left"),
                C_LONG.withName("top"),
                C_LONG.withName("right"),
                C_LONG.withName("bottom")
            ).withName("rcWork"),
            C_LONG.withName("dwFlags")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(32, C_SHORT).withName("szDevice")
    ).withName("tagMONITORINFOEXW");
    public static MemoryLayout $LAYOUT() {
        return tagMONITORINFOEXW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagMONITORINFOEXW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagMONITORINFOEXW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagMONITORINFOEXW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagMONITORINFOEXW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagMONITORINFOEXW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rcMonitor$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment rcWork$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagMONITORINFOEXW.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagMONITORINFOEXW.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagMONITORINFOEXW.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagMONITORINFOEXW.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagMONITORINFOEXW.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szDevice$slice(MemorySegment seg) {
        return seg.asSlice(40, 64);
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


