// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _FILE_RENAME_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            C_CHAR.withName("ReplaceIfExists"),
            C_LONG.withName("Flags")
        ).withName("$anon$0"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("RootDirectory"),
        C_LONG.withName("FileNameLength"),
        MemoryLayout.sequenceLayout(1, C_SHORT).withName("FileName"),
        MemoryLayout.paddingLayout(16)
    ).withName("_FILE_RENAME_INFO");
    public static MemoryLayout $LAYOUT() {
        return _FILE_RENAME_INFO.$struct$LAYOUT;
    }
    static final VarHandle ReplaceIfExists$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("ReplaceIfExists"));
    public static VarHandle ReplaceIfExists$VH() {
        return _FILE_RENAME_INFO.ReplaceIfExists$VH;
    }
    public static byte ReplaceIfExists$get(MemorySegment seg) {
        return (byte)_FILE_RENAME_INFO.ReplaceIfExists$VH.get(seg);
    }
    public static void ReplaceIfExists$set( MemorySegment seg, byte x) {
        _FILE_RENAME_INFO.ReplaceIfExists$VH.set(seg, x);
    }
    public static byte ReplaceIfExists$get(MemorySegment seg, long index) {
        return (byte)_FILE_RENAME_INFO.ReplaceIfExists$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReplaceIfExists$set(MemorySegment seg, long index, byte x) {
        _FILE_RENAME_INFO.ReplaceIfExists$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("$anon$0"), MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return _FILE_RENAME_INFO.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)_FILE_RENAME_INFO.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        _FILE_RENAME_INFO.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)_FILE_RENAME_INFO.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        _FILE_RENAME_INFO.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RootDirectory$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("RootDirectory")));
    public static VarHandle RootDirectory$VH() {
        return _FILE_RENAME_INFO.RootDirectory$VH;
    }
    public static MemoryAddress RootDirectory$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_FILE_RENAME_INFO.RootDirectory$VH.get(seg);
    }
    public static void RootDirectory$set( MemorySegment seg, MemoryAddress x) {
        _FILE_RENAME_INFO.RootDirectory$VH.set(seg, x);
    }
    public static MemoryAddress RootDirectory$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_FILE_RENAME_INFO.RootDirectory$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RootDirectory$set(MemorySegment seg, long index, MemoryAddress x) {
        _FILE_RENAME_INFO.RootDirectory$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FileNameLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("FileNameLength"));
    public static VarHandle FileNameLength$VH() {
        return _FILE_RENAME_INFO.FileNameLength$VH;
    }
    public static int FileNameLength$get(MemorySegment seg) {
        return (int)_FILE_RENAME_INFO.FileNameLength$VH.get(seg);
    }
    public static void FileNameLength$set( MemorySegment seg, int x) {
        _FILE_RENAME_INFO.FileNameLength$VH.set(seg, x);
    }
    public static int FileNameLength$get(MemorySegment seg, long index) {
        return (int)_FILE_RENAME_INFO.FileNameLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FileNameLength$set(MemorySegment seg, long index, int x) {
        _FILE_RENAME_INFO.FileNameLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FileName$slice(MemorySegment seg) {
        return seg.asSlice(20, 2);
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


