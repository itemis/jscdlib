// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMCI_OVLY_LOAD_PARMSA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG_LONG.withName("dwCallback"),
        C_POINTER.withName("lpfilename"),
        MemoryLayout.structLayout(
            C_LONG.withName("left"),
            C_LONG.withName("top"),
            C_LONG.withName("right"),
            C_LONG.withName("bottom")
        ).withName("rc")
    ).withName("tagMCI_OVLY_LOAD_PARMSA");
    public static MemoryLayout $LAYOUT() {
        return tagMCI_OVLY_LOAD_PARMSA.$struct$LAYOUT;
    }
    static final VarHandle dwCallback$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("dwCallback"));
    public static VarHandle dwCallback$VH() {
        return tagMCI_OVLY_LOAD_PARMSA.dwCallback$VH;
    }
    public static long dwCallback$get(MemorySegment seg) {
        return (long)tagMCI_OVLY_LOAD_PARMSA.dwCallback$VH.get(seg);
    }
    public static void dwCallback$set( MemorySegment seg, long x) {
        tagMCI_OVLY_LOAD_PARMSA.dwCallback$VH.set(seg, x);
    }
    public static long dwCallback$get(MemorySegment seg, long index) {
        return (long)tagMCI_OVLY_LOAD_PARMSA.dwCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwCallback$set(MemorySegment seg, long index, long x) {
        tagMCI_OVLY_LOAD_PARMSA.dwCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfilename$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfilename")));
    public static VarHandle lpfilename$VH() {
        return tagMCI_OVLY_LOAD_PARMSA.lpfilename$VH;
    }
    public static MemoryAddress lpfilename$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OVLY_LOAD_PARMSA.lpfilename$VH.get(seg);
    }
    public static void lpfilename$set( MemorySegment seg, MemoryAddress x) {
        tagMCI_OVLY_LOAD_PARMSA.lpfilename$VH.set(seg, x);
    }
    public static MemoryAddress lpfilename$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagMCI_OVLY_LOAD_PARMSA.lpfilename$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfilename$set(MemorySegment seg, long index, MemoryAddress x) {
        tagMCI_OVLY_LOAD_PARMSA.lpfilename$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment rc$slice(MemorySegment seg) {
        return seg.asSlice(16, 16);
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


