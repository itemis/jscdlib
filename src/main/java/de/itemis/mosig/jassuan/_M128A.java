// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _M128A {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("Low"),
        C_LONG_LONG.withName("High")
    ).withName("_M128A");
    public static MemoryLayout $LAYOUT() {
        return _M128A.$struct$LAYOUT;
    }
    static final VarHandle Low$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Low"));
    public static VarHandle Low$VH() {
        return _M128A.Low$VH;
    }
    public static long Low$get(MemorySegment seg) {
        return (long)_M128A.Low$VH.get(seg);
    }
    public static void Low$set( MemorySegment seg, long x) {
        _M128A.Low$VH.set(seg, x);
    }
    public static long Low$get(MemorySegment seg, long index) {
        return (long)_M128A.Low$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Low$set(MemorySegment seg, long index, long x) {
        _M128A.Low$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle High$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("High"));
    public static VarHandle High$VH() {
        return _M128A.High$VH;
    }
    public static long High$get(MemorySegment seg) {
        return (long)_M128A.High$VH.get(seg);
    }
    public static void High$set( MemorySegment seg, long x) {
        _M128A.High$VH.set(seg, x);
    }
    public static long High$get(MemorySegment seg, long index) {
        return (long)_M128A.High$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void High$set(MemorySegment seg, long index, long x) {
        _M128A.High$VH.set(seg.asSlice(index*sizeof()), x);
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


