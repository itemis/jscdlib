// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagLASTINPUTINFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("cbSize"),
        C_LONG.withName("dwTime")
    ).withName("tagLASTINPUTINFO");
    public static MemoryLayout $LAYOUT() {
        return tagLASTINPUTINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagLASTINPUTINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagLASTINPUTINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagLASTINPUTINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagLASTINPUTINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagLASTINPUTINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTime$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwTime"));
    public static VarHandle dwTime$VH() {
        return tagLASTINPUTINFO.dwTime$VH;
    }
    public static int dwTime$get(MemorySegment seg) {
        return (int)tagLASTINPUTINFO.dwTime$VH.get(seg);
    }
    public static void dwTime$set( MemorySegment seg, int x) {
        tagLASTINPUTINFO.dwTime$VH.set(seg, x);
    }
    public static int dwTime$get(MemorySegment seg, long index) {
        return (int)tagLASTINPUTINFO.dwTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTime$set(MemorySegment seg, long index, int x) {
        tagLASTINPUTINFO.dwTime$VH.set(seg.asSlice(index*sizeof()), x);
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


