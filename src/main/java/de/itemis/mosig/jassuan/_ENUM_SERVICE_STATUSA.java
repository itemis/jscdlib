// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _ENUM_SERVICE_STATUSA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("lpServiceName"),
        C_POINTER.withName("lpDisplayName"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwServiceType"),
            C_LONG.withName("dwCurrentState"),
            C_LONG.withName("dwControlsAccepted"),
            C_LONG.withName("dwWin32ExitCode"),
            C_LONG.withName("dwServiceSpecificExitCode"),
            C_LONG.withName("dwCheckPoint"),
            C_LONG.withName("dwWaitHint")
        ).withName("ServiceStatus"),
        MemoryLayout.paddingLayout(32)
    ).withName("_ENUM_SERVICE_STATUSA");
    public static MemoryLayout $LAYOUT() {
        return _ENUM_SERVICE_STATUSA.$struct$LAYOUT;
    }
    static final VarHandle lpServiceName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpServiceName")));
    public static VarHandle lpServiceName$VH() {
        return _ENUM_SERVICE_STATUSA.lpServiceName$VH;
    }
    public static MemoryAddress lpServiceName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ENUM_SERVICE_STATUSA.lpServiceName$VH.get(seg);
    }
    public static void lpServiceName$set( MemorySegment seg, MemoryAddress x) {
        _ENUM_SERVICE_STATUSA.lpServiceName$VH.set(seg, x);
    }
    public static MemoryAddress lpServiceName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ENUM_SERVICE_STATUSA.lpServiceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpServiceName$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENUM_SERVICE_STATUSA.lpServiceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDisplayName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpDisplayName")));
    public static VarHandle lpDisplayName$VH() {
        return _ENUM_SERVICE_STATUSA.lpDisplayName$VH;
    }
    public static MemoryAddress lpDisplayName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ENUM_SERVICE_STATUSA.lpDisplayName$VH.get(seg);
    }
    public static void lpDisplayName$set( MemorySegment seg, MemoryAddress x) {
        _ENUM_SERVICE_STATUSA.lpDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress lpDisplayName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ENUM_SERVICE_STATUSA.lpDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENUM_SERVICE_STATUSA.lpDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(16, 28);
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


