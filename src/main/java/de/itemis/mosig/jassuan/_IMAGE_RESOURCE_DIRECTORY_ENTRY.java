// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _IMAGE_RESOURCE_DIRECTORY_ENTRY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.valueLayout(31, ByteOrder.nativeOrder()).withName("NameOffset"),
                    MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("NameIsString")
                )
            ).withName("$anon$0"),
            C_LONG.withName("Name"),
            C_SHORT.withName("Id")
        ).withName("$anon$0"),
        MemoryLayout.unionLayout(
            C_LONG.withName("OffsetToData"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    MemoryLayout.valueLayout(31, ByteOrder.nativeOrder()).withName("OffsetToDirectory"),
                    MemoryLayout.valueLayout(1, ByteOrder.nativeOrder()).withName("DataIsDirectory")
                )
            ).withName("$anon$0")
        ).withName("$anon$1")
    ).withName("_IMAGE_RESOURCE_DIRECTORY_ENTRY");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_RESOURCE_DIRECTORY_ENTRY.$struct$LAYOUT;
    }
    static final VarHandle Name$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Name"));
    public static VarHandle Name$VH() {
        return _IMAGE_RESOURCE_DIRECTORY_ENTRY.Name$VH;
    }
    public static int Name$get(MemorySegment seg) {
        return (int)_IMAGE_RESOURCE_DIRECTORY_ENTRY.Name$VH.get(seg);
    }
    public static void Name$set( MemorySegment seg, int x) {
        _IMAGE_RESOURCE_DIRECTORY_ENTRY.Name$VH.set(seg, x);
    }
    public static int Name$get(MemorySegment seg, long index) {
        return (int)_IMAGE_RESOURCE_DIRECTORY_ENTRY.Name$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Name$set(MemorySegment seg, long index, int x) {
        _IMAGE_RESOURCE_DIRECTORY_ENTRY.Name$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Id$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Id"));
    public static VarHandle Id$VH() {
        return _IMAGE_RESOURCE_DIRECTORY_ENTRY.Id$VH;
    }
    public static short Id$get(MemorySegment seg) {
        return (short)_IMAGE_RESOURCE_DIRECTORY_ENTRY.Id$VH.get(seg);
    }
    public static void Id$set( MemorySegment seg, short x) {
        _IMAGE_RESOURCE_DIRECTORY_ENTRY.Id$VH.set(seg, x);
    }
    public static short Id$get(MemorySegment seg, long index) {
        return (short)_IMAGE_RESOURCE_DIRECTORY_ENTRY.Id$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Id$set(MemorySegment seg, long index, short x) {
        _IMAGE_RESOURCE_DIRECTORY_ENTRY.Id$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle OffsetToData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$1"), MemoryLayout.PathElement.groupElement("OffsetToData"));
    public static VarHandle OffsetToData$VH() {
        return _IMAGE_RESOURCE_DIRECTORY_ENTRY.OffsetToData$VH;
    }
    public static int OffsetToData$get(MemorySegment seg) {
        return (int)_IMAGE_RESOURCE_DIRECTORY_ENTRY.OffsetToData$VH.get(seg);
    }
    public static void OffsetToData$set( MemorySegment seg, int x) {
        _IMAGE_RESOURCE_DIRECTORY_ENTRY.OffsetToData$VH.set(seg, x);
    }
    public static int OffsetToData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_RESOURCE_DIRECTORY_ENTRY.OffsetToData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OffsetToData$set(MemorySegment seg, long index, int x) {
        _IMAGE_RESOURCE_DIRECTORY_ENTRY.OffsetToData$VH.set(seg.asSlice(index*sizeof()), x);
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


