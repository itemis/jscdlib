// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class DRVCONFIGINFOEX {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwDCISize"),
        C_POINTER.withName("lpszDCISectionName"),
        C_POINTER.withName("lpszDCIAliasName"),
        C_LONG.withName("dnDevNode")
    ).withName("DRVCONFIGINFOEX");
    public static MemoryLayout $LAYOUT() {
        return DRVCONFIGINFOEX.$struct$LAYOUT;
    }
    static final VarHandle dwDCISize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwDCISize"));
    public static VarHandle dwDCISize$VH() {
        return DRVCONFIGINFOEX.dwDCISize$VH;
    }
    public static int dwDCISize$get(MemorySegment seg) {
        return (int)DRVCONFIGINFOEX.dwDCISize$VH.get(seg);
    }
    public static void dwDCISize$set( MemorySegment seg, int x) {
        DRVCONFIGINFOEX.dwDCISize$VH.set(seg, x);
    }
    public static int dwDCISize$get(MemorySegment seg, long index) {
        return (int)DRVCONFIGINFOEX.dwDCISize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwDCISize$set(MemorySegment seg, long index, int x) {
        DRVCONFIGINFOEX.dwDCISize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDCISectionName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszDCISectionName")));
    public static VarHandle lpszDCISectionName$VH() {
        return DRVCONFIGINFOEX.lpszDCISectionName$VH;
    }
    public static MemoryAddress lpszDCISectionName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)DRVCONFIGINFOEX.lpszDCISectionName$VH.get(seg);
    }
    public static void lpszDCISectionName$set( MemorySegment seg, MemoryAddress x) {
        DRVCONFIGINFOEX.lpszDCISectionName$VH.set(seg, x);
    }
    public static MemoryAddress lpszDCISectionName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)DRVCONFIGINFOEX.lpszDCISectionName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDCISectionName$set(MemorySegment seg, long index, MemoryAddress x) {
        DRVCONFIGINFOEX.lpszDCISectionName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszDCIAliasName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszDCIAliasName")));
    public static VarHandle lpszDCIAliasName$VH() {
        return DRVCONFIGINFOEX.lpszDCIAliasName$VH;
    }
    public static MemoryAddress lpszDCIAliasName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)DRVCONFIGINFOEX.lpszDCIAliasName$VH.get(seg);
    }
    public static void lpszDCIAliasName$set( MemorySegment seg, MemoryAddress x) {
        DRVCONFIGINFOEX.lpszDCIAliasName$VH.set(seg, x);
    }
    public static MemoryAddress lpszDCIAliasName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)DRVCONFIGINFOEX.lpszDCIAliasName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszDCIAliasName$set(MemorySegment seg, long index, MemoryAddress x) {
        DRVCONFIGINFOEX.lpszDCIAliasName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dnDevNode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dnDevNode"));
    public static VarHandle dnDevNode$VH() {
        return DRVCONFIGINFOEX.dnDevNode$VH;
    }
    public static int dnDevNode$get(MemorySegment seg) {
        return (int)DRVCONFIGINFOEX.dnDevNode$VH.get(seg);
    }
    public static void dnDevNode$set( MemorySegment seg, int x) {
        DRVCONFIGINFOEX.dnDevNode$VH.set(seg, x);
    }
    public static int dnDevNode$get(MemorySegment seg, long index) {
        return (int)DRVCONFIGINFOEX.dnDevNode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dnDevNode$set(MemorySegment seg, long index, int x) {
        DRVCONFIGINFOEX.dnDevNode$VH.set(seg.asSlice(index*sizeof()), x);
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


