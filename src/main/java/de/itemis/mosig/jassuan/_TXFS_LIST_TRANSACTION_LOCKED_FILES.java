// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _TXFS_LIST_TRANSACTION_LOCKED_FILES {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("KtmTransaction"),
        C_LONG_LONG.withName("NumberOfFiles"),
        C_LONG_LONG.withName("BufferSizeRequired"),
        C_LONG_LONG.withName("Offset")
    ).withName("_TXFS_LIST_TRANSACTION_LOCKED_FILES");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_LIST_TRANSACTION_LOCKED_FILES.$struct$LAYOUT;
    }
    public static MemorySegment KtmTransaction$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle NumberOfFiles$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("NumberOfFiles"));
    public static VarHandle NumberOfFiles$VH() {
        return _TXFS_LIST_TRANSACTION_LOCKED_FILES.NumberOfFiles$VH;
    }
    public static long NumberOfFiles$get(MemorySegment seg) {
        return (long)_TXFS_LIST_TRANSACTION_LOCKED_FILES.NumberOfFiles$VH.get(seg);
    }
    public static void NumberOfFiles$set( MemorySegment seg, long x) {
        _TXFS_LIST_TRANSACTION_LOCKED_FILES.NumberOfFiles$VH.set(seg, x);
    }
    public static long NumberOfFiles$get(MemorySegment seg, long index) {
        return (long)_TXFS_LIST_TRANSACTION_LOCKED_FILES.NumberOfFiles$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfFiles$set(MemorySegment seg, long index, long x) {
        _TXFS_LIST_TRANSACTION_LOCKED_FILES.NumberOfFiles$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BufferSizeRequired$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("BufferSizeRequired"));
    public static VarHandle BufferSizeRequired$VH() {
        return _TXFS_LIST_TRANSACTION_LOCKED_FILES.BufferSizeRequired$VH;
    }
    public static long BufferSizeRequired$get(MemorySegment seg) {
        return (long)_TXFS_LIST_TRANSACTION_LOCKED_FILES.BufferSizeRequired$VH.get(seg);
    }
    public static void BufferSizeRequired$set( MemorySegment seg, long x) {
        _TXFS_LIST_TRANSACTION_LOCKED_FILES.BufferSizeRequired$VH.set(seg, x);
    }
    public static long BufferSizeRequired$get(MemorySegment seg, long index) {
        return (long)_TXFS_LIST_TRANSACTION_LOCKED_FILES.BufferSizeRequired$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BufferSizeRequired$set(MemorySegment seg, long index, long x) {
        _TXFS_LIST_TRANSACTION_LOCKED_FILES.BufferSizeRequired$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Offset$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Offset"));
    public static VarHandle Offset$VH() {
        return _TXFS_LIST_TRANSACTION_LOCKED_FILES.Offset$VH;
    }
    public static long Offset$get(MemorySegment seg) {
        return (long)_TXFS_LIST_TRANSACTION_LOCKED_FILES.Offset$VH.get(seg);
    }
    public static void Offset$set( MemorySegment seg, long x) {
        _TXFS_LIST_TRANSACTION_LOCKED_FILES.Offset$VH.set(seg, x);
    }
    public static long Offset$get(MemorySegment seg, long index) {
        return (long)_TXFS_LIST_TRANSACTION_LOCKED_FILES.Offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Offset$set(MemorySegment seg, long index, long x) {
        _TXFS_LIST_TRANSACTION_LOCKED_FILES.Offset$VH.set(seg.asSlice(index*sizeof()), x);
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


