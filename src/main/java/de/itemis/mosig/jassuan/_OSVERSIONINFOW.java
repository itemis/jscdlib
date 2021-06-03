// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _OSVERSIONINFOW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwOSVersionInfoSize"),
        C_LONG.withName("dwMajorVersion"),
        C_LONG.withName("dwMinorVersion"),
        C_LONG.withName("dwBuildNumber"),
        C_LONG.withName("dwPlatformId"),
        MemoryLayout.sequenceLayout(128, C_SHORT).withName("szCSDVersion")
    ).withName("_OSVERSIONINFOW");
    public static MemoryLayout $LAYOUT() {
        return _OSVERSIONINFOW.$struct$LAYOUT;
    }
    static final VarHandle dwOSVersionInfoSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwOSVersionInfoSize"));
    public static VarHandle dwOSVersionInfoSize$VH() {
        return _OSVERSIONINFOW.dwOSVersionInfoSize$VH;
    }
    public static int dwOSVersionInfoSize$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOW.dwOSVersionInfoSize$VH.get(seg);
    }
    public static void dwOSVersionInfoSize$set( MemorySegment seg, int x) {
        _OSVERSIONINFOW.dwOSVersionInfoSize$VH.set(seg, x);
    }
    public static int dwOSVersionInfoSize$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOW.dwOSVersionInfoSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOSVersionInfoSize$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOW.dwOSVersionInfoSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMajorVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMajorVersion"));
    public static VarHandle dwMajorVersion$VH() {
        return _OSVERSIONINFOW.dwMajorVersion$VH;
    }
    public static int dwMajorVersion$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOW.dwMajorVersion$VH.get(seg);
    }
    public static void dwMajorVersion$set( MemorySegment seg, int x) {
        _OSVERSIONINFOW.dwMajorVersion$VH.set(seg, x);
    }
    public static int dwMajorVersion$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOW.dwMajorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMajorVersion$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOW.dwMajorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMinorVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMinorVersion"));
    public static VarHandle dwMinorVersion$VH() {
        return _OSVERSIONINFOW.dwMinorVersion$VH;
    }
    public static int dwMinorVersion$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOW.dwMinorVersion$VH.get(seg);
    }
    public static void dwMinorVersion$set( MemorySegment seg, int x) {
        _OSVERSIONINFOW.dwMinorVersion$VH.set(seg, x);
    }
    public static int dwMinorVersion$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOW.dwMinorVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMinorVersion$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOW.dwMinorVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBuildNumber$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwBuildNumber"));
    public static VarHandle dwBuildNumber$VH() {
        return _OSVERSIONINFOW.dwBuildNumber$VH;
    }
    public static int dwBuildNumber$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOW.dwBuildNumber$VH.get(seg);
    }
    public static void dwBuildNumber$set( MemorySegment seg, int x) {
        _OSVERSIONINFOW.dwBuildNumber$VH.set(seg, x);
    }
    public static int dwBuildNumber$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOW.dwBuildNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBuildNumber$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOW.dwBuildNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPlatformId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPlatformId"));
    public static VarHandle dwPlatformId$VH() {
        return _OSVERSIONINFOW.dwPlatformId$VH;
    }
    public static int dwPlatformId$get(MemorySegment seg) {
        return (int)_OSVERSIONINFOW.dwPlatformId$VH.get(seg);
    }
    public static void dwPlatformId$set( MemorySegment seg, int x) {
        _OSVERSIONINFOW.dwPlatformId$VH.set(seg, x);
    }
    public static int dwPlatformId$get(MemorySegment seg, long index) {
        return (int)_OSVERSIONINFOW.dwPlatformId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPlatformId$set(MemorySegment seg, long index, int x) {
        _OSVERSIONINFOW.dwPlatformId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szCSDVersion$slice(MemorySegment seg) {
        return seg.asSlice(20, 256);
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


