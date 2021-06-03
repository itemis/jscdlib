// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FORM_INFO_2A {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pName"),
        MemoryLayout.structLayout(
            C_LONG.withName("cx"),
            C_LONG.withName("cy")
        ).withName("Size"),
        MemoryLayout.structLayout(
            C_LONG.withName("left"),
            C_LONG.withName("top"),
            C_LONG.withName("right"),
            C_LONG.withName("bottom")
        ).withName("ImageableArea"),
        C_POINTER.withName("pKeyword"),
        C_LONG.withName("StringType"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pMuiDll"),
        C_LONG.withName("dwResourceId"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pDisplayName"),
        C_SHORT.withName("wLangId"),
        MemoryLayout.paddingLayout(48)
    ).withName("_FORM_INFO_2A");
    public static MemoryLayout $LAYOUT() {
        return _FORM_INFO_2A.$struct$LAYOUT;
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FORM_INFO_2A.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FORM_INFO_2A.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FORM_INFO_2A.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FORM_INFO_2A.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FORM_INFO_2A.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pName")));
    public static VarHandle pName$VH() {
        return _FORM_INFO_2A.pName$VH;
    }
    public static MemoryAddress pName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pName$VH.get(seg);
    }
    public static void pName$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2A.pName$VH.set(seg, x);
    }
    public static MemoryAddress pName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pName$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2A.pName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Size$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment ImageableArea$slice(MemorySegment seg) {
        return seg.asSlice(24, 16);
    }
    static final VarHandle pKeyword$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pKeyword")));
    public static VarHandle pKeyword$VH() {
        return _FORM_INFO_2A.pKeyword$VH;
    }
    public static MemoryAddress pKeyword$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pKeyword$VH.get(seg);
    }
    public static void pKeyword$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2A.pKeyword$VH.set(seg, x);
    }
    public static MemoryAddress pKeyword$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pKeyword$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pKeyword$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2A.pKeyword$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StringType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("StringType"));
    public static VarHandle StringType$VH() {
        return _FORM_INFO_2A.StringType$VH;
    }
    public static int StringType$get(MemorySegment seg) {
        return (int)_FORM_INFO_2A.StringType$VH.get(seg);
    }
    public static void StringType$set( MemorySegment seg, int x) {
        _FORM_INFO_2A.StringType$VH.set(seg, x);
    }
    public static int StringType$get(MemorySegment seg, long index) {
        return (int)_FORM_INFO_2A.StringType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StringType$set(MemorySegment seg, long index, int x) {
        _FORM_INFO_2A.StringType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pMuiDll$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pMuiDll")));
    public static VarHandle pMuiDll$VH() {
        return _FORM_INFO_2A.pMuiDll$VH;
    }
    public static MemoryAddress pMuiDll$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pMuiDll$VH.get(seg);
    }
    public static void pMuiDll$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2A.pMuiDll$VH.set(seg, x);
    }
    public static MemoryAddress pMuiDll$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pMuiDll$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pMuiDll$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2A.pMuiDll$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwResourceId$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwResourceId"));
    public static VarHandle dwResourceId$VH() {
        return _FORM_INFO_2A.dwResourceId$VH;
    }
    public static int dwResourceId$get(MemorySegment seg) {
        return (int)_FORM_INFO_2A.dwResourceId$VH.get(seg);
    }
    public static void dwResourceId$set( MemorySegment seg, int x) {
        _FORM_INFO_2A.dwResourceId$VH.set(seg, x);
    }
    public static int dwResourceId$get(MemorySegment seg, long index) {
        return (int)_FORM_INFO_2A.dwResourceId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResourceId$set(MemorySegment seg, long index, int x) {
        _FORM_INFO_2A.dwResourceId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDisplayName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pDisplayName")));
    public static VarHandle pDisplayName$VH() {
        return _FORM_INFO_2A.pDisplayName$VH;
    }
    public static MemoryAddress pDisplayName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pDisplayName$VH.get(seg);
    }
    public static void pDisplayName$set( MemorySegment seg, MemoryAddress x) {
        _FORM_INFO_2A.pDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress pDisplayName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_FORM_INFO_2A.pDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        _FORM_INFO_2A.pDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wLangId$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wLangId"));
    public static VarHandle wLangId$VH() {
        return _FORM_INFO_2A.wLangId$VH;
    }
    public static short wLangId$get(MemorySegment seg) {
        return (short)_FORM_INFO_2A.wLangId$VH.get(seg);
    }
    public static void wLangId$set( MemorySegment seg, short x) {
        _FORM_INFO_2A.wLangId$VH.set(seg, x);
    }
    public static short wLangId$get(MemorySegment seg, long index) {
        return (short)_FORM_INFO_2A.wLangId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wLangId$set(MemorySegment seg, long index, short x) {
        _FORM_INFO_2A.wLangId$VH.set(seg.asSlice(index*sizeof()), x);
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


