// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMCI_OVLY_WINDOW_PARMSW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("dwCallback"),
        C_POINTER.withName("hWnd"),
        C_INT.withName("nCmdShow"),
        C_POINTER.withName("lpstrText")
    ).withName("tagMCI_OVLY_WINDOW_PARMSW");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_OVLY_WINDOW_PARMSW.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_OVLY_WINDOW_PARMSW.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_OVLY_WINDOW_PARMSW.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_OVLY_WINDOW_PARMSW.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_OVLY_WINDOW_PARMSW.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_OVLY_WINDOW_PARMSW.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hWnd$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hWnd")));
    public static VarHandle hWnd$VH() {
        return tagMCI_OVLY_WINDOW_PARMSW.hWnd$VH;
    }
    public static MemoryAddress hWnd$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSW.hWnd$VH.get(seg);
    }
    public static void hWnd$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSW.hWnd$VH.set(seg, x);
    }
    public static MemoryAddress hWnd$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSW.hWnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hWnd$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSW.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCmdShow$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nCmdShow"));
    public static VarHandle nCmdShow$VH() {
        return tagMCI_OVLY_WINDOW_PARMSW.nCmdShow$VH;
    }
    public static int nCmdShow$get(MemorySegment seg) {
        return (int)tagMCI_OVLY_WINDOW_PARMSW.nCmdShow$VH.get(seg);
    }
    public static void nCmdShow$set( MemorySegment seg, int x) {
        tagMCI_OVLY_WINDOW_PARMSW.nCmdShow$VH.set(seg, x);
    }
    public static int nCmdShow$get(MemorySegment seg, long index) {
        return (int)tagMCI_OVLY_WINDOW_PARMSW.nCmdShow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCmdShow$set(MemorySegment seg, long index, int x) {
        tagMCI_OVLY_WINDOW_PARMSW.nCmdShow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrText$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrText")));
    public static VarHandle lpstrText$VH() {
        return tagMCI_OVLY_WINDOW_PARMSW.lpstrText$VH;
    }
    public static MemoryAddress lpstrText$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSW.lpstrText$VH.get(seg);
    }
    public static void lpstrText$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSW.lpstrText$VH.set(seg, x);
    }
    public static MemoryAddress lpstrText$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OVLY_WINDOW_PARMSW.lpstrText$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrText$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OVLY_WINDOW_PARMSW.lpstrText$VH.set(seg.asSlice(index*sizeof()), x);
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


