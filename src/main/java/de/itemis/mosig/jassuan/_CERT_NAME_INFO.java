// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_NAME_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cRDN"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgRDN")
    ).withName("_CERT_NAME_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_NAME_INFO.$struct$LAYOUT;
    }
    static final VarHandle cRDN$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cRDN"));
    public static VarHandle cRDN$VH() {
        return _CERT_NAME_INFO.cRDN$VH;
    }
    public static int cRDN$get(MemorySegment seg) {
        return (int)_CERT_NAME_INFO.cRDN$VH.get(seg);
    }
    public static void cRDN$set( MemorySegment seg, int x) {
        _CERT_NAME_INFO.cRDN$VH.set(seg, x);
    }
    public static int cRDN$get(MemorySegment seg, long index) {
        return (int)_CERT_NAME_INFO.cRDN$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cRDN$set(MemorySegment seg, long index, int x) {
        _CERT_NAME_INFO.cRDN$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgRDN$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgRDN")));
    public static VarHandle rgRDN$VH() {
        return _CERT_NAME_INFO.rgRDN$VH;
    }
    public static MemoryAddress rgRDN$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_NAME_INFO.rgRDN$VH.get(seg);
    }
    public static void rgRDN$set( MemorySegment seg, MemoryAddress x) {
        _CERT_NAME_INFO.rgRDN$VH.set(seg, x);
    }
    public static MemoryAddress rgRDN$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_NAME_INFO.rgRDN$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgRDN$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_NAME_INFO.rgRDN$VH.set(seg.asSlice(index*sizeof()), x);
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


