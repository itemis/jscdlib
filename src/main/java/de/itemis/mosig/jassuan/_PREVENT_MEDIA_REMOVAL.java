// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PREVENT_MEDIA_REMOVAL {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("PreventMediaRemoval")
    ).withName("_PREVENT_MEDIA_REMOVAL");
    public static MemoryLayout $LAYOUT() {
        return _PREVENT_MEDIA_REMOVAL.$struct$LAYOUT;
    }
    static final VarHandle PreventMediaRemoval$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("PreventMediaRemoval"));
    public static VarHandle PreventMediaRemoval$VH() {
        return _PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH;
    }
    public static byte PreventMediaRemoval$get(MemorySegment seg) {
        return (byte)_PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.get(seg);
    }
    public static void PreventMediaRemoval$set( MemorySegment seg, byte x) {
        _PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.set(seg, x);
    }
    public static byte PreventMediaRemoval$get(MemorySegment seg, long index) {
        return (byte)_PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PreventMediaRemoval$set(MemorySegment seg, long index, byte x) {
        _PREVENT_MEDIA_REMOVAL.PreventMediaRemoval$VH.set(seg.asSlice(index*sizeof()), x);
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


