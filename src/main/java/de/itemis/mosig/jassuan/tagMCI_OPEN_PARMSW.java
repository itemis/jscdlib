// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMCI_OPEN_PARMSW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("dwCallback"),
        C_INT.withName("wDeviceID"),
        C_POINTER.withName("lpstrDeviceType"),
        C_POINTER.withName("lpstrElementName"),
        C_POINTER.withName("lpstrAlias")
    ).withName("tagMCI_OPEN_PARMSW");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_OPEN_PARMSW.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_OPEN_PARMSW.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_OPEN_PARMSW.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_OPEN_PARMSW.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_OPEN_PARMSW.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_OPEN_PARMSW.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wDeviceID$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("wDeviceID"));
    public static VarHandle wDeviceID$VH() {
        return tagMCI_OPEN_PARMSW.wDeviceID$VH;
    }
    public static int wDeviceID$get(MemorySegment seg) {
        return (int)tagMCI_OPEN_PARMSW.wDeviceID$VH.get(seg);
    }
    public static void wDeviceID$set( MemorySegment seg, int x) {
        tagMCI_OPEN_PARMSW.wDeviceID$VH.set(seg, x);
    }
    public static int wDeviceID$get(MemorySegment seg, long index) {
        return (int)tagMCI_OPEN_PARMSW.wDeviceID$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wDeviceID$set(MemorySegment seg, long index, int x) {
        tagMCI_OPEN_PARMSW.wDeviceID$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrDeviceType$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrDeviceType")));
    public static VarHandle lpstrDeviceType$VH() {
        return tagMCI_OPEN_PARMSW.lpstrDeviceType$VH;
    }
    public static MemoryAddress lpstrDeviceType$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OPEN_PARMSW.lpstrDeviceType$VH.get(seg);
    }
    public static void lpstrDeviceType$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OPEN_PARMSW.lpstrDeviceType$VH.set(seg, x);
    }
    public static MemoryAddress lpstrDeviceType$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OPEN_PARMSW.lpstrDeviceType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrDeviceType$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OPEN_PARMSW.lpstrDeviceType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrElementName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrElementName")));
    public static VarHandle lpstrElementName$VH() {
        return tagMCI_OPEN_PARMSW.lpstrElementName$VH;
    }
    public static MemoryAddress lpstrElementName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OPEN_PARMSW.lpstrElementName$VH.get(seg);
    }
    public static void lpstrElementName$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OPEN_PARMSW.lpstrElementName$VH.set(seg, x);
    }
    public static MemoryAddress lpstrElementName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OPEN_PARMSW.lpstrElementName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrElementName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OPEN_PARMSW.lpstrElementName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrAlias$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrAlias")));
    public static VarHandle lpstrAlias$VH() {
        return tagMCI_OPEN_PARMSW.lpstrAlias$VH;
    }
    public static MemoryAddress lpstrAlias$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OPEN_PARMSW.lpstrAlias$VH.get(seg);
    }
    public static void lpstrAlias$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OPEN_PARMSW.lpstrAlias$VH.set(seg, x);
    }
    public static MemoryAddress lpstrAlias$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OPEN_PARMSW.lpstrAlias$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrAlias$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OPEN_PARMSW.lpstrAlias$VH.set(seg.asSlice(index*sizeof()), x);
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


