// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEMRCREATEMONOBRUSH {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("iType"),
            C_LONG.withName("nSize")
        ).withName("emr"),
        C_LONG.withName("ihBrush"),
        C_LONG.withName("iUsage"),
        C_LONG.withName("offBmi"),
        C_LONG.withName("cbBmi"),
        C_LONG.withName("offBits"),
        C_LONG.withName("cbBits")
    ).withName("tagEMRCREATEMONOBRUSH");
    public static MemoryLayout $LAYOUT() {
        return tagEMRCREATEMONOBRUSH.$struct$LAYOUT;
    }
    public static MemorySegment emr$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle ihBrush$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ihBrush"));
    public static VarHandle ihBrush$VH() {
        return tagEMRCREATEMONOBRUSH.ihBrush$VH;
    }
    public static int ihBrush$get(MemorySegment seg) {
        return (int)tagEMRCREATEMONOBRUSH.ihBrush$VH.get(seg);
    }
    public static void ihBrush$set( MemorySegment seg, int x) {
        tagEMRCREATEMONOBRUSH.ihBrush$VH.set(seg, x);
    }
    public static int ihBrush$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEMONOBRUSH.ihBrush$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ihBrush$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEMONOBRUSH.ihBrush$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iUsage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iUsage"));
    public static VarHandle iUsage$VH() {
        return tagEMRCREATEMONOBRUSH.iUsage$VH;
    }
    public static int iUsage$get(MemorySegment seg) {
        return (int)tagEMRCREATEMONOBRUSH.iUsage$VH.get(seg);
    }
    public static void iUsage$set( MemorySegment seg, int x) {
        tagEMRCREATEMONOBRUSH.iUsage$VH.set(seg, x);
    }
    public static int iUsage$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEMONOBRUSH.iUsage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iUsage$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEMONOBRUSH.iUsage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBmi$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("offBmi"));
    public static VarHandle offBmi$VH() {
        return tagEMRCREATEMONOBRUSH.offBmi$VH;
    }
    public static int offBmi$get(MemorySegment seg) {
        return (int)tagEMRCREATEMONOBRUSH.offBmi$VH.get(seg);
    }
    public static void offBmi$set( MemorySegment seg, int x) {
        tagEMRCREATEMONOBRUSH.offBmi$VH.set(seg, x);
    }
    public static int offBmi$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEMONOBRUSH.offBmi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBmi$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEMONOBRUSH.offBmi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBmi$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbBmi"));
    public static VarHandle cbBmi$VH() {
        return tagEMRCREATEMONOBRUSH.cbBmi$VH;
    }
    public static int cbBmi$get(MemorySegment seg) {
        return (int)tagEMRCREATEMONOBRUSH.cbBmi$VH.get(seg);
    }
    public static void cbBmi$set( MemorySegment seg, int x) {
        tagEMRCREATEMONOBRUSH.cbBmi$VH.set(seg, x);
    }
    public static int cbBmi$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEMONOBRUSH.cbBmi$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBmi$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEMONOBRUSH.cbBmi$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offBits$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("offBits"));
    public static VarHandle offBits$VH() {
        return tagEMRCREATEMONOBRUSH.offBits$VH;
    }
    public static int offBits$get(MemorySegment seg) {
        return (int)tagEMRCREATEMONOBRUSH.offBits$VH.get(seg);
    }
    public static void offBits$set( MemorySegment seg, int x) {
        tagEMRCREATEMONOBRUSH.offBits$VH.set(seg, x);
    }
    public static int offBits$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEMONOBRUSH.offBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offBits$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEMONOBRUSH.offBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbBits$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbBits"));
    public static VarHandle cbBits$VH() {
        return tagEMRCREATEMONOBRUSH.cbBits$VH;
    }
    public static int cbBits$get(MemorySegment seg) {
        return (int)tagEMRCREATEMONOBRUSH.cbBits$VH.get(seg);
    }
    public static void cbBits$set( MemorySegment seg, int x) {
        tagEMRCREATEMONOBRUSH.cbBits$VH.set(seg, x);
    }
    public static int cbBits$get(MemorySegment seg, long index) {
        return (int)tagEMRCREATEMONOBRUSH.cbBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbBits$set(MemorySegment seg, long index, int x) {
        tagEMRCREATEMONOBRUSH.cbBits$VH.set(seg.asSlice(index*sizeof()), x);
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


