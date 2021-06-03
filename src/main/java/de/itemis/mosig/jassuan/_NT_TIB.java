// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _NT_TIB {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("ExceptionList"),
        C_POINTER.withName("StackBase"),
        C_POINTER.withName("StackLimit"),
        C_POINTER.withName("SubSystemTib"),
        MemoryLayout.unionLayout(
            C_POINTER.withName("FiberData"),
            C_LONG.withName("Version")
        ).withName("$anon$0"),
        C_POINTER.withName("ArbitraryUserPointer"),
        C_POINTER.withName("Self")
    ).withName("_NT_TIB");
    public static MemoryLayout $LAYOUT() {
        return _NT_TIB.$struct$LAYOUT;
    }
    static final VarHandle ExceptionList$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ExceptionList")));
    public static VarHandle ExceptionList$VH() {
        return _NT_TIB.ExceptionList$VH;
    }
    public static MemoryAddress ExceptionList$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.ExceptionList$VH.get(seg);
    }
    public static void ExceptionList$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.ExceptionList$VH.set(seg, x);
    }
    public static MemoryAddress ExceptionList$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.ExceptionList$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExceptionList$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.ExceptionList$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StackBase$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("StackBase")));
    public static VarHandle StackBase$VH() {
        return _NT_TIB.StackBase$VH;
    }
    public static MemoryAddress StackBase$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.StackBase$VH.get(seg);
    }
    public static void StackBase$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.StackBase$VH.set(seg, x);
    }
    public static MemoryAddress StackBase$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.StackBase$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StackBase$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.StackBase$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StackLimit$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("StackLimit")));
    public static VarHandle StackLimit$VH() {
        return _NT_TIB.StackLimit$VH;
    }
    public static MemoryAddress StackLimit$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.StackLimit$VH.get(seg);
    }
    public static void StackLimit$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.StackLimit$VH.set(seg, x);
    }
    public static MemoryAddress StackLimit$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.StackLimit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StackLimit$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.StackLimit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SubSystemTib$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SubSystemTib")));
    public static VarHandle SubSystemTib$VH() {
        return _NT_TIB.SubSystemTib$VH;
    }
    public static MemoryAddress SubSystemTib$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.SubSystemTib$VH.get(seg);
    }
    public static void SubSystemTib$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.SubSystemTib$VH.set(seg, x);
    }
    public static MemoryAddress SubSystemTib$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.SubSystemTib$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SubSystemTib$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.SubSystemTib$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FiberData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("FiberData")));
    public static VarHandle FiberData$VH() {
        return _NT_TIB.FiberData$VH;
    }
    public static MemoryAddress FiberData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.FiberData$VH.get(seg);
    }
    public static void FiberData$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.FiberData$VH.set(seg, x);
    }
    public static MemoryAddress FiberData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.FiberData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FiberData$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.FiberData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return _NT_TIB.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)_NT_TIB.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        _NT_TIB.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)_NT_TIB.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        _NT_TIB.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ArbitraryUserPointer$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ArbitraryUserPointer")));
    public static VarHandle ArbitraryUserPointer$VH() {
        return _NT_TIB.ArbitraryUserPointer$VH;
    }
    public static MemoryAddress ArbitraryUserPointer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.ArbitraryUserPointer$VH.get(seg);
    }
    public static void ArbitraryUserPointer$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.ArbitraryUserPointer$VH.set(seg, x);
    }
    public static MemoryAddress ArbitraryUserPointer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.ArbitraryUserPointer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ArbitraryUserPointer$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.ArbitraryUserPointer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Self$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Self")));
    public static VarHandle Self$VH() {
        return _NT_TIB.Self$VH;
    }
    public static MemoryAddress Self$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.Self$VH.get(seg);
    }
    public static void Self$set( MemorySegment seg, MemoryAddress x) {
        _NT_TIB.Self$VH.set(seg, x);
    }
    public static MemoryAddress Self$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NT_TIB.Self$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Self$set(MemorySegment seg, long index, MemoryAddress x) {
        _NT_TIB.Self$VH.set(seg.asSlice(index*sizeof()), x);
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


