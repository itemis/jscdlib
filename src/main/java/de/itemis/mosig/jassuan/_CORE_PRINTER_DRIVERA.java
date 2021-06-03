// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CORE_PRINTER_DRIVERA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("CoreDriverGUID"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("ftDriverDate"),
        C_LONG_LONG.withName("dwlDriverVersion"),
        MemoryLayout.sequenceLayout(260, C_CHAR).withName("szPackageID"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CORE_PRINTER_DRIVERA");
    public static MemoryLayout $LAYOUT() {
        return _CORE_PRINTER_DRIVERA.$struct$LAYOUT;
    }
    public static MemorySegment CoreDriverGUID$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    public static MemorySegment ftDriverDate$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    static final VarHandle dwlDriverVersion$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwlDriverVersion"));
    public static VarHandle dwlDriverVersion$VH() {
        return _CORE_PRINTER_DRIVERA.dwlDriverVersion$VH;
    }
    public static long dwlDriverVersion$get(MemorySegment seg) {
        return (long)_CORE_PRINTER_DRIVERA.dwlDriverVersion$VH.get(seg);
    }
    public static void dwlDriverVersion$set( MemorySegment seg, long x) {
        _CORE_PRINTER_DRIVERA.dwlDriverVersion$VH.set(seg, x);
    }
    public static long dwlDriverVersion$get(MemorySegment seg, long index) {
        return (long)_CORE_PRINTER_DRIVERA.dwlDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwlDriverVersion$set(MemorySegment seg, long index, long x) {
        _CORE_PRINTER_DRIVERA.dwlDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPackageID$slice(MemorySegment seg) {
        return seg.asSlice(32, 260);
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


