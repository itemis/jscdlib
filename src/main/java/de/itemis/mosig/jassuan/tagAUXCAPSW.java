// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagAUXCAPSW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("wMid"),
        C_SHORT.withName("wPid"),
        C_INT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, C_SHORT).withName("szPname"),
        C_SHORT.withName("wTechnology"),
        C_SHORT.withName("wReserved1"),
        C_LONG.withName("dwSupport")
    ).withName("tagAUXCAPSW");
    public static MemoryLayout $LAYOUT() {
        return tagAUXCAPSW.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagAUXCAPSW.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagAUXCAPSW.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagAUXCAPSW.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagAUXCAPSW.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagAUXCAPSW.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagAUXCAPSW.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagAUXCAPSW.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagAUXCAPSW.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagAUXCAPSW.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagAUXCAPSW.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagAUXCAPSW.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagAUXCAPSW.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagAUXCAPSW.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagAUXCAPSW.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagAUXCAPSW.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle wTechnology$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wTechnology"));
    public static VarHandle wTechnology$VH() {
        return tagAUXCAPSW.wTechnology$VH;
    }
    public static short wTechnology$get(MemorySegment seg) {
        return (short)tagAUXCAPSW.wTechnology$VH.get(seg);
    }
    public static void wTechnology$set( MemorySegment seg, short x) {
        tagAUXCAPSW.wTechnology$VH.set(seg, x);
    }
    public static short wTechnology$get(MemorySegment seg, long index) {
        return (short)tagAUXCAPSW.wTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wTechnology$set(MemorySegment seg, long index, short x) {
        tagAUXCAPSW.wTechnology$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wReserved1$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wReserved1"));
    public static VarHandle wReserved1$VH() {
        return tagAUXCAPSW.wReserved1$VH;
    }
    public static short wReserved1$get(MemorySegment seg) {
        return (short)tagAUXCAPSW.wReserved1$VH.get(seg);
    }
    public static void wReserved1$set( MemorySegment seg, short x) {
        tagAUXCAPSW.wReserved1$VH.set(seg, x);
    }
    public static short wReserved1$get(MemorySegment seg, long index) {
        return (short)tagAUXCAPSW.wReserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wReserved1$set(MemorySegment seg, long index, short x) {
        tagAUXCAPSW.wReserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagAUXCAPSW.dwSupport$VH;
    }
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagAUXCAPSW.dwSupport$VH.get(seg);
    }
    public static void dwSupport$set( MemorySegment seg, int x) {
        tagAUXCAPSW.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagAUXCAPSW.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagAUXCAPSW.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
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


