// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagRID_DEVICE_INFO_MOUSE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwId"),
        C_LONG.withName("dwNumberOfButtons"),
        C_LONG.withName("dwSampleRate"),
        C_INT.withName("fHasHorizontalWheel")
    ).withName("tagRID_DEVICE_INFO_MOUSE");
    public static MemoryLayout $LAYOUT() {
        return tagRID_DEVICE_INFO_MOUSE.$struct$LAYOUT;
    }
    static final VarHandle dwId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwId"));
    public static VarHandle dwId$VH() {
        return tagRID_DEVICE_INFO_MOUSE.dwId$VH;
    }
    public static int dwId$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_MOUSE.dwId$VH.get(seg);
    }
    public static void dwId$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_MOUSE.dwId$VH.set(seg, x);
    }
    public static int dwId$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_MOUSE.dwId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwId$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_MOUSE.dwId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfButtons$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNumberOfButtons"));
    public static VarHandle dwNumberOfButtons$VH() {
        return tagRID_DEVICE_INFO_MOUSE.dwNumberOfButtons$VH;
    }
    public static int dwNumberOfButtons$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_MOUSE.dwNumberOfButtons$VH.get(seg);
    }
    public static void dwNumberOfButtons$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_MOUSE.dwNumberOfButtons$VH.set(seg, x);
    }
    public static int dwNumberOfButtons$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_MOUSE.dwNumberOfButtons$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfButtons$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_MOUSE.dwNumberOfButtons$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSampleRate$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSampleRate"));
    public static VarHandle dwSampleRate$VH() {
        return tagRID_DEVICE_INFO_MOUSE.dwSampleRate$VH;
    }
    public static int dwSampleRate$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_MOUSE.dwSampleRate$VH.get(seg);
    }
    public static void dwSampleRate$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_MOUSE.dwSampleRate$VH.set(seg, x);
    }
    public static int dwSampleRate$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_MOUSE.dwSampleRate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSampleRate$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_MOUSE.dwSampleRate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fHasHorizontalWheel$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fHasHorizontalWheel"));
    public static VarHandle fHasHorizontalWheel$VH() {
        return tagRID_DEVICE_INFO_MOUSE.fHasHorizontalWheel$VH;
    }
    public static int fHasHorizontalWheel$get(MemorySegment seg) {
        return (int)tagRID_DEVICE_INFO_MOUSE.fHasHorizontalWheel$VH.get(seg);
    }
    public static void fHasHorizontalWheel$set( MemorySegment seg, int x) {
        tagRID_DEVICE_INFO_MOUSE.fHasHorizontalWheel$VH.set(seg, x);
    }
    public static int fHasHorizontalWheel$get(MemorySegment seg, long index) {
        return (int)tagRID_DEVICE_INFO_MOUSE.fHasHorizontalWheel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fHasHorizontalWheel$set(MemorySegment seg, long index, int x) {
        tagRID_DEVICE_INFO_MOUSE.fHasHorizontalWheel$VH.set(seg.asSlice(index*sizeof()), x);
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


