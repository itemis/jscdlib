// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_RC2_CBC_PARAMETERS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        C_INT.withName("fIV"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("rgbIV")
    ).withName("_CRYPT_RC2_CBC_PARAMETERS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_RC2_CBC_PARAMETERS.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _CRYPT_RC2_CBC_PARAMETERS.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_CRYPT_RC2_CBC_PARAMETERS.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _CRYPT_RC2_CBC_PARAMETERS.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_CRYPT_RC2_CBC_PARAMETERS.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _CRYPT_RC2_CBC_PARAMETERS.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle fIV$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("fIV"));
    public static VarHandle fIV$VH() {
        return _CRYPT_RC2_CBC_PARAMETERS.fIV$VH;
    }
    public static int fIV$get(MemorySegment seg) {
        return (int)_CRYPT_RC2_CBC_PARAMETERS.fIV$VH.get(seg);
    }
    public static void fIV$set( MemorySegment seg, int x) {
        _CRYPT_RC2_CBC_PARAMETERS.fIV$VH.set(seg, x);
    }
    public static int fIV$get(MemorySegment seg, long index) {
        return (int)_CRYPT_RC2_CBC_PARAMETERS.fIV$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void fIV$set(MemorySegment seg, long index, int x) {
        _CRYPT_RC2_CBC_PARAMETERS.fIV$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rgbIV$slice(MemorySegment seg) {
        return seg.asSlice(8, 8);
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


