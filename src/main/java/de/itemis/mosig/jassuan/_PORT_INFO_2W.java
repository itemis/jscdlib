// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PORT_INFO_2W {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pPortName"),
        C_POINTER.withName("pMonitorName"),
        C_POINTER.withName("pDescription"),
        C_LONG.withName("fPortType"),
        C_LONG.withName("Reserved")
    ).withName("_PORT_INFO_2W");
    public static MemoryLayout $LAYOUT() {
        return _PORT_INFO_2W.$struct$LAYOUT;
    }
    static final VarHandle pPortName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pPortName")));
    public static VarHandle pPortName$VH() {
        return _PORT_INFO_2W.pPortName$VH;
    }
    public static MemoryAddress pPortName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PORT_INFO_2W.pPortName$VH.get(seg);
    }
    public static void pPortName$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_2W.pPortName$VH.set(seg, x);
    }
    public static MemoryAddress pPortName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PORT_INFO_2W.pPortName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pPortName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_2W.pPortName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMonitorName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pMonitorName")));
    public static VarHandle pMonitorName$VH() {
        return _PORT_INFO_2W.pMonitorName$VH;
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PORT_INFO_2W.pMonitorName$VH.get(seg);
    }
    public static void pMonitorName$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_2W.pMonitorName$VH.set(seg, x);
    }
    public static MemoryAddress pMonitorName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PORT_INFO_2W.pMonitorName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMonitorName$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_2W.pMonitorName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDescription$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pDescription")));
    public static VarHandle pDescription$VH() {
        return _PORT_INFO_2W.pDescription$VH;
    }
    public static MemoryAddress pDescription$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_PORT_INFO_2W.pDescription$VH.get(seg);
    }
    public static void pDescription$set( MemorySegment seg, MemoryAddress x) {
        _PORT_INFO_2W.pDescription$VH.set(seg, x);
    }
    public static MemoryAddress pDescription$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_PORT_INFO_2W.pDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDescription$set(MemorySegment seg, long index, MemoryAddress x) {
        _PORT_INFO_2W.pDescription$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fPortType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fPortType"));
    public static VarHandle fPortType$VH() {
        return _PORT_INFO_2W.fPortType$VH;
    }
    public static int fPortType$get(MemorySegment seg) {
        return (int)_PORT_INFO_2W.fPortType$VH.get(seg);
    }
    public static void fPortType$set( MemorySegment seg, int x) {
        _PORT_INFO_2W.fPortType$VH.set(seg, x);
    }
    public static int fPortType$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_2W.fPortType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fPortType$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_2W.fPortType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Reserved"));
    public static VarHandle Reserved$VH() {
        return _PORT_INFO_2W.Reserved$VH;
    }
    public static int Reserved$get(MemorySegment seg) {
        return (int)_PORT_INFO_2W.Reserved$VH.get(seg);
    }
    public static void Reserved$set( MemorySegment seg, int x) {
        _PORT_INFO_2W.Reserved$VH.set(seg, x);
    }
    public static int Reserved$get(MemorySegment seg, long index) {
        return (int)_PORT_INFO_2W.Reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved$set(MemorySegment seg, long index, int x) {
        _PORT_INFO_2W.Reserved$VH.set(seg.asSlice(index*sizeof()), x);
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


