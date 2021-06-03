// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("cbSize"),
        C_LONG.withName("dwFlags"),
        C_POINTER.withName("pcbUsedSize"),
        C_POINTER.withName("pwszOcspDirectory"),
        C_POINTER.withName("pfnUpdateCallback"),
        C_POINTER.withName("pvUpdateCallbackArg")
    ).withName("_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA");
    public static MemoryLayout $LAYOUT() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pcbUsedSize$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pcbUsedSize")));
    public static VarHandle pcbUsedSize$VH() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pcbUsedSize$VH;
    }
    public static MemoryAddress pcbUsedSize$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pcbUsedSize$VH.get(seg);
    }
    public static void pcbUsedSize$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pcbUsedSize$VH.set(seg, x);
    }
    public static MemoryAddress pcbUsedSize$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pcbUsedSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pcbUsedSize$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pcbUsedSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwszOcspDirectory$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pwszOcspDirectory")));
    public static VarHandle pwszOcspDirectory$VH() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pwszOcspDirectory$VH;
    }
    public static MemoryAddress pwszOcspDirectory$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pwszOcspDirectory$VH.get(seg);
    }
    public static void pwszOcspDirectory$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pwszOcspDirectory$VH.set(seg, x);
    }
    public static MemoryAddress pwszOcspDirectory$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pwszOcspDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwszOcspDirectory$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pwszOcspDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnUpdateCallback$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnUpdateCallback")));
    public static VarHandle pfnUpdateCallback$VH() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pfnUpdateCallback$VH;
    }
    public static MemoryAddress pfnUpdateCallback$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pfnUpdateCallback$VH.get(seg);
    }
    public static void pfnUpdateCallback$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pfnUpdateCallback$VH.set(seg, x);
    }
    public static MemoryAddress pfnUpdateCallback$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pfnUpdateCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnUpdateCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pfnUpdateCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK pfnUpdateCallback (MemorySegment segment) {
        return PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK.ofAddress(pfnUpdateCallback$get(segment));
    }
    static final VarHandle pvUpdateCallbackArg$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvUpdateCallbackArg")));
    public static VarHandle pvUpdateCallbackArg$VH() {
        return _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pvUpdateCallbackArg$VH;
    }
    public static MemoryAddress pvUpdateCallbackArg$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pvUpdateCallbackArg$VH.get(seg);
    }
    public static void pvUpdateCallbackArg$set( MemorySegment seg, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pvUpdateCallbackArg$VH.set(seg, x);
    }
    public static MemoryAddress pvUpdateCallbackArg$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pvUpdateCallbackArg$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUpdateCallbackArg$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA.pvUpdateCallbackArg$VH.set(seg.asSlice(index*sizeof()), x);
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


