// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _DEVICE_MANAGE_DATA_SET_ATTRIBUTES {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Size"),
        C_LONG.withName("Action"),
        C_LONG.withName("Flags"),
        C_LONG.withName("ParameterBlockOffset"),
        C_LONG.withName("ParameterBlockLength"),
        C_LONG.withName("DataSetRangesOffset"),
        C_LONG.withName("DataSetRangesLength")
    ).withName("_DEVICE_MANAGE_DATA_SET_ATTRIBUTES");
    public static MemoryLayout $LAYOUT() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.$struct$LAYOUT;
    }
    static final VarHandle Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Size"));
    public static VarHandle Size$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Size$VH;
    }
    public static int Size$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Size$VH.get(seg);
    }
    public static void Size$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Size$VH.set(seg, x);
    }
    public static int Size$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Size$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Action$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Action"));
    public static VarHandle Action$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Action$VH;
    }
    public static int Action$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Action$VH.get(seg);
    }
    public static void Action$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Action$VH.set(seg, x);
    }
    public static int Action$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Action$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Action$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Action$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParameterBlockOffset$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ParameterBlockOffset"));
    public static VarHandle ParameterBlockOffset$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockOffset$VH;
    }
    public static int ParameterBlockOffset$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockOffset$VH.get(seg);
    }
    public static void ParameterBlockOffset$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockOffset$VH.set(seg, x);
    }
    public static int ParameterBlockOffset$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParameterBlockOffset$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ParameterBlockLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ParameterBlockLength"));
    public static VarHandle ParameterBlockLength$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockLength$VH;
    }
    public static int ParameterBlockLength$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockLength$VH.get(seg);
    }
    public static void ParameterBlockLength$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockLength$VH.set(seg, x);
    }
    public static int ParameterBlockLength$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParameterBlockLength$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.ParameterBlockLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataSetRangesOffset$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DataSetRangesOffset"));
    public static VarHandle DataSetRangesOffset$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesOffset$VH;
    }
    public static int DataSetRangesOffset$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesOffset$VH.get(seg);
    }
    public static void DataSetRangesOffset$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesOffset$VH.set(seg, x);
    }
    public static int DataSetRangesOffset$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSetRangesOffset$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataSetRangesLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DataSetRangesLength"));
    public static VarHandle DataSetRangesLength$VH() {
        return _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesLength$VH;
    }
    public static int DataSetRangesLength$get(MemorySegment seg) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesLength$VH.get(seg);
    }
    public static void DataSetRangesLength$set( MemorySegment seg, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesLength$VH.set(seg, x);
    }
    public static int DataSetRangesLength$get(MemorySegment seg, long index) {
        return (int)_DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSetRangesLength$set(MemorySegment seg, long index, int x) {
        _DEVICE_MANAGE_DATA_SET_ATTRIBUTES.DataSetRangesLength$VH.set(seg.asSlice(index*sizeof()), x);
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


