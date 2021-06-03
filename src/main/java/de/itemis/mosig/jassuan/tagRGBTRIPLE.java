// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagRGBTRIPLE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("rgbtBlue"),
        C_CHAR.withName("rgbtGreen"),
        C_CHAR.withName("rgbtRed")
    ).withName("tagRGBTRIPLE");
    public static MemoryLayout $LAYOUT() {
        return tagRGBTRIPLE.$struct$LAYOUT;
    }
    static final VarHandle rgbtBlue$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("rgbtBlue"));
    public static VarHandle rgbtBlue$VH() {
        return tagRGBTRIPLE.rgbtBlue$VH;
    }
    public static byte rgbtBlue$get(MemorySegment seg) {
        return (byte)tagRGBTRIPLE.rgbtBlue$VH.get(seg);
    }
    public static void rgbtBlue$set( MemorySegment seg, byte x) {
        tagRGBTRIPLE.rgbtBlue$VH.set(seg, x);
    }
    public static byte rgbtBlue$get(MemorySegment seg, long index) {
        return (byte)tagRGBTRIPLE.rgbtBlue$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbtBlue$set(MemorySegment seg, long index, byte x) {
        tagRGBTRIPLE.rgbtBlue$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgbtGreen$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("rgbtGreen"));
    public static VarHandle rgbtGreen$VH() {
        return tagRGBTRIPLE.rgbtGreen$VH;
    }
    public static byte rgbtGreen$get(MemorySegment seg) {
        return (byte)tagRGBTRIPLE.rgbtGreen$VH.get(seg);
    }
    public static void rgbtGreen$set( MemorySegment seg, byte x) {
        tagRGBTRIPLE.rgbtGreen$VH.set(seg, x);
    }
    public static byte rgbtGreen$get(MemorySegment seg, long index) {
        return (byte)tagRGBTRIPLE.rgbtGreen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbtGreen$set(MemorySegment seg, long index, byte x) {
        tagRGBTRIPLE.rgbtGreen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rgbtRed$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("rgbtRed"));
    public static VarHandle rgbtRed$VH() {
        return tagRGBTRIPLE.rgbtRed$VH;
    }
    public static byte rgbtRed$get(MemorySegment seg) {
        return (byte)tagRGBTRIPLE.rgbtRed$VH.get(seg);
    }
    public static void rgbtRed$set( MemorySegment seg, byte x) {
        tagRGBTRIPLE.rgbtRed$VH.set(seg, x);
    }
    public static byte rgbtRed$get(MemorySegment seg, long index) {
        return (byte)tagRGBTRIPLE.rgbtRed$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rgbtRed$set(MemorySegment seg, long index, byte x) {
        tagRGBTRIPLE.rgbtRed$VH.set(seg.asSlice(index*sizeof()), x);
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


