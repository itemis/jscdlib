// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCBT_CREATEWNDW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("lpcs"),
        C_POINTER.withName("hwndInsertAfter")
    ).withName("tagCBT_CREATEWNDW");
    public static MemoryLayout $LAYOUT() {
        return tagCBT_CREATEWNDW.$struct$LAYOUT;
    }
    static final VarHandle lpcs$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpcs")));
    public static VarHandle lpcs$VH() {
        return tagCBT_CREATEWNDW.lpcs$VH;
    }
    public static MemoryAddress lpcs$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCBT_CREATEWNDW.lpcs$VH.get(seg);
    }
    public static void lpcs$set( MemorySegment seg, MemoryAddress x) {
        tagCBT_CREATEWNDW.lpcs$VH.set(seg, x);
    }
    public static MemoryAddress lpcs$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCBT_CREATEWNDW.lpcs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpcs$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCBT_CREATEWNDW.lpcs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndInsertAfter$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndInsertAfter")));
    public static VarHandle hwndInsertAfter$VH() {
        return tagCBT_CREATEWNDW.hwndInsertAfter$VH;
    }
    public static MemoryAddress hwndInsertAfter$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCBT_CREATEWNDW.hwndInsertAfter$VH.get(seg);
    }
    public static void hwndInsertAfter$set( MemorySegment seg, MemoryAddress x) {
        tagCBT_CREATEWNDW.hwndInsertAfter$VH.set(seg, x);
    }
    public static MemoryAddress hwndInsertAfter$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCBT_CREATEWNDW.hwndInsertAfter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndInsertAfter$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCBT_CREATEWNDW.hwndInsertAfter$VH.set(seg.asSlice(index*sizeof()), x);
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


