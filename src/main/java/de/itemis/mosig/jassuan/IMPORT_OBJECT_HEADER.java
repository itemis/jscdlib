// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IMPORT_OBJECT_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("Sig1"),
        C_SHORT.withName("Sig2"),
        C_SHORT.withName("Version"),
        C_SHORT.withName("Machine"),
        C_LONG.withName("TimeDateStamp"),
        C_LONG.withName("SizeOfData"),
        MemoryLayout.unionLayout(
            C_SHORT.withName("Ordinal"),
            C_SHORT.withName("Hint")
        ).withName("$anon$0"),
        MemoryLayout.structLayout(
            MemoryLayout.valueLayout(2, ByteOrder.nativeOrder()).withName("Type"),
            MemoryLayout.valueLayout(3, ByteOrder.nativeOrder()).withName("NameType"),
            MemoryLayout.valueLayout(11, ByteOrder.nativeOrder()).withName("Reserved")
        )
    ).withName("IMPORT_OBJECT_HEADER");
    public static MemoryLayout $LAYOUT() {
        return IMPORT_OBJECT_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Sig1$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Sig1"));
    public static VarHandle Sig1$VH() {
        return IMPORT_OBJECT_HEADER.Sig1$VH;
    }
    public static short Sig1$get(MemorySegment seg) {
        return (short)IMPORT_OBJECT_HEADER.Sig1$VH.get(seg);
    }
    public static void Sig1$set( MemorySegment seg, short x) {
        IMPORT_OBJECT_HEADER.Sig1$VH.set(seg, x);
    }
    public static short Sig1$get(MemorySegment seg, long index) {
        return (short)IMPORT_OBJECT_HEADER.Sig1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig1$set(MemorySegment seg, long index, short x) {
        IMPORT_OBJECT_HEADER.Sig1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sig2$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Sig2"));
    public static VarHandle Sig2$VH() {
        return IMPORT_OBJECT_HEADER.Sig2$VH;
    }
    public static short Sig2$get(MemorySegment seg) {
        return (short)IMPORT_OBJECT_HEADER.Sig2$VH.get(seg);
    }
    public static void Sig2$set( MemorySegment seg, short x) {
        IMPORT_OBJECT_HEADER.Sig2$VH.set(seg, x);
    }
    public static short Sig2$get(MemorySegment seg, long index) {
        return (short)IMPORT_OBJECT_HEADER.Sig2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig2$set(MemorySegment seg, long index, short x) {
        IMPORT_OBJECT_HEADER.Sig2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return IMPORT_OBJECT_HEADER.Version$VH;
    }
    public static short Version$get(MemorySegment seg) {
        return (short)IMPORT_OBJECT_HEADER.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, short x) {
        IMPORT_OBJECT_HEADER.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)IMPORT_OBJECT_HEADER.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        IMPORT_OBJECT_HEADER.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return IMPORT_OBJECT_HEADER.Machine$VH;
    }
    public static short Machine$get(MemorySegment seg) {
        return (short)IMPORT_OBJECT_HEADER.Machine$VH.get(seg);
    }
    public static void Machine$set( MemorySegment seg, short x) {
        IMPORT_OBJECT_HEADER.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)IMPORT_OBJECT_HEADER.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        IMPORT_OBJECT_HEADER.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return IMPORT_OBJECT_HEADER.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)IMPORT_OBJECT_HEADER.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        IMPORT_OBJECT_HEADER.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)IMPORT_OBJECT_HEADER.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        IMPORT_OBJECT_HEADER.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SizeOfData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SizeOfData"));
    public static VarHandle SizeOfData$VH() {
        return IMPORT_OBJECT_HEADER.SizeOfData$VH;
    }
    public static int SizeOfData$get(MemorySegment seg) {
        return (int)IMPORT_OBJECT_HEADER.SizeOfData$VH.get(seg);
    }
    public static void SizeOfData$set( MemorySegment seg, int x) {
        IMPORT_OBJECT_HEADER.SizeOfData$VH.set(seg, x);
    }
    public static int SizeOfData$get(MemorySegment seg, long index) {
        return (int)IMPORT_OBJECT_HEADER.SizeOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfData$set(MemorySegment seg, long index, int x) {
        IMPORT_OBJECT_HEADER.SizeOfData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Ordinal$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Ordinal"));
    public static VarHandle Ordinal$VH() {
        return IMPORT_OBJECT_HEADER.Ordinal$VH;
    }
    public static short Ordinal$get(MemorySegment seg) {
        return (short)IMPORT_OBJECT_HEADER.Ordinal$VH.get(seg);
    }
    public static void Ordinal$set( MemorySegment seg, short x) {
        IMPORT_OBJECT_HEADER.Ordinal$VH.set(seg, x);
    }
    public static short Ordinal$get(MemorySegment seg, long index) {
        return (short)IMPORT_OBJECT_HEADER.Ordinal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Ordinal$set(MemorySegment seg, long index, short x) {
        IMPORT_OBJECT_HEADER.Ordinal$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Hint$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Hint"));
    public static VarHandle Hint$VH() {
        return IMPORT_OBJECT_HEADER.Hint$VH;
    }
    public static short Hint$get(MemorySegment seg) {
        return (short)IMPORT_OBJECT_HEADER.Hint$VH.get(seg);
    }
    public static void Hint$set( MemorySegment seg, short x) {
        IMPORT_OBJECT_HEADER.Hint$VH.set(seg, x);
    }
    public static short Hint$get(MemorySegment seg, long index) {
        return (short)IMPORT_OBJECT_HEADER.Hint$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Hint$set(MemorySegment seg, long index, short x) {
        IMPORT_OBJECT_HEADER.Hint$VH.set(seg.asSlice(index*sizeof()), x);
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


