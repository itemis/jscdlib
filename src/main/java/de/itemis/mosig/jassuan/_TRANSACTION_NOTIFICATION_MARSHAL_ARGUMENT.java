// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("MarshalCookie"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("UOW")
    ).withName("_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT");
    public static MemoryLayout $LAYOUT() {
        return _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.$struct$LAYOUT;
    }
    static final VarHandle MarshalCookie$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MarshalCookie"));
    public static VarHandle MarshalCookie$VH() {
        return _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH;
    }
    public static int MarshalCookie$get(MemorySegment seg) {
        return (int)_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.get(seg);
    }
    public static void MarshalCookie$set( MemorySegment seg, int x) {
        _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.set(seg, x);
    }
    public static int MarshalCookie$get(MemorySegment seg, long index) {
        return (int)_TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MarshalCookie$set(MemorySegment seg, long index, int x) {
        _TRANSACTION_NOTIFICATION_MARSHAL_ARGUMENT.MarshalCookie$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment UOW$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
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


