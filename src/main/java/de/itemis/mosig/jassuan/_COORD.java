// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _COORD {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("X"),
        C_SHORT.withName("Y")
    ).withName("_COORD");
    public static MemoryLayout $LAYOUT() {
        return _COORD.$struct$LAYOUT;
    }
    static final VarHandle X$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("X"));
    public static VarHandle X$VH() {
        return _COORD.X$VH;
    }
    public static short X$get(MemorySegment seg) {
        return (short)_COORD.X$VH.get(seg);
    }
    public static void X$set( MemorySegment seg, short x) {
        _COORD.X$VH.set(seg, x);
    }
    public static short X$get(MemorySegment seg, long index) {
        return (short)_COORD.X$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void X$set(MemorySegment seg, long index, short x) {
        _COORD.X$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Y$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Y"));
    public static VarHandle Y$VH() {
        return _COORD.Y$VH;
    }
    public static short Y$get(MemorySegment seg) {
        return (short)_COORD.Y$VH.get(seg);
    }
    public static void Y$set( MemorySegment seg, short x) {
        _COORD.Y$VH.set(seg, x);
    }
    public static short Y$get(MemorySegment seg, long index) {
        return (short)_COORD.Y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Y$set(MemorySegment seg, long index, short x) {
        _COORD.Y$VH.set(seg.asSlice(index*sizeof()), x);
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


