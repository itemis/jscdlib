// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMENUINFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("fMask"),
        C_LONG.withName("dwStyle"),
        C_INT.withName("cyMax"),
        C_POINTER.withName("hbrBack"),
        C_LONG.withName("dwContextHelpID"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("dwMenuData")
    ).withName("tagMENUINFO");
    public static MemoryLayout $LAYOUT() {
        return tagMENUINFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagMENUINFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagMENUINFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagMENUINFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagMENUINFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagMENUINFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fMask"));
    public static VarHandle fMask$VH() {
        return tagMENUINFO.fMask$VH;
    }
    public static int fMask$get(MemorySegment seg) {
        return (int)tagMENUINFO.fMask$VH.get(seg);
    }
    public static void fMask$set( MemorySegment seg, int x) {
        tagMENUINFO.fMask$VH.set(seg, x);
    }
    public static int fMask$get(MemorySegment seg, long index) {
        return (int)tagMENUINFO.fMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fMask$set(MemorySegment seg, long index, int x) {
        tagMENUINFO.fMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwStyle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwStyle"));
    public static VarHandle dwStyle$VH() {
        return tagMENUINFO.dwStyle$VH;
    }
    public static int dwStyle$get(MemorySegment seg) {
        return (int)tagMENUINFO.dwStyle$VH.get(seg);
    }
    public static void dwStyle$set( MemorySegment seg, int x) {
        tagMENUINFO.dwStyle$VH.set(seg, x);
    }
    public static int dwStyle$get(MemorySegment seg, long index) {
        return (int)tagMENUINFO.dwStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStyle$set(MemorySegment seg, long index, int x) {
        tagMENUINFO.dwStyle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cyMax$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cyMax"));
    public static VarHandle cyMax$VH() {
        return tagMENUINFO.cyMax$VH;
    }
    public static int cyMax$get(MemorySegment seg) {
        return (int)tagMENUINFO.cyMax$VH.get(seg);
    }
    public static void cyMax$set( MemorySegment seg, int x) {
        tagMENUINFO.cyMax$VH.set(seg, x);
    }
    public static int cyMax$get(MemorySegment seg, long index) {
        return (int)tagMENUINFO.cyMax$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cyMax$set(MemorySegment seg, long index, int x) {
        tagMENUINFO.cyMax$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hbrBack$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hbrBack")));
    public static VarHandle hbrBack$VH() {
        return tagMENUINFO.hbrBack$VH;
    }
    public static MemoryAddress hbrBack$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMENUINFO.hbrBack$VH.get(seg);
    }
    public static void hbrBack$set( MemorySegment seg, MemoryAddress x) {
        tagMENUINFO.hbrBack$VH.set(seg, x);
    }
    public static MemoryAddress hbrBack$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMENUINFO.hbrBack$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hbrBack$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMENUINFO.hbrBack$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwContextHelpID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwContextHelpID"));
    public static VarHandle dwContextHelpID$VH() {
        return tagMENUINFO.dwContextHelpID$VH;
    }
    public static int dwContextHelpID$get(MemorySegment seg) {
        return (int)tagMENUINFO.dwContextHelpID$VH.get(seg);
    }
    public static void dwContextHelpID$set( MemorySegment seg, int x) {
        tagMENUINFO.dwContextHelpID$VH.set(seg, x);
    }
    public static int dwContextHelpID$get(MemorySegment seg, long index) {
        return (int)tagMENUINFO.dwContextHelpID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwContextHelpID$set(MemorySegment seg, long index, int x) {
        tagMENUINFO.dwContextHelpID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMenuData$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwMenuData"));
    public static VarHandle dwMenuData$VH() {
        return tagMENUINFO.dwMenuData$VH;
    }
    public static long dwMenuData$get(MemorySegment seg) {
        return (long)tagMENUINFO.dwMenuData$VH.get(seg);
    }
    public static void dwMenuData$set( MemorySegment seg, long x) {
        tagMENUINFO.dwMenuData$VH.set(seg, x);
    }
    public static long dwMenuData$get(MemorySegment seg, long index) {
        return (long)tagMENUINFO.dwMenuData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMenuData$set(MemorySegment seg, long index, long x) {
        tagMENUINFO.dwMenuData$VH.set(seg.asSlice(index*sizeof()), x);
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


