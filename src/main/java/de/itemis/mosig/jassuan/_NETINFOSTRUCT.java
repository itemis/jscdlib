// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _NETINFOSTRUCT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbStructure"),
        C_LONG.withName("dwProviderVersion"),
        C_LONG.withName("dwStatus"),
        C_LONG.withName("dwCharacteristics"),
        C_LONG_LONG.withName("dwHandle"),
        C_SHORT.withName("wNetType"),
        MemoryLayout.paddingLayout(16),
        C_LONG.withName("dwPrinters"),
        C_LONG.withName("dwDrives"),
        MemoryLayout.paddingLayout(32)
    ).withName("_NETINFOSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return _NETINFOSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle cbStructure$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbStructure"));
    public static VarHandle cbStructure$VH() {
        return _NETINFOSTRUCT.cbStructure$VH;
    }
    public static int cbStructure$get(MemorySegment seg) {
        return (int)_NETINFOSTRUCT.cbStructure$VH.get(seg);
    }
    public static void cbStructure$set( MemorySegment seg, int x) {
        _NETINFOSTRUCT.cbStructure$VH.set(seg, x);
    }
    public static int cbStructure$get(MemorySegment seg, long index) {
        return (int)_NETINFOSTRUCT.cbStructure$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbStructure$set(MemorySegment seg, long index, int x) {
        _NETINFOSTRUCT.cbStructure$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwProviderVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwProviderVersion"));
    public static VarHandle dwProviderVersion$VH() {
        return _NETINFOSTRUCT.dwProviderVersion$VH;
    }
    public static int dwProviderVersion$get(MemorySegment seg) {
        return (int)_NETINFOSTRUCT.dwProviderVersion$VH.get(seg);
    }
    public static void dwProviderVersion$set( MemorySegment seg, int x) {
        _NETINFOSTRUCT.dwProviderVersion$VH.set(seg, x);
    }
    public static int dwProviderVersion$get(MemorySegment seg, long index) {
        return (int)_NETINFOSTRUCT.dwProviderVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwProviderVersion$set(MemorySegment seg, long index, int x) {
        _NETINFOSTRUCT.dwProviderVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStatus$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwStatus"));
    public static VarHandle dwStatus$VH() {
        return _NETINFOSTRUCT.dwStatus$VH;
    }
    public static int dwStatus$get(MemorySegment seg) {
        return (int)_NETINFOSTRUCT.dwStatus$VH.get(seg);
    }
    public static void dwStatus$set( MemorySegment seg, int x) {
        _NETINFOSTRUCT.dwStatus$VH.set(seg, x);
    }
    public static int dwStatus$get(MemorySegment seg, long index) {
        return (int)_NETINFOSTRUCT.dwStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStatus$set(MemorySegment seg, long index, int x) {
        _NETINFOSTRUCT.dwStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwCharacteristics$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwCharacteristics"));
    public static VarHandle dwCharacteristics$VH() {
        return _NETINFOSTRUCT.dwCharacteristics$VH;
    }
    public static int dwCharacteristics$get(MemorySegment seg) {
        return (int)_NETINFOSTRUCT.dwCharacteristics$VH.get(seg);
    }
    public static void dwCharacteristics$set( MemorySegment seg, int x) {
        _NETINFOSTRUCT.dwCharacteristics$VH.set(seg, x);
    }
    public static int dwCharacteristics$get(MemorySegment seg, long index) {
        return (int)_NETINFOSTRUCT.dwCharacteristics$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCharacteristics$set(MemorySegment seg, long index, int x) {
        _NETINFOSTRUCT.dwCharacteristics$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwHandle$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwHandle"));
    public static VarHandle dwHandle$VH() {
        return _NETINFOSTRUCT.dwHandle$VH;
    }
    public static long dwHandle$get(MemorySegment seg) {
        return (long)_NETINFOSTRUCT.dwHandle$VH.get(seg);
    }
    public static void dwHandle$set( MemorySegment seg, long x) {
        _NETINFOSTRUCT.dwHandle$VH.set(seg, x);
    }
    public static long dwHandle$get(MemorySegment seg, long index) {
        return (long)_NETINFOSTRUCT.dwHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwHandle$set(MemorySegment seg, long index, long x) {
        _NETINFOSTRUCT.dwHandle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNetType$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wNetType"));
    public static VarHandle wNetType$VH() {
        return _NETINFOSTRUCT.wNetType$VH;
    }
    public static short wNetType$get(MemorySegment seg) {
        return (short)_NETINFOSTRUCT.wNetType$VH.get(seg);
    }
    public static void wNetType$set( MemorySegment seg, short x) {
        _NETINFOSTRUCT.wNetType$VH.set(seg, x);
    }
    public static short wNetType$get(MemorySegment seg, long index) {
        return (short)_NETINFOSTRUCT.wNetType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNetType$set(MemorySegment seg, long index, short x) {
        _NETINFOSTRUCT.wNetType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPrinters$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPrinters"));
    public static VarHandle dwPrinters$VH() {
        return _NETINFOSTRUCT.dwPrinters$VH;
    }
    public static int dwPrinters$get(MemorySegment seg) {
        return (int)_NETINFOSTRUCT.dwPrinters$VH.get(seg);
    }
    public static void dwPrinters$set( MemorySegment seg, int x) {
        _NETINFOSTRUCT.dwPrinters$VH.set(seg, x);
    }
    public static int dwPrinters$get(MemorySegment seg, long index) {
        return (int)_NETINFOSTRUCT.dwPrinters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPrinters$set(MemorySegment seg, long index, int x) {
        _NETINFOSTRUCT.dwPrinters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwDrives$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwDrives"));
    public static VarHandle dwDrives$VH() {
        return _NETINFOSTRUCT.dwDrives$VH;
    }
    public static int dwDrives$get(MemorySegment seg) {
        return (int)_NETINFOSTRUCT.dwDrives$VH.get(seg);
    }
    public static void dwDrives$set( MemorySegment seg, int x) {
        _NETINFOSTRUCT.dwDrives$VH.set(seg, x);
    }
    public static int dwDrives$get(MemorySegment seg, long index) {
        return (int)_NETINFOSTRUCT.dwDrives$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDrives$set(MemorySegment seg, long index, int x) {
        _NETINFOSTRUCT.dwDrives$VH.set(seg.asSlice(index*sizeof()), x);
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


