// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _ENCRYPTION_CERTIFICATE_HASH {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbTotalLength"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pUserSid"),
        C_POINTER.withName("pHash"),
        C_POINTER.withName("lpDisplayInformation")
    ).withName("_ENCRYPTION_CERTIFICATE_HASH");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTION_CERTIFICATE_HASH.$struct$LAYOUT;
    }
    static final VarHandle cbTotalLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbTotalLength"));
    public static VarHandle cbTotalLength$VH() {
        return _ENCRYPTION_CERTIFICATE_HASH.cbTotalLength$VH;
    }
    public static int cbTotalLength$get(MemorySegment seg) {
        return (int)_ENCRYPTION_CERTIFICATE_HASH.cbTotalLength$VH.get(seg);
    }
    public static void cbTotalLength$set( MemorySegment seg, int x) {
        _ENCRYPTION_CERTIFICATE_HASH.cbTotalLength$VH.set(seg, x);
    }
    public static int cbTotalLength$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_CERTIFICATE_HASH.cbTotalLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbTotalLength$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_CERTIFICATE_HASH.cbTotalLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUserSid$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pUserSid")));
    public static VarHandle pUserSid$VH() {
        return _ENCRYPTION_CERTIFICATE_HASH.pUserSid$VH;
    }
    public static MemoryAddress pUserSid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_HASH.pUserSid$VH.get(seg);
    }
    public static void pUserSid$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_HASH.pUserSid$VH.set(seg, x);
    }
    public static MemoryAddress pUserSid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_HASH.pUserSid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUserSid$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_HASH.pUserSid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pHash$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pHash")));
    public static VarHandle pHash$VH() {
        return _ENCRYPTION_CERTIFICATE_HASH.pHash$VH;
    }
    public static MemoryAddress pHash$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_HASH.pHash$VH.get(seg);
    }
    public static void pHash$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_HASH.pHash$VH.set(seg, x);
    }
    public static MemoryAddress pHash$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_HASH.pHash$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pHash$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_HASH.pHash$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpDisplayInformation$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpDisplayInformation")));
    public static VarHandle lpDisplayInformation$VH() {
        return _ENCRYPTION_CERTIFICATE_HASH.lpDisplayInformation$VH;
    }
    public static MemoryAddress lpDisplayInformation$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_HASH.lpDisplayInformation$VH.get(seg);
    }
    public static void lpDisplayInformation$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_HASH.lpDisplayInformation$VH.set(seg, x);
    }
    public static MemoryAddress lpDisplayInformation$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_HASH.lpDisplayInformation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpDisplayInformation$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_HASH.lpDisplayInformation$VH.set(seg.asSlice(index*sizeof()), x);
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


