// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _KEY_TYPE_SUBTYPE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwKeySpec"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("Type"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("Subtype")
    ).withName("_KEY_TYPE_SUBTYPE");
    public static MemoryLayout $LAYOUT() {
        return _KEY_TYPE_SUBTYPE.$struct$LAYOUT;
    }
    static final VarHandle dwKeySpec$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwKeySpec"));
    public static VarHandle dwKeySpec$VH() {
        return _KEY_TYPE_SUBTYPE.dwKeySpec$VH;
    }
    public static int dwKeySpec$get(MemorySegment seg) {
        return (int)_KEY_TYPE_SUBTYPE.dwKeySpec$VH.get(seg);
    }
    public static void dwKeySpec$set( MemorySegment seg, int x) {
        _KEY_TYPE_SUBTYPE.dwKeySpec$VH.set(seg, x);
    }
    public static int dwKeySpec$get(MemorySegment seg, long index) {
        return (int)_KEY_TYPE_SUBTYPE.dwKeySpec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwKeySpec$set(MemorySegment seg, long index, int x) {
        _KEY_TYPE_SUBTYPE.dwKeySpec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Type$slice(MemorySegment seg) {
        return seg.asSlice(4, 16);
    }
    public static MemorySegment Subtype$slice(MemorySegment seg) {
        return seg.asSlice(20, 16);
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


