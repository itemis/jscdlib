// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class MENUITEMTEMPLATEHEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("versionNumber"),
        C_SHORT.withName("offset")
    );
    public static MemoryLayout $LAYOUT() {
        return MENUITEMTEMPLATEHEADER.$struct$LAYOUT;
    }
    static final VarHandle versionNumber$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("versionNumber"));
    public static VarHandle versionNumber$VH() {
        return MENUITEMTEMPLATEHEADER.versionNumber$VH;
    }
    public static short versionNumber$get(MemorySegment seg) {
        return (short)MENUITEMTEMPLATEHEADER.versionNumber$VH.get(seg);
    }
    public static void versionNumber$set( MemorySegment seg, short x) {
        MENUITEMTEMPLATEHEADER.versionNumber$VH.set(seg, x);
    }
    public static short versionNumber$get(MemorySegment seg, long index) {
        return (short)MENUITEMTEMPLATEHEADER.versionNumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void versionNumber$set(MemorySegment seg, long index, short x) {
        MENUITEMTEMPLATEHEADER.versionNumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle offset$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("offset"));
    public static VarHandle offset$VH() {
        return MENUITEMTEMPLATEHEADER.offset$VH;
    }
    public static short offset$get(MemorySegment seg) {
        return (short)MENUITEMTEMPLATEHEADER.offset$VH.get(seg);
    }
    public static void offset$set( MemorySegment seg, short x) {
        MENUITEMTEMPLATEHEADER.offset$VH.set(seg, x);
    }
    public static short offset$get(MemorySegment seg, long index) {
        return (short)MENUITEMTEMPLATEHEADER.offset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void offset$set(MemorySegment seg, long index, short x) {
        MENUITEMTEMPLATEHEADER.offset$VH.set(seg.asSlice(index*sizeof()), x);
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


