// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _JOBOBJECT_EXTENDED_LIMIT_INFORMATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
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
            ).withName("PerProcessUserTimeLimit"),
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
            ).withName("PerJobUserTimeLimit"),
            C_LONG.withName("LimitFlags"),
            MemoryLayout.paddingLayout(32),
            C_LONG_LONG.withName("MinimumWorkingSetSize"),
            C_LONG_LONG.withName("MaximumWorkingSetSize"),
            C_LONG.withName("ActiveProcessLimit"),
            MemoryLayout.paddingLayout(32),
            C_LONG_LONG.withName("Affinity"),
            C_LONG.withName("PriorityClass"),
            C_LONG.withName("SchedulingClass")
        ).withName("BasicLimitInformation"),
        MemoryLayout.structLayout(
            C_LONG_LONG.withName("ReadOperationCount"),
            C_LONG_LONG.withName("WriteOperationCount"),
            C_LONG_LONG.withName("OtherOperationCount"),
            C_LONG_LONG.withName("ReadTransferCount"),
            C_LONG_LONG.withName("WriteTransferCount"),
            C_LONG_LONG.withName("OtherTransferCount")
        ).withName("IoInfo"),
        C_LONG_LONG.withName("ProcessMemoryLimit"),
        C_LONG_LONG.withName("JobMemoryLimit"),
        C_LONG_LONG.withName("PeakProcessMemoryUsed"),
        C_LONG_LONG.withName("PeakJobMemoryUsed")
    ).withName("_JOBOBJECT_EXTENDED_LIMIT_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment BasicLimitInformation$slice(MemorySegment seg) {
        return seg.asSlice(0, 64);
    }
    public static MemorySegment IoInfo$slice(MemorySegment seg) {
        return seg.asSlice(64, 48);
    }
    static final VarHandle ProcessMemoryLimit$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ProcessMemoryLimit"));
    public static VarHandle ProcessMemoryLimit$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH;
    }
    public static long ProcessMemoryLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.get(seg);
    }
    public static void ProcessMemoryLimit$set( MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.set(seg, x);
    }
    public static long ProcessMemoryLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcessMemoryLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.ProcessMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle JobMemoryLimit$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("JobMemoryLimit"));
    public static VarHandle JobMemoryLimit$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH;
    }
    public static long JobMemoryLimit$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.get(seg);
    }
    public static void JobMemoryLimit$set( MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.set(seg, x);
    }
    public static long JobMemoryLimit$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobMemoryLimit$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.JobMemoryLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PeakProcessMemoryUsed$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PeakProcessMemoryUsed"));
    public static VarHandle PeakProcessMemoryUsed$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH;
    }
    public static long PeakProcessMemoryUsed$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.get(seg);
    }
    public static void PeakProcessMemoryUsed$set( MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.set(seg, x);
    }
    public static long PeakProcessMemoryUsed$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PeakProcessMemoryUsed$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakProcessMemoryUsed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle PeakJobMemoryUsed$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PeakJobMemoryUsed"));
    public static VarHandle PeakJobMemoryUsed$VH() {
        return _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH;
    }
    public static long PeakJobMemoryUsed$get(MemorySegment seg) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.get(seg);
    }
    public static void PeakJobMemoryUsed$set( MemorySegment seg, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.set(seg, x);
    }
    public static long PeakJobMemoryUsed$get(MemorySegment seg, long index) {
        return (long)_JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PeakJobMemoryUsed$set(MemorySegment seg, long index, long x) {
        _JOBOBJECT_EXTENDED_LIMIT_INFORMATION.PeakJobMemoryUsed$VH.set(seg.asSlice(index*sizeof()), x);
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


