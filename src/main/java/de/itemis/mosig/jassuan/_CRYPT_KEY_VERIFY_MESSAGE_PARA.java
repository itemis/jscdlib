// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_KEY_VERIFY_MESSAGE_PARA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("dwMsgEncodingType"),
        C_LONG_LONG.withName("hCryptProv")
    ).withName("_CRYPT_KEY_VERIFY_MESSAGE_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_KEY_VERIFY_MESSAGE_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_KEY_VERIFY_MESSAGE_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_VERIFY_MESSAGE_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_KEY_VERIFY_MESSAGE_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_VERIFY_MESSAGE_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_VERIFY_MESSAGE_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwMsgEncodingType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwMsgEncodingType"));
    public static VarHandle dwMsgEncodingType$VH() {
        return _CRYPT_KEY_VERIFY_MESSAGE_PARA.dwMsgEncodingType$VH;
    }
    public static int dwMsgEncodingType$get(MemorySegment seg) {
        return (int)_CRYPT_KEY_VERIFY_MESSAGE_PARA.dwMsgEncodingType$VH.get(seg);
    }
    public static void dwMsgEncodingType$set( MemorySegment seg, int x) {
        _CRYPT_KEY_VERIFY_MESSAGE_PARA.dwMsgEncodingType$VH.set(seg, x);
    }
    public static int dwMsgEncodingType$get(MemorySegment seg, long index) {
        return (int)_CRYPT_KEY_VERIFY_MESSAGE_PARA.dwMsgEncodingType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwMsgEncodingType$set(MemorySegment seg, long index, int x) {
        _CRYPT_KEY_VERIFY_MESSAGE_PARA.dwMsgEncodingType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCryptProv$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hCryptProv"));
    public static VarHandle hCryptProv$VH() {
        return _CRYPT_KEY_VERIFY_MESSAGE_PARA.hCryptProv$VH;
    }
    public static long hCryptProv$get(MemorySegment seg) {
        return (long)_CRYPT_KEY_VERIFY_MESSAGE_PARA.hCryptProv$VH.get(seg);
    }
    public static void hCryptProv$set( MemorySegment seg, long x) {
        _CRYPT_KEY_VERIFY_MESSAGE_PARA.hCryptProv$VH.set(seg, x);
    }
    public static long hCryptProv$get(MemorySegment seg, long index) {
        return (long)_CRYPT_KEY_VERIFY_MESSAGE_PARA.hCryptProv$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCryptProv$set(MemorySegment seg, long index, long x) {
        _CRYPT_KEY_VERIFY_MESSAGE_PARA.hCryptProv$VH.set(seg.asSlice(index*sizeof()), x);
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


