// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEXTLOGPEN {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("elpPenStyle"),
        C_LONG.withName("elpWidth"),
        C_INT.withName("elpBrushStyle"),
        C_LONG.withName("elpColor"),
        C_LONG_LONG.withName("elpHatch"),
        C_LONG.withName("elpNumEntries"),
        MemoryLayout.sequenceLayout(1, C_LONG).withName("elpStyleEntry")
    ).withName("tagEXTLOGPEN");
    public static MemoryLayout $LAYOUT() {
        return tagEXTLOGPEN.$struct$LAYOUT;
    }
    static final VarHandle elpPenStyle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elpPenStyle"));
    public static VarHandle elpPenStyle$VH() {
        return tagEXTLOGPEN.elpPenStyle$VH;
    }
    public static int elpPenStyle$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN.elpPenStyle$VH.get(seg);
    }
    public static void elpPenStyle$set( MemorySegment seg, int x) {
        tagEXTLOGPEN.elpPenStyle$VH.set(seg, x);
    }
    public static int elpPenStyle$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN.elpPenStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpPenStyle$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN.elpPenStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpWidth$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elpWidth"));
    public static VarHandle elpWidth$VH() {
        return tagEXTLOGPEN.elpWidth$VH;
    }
    public static int elpWidth$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN.elpWidth$VH.get(seg);
    }
    public static void elpWidth$set( MemorySegment seg, int x) {
        tagEXTLOGPEN.elpWidth$VH.set(seg, x);
    }
    public static int elpWidth$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN.elpWidth$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpWidth$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN.elpWidth$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpBrushStyle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elpBrushStyle"));
    public static VarHandle elpBrushStyle$VH() {
        return tagEXTLOGPEN.elpBrushStyle$VH;
    }
    public static int elpBrushStyle$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN.elpBrushStyle$VH.get(seg);
    }
    public static void elpBrushStyle$set( MemorySegment seg, int x) {
        tagEXTLOGPEN.elpBrushStyle$VH.set(seg, x);
    }
    public static int elpBrushStyle$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN.elpBrushStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpBrushStyle$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN.elpBrushStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpColor$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elpColor"));
    public static VarHandle elpColor$VH() {
        return tagEXTLOGPEN.elpColor$VH;
    }
    public static int elpColor$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN.elpColor$VH.get(seg);
    }
    public static void elpColor$set( MemorySegment seg, int x) {
        tagEXTLOGPEN.elpColor$VH.set(seg, x);
    }
    public static int elpColor$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN.elpColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpColor$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN.elpColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpHatch$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("elpHatch"));
    public static VarHandle elpHatch$VH() {
        return tagEXTLOGPEN.elpHatch$VH;
    }
    public static long elpHatch$get(MemorySegment seg) {
        return (long)tagEXTLOGPEN.elpHatch$VH.get(seg);
    }
    public static void elpHatch$set( MemorySegment seg, long x) {
        tagEXTLOGPEN.elpHatch$VH.set(seg, x);
    }
    public static long elpHatch$get(MemorySegment seg, long index) {
        return (long)tagEXTLOGPEN.elpHatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpHatch$set(MemorySegment seg, long index, long x) {
        tagEXTLOGPEN.elpHatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elpNumEntries$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elpNumEntries"));
    public static VarHandle elpNumEntries$VH() {
        return tagEXTLOGPEN.elpNumEntries$VH;
    }
    public static int elpNumEntries$get(MemorySegment seg) {
        return (int)tagEXTLOGPEN.elpNumEntries$VH.get(seg);
    }
    public static void elpNumEntries$set( MemorySegment seg, int x) {
        tagEXTLOGPEN.elpNumEntries$VH.set(seg, x);
    }
    public static int elpNumEntries$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGPEN.elpNumEntries$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elpNumEntries$set(MemorySegment seg, long index, int x) {
        tagEXTLOGPEN.elpNumEntries$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elpStyleEntry$slice(MemorySegment seg) {
        return seg.asSlice(28, 4);
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


