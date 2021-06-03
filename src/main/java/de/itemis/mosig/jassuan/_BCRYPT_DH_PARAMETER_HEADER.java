// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _BCRYPT_DH_PARAMETER_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbLength"),
        C_LONG.withName("dwMagic"),
        C_LONG.withName("cbKeyLength")
    ).withName("_BCRYPT_DH_PARAMETER_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_DH_PARAMETER_HEADER.$struct$LAYOUT;
    }
    static final VarHandle cbLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbLength"));
    public static VarHandle cbLength$VH() {
        return _BCRYPT_DH_PARAMETER_HEADER.cbLength$VH;
    }
    public static int cbLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.get(seg);
    }
    public static void cbLength$set( MemorySegment seg, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.set(seg, x);
    }
    public static int cbLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMagic$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMagic"));
    public static VarHandle dwMagic$VH() {
        return _BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH;
    }
    public static int dwMagic$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.get(seg);
    }
    public static void dwMagic$set( MemorySegment seg, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.set(seg, x);
    }
    public static int dwMagic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMagic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.dwMagic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKeyLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbKeyLength"));
    public static VarHandle cbKeyLength$VH() {
        return _BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH;
    }
    public static int cbKeyLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.get(seg);
    }
    public static void cbKeyLength$set( MemorySegment seg, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.set(seg, x);
    }
    public static int cbKeyLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKeyLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DH_PARAMETER_HEADER.cbKeyLength$VH.set(seg.asSlice(index*sizeof()), x);
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


