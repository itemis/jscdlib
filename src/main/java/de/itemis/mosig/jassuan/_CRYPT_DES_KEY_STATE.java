// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_DES_KEY_STATE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Key"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("IV"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Feedback")
    ).withName("_CRYPT_DES_KEY_STATE");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_DES_KEY_STATE.$struct$LAYOUT;
    }
    public static MemorySegment Key$slice(MemorySegment seg) {
        return seg.asSlice(0, 8);
    }
    public static MemorySegment IV$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
    }
    public static MemorySegment Feedback$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
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


