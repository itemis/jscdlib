// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _KCRM_MARSHAL_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("VersionMajor"),
        C_LONG.withName("VersionMinor"),
        C_LONG.withName("NumProtocols"),
        C_LONG.withName("Unused")
    ).withName("_KCRM_MARSHAL_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _KCRM_MARSHAL_HEADER.$struct$LAYOUT;
    }
    static final VarHandle VersionMajor$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("VersionMajor"));
    public static VarHandle VersionMajor$VH() {
        return _KCRM_MARSHAL_HEADER.VersionMajor$VH;
    }
    public static int VersionMajor$get(MemorySegment seg) {
        return (int)_KCRM_MARSHAL_HEADER.VersionMajor$VH.get(seg);
    }
    public static void VersionMajor$set( MemorySegment seg, int x) {
        _KCRM_MARSHAL_HEADER.VersionMajor$VH.set(seg, x);
    }
    public static int VersionMajor$get(MemorySegment seg, long index) {
        return (int)_KCRM_MARSHAL_HEADER.VersionMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VersionMajor$set(MemorySegment seg, long index, int x) {
        _KCRM_MARSHAL_HEADER.VersionMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VersionMinor$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("VersionMinor"));
    public static VarHandle VersionMinor$VH() {
        return _KCRM_MARSHAL_HEADER.VersionMinor$VH;
    }
    public static int VersionMinor$get(MemorySegment seg) {
        return (int)_KCRM_MARSHAL_HEADER.VersionMinor$VH.get(seg);
    }
    public static void VersionMinor$set( MemorySegment seg, int x) {
        _KCRM_MARSHAL_HEADER.VersionMinor$VH.set(seg, x);
    }
    public static int VersionMinor$get(MemorySegment seg, long index) {
        return (int)_KCRM_MARSHAL_HEADER.VersionMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VersionMinor$set(MemorySegment seg, long index, int x) {
        _KCRM_MARSHAL_HEADER.VersionMinor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumProtocols$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumProtocols"));
    public static VarHandle NumProtocols$VH() {
        return _KCRM_MARSHAL_HEADER.NumProtocols$VH;
    }
    public static int NumProtocols$get(MemorySegment seg) {
        return (int)_KCRM_MARSHAL_HEADER.NumProtocols$VH.get(seg);
    }
    public static void NumProtocols$set( MemorySegment seg, int x) {
        _KCRM_MARSHAL_HEADER.NumProtocols$VH.set(seg, x);
    }
    public static int NumProtocols$get(MemorySegment seg, long index) {
        return (int)_KCRM_MARSHAL_HEADER.NumProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumProtocols$set(MemorySegment seg, long index, int x) {
        _KCRM_MARSHAL_HEADER.NumProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Unused$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Unused"));
    public static VarHandle Unused$VH() {
        return _KCRM_MARSHAL_HEADER.Unused$VH;
    }
    public static int Unused$get(MemorySegment seg) {
        return (int)_KCRM_MARSHAL_HEADER.Unused$VH.get(seg);
    }
    public static void Unused$set( MemorySegment seg, int x) {
        _KCRM_MARSHAL_HEADER.Unused$VH.set(seg, x);
    }
    public static int Unused$get(MemorySegment seg, long index) {
        return (int)_KCRM_MARSHAL_HEADER.Unused$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Unused$set(MemorySegment seg, long index, int x) {
        _KCRM_MARSHAL_HEADER.Unused$VH.set(seg.asSlice(index*sizeof()), x);
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


