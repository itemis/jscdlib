// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _INTERFACE_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("iiFlags"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_SHORT.withName("sa_family"),
                MemoryLayout.sequenceLayout(14, C_CHAR).withName("sa_data")
            ).withName("Address"),
            MemoryLayout.structLayout(
                C_SHORT.withName("sin_family"),
                C_SHORT.withName("sin_port"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            C_CHAR.withName("s_b1"),
                            C_CHAR.withName("s_b2"),
                            C_CHAR.withName("s_b3"),
                            C_CHAR.withName("s_b4")
                        ).withName("S_un_b"),
                        MemoryLayout.structLayout(
                            C_SHORT.withName("s_w1"),
                            C_SHORT.withName("s_w2")
                        ).withName("S_un_w"),
                        C_LONG.withName("S_addr")
                    ).withName("S_un")
                ).withName("sin_addr"),
                MemoryLayout.sequenceLayout(8, C_CHAR).withName("sin_zero")
            ).withName("AddressIn"),
            MemoryLayout.structLayout(
                C_SHORT.withName("sin6_family"),
                C_SHORT.withName("sin6_port"),
                C_LONG.withName("sin6_flowinfo"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(16, C_CHAR).withName("Byte"),
                        MemoryLayout.sequenceLayout(8, C_SHORT).withName("Word")
                    ).withName("u")
                ).withName("sin6_addr")
            ).withName("AddressIn6")
        ).withName("iiAddress"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_SHORT.withName("sa_family"),
                MemoryLayout.sequenceLayout(14, C_CHAR).withName("sa_data")
            ).withName("Address"),
            MemoryLayout.structLayout(
                C_SHORT.withName("sin_family"),
                C_SHORT.withName("sin_port"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            C_CHAR.withName("s_b1"),
                            C_CHAR.withName("s_b2"),
                            C_CHAR.withName("s_b3"),
                            C_CHAR.withName("s_b4")
                        ).withName("S_un_b"),
                        MemoryLayout.structLayout(
                            C_SHORT.withName("s_w1"),
                            C_SHORT.withName("s_w2")
                        ).withName("S_un_w"),
                        C_LONG.withName("S_addr")
                    ).withName("S_un")
                ).withName("sin_addr"),
                MemoryLayout.sequenceLayout(8, C_CHAR).withName("sin_zero")
            ).withName("AddressIn"),
            MemoryLayout.structLayout(
                C_SHORT.withName("sin6_family"),
                C_SHORT.withName("sin6_port"),
                C_LONG.withName("sin6_flowinfo"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(16, C_CHAR).withName("Byte"),
                        MemoryLayout.sequenceLayout(8, C_SHORT).withName("Word")
                    ).withName("u")
                ).withName("sin6_addr")
            ).withName("AddressIn6")
        ).withName("iiBroadcastAddress"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_SHORT.withName("sa_family"),
                MemoryLayout.sequenceLayout(14, C_CHAR).withName("sa_data")
            ).withName("Address"),
            MemoryLayout.structLayout(
                C_SHORT.withName("sin_family"),
                C_SHORT.withName("sin_port"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            C_CHAR.withName("s_b1"),
                            C_CHAR.withName("s_b2"),
                            C_CHAR.withName("s_b3"),
                            C_CHAR.withName("s_b4")
                        ).withName("S_un_b"),
                        MemoryLayout.structLayout(
                            C_SHORT.withName("s_w1"),
                            C_SHORT.withName("s_w2")
                        ).withName("S_un_w"),
                        C_LONG.withName("S_addr")
                    ).withName("S_un")
                ).withName("sin_addr"),
                MemoryLayout.sequenceLayout(8, C_CHAR).withName("sin_zero")
            ).withName("AddressIn"),
            MemoryLayout.structLayout(
                C_SHORT.withName("sin6_family"),
                C_SHORT.withName("sin6_port"),
                C_LONG.withName("sin6_flowinfo"),
                MemoryLayout.structLayout(
                    MemoryLayout.unionLayout(
                        MemoryLayout.sequenceLayout(16, C_CHAR).withName("Byte"),
                        MemoryLayout.sequenceLayout(8, C_SHORT).withName("Word")
                    ).withName("u")
                ).withName("sin6_addr")
            ).withName("AddressIn6")
        ).withName("iiNetmask")
    ).withName("_INTERFACE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _INTERFACE_INFO.$struct$LAYOUT;
    }
    static final VarHandle iiFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iiFlags"));
    public static VarHandle iiFlags$VH() {
        return _INTERFACE_INFO.iiFlags$VH;
    }
    public static int iiFlags$get(MemorySegment seg) {
        return (int)_INTERFACE_INFO.iiFlags$VH.get(seg);
    }
    public static void iiFlags$set( MemorySegment seg, int x) {
        _INTERFACE_INFO.iiFlags$VH.set(seg, x);
    }
    public static int iiFlags$get(MemorySegment seg, long index) {
        return (int)_INTERFACE_INFO.iiFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iiFlags$set(MemorySegment seg, long index, int x) {
        _INTERFACE_INFO.iiFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment iiAddress$slice(MemorySegment seg) {
        return seg.asSlice(4, 24);
    }
    public static MemorySegment iiBroadcastAddress$slice(MemorySegment seg) {
        return seg.asSlice(28, 24);
    }
    public static MemorySegment iiNetmask$slice(MemorySegment seg) {
        return seg.asSlice(52, 24);
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


