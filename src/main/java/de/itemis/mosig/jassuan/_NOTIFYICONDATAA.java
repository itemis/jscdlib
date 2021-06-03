// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _NOTIFYICONDATAA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hWnd"),
        C_INT.withName("uID"),
        C_INT.withName("uFlags"),
        C_INT.withName("uCallbackMessage"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hIcon"),
        MemoryLayout.sequenceLayout(128, C_CHAR).withName("szTip"),
        C_LONG.withName("dwState"),
        C_LONG.withName("dwStateMask"),
        MemoryLayout.sequenceLayout(256, C_CHAR).withName("szInfo"),
        MemoryLayout.unionLayout(
            C_INT.withName("uTimeout"),
            C_INT.withName("uVersion")
        ).withName("$anon$0"),
        MemoryLayout.sequenceLayout(64, C_CHAR).withName("szInfoTitle"),
        C_LONG.withName("dwInfoFlags"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("guidItem"),
        C_POINTER.withName("hBalloonIcon")
    ).withName("_NOTIFYICONDATAA");
    public static MemoryLayout $LAYOUT() {
        return _NOTIFYICONDATAA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _NOTIFYICONDATAA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hWnd$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hWnd")));
    public static VarHandle hWnd$VH() {
        return _NOTIFYICONDATAA.hWnd$VH;
    }
    public static MemoryAddress hWnd$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NOTIFYICONDATAA.hWnd$VH.get(seg);
    }
    public static void hWnd$set( MemorySegment seg, MemoryAddress x) {
        _NOTIFYICONDATAA.hWnd$VH.set(seg, x);
    }
    public static MemoryAddress hWnd$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NOTIFYICONDATAA.hWnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hWnd$set(MemorySegment seg, long index, MemoryAddress x) {
        _NOTIFYICONDATAA.hWnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("uID"));
    public static VarHandle uID$VH() {
        return _NOTIFYICONDATAA.uID$VH;
    }
    public static int uID$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.uID$VH.get(seg);
    }
    public static void uID$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.uID$VH.set(seg, x);
    }
    public static int uID$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.uID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uID$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.uID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("uFlags"));
    public static VarHandle uFlags$VH() {
        return _NOTIFYICONDATAA.uFlags$VH;
    }
    public static int uFlags$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.uFlags$VH.get(seg);
    }
    public static void uFlags$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.uFlags$VH.set(seg, x);
    }
    public static int uFlags$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.uFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uFlags$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.uFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uCallbackMessage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("uCallbackMessage"));
    public static VarHandle uCallbackMessage$VH() {
        return _NOTIFYICONDATAA.uCallbackMessage$VH;
    }
    public static int uCallbackMessage$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.uCallbackMessage$VH.get(seg);
    }
    public static void uCallbackMessage$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.uCallbackMessage$VH.set(seg, x);
    }
    public static int uCallbackMessage$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.uCallbackMessage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uCallbackMessage$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.uCallbackMessage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hIcon")));
    public static VarHandle hIcon$VH() {
        return _NOTIFYICONDATAA.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NOTIFYICONDATAA.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _NOTIFYICONDATAA.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NOTIFYICONDATAA.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _NOTIFYICONDATAA.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szTip$slice(MemorySegment seg) {
        return seg.asSlice(40, 128);
    }
    static final VarHandle dwState$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwState"));
    public static VarHandle dwState$VH() {
        return _NOTIFYICONDATAA.dwState$VH;
    }
    public static int dwState$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.dwState$VH.get(seg);
    }
    public static void dwState$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.dwState$VH.set(seg, x);
    }
    public static int dwState$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.dwState$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwState$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.dwState$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStateMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwStateMask"));
    public static VarHandle dwStateMask$VH() {
        return _NOTIFYICONDATAA.dwStateMask$VH;
    }
    public static int dwStateMask$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.dwStateMask$VH.get(seg);
    }
    public static void dwStateMask$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.dwStateMask$VH.set(seg, x);
    }
    public static int dwStateMask$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.dwStateMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStateMask$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.dwStateMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szInfo$slice(MemorySegment seg) {
        return seg.asSlice(176, 256);
    }
    static final VarHandle uTimeout$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("uTimeout"));
    public static VarHandle uTimeout$VH() {
        return _NOTIFYICONDATAA.uTimeout$VH;
    }
    public static int uTimeout$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.uTimeout$VH.get(seg);
    }
    public static void uTimeout$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.uTimeout$VH.set(seg, x);
    }
    public static int uTimeout$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.uTimeout$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uTimeout$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.uTimeout$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle uVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("uVersion"));
    public static VarHandle uVersion$VH() {
        return _NOTIFYICONDATAA.uVersion$VH;
    }
    public static int uVersion$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.uVersion$VH.get(seg);
    }
    public static void uVersion$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.uVersion$VH.set(seg, x);
    }
    public static int uVersion$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.uVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void uVersion$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.uVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szInfoTitle$slice(MemorySegment seg) {
        return seg.asSlice(436, 64);
    }
    static final VarHandle dwInfoFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwInfoFlags"));
    public static VarHandle dwInfoFlags$VH() {
        return _NOTIFYICONDATAA.dwInfoFlags$VH;
    }
    public static int dwInfoFlags$get(MemorySegment seg) {
        return (int)_NOTIFYICONDATAA.dwInfoFlags$VH.get(seg);
    }
    public static void dwInfoFlags$set( MemorySegment seg, int x) {
        _NOTIFYICONDATAA.dwInfoFlags$VH.set(seg, x);
    }
    public static int dwInfoFlags$get(MemorySegment seg, long index) {
        return (int)_NOTIFYICONDATAA.dwInfoFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwInfoFlags$set(MemorySegment seg, long index, int x) {
        _NOTIFYICONDATAA.dwInfoFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment guidItem$slice(MemorySegment seg) {
        return seg.asSlice(504, 16);
    }
    static final VarHandle hBalloonIcon$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hBalloonIcon")));
    public static VarHandle hBalloonIcon$VH() {
        return _NOTIFYICONDATAA.hBalloonIcon$VH;
    }
    public static MemoryAddress hBalloonIcon$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NOTIFYICONDATAA.hBalloonIcon$VH.get(seg);
    }
    public static void hBalloonIcon$set( MemorySegment seg, MemoryAddress x) {
        _NOTIFYICONDATAA.hBalloonIcon$VH.set(seg, x);
    }
    public static MemoryAddress hBalloonIcon$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NOTIFYICONDATAA.hBalloonIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hBalloonIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _NOTIFYICONDATAA.hBalloonIcon$VH.set(seg.asSlice(index*sizeof()), x);
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


