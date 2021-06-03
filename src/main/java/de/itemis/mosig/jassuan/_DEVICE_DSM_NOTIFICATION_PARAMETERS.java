// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _DEVICE_DSM_NOTIFICATION_PARAMETERS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Size"),
        C_LONG.withName("Flags"),
        C_LONG.withName("NumFileTypeIDs"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("_GUID")).withName("FileTypeID")
    ).withName("_DEVICE_DSM_NOTIFICATION_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_DSM_NOTIFICATION_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_DSM_NOTIFICATION_PARAMETERS.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_NOTIFICATION_PARAMETERS.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_DSM_NOTIFICATION_PARAMETERS.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_NOTIFICATION_PARAMETERS.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_NOTIFICATION_PARAMETERS.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _DEVICE_DSM_NOTIFICATION_PARAMETERS.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_NOTIFICATION_PARAMETERS.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _DEVICE_DSM_NOTIFICATION_PARAMETERS.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_NOTIFICATION_PARAMETERS.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_NOTIFICATION_PARAMETERS.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumFileTypeIDs$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumFileTypeIDs"));
    public static VarHandle NumFileTypeIDs$VH() {
        return _DEVICE_DSM_NOTIFICATION_PARAMETERS.NumFileTypeIDs$VH;
    }
    public static int NumFileTypeIDs$get(MemorySegment seg) {
        return (int)_DEVICE_DSM_NOTIFICATION_PARAMETERS.NumFileTypeIDs$VH.get(seg);
    }
    public static void NumFileTypeIDs$set( MemorySegment seg, int x) {
        _DEVICE_DSM_NOTIFICATION_PARAMETERS.NumFileTypeIDs$VH.set(seg, x);
    }
    public static int NumFileTypeIDs$get(MemorySegment seg, long index) {
        return (int)_DEVICE_DSM_NOTIFICATION_PARAMETERS.NumFileTypeIDs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumFileTypeIDs$set(MemorySegment seg, long index, int x) {
        _DEVICE_DSM_NOTIFICATION_PARAMETERS.NumFileTypeIDs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileTypeID$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
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


