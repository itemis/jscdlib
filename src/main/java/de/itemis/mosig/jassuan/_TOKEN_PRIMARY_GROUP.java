// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _TOKEN_PRIMARY_GROUP {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("PrimaryGroup")
    ).withName("_TOKEN_PRIMARY_GROUP");
    public static MemoryLayout $LAYOUT() {
        return _TOKEN_PRIMARY_GROUP.$struct$LAYOUT;
    }
    static final VarHandle PrimaryGroup$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("PrimaryGroup")));
    public static VarHandle PrimaryGroup$VH() {
        return _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH;
    }
    public static MemoryAddress PrimaryGroup$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.get(seg);
    }
    public static void PrimaryGroup$set( MemorySegment seg, MemoryAddress x) {
        _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.set(seg, x);
    }
    public static MemoryAddress PrimaryGroup$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrimaryGroup$set(MemorySegment seg, long index, MemoryAddress x) {
        _TOKEN_PRIMARY_GROUP.PrimaryGroup$VH.set(seg.asSlice(index*sizeof()), x);
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


