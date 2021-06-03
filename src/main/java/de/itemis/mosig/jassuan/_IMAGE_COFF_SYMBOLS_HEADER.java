// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _IMAGE_COFF_SYMBOLS_HEADER {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("NumberOfSymbols"),
        C_LONG.withName("LvaToFirstSymbol"),
        C_LONG.withName("NumberOfLinenumbers"),
        C_LONG.withName("LvaToFirstLinenumber"),
        C_LONG.withName("RvaToFirstByteOfCode"),
        C_LONG.withName("RvaToLastByteOfCode"),
        C_LONG.withName("RvaToFirstByteOfData"),
        C_LONG.withName("RvaToLastByteOfData")
    ).withName("_IMAGE_COFF_SYMBOLS_HEADER");
    public static MemoryLayout $LAYOUT() {
        return _IMAGE_COFF_SYMBOLS_HEADER.$struct$LAYOUT;
    }
    static final VarHandle NumberOfSymbols$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumberOfSymbols"));
    public static VarHandle NumberOfSymbols$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.NumberOfSymbols$VH;
    }
    public static int NumberOfSymbols$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.NumberOfSymbols$VH.get(seg);
    }
    public static void NumberOfSymbols$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.NumberOfSymbols$VH.set(seg, x);
    }
    public static int NumberOfSymbols$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.NumberOfSymbols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfSymbols$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.NumberOfSymbols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LvaToFirstSymbol$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("LvaToFirstSymbol"));
    public static VarHandle LvaToFirstSymbol$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstSymbol$VH;
    }
    public static int LvaToFirstSymbol$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstSymbol$VH.get(seg);
    }
    public static void LvaToFirstSymbol$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstSymbol$VH.set(seg, x);
    }
    public static int LvaToFirstSymbol$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstSymbol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LvaToFirstSymbol$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstSymbol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumberOfLinenumbers$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumberOfLinenumbers"));
    public static VarHandle NumberOfLinenumbers$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.NumberOfLinenumbers$VH;
    }
    public static int NumberOfLinenumbers$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.NumberOfLinenumbers$VH.get(seg);
    }
    public static void NumberOfLinenumbers$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.NumberOfLinenumbers$VH.set(seg, x);
    }
    public static int NumberOfLinenumbers$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.NumberOfLinenumbers$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumberOfLinenumbers$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.NumberOfLinenumbers$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle LvaToFirstLinenumber$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("LvaToFirstLinenumber"));
    public static VarHandle LvaToFirstLinenumber$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstLinenumber$VH;
    }
    public static int LvaToFirstLinenumber$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstLinenumber$VH.get(seg);
    }
    public static void LvaToFirstLinenumber$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstLinenumber$VH.set(seg, x);
    }
    public static int LvaToFirstLinenumber$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstLinenumber$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LvaToFirstLinenumber$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.LvaToFirstLinenumber$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RvaToFirstByteOfCode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("RvaToFirstByteOfCode"));
    public static VarHandle RvaToFirstByteOfCode$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfCode$VH;
    }
    public static int RvaToFirstByteOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfCode$VH.get(seg);
    }
    public static void RvaToFirstByteOfCode$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfCode$VH.set(seg, x);
    }
    public static int RvaToFirstByteOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RvaToFirstByteOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RvaToLastByteOfCode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("RvaToLastByteOfCode"));
    public static VarHandle RvaToLastByteOfCode$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfCode$VH;
    }
    public static int RvaToLastByteOfCode$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfCode$VH.get(seg);
    }
    public static void RvaToLastByteOfCode$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfCode$VH.set(seg, x);
    }
    public static int RvaToLastByteOfCode$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfCode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RvaToLastByteOfCode$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfCode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RvaToFirstByteOfData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("RvaToFirstByteOfData"));
    public static VarHandle RvaToFirstByteOfData$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfData$VH;
    }
    public static int RvaToFirstByteOfData$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfData$VH.get(seg);
    }
    public static void RvaToFirstByteOfData$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfData$VH.set(seg, x);
    }
    public static int RvaToFirstByteOfData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RvaToFirstByteOfData$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToFirstByteOfData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RvaToLastByteOfData$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("RvaToLastByteOfData"));
    public static VarHandle RvaToLastByteOfData$VH() {
        return _IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfData$VH;
    }
    public static int RvaToLastByteOfData$get(MemorySegment seg) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfData$VH.get(seg);
    }
    public static void RvaToLastByteOfData$set( MemorySegment seg, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfData$VH.set(seg, x);
    }
    public static int RvaToLastByteOfData$get(MemorySegment seg, long index) {
        return (int)_IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RvaToLastByteOfData$set(MemorySegment seg, long index, int x) {
        _IMAGE_COFF_SYMBOLS_HEADER.RvaToLastByteOfData$VH.set(seg.asSlice(index*sizeof()), x);
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


