// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _JOBOBJECT_BASIC_PROCESS_ID_LIST {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("NumberOfAssignedProcesses"),
        C_LONG.withName("NumberOfProcessIdsInList"),
        MemoryLayout.sequenceLayout(1, C_LONG_LONG).withName("ProcessIdList")
    ).withName("_JOBOBJECT_BASIC_PROCESS_ID_LIST");
    public static MemoryLayout $LAYOUT() {
        return _JOBOBJECT_BASIC_PROCESS_ID_LIST.$struct$LAYOUT;
    }
    static final VarHandle NumberOfAssignedProcesses$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumberOfAssignedProcesses"));
    public static VarHandle NumberOfAssignedProcesses$VH() {
        return _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH;
    }
    public static int NumberOfAssignedProcesses$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.get(seg);
    }
    public static void NumberOfAssignedProcesses$set( MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.set(seg, x);
    }
    public static int NumberOfAssignedProcesses$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfAssignedProcesses$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfAssignedProcesses$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfProcessIdsInList$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumberOfProcessIdsInList"));
    public static VarHandle NumberOfProcessIdsInList$VH() {
        return _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH;
    }
    public static int NumberOfProcessIdsInList$get(MemorySegment seg) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.get(seg);
    }
    public static void NumberOfProcessIdsInList$set( MemorySegment seg, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.set(seg, x);
    }
    public static int NumberOfProcessIdsInList$get(MemorySegment seg, long index) {
        return (int)_JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfProcessIdsInList$set(MemorySegment seg, long index, int x) {
        _JOBOBJECT_BASIC_PROCESS_ID_LIST.NumberOfProcessIdsInList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ProcessIdList$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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


