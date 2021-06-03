// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagPDEXA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwndOwner"),
        C_POINTER.withName("hDevMode"),
        C_POINTER.withName("hDevNames"),
        C_POINTER.withName("hDC"),
        C_LONG.withName("Flags"),
        C_LONG.withName("Flags2"),
        C_LONG.withName("ExclusionFlags"),
        C_LONG.withName("nPageRanges"),
        C_LONG.withName("nMaxPageRanges"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpPageRanges"),
        C_LONG.withName("nMinPage"),
        C_LONG.withName("nMaxPage"),
        C_LONG.withName("nCopies"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hInstance"),
        C_POINTER.withName("lpPrintTemplateName"),
        C_POINTER.withName("lpCallback"),
        C_LONG.withName("nPropertyPages"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lphPropertyPages"),
        C_LONG.withName("nStartPage"),
        C_LONG.withName("dwResultAction")
    ).withName("tagPDEXA");
    public static MemoryLayout $LAYOUT() {
        return tagPDEXA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagPDEXA.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagPDEXA.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagPDEXA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagPDEXA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndOwner")));
    public static VarHandle hwndOwner$VH() {
        return tagPDEXA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevMode$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hDevMode")));
    public static VarHandle hDevMode$VH() {
        return tagPDEXA.hDevMode$VH;
    }
    public static MemoryAddress hDevMode$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hDevMode$VH.get(seg);
    }
    public static void hDevMode$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.hDevMode$VH.set(seg, x);
    }
    public static MemoryAddress hDevMode$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hDevMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevMode$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.hDevMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDevNames$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hDevNames")));
    public static VarHandle hDevNames$VH() {
        return tagPDEXA.hDevNames$VH;
    }
    public static MemoryAddress hDevNames$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hDevNames$VH.get(seg);
    }
    public static void hDevNames$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.hDevNames$VH.set(seg, x);
    }
    public static MemoryAddress hDevNames$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hDevNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDevNames$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.hDevNames$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hDC$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hDC")));
    public static VarHandle hDC$VH() {
        return tagPDEXA.hDC$VH;
    }
    public static MemoryAddress hDC$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hDC$VH.get(seg);
    }
    public static void hDC$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.hDC$VH.set(seg, x);
    }
    public static MemoryAddress hDC$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hDC$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hDC$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.hDC$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagPDEXA.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagPDEXA.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagPDEXA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagPDEXA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags2$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags2"));
    public static VarHandle Flags2$VH() {
        return tagPDEXA.Flags2$VH;
    }
    public static int Flags2$get(MemorySegment seg) {
        return (int)tagPDEXA.Flags2$VH.get(seg);
    }
    public static void Flags2$set( MemorySegment seg, int x) {
        tagPDEXA.Flags2$VH.set(seg, x);
    }
    public static int Flags2$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.Flags2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags2$set(MemorySegment seg, long index, int x) {
        tagPDEXA.Flags2$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ExclusionFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ExclusionFlags"));
    public static VarHandle ExclusionFlags$VH() {
        return tagPDEXA.ExclusionFlags$VH;
    }
    public static int ExclusionFlags$get(MemorySegment seg) {
        return (int)tagPDEXA.ExclusionFlags$VH.get(seg);
    }
    public static void ExclusionFlags$set( MemorySegment seg, int x) {
        tagPDEXA.ExclusionFlags$VH.set(seg, x);
    }
    public static int ExclusionFlags$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.ExclusionFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ExclusionFlags$set(MemorySegment seg, long index, int x) {
        tagPDEXA.ExclusionFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPageRanges$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nPageRanges"));
    public static VarHandle nPageRanges$VH() {
        return tagPDEXA.nPageRanges$VH;
    }
    public static int nPageRanges$get(MemorySegment seg) {
        return (int)tagPDEXA.nPageRanges$VH.get(seg);
    }
    public static void nPageRanges$set( MemorySegment seg, int x) {
        tagPDEXA.nPageRanges$VH.set(seg, x);
    }
    public static int nPageRanges$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nPageRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPageRanges$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nPageRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxPageRanges$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxPageRanges"));
    public static VarHandle nMaxPageRanges$VH() {
        return tagPDEXA.nMaxPageRanges$VH;
    }
    public static int nMaxPageRanges$get(MemorySegment seg) {
        return (int)tagPDEXA.nMaxPageRanges$VH.get(seg);
    }
    public static void nMaxPageRanges$set( MemorySegment seg, int x) {
        tagPDEXA.nMaxPageRanges$VH.set(seg, x);
    }
    public static int nMaxPageRanges$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nMaxPageRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxPageRanges$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nMaxPageRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpPageRanges$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpPageRanges")));
    public static VarHandle lpPageRanges$VH() {
        return tagPDEXA.lpPageRanges$VH;
    }
    public static MemoryAddress lpPageRanges$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lpPageRanges$VH.get(seg);
    }
    public static void lpPageRanges$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.lpPageRanges$VH.set(seg, x);
    }
    public static MemoryAddress lpPageRanges$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lpPageRanges$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpPageRanges$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.lpPageRanges$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMinPage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMinPage"));
    public static VarHandle nMinPage$VH() {
        return tagPDEXA.nMinPage$VH;
    }
    public static int nMinPage$get(MemorySegment seg) {
        return (int)tagPDEXA.nMinPage$VH.get(seg);
    }
    public static void nMinPage$set( MemorySegment seg, int x) {
        tagPDEXA.nMinPage$VH.set(seg, x);
    }
    public static int nMinPage$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nMinPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMinPage$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nMinPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxPage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxPage"));
    public static VarHandle nMaxPage$VH() {
        return tagPDEXA.nMaxPage$VH;
    }
    public static int nMaxPage$get(MemorySegment seg) {
        return (int)tagPDEXA.nMaxPage$VH.get(seg);
    }
    public static void nMaxPage$set( MemorySegment seg, int x) {
        tagPDEXA.nMaxPage$VH.set(seg, x);
    }
    public static int nMaxPage$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nMaxPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxPage$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nMaxPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nCopies$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nCopies"));
    public static VarHandle nCopies$VH() {
        return tagPDEXA.nCopies$VH;
    }
    public static int nCopies$get(MemorySegment seg) {
        return (int)tagPDEXA.nCopies$VH.get(seg);
    }
    public static void nCopies$set( MemorySegment seg, int x) {
        tagPDEXA.nCopies$VH.set(seg, x);
    }
    public static int nCopies$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nCopies$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nCopies$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nCopies$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hInstance")));
    public static VarHandle hInstance$VH() {
        return tagPDEXA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpPrintTemplateName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpPrintTemplateName")));
    public static VarHandle lpPrintTemplateName$VH() {
        return tagPDEXA.lpPrintTemplateName$VH;
    }
    public static MemoryAddress lpPrintTemplateName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lpPrintTemplateName$VH.get(seg);
    }
    public static void lpPrintTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.lpPrintTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpPrintTemplateName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lpPrintTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpPrintTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.lpPrintTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpCallback$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpCallback")));
    public static VarHandle lpCallback$VH() {
        return tagPDEXA.lpCallback$VH;
    }
    public static MemoryAddress lpCallback$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lpCallback$VH.get(seg);
    }
    public static void lpCallback$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.lpCallback$VH.set(seg, x);
    }
    public static MemoryAddress lpCallback$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lpCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.lpCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nPropertyPages$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nPropertyPages"));
    public static VarHandle nPropertyPages$VH() {
        return tagPDEXA.nPropertyPages$VH;
    }
    public static int nPropertyPages$get(MemorySegment seg) {
        return (int)tagPDEXA.nPropertyPages$VH.get(seg);
    }
    public static void nPropertyPages$set( MemorySegment seg, int x) {
        tagPDEXA.nPropertyPages$VH.set(seg, x);
    }
    public static int nPropertyPages$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nPropertyPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nPropertyPages$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nPropertyPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lphPropertyPages$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lphPropertyPages")));
    public static VarHandle lphPropertyPages$VH() {
        return tagPDEXA.lphPropertyPages$VH;
    }
    public static MemoryAddress lphPropertyPages$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lphPropertyPages$VH.get(seg);
    }
    public static void lphPropertyPages$set( MemorySegment seg, MemoryAddress x) {
        tagPDEXA.lphPropertyPages$VH.set(seg, x);
    }
    public static MemoryAddress lphPropertyPages$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagPDEXA.lphPropertyPages$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lphPropertyPages$set(MemorySegment seg, long index, MemoryAddress x) {
        tagPDEXA.lphPropertyPages$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nStartPage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nStartPage"));
    public static VarHandle nStartPage$VH() {
        return tagPDEXA.nStartPage$VH;
    }
    public static int nStartPage$get(MemorySegment seg) {
        return (int)tagPDEXA.nStartPage$VH.get(seg);
    }
    public static void nStartPage$set( MemorySegment seg, int x) {
        tagPDEXA.nStartPage$VH.set(seg, x);
    }
    public static int nStartPage$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.nStartPage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nStartPage$set(MemorySegment seg, long index, int x) {
        tagPDEXA.nStartPage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwResultAction$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwResultAction"));
    public static VarHandle dwResultAction$VH() {
        return tagPDEXA.dwResultAction$VH;
    }
    public static int dwResultAction$get(MemorySegment seg) {
        return (int)tagPDEXA.dwResultAction$VH.get(seg);
    }
    public static void dwResultAction$set( MemorySegment seg, int x) {
        tagPDEXA.dwResultAction$VH.set(seg, x);
    }
    public static int dwResultAction$get(MemorySegment seg, long index) {
        return (int)tagPDEXA.dwResultAction$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwResultAction$set(MemorySegment seg, long index, int x) {
        tagPDEXA.dwResultAction$VH.set(seg.asSlice(index*sizeof()), x);
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


