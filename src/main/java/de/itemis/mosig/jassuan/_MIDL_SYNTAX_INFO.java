// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _MIDL_SYNTAX_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("Data1"),
                C_SHORT.withName("Data2"),
                C_SHORT.withName("Data3"),
                MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
            ).withName("SyntaxGUID"),
            MemoryLayout.structLayout(
                C_SHORT.withName("MajorVersion"),
                C_SHORT.withName("MinorVersion")
            ).withName("SyntaxVersion")
        ).withName("TransferSyntax"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("DispatchTable"),
        C_POINTER.withName("ProcString"),
        C_POINTER.withName("FmtStringOffset"),
        C_POINTER.withName("TypeString"),
        C_POINTER.withName("aUserMarshalQuadruple"),
        C_LONG_LONG.withName("pReserved1"),
        C_LONG_LONG.withName("pReserved2")
    ).withName("_MIDL_SYNTAX_INFO");
    public static MemoryLayout $LAYOUT() {
        return _MIDL_SYNTAX_INFO.$struct$LAYOUT;
    }
    public static MemorySegment TransferSyntax$slice(MemorySegment seg) {
        return seg.asSlice(0, 20);
    }
    static final VarHandle DispatchTable$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("DispatchTable")));
    public static VarHandle DispatchTable$VH() {
        return _MIDL_SYNTAX_INFO.DispatchTable$VH;
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.DispatchTable$VH.get(seg);
    }
    public static void DispatchTable$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.DispatchTable$VH.set(seg, x);
    }
    public static MemoryAddress DispatchTable$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.DispatchTable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DispatchTable$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.DispatchTable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ProcString$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ProcString")));
    public static VarHandle ProcString$VH() {
        return _MIDL_SYNTAX_INFO.ProcString$VH;
    }
    public static MemoryAddress ProcString$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.ProcString$VH.get(seg);
    }
    public static void ProcString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.ProcString$VH.set(seg, x);
    }
    public static MemoryAddress ProcString$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.ProcString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ProcString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.ProcString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FmtStringOffset$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("FmtStringOffset")));
    public static VarHandle FmtStringOffset$VH() {
        return _MIDL_SYNTAX_INFO.FmtStringOffset$VH;
    }
    public static MemoryAddress FmtStringOffset$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.FmtStringOffset$VH.get(seg);
    }
    public static void FmtStringOffset$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.FmtStringOffset$VH.set(seg, x);
    }
    public static MemoryAddress FmtStringOffset$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.FmtStringOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FmtStringOffset$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.FmtStringOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TypeString$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("TypeString")));
    public static VarHandle TypeString$VH() {
        return _MIDL_SYNTAX_INFO.TypeString$VH;
    }
    public static MemoryAddress TypeString$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.TypeString$VH.get(seg);
    }
    public static void TypeString$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.TypeString$VH.set(seg, x);
    }
    public static MemoryAddress TypeString$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.TypeString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TypeString$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.TypeString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle aUserMarshalQuadruple$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("aUserMarshalQuadruple")));
    public static VarHandle aUserMarshalQuadruple$VH() {
        return _MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH;
    }
    public static MemoryAddress aUserMarshalQuadruple$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.get(seg);
    }
    public static void aUserMarshalQuadruple$set( MemorySegment seg, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.set(seg, x);
    }
    public static MemoryAddress aUserMarshalQuadruple$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void aUserMarshalQuadruple$set(MemorySegment seg, long index, MemoryAddress x) {
        _MIDL_SYNTAX_INFO.aUserMarshalQuadruple$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pReserved1$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pReserved1"));
    public static VarHandle pReserved1$VH() {
        return _MIDL_SYNTAX_INFO.pReserved1$VH;
    }
    public static long pReserved1$get(MemorySegment seg) {
        return (long)_MIDL_SYNTAX_INFO.pReserved1$VH.get(seg);
    }
    public static void pReserved1$set( MemorySegment seg, long x) {
        _MIDL_SYNTAX_INFO.pReserved1$VH.set(seg, x);
    }
    public static long pReserved1$get(MemorySegment seg, long index) {
        return (long)_MIDL_SYNTAX_INFO.pReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pReserved1$set(MemorySegment seg, long index, long x) {
        _MIDL_SYNTAX_INFO.pReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pReserved2$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pReserved2"));
    public static VarHandle pReserved2$VH() {
        return _MIDL_SYNTAX_INFO.pReserved2$VH;
    }
    public static long pReserved2$get(MemorySegment seg) {
        return (long)_MIDL_SYNTAX_INFO.pReserved2$VH.get(seg);
    }
    public static void pReserved2$set( MemorySegment seg, long x) {
        _MIDL_SYNTAX_INFO.pReserved2$VH.set(seg, x);
    }
    public static long pReserved2$get(MemorySegment seg, long index) {
        return (long)_MIDL_SYNTAX_INFO.pReserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pReserved2$set(MemorySegment seg, long index, long x) {
        _MIDL_SYNTAX_INFO.pReserved2$VH.set(seg.asSlice(index*sizeof()), x);
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


