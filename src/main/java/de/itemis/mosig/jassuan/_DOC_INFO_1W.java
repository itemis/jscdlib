// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _DOC_INFO_1W {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pDocName"),
        C_POINTER.withName("pOutputFile"),
        C_POINTER.withName("pDatatype")
    ).withName("_DOC_INFO_1W");
    public static MemoryLayout $LAYOUT() {
        return _DOC_INFO_1W.$struct$LAYOUT;
    }
    static final VarHandle pDocName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pDocName")));
    public static VarHandle pDocName$VH() {
        return _DOC_INFO_1W.pDocName$VH;
    }
    public static MemoryAddress pDocName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DOC_INFO_1W.pDocName$VH.get(seg);
    }
    public static void pDocName$set( MemorySegment seg, MemoryAddress x) {
        _DOC_INFO_1W.pDocName$VH.set(seg, x);
    }
    public static MemoryAddress pDocName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DOC_INFO_1W.pDocName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDocName$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOC_INFO_1W.pDocName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pOutputFile$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pOutputFile")));
    public static VarHandle pOutputFile$VH() {
        return _DOC_INFO_1W.pOutputFile$VH;
    }
    public static MemoryAddress pOutputFile$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DOC_INFO_1W.pOutputFile$VH.get(seg);
    }
    public static void pOutputFile$set( MemorySegment seg, MemoryAddress x) {
        _DOC_INFO_1W.pOutputFile$VH.set(seg, x);
    }
    public static MemoryAddress pOutputFile$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DOC_INFO_1W.pOutputFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOutputFile$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOC_INFO_1W.pOutputFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pDatatype$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pDatatype")));
    public static VarHandle pDatatype$VH() {
        return _DOC_INFO_1W.pDatatype$VH;
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_DOC_INFO_1W.pDatatype$VH.get(seg);
    }
    public static void pDatatype$set( MemorySegment seg, MemoryAddress x) {
        _DOC_INFO_1W.pDatatype$VH.set(seg, x);
    }
    public static MemoryAddress pDatatype$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_DOC_INFO_1W.pDatatype$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pDatatype$set(MemorySegment seg, long index, MemoryAddress x) {
        _DOC_INFO_1W.pDatatype$VH.set(seg.asSlice(index*sizeof()), x);
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


