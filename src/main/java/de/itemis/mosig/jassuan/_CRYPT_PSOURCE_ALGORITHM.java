// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_PSOURCE_ALGORITHM {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pszObjId"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("EncodingParameters")
    ).withName("_CRYPT_PSOURCE_ALGORITHM");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_PSOURCE_ALGORITHM.$struct$LAYOUT;
    }
    static final VarHandle pszObjId$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszObjId")));
    public static VarHandle pszObjId$VH() {
        return _CRYPT_PSOURCE_ALGORITHM.pszObjId$VH;
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_PSOURCE_ALGORITHM.pszObjId$VH.get(seg);
    }
    public static void pszObjId$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_PSOURCE_ALGORITHM.pszObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszObjId$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_PSOURCE_ALGORITHM.pszObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_PSOURCE_ALGORITHM.pszObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment EncodingParameters$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
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


