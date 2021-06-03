// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_LOGOTYPE_IMAGE_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwLogotypeImageInfoChoice"),
        C_LONG.withName("dwFileSize"),
        C_LONG.withName("dwXSize"),
        C_LONG.withName("dwYSize"),
        C_LONG.withName("dwLogotypeImageResolutionChoice"),
        MemoryLayout.unionLayout(
            C_LONG.withName("dwNumBits"),
            C_LONG.withName("dwTableSize")
        ).withName("$anon$0"),
        C_POINTER.withName("pwszLanguage")
    ).withName("_CERT_LOGOTYPE_IMAGE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_LOGOTYPE_IMAGE_INFO.$struct$LAYOUT;
    }
    static final VarHandle dwLogotypeImageInfoChoice$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwLogotypeImageInfoChoice"));
    public static VarHandle dwLogotypeImageInfoChoice$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH;
    }
    public static int dwLogotypeImageInfoChoice$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.get(seg);
    }
    public static void dwLogotypeImageInfoChoice$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.set(seg, x);
    }
    public static int dwLogotypeImageInfoChoice$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLogotypeImageInfoChoice$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageInfoChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFileSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFileSize"));
    public static VarHandle dwFileSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH;
    }
    public static int dwFileSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.get(seg);
    }
    public static void dwFileSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.set(seg, x);
    }
    public static int dwFileSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFileSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwFileSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwXSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwXSize"));
    public static VarHandle dwXSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH;
    }
    public static int dwXSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.get(seg);
    }
    public static void dwXSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.set(seg, x);
    }
    public static int dwXSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwXSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwXSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwYSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwYSize"));
    public static VarHandle dwYSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH;
    }
    public static int dwYSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.get(seg);
    }
    public static void dwYSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.set(seg, x);
    }
    public static int dwYSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwYSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwYSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwLogotypeImageResolutionChoice$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwLogotypeImageResolutionChoice"));
    public static VarHandle dwLogotypeImageResolutionChoice$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH;
    }
    public static int dwLogotypeImageResolutionChoice$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.get(seg);
    }
    public static void dwLogotypeImageResolutionChoice$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.set(seg, x);
    }
    public static int dwLogotypeImageResolutionChoice$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwLogotypeImageResolutionChoice$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwLogotypeImageResolutionChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumBits$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwNumBits"));
    public static VarHandle dwNumBits$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH;
    }
    public static int dwNumBits$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.get(seg);
    }
    public static void dwNumBits$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.set(seg, x);
    }
    public static int dwNumBits$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumBits$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwNumBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwTableSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("dwTableSize"));
    public static VarHandle dwTableSize$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH;
    }
    public static int dwTableSize$get(MemorySegment seg) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.get(seg);
    }
    public static void dwTableSize$set( MemorySegment seg, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.set(seg, x);
    }
    public static int dwTableSize$get(MemorySegment seg, long index) {
        return (int)_CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwTableSize$set(MemorySegment seg, long index, int x) {
        _CERT_LOGOTYPE_IMAGE_INFO.dwTableSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszLanguage$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pwszLanguage")));
    public static VarHandle pwszLanguage$VH() {
        return _CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH;
    }
    public static MemoryAddress pwszLanguage$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.get(seg);
    }
    public static void pwszLanguage$set( MemorySegment seg, MemoryAddress x) {
        _CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.set(seg, x);
    }
    public static MemoryAddress pwszLanguage$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszLanguage$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_LOGOTYPE_IMAGE_INFO.pwszLanguage$VH.set(seg.asSlice(index*sizeof()), x);
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


