// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _EFS_HASH_BLOB {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbData"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pbData")
    ).withName("_EFS_HASH_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _EFS_HASH_BLOB.$struct$LAYOUT;
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return _EFS_HASH_BLOB.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)_EFS_HASH_BLOB.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        _EFS_HASH_BLOB.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)_EFS_HASH_BLOB.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        _EFS_HASH_BLOB.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pbData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pbData")));
    public static VarHandle pbData$VH() {
        return _EFS_HASH_BLOB.pbData$VH;
    }
    public static MemoryAddress pbData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_EFS_HASH_BLOB.pbData$VH.get(seg);
    }
    public static void pbData$set( MemorySegment seg, MemoryAddress x) {
        _EFS_HASH_BLOB.pbData$VH.set(seg, x);
    }
    public static MemoryAddress pbData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_EFS_HASH_BLOB.pbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pbData$set(MemorySegment seg, long index, MemoryAddress x) {
        _EFS_HASH_BLOB.pbData$VH.set(seg.asSlice(index*sizeof()), x);
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


