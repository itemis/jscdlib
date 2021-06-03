// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _JOB_INFO_3 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("JobId"),
        C_LONG.withName("NextJobId"),
        C_LONG.withName("Reserved")
    ).withName("_JOB_INFO_3");
    public static MemoryLayout $LAYOUT() {
        return _JOB_INFO_3.$struct$LAYOUT;
    }
    static final VarHandle JobId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("JobId"));
    public static VarHandle JobId$VH() {
        return _JOB_INFO_3.JobId$VH;
    }
    public static int JobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_3.JobId$VH.get(seg);
    }
    public static void JobId$set( MemorySegment seg, int x) {
        _JOB_INFO_3.JobId$VH.set(seg, x);
    }
    public static int JobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_3.JobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void JobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_3.JobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NextJobId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NextJobId"));
    public static VarHandle NextJobId$VH() {
        return _JOB_INFO_3.NextJobId$VH;
    }
    public static int NextJobId$get(MemorySegment seg) {
        return (int)_JOB_INFO_3.NextJobId$VH.get(seg);
    }
    public static void NextJobId$set( MemorySegment seg, int x) {
        _JOB_INFO_3.NextJobId$VH.set(seg, x);
    }
    public static int NextJobId$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_3.NextJobId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NextJobId$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_3.NextJobId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _JOB_INFO_3.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_JOB_INFO_3.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _JOB_INFO_3.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_JOB_INFO_3.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _JOB_INFO_3.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
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


