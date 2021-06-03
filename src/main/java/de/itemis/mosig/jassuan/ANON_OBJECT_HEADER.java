// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class ANON_OBJECT_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("Sig1"),
        C_SHORT.withName("Sig2"),
        C_SHORT.withName("Version"),
        C_SHORT.withName("Machine"),
        C_LONG.withName("TimeDateStamp"),
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("ClassID"),
        C_LONG.withName("SizeOfData")
    ).withName("ANON_OBJECT_HEADER");
    public static MemoryLayout $LAYOUT() {
        return ANON_OBJECT_HEADER.$struct$LAYOUT;
    }
    static final VarHandle Sig1$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Sig1"));
    public static VarHandle Sig1$VH() {
        return ANON_OBJECT_HEADER.Sig1$VH;
    }
    public static short Sig1$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER.Sig1$VH.get(seg);
    }
    public static void Sig1$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER.Sig1$VH.set(seg, x);
    }
    public static short Sig1$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER.Sig1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig1$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER.Sig1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Sig2$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Sig2"));
    public static VarHandle Sig2$VH() {
        return ANON_OBJECT_HEADER.Sig2$VH;
    }
    public static short Sig2$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER.Sig2$VH.get(seg);
    }
    public static void Sig2$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER.Sig2$VH.set(seg, x);
    }
    public static short Sig2$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER.Sig2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Sig2$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER.Sig2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return ANON_OBJECT_HEADER.Version$VH;
    }
    public static short Version$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER.Version$VH.set(seg, x);
    }
    public static short Version$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Machine$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Machine"));
    public static VarHandle Machine$VH() {
        return ANON_OBJECT_HEADER.Machine$VH;
    }
    public static short Machine$get(MemorySegment seg) {
        return (short)ANON_OBJECT_HEADER.Machine$VH.get(seg);
    }
    public static void Machine$set( MemorySegment seg, short x) {
        ANON_OBJECT_HEADER.Machine$VH.set(seg, x);
    }
    public static short Machine$get(MemorySegment seg, long index) {
        return (short)ANON_OBJECT_HEADER.Machine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Machine$set(MemorySegment seg, long index, short x) {
        ANON_OBJECT_HEADER.Machine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TimeDateStamp$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("TimeDateStamp"));
    public static VarHandle TimeDateStamp$VH() {
        return ANON_OBJECT_HEADER.TimeDateStamp$VH;
    }
    public static int TimeDateStamp$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER.TimeDateStamp$VH.get(seg);
    }
    public static void TimeDateStamp$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER.TimeDateStamp$VH.set(seg, x);
    }
    public static int TimeDateStamp$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER.TimeDateStamp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TimeDateStamp$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER.TimeDateStamp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ClassID$slice(MemorySegment seg) {
        return seg.asSlice(12, 16);
    }
    static final VarHandle SizeOfData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("SizeOfData"));
    public static VarHandle SizeOfData$VH() {
        return ANON_OBJECT_HEADER.SizeOfData$VH;
    }
    public static int SizeOfData$get(MemorySegment seg) {
        return (int)ANON_OBJECT_HEADER.SizeOfData$VH.get(seg);
    }
    public static void SizeOfData$set( MemorySegment seg, int x) {
        ANON_OBJECT_HEADER.SizeOfData$VH.set(seg, x);
    }
    public static int SizeOfData$get(MemorySegment seg, long index) {
        return (int)ANON_OBJECT_HEADER.SizeOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SizeOfData$set(MemorySegment seg, long index, int x) {
        ANON_OBJECT_HEADER.SizeOfData$VH.set(seg.asSlice(index*sizeof()), x);
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


