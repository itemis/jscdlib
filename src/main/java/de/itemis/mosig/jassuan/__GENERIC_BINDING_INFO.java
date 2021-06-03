// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __GENERIC_BINDING_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pObj"),
        C_INT.withName("Size"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pfnBind"),
        C_POINTER.withName("pfnUnbind")
    ).withName("__GENERIC_BINDING_INFO");
    public static MemoryLayout $LAYOUT() {
        return __GENERIC_BINDING_INFO.$struct$LAYOUT;
    }
    static final VarHandle pObj$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pObj")));
    public static VarHandle pObj$VH() {
        return __GENERIC_BINDING_INFO.pObj$VH;
    }
    public static MemoryAddress pObj$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__GENERIC_BINDING_INFO.pObj$VH.get(seg);
    }
    public static void pObj$set( MemorySegment seg, MemoryAddress x) {
        __GENERIC_BINDING_INFO.pObj$VH.set(seg, x);
    }
    public static MemoryAddress pObj$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__GENERIC_BINDING_INFO.pObj$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pObj$set(MemorySegment seg, long index, MemoryAddress x) {
        __GENERIC_BINDING_INFO.pObj$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return __GENERIC_BINDING_INFO.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)__GENERIC_BINDING_INFO.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        __GENERIC_BINDING_INFO.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)__GENERIC_BINDING_INFO.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        __GENERIC_BINDING_INFO.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnBind$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnBind")));
    public static VarHandle pfnBind$VH() {
        return __GENERIC_BINDING_INFO.pfnBind$VH;
    }
    public static MemoryAddress pfnBind$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__GENERIC_BINDING_INFO.pfnBind$VH.get(seg);
    }
    public static void pfnBind$set( MemorySegment seg, MemoryAddress x) {
        __GENERIC_BINDING_INFO.pfnBind$VH.set(seg, x);
    }
    public static MemoryAddress pfnBind$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__GENERIC_BINDING_INFO.pfnBind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnBind$set(MemorySegment seg, long index, MemoryAddress x) {
        __GENERIC_BINDING_INFO.pfnBind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GENERIC_BINDING_ROUTINE pfnBind (MemorySegment segment) {
        return GENERIC_BINDING_ROUTINE.ofAddress(pfnBind$get(segment));
    }
    static final VarHandle pfnUnbind$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnUnbind")));
    public static VarHandle pfnUnbind$VH() {
        return __GENERIC_BINDING_INFO.pfnUnbind$VH;
    }
    public static MemoryAddress pfnUnbind$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__GENERIC_BINDING_INFO.pfnUnbind$VH.get(seg);
    }
    public static void pfnUnbind$set( MemorySegment seg, MemoryAddress x) {
        __GENERIC_BINDING_INFO.pfnUnbind$VH.set(seg, x);
    }
    public static MemoryAddress pfnUnbind$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__GENERIC_BINDING_INFO.pfnUnbind$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnUnbind$set(MemorySegment seg, long index, MemoryAddress x) {
        __GENERIC_BINDING_INFO.pfnUnbind$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GENERIC_UNBIND_ROUTINE pfnUnbind (MemorySegment segment) {
        return GENERIC_UNBIND_ROUTINE.ofAddress(pfnUnbind$get(segment));
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


