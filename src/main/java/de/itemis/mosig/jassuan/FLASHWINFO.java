// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class FLASHWINFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwnd"),
        C_LONG.withName("dwFlags"),
        C_INT.withName("uCount"),
        C_LONG.withName("dwTimeout"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return FLASHWINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return FLASHWINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)FLASHWINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        FLASHWINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)FLASHWINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        FLASHWINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwnd$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwnd")));
    public static VarHandle hwnd$VH() {
        return FLASHWINFO.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)FLASHWINFO.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        FLASHWINFO.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)FLASHWINFO.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        FLASHWINFO.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return FLASHWINFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)FLASHWINFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        FLASHWINFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)FLASHWINFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        FLASHWINFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uCount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("uCount"));
    public static VarHandle uCount$VH() {
        return FLASHWINFO.uCount$VH;
    }
    public static int uCount$get(MemorySegment seg) {
        return (int)FLASHWINFO.uCount$VH.get(seg);
    }
    public static void uCount$set( MemorySegment seg, int x) {
        FLASHWINFO.uCount$VH.set(seg, x);
    }
    public static int uCount$get(MemorySegment seg, long index) {
        return (int)FLASHWINFO.uCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uCount$set(MemorySegment seg, long index, int x) {
        FLASHWINFO.uCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTimeout$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwTimeout"));
    public static VarHandle dwTimeout$VH() {
        return FLASHWINFO.dwTimeout$VH;
    }
    public static int dwTimeout$get(MemorySegment seg) {
        return (int)FLASHWINFO.dwTimeout$VH.get(seg);
    }
    public static void dwTimeout$set( MemorySegment seg, int x) {
        FLASHWINFO.dwTimeout$VH.set(seg, x);
    }
    public static int dwTimeout$get(MemorySegment seg, long index) {
        return (int)FLASHWINFO.dwTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTimeout$set(MemorySegment seg, long index, int x) {
        FLASHWINFO.dwTimeout$VH.set(seg.asSlice(index*sizeof()), x);
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


