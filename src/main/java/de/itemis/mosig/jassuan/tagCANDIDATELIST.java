// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCANDIDATELIST {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwSize"),
        C_LONG.withName("dwStyle"),
        C_LONG.withName("dwCount"),
        C_LONG.withName("dwSelection"),
        C_LONG.withName("dwPageStart"),
        C_LONG.withName("dwPageSize"),
        MemoryLayout.sequenceLayout(1, C_LONG).withName("dwOffset")
    ).withName("tagCANDIDATELIST");
    public static MemoryLayout $LAYOUT() {
        return tagCANDIDATELIST.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return tagCANDIDATELIST.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)tagCANDIDATELIST.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        tagCANDIDATELIST.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATELIST.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        tagCANDIDATELIST.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return tagCANDIDATELIST.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)tagCANDIDATELIST.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        tagCANDIDATELIST.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATELIST.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        tagCANDIDATELIST.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwCount"));
    public static VarHandle dwCount$VH() {
        return tagCANDIDATELIST.dwCount$VH;
    }
    public static int dwCount$get(MemorySegment seg) {
        return (int)tagCANDIDATELIST.dwCount$VH.get(seg);
    }
    public static void dwCount$set( MemorySegment seg, int x) {
        tagCANDIDATELIST.dwCount$VH.set(seg, x);
    }
    public static int dwCount$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATELIST.dwCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCount$set(MemorySegment seg, long index, int x) {
        tagCANDIDATELIST.dwCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSelection$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSelection"));
    public static VarHandle dwSelection$VH() {
        return tagCANDIDATELIST.dwSelection$VH;
    }
    public static int dwSelection$get(MemorySegment seg) {
        return (int)tagCANDIDATELIST.dwSelection$VH.get(seg);
    }
    public static void dwSelection$set( MemorySegment seg, int x) {
        tagCANDIDATELIST.dwSelection$VH.set(seg, x);
    }
    public static int dwSelection$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATELIST.dwSelection$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSelection$set(MemorySegment seg, long index, int x) {
        tagCANDIDATELIST.dwSelection$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPageStart$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPageStart"));
    public static VarHandle dwPageStart$VH() {
        return tagCANDIDATELIST.dwPageStart$VH;
    }
    public static int dwPageStart$get(MemorySegment seg) {
        return (int)tagCANDIDATELIST.dwPageStart$VH.get(seg);
    }
    public static void dwPageStart$set( MemorySegment seg, int x) {
        tagCANDIDATELIST.dwPageStart$VH.set(seg, x);
    }
    public static int dwPageStart$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATELIST.dwPageStart$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPageStart$set(MemorySegment seg, long index, int x) {
        tagCANDIDATELIST.dwPageStart$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPageSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPageSize"));
    public static VarHandle dwPageSize$VH() {
        return tagCANDIDATELIST.dwPageSize$VH;
    }
    public static int dwPageSize$get(MemorySegment seg) {
        return (int)tagCANDIDATELIST.dwPageSize$VH.get(seg);
    }
    public static void dwPageSize$set( MemorySegment seg, int x) {
        tagCANDIDATELIST.dwPageSize$VH.set(seg, x);
    }
    public static int dwPageSize$get(MemorySegment seg, long index) {
        return (int)tagCANDIDATELIST.dwPageSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPageSize$set(MemorySegment seg, long index, int x) {
        tagCANDIDATELIST.dwPageSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment dwOffset$slice(MemorySegment seg) {
        return seg.asSlice(24, 4);
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


