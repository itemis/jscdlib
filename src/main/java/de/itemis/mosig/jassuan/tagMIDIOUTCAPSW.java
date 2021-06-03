// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagMIDIOUTCAPSW {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_SHORT.withName("wMid"),
        C_SHORT.withName("wPid"),
        C_INT.withName("vDriverVersion"),
        MemoryLayout.sequenceLayout(32, C_SHORT).withName("szPname"),
        C_SHORT.withName("wTechnology"),
        C_SHORT.withName("wVoices"),
        C_SHORT.withName("wNotes"),
        C_SHORT.withName("wChannelMask"),
        C_LONG.withName("dwSupport")
    ).withName("tagMIDIOUTCAPSW");
    public static MemoryLayout $LAYOUT() {
        return tagMIDIOUTCAPSW.$struct$LAYOUT;
    }
    static final VarHandle wMid$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wMid"));
    public static VarHandle wMid$VH() {
        return tagMIDIOUTCAPSW.wMid$VH;
    }
    public static short wMid$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSW.wMid$VH.get(seg);
    }
    public static void wMid$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSW.wMid$VH.set(seg, x);
    }
    public static short wMid$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSW.wMid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wMid$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSW.wMid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wPid$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wPid"));
    public static VarHandle wPid$VH() {
        return tagMIDIOUTCAPSW.wPid$VH;
    }
    public static short wPid$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSW.wPid$VH.get(seg);
    }
    public static void wPid$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSW.wPid$VH.set(seg, x);
    }
    public static short wPid$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSW.wPid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wPid$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSW.wPid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle vDriverVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("vDriverVersion"));
    public static VarHandle vDriverVersion$VH() {
        return tagMIDIOUTCAPSW.vDriverVersion$VH;
    }
    public static int vDriverVersion$get(MemorySegment seg) {
        return (int)tagMIDIOUTCAPSW.vDriverVersion$VH.get(seg);
    }
    public static void vDriverVersion$set( MemorySegment seg, int x) {
        tagMIDIOUTCAPSW.vDriverVersion$VH.set(seg, x);
    }
    public static int vDriverVersion$get(MemorySegment seg, long index) {
        return (int)tagMIDIOUTCAPSW.vDriverVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void vDriverVersion$set(MemorySegment seg, long index, int x) {
        tagMIDIOUTCAPSW.vDriverVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment szPname$slice(MemorySegment seg) {
        return seg.asSlice(8, 64);
    }
    static final VarHandle wTechnology$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wTechnology"));
    public static VarHandle wTechnology$VH() {
        return tagMIDIOUTCAPSW.wTechnology$VH;
    }
    public static short wTechnology$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSW.wTechnology$VH.get(seg);
    }
    public static void wTechnology$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSW.wTechnology$VH.set(seg, x);
    }
    public static short wTechnology$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSW.wTechnology$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wTechnology$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSW.wTechnology$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wVoices$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wVoices"));
    public static VarHandle wVoices$VH() {
        return tagMIDIOUTCAPSW.wVoices$VH;
    }
    public static short wVoices$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSW.wVoices$VH.get(seg);
    }
    public static void wVoices$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSW.wVoices$VH.set(seg, x);
    }
    public static short wVoices$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSW.wVoices$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wVoices$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSW.wVoices$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wNotes$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wNotes"));
    public static VarHandle wNotes$VH() {
        return tagMIDIOUTCAPSW.wNotes$VH;
    }
    public static short wNotes$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSW.wNotes$VH.get(seg);
    }
    public static void wNotes$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSW.wNotes$VH.set(seg, x);
    }
    public static short wNotes$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSW.wNotes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wNotes$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSW.wNotes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle wChannelMask$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("wChannelMask"));
    public static VarHandle wChannelMask$VH() {
        return tagMIDIOUTCAPSW.wChannelMask$VH;
    }
    public static short wChannelMask$get(MemorySegment seg) {
        return (short)tagMIDIOUTCAPSW.wChannelMask$VH.get(seg);
    }
    public static void wChannelMask$set( MemorySegment seg, short x) {
        tagMIDIOUTCAPSW.wChannelMask$VH.set(seg, x);
    }
    public static short wChannelMask$get(MemorySegment seg, long index) {
        return (short)tagMIDIOUTCAPSW.wChannelMask$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wChannelMask$set(MemorySegment seg, long index, short x) {
        tagMIDIOUTCAPSW.wChannelMask$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwSupport$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwSupport"));
    public static VarHandle dwSupport$VH() {
        return tagMIDIOUTCAPSW.dwSupport$VH;
    }
    public static int dwSupport$get(MemorySegment seg) {
        return (int)tagMIDIOUTCAPSW.dwSupport$VH.get(seg);
    }
    public static void dwSupport$set( MemorySegment seg, int x) {
        tagMIDIOUTCAPSW.dwSupport$VH.set(seg, x);
    }
    public static int dwSupport$get(MemorySegment seg, long index) {
        return (int)tagMIDIOUTCAPSW.dwSupport$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwSupport$set(MemorySegment seg, long index, int x) {
        tagMIDIOUTCAPSW.dwSupport$VH.set(seg.asSlice(index*sizeof()), x);
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


