// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _QOS_SD_MODE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("ObjectType"),
            C_LONG.withName("ObjectLength")
        ).withName("ObjectHdr"),
        C_LONG.withName("ShapeDiscardMode")
    ).withName("_QOS_SD_MODE");
    public static MemoryLayout $LAYOUT() {
        return _QOS_SD_MODE.$struct$LAYOUT;
    }
    public static MemorySegment ObjectHdr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ShapeDiscardMode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ShapeDiscardMode"));
    public static VarHandle ShapeDiscardMode$VH() {
        return _QOS_SD_MODE.ShapeDiscardMode$VH;
    }
    public static int ShapeDiscardMode$get(MemorySegment seg) {
        return (int)_QOS_SD_MODE.ShapeDiscardMode$VH.get(seg);
    }
    public static void ShapeDiscardMode$set( MemorySegment seg, int x) {
        _QOS_SD_MODE.ShapeDiscardMode$VH.set(seg, x);
    }
    public static int ShapeDiscardMode$get(MemorySegment seg, long index) {
        return (int)_QOS_SD_MODE.ShapeDiscardMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ShapeDiscardMode$set(MemorySegment seg, long index, int x) {
        _QOS_SD_MODE.ShapeDiscardMode$VH.set(seg.asSlice(index*sizeof()), x);
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


