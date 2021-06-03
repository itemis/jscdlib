// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_BLOB_ARRAY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cBlob"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgBlob")
    ).withName("_CRYPT_BLOB_ARRAY");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_BLOB_ARRAY.$struct$LAYOUT;
    }
    static final VarHandle cBlob$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cBlob"));
    public static VarHandle cBlob$VH() {
        return _CRYPT_BLOB_ARRAY.cBlob$VH;
    }
    public static int cBlob$get(MemorySegment seg) {
        return (int)_CRYPT_BLOB_ARRAY.cBlob$VH.get(seg);
    }
    public static void cBlob$set( MemorySegment seg, int x) {
        _CRYPT_BLOB_ARRAY.cBlob$VH.set(seg, x);
    }
    public static int cBlob$get(MemorySegment seg, long index) {
        return (int)_CRYPT_BLOB_ARRAY.cBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cBlob$set(MemorySegment seg, long index, int x) {
        _CRYPT_BLOB_ARRAY.cBlob$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgBlob$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgBlob")));
    public static VarHandle rgBlob$VH() {
        return _CRYPT_BLOB_ARRAY.rgBlob$VH;
    }
    public static MemoryAddress rgBlob$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_BLOB_ARRAY.rgBlob$VH.get(seg);
    }
    public static void rgBlob$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_BLOB_ARRAY.rgBlob$VH.set(seg, x);
    }
    public static MemoryAddress rgBlob$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_BLOB_ARRAY.rgBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgBlob$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_BLOB_ARRAY.rgBlob$VH.set(seg.asSlice(index*sizeof()), x);
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


