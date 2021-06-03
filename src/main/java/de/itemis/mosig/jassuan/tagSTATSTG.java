// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagSTATSTG {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pwcsName"),
        C_LONG.withName("type"),
        MemoryLayout.paddingLayout(32),
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
        ).withName("cbSize"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("mtime"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("ctime"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwLowDateTime"),
            C_LONG.withName("dwHighDateTime")
        ).withName("atime"),
        C_LONG.withName("grfMode"),
        C_LONG.withName("grfLocksSupported"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("clsid"),
        C_LONG.withName("grfStateBits"),
        C_LONG.withName("reserved")
    ).withName("tagSTATSTG");
    public static MemoryLayout $LAYOUT() {
        return tagSTATSTG.$struct$LAYOUT;
    }
    static final VarHandle pwcsName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pwcsName")));
    public static VarHandle pwcsName$VH() {
        return tagSTATSTG.pwcsName$VH;
    }
    public static MemoryAddress pwcsName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagSTATSTG.pwcsName$VH.get(seg);
    }
    public static void pwcsName$set( MemorySegment seg, MemoryAddress x) {
        tagSTATSTG.pwcsName$VH.set(seg, x);
    }
    public static MemoryAddress pwcsName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagSTATSTG.pwcsName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pwcsName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSTATSTG.pwcsName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return tagSTATSTG.type$VH;
    }
    public static int type$get(MemorySegment seg) {
        return (int)tagSTATSTG.type$VH.get(seg);
    }
    public static void type$set( MemorySegment seg, int x) {
        tagSTATSTG.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)tagSTATSTG.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        tagSTATSTG.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment cbSize$slice(MemorySegment seg) {
        return seg.asSlice(16, 8);
    }
    public static MemorySegment mtime$slice(MemorySegment seg) {
        return seg.asSlice(24, 8);
    }
    public static MemorySegment ctime$slice(MemorySegment seg) {
        return seg.asSlice(32, 8);
    }
    public static MemorySegment atime$slice(MemorySegment seg) {
        return seg.asSlice(40, 8);
    }
    static final VarHandle grfMode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("grfMode"));
    public static VarHandle grfMode$VH() {
        return tagSTATSTG.grfMode$VH;
    }
    public static int grfMode$get(MemorySegment seg) {
        return (int)tagSTATSTG.grfMode$VH.get(seg);
    }
    public static void grfMode$set( MemorySegment seg, int x) {
        tagSTATSTG.grfMode$VH.set(seg, x);
    }
    public static int grfMode$get(MemorySegment seg, long index) {
        return (int)tagSTATSTG.grfMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfMode$set(MemorySegment seg, long index, int x) {
        tagSTATSTG.grfMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle grfLocksSupported$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("grfLocksSupported"));
    public static VarHandle grfLocksSupported$VH() {
        return tagSTATSTG.grfLocksSupported$VH;
    }
    public static int grfLocksSupported$get(MemorySegment seg) {
        return (int)tagSTATSTG.grfLocksSupported$VH.get(seg);
    }
    public static void grfLocksSupported$set( MemorySegment seg, int x) {
        tagSTATSTG.grfLocksSupported$VH.set(seg, x);
    }
    public static int grfLocksSupported$get(MemorySegment seg, long index) {
        return (int)tagSTATSTG.grfLocksSupported$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfLocksSupported$set(MemorySegment seg, long index, int x) {
        tagSTATSTG.grfLocksSupported$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment clsid$slice(MemorySegment seg) {
        return seg.asSlice(56, 16);
    }
    static final VarHandle grfStateBits$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("grfStateBits"));
    public static VarHandle grfStateBits$VH() {
        return tagSTATSTG.grfStateBits$VH;
    }
    public static int grfStateBits$get(MemorySegment seg) {
        return (int)tagSTATSTG.grfStateBits$VH.get(seg);
    }
    public static void grfStateBits$set( MemorySegment seg, int x) {
        tagSTATSTG.grfStateBits$VH.set(seg, x);
    }
    public static int grfStateBits$get(MemorySegment seg, long index) {
        return (int)tagSTATSTG.grfStateBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void grfStateBits$set(MemorySegment seg, long index, int x) {
        tagSTATSTG.grfStateBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle reserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("reserved"));
    public static VarHandle reserved$VH() {
        return tagSTATSTG.reserved$VH;
    }
    public static int reserved$get(MemorySegment seg) {
        return (int)tagSTATSTG.reserved$VH.get(seg);
    }
    public static void reserved$set( MemorySegment seg, int x) {
        tagSTATSTG.reserved$VH.set(seg, x);
    }
    public static int reserved$get(MemorySegment seg, long index) {
        return (int)tagSTATSTG.reserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void reserved$set(MemorySegment seg, long index, int x) {
        tagSTATSTG.reserved$VH.set(seg.asSlice(index*sizeof()), x);
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


