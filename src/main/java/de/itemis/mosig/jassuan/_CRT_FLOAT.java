// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRT_FLOAT {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_FLOAT.withName("f")
    );
    public static MemoryLayout $LAYOUT() {
        return _CRT_FLOAT.$struct$LAYOUT;
    }
    static final VarHandle f$VH = $struct$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("f"));
    public static VarHandle f$VH() {
        return _CRT_FLOAT.f$VH;
    }
    public static float f$get(MemorySegment seg) {
        return (float)_CRT_FLOAT.f$VH.get(seg);
    }
    public static void f$set( MemorySegment seg, float x) {
        _CRT_FLOAT.f$VH.set(seg, x);
    }
    public static float f$get(MemorySegment seg, long index) {
        return (float)_CRT_FLOAT.f$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void f$set(MemorySegment seg, long index, float x) {
        _CRT_FLOAT.f$VH.set(seg.asSlice(index*sizeof()), x);
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


