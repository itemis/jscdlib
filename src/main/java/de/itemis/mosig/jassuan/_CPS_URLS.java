// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CPS_URLS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pszURL"),
        C_POINTER.withName("pAlgorithm"),
        C_POINTER.withName("pDigest")
    ).withName("_CPS_URLS");
    public static MemoryLayout $LAYOUT() {
        return _CPS_URLS.$struct$LAYOUT;
    }
    static final VarHandle pszURL$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszURL")));
    public static VarHandle pszURL$VH() {
        return _CPS_URLS.pszURL$VH;
    }
    public static MemoryAddress pszURL$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CPS_URLS.pszURL$VH.get(seg);
    }
    public static void pszURL$set( MemorySegment seg, MemoryAddress x) {
        _CPS_URLS.pszURL$VH.set(seg, x);
    }
    public static MemoryAddress pszURL$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CPS_URLS.pszURL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszURL$set(MemorySegment seg, long index, MemoryAddress x) {
        _CPS_URLS.pszURL$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pAlgorithm$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pAlgorithm")));
    public static VarHandle pAlgorithm$VH() {
        return _CPS_URLS.pAlgorithm$VH;
    }
    public static MemoryAddress pAlgorithm$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CPS_URLS.pAlgorithm$VH.get(seg);
    }
    public static void pAlgorithm$set( MemorySegment seg, MemoryAddress x) {
        _CPS_URLS.pAlgorithm$VH.set(seg, x);
    }
    public static MemoryAddress pAlgorithm$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CPS_URLS.pAlgorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pAlgorithm$set(MemorySegment seg, long index, MemoryAddress x) {
        _CPS_URLS.pAlgorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDigest$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pDigest")));
    public static VarHandle pDigest$VH() {
        return _CPS_URLS.pDigest$VH;
    }
    public static MemoryAddress pDigest$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CPS_URLS.pDigest$VH.get(seg);
    }
    public static void pDigest$set( MemorySegment seg, MemoryAddress x) {
        _CPS_URLS.pDigest$VH.set(seg, x);
    }
    public static MemoryAddress pDigest$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CPS_URLS.pDigest$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDigest$set(MemorySegment seg, long index, MemoryAddress x) {
        _CPS_URLS.pDigest$VH.set(seg.asSlice(index*sizeof()), x);
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


