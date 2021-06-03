// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CMSG_KEY_AGREE_ENCRYPT_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("dwRecipientIndex"),
        MemoryLayout.structLayout(
            C_POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("KeyEncryptionAlgorithm"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("UserKeyingMaterial"),
        C_LONG.withName("dwOriginatorChoice"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("dwIdChoice"),
                MemoryLayout.paddingLayout(32),
                MemoryLayout.unionLayout(
                    MemoryLayout.structLayout(
                        MemoryLayout.structLayout(
                            C_LONG.withName("cbData"),
                            MemoryLayout.paddingLayout(32),
                            C_POINTER.withName("pbData")
                        ).withName("Issuer"),
                        MemoryLayout.structLayout(
                            C_LONG.withName("cbData"),
                            MemoryLayout.paddingLayout(32),
                            C_POINTER.withName("pbData")
                        ).withName("SerialNumber")
                    ).withName("IssuerSerialNumber"),
                    MemoryLayout.structLayout(
                        C_LONG.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        C_POINTER.withName("pbData")
                    ).withName("KeyId"),
                    MemoryLayout.structLayout(
                        C_LONG.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        C_POINTER.withName("pbData")
                    ).withName("HashId")
                ).withName("$anon$0")
            ).withName("OriginatorCertId"),
            MemoryLayout.structLayout(
                MemoryLayout.structLayout(
                    C_POINTER.withName("pszObjId"),
                    MemoryLayout.structLayout(
                        C_LONG.withName("cbData"),
                        MemoryLayout.paddingLayout(32),
                        C_POINTER.withName("pbData")
                    ).withName("Parameters")
                ).withName("Algorithm"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pbData"),
                    C_LONG.withName("cUnusedBits"),
                    MemoryLayout.paddingLayout(32)
                ).withName("PublicKey")
            ).withName("OriginatorPublicKeyInfo")
        ).withName("$anon$0"),
        C_LONG.withName("cKeyAgreeKeyEncryptInfo"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("rgpKeyAgreeKeyEncryptInfo"),
        C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(32)
    ).withName("_CMSG_KEY_AGREE_ENCRYPT_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwRecipientIndex$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwRecipientIndex"));
    public static VarHandle dwRecipientIndex$VH() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.dwRecipientIndex$VH;
    }
    public static int dwRecipientIndex$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.dwRecipientIndex$VH.get(seg);
    }
    public static void dwRecipientIndex$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.dwRecipientIndex$VH.set(seg, x);
    }
    public static int dwRecipientIndex$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.dwRecipientIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwRecipientIndex$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.dwRecipientIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment KeyEncryptionAlgorithm$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
    }
    public static MemorySegment UserKeyingMaterial$slice(MemorySegment seg) {
        return seg.asSlice(32, 16);
    }
    static final VarHandle dwOriginatorChoice$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwOriginatorChoice"));
    public static VarHandle dwOriginatorChoice$VH() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.dwOriginatorChoice$VH;
    }
    public static int dwOriginatorChoice$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.dwOriginatorChoice$VH.get(seg);
    }
    public static void dwOriginatorChoice$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.dwOriginatorChoice$VH.set(seg, x);
    }
    public static int dwOriginatorChoice$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.dwOriginatorChoice$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOriginatorChoice$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.dwOriginatorChoice$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment OriginatorCertId$slice(MemorySegment seg) {
        return seg.asSlice(56, 40);
    }
    public static MemorySegment OriginatorPublicKeyInfo$slice(MemorySegment seg) {
        return seg.asSlice(56, 48);
    }
    static final VarHandle cKeyAgreeKeyEncryptInfo$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cKeyAgreeKeyEncryptInfo"));
    public static VarHandle cKeyAgreeKeyEncryptInfo$VH() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.cKeyAgreeKeyEncryptInfo$VH;
    }
    public static int cKeyAgreeKeyEncryptInfo$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.cKeyAgreeKeyEncryptInfo$VH.get(seg);
    }
    public static void cKeyAgreeKeyEncryptInfo$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.cKeyAgreeKeyEncryptInfo$VH.set(seg, x);
    }
    public static int cKeyAgreeKeyEncryptInfo$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.cKeyAgreeKeyEncryptInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cKeyAgreeKeyEncryptInfo$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.cKeyAgreeKeyEncryptInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgpKeyAgreeKeyEncryptInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("rgpKeyAgreeKeyEncryptInfo")));
    public static VarHandle rgpKeyAgreeKeyEncryptInfo$VH() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.rgpKeyAgreeKeyEncryptInfo$VH;
    }
    public static MemoryAddress rgpKeyAgreeKeyEncryptInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_KEY_AGREE_ENCRYPT_INFO.rgpKeyAgreeKeyEncryptInfo$VH.get(seg);
    }
    public static void rgpKeyAgreeKeyEncryptInfo$set( MemorySegment seg, MemoryAddress x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.rgpKeyAgreeKeyEncryptInfo$VH.set(seg, x);
    }
    public static MemoryAddress rgpKeyAgreeKeyEncryptInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CMSG_KEY_AGREE_ENCRYPT_INFO.rgpKeyAgreeKeyEncryptInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgpKeyAgreeKeyEncryptInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.rgpKeyAgreeKeyEncryptInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CMSG_KEY_AGREE_ENCRYPT_INFO.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CMSG_KEY_AGREE_ENCRYPT_INFO.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CMSG_KEY_AGREE_ENCRYPT_INFO.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
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


