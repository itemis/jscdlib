// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FILE_PREFETCH {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Type"),
        C_LONG.withName("Count"),
        MemoryLayout.sequenceLayout(1, C_LONG_LONG).withName("Prefetch")
    ).withName("_FILE_PREFETCH");
    public static MemoryLayout $LAYOUT() {
        return _FILE_PREFETCH.$struct$LAYOUT;
    }
    static final VarHandle Type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Type"));
    public static VarHandle Type$VH() {
        return _FILE_PREFETCH.Type$VH;
    }
    public static int Type$get(MemorySegment seg) {
        return (int)_FILE_PREFETCH.Type$VH.get(seg);
    }
    public static void Type$set( MemorySegment seg, int x) {
        _FILE_PREFETCH.Type$VH.set(seg, x);
    }
    public static int Type$get(MemorySegment seg, long index) {
        return (int)_FILE_PREFETCH.Type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Type$set(MemorySegment seg, long index, int x) {
        _FILE_PREFETCH.Type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Count$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Count"));
    public static VarHandle Count$VH() {
        return _FILE_PREFETCH.Count$VH;
    }
    public static int Count$get(MemorySegment seg) {
        return (int)_FILE_PREFETCH.Count$VH.get(seg);
    }
    public static void Count$set( MemorySegment seg, int x) {
        _FILE_PREFETCH.Count$VH.set(seg, x);
    }
    public static int Count$get(MemorySegment seg, long index) {
        return (int)_FILE_PREFETCH.Count$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Count$set(MemorySegment seg, long index, int x) {
        _FILE_PREFETCH.Count$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Prefetch$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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


