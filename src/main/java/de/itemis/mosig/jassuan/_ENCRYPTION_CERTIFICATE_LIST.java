// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _ENCRYPTION_CERTIFICATE_LIST {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("nUsers"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pUsers")
    ).withName("_ENCRYPTION_CERTIFICATE_LIST");
    public static MemoryLayout $LAYOUT() {
        return _ENCRYPTION_CERTIFICATE_LIST.$struct$LAYOUT;
    }
    static final VarHandle nUsers$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nUsers"));
    public static VarHandle nUsers$VH() {
        return _ENCRYPTION_CERTIFICATE_LIST.nUsers$VH;
    }
    public static int nUsers$get(MemorySegment seg) {
        return (int)_ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.get(seg);
    }
    public static void nUsers$set( MemorySegment seg, int x) {
        _ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.set(seg, x);
    }
    public static int nUsers$get(MemorySegment seg, long index) {
        return (int)_ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nUsers$set(MemorySegment seg, long index, int x) {
        _ENCRYPTION_CERTIFICATE_LIST.nUsers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pUsers$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pUsers")));
    public static VarHandle pUsers$VH() {
        return _ENCRYPTION_CERTIFICATE_LIST.pUsers$VH;
    }
    public static MemoryAddress pUsers$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.get(seg);
    }
    public static void pUsers$set( MemorySegment seg, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.set(seg, x);
    }
    public static MemoryAddress pUsers$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pUsers$set(MemorySegment seg, long index, MemoryAddress x) {
        _ENCRYPTION_CERTIFICATE_LIST.pUsers$VH.set(seg.asSlice(index*sizeof()), x);
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


