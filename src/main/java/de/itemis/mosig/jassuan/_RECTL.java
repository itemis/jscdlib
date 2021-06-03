// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _RECTL {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("left"),
        C_LONG.withName("top"),
        C_LONG.withName("right"),
        C_LONG.withName("bottom")
    ).withName("_RECTL");
    public static MemoryLayout $LAYOUT() {
        return _RECTL.$struct$LAYOUT;
    }
    static final VarHandle left$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("left"));
    public static VarHandle left$VH() {
        return _RECTL.left$VH;
    }
    public static int left$get(MemorySegment seg) {
        return (int)_RECTL.left$VH.get(seg);
    }
    public static void left$set( MemorySegment seg, int x) {
        _RECTL.left$VH.set(seg, x);
    }
    public static int left$get(MemorySegment seg, long index) {
        return (int)_RECTL.left$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void left$set(MemorySegment seg, long index, int x) {
        _RECTL.left$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle top$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("top"));
    public static VarHandle top$VH() {
        return _RECTL.top$VH;
    }
    public static int top$get(MemorySegment seg) {
        return (int)_RECTL.top$VH.get(seg);
    }
    public static void top$set( MemorySegment seg, int x) {
        _RECTL.top$VH.set(seg, x);
    }
    public static int top$get(MemorySegment seg, long index) {
        return (int)_RECTL.top$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void top$set(MemorySegment seg, long index, int x) {
        _RECTL.top$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle right$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("right"));
    public static VarHandle right$VH() {
        return _RECTL.right$VH;
    }
    public static int right$get(MemorySegment seg) {
        return (int)_RECTL.right$VH.get(seg);
    }
    public static void right$set( MemorySegment seg, int x) {
        _RECTL.right$VH.set(seg, x);
    }
    public static int right$get(MemorySegment seg, long index) {
        return (int)_RECTL.right$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void right$set(MemorySegment seg, long index, int x) {
        _RECTL.right$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bottom$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bottom"));
    public static VarHandle bottom$VH() {
        return _RECTL.bottom$VH;
    }
    public static int bottom$get(MemorySegment seg) {
        return (int)_RECTL.bottom$VH.get(seg);
    }
    public static void bottom$set( MemorySegment seg, int x) {
        _RECTL.bottom$VH.set(seg, x);
    }
    public static int bottom$get(MemorySegment seg, long index) {
        return (int)_RECTL.bottom$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bottom$set(MemorySegment seg, long index, int x) {
        _RECTL.bottom$VH.set(seg.asSlice(index*sizeof()), x);
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


