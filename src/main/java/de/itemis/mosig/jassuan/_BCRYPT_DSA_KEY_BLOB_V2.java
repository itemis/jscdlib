// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _BCRYPT_DSA_KEY_BLOB_V2 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwMagic"),
        C_LONG.withName("cbKey"),
        C_INT.withName("hashAlgorithm"),
        C_INT.withName("standardVersion"),
        C_LONG.withName("cbSeedLength"),
        C_LONG.withName("cbGroupSize"),
        MemoryLayout.sequenceLayout(4, C_CHAR).withName("Count")
    ).withName("_BCRYPT_DSA_KEY_BLOB_V2");
    public static MemoryLayout $LAYOUT() {
        return _BCRYPT_DSA_KEY_BLOB_V2.$struct$LAYOUT;
    }
    static final VarHandle dwMagic$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMagic"));
    public static VarHandle dwMagic$VH() {
        return _BCRYPT_DSA_KEY_BLOB_V2.dwMagic$VH;
    }
    public static int dwMagic$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.dwMagic$VH.get(seg);
    }
    public static void dwMagic$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.dwMagic$VH.set(seg, x);
    }
    public static int dwMagic$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.dwMagic$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMagic$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.dwMagic$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbKey$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbKey"));
    public static VarHandle cbKey$VH() {
        return _BCRYPT_DSA_KEY_BLOB_V2.cbKey$VH;
    }
    public static int cbKey$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.cbKey$VH.get(seg);
    }
    public static void cbKey$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.cbKey$VH.set(seg, x);
    }
    public static int cbKey$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.cbKey$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbKey$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.cbKey$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hashAlgorithm$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("hashAlgorithm"));
    public static VarHandle hashAlgorithm$VH() {
        return _BCRYPT_DSA_KEY_BLOB_V2.hashAlgorithm$VH;
    }
    public static int hashAlgorithm$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.hashAlgorithm$VH.get(seg);
    }
    public static void hashAlgorithm$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.hashAlgorithm$VH.set(seg, x);
    }
    public static int hashAlgorithm$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.hashAlgorithm$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hashAlgorithm$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.hashAlgorithm$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle standardVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("standardVersion"));
    public static VarHandle standardVersion$VH() {
        return _BCRYPT_DSA_KEY_BLOB_V2.standardVersion$VH;
    }
    public static int standardVersion$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.standardVersion$VH.get(seg);
    }
    public static void standardVersion$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.standardVersion$VH.set(seg, x);
    }
    public static int standardVersion$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.standardVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void standardVersion$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.standardVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbSeedLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSeedLength"));
    public static VarHandle cbSeedLength$VH() {
        return _BCRYPT_DSA_KEY_BLOB_V2.cbSeedLength$VH;
    }
    public static int cbSeedLength$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.cbSeedLength$VH.get(seg);
    }
    public static void cbSeedLength$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.cbSeedLength$VH.set(seg, x);
    }
    public static int cbSeedLength$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.cbSeedLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSeedLength$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.cbSeedLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cbGroupSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbGroupSize"));
    public static VarHandle cbGroupSize$VH() {
        return _BCRYPT_DSA_KEY_BLOB_V2.cbGroupSize$VH;
    }
    public static int cbGroupSize$get(MemorySegment seg) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.cbGroupSize$VH.get(seg);
    }
    public static void cbGroupSize$set( MemorySegment seg, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.cbGroupSize$VH.set(seg, x);
    }
    public static int cbGroupSize$get(MemorySegment seg, long index) {
        return (int)_BCRYPT_DSA_KEY_BLOB_V2.cbGroupSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbGroupSize$set(MemorySegment seg, long index, int x) {
        _BCRYPT_DSA_KEY_BLOB_V2.cbGroupSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Count$slice(MemorySegment seg) {
        return seg.asSlice(24, 4);
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


