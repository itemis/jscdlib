// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagSOUNDSENTRYA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("cbSize"),
        C_LONG.withName("dwFlags"),
        C_LONG.withName("iFSTextEffect"),
        C_LONG.withName("iFSTextEffectMSec"),
        C_LONG.withName("iFSTextEffectColorBits"),
        C_LONG.withName("iFSGrafEffect"),
        C_LONG.withName("iFSGrafEffectMSec"),
        C_LONG.withName("iFSGrafEffectColor"),
        C_LONG.withName("iWindowsEffect"),
        C_LONG.withName("iWindowsEffectMSec"),
        C_POINTER.withName("lpszWindowsEffectDLL"),
        C_LONG.withName("iWindowsEffectOrdinal"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagSOUNDSENTRYA");
    public static MemoryLayout $LAYOUT() {
        return tagSOUNDSENTRYA.$struct$LAYOUT;
    }
    static final VarHandle cbSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cbSize"));
    public static VarHandle cbSize$VH() {
        return tagSOUNDSENTRYA.cbSize$VH;
    }
    public static int cbSize$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.cbSize$VH.get(seg);
    }
    public static void cbSize$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.cbSize$VH.set(seg, x);
    }
    public static int cbSize$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.cbSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cbSize$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.cbSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return tagSOUNDSENTRYA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSTextEffect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iFSTextEffect"));
    public static VarHandle iFSTextEffect$VH() {
        return tagSOUNDSENTRYA.iFSTextEffect$VH;
    }
    public static int iFSTextEffect$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iFSTextEffect$VH.get(seg);
    }
    public static void iFSTextEffect$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iFSTextEffect$VH.set(seg, x);
    }
    public static int iFSTextEffect$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iFSTextEffect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSTextEffect$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iFSTextEffect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSTextEffectMSec$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iFSTextEffectMSec"));
    public static VarHandle iFSTextEffectMSec$VH() {
        return tagSOUNDSENTRYA.iFSTextEffectMSec$VH;
    }
    public static int iFSTextEffectMSec$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iFSTextEffectMSec$VH.get(seg);
    }
    public static void iFSTextEffectMSec$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iFSTextEffectMSec$VH.set(seg, x);
    }
    public static int iFSTextEffectMSec$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iFSTextEffectMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSTextEffectMSec$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iFSTextEffectMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSTextEffectColorBits$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iFSTextEffectColorBits"));
    public static VarHandle iFSTextEffectColorBits$VH() {
        return tagSOUNDSENTRYA.iFSTextEffectColorBits$VH;
    }
    public static int iFSTextEffectColorBits$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iFSTextEffectColorBits$VH.get(seg);
    }
    public static void iFSTextEffectColorBits$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iFSTextEffectColorBits$VH.set(seg, x);
    }
    public static int iFSTextEffectColorBits$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iFSTextEffectColorBits$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSTextEffectColorBits$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iFSTextEffectColorBits$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSGrafEffect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iFSGrafEffect"));
    public static VarHandle iFSGrafEffect$VH() {
        return tagSOUNDSENTRYA.iFSGrafEffect$VH;
    }
    public static int iFSGrafEffect$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iFSGrafEffect$VH.get(seg);
    }
    public static void iFSGrafEffect$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iFSGrafEffect$VH.set(seg, x);
    }
    public static int iFSGrafEffect$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iFSGrafEffect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSGrafEffect$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iFSGrafEffect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSGrafEffectMSec$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iFSGrafEffectMSec"));
    public static VarHandle iFSGrafEffectMSec$VH() {
        return tagSOUNDSENTRYA.iFSGrafEffectMSec$VH;
    }
    public static int iFSGrafEffectMSec$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iFSGrafEffectMSec$VH.get(seg);
    }
    public static void iFSGrafEffectMSec$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iFSGrafEffectMSec$VH.set(seg, x);
    }
    public static int iFSGrafEffectMSec$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iFSGrafEffectMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSGrafEffectMSec$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iFSGrafEffectMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iFSGrafEffectColor$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iFSGrafEffectColor"));
    public static VarHandle iFSGrafEffectColor$VH() {
        return tagSOUNDSENTRYA.iFSGrafEffectColor$VH;
    }
    public static int iFSGrafEffectColor$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iFSGrafEffectColor$VH.get(seg);
    }
    public static void iFSGrafEffectColor$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iFSGrafEffectColor$VH.set(seg, x);
    }
    public static int iFSGrafEffectColor$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iFSGrafEffectColor$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iFSGrafEffectColor$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iFSGrafEffectColor$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWindowsEffect$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iWindowsEffect"));
    public static VarHandle iWindowsEffect$VH() {
        return tagSOUNDSENTRYA.iWindowsEffect$VH;
    }
    public static int iWindowsEffect$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iWindowsEffect$VH.get(seg);
    }
    public static void iWindowsEffect$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iWindowsEffect$VH.set(seg, x);
    }
    public static int iWindowsEffect$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iWindowsEffect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWindowsEffect$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iWindowsEffect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWindowsEffectMSec$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iWindowsEffectMSec"));
    public static VarHandle iWindowsEffectMSec$VH() {
        return tagSOUNDSENTRYA.iWindowsEffectMSec$VH;
    }
    public static int iWindowsEffectMSec$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iWindowsEffectMSec$VH.get(seg);
    }
    public static void iWindowsEffectMSec$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iWindowsEffectMSec$VH.set(seg, x);
    }
    public static int iWindowsEffectMSec$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iWindowsEffectMSec$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWindowsEffectMSec$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iWindowsEffectMSec$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszWindowsEffectDLL$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszWindowsEffectDLL")));
    public static VarHandle lpszWindowsEffectDLL$VH() {
        return tagSOUNDSENTRYA.lpszWindowsEffectDLL$VH;
    }
    public static MemoryAddress lpszWindowsEffectDLL$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagSOUNDSENTRYA.lpszWindowsEffectDLL$VH.get(seg);
    }
    public static void lpszWindowsEffectDLL$set( MemorySegment seg, MemoryAddress x) {
        tagSOUNDSENTRYA.lpszWindowsEffectDLL$VH.set(seg, x);
    }
    public static MemoryAddress lpszWindowsEffectDLL$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagSOUNDSENTRYA.lpszWindowsEffectDLL$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszWindowsEffectDLL$set(MemorySegment seg, long index, MemoryAddress x) {
        tagSOUNDSENTRYA.lpszWindowsEffectDLL$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle iWindowsEffectOrdinal$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iWindowsEffectOrdinal"));
    public static VarHandle iWindowsEffectOrdinal$VH() {
        return tagSOUNDSENTRYA.iWindowsEffectOrdinal$VH;
    }
    public static int iWindowsEffectOrdinal$get(MemorySegment seg) {
        return (int)tagSOUNDSENTRYA.iWindowsEffectOrdinal$VH.get(seg);
    }
    public static void iWindowsEffectOrdinal$set( MemorySegment seg, int x) {
        tagSOUNDSENTRYA.iWindowsEffectOrdinal$VH.set(seg, x);
    }
    public static int iWindowsEffectOrdinal$get(MemorySegment seg, long index) {
        return (int)tagSOUNDSENTRYA.iWindowsEffectOrdinal$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void iWindowsEffectOrdinal$set(MemorySegment seg, long index, int x) {
        tagSOUNDSENTRYA.iWindowsEffectOrdinal$VH.set(seg.asSlice(index*sizeof()), x);
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


