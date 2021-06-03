// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _RPC_TRANSFER_SYNTAX {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("Uuid"),
        C_SHORT.withName("VersMajor"),
        C_SHORT.withName("VersMinor")
    ).withName("_RPC_TRANSFER_SYNTAX");
    public static MemoryLayout $LAYOUT() {
        return _RPC_TRANSFER_SYNTAX.$struct$LAYOUT;
    }
    public static MemorySegment Uuid$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle VersMajor$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("VersMajor"));
    public static VarHandle VersMajor$VH() {
        return _RPC_TRANSFER_SYNTAX.VersMajor$VH;
    }
    public static short VersMajor$get(MemorySegment seg) {
        return (short)_RPC_TRANSFER_SYNTAX.VersMajor$VH.get(seg);
    }
    public static void VersMajor$set( MemorySegment seg, short x) {
        _RPC_TRANSFER_SYNTAX.VersMajor$VH.set(seg, x);
    }
    public static short VersMajor$get(MemorySegment seg, long index) {
        return (short)_RPC_TRANSFER_SYNTAX.VersMajor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VersMajor$set(MemorySegment seg, long index, short x) {
        _RPC_TRANSFER_SYNTAX.VersMajor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle VersMinor$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("VersMinor"));
    public static VarHandle VersMinor$VH() {
        return _RPC_TRANSFER_SYNTAX.VersMinor$VH;
    }
    public static short VersMinor$get(MemorySegment seg) {
        return (short)_RPC_TRANSFER_SYNTAX.VersMinor$VH.get(seg);
    }
    public static void VersMinor$set( MemorySegment seg, short x) {
        _RPC_TRANSFER_SYNTAX.VersMinor$VH.set(seg, x);
    }
    public static short VersMinor$get(MemorySegment seg, long index) {
        return (short)_RPC_TRANSFER_SYNTAX.VersMinor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void VersMinor$set(MemorySegment seg, long index, short x) {
        _RPC_TRANSFER_SYNTAX.VersMinor$VH.set(seg.asSlice(index*sizeof()), x);
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


