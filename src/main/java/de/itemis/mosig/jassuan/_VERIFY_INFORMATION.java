// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _VERIFY_INFORMATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("StartingOffset"),
        C_LONG.withName("Length"),
        MemoryLayout.paddingLayout(32)
    ).withName("_VERIFY_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _VERIFY_INFORMATION.$struct$LAYOUT;
    }
    public static MemorySegment StartingOffset$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    static final VarHandle Length$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Length"));
    public static VarHandle Length$VH() {
        return _VERIFY_INFORMATION.Length$VH;
    }
    public static int Length$get(MemorySegment seg) {
        return (int)_VERIFY_INFORMATION.Length$VH.get(seg);
    }
    public static void Length$set( MemorySegment seg, int x) {
        _VERIFY_INFORMATION.Length$VH.set(seg, x);
    }
    public static int Length$get(MemorySegment seg, long index) {
        return (int)_VERIFY_INFORMATION.Length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Length$set(MemorySegment seg, long index, int x) {
        _VERIFY_INFORMATION.Length$VH.set(seg.asSlice(index*sizeof()), x);
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


