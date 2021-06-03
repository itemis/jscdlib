// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_URL_ARRAY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cUrl"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgwszUrl")
    ).withName("_CRYPT_URL_ARRAY");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_URL_ARRAY.$struct$LAYOUT;
    }
    static final VarHandle cUrl$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cUrl"));
    public static VarHandle cUrl$VH() {
        return _CRYPT_URL_ARRAY.cUrl$VH;
    }
    public static int cUrl$get(MemorySegment seg) {
        return (int)_CRYPT_URL_ARRAY.cUrl$VH.get(seg);
    }
    public static void cUrl$set( MemorySegment seg, int x) {
        _CRYPT_URL_ARRAY.cUrl$VH.set(seg, x);
    }
    public static int cUrl$get(MemorySegment seg, long index) {
        return (int)_CRYPT_URL_ARRAY.cUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cUrl$set(MemorySegment seg, long index, int x) {
        _CRYPT_URL_ARRAY.cUrl$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgwszUrl$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgwszUrl")));
    public static VarHandle rgwszUrl$VH() {
        return _CRYPT_URL_ARRAY.rgwszUrl$VH;
    }
    public static MemoryAddress rgwszUrl$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_URL_ARRAY.rgwszUrl$VH.get(seg);
    }
    public static void rgwszUrl$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_URL_ARRAY.rgwszUrl$VH.set(seg, x);
    }
    public static MemoryAddress rgwszUrl$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_URL_ARRAY.rgwszUrl$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgwszUrl$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_URL_ARRAY.rgwszUrl$VH.set(seg.asSlice(index*sizeof()), x);
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


