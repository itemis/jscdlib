// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _XMM_SAVE_AREA32 {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("ControlWord"),
        C_SHORT.withName("StatusWord"),
        C_CHAR.withName("TagWord"),
        C_CHAR.withName("Reserved1"),
        C_SHORT.withName("ErrorOpcode"),
        C_LONG.withName("ErrorOffset"),
        C_SHORT.withName("ErrorSelector"),
        C_SHORT.withName("Reserved2"),
        C_LONG.withName("DataOffset"),
        C_SHORT.withName("DataSelector"),
        C_SHORT.withName("Reserved3"),
        C_LONG.withName("MxCsr"),
        C_LONG.withName("MxCsr_Mask"),
        MemoryLayout.sequenceLayout(8, MemoryLayout.structLayout(
            C_LONG_LONG.withName("Low"),
            C_LONG_LONG.withName("High")
        ).withName("_M128A")).withName("FloatRegisters"),
        MemoryLayout.sequenceLayout(16, MemoryLayout.structLayout(
            C_LONG_LONG.withName("Low"),
            C_LONG_LONG.withName("High")
        ).withName("_M128A")).withName("XmmRegisters"),
        MemoryLayout.sequenceLayout(96, C_CHAR).withName("Reserved4")
    ).withName("_XMM_SAVE_AREA32");
    public static MemoryLayout $LAYOUT() {
        return _XMM_SAVE_AREA32.$struct$LAYOUT;
    }
    static final VarHandle ControlWord$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ControlWord"));
    public static VarHandle ControlWord$VH() {
        return _XMM_SAVE_AREA32.ControlWord$VH;
    }
    public static short ControlWord$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.ControlWord$VH.get(seg);
    }
    public static void ControlWord$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.ControlWord$VH.set(seg, x);
    }
    public static short ControlWord$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.ControlWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ControlWord$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.ControlWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle StatusWord$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("StatusWord"));
    public static VarHandle StatusWord$VH() {
        return _XMM_SAVE_AREA32.StatusWord$VH;
    }
    public static short StatusWord$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.StatusWord$VH.get(seg);
    }
    public static void StatusWord$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.StatusWord$VH.set(seg, x);
    }
    public static short StatusWord$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.StatusWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void StatusWord$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.StatusWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle TagWord$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("TagWord"));
    public static VarHandle TagWord$VH() {
        return _XMM_SAVE_AREA32.TagWord$VH;
    }
    public static byte TagWord$get(MemorySegment seg) {
        return (byte)_XMM_SAVE_AREA32.TagWord$VH.get(seg);
    }
    public static void TagWord$set( MemorySegment seg, byte x) {
        _XMM_SAVE_AREA32.TagWord$VH.set(seg, x);
    }
    public static byte TagWord$get(MemorySegment seg, long index) {
        return (byte)_XMM_SAVE_AREA32.TagWord$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TagWord$set(MemorySegment seg, long index, byte x) {
        _XMM_SAVE_AREA32.TagWord$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved1$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("Reserved1"));
    public static VarHandle Reserved1$VH() {
        return _XMM_SAVE_AREA32.Reserved1$VH;
    }
    public static byte Reserved1$get(MemorySegment seg) {
        return (byte)_XMM_SAVE_AREA32.Reserved1$VH.get(seg);
    }
    public static void Reserved1$set( MemorySegment seg, byte x) {
        _XMM_SAVE_AREA32.Reserved1$VH.set(seg, x);
    }
    public static byte Reserved1$get(MemorySegment seg, long index) {
        return (byte)_XMM_SAVE_AREA32.Reserved1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved1$set(MemorySegment seg, long index, byte x) {
        _XMM_SAVE_AREA32.Reserved1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorOpcode$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ErrorOpcode"));
    public static VarHandle ErrorOpcode$VH() {
        return _XMM_SAVE_AREA32.ErrorOpcode$VH;
    }
    public static short ErrorOpcode$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.ErrorOpcode$VH.get(seg);
    }
    public static void ErrorOpcode$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.ErrorOpcode$VH.set(seg, x);
    }
    public static short ErrorOpcode$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.ErrorOpcode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorOpcode$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.ErrorOpcode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorOffset$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ErrorOffset"));
    public static VarHandle ErrorOffset$VH() {
        return _XMM_SAVE_AREA32.ErrorOffset$VH;
    }
    public static int ErrorOffset$get(MemorySegment seg) {
        return (int)_XMM_SAVE_AREA32.ErrorOffset$VH.get(seg);
    }
    public static void ErrorOffset$set( MemorySegment seg, int x) {
        _XMM_SAVE_AREA32.ErrorOffset$VH.set(seg, x);
    }
    public static int ErrorOffset$get(MemorySegment seg, long index) {
        return (int)_XMM_SAVE_AREA32.ErrorOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorOffset$set(MemorySegment seg, long index, int x) {
        _XMM_SAVE_AREA32.ErrorOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ErrorSelector$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ErrorSelector"));
    public static VarHandle ErrorSelector$VH() {
        return _XMM_SAVE_AREA32.ErrorSelector$VH;
    }
    public static short ErrorSelector$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.ErrorSelector$VH.get(seg);
    }
    public static void ErrorSelector$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.ErrorSelector$VH.set(seg, x);
    }
    public static short ErrorSelector$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.ErrorSelector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ErrorSelector$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.ErrorSelector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved2$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Reserved2"));
    public static VarHandle Reserved2$VH() {
        return _XMM_SAVE_AREA32.Reserved2$VH;
    }
    public static short Reserved2$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.Reserved2$VH.get(seg);
    }
    public static void Reserved2$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.Reserved2$VH.set(seg, x);
    }
    public static short Reserved2$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.Reserved2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved2$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.Reserved2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataOffset$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DataOffset"));
    public static VarHandle DataOffset$VH() {
        return _XMM_SAVE_AREA32.DataOffset$VH;
    }
    public static int DataOffset$get(MemorySegment seg) {
        return (int)_XMM_SAVE_AREA32.DataOffset$VH.get(seg);
    }
    public static void DataOffset$set( MemorySegment seg, int x) {
        _XMM_SAVE_AREA32.DataOffset$VH.set(seg, x);
    }
    public static int DataOffset$get(MemorySegment seg, long index) {
        return (int)_XMM_SAVE_AREA32.DataOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataOffset$set(MemorySegment seg, long index, int x) {
        _XMM_SAVE_AREA32.DataOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DataSelector$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("DataSelector"));
    public static VarHandle DataSelector$VH() {
        return _XMM_SAVE_AREA32.DataSelector$VH;
    }
    public static short DataSelector$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.DataSelector$VH.get(seg);
    }
    public static void DataSelector$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.DataSelector$VH.set(seg, x);
    }
    public static short DataSelector$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.DataSelector$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataSelector$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.DataSelector$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Reserved3$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("Reserved3"));
    public static VarHandle Reserved3$VH() {
        return _XMM_SAVE_AREA32.Reserved3$VH;
    }
    public static short Reserved3$get(MemorySegment seg) {
        return (short)_XMM_SAVE_AREA32.Reserved3$VH.get(seg);
    }
    public static void Reserved3$set( MemorySegment seg, short x) {
        _XMM_SAVE_AREA32.Reserved3$VH.set(seg, x);
    }
    public static short Reserved3$get(MemorySegment seg, long index) {
        return (short)_XMM_SAVE_AREA32.Reserved3$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reserved3$set(MemorySegment seg, long index, short x) {
        _XMM_SAVE_AREA32.Reserved3$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MxCsr$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MxCsr"));
    public static VarHandle MxCsr$VH() {
        return _XMM_SAVE_AREA32.MxCsr$VH;
    }
    public static int MxCsr$get(MemorySegment seg) {
        return (int)_XMM_SAVE_AREA32.MxCsr$VH.get(seg);
    }
    public static void MxCsr$set( MemorySegment seg, int x) {
        _XMM_SAVE_AREA32.MxCsr$VH.set(seg, x);
    }
    public static int MxCsr$get(MemorySegment seg, long index) {
        return (int)_XMM_SAVE_AREA32.MxCsr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MxCsr$set(MemorySegment seg, long index, int x) {
        _XMM_SAVE_AREA32.MxCsr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle MxCsr_Mask$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MxCsr_Mask"));
    public static VarHandle MxCsr_Mask$VH() {
        return _XMM_SAVE_AREA32.MxCsr_Mask$VH;
    }
    public static int MxCsr_Mask$get(MemorySegment seg) {
        return (int)_XMM_SAVE_AREA32.MxCsr_Mask$VH.get(seg);
    }
    public static void MxCsr_Mask$set( MemorySegment seg, int x) {
        _XMM_SAVE_AREA32.MxCsr_Mask$VH.set(seg, x);
    }
    public static int MxCsr_Mask$get(MemorySegment seg, long index) {
        return (int)_XMM_SAVE_AREA32.MxCsr_Mask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MxCsr_Mask$set(MemorySegment seg, long index, int x) {
        _XMM_SAVE_AREA32.MxCsr_Mask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment FloatRegisters$slice(MemorySegment seg) {
        return seg.asSlice(32, 128);
    }
    public static MemorySegment XmmRegisters$slice(MemorySegment seg) {
        return seg.asSlice(160, 256);
    }
    public static MemorySegment Reserved4$slice(MemorySegment seg) {
        return seg.asSlice(416, 96);
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


