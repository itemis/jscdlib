// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _wireBRECORD {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("fFlags"),
        C_LONG.withName("clSize"),
        C_POINTER.withName("pRecInfo"),
        C_POINTER.withName("pRecord")
    ).withName("_wireBRECORD");
    public static MemoryLayout $LAYOUT() {
        return _wireBRECORD.$struct$LAYOUT;
    }
    static final VarHandle fFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fFlags"));
    public static VarHandle fFlags$VH() {
        return _wireBRECORD.fFlags$VH;
    }
    public static int fFlags$get(MemorySegment seg) {
        return (int)_wireBRECORD.fFlags$VH.get(seg);
    }
    public static void fFlags$set( MemorySegment seg, int x) {
        _wireBRECORD.fFlags$VH.set(seg, x);
    }
    public static int fFlags$get(MemorySegment seg, long index) {
        return (int)_wireBRECORD.fFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fFlags$set(MemorySegment seg, long index, int x) {
        _wireBRECORD.fFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle clSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("clSize"));
    public static VarHandle clSize$VH() {
        return _wireBRECORD.clSize$VH;
    }
    public static int clSize$get(MemorySegment seg) {
        return (int)_wireBRECORD.clSize$VH.get(seg);
    }
    public static void clSize$set( MemorySegment seg, int x) {
        _wireBRECORD.clSize$VH.set(seg, x);
    }
    public static int clSize$get(MemorySegment seg, long index) {
        return (int)_wireBRECORD.clSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clSize$set(MemorySegment seg, long index, int x) {
        _wireBRECORD.clSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pRecInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pRecInfo")));
    public static VarHandle pRecInfo$VH() {
        return _wireBRECORD.pRecInfo$VH;
    }
    public static MemoryAddress pRecInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_wireBRECORD.pRecInfo$VH.get(seg);
    }
    public static void pRecInfo$set( MemorySegment seg, MemoryAddress x) {
        _wireBRECORD.pRecInfo$VH.set(seg, x);
    }
    public static MemoryAddress pRecInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_wireBRECORD.pRecInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pRecInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _wireBRECORD.pRecInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pRecord$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pRecord")));
    public static VarHandle pRecord$VH() {
        return _wireBRECORD.pRecord$VH;
    }
    public static MemoryAddress pRecord$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_wireBRECORD.pRecord$VH.get(seg);
    }
    public static void pRecord$set( MemorySegment seg, MemoryAddress x) {
        _wireBRECORD.pRecord$VH.set(seg, x);
    }
    public static MemoryAddress pRecord$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_wireBRECORD.pRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pRecord$set(MemorySegment seg, long index, MemoryAddress x) {
        _wireBRECORD.pRecord$VH.set(seg.asSlice(index*sizeof()), x);
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


