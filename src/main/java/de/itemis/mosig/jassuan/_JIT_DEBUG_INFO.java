// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _JIT_DEBUG_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwSize"),
        C_LONG.withName("dwProcessorArchitecture"),
        C_LONG.withName("dwThreadID"),
        C_LONG.withName("dwReserved0"),
        C_LONG_LONG.withName("lpExceptionAddress"),
        C_LONG_LONG.withName("lpExceptionRecord"),
        C_LONG_LONG.withName("lpContextRecord")
    ).withName("_JIT_DEBUG_INFO");
    public static MemoryLayout $LAYOUT() {
        return _JIT_DEBUG_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _JIT_DEBUG_INFO.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProcessorArchitecture$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwProcessorArchitecture"));
    public static VarHandle dwProcessorArchitecture$VH() {
        return _JIT_DEBUG_INFO.dwProcessorArchitecture$VH;
    }
    public static int dwProcessorArchitecture$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwProcessorArchitecture$VH.get(seg);
    }
    public static void dwProcessorArchitecture$set( MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwProcessorArchitecture$VH.set(seg, x);
    }
    public static int dwProcessorArchitecture$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwProcessorArchitecture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProcessorArchitecture$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwProcessorArchitecture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwThreadID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwThreadID"));
    public static VarHandle dwThreadID$VH() {
        return _JIT_DEBUG_INFO.dwThreadID$VH;
    }
    public static int dwThreadID$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwThreadID$VH.get(seg);
    }
    public static void dwThreadID$set( MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwThreadID$VH.set(seg, x);
    }
    public static int dwThreadID$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwThreadID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwThreadID$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwThreadID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved0$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwReserved0"));
    public static VarHandle dwReserved0$VH() {
        return _JIT_DEBUG_INFO.dwReserved0$VH;
    }
    public static int dwReserved0$get(MemorySegment seg) {
        return (int)_JIT_DEBUG_INFO.dwReserved0$VH.get(seg);
    }
    public static void dwReserved0$set( MemorySegment seg, int x) {
        _JIT_DEBUG_INFO.dwReserved0$VH.set(seg, x);
    }
    public static int dwReserved0$get(MemorySegment seg, long index) {
        return (int)_JIT_DEBUG_INFO.dwReserved0$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved0$set(MemorySegment seg, long index, int x) {
        _JIT_DEBUG_INFO.dwReserved0$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpExceptionAddress$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpExceptionAddress"));
    public static VarHandle lpExceptionAddress$VH() {
        return _JIT_DEBUG_INFO.lpExceptionAddress$VH;
    }
    public static long lpExceptionAddress$get(MemorySegment seg) {
        return (long)_JIT_DEBUG_INFO.lpExceptionAddress$VH.get(seg);
    }
    public static void lpExceptionAddress$set( MemorySegment seg, long x) {
        _JIT_DEBUG_INFO.lpExceptionAddress$VH.set(seg, x);
    }
    public static long lpExceptionAddress$get(MemorySegment seg, long index) {
        return (long)_JIT_DEBUG_INFO.lpExceptionAddress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpExceptionAddress$set(MemorySegment seg, long index, long x) {
        _JIT_DEBUG_INFO.lpExceptionAddress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpExceptionRecord$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpExceptionRecord"));
    public static VarHandle lpExceptionRecord$VH() {
        return _JIT_DEBUG_INFO.lpExceptionRecord$VH;
    }
    public static long lpExceptionRecord$get(MemorySegment seg) {
        return (long)_JIT_DEBUG_INFO.lpExceptionRecord$VH.get(seg);
    }
    public static void lpExceptionRecord$set( MemorySegment seg, long x) {
        _JIT_DEBUG_INFO.lpExceptionRecord$VH.set(seg, x);
    }
    public static long lpExceptionRecord$get(MemorySegment seg, long index) {
        return (long)_JIT_DEBUG_INFO.lpExceptionRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpExceptionRecord$set(MemorySegment seg, long index, long x) {
        _JIT_DEBUG_INFO.lpExceptionRecord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpContextRecord$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpContextRecord"));
    public static VarHandle lpContextRecord$VH() {
        return _JIT_DEBUG_INFO.lpContextRecord$VH;
    }
    public static long lpContextRecord$get(MemorySegment seg) {
        return (long)_JIT_DEBUG_INFO.lpContextRecord$VH.get(seg);
    }
    public static void lpContextRecord$set( MemorySegment seg, long x) {
        _JIT_DEBUG_INFO.lpContextRecord$VH.set(seg, x);
    }
    public static long lpContextRecord$get(MemorySegment seg, long index) {
        return (long)_JIT_DEBUG_INFO.lpContextRecord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpContextRecord$set(MemorySegment seg, long index, long x) {
        _JIT_DEBUG_INFO.lpContextRecord$VH.set(seg.asSlice(index*sizeof()), x);
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


