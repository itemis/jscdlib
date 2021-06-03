// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class BITMAPV4HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("bV4Size"),
        C_LONG.withName("bV4Width"),
        C_LONG.withName("bV4Height"),
        C_SHORT.withName("bV4Planes"),
        C_SHORT.withName("bV4BitCount"),
        C_LONG.withName("bV4V4Compression"),
        C_LONG.withName("bV4SizeImage"),
        C_LONG.withName("bV4XPelsPerMeter"),
        C_LONG.withName("bV4YPelsPerMeter"),
        C_LONG.withName("bV4ClrUsed"),
        C_LONG.withName("bV4ClrImportant"),
        C_LONG.withName("bV4RedMask"),
        C_LONG.withName("bV4GreenMask"),
        C_LONG.withName("bV4BlueMask"),
        C_LONG.withName("bV4AlphaMask"),
        C_LONG.withName("bV4CSType"),
        MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("ciexyzX"),
                C_LONG.withName("ciexyzY"),
                C_LONG.withName("ciexyzZ")
            ).withName("ciexyzRed"),
            MemoryLayout.structLayout(
                C_LONG.withName("ciexyzX"),
                C_LONG.withName("ciexyzY"),
                C_LONG.withName("ciexyzZ")
            ).withName("ciexyzGreen"),
            MemoryLayout.structLayout(
                C_LONG.withName("ciexyzX"),
                C_LONG.withName("ciexyzY"),
                C_LONG.withName("ciexyzZ")
            ).withName("ciexyzBlue")
        ).withName("bV4Endpoints"),
        C_LONG.withName("bV4GammaRed"),
        C_LONG.withName("bV4GammaGreen"),
        C_LONG.withName("bV4GammaBlue")
    );
    public static MemoryLayout $LAYOUT() {
        return BITMAPV4HEADER.$struct$LAYOUT;
    }
    static final VarHandle bV4Size$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4Size"));
    public static VarHandle bV4Size$VH() {
        return BITMAPV4HEADER.bV4Size$VH;
    }
    public static int bV4Size$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4Size$VH.get(seg);
    }
    public static void bV4Size$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4Size$VH.set(seg, x);
    }
    public static int bV4Size$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4Size$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4Size$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4Size$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4Width$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4Width"));
    public static VarHandle bV4Width$VH() {
        return BITMAPV4HEADER.bV4Width$VH;
    }
    public static int bV4Width$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4Width$VH.get(seg);
    }
    public static void bV4Width$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4Width$VH.set(seg, x);
    }
    public static int bV4Width$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4Width$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4Width$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4Width$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4Height$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4Height"));
    public static VarHandle bV4Height$VH() {
        return BITMAPV4HEADER.bV4Height$VH;
    }
    public static int bV4Height$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4Height$VH.get(seg);
    }
    public static void bV4Height$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4Height$VH.set(seg, x);
    }
    public static int bV4Height$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4Height$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4Height$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4Height$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4Planes$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("bV4Planes"));
    public static VarHandle bV4Planes$VH() {
        return BITMAPV4HEADER.bV4Planes$VH;
    }
    public static short bV4Planes$get(MemorySegment seg) {
        return (short)BITMAPV4HEADER.bV4Planes$VH.get(seg);
    }
    public static void bV4Planes$set( MemorySegment seg, short x) {
        BITMAPV4HEADER.bV4Planes$VH.set(seg, x);
    }
    public static short bV4Planes$get(MemorySegment seg, long index) {
        return (short)BITMAPV4HEADER.bV4Planes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4Planes$set(MemorySegment seg, long index, short x) {
        BITMAPV4HEADER.bV4Planes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4BitCount$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("bV4BitCount"));
    public static VarHandle bV4BitCount$VH() {
        return BITMAPV4HEADER.bV4BitCount$VH;
    }
    public static short bV4BitCount$get(MemorySegment seg) {
        return (short)BITMAPV4HEADER.bV4BitCount$VH.get(seg);
    }
    public static void bV4BitCount$set( MemorySegment seg, short x) {
        BITMAPV4HEADER.bV4BitCount$VH.set(seg, x);
    }
    public static short bV4BitCount$get(MemorySegment seg, long index) {
        return (short)BITMAPV4HEADER.bV4BitCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4BitCount$set(MemorySegment seg, long index, short x) {
        BITMAPV4HEADER.bV4BitCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4V4Compression$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4V4Compression"));
    public static VarHandle bV4V4Compression$VH() {
        return BITMAPV4HEADER.bV4V4Compression$VH;
    }
    public static int bV4V4Compression$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4V4Compression$VH.get(seg);
    }
    public static void bV4V4Compression$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4V4Compression$VH.set(seg, x);
    }
    public static int bV4V4Compression$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4V4Compression$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4V4Compression$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4V4Compression$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4SizeImage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4SizeImage"));
    public static VarHandle bV4SizeImage$VH() {
        return BITMAPV4HEADER.bV4SizeImage$VH;
    }
    public static int bV4SizeImage$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4SizeImage$VH.get(seg);
    }
    public static void bV4SizeImage$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4SizeImage$VH.set(seg, x);
    }
    public static int bV4SizeImage$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4SizeImage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4SizeImage$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4SizeImage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4XPelsPerMeter$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4XPelsPerMeter"));
    public static VarHandle bV4XPelsPerMeter$VH() {
        return BITMAPV4HEADER.bV4XPelsPerMeter$VH;
    }
    public static int bV4XPelsPerMeter$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4XPelsPerMeter$VH.get(seg);
    }
    public static void bV4XPelsPerMeter$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4XPelsPerMeter$VH.set(seg, x);
    }
    public static int bV4XPelsPerMeter$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4XPelsPerMeter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4XPelsPerMeter$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4XPelsPerMeter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4YPelsPerMeter$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4YPelsPerMeter"));
    public static VarHandle bV4YPelsPerMeter$VH() {
        return BITMAPV4HEADER.bV4YPelsPerMeter$VH;
    }
    public static int bV4YPelsPerMeter$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4YPelsPerMeter$VH.get(seg);
    }
    public static void bV4YPelsPerMeter$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4YPelsPerMeter$VH.set(seg, x);
    }
    public static int bV4YPelsPerMeter$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4YPelsPerMeter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4YPelsPerMeter$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4YPelsPerMeter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4ClrUsed$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4ClrUsed"));
    public static VarHandle bV4ClrUsed$VH() {
        return BITMAPV4HEADER.bV4ClrUsed$VH;
    }
    public static int bV4ClrUsed$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4ClrUsed$VH.get(seg);
    }
    public static void bV4ClrUsed$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4ClrUsed$VH.set(seg, x);
    }
    public static int bV4ClrUsed$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4ClrUsed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4ClrUsed$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4ClrUsed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4ClrImportant$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4ClrImportant"));
    public static VarHandle bV4ClrImportant$VH() {
        return BITMAPV4HEADER.bV4ClrImportant$VH;
    }
    public static int bV4ClrImportant$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4ClrImportant$VH.get(seg);
    }
    public static void bV4ClrImportant$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4ClrImportant$VH.set(seg, x);
    }
    public static int bV4ClrImportant$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4ClrImportant$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4ClrImportant$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4ClrImportant$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4RedMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4RedMask"));
    public static VarHandle bV4RedMask$VH() {
        return BITMAPV4HEADER.bV4RedMask$VH;
    }
    public static int bV4RedMask$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4RedMask$VH.get(seg);
    }
    public static void bV4RedMask$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4RedMask$VH.set(seg, x);
    }
    public static int bV4RedMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4RedMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4RedMask$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4RedMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4GreenMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4GreenMask"));
    public static VarHandle bV4GreenMask$VH() {
        return BITMAPV4HEADER.bV4GreenMask$VH;
    }
    public static int bV4GreenMask$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4GreenMask$VH.get(seg);
    }
    public static void bV4GreenMask$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4GreenMask$VH.set(seg, x);
    }
    public static int bV4GreenMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4GreenMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4GreenMask$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4GreenMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4BlueMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4BlueMask"));
    public static VarHandle bV4BlueMask$VH() {
        return BITMAPV4HEADER.bV4BlueMask$VH;
    }
    public static int bV4BlueMask$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4BlueMask$VH.get(seg);
    }
    public static void bV4BlueMask$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4BlueMask$VH.set(seg, x);
    }
    public static int bV4BlueMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4BlueMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4BlueMask$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4BlueMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4AlphaMask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4AlphaMask"));
    public static VarHandle bV4AlphaMask$VH() {
        return BITMAPV4HEADER.bV4AlphaMask$VH;
    }
    public static int bV4AlphaMask$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4AlphaMask$VH.get(seg);
    }
    public static void bV4AlphaMask$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4AlphaMask$VH.set(seg, x);
    }
    public static int bV4AlphaMask$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4AlphaMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4AlphaMask$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4AlphaMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4CSType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4CSType"));
    public static VarHandle bV4CSType$VH() {
        return BITMAPV4HEADER.bV4CSType$VH;
    }
    public static int bV4CSType$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4CSType$VH.get(seg);
    }
    public static void bV4CSType$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4CSType$VH.set(seg, x);
    }
    public static int bV4CSType$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4CSType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4CSType$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4CSType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment bV4Endpoints$slice(MemorySegment seg) {
        return seg.asSlice(60, 36);
    }
    static final VarHandle bV4GammaRed$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4GammaRed"));
    public static VarHandle bV4GammaRed$VH() {
        return BITMAPV4HEADER.bV4GammaRed$VH;
    }
    public static int bV4GammaRed$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4GammaRed$VH.get(seg);
    }
    public static void bV4GammaRed$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4GammaRed$VH.set(seg, x);
    }
    public static int bV4GammaRed$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4GammaRed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4GammaRed$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4GammaRed$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4GammaGreen$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4GammaGreen"));
    public static VarHandle bV4GammaGreen$VH() {
        return BITMAPV4HEADER.bV4GammaGreen$VH;
    }
    public static int bV4GammaGreen$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4GammaGreen$VH.get(seg);
    }
    public static void bV4GammaGreen$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4GammaGreen$VH.set(seg, x);
    }
    public static int bV4GammaGreen$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4GammaGreen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4GammaGreen$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4GammaGreen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle bV4GammaBlue$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bV4GammaBlue"));
    public static VarHandle bV4GammaBlue$VH() {
        return BITMAPV4HEADER.bV4GammaBlue$VH;
    }
    public static int bV4GammaBlue$get(MemorySegment seg) {
        return (int)BITMAPV4HEADER.bV4GammaBlue$VH.get(seg);
    }
    public static void bV4GammaBlue$set( MemorySegment seg, int x) {
        BITMAPV4HEADER.bV4GammaBlue$VH.set(seg, x);
    }
    public static int bV4GammaBlue$get(MemorySegment seg, long index) {
        return (int)BITMAPV4HEADER.bV4GammaBlue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void bV4GammaBlue$set(MemorySegment seg, long index, int x) {
        BITMAPV4HEADER.bV4GammaBlue$VH.set(seg.asSlice(index*sizeof()), x);
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


