// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCAI {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cElems"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pElems")
    ).withName("tagCAI");
    public static MemoryLayout $LAYOUT() {
        return tagCAI.$struct$LAYOUT;
    }
    static final VarHandle cElems$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cElems"));
    public static VarHandle cElems$VH() {
        return tagCAI.cElems$VH;
    }
    public static int cElems$get(MemorySegment seg) {
        return (int)tagCAI.cElems$VH.get(seg);
    }
    public static void cElems$set( MemorySegment seg, int x) {
        tagCAI.cElems$VH.set(seg, x);
    }
    public static int cElems$get(MemorySegment seg, long index) {
        return (int)tagCAI.cElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cElems$set(MemorySegment seg, long index, int x) {
        tagCAI.cElems$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pElems$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pElems")));
    public static VarHandle pElems$VH() {
        return tagCAI.pElems$VH;
    }
    public static MemoryAddress pElems$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCAI.pElems$VH.get(seg);
    }
    public static void pElems$set( MemorySegment seg, MemoryAddress x) {
        tagCAI.pElems$VH.set(seg, x);
    }
    public static MemoryAddress pElems$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCAI.pElems$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pElems$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCAI.pElems$VH.set(seg.asSlice(index*sizeof()), x);
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


