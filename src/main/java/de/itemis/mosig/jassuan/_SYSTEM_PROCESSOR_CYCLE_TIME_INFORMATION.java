// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("CycleTime")
    ).withName("_SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle CycleTime$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("CycleTime"));
    public static VarHandle CycleTime$VH() {
        return _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH;
    }
    public static long CycleTime$get(MemorySegment seg) {
        return (long)_SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.get(seg);
    }
    public static void CycleTime$set( MemorySegment seg, long x) {
        _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.set(seg, x);
    }
    public static long CycleTime$get(MemorySegment seg, long index) {
        return (long)_SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CycleTime$set(MemorySegment seg, long index, long x) {
        _SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION.CycleTime$VH.set(seg.asSlice(index*sizeof()), x);
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


