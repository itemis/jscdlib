// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PRINTER_INFO_8W {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pDevMode")
    ).withName("_PRINTER_INFO_8W");
    public static MemoryLayout $LAYOUT() {
        return _PRINTER_INFO_8W.$struct$LAYOUT;
    }
    static final VarHandle pDevMode$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pDevMode")));
    public static VarHandle pDevMode$VH() {
        return _PRINTER_INFO_8W.pDevMode$VH;
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PRINTER_INFO_8W.pDevMode$VH.get(seg);
    }
    public static void pDevMode$set( MemorySegment seg, MemoryAddress x) {
        _PRINTER_INFO_8W.pDevMode$VH.set(seg, x);
    }
    public static MemoryAddress pDevMode$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PRINTER_INFO_8W.pDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        _PRINTER_INFO_8W.pDevMode$VH.set(seg.asSlice(index*sizeof()), x);
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


