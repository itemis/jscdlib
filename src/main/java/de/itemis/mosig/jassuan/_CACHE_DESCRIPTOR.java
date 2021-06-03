// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CACHE_DESCRIPTOR {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("Level"),
        C_CHAR.withName("Associativity"),
        C_SHORT.withName("LineSize"),
        C_LONG.withName("Size"),
        C_INT.withName("Type")
    ).withName("_CACHE_DESCRIPTOR");
    public static MemoryLayout $LAYOUT() {
        return _CACHE_DESCRIPTOR.$struct$LAYOUT;
    }
    static final VarHandle Level$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("Level"));
    public static VarHandle Level$VH() {
        return _CACHE_DESCRIPTOR.Level$VH;
    }
    public static byte Level$get(MemorySegment seg) {
        return (byte)_CACHE_DESCRIPTOR.Level$VH.get(seg);
    }
    public static void Level$set( MemorySegment seg, byte x) {
        _CACHE_DESCRIPTOR.Level$VH.set(seg, x);
    }
    public static byte Level$get(MemorySegment seg, long index) {
        return (byte)_CACHE_DESCRIPTOR.Level$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Level$set(MemorySegment seg, long index, byte x) {
        _CACHE_DESCRIPTOR.Level$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Associativity$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("Associativity"));
    public static VarHandle Associativity$VH() {
        return _CACHE_DESCRIPTOR.Associativity$VH;
    }
    public static byte Associativity$get(MemorySegment seg) {
        return (byte)_CACHE_DESCRIPTOR.Associativity$VH.get(seg);
    }
    public static void Associativity$set( MemorySegment seg, byte x) {
        _CACHE_DESCRIPTOR.Associativity$VH.set(seg, x);
    }
    public static byte Associativity$get(MemorySegment seg, long index) {
        return (byte)_CACHE_DESCRIPTOR.Associativity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Associativity$set(MemorySegment seg, long index, byte x) {
        _CACHE_DESCRIPTOR.Associativity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LineSize$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("LineSize"));
    public static VarHandle LineSize$VH() {
        return _CACHE_DESCRIPTOR.LineSize$VH;
    }
    public static short LineSize$get(MemorySegment seg) {
        return (short)_CACHE_DESCRIPTOR.LineSize$VH.get(seg);
    }
    public static void LineSize$set( MemorySegment seg, short x) {
        _CACHE_DESCRIPTOR.LineSize$VH.set(seg, x);
    }
    public static short LineSize$get(MemorySegment seg, long index) {
        return (short)_CACHE_DESCRIPTOR.LineSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LineSize$set(MemorySegment seg, long index, short x) {
        _CACHE_DESCRIPTOR.LineSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _CACHE_DESCRIPTOR.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_CACHE_DESCRIPTOR.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _CACHE_DESCRIPTOR.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_CACHE_DESCRIPTOR.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _CACHE_DESCRIPTOR.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _CACHE_DESCRIPTOR.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_CACHE_DESCRIPTOR.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _CACHE_DESCRIPTOR.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_CACHE_DESCRIPTOR.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _CACHE_DESCRIPTOR.Type$VH.set(seg.asSlice(index*sizeof()), x);
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


