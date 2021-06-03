// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _DRAGINFOA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("uSize"),
        MemoryLayout.structLayout(
            C_LONG.withName("x"),
            C_LONG.withName("y")
        ).withName("pt"),
        C_INT.withName("fNC"),
        C_POINTER.withName("lpFileList"),
        C_LONG.withName("grfKeyState"),
        MemoryLayout.paddingLayout(32)
    ).withName("_DRAGINFOA");
    public static MemoryLayout $LAYOUT() {
        return _DRAGINFOA.$struct$LAYOUT;
    }
    static final VarHandle uSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("uSize"));
    public static VarHandle uSize$VH() {
        return _DRAGINFOA.uSize$VH;
    }
    public static int uSize$get(MemorySegment seg) {
        return (int)_DRAGINFOA.uSize$VH.get(seg);
    }
    public static void uSize$set( MemorySegment seg, int x) {
        _DRAGINFOA.uSize$VH.set(seg, x);
    }
    public static int uSize$get(MemorySegment seg, long index) {
        return (int)_DRAGINFOA.uSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uSize$set(MemorySegment seg, long index, int x) {
        _DRAGINFOA.uSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment pt$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }
    static final VarHandle fNC$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fNC"));
    public static VarHandle fNC$VH() {
        return _DRAGINFOA.fNC$VH;
    }
    public static int fNC$get(MemorySegment seg) {
        return (int)_DRAGINFOA.fNC$VH.get(seg);
    }
    public static void fNC$set( MemorySegment seg, int x) {
        _DRAGINFOA.fNC$VH.set(seg, x);
    }
    public static int fNC$get(MemorySegment seg, long index) {
        return (int)_DRAGINFOA.fNC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fNC$set(MemorySegment seg, long index, int x) {
        _DRAGINFOA.fNC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpFileList$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpFileList")));
    public static VarHandle lpFileList$VH() {
        return _DRAGINFOA.lpFileList$VH;
    }
    public static MemoryAddress lpFileList$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DRAGINFOA.lpFileList$VH.get(seg);
    }
    public static void lpFileList$set( MemorySegment seg, MemoryAddress x) {
        _DRAGINFOA.lpFileList$VH.set(seg, x);
    }
    public static MemoryAddress lpFileList$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DRAGINFOA.lpFileList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpFileList$set(MemorySegment seg, long index, MemoryAddress x) {
        _DRAGINFOA.lpFileList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfKeyState$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("grfKeyState"));
    public static VarHandle grfKeyState$VH() {
        return _DRAGINFOA.grfKeyState$VH;
    }
    public static int grfKeyState$get(MemorySegment seg) {
        return (int)_DRAGINFOA.grfKeyState$VH.get(seg);
    }
    public static void grfKeyState$set( MemorySegment seg, int x) {
        _DRAGINFOA.grfKeyState$VH.set(seg, x);
    }
    public static int grfKeyState$get(MemorySegment seg, long index) {
        return (int)_DRAGINFOA.grfKeyState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfKeyState$set(MemorySegment seg, long index, int x) {
        _DRAGINFOA.grfKeyState$VH.set(seg.asSlice(index*sizeof()), x);
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


