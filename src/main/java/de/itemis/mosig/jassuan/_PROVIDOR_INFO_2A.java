// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PROVIDOR_INFO_2A {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pOrder")
    ).withName("_PROVIDOR_INFO_2A");
    public static MemoryLayout $LAYOUT() {
        return _PROVIDOR_INFO_2A.$struct$LAYOUT;
    }
    static final VarHandle pOrder$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pOrder")));
    public static VarHandle pOrder$VH() {
        return _PROVIDOR_INFO_2A.pOrder$VH;
    }
    public static MemoryAddress pOrder$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PROVIDOR_INFO_2A.pOrder$VH.get(seg);
    }
    public static void pOrder$set( MemorySegment seg, MemoryAddress x) {
        _PROVIDOR_INFO_2A.pOrder$VH.set(seg, x);
    }
    public static MemoryAddress pOrder$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PROVIDOR_INFO_2A.pOrder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOrder$set(MemorySegment seg, long index, MemoryAddress x) {
        _PROVIDOR_INFO_2A.pOrder$VH.set(seg.asSlice(index*sizeof()), x);
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


