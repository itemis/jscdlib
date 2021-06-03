// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _DISPLAY_DEVICEW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cb"),
        MemoryLayout.sequenceLayout(32, C_SHORT).withName("DeviceName"),
        MemoryLayout.sequenceLayout(128, C_SHORT).withName("DeviceString"),
        C_LONG.withName("StateFlags"),
        MemoryLayout.sequenceLayout(128, C_SHORT).withName("DeviceID"),
        MemoryLayout.sequenceLayout(128, C_SHORT).withName("DeviceKey")
    ).withName("_DISPLAY_DEVICEW");
    public static MemoryLayout $LAYOUT() {
        return _DISPLAY_DEVICEW.$struct$LAYOUT;
    }
    static final VarHandle cb$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cb"));
    public static VarHandle cb$VH() {
        return _DISPLAY_DEVICEW.cb$VH;
    }
    public static int cb$get(MemorySegment seg) {
        return (int)_DISPLAY_DEVICEW.cb$VH.get(seg);
    }
    public static void cb$set( MemorySegment seg, int x) {
        _DISPLAY_DEVICEW.cb$VH.set(seg, x);
    }
    public static int cb$get(MemorySegment seg, long index) {
        return (int)_DISPLAY_DEVICEW.cb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cb$set(MemorySegment seg, long index, int x) {
        _DISPLAY_DEVICEW.cb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DeviceName$slice(MemorySegment seg) {
        return seg.asSlice(4, 64);
    }
    public static MemorySegment DeviceString$slice(MemorySegment seg) {
        return seg.asSlice(68, 256);
    }
    static final VarHandle StateFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("StateFlags"));
    public static VarHandle StateFlags$VH() {
        return _DISPLAY_DEVICEW.StateFlags$VH;
    }
    public static int StateFlags$get(MemorySegment seg) {
        return (int)_DISPLAY_DEVICEW.StateFlags$VH.get(seg);
    }
    public static void StateFlags$set( MemorySegment seg, int x) {
        _DISPLAY_DEVICEW.StateFlags$VH.set(seg, x);
    }
    public static int StateFlags$get(MemorySegment seg, long index) {
        return (int)_DISPLAY_DEVICEW.StateFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StateFlags$set(MemorySegment seg, long index, int x) {
        _DISPLAY_DEVICEW.StateFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment DeviceID$slice(MemorySegment seg) {
        return seg.asSlice(328, 256);
    }
    public static MemorySegment DeviceKey$slice(MemorySegment seg) {
        return seg.asSlice(584, 256);
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


