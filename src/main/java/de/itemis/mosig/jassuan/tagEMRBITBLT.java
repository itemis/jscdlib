// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEMRBITBLT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("iType"),
            C_LONG.withName("nSize")
        ).withName("emr"),
        MemoryLayout.structLayout(
            C_LONG.withName("left"),
            C_LONG.withName("top"),
            C_LONG.withName("right"),
            C_LONG.withName("bottom")
        ).withName("rclBounds"),
        C_LONG.withName("xDest"),
        C_LONG.withName("yDest"),
        C_LONG.withName("cxDest"),
        C_LONG.withName("cyDest"),
        C_LONG.withName("dwRop"),
        C_LONG.withName("xSrc"),
        C_LONG.withName("ySrc"),
        MemoryLayout.structLayout(
            C_FLOAT.withName("eM11"),
            C_FLOAT.withName("eM12"),
            C_FLOAT.withName("eM21"),
            C_FLOAT.withName("eM22"),
            C_FLOAT.withName("eDx"),
            C_FLOAT.withName("eDy")
        ).withName("xformSrc"),
        C_LONG.withName("crBkColorSrc"),
        C_LONG.withName("iUsageSrc"),
        C_LONG.withName("offBmiSrc"),
        C_LONG.withName("cbBmiSrc"),
        C_LONG.withName("offBitsSrc"),
        C_LONG.withName("cbBitsSrc")
    ).withName("tagEMRBITBLT");
    public static MemoryLayout $LAYOUT() {
        return tagEMRBITBLT.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment rclBounds$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
    }
    static final VarHandle xDest$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("xDest"));
    public static VarHandle xDest$VH() {
        return tagEMRBITBLT.xDest$VH;
    }
    public static int xDest$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.xDest$VH.get(seg);
    }
    public static void xDest$set( MemorySegment seg, int x) {
        tagEMRBITBLT.xDest$VH.set(seg, x);
    }
    public static int xDest$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.xDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xDest$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.xDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle yDest$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("yDest"));
    public static VarHandle yDest$VH() {
        return tagEMRBITBLT.yDest$VH;
    }
    public static int yDest$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.yDest$VH.get(seg);
    }
    public static void yDest$set( MemorySegment seg, int x) {
        tagEMRBITBLT.yDest$VH.set(seg, x);
    }
    public static int yDest$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.yDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void yDest$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.yDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cxDest$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cxDest"));
    public static VarHandle cxDest$VH() {
        return tagEMRBITBLT.cxDest$VH;
    }
    public static int cxDest$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.cxDest$VH.get(seg);
    }
    public static void cxDest$set( MemorySegment seg, int x) {
        tagEMRBITBLT.cxDest$VH.set(seg, x);
    }
    public static int cxDest$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.cxDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cxDest$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.cxDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cyDest$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cyDest"));
    public static VarHandle cyDest$VH() {
        return tagEMRBITBLT.cyDest$VH;
    }
    public static int cyDest$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.cyDest$VH.get(seg);
    }
    public static void cyDest$set( MemorySegment seg, int x) {
        tagEMRBITBLT.cyDest$VH.set(seg, x);
    }
    public static int cyDest$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.cyDest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cyDest$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.cyDest$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRop$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwRop"));
    public static VarHandle dwRop$VH() {
        return tagEMRBITBLT.dwRop$VH;
    }
    public static int dwRop$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.dwRop$VH.get(seg);
    }
    public static void dwRop$set( MemorySegment seg, int x) {
        tagEMRBITBLT.dwRop$VH.set(seg, x);
    }
    public static int dwRop$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.dwRop$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRop$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.dwRop$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle xSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("xSrc"));
    public static VarHandle xSrc$VH() {
        return tagEMRBITBLT.xSrc$VH;
    }
    public static int xSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.xSrc$VH.get(seg);
    }
    public static void xSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.xSrc$VH.set(seg, x);
    }
    public static int xSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.xSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void xSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.xSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ySrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ySrc"));
    public static VarHandle ySrc$VH() {
        return tagEMRBITBLT.ySrc$VH;
    }
    public static int ySrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.ySrc$VH.get(seg);
    }
    public static void ySrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.ySrc$VH.set(seg, x);
    }
    public static int ySrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.ySrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ySrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.ySrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment xformSrc$slice(MemorySegment seg) {
        return seg.asSlice(52, 24);
    }
    static final VarHandle crBkColorSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("crBkColorSrc"));
    public static VarHandle crBkColorSrc$VH() {
        return tagEMRBITBLT.crBkColorSrc$VH;
    }
    public static int crBkColorSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.crBkColorSrc$VH.get(seg);
    }
    public static void crBkColorSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.crBkColorSrc$VH.set(seg, x);
    }
    public static int crBkColorSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.crBkColorSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void crBkColorSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.crBkColorSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsageSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iUsageSrc"));
    public static VarHandle iUsageSrc$VH() {
        return tagEMRBITBLT.iUsageSrc$VH;
    }
    public static int iUsageSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.iUsageSrc$VH.get(seg);
    }
    public static void iUsageSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.iUsageSrc$VH.set(seg, x);
    }
    public static int iUsageSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.iUsageSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsageSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.iUsageSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmiSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("offBmiSrc"));
    public static VarHandle offBmiSrc$VH() {
        return tagEMRBITBLT.offBmiSrc$VH;
    }
    public static int offBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.offBmiSrc$VH.get(seg);
    }
    public static void offBmiSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.offBmiSrc$VH.set(seg, x);
    }
    public static int offBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.offBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.offBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmiSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbBmiSrc"));
    public static VarHandle cbBmiSrc$VH() {
        return tagEMRBITBLT.cbBmiSrc$VH;
    }
    public static int cbBmiSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.cbBmiSrc$VH.get(seg);
    }
    public static void cbBmiSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.cbBmiSrc$VH.set(seg, x);
    }
    public static int cbBmiSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.cbBmiSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmiSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.cbBmiSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBitsSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("offBitsSrc"));
    public static VarHandle offBitsSrc$VH() {
        return tagEMRBITBLT.offBitsSrc$VH;
    }
    public static int offBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.offBitsSrc$VH.get(seg);
    }
    public static void offBitsSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.offBitsSrc$VH.set(seg, x);
    }
    public static int offBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.offBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.offBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBitsSrc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbBitsSrc"));
    public static VarHandle cbBitsSrc$VH() {
        return tagEMRBITBLT.cbBitsSrc$VH;
    }
    public static int cbBitsSrc$get(MemorySegment seg) {
        return (int)tagEMRBITBLT.cbBitsSrc$VH.get(seg);
    }
    public static void cbBitsSrc$set( MemorySegment seg, int x) {
        tagEMRBITBLT.cbBitsSrc$VH.set(seg, x);
    }
    public static int cbBitsSrc$get(MemorySegment seg, long index) {
        return (int)tagEMRBITBLT.cbBitsSrc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBitsSrc$set(MemorySegment seg, long index, int x) {
        tagEMRBITBLT.cbBitsSrc$VH.set(seg.asSlice(index*sizeof()), x);
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


