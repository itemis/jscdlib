// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CRYPT_CREDENTIALS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pszCredentialsOid"),
        C_POINTER.withName("pvCredentials")
    ).withName("_CRYPT_CREDENTIALS");
    public static MemoryLayout $LAYOUT() {
        return _CRYPT_CREDENTIALS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CRYPT_CREDENTIALS.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CRYPT_CREDENTIALS.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CRYPT_CREDENTIALS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CRYPT_CREDENTIALS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CRYPT_CREDENTIALS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszCredentialsOid$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszCredentialsOid")));
    public static VarHandle pszCredentialsOid$VH() {
        return _CRYPT_CREDENTIALS.pszCredentialsOid$VH;
    }
    public static MemoryAddress pszCredentialsOid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_CREDENTIALS.pszCredentialsOid$VH.get(seg);
    }
    public static void pszCredentialsOid$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_CREDENTIALS.pszCredentialsOid$VH.set(seg, x);
    }
    public static MemoryAddress pszCredentialsOid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_CREDENTIALS.pszCredentialsOid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCredentialsOid$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_CREDENTIALS.pszCredentialsOid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvCredentials$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvCredentials")));
    public static VarHandle pvCredentials$VH() {
        return _CRYPT_CREDENTIALS.pvCredentials$VH;
    }
    public static MemoryAddress pvCredentials$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_CREDENTIALS.pvCredentials$VH.get(seg);
    }
    public static void pvCredentials$set( MemorySegment seg, MemoryAddress x) {
        _CRYPT_CREDENTIALS.pvCredentials$VH.set(seg, x);
    }
    public static MemoryAddress pvCredentials$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CRYPT_CREDENTIALS.pvCredentials$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvCredentials$set(MemorySegment seg, long index, MemoryAddress x) {
        _CRYPT_CREDENTIALS.pvCredentials$VH.set(seg.asSlice(index*sizeof()), x);
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


