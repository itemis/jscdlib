// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _BCRYPT_KEY_BLOB {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Magic")
    ).withName("_BCRYPT_KEY_BLOB");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_KEY_BLOB.$struct$LAYOUT;
    }
    static final VarHandle Magic$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Magic"));
    public static VarHandle Magic$VH() {
        return _BCRYPT_KEY_BLOB.Magic$VH;
    }
    public static int Magic$get(MemorySegment seg) {
        return (int)_BCRYPT_KEY_BLOB.Magic$VH.get(seg);
    }
    public static void Magic$set( MemorySegment seg, int x) {
        _BCRYPT_KEY_BLOB.Magic$VH.set(seg, x);
    }
    public static int Magic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_KEY_BLOB.Magic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Magic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_KEY_BLOB.Magic$VH.set(seg.asSlice(index*sizeof()), x);
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


