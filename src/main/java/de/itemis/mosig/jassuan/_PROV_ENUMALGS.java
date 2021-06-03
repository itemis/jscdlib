// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PROV_ENUMALGS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("aiAlgid"),
        C_LONG.withName("dwBitLen"),
        C_LONG.withName("dwNameLen"),
        MemoryLayout.sequenceLayout(20, C_CHAR).withName("szName")
    ).withName("_PROV_ENUMALGS");
    public static MemoryLayout $LAYOUT() {
        return _PROV_ENUMALGS.$struct$LAYOUT;
    }
    static final VarHandle aiAlgid$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("aiAlgid"));
    public static VarHandle aiAlgid$VH() {
        return _PROV_ENUMALGS.aiAlgid$VH;
    }
    public static int aiAlgid$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS.aiAlgid$VH.get(seg);
    }
    public static void aiAlgid$set( MemorySegment seg, int x) {
        _PROV_ENUMALGS.aiAlgid$VH.set(seg, x);
    }
    public static int aiAlgid$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS.aiAlgid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aiAlgid$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS.aiAlgid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwBitLen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwBitLen"));
    public static VarHandle dwBitLen$VH() {
        return _PROV_ENUMALGS.dwBitLen$VH;
    }
    public static int dwBitLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS.dwBitLen$VH.get(seg);
    }
    public static void dwBitLen$set( MemorySegment seg, int x) {
        _PROV_ENUMALGS.dwBitLen$VH.set(seg, x);
    }
    public static int dwBitLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS.dwBitLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBitLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS.dwBitLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNameLen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNameLen"));
    public static VarHandle dwNameLen$VH() {
        return _PROV_ENUMALGS.dwNameLen$VH;
    }
    public static int dwNameLen$get(MemorySegment seg) {
        return (int)_PROV_ENUMALGS.dwNameLen$VH.get(seg);
    }
    public static void dwNameLen$set( MemorySegment seg, int x) {
        _PROV_ENUMALGS.dwNameLen$VH.set(seg, x);
    }
    public static int dwNameLen$get(MemorySegment seg, long index) {
        return (int)_PROV_ENUMALGS.dwNameLen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNameLen$set(MemorySegment seg, long index, int x) {
        _PROV_ENUMALGS.dwNameLen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szName$slice(MemorySegment seg) {
        return seg.asSlice(12, 20);
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


