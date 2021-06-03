// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagGESTUREINFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("cbSize"),
        C_LONG.withName("dwFlags"),
        C_LONG.withName("dwID"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwndTarget"),
        MemoryLayout.structLayout(
            C_SHORT.withName("x"),
            C_SHORT.withName("y")
        ).withName("ptsLocation"),
        C_LONG.withName("dwInstanceID"),
        C_LONG.withName("dwSequenceID"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("ullArguments"),
        C_INT.withName("cbExtraArgs"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagGESTUREINFO");
    public static MemoryLayout $LAYOUT() {
        return tagGESTUREINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagGESTUREINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagGESTUREINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagGESTUREINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagGESTUREINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagGESTUREINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagGESTUREINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagGESTUREINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagGESTUREINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagGESTUREINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagGESTUREINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwID"));
    public static VarHandle dwID$VH() {
        return tagGESTUREINFO.dwID$VH;
    }
    public static int dwID$get(MemorySegment seg) {
        return (int)tagGESTUREINFO.dwID$VH.get(seg);
    }
    public static void dwID$set( MemorySegment seg, int x) {
        tagGESTUREINFO.dwID$VH.set(seg, x);
    }
    public static int dwID$get(MemorySegment seg, long index) {
        return (int)tagGESTUREINFO.dwID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwID$set(MemorySegment seg, long index, int x) {
        tagGESTUREINFO.dwID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndTarget$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndTarget")));
    public static VarHandle hwndTarget$VH() {
        return tagGESTUREINFO.hwndTarget$VH;
    }
    public static MemoryAddress hwndTarget$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagGESTUREINFO.hwndTarget$VH.get(seg);
    }
    public static void hwndTarget$set( MemorySegment seg, MemoryAddress x) {
        tagGESTUREINFO.hwndTarget$VH.set(seg, x);
    }
    public static MemoryAddress hwndTarget$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagGESTUREINFO.hwndTarget$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndTarget$set(MemorySegment seg, long index, MemoryAddress x) {
        tagGESTUREINFO.hwndTarget$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ptsLocation$slice(MemorySegment seg) {
        return seg.asSlice(24, 4);
    }
    static final VarHandle dwInstanceID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwInstanceID"));
    public static VarHandle dwInstanceID$VH() {
        return tagGESTUREINFO.dwInstanceID$VH;
    }
    public static int dwInstanceID$get(MemorySegment seg) {
        return (int)tagGESTUREINFO.dwInstanceID$VH.get(seg);
    }
    public static void dwInstanceID$set( MemorySegment seg, int x) {
        tagGESTUREINFO.dwInstanceID$VH.set(seg, x);
    }
    public static int dwInstanceID$get(MemorySegment seg, long index) {
        return (int)tagGESTUREINFO.dwInstanceID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInstanceID$set(MemorySegment seg, long index, int x) {
        tagGESTUREINFO.dwInstanceID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSequenceID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSequenceID"));
    public static VarHandle dwSequenceID$VH() {
        return tagGESTUREINFO.dwSequenceID$VH;
    }
    public static int dwSequenceID$get(MemorySegment seg) {
        return (int)tagGESTUREINFO.dwSequenceID$VH.get(seg);
    }
    public static void dwSequenceID$set( MemorySegment seg, int x) {
        tagGESTUREINFO.dwSequenceID$VH.set(seg, x);
    }
    public static int dwSequenceID$get(MemorySegment seg, long index) {
        return (int)tagGESTUREINFO.dwSequenceID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSequenceID$set(MemorySegment seg, long index, int x) {
        tagGESTUREINFO.dwSequenceID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ullArguments$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ullArguments"));
    public static VarHandle ullArguments$VH() {
        return tagGESTUREINFO.ullArguments$VH;
    }
    public static long ullArguments$get(MemorySegment seg) {
        return (long)tagGESTUREINFO.ullArguments$VH.get(seg);
    }
    public static void ullArguments$set( MemorySegment seg, long x) {
        tagGESTUREINFO.ullArguments$VH.set(seg, x);
    }
    public static long ullArguments$get(MemorySegment seg, long index) {
        return (long)tagGESTUREINFO.ullArguments$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ullArguments$set(MemorySegment seg, long index, long x) {
        tagGESTUREINFO.ullArguments$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbExtraArgs$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbExtraArgs"));
    public static VarHandle cbExtraArgs$VH() {
        return tagGESTUREINFO.cbExtraArgs$VH;
    }
    public static int cbExtraArgs$get(MemorySegment seg) {
        return (int)tagGESTUREINFO.cbExtraArgs$VH.get(seg);
    }
    public static void cbExtraArgs$set( MemorySegment seg, int x) {
        tagGESTUREINFO.cbExtraArgs$VH.set(seg, x);
    }
    public static int cbExtraArgs$get(MemorySegment seg, long index) {
        return (int)tagGESTUREINFO.cbExtraArgs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbExtraArgs$set(MemorySegment seg, long index, int x) {
        tagGESTUREINFO.cbExtraArgs$VH.set(seg.asSlice(index*sizeof()), x);
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


