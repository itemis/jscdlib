// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _DISK_HISTOGRAM {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("DiskSize"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("Start"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("End"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("Average"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("AverageRead"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("AverageWrite"),
        C_LONG.withName("Granularity"),
        C_LONG.withName("Size"),
        C_LONG.withName("ReadCount"),
        C_LONG.withName("WriteCount"),
        C_POINTER.withName("Histogram")
    ).withName("_DISK_HISTOGRAM");
    public static MemoryLayout $LAYOUT() {
        return _DISK_HISTOGRAM.$struct$LAYOUT;
    }
    public static MemorySegment DiskSize$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment Start$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment End$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment Average$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment AverageRead$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment AverageWrite$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    static final VarHandle Granularity$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Granularity"));
    public static VarHandle Granularity$VH() {
        return _DISK_HISTOGRAM.Granularity$VH;
    }
    public static int Granularity$get(MemorySegment seg) {
        return (int)_DISK_HISTOGRAM.Granularity$VH.get(seg);
    }
    public static void Granularity$set( MemorySegment seg, int x) {
        _DISK_HISTOGRAM.Granularity$VH.set(seg, x);
    }
    public static int Granularity$get(MemorySegment seg, long index) {
        return (int)_DISK_HISTOGRAM.Granularity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Granularity$set(MemorySegment seg, long index, int x) {
        _DISK_HISTOGRAM.Granularity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DISK_HISTOGRAM.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DISK_HISTOGRAM.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DISK_HISTOGRAM.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DISK_HISTOGRAM.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DISK_HISTOGRAM.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ReadCount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ReadCount"));
    public static VarHandle ReadCount$VH() {
        return _DISK_HISTOGRAM.ReadCount$VH;
    }
    public static int ReadCount$get(MemorySegment seg) {
        return (int)_DISK_HISTOGRAM.ReadCount$VH.get(seg);
    }
    public static void ReadCount$set( MemorySegment seg, int x) {
        _DISK_HISTOGRAM.ReadCount$VH.set(seg, x);
    }
    public static int ReadCount$get(MemorySegment seg, long index) {
        return (int)_DISK_HISTOGRAM.ReadCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReadCount$set(MemorySegment seg, long index, int x) {
        _DISK_HISTOGRAM.ReadCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle WriteCount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("WriteCount"));
    public static VarHandle WriteCount$VH() {
        return _DISK_HISTOGRAM.WriteCount$VH;
    }
    public static int WriteCount$get(MemorySegment seg) {
        return (int)_DISK_HISTOGRAM.WriteCount$VH.get(seg);
    }
    public static void WriteCount$set( MemorySegment seg, int x) {
        _DISK_HISTOGRAM.WriteCount$VH.set(seg, x);
    }
    public static int WriteCount$get(MemorySegment seg, long index) {
        return (int)_DISK_HISTOGRAM.WriteCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void WriteCount$set(MemorySegment seg, long index, int x) {
        _DISK_HISTOGRAM.WriteCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Histogram$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Histogram")));
    public static VarHandle Histogram$VH() {
        return _DISK_HISTOGRAM.Histogram$VH;
    }
    public static MemoryAddress Histogram$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DISK_HISTOGRAM.Histogram$VH.get(seg);
    }
    public static void Histogram$set( MemorySegment seg, MemoryAddress x) {
        _DISK_HISTOGRAM.Histogram$VH.set(seg, x);
    }
    public static MemoryAddress Histogram$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DISK_HISTOGRAM.Histogram$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Histogram$set(MemorySegment seg, long index, MemoryAddress x) {
        _DISK_HISTOGRAM.Histogram$VH.set(seg.asSlice(index*sizeof()), x);
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


