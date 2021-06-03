// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagEXTLOGFONTA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("lfHeight"),
            C_LONG.withName("lfWidth"),
            C_LONG.withName("lfEscapement"),
            C_LONG.withName("lfOrientation"),
            C_LONG.withName("lfWeight"),
            C_CHAR.withName("lfItalic"),
            C_CHAR.withName("lfUnderline"),
            C_CHAR.withName("lfStrikeOut"),
            C_CHAR.withName("lfCharSet"),
            C_CHAR.withName("lfOutPrecision"),
            C_CHAR.withName("lfClipPrecision"),
            C_CHAR.withName("lfQuality"),
            C_CHAR.withName("lfPitchAndFamily"),
            MemoryLayout.sequenceLayout(32, C_CHAR).withName("lfFaceName")
        ).withName("elfLogFont"),
        MemoryLayout.sequenceLayout(64, C_CHAR).withName("elfFullName"),
        MemoryLayout.sequenceLayout(32, C_CHAR).withName("elfStyle"),
        C_LONG.withName("elfVersion"),
        C_LONG.withName("elfStyleSize"),
        C_LONG.withName("elfMatch"),
        C_LONG.withName("elfReserved"),
        MemoryLayout.sequenceLayout(4, C_CHAR).withName("elfVendorId"),
        C_LONG.withName("elfCulture"),
        MemoryLayout.structLayout(
            C_CHAR.withName("bFamilyType"),
            C_CHAR.withName("bSerifStyle"),
            C_CHAR.withName("bWeight"),
            C_CHAR.withName("bProportion"),
            C_CHAR.withName("bContrast"),
            C_CHAR.withName("bStrokeVariation"),
            C_CHAR.withName("bArmStyle"),
            C_CHAR.withName("bLetterform"),
            C_CHAR.withName("bMidline"),
            C_CHAR.withName("bXHeight")
        ).withName("elfPanose"),
        MemoryLayout.paddingLayout(16)
    ).withName("tagEXTLOGFONTA");
    public static MemoryLayout $LAYOUT() {
        return tagEXTLOGFONTA.$struct$LAYOUT;
    }
    public static MemorySegment elfLogFont$slice(MemorySegment seg) {
        return seg.asSlice(0, 60);
    }
    public static MemorySegment elfFullName$slice(MemorySegment seg) {
        return seg.asSlice(60, 64);
    }
    public static MemorySegment elfStyle$slice(MemorySegment seg) {
        return seg.asSlice(124, 32);
    }
    static final VarHandle elfVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elfVersion"));
    public static VarHandle elfVersion$VH() {
        return tagEXTLOGFONTA.elfVersion$VH;
    }
    public static int elfVersion$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTA.elfVersion$VH.get(seg);
    }
    public static void elfVersion$set( MemorySegment seg, int x) {
        tagEXTLOGFONTA.elfVersion$VH.set(seg, x);
    }
    public static int elfVersion$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTA.elfVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfVersion$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTA.elfVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elfStyleSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elfStyleSize"));
    public static VarHandle elfStyleSize$VH() {
        return tagEXTLOGFONTA.elfStyleSize$VH;
    }
    public static int elfStyleSize$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTA.elfStyleSize$VH.get(seg);
    }
    public static void elfStyleSize$set( MemorySegment seg, int x) {
        tagEXTLOGFONTA.elfStyleSize$VH.set(seg, x);
    }
    public static int elfStyleSize$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTA.elfStyleSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfStyleSize$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTA.elfStyleSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elfMatch$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elfMatch"));
    public static VarHandle elfMatch$VH() {
        return tagEXTLOGFONTA.elfMatch$VH;
    }
    public static int elfMatch$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTA.elfMatch$VH.get(seg);
    }
    public static void elfMatch$set( MemorySegment seg, int x) {
        tagEXTLOGFONTA.elfMatch$VH.set(seg, x);
    }
    public static int elfMatch$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTA.elfMatch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfMatch$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTA.elfMatch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle elfReserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elfReserved"));
    public static VarHandle elfReserved$VH() {
        return tagEXTLOGFONTA.elfReserved$VH;
    }
    public static int elfReserved$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTA.elfReserved$VH.get(seg);
    }
    public static void elfReserved$set( MemorySegment seg, int x) {
        tagEXTLOGFONTA.elfReserved$VH.set(seg, x);
    }
    public static int elfReserved$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTA.elfReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfReserved$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTA.elfReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elfVendorId$slice(MemorySegment seg) {
        return seg.asSlice(172, 4);
    }
    static final VarHandle elfCulture$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("elfCulture"));
    public static VarHandle elfCulture$VH() {
        return tagEXTLOGFONTA.elfCulture$VH;
    }
    public static int elfCulture$get(MemorySegment seg) {
        return (int)tagEXTLOGFONTA.elfCulture$VH.get(seg);
    }
    public static void elfCulture$set( MemorySegment seg, int x) {
        tagEXTLOGFONTA.elfCulture$VH.set(seg, x);
    }
    public static int elfCulture$get(MemorySegment seg, long index) {
        return (int)tagEXTLOGFONTA.elfCulture$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void elfCulture$set(MemorySegment seg, long index, int x) {
        tagEXTLOGFONTA.elfCulture$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment elfPanose$slice(MemorySegment seg) {
        return seg.asSlice(180, 10);
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


