// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FIXED {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("fract"),
        C_SHORT.withName("value")
    ).withName("_FIXED");
    public static MemoryLayout $LAYOUT() {
        return _FIXED.$struct$LAYOUT;
    }
    static final VarHandle fract$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("fract"));
    public static VarHandle fract$VH() {
        return _FIXED.fract$VH;
    }
    public static short fract$get(MemorySegment seg) {
        return (short)_FIXED.fract$VH.get(seg);
    }
    public static void fract$set( MemorySegment seg, short x) {
        _FIXED.fract$VH.set(seg, x);
    }
    public static short fract$get(MemorySegment seg, long index) {
        return (short)_FIXED.fract$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fract$set(MemorySegment seg, long index, short x) {
        _FIXED.fract$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle value$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("value"));
    public static VarHandle value$VH() {
        return _FIXED.value$VH;
    }
    public static short value$get(MemorySegment seg) {
        return (short)_FIXED.value$VH.get(seg);
    }
    public static void value$set( MemorySegment seg, short x) {
        _FIXED.value$VH.set(seg, x);
    }
    public static short value$get(MemorySegment seg, long index) {
        return (short)_FIXED.value$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void value$set(MemorySegment seg, long index, short x) {
        _FIXED.value$VH.set(seg.asSlice(index*sizeof()), x);
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


