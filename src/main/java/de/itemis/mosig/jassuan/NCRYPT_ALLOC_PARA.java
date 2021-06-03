// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class NCRYPT_ALLOC_PARA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pfnAlloc"),
        C_POINTER.withName("pfnFree")
    ).withName("NCRYPT_ALLOC_PARA");
    public static MemoryLayout $LAYOUT() {
        return NCRYPT_ALLOC_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return NCRYPT_ALLOC_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)NCRYPT_ALLOC_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        NCRYPT_ALLOC_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)NCRYPT_ALLOC_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        NCRYPT_ALLOC_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnAlloc$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnAlloc")));
    public static VarHandle pfnAlloc$VH() {
        return NCRYPT_ALLOC_PARA.pfnAlloc$VH;
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)NCRYPT_ALLOC_PARA.pfnAlloc$VH.get(seg);
    }
    public static void pfnAlloc$set( MemorySegment seg, MemoryAddress x) {
        NCRYPT_ALLOC_PARA.pfnAlloc$VH.set(seg, x);
    }
    public static MemoryAddress pfnAlloc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)NCRYPT_ALLOC_PARA.pfnAlloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnAlloc$set(MemorySegment seg, long index, MemoryAddress x) {
        NCRYPT_ALLOC_PARA.pfnAlloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_NCRYPT_ALLOC pfnAlloc (MemorySegment segment) {
        return PFN_NCRYPT_ALLOC.ofAddress(pfnAlloc$get(segment));
    }
    static final VarHandle pfnFree$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnFree")));
    public static VarHandle pfnFree$VH() {
        return NCRYPT_ALLOC_PARA.pfnFree$VH;
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)NCRYPT_ALLOC_PARA.pfnFree$VH.get(seg);
    }
    public static void pfnFree$set( MemorySegment seg, MemoryAddress x) {
        NCRYPT_ALLOC_PARA.pfnFree$VH.set(seg, x);
    }
    public static MemoryAddress pfnFree$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)NCRYPT_ALLOC_PARA.pfnFree$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnFree$set(MemorySegment seg, long index, MemoryAddress x) {
        NCRYPT_ALLOC_PARA.pfnFree$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_NCRYPT_FREE pfnFree (MemorySegment segment) {
        return PFN_NCRYPT_FREE.ofAddress(pfnFree$get(segment));
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


