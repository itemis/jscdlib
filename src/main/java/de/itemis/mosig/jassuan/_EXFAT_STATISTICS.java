// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _EXFAT_STATISTICS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("CreateHits"),
        C_LONG.withName("SuccessfulCreates"),
        C_LONG.withName("FailedCreates"),
        C_LONG.withName("NonCachedReads"),
        C_LONG.withName("NonCachedReadBytes"),
        C_LONG.withName("NonCachedWrites"),
        C_LONG.withName("NonCachedWriteBytes"),
        C_LONG.withName("NonCachedDiskReads"),
        C_LONG.withName("NonCachedDiskWrites")
    ).withName("_EXFAT_STATISTICS");
    public static MemoryLayout $LAYOUT() {
        return _EXFAT_STATISTICS.$struct$LAYOUT;
    }
    static final VarHandle CreateHits$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CreateHits"));
    public static VarHandle CreateHits$VH() {
        return _EXFAT_STATISTICS.CreateHits$VH;
    }
    public static int CreateHits$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.CreateHits$VH.get(seg);
    }
    public static void CreateHits$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.CreateHits$VH.set(seg, x);
    }
    public static int CreateHits$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.CreateHits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CreateHits$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.CreateHits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SuccessfulCreates$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SuccessfulCreates"));
    public static VarHandle SuccessfulCreates$VH() {
        return _EXFAT_STATISTICS.SuccessfulCreates$VH;
    }
    public static int SuccessfulCreates$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.SuccessfulCreates$VH.get(seg);
    }
    public static void SuccessfulCreates$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.SuccessfulCreates$VH.set(seg, x);
    }
    public static int SuccessfulCreates$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.SuccessfulCreates$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SuccessfulCreates$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.SuccessfulCreates$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FailedCreates$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("FailedCreates"));
    public static VarHandle FailedCreates$VH() {
        return _EXFAT_STATISTICS.FailedCreates$VH;
    }
    public static int FailedCreates$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.FailedCreates$VH.get(seg);
    }
    public static void FailedCreates$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.FailedCreates$VH.set(seg, x);
    }
    public static int FailedCreates$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.FailedCreates$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FailedCreates$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.FailedCreates$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonCachedReads$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NonCachedReads"));
    public static VarHandle NonCachedReads$VH() {
        return _EXFAT_STATISTICS.NonCachedReads$VH;
    }
    public static int NonCachedReads$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.NonCachedReads$VH.get(seg);
    }
    public static void NonCachedReads$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.NonCachedReads$VH.set(seg, x);
    }
    public static int NonCachedReads$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.NonCachedReads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonCachedReads$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.NonCachedReads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonCachedReadBytes$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NonCachedReadBytes"));
    public static VarHandle NonCachedReadBytes$VH() {
        return _EXFAT_STATISTICS.NonCachedReadBytes$VH;
    }
    public static int NonCachedReadBytes$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.NonCachedReadBytes$VH.get(seg);
    }
    public static void NonCachedReadBytes$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.NonCachedReadBytes$VH.set(seg, x);
    }
    public static int NonCachedReadBytes$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.NonCachedReadBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonCachedReadBytes$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.NonCachedReadBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonCachedWrites$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NonCachedWrites"));
    public static VarHandle NonCachedWrites$VH() {
        return _EXFAT_STATISTICS.NonCachedWrites$VH;
    }
    public static int NonCachedWrites$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.NonCachedWrites$VH.get(seg);
    }
    public static void NonCachedWrites$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.NonCachedWrites$VH.set(seg, x);
    }
    public static int NonCachedWrites$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.NonCachedWrites$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonCachedWrites$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.NonCachedWrites$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonCachedWriteBytes$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NonCachedWriteBytes"));
    public static VarHandle NonCachedWriteBytes$VH() {
        return _EXFAT_STATISTICS.NonCachedWriteBytes$VH;
    }
    public static int NonCachedWriteBytes$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.NonCachedWriteBytes$VH.get(seg);
    }
    public static void NonCachedWriteBytes$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.NonCachedWriteBytes$VH.set(seg, x);
    }
    public static int NonCachedWriteBytes$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.NonCachedWriteBytes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonCachedWriteBytes$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.NonCachedWriteBytes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonCachedDiskReads$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NonCachedDiskReads"));
    public static VarHandle NonCachedDiskReads$VH() {
        return _EXFAT_STATISTICS.NonCachedDiskReads$VH;
    }
    public static int NonCachedDiskReads$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.NonCachedDiskReads$VH.get(seg);
    }
    public static void NonCachedDiskReads$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.NonCachedDiskReads$VH.set(seg, x);
    }
    public static int NonCachedDiskReads$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.NonCachedDiskReads$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonCachedDiskReads$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.NonCachedDiskReads$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NonCachedDiskWrites$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NonCachedDiskWrites"));
    public static VarHandle NonCachedDiskWrites$VH() {
        return _EXFAT_STATISTICS.NonCachedDiskWrites$VH;
    }
    public static int NonCachedDiskWrites$get(MemorySegment seg) {
        return (int)_EXFAT_STATISTICS.NonCachedDiskWrites$VH.get(seg);
    }
    public static void NonCachedDiskWrites$set( MemorySegment seg, int x) {
        _EXFAT_STATISTICS.NonCachedDiskWrites$VH.set(seg, x);
    }
    public static int NonCachedDiskWrites$get(MemorySegment seg, long index) {
        return (int)_EXFAT_STATISTICS.NonCachedDiskWrites$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NonCachedDiskWrites$set(MemorySegment seg, long index, int x) {
        _EXFAT_STATISTICS.NonCachedDiskWrites$VH.set(seg.asSlice(index*sizeof()), x);
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


