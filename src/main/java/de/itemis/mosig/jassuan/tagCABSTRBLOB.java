// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCABSTRBLOB {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cElems"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pElems")
    ).withName("tagCABSTRBLOB");
    public static MemoryLayout $LAYOUT() {
        return tagCABSTRBLOB.$struct$LAYOUT;
    }
    static final VarHandle cElems$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cElems"));
    public static VarHandle cElems$VH() {
        return tagCABSTRBLOB.cElems$VH;
    }
    public static int cElems$get(MemorySegment seg) {
        return (int)tagCABSTRBLOB.cElems$VH.get(seg);
    }
    public static void cElems$set( MemorySegment seg, int x) {
        tagCABSTRBLOB.cElems$VH.set(seg, x);
    }
    public static int cElems$get(MemorySegment seg, long index) {
        return (int)tagCABSTRBLOB.cElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElems$set(MemorySegment seg, long index, int x) {
        tagCABSTRBLOB.cElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pElems$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pElems")));
    public static VarHandle pElems$VH() {
        return tagCABSTRBLOB.pElems$VH;
    }
    public static MemoryAddress pElems$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCABSTRBLOB.pElems$VH.get(seg);
    }
    public static void pElems$set( MemorySegment seg, MemoryAddress x) {
        tagCABSTRBLOB.pElems$VH.set(seg, x);
    }
    public static MemoryAddress pElems$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCABSTRBLOB.pElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pElems$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCABSTRBLOB.pElems$VH.set(seg.asSlice(index*sizeof()), x);
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


