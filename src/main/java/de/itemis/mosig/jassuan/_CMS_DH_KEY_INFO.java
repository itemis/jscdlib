// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CMS_DH_KEY_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        C_INT.withName("Algid"),
        C_POINTER.withName("pszContentEncObjId"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("PubInfo"),
        C_POINTER.withName("pReserved")
    ).withName("_CMS_DH_KEY_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMS_DH_KEY_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CMS_DH_KEY_INFO.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CMS_DH_KEY_INFO.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CMS_DH_KEY_INFO.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CMS_DH_KEY_INFO.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CMS_DH_KEY_INFO.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Algid$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Algid"));
    public static VarHandle Algid$VH() {
        return _CMS_DH_KEY_INFO.Algid$VH;
    }
    public static int Algid$get(MemorySegment seg) {
        return (int)_CMS_DH_KEY_INFO.Algid$VH.get(seg);
    }
    public static void Algid$set( MemorySegment seg, int x) {
        _CMS_DH_KEY_INFO.Algid$VH.set(seg, x);
    }
    public static int Algid$get(MemorySegment seg, long index) {
        return (int)_CMS_DH_KEY_INFO.Algid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Algid$set(MemorySegment seg, long index, int x) {
        _CMS_DH_KEY_INFO.Algid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszContentEncObjId$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszContentEncObjId")));
    public static VarHandle pszContentEncObjId$VH() {
        return _CMS_DH_KEY_INFO.pszContentEncObjId$VH;
    }
    public static MemoryAddress pszContentEncObjId$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CMS_DH_KEY_INFO.pszContentEncObjId$VH.get(seg);
    }
    public static void pszContentEncObjId$set( MemorySegment seg, MemoryAddress x) {
        _CMS_DH_KEY_INFO.pszContentEncObjId$VH.set(seg, x);
    }
    public static MemoryAddress pszContentEncObjId$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CMS_DH_KEY_INFO.pszContentEncObjId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszContentEncObjId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMS_DH_KEY_INFO.pszContentEncObjId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PubInfo$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
    }
    static final VarHandle pReserved$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pReserved")));
    public static VarHandle pReserved$VH() {
        return _CMS_DH_KEY_INFO.pReserved$VH;
    }
    public static MemoryAddress pReserved$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CMS_DH_KEY_INFO.pReserved$VH.get(seg);
    }
    public static void pReserved$set( MemorySegment seg, MemoryAddress x) {
        _CMS_DH_KEY_INFO.pReserved$VH.set(seg, x);
    }
    public static MemoryAddress pReserved$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CMS_DH_KEY_INFO.pReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pReserved$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMS_DH_KEY_INFO.pReserved$VH.set(seg.asSlice(index*sizeof()), x);
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


