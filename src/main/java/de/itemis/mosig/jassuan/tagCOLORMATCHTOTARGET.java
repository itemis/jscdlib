// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCOLORMATCHTOTARGET {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("iType"),
            C_LONG.withName("nSize")
        ).withName("emr"),
        C_LONG.withName("dwAction"),
        C_LONG.withName("dwFlags"),
        C_LONG.withName("cbName"),
        C_LONG.withName("cbData"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("Data"),
        MemoryLayout.paddingLayout(24)
    ).withName("tagCOLORMATCHTOTARGET");
    public static MemoryLayout $LAYOUT() {
        return tagCOLORMATCHTOTARGET.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle dwAction$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwAction"));
    public static VarHandle dwAction$VH() {
        return tagCOLORMATCHTOTARGET.dwAction$VH;
    }
    public static int dwAction$get(MemorySegment seg) {
        return (int)tagCOLORMATCHTOTARGET.dwAction$VH.get(seg);
    }
    public static void dwAction$set( MemorySegment seg, int x) {
        tagCOLORMATCHTOTARGET.dwAction$VH.set(seg, x);
    }
    public static int dwAction$get(MemorySegment seg, long index) {
        return (int)tagCOLORMATCHTOTARGET.dwAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwAction$set(MemorySegment seg, long index, int x) {
        tagCOLORMATCHTOTARGET.dwAction$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagCOLORMATCHTOTARGET.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagCOLORMATCHTOTARGET.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagCOLORMATCHTOTARGET.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagCOLORMATCHTOTARGET.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagCOLORMATCHTOTARGET.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbName$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbName"));
    public static VarHandle cbName$VH() {
        return tagCOLORMATCHTOTARGET.cbName$VH;
    }
    public static int cbName$get(MemorySegment seg) {
        return (int)tagCOLORMATCHTOTARGET.cbName$VH.get(seg);
    }
    public static void cbName$set( MemorySegment seg, int x) {
        tagCOLORMATCHTOTARGET.cbName$VH.set(seg, x);
    }
    public static int cbName$get(MemorySegment seg, long index) {
        return (int)tagCOLORMATCHTOTARGET.cbName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbName$set(MemorySegment seg, long index, int x) {
        tagCOLORMATCHTOTARGET.cbName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbData"));
    public static VarHandle cbData$VH() {
        return tagCOLORMATCHTOTARGET.cbData$VH;
    }
    public static int cbData$get(MemorySegment seg) {
        return (int)tagCOLORMATCHTOTARGET.cbData$VH.get(seg);
    }
    public static void cbData$set( MemorySegment seg, int x) {
        tagCOLORMATCHTOTARGET.cbData$VH.set(seg, x);
    }
    public static int cbData$get(MemorySegment seg, long index) {
        return (int)tagCOLORMATCHTOTARGET.cbData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbData$set(MemorySegment seg, long index, int x) {
        tagCOLORMATCHTOTARGET.cbData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(24, 1);
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


