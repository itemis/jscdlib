// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IReleaseMarshalBuffers {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("lpVtbl")
    ).withName("IReleaseMarshalBuffers");
    public static MemoryLayout $LAYOUT() {
        return IReleaseMarshalBuffers.$struct$LAYOUT;
    }
    static final VarHandle lpVtbl$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpVtbl")));
    public static VarHandle lpVtbl$VH() {
        return IReleaseMarshalBuffers.lpVtbl$VH;
    }
    public static MemoryAddress lpVtbl$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IReleaseMarshalBuffers.lpVtbl$VH.get(seg);
    }
    public static void lpVtbl$set( MemorySegment seg, MemoryAddress x) {
        IReleaseMarshalBuffers.lpVtbl$VH.set(seg, x);
    }
    public static MemoryAddress lpVtbl$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IReleaseMarshalBuffers.lpVtbl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVtbl$set(MemorySegment seg, long index, MemoryAddress x) {
        IReleaseMarshalBuffers.lpVtbl$VH.set(seg.asSlice(index*sizeof()), x);
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


