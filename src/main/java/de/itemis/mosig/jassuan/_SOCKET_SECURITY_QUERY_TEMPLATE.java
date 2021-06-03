// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SOCKET_SECURITY_QUERY_TEMPLATE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("SecurityProtocol"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.structLayout(
            C_SHORT.withName("ss_family"),
            MemoryLayout.sequenceLayout(6, C_CHAR).withName("__ss_pad1"),
            C_LONG_LONG.withName("__ss_align"),
            MemoryLayout.sequenceLayout(112, C_CHAR).withName("__ss_pad2")
        ).withName("PeerAddress"),
        C_LONG.withName("PeerTokenAccessMask"),
        MemoryLayout.paddingLayout(32)
    ).withName("_SOCKET_SECURITY_QUERY_TEMPLATE");
    public static MemoryLayout $LAYOUT() {
        return _SOCKET_SECURITY_QUERY_TEMPLATE.$struct$LAYOUT;
    }
    static final VarHandle SecurityProtocol$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SecurityProtocol"));
    public static VarHandle SecurityProtocol$VH() {
        return _SOCKET_SECURITY_QUERY_TEMPLATE.SecurityProtocol$VH;
    }
    public static int SecurityProtocol$get(MemorySegment seg) {
        return (int)_SOCKET_SECURITY_QUERY_TEMPLATE.SecurityProtocol$VH.get(seg);
    }
    public static void SecurityProtocol$set( MemorySegment seg, int x) {
        _SOCKET_SECURITY_QUERY_TEMPLATE.SecurityProtocol$VH.set(seg, x);
    }
    public static int SecurityProtocol$get(MemorySegment seg, long index) {
        return (int)_SOCKET_SECURITY_QUERY_TEMPLATE.SecurityProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityProtocol$set(MemorySegment seg, long index, int x) {
        _SOCKET_SECURITY_QUERY_TEMPLATE.SecurityProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PeerAddress$slice(MemorySegment seg) {
        return seg.asSlice(8, 128);
    }
    static final VarHandle PeerTokenAccessMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("PeerTokenAccessMask"));
    public static VarHandle PeerTokenAccessMask$VH() {
        return _SOCKET_SECURITY_QUERY_TEMPLATE.PeerTokenAccessMask$VH;
    }
    public static int PeerTokenAccessMask$get(MemorySegment seg) {
        return (int)_SOCKET_SECURITY_QUERY_TEMPLATE.PeerTokenAccessMask$VH.get(seg);
    }
    public static void PeerTokenAccessMask$set( MemorySegment seg, int x) {
        _SOCKET_SECURITY_QUERY_TEMPLATE.PeerTokenAccessMask$VH.set(seg, x);
    }
    public static int PeerTokenAccessMask$get(MemorySegment seg, long index) {
        return (int)_SOCKET_SECURITY_QUERY_TEMPLATE.PeerTokenAccessMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PeerTokenAccessMask$set(MemorySegment seg, long index, int x) {
        _SOCKET_SECURITY_QUERY_TEMPLATE.PeerTokenAccessMask$VH.set(seg.asSlice(index*sizeof()), x);
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


