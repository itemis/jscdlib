// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _WORD_BLOB {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("clSize"),
        MemoryLayout.sequenceLayout(1, C_SHORT).withName("asData"),
        MemoryLayout.paddingLayout(16)
    ).withName("_WORD_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _WORD_BLOB.$struct$LAYOUT;
    }
    static final VarHandle clSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("clSize"));
    public static VarHandle clSize$VH() {
        return _WORD_BLOB.clSize$VH;
    }
    public static int clSize$get(MemorySegment seg) {
        return (int)_WORD_BLOB.clSize$VH.get(seg);
    }
    public static void clSize$set( MemorySegment seg, int x) {
        _WORD_BLOB.clSize$VH.set(seg, x);
    }
    public static int clSize$get(MemorySegment seg, long index) {
        return (int)_WORD_BLOB.clSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void clSize$set(MemorySegment seg, long index, int x) {
        _WORD_BLOB.clSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment asData$slice(MemorySegment seg) {
        return seg.asSlice(4, 2);
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


