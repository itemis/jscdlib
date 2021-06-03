// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMULTIKEYHELPA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("mkSize"),
        C_CHAR.withName("mkKeylist"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("szKeyphrase"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagMULTIKEYHELPA");
    public static MemoryLayout $LAYOUT() {
        return tagMULTIKEYHELPA.$struct$LAYOUT;
    }
    static final VarHandle mkSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("mkSize"));
    public static VarHandle mkSize$VH() {
        return tagMULTIKEYHELPA.mkSize$VH;
    }
    public static int mkSize$get(MemorySegment seg) {
        return (int)tagMULTIKEYHELPA.mkSize$VH.get(seg);
    }
    public static void mkSize$set( MemorySegment seg, int x) {
        tagMULTIKEYHELPA.mkSize$VH.set(seg, x);
    }
    public static int mkSize$get(MemorySegment seg, long index) {
        return (int)tagMULTIKEYHELPA.mkSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mkSize$set(MemorySegment seg, long index, int x) {
        tagMULTIKEYHELPA.mkSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle mkKeylist$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("mkKeylist"));
    public static VarHandle mkKeylist$VH() {
        return tagMULTIKEYHELPA.mkKeylist$VH;
    }
    public static byte mkKeylist$get(MemorySegment seg) {
        return (byte)tagMULTIKEYHELPA.mkKeylist$VH.get(seg);
    }
    public static void mkKeylist$set( MemorySegment seg, byte x) {
        tagMULTIKEYHELPA.mkKeylist$VH.set(seg, x);
    }
    public static byte mkKeylist$get(MemorySegment seg, long index) {
        return (byte)tagMULTIKEYHELPA.mkKeylist$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void mkKeylist$set(MemorySegment seg, long index, byte x) {
        tagMULTIKEYHELPA.mkKeylist$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szKeyphrase$slice(MemorySegment seg) {
        return seg.asSlice(5, 1);
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


