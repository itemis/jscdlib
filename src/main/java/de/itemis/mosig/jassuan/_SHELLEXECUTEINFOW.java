// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SHELLEXECUTEINFOW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("fMask"),
        C_POINTER.withName("hwnd"),
        C_POINTER.withName("lpVerb"),
        C_POINTER.withName("lpFile"),
        C_POINTER.withName("lpParameters"),
        C_POINTER.withName("lpDirectory"),
        C_INT.withName("nShow"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hInstApp"),
        C_POINTER.withName("lpIDList"),
        C_POINTER.withName("lpClass"),
        C_POINTER.withName("hkeyClass"),
        C_LONG.withName("dwHotKey"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            C_POINTER.withName("hIcon"),
            C_POINTER.withName("hMonitor")
        ).withName("$anon$0"),
        C_POINTER.withName("hProcess")
    ).withName("_SHELLEXECUTEINFOW");
    public static MemoryLayout $LAYOUT() {
        return _SHELLEXECUTEINFOW.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SHELLEXECUTEINFOW.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SHELLEXECUTEINFOW.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _SHELLEXECUTEINFOW.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SHELLEXECUTEINFOW.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SHELLEXECUTEINFOW.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fMask"));
    public static VarHandle fMask$VH() {
        return _SHELLEXECUTEINFOW.fMask$VH;
    }
    public static int fMask$get(MemorySegment seg) {
        return (int)_SHELLEXECUTEINFOW.fMask$VH.get(seg);
    }
    public static void fMask$set( MemorySegment seg, int x) {
        _SHELLEXECUTEINFOW.fMask$VH.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)_SHELLEXECUTEINFOW.fMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        _SHELLEXECUTEINFOW.fMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwnd$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwnd")));
    public static VarHandle hwnd$VH() {
        return _SHELLEXECUTEINFOW.hwnd$VH;
    }
    public static MemoryAddress hwnd$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hwnd$VH.get(seg);
    }
    public static void hwnd$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hwnd$VH.set(seg, x);
    }
    public static MemoryAddress hwnd$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hwnd$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwnd$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hwnd$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpVerb$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpVerb")));
    public static VarHandle lpVerb$VH() {
        return _SHELLEXECUTEINFOW.lpVerb$VH;
    }
    public static MemoryAddress lpVerb$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpVerb$VH.get(seg);
    }
    public static void lpVerb$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpVerb$VH.set(seg, x);
    }
    public static MemoryAddress lpVerb$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpVerb$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVerb$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpVerb$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpFile$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpFile")));
    public static VarHandle lpFile$VH() {
        return _SHELLEXECUTEINFOW.lpFile$VH;
    }
    public static MemoryAddress lpFile$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpFile$VH.get(seg);
    }
    public static void lpFile$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpFile$VH.set(seg, x);
    }
    public static MemoryAddress lpFile$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpParameters$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpParameters")));
    public static VarHandle lpParameters$VH() {
        return _SHELLEXECUTEINFOW.lpParameters$VH;
    }
    public static MemoryAddress lpParameters$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpParameters$VH.get(seg);
    }
    public static void lpParameters$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpParameters$VH.set(seg, x);
    }
    public static MemoryAddress lpParameters$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpParameters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpParameters$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpParameters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDirectory$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpDirectory")));
    public static VarHandle lpDirectory$VH() {
        return _SHELLEXECUTEINFOW.lpDirectory$VH;
    }
    public static MemoryAddress lpDirectory$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpDirectory$VH.get(seg);
    }
    public static void lpDirectory$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpDirectory$VH.set(seg, x);
    }
    public static MemoryAddress lpDirectory$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDirectory$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nShow$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nShow"));
    public static VarHandle nShow$VH() {
        return _SHELLEXECUTEINFOW.nShow$VH;
    }
    public static int nShow$get(MemorySegment seg) {
        return (int)_SHELLEXECUTEINFOW.nShow$VH.get(seg);
    }
    public static void nShow$set( MemorySegment seg, int x) {
        _SHELLEXECUTEINFOW.nShow$VH.set(seg, x);
    }
    public static int nShow$get(MemorySegment seg, long index) {
        return (int)_SHELLEXECUTEINFOW.nShow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nShow$set(MemorySegment seg, long index, int x) {
        _SHELLEXECUTEINFOW.nShow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstApp$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hInstApp")));
    public static VarHandle hInstApp$VH() {
        return _SHELLEXECUTEINFOW.hInstApp$VH;
    }
    public static MemoryAddress hInstApp$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hInstApp$VH.get(seg);
    }
    public static void hInstApp$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hInstApp$VH.set(seg, x);
    }
    public static MemoryAddress hInstApp$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hInstApp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstApp$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hInstApp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpIDList$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpIDList")));
    public static VarHandle lpIDList$VH() {
        return _SHELLEXECUTEINFOW.lpIDList$VH;
    }
    public static MemoryAddress lpIDList$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpIDList$VH.get(seg);
    }
    public static void lpIDList$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpIDList$VH.set(seg, x);
    }
    public static MemoryAddress lpIDList$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpIDList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpIDList$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpIDList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpClass$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpClass")));
    public static VarHandle lpClass$VH() {
        return _SHELLEXECUTEINFOW.lpClass$VH;
    }
    public static MemoryAddress lpClass$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpClass$VH.get(seg);
    }
    public static void lpClass$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpClass$VH.set(seg, x);
    }
    public static MemoryAddress lpClass$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.lpClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpClass$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.lpClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hkeyClass$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hkeyClass")));
    public static VarHandle hkeyClass$VH() {
        return _SHELLEXECUTEINFOW.hkeyClass$VH;
    }
    public static MemoryAddress hkeyClass$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hkeyClass$VH.get(seg);
    }
    public static void hkeyClass$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hkeyClass$VH.set(seg, x);
    }
    public static MemoryAddress hkeyClass$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hkeyClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hkeyClass$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hkeyClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHotKey$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwHotKey"));
    public static VarHandle dwHotKey$VH() {
        return _SHELLEXECUTEINFOW.dwHotKey$VH;
    }
    public static int dwHotKey$get(MemorySegment seg) {
        return (int)_SHELLEXECUTEINFOW.dwHotKey$VH.get(seg);
    }
    public static void dwHotKey$set( MemorySegment seg, int x) {
        _SHELLEXECUTEINFOW.dwHotKey$VH.set(seg, x);
    }
    public static int dwHotKey$get(MemorySegment seg, long index) {
        return (int)_SHELLEXECUTEINFOW.dwHotKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHotKey$set(MemorySegment seg, long index, int x) {
        _SHELLEXECUTEINFOW.dwHotKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hIcon")));
    public static VarHandle hIcon$VH() {
        return _SHELLEXECUTEINFOW.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hMonitor$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("hMonitor")));
    public static VarHandle hMonitor$VH() {
        return _SHELLEXECUTEINFOW.hMonitor$VH;
    }
    public static MemoryAddress hMonitor$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hMonitor$VH.get(seg);
    }
    public static void hMonitor$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hMonitor$VH.set(seg, x);
    }
    public static MemoryAddress hMonitor$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hMonitor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hMonitor$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hMonitor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hProcess$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hProcess")));
    public static VarHandle hProcess$VH() {
        return _SHELLEXECUTEINFOW.hProcess$VH;
    }
    public static MemoryAddress hProcess$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hProcess$VH.get(seg);
    }
    public static void hProcess$set( MemorySegment seg, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hProcess$VH.set(seg, x);
    }
    public static MemoryAddress hProcess$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SHELLEXECUTEINFOW.hProcess$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hProcess$set(MemorySegment seg, long index, MemoryAddress x) {
        _SHELLEXECUTEINFOW.hProcess$VH.set(seg.asSlice(index*sizeof()), x);
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


