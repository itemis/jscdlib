// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PATHNAME_BUFFER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("PathNameLength"),
        MemoryLayout.sequenceLayout(1, C_SHORT).withName("Name"),
        MemoryLayout.paddingLayout(16)
    ).withName("_PATHNAME_BUFFER");
    public static MemoryLayout $LAYOUT() {
        return _PATHNAME_BUFFER.$struct$LAYOUT;
    }
    static final VarHandle PathNameLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("PathNameLength"));
    public static VarHandle PathNameLength$VH() {
        return _PATHNAME_BUFFER.PathNameLength$VH;
    }
    public static int PathNameLength$get(MemorySegment seg) {
        return (int)_PATHNAME_BUFFER.PathNameLength$VH.get(seg);
    }
    public static void PathNameLength$set( MemorySegment seg, int x) {
        _PATHNAME_BUFFER.PathNameLength$VH.set(seg, x);
    }
    public static int PathNameLength$get(MemorySegment seg, long index) {
        return (int)_PATHNAME_BUFFER.PathNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PathNameLength$set(MemorySegment seg, long index, int x) {
        _PATHNAME_BUFFER.PathNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Name$slice(MemorySegment seg) {
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


