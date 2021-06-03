// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagDELETEITEMSTRUCT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("CtlType"),
        C_INT.withName("CtlID"),
        C_INT.withName("itemID"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwndItem"),
        C_LONG_LONG.withName("itemData")
    ).withName("tagDELETEITEMSTRUCT");
    public static MemoryLayout $LAYOUT() {
        return tagDELETEITEMSTRUCT.$struct$LAYOUT;
    }
    static final VarHandle CtlType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CtlType"));
    public static VarHandle CtlType$VH() {
        return tagDELETEITEMSTRUCT.CtlType$VH;
    }
    public static int CtlType$get(MemorySegment seg) {
        return (int)tagDELETEITEMSTRUCT.CtlType$VH.get(seg);
    }
    public static void CtlType$set( MemorySegment seg, int x) {
        tagDELETEITEMSTRUCT.CtlType$VH.set(seg, x);
    }
    public static int CtlType$get(MemorySegment seg, long index) {
        return (int)tagDELETEITEMSTRUCT.CtlType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlType$set(MemorySegment seg, long index, int x) {
        tagDELETEITEMSTRUCT.CtlType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CtlID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CtlID"));
    public static VarHandle CtlID$VH() {
        return tagDELETEITEMSTRUCT.CtlID$VH;
    }
    public static int CtlID$get(MemorySegment seg) {
        return (int)tagDELETEITEMSTRUCT.CtlID$VH.get(seg);
    }
    public static void CtlID$set( MemorySegment seg, int x) {
        tagDELETEITEMSTRUCT.CtlID$VH.set(seg, x);
    }
    public static int CtlID$get(MemorySegment seg, long index) {
        return (int)tagDELETEITEMSTRUCT.CtlID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CtlID$set(MemorySegment seg, long index, int x) {
        tagDELETEITEMSTRUCT.CtlID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("itemID"));
    public static VarHandle itemID$VH() {
        return tagDELETEITEMSTRUCT.itemID$VH;
    }
    public static int itemID$get(MemorySegment seg) {
        return (int)tagDELETEITEMSTRUCT.itemID$VH.get(seg);
    }
    public static void itemID$set( MemorySegment seg, int x) {
        tagDELETEITEMSTRUCT.itemID$VH.set(seg, x);
    }
    public static int itemID$get(MemorySegment seg, long index) {
        return (int)tagDELETEITEMSTRUCT.itemID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemID$set(MemorySegment seg, long index, int x) {
        tagDELETEITEMSTRUCT.itemID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndItem$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndItem")));
    public static VarHandle hwndItem$VH() {
        return tagDELETEITEMSTRUCT.hwndItem$VH;
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagDELETEITEMSTRUCT.hwndItem$VH.get(seg);
    }
    public static void hwndItem$set( MemorySegment seg, MemoryAddress x) {
        tagDELETEITEMSTRUCT.hwndItem$VH.set(seg, x);
    }
    public static MemoryAddress hwndItem$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagDELETEITEMSTRUCT.hwndItem$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndItem$set(MemorySegment seg, long index, MemoryAddress x) {
        tagDELETEITEMSTRUCT.hwndItem$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle itemData$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("itemData"));
    public static VarHandle itemData$VH() {
        return tagDELETEITEMSTRUCT.itemData$VH;
    }
    public static long itemData$get(MemorySegment seg) {
        return (long)tagDELETEITEMSTRUCT.itemData$VH.get(seg);
    }
    public static void itemData$set( MemorySegment seg, long x) {
        tagDELETEITEMSTRUCT.itemData$VH.set(seg, x);
    }
    public static long itemData$get(MemorySegment seg, long index) {
        return (long)tagDELETEITEMSTRUCT.itemData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void itemData$set(MemorySegment seg, long index, long x) {
        tagDELETEITEMSTRUCT.itemData$VH.set(seg.asSlice(index*sizeof()), x);
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


