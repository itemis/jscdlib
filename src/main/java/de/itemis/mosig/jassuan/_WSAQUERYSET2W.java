// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _WSAQUERYSET2W {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpszServiceInstanceName"),
        C_POINTER.withName("lpVersion"),
        C_POINTER.withName("lpszComment"),
        C_LONG.withName("dwNameSpace"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpNSProviderId"),
        C_POINTER.withName("lpszContext"),
        C_LONG.withName("dwNumberOfProtocols"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpafpProtocols"),
        C_POINTER.withName("lpszQueryString"),
        C_LONG.withName("dwNumberOfCsAddrs"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpcsaBuffer"),
        C_LONG.withName("dwOutputFlags"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpBlob")
    ).withName("_WSAQUERYSET2W");
    public static MemoryLayout $LAYOUT() {
        return _WSAQUERYSET2W.$struct$LAYOUT;
    }
    static final VarHandle dwSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSize"));
    public static VarHandle dwSize$VH() {
        return _WSAQUERYSET2W.dwSize$VH;
    }
    public static int dwSize$get(MemorySegment seg) {
        return (int)_WSAQUERYSET2W.dwSize$VH.get(seg);
    }
    public static void dwSize$set( MemorySegment seg, int x) {
        _WSAQUERYSET2W.dwSize$VH.set(seg, x);
    }
    public static int dwSize$get(MemorySegment seg, long index) {
        return (int)_WSAQUERYSET2W.dwSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSize$set(MemorySegment seg, long index, int x) {
        _WSAQUERYSET2W.dwSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszServiceInstanceName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszServiceInstanceName")));
    public static VarHandle lpszServiceInstanceName$VH() {
        return _WSAQUERYSET2W.lpszServiceInstanceName$VH;
    }
    public static MemoryAddress lpszServiceInstanceName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszServiceInstanceName$VH.get(seg);
    }
    public static void lpszServiceInstanceName$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpszServiceInstanceName$VH.set(seg, x);
    }
    public static MemoryAddress lpszServiceInstanceName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszServiceInstanceName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszServiceInstanceName$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpszServiceInstanceName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpVersion$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpVersion")));
    public static VarHandle lpVersion$VH() {
        return _WSAQUERYSET2W.lpVersion$VH;
    }
    public static MemoryAddress lpVersion$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpVersion$VH.get(seg);
    }
    public static void lpVersion$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpVersion$VH.set(seg, x);
    }
    public static MemoryAddress lpVersion$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpVersion$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszComment$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszComment")));
    public static VarHandle lpszComment$VH() {
        return _WSAQUERYSET2W.lpszComment$VH;
    }
    public static MemoryAddress lpszComment$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszComment$VH.get(seg);
    }
    public static void lpszComment$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpszComment$VH.set(seg, x);
    }
    public static MemoryAddress lpszComment$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszComment$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszComment$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpszComment$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNameSpace$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNameSpace"));
    public static VarHandle dwNameSpace$VH() {
        return _WSAQUERYSET2W.dwNameSpace$VH;
    }
    public static int dwNameSpace$get(MemorySegment seg) {
        return (int)_WSAQUERYSET2W.dwNameSpace$VH.get(seg);
    }
    public static void dwNameSpace$set( MemorySegment seg, int x) {
        _WSAQUERYSET2W.dwNameSpace$VH.set(seg, x);
    }
    public static int dwNameSpace$get(MemorySegment seg, long index) {
        return (int)_WSAQUERYSET2W.dwNameSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNameSpace$set(MemorySegment seg, long index, int x) {
        _WSAQUERYSET2W.dwNameSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpNSProviderId$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpNSProviderId")));
    public static VarHandle lpNSProviderId$VH() {
        return _WSAQUERYSET2W.lpNSProviderId$VH;
    }
    public static MemoryAddress lpNSProviderId$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpNSProviderId$VH.get(seg);
    }
    public static void lpNSProviderId$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpNSProviderId$VH.set(seg, x);
    }
    public static MemoryAddress lpNSProviderId$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpNSProviderId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpNSProviderId$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpNSProviderId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszContext$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszContext")));
    public static VarHandle lpszContext$VH() {
        return _WSAQUERYSET2W.lpszContext$VH;
    }
    public static MemoryAddress lpszContext$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszContext$VH.get(seg);
    }
    public static void lpszContext$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpszContext$VH.set(seg, x);
    }
    public static MemoryAddress lpszContext$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpszContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfProtocols$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNumberOfProtocols"));
    public static VarHandle dwNumberOfProtocols$VH() {
        return _WSAQUERYSET2W.dwNumberOfProtocols$VH;
    }
    public static int dwNumberOfProtocols$get(MemorySegment seg) {
        return (int)_WSAQUERYSET2W.dwNumberOfProtocols$VH.get(seg);
    }
    public static void dwNumberOfProtocols$set( MemorySegment seg, int x) {
        _WSAQUERYSET2W.dwNumberOfProtocols$VH.set(seg, x);
    }
    public static int dwNumberOfProtocols$get(MemorySegment seg, long index) {
        return (int)_WSAQUERYSET2W.dwNumberOfProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfProtocols$set(MemorySegment seg, long index, int x) {
        _WSAQUERYSET2W.dwNumberOfProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpafpProtocols$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpafpProtocols")));
    public static VarHandle lpafpProtocols$VH() {
        return _WSAQUERYSET2W.lpafpProtocols$VH;
    }
    public static MemoryAddress lpafpProtocols$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpafpProtocols$VH.get(seg);
    }
    public static void lpafpProtocols$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpafpProtocols$VH.set(seg, x);
    }
    public static MemoryAddress lpafpProtocols$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpafpProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpafpProtocols$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpafpProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszQueryString$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszQueryString")));
    public static VarHandle lpszQueryString$VH() {
        return _WSAQUERYSET2W.lpszQueryString$VH;
    }
    public static MemoryAddress lpszQueryString$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszQueryString$VH.get(seg);
    }
    public static void lpszQueryString$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpszQueryString$VH.set(seg, x);
    }
    public static MemoryAddress lpszQueryString$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpszQueryString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszQueryString$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpszQueryString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNumberOfCsAddrs$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNumberOfCsAddrs"));
    public static VarHandle dwNumberOfCsAddrs$VH() {
        return _WSAQUERYSET2W.dwNumberOfCsAddrs$VH;
    }
    public static int dwNumberOfCsAddrs$get(MemorySegment seg) {
        return (int)_WSAQUERYSET2W.dwNumberOfCsAddrs$VH.get(seg);
    }
    public static void dwNumberOfCsAddrs$set( MemorySegment seg, int x) {
        _WSAQUERYSET2W.dwNumberOfCsAddrs$VH.set(seg, x);
    }
    public static int dwNumberOfCsAddrs$get(MemorySegment seg, long index) {
        return (int)_WSAQUERYSET2W.dwNumberOfCsAddrs$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNumberOfCsAddrs$set(MemorySegment seg, long index, int x) {
        _WSAQUERYSET2W.dwNumberOfCsAddrs$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpcsaBuffer$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpcsaBuffer")));
    public static VarHandle lpcsaBuffer$VH() {
        return _WSAQUERYSET2W.lpcsaBuffer$VH;
    }
    public static MemoryAddress lpcsaBuffer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpcsaBuffer$VH.get(seg);
    }
    public static void lpcsaBuffer$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpcsaBuffer$VH.set(seg, x);
    }
    public static MemoryAddress lpcsaBuffer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpcsaBuffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpcsaBuffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpcsaBuffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwOutputFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwOutputFlags"));
    public static VarHandle dwOutputFlags$VH() {
        return _WSAQUERYSET2W.dwOutputFlags$VH;
    }
    public static int dwOutputFlags$get(MemorySegment seg) {
        return (int)_WSAQUERYSET2W.dwOutputFlags$VH.get(seg);
    }
    public static void dwOutputFlags$set( MemorySegment seg, int x) {
        _WSAQUERYSET2W.dwOutputFlags$VH.set(seg, x);
    }
    public static int dwOutputFlags$get(MemorySegment seg, long index) {
        return (int)_WSAQUERYSET2W.dwOutputFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwOutputFlags$set(MemorySegment seg, long index, int x) {
        _WSAQUERYSET2W.dwOutputFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpBlob$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpBlob")));
    public static VarHandle lpBlob$VH() {
        return _WSAQUERYSET2W.lpBlob$VH;
    }
    public static MemoryAddress lpBlob$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpBlob$VH.get(seg);
    }
    public static void lpBlob$set( MemorySegment seg, MemoryAddress x) {
        _WSAQUERYSET2W.lpBlob$VH.set(seg, x);
    }
    public static MemoryAddress lpBlob$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_WSAQUERYSET2W.lpBlob$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpBlob$set(MemorySegment seg, long index, MemoryAddress x) {
        _WSAQUERYSET2W.lpBlob$VH.set(seg.asSlice(index*sizeof()), x);
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


