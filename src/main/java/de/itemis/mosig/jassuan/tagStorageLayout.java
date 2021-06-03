// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagStorageLayout {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("LayoutType"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pwcsElementName"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("cOffset"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("cBytes")
    ).withName("tagStorageLayout");
    public static MemoryLayout $LAYOUT() {
        return tagStorageLayout.$struct$LAYOUT;
    }
    static final VarHandle LayoutType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("LayoutType"));
    public static VarHandle LayoutType$VH() {
        return tagStorageLayout.LayoutType$VH;
    }
    public static int LayoutType$get(MemorySegment seg) {
        return (int)tagStorageLayout.LayoutType$VH.get(seg);
    }
    public static void LayoutType$set( MemorySegment seg, int x) {
        tagStorageLayout.LayoutType$VH.set(seg, x);
    }
    public static int LayoutType$get(MemorySegment seg, long index) {
        return (int)tagStorageLayout.LayoutType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LayoutType$set(MemorySegment seg, long index, int x) {
        tagStorageLayout.LayoutType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pwcsElementName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pwcsElementName")));
    public static VarHandle pwcsElementName$VH() {
        return tagStorageLayout.pwcsElementName$VH;
    }
    public static MemoryAddress pwcsElementName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagStorageLayout.pwcsElementName$VH.get(seg);
    }
    public static void pwcsElementName$set( MemorySegment seg, MemoryAddress x) {
        tagStorageLayout.pwcsElementName$VH.set(seg, x);
    }
    public static MemoryAddress pwcsElementName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagStorageLayout.pwcsElementName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwcsElementName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagStorageLayout.pwcsElementName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cOffset$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment cBytes$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
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


