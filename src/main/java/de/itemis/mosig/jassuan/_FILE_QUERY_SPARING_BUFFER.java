// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FILE_QUERY_SPARING_BUFFER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("SparingUnitBytes"),
        C_CHAR.withName("SoftwareSparing"),
        MemoryLayout.paddingLayout(24),
        C_LONG.withName("TotalSpareBlocks"),
        C_LONG.withName("FreeSpareBlocks")
    ).withName("_FILE_QUERY_SPARING_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _FILE_QUERY_SPARING_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle SparingUnitBytes$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SparingUnitBytes"));
    public static VarHandle SparingUnitBytes$VH() {
        return _FILE_QUERY_SPARING_BUFFER.SparingUnitBytes$VH;
    }
    public static int SparingUnitBytes$get(MemorySegment seg) {
        return (int)_FILE_QUERY_SPARING_BUFFER.SparingUnitBytes$VH.get(seg);
    }
    public static void SparingUnitBytes$set( MemorySegment seg, int x) {
        _FILE_QUERY_SPARING_BUFFER.SparingUnitBytes$VH.set(seg, x);
    }
    public static int SparingUnitBytes$get(MemorySegment seg, long index) {
        return (int)_FILE_QUERY_SPARING_BUFFER.SparingUnitBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SparingUnitBytes$set(MemorySegment seg, long index, int x) {
        _FILE_QUERY_SPARING_BUFFER.SparingUnitBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SoftwareSparing$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("SoftwareSparing"));
    public static VarHandle SoftwareSparing$VH() {
        return _FILE_QUERY_SPARING_BUFFER.SoftwareSparing$VH;
    }
    public static byte SoftwareSparing$get(MemorySegment seg) {
        return (byte)_FILE_QUERY_SPARING_BUFFER.SoftwareSparing$VH.get(seg);
    }
    public static void SoftwareSparing$set( MemorySegment seg, byte x) {
        _FILE_QUERY_SPARING_BUFFER.SoftwareSparing$VH.set(seg, x);
    }
    public static byte SoftwareSparing$get(MemorySegment seg, long index) {
        return (byte)_FILE_QUERY_SPARING_BUFFER.SoftwareSparing$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SoftwareSparing$set(MemorySegment seg, long index, byte x) {
        _FILE_QUERY_SPARING_BUFFER.SoftwareSparing$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TotalSpareBlocks$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("TotalSpareBlocks"));
    public static VarHandle TotalSpareBlocks$VH() {
        return _FILE_QUERY_SPARING_BUFFER.TotalSpareBlocks$VH;
    }
    public static int TotalSpareBlocks$get(MemorySegment seg) {
        return (int)_FILE_QUERY_SPARING_BUFFER.TotalSpareBlocks$VH.get(seg);
    }
    public static void TotalSpareBlocks$set( MemorySegment seg, int x) {
        _FILE_QUERY_SPARING_BUFFER.TotalSpareBlocks$VH.set(seg, x);
    }
    public static int TotalSpareBlocks$get(MemorySegment seg, long index) {
        return (int)_FILE_QUERY_SPARING_BUFFER.TotalSpareBlocks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalSpareBlocks$set(MemorySegment seg, long index, int x) {
        _FILE_QUERY_SPARING_BUFFER.TotalSpareBlocks$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FreeSpareBlocks$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("FreeSpareBlocks"));
    public static VarHandle FreeSpareBlocks$VH() {
        return _FILE_QUERY_SPARING_BUFFER.FreeSpareBlocks$VH;
    }
    public static int FreeSpareBlocks$get(MemorySegment seg) {
        return (int)_FILE_QUERY_SPARING_BUFFER.FreeSpareBlocks$VH.get(seg);
    }
    public static void FreeSpareBlocks$set( MemorySegment seg, int x) {
        _FILE_QUERY_SPARING_BUFFER.FreeSpareBlocks$VH.set(seg, x);
    }
    public static int FreeSpareBlocks$get(MemorySegment seg, long index) {
        return (int)_FILE_QUERY_SPARING_BUFFER.FreeSpareBlocks$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FreeSpareBlocks$set(MemorySegment seg, long index, int x) {
        _FILE_QUERY_SPARING_BUFFER.FreeSpareBlocks$VH.set(seg.asSlice(index*sizeof()), x);
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


