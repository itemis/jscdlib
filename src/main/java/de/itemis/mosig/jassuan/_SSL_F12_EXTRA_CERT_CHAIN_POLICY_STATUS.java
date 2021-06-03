// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("dwErrorLevel"),
        C_LONG.withName("dwErrorCategory"),
        C_LONG.withName("dwReserved"),
        MemoryLayout.sequenceLayout(256, C_SHORT).withName("wszErrorText")
    ).withName("_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS");
    public static MemoryLayout $LAYOUT() {
        return _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwErrorLevel$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwErrorLevel"));
    public static VarHandle dwErrorLevel$VH() {
        return _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorLevel$VH;
    }
    public static int dwErrorLevel$get(MemorySegment seg) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorLevel$VH.get(seg);
    }
    public static void dwErrorLevel$set( MemorySegment seg, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorLevel$VH.set(seg, x);
    }
    public static int dwErrorLevel$get(MemorySegment seg, long index) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwErrorLevel$set(MemorySegment seg, long index, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwErrorCategory$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwErrorCategory"));
    public static VarHandle dwErrorCategory$VH() {
        return _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorCategory$VH;
    }
    public static int dwErrorCategory$get(MemorySegment seg) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorCategory$VH.get(seg);
    }
    public static void dwErrorCategory$set( MemorySegment seg, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorCategory$VH.set(seg, x);
    }
    public static int dwErrorCategory$get(MemorySegment seg, long index) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorCategory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwErrorCategory$set(MemorySegment seg, long index, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwErrorCategory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)_SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        _SSL_F12_EXTRA_CERT_CHAIN_POLICY_STATUS.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment wszErrorText$slice(MemorySegment seg) {
        return seg.asSlice(16, 512);
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


