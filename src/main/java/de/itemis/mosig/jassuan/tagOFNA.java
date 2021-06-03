// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagOFNA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("hwndOwner"),
        C_POINTER.withName("hInstance"),
        C_POINTER.withName("lpstrFilter"),
        C_POINTER.withName("lpstrCustomFilter"),
        C_LONG.withName("nMaxCustFilter"),
        C_LONG.withName("nFilterIndex"),
        C_POINTER.withName("lpstrFile"),
        C_LONG.withName("nMaxFile"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrFileTitle"),
        C_LONG.withName("nMaxFileTitle"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrInitialDir"),
        C_POINTER.withName("lpstrTitle"),
        C_LONG.withName("Flags"),
        C_SHORT.withName("nFileOffset"),
        C_SHORT.withName("nFileExtension"),
        C_POINTER.withName("lpstrDefExt"),
        C_LONG_LONG.withName("lCustData"),
        C_POINTER.withName("lpfnHook"),
        C_POINTER.withName("lpTemplateName"),
        C_POINTER.withName("pvReserved"),
        C_LONG.withName("dwReserved"),
        C_LONG.withName("FlagsEx")
    ).withName("tagOFNA");
    public static MemoryLayout $LAYOUT() {
        return tagOFNA.$struct$LAYOUT;
    }
    static final VarHandle lStructSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("lStructSize"));
    public static VarHandle lStructSize$VH() {
        return tagOFNA.lStructSize$VH;
    }
    public static int lStructSize$get(MemorySegment seg) {
        return (int)tagOFNA.lStructSize$VH.get(seg);
    }
    public static void lStructSize$set( MemorySegment seg, int x) {
        tagOFNA.lStructSize$VH.set(seg, x);
    }
    public static int lStructSize$get(MemorySegment seg, long index) {
        return (int)tagOFNA.lStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lStructSize$set(MemorySegment seg, long index, int x) {
        tagOFNA.lStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndOwner")));
    public static VarHandle hwndOwner$VH() {
        return tagOFNA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hInstance")));
    public static VarHandle hInstance$VH() {
        return tagOFNA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFilter$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrFilter")));
    public static VarHandle lpstrFilter$VH() {
        return tagOFNA.lpstrFilter$VH;
    }
    public static MemoryAddress lpstrFilter$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrFilter$VH.get(seg);
    }
    public static void lpstrFilter$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrFilter$VH.set(seg, x);
    }
    public static MemoryAddress lpstrFilter$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFilter$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCustomFilter$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrCustomFilter")));
    public static VarHandle lpstrCustomFilter$VH() {
        return tagOFNA.lpstrCustomFilter$VH;
    }
    public static MemoryAddress lpstrCustomFilter$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrCustomFilter$VH.get(seg);
    }
    public static void lpstrCustomFilter$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrCustomFilter$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCustomFilter$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrCustomFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCustomFilter$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrCustomFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCustFilter$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxCustFilter"));
    public static VarHandle nMaxCustFilter$VH() {
        return tagOFNA.nMaxCustFilter$VH;
    }
    public static int nMaxCustFilter$get(MemorySegment seg) {
        return (int)tagOFNA.nMaxCustFilter$VH.get(seg);
    }
    public static void nMaxCustFilter$set( MemorySegment seg, int x) {
        tagOFNA.nMaxCustFilter$VH.set(seg, x);
    }
    public static int nMaxCustFilter$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nMaxCustFilter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCustFilter$set(MemorySegment seg, long index, int x) {
        tagOFNA.nMaxCustFilter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFilterIndex$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nFilterIndex"));
    public static VarHandle nFilterIndex$VH() {
        return tagOFNA.nFilterIndex$VH;
    }
    public static int nFilterIndex$get(MemorySegment seg) {
        return (int)tagOFNA.nFilterIndex$VH.get(seg);
    }
    public static void nFilterIndex$set( MemorySegment seg, int x) {
        tagOFNA.nFilterIndex$VH.set(seg, x);
    }
    public static int nFilterIndex$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nFilterIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFilterIndex$set(MemorySegment seg, long index, int x) {
        tagOFNA.nFilterIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFile$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrFile")));
    public static VarHandle lpstrFile$VH() {
        return tagOFNA.lpstrFile$VH;
    }
    public static MemoryAddress lpstrFile$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrFile$VH.get(seg);
    }
    public static void lpstrFile$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrFile$VH.set(seg, x);
    }
    public static MemoryAddress lpstrFile$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFile$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxFile$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxFile"));
    public static VarHandle nMaxFile$VH() {
        return tagOFNA.nMaxFile$VH;
    }
    public static int nMaxFile$get(MemorySegment seg) {
        return (int)tagOFNA.nMaxFile$VH.get(seg);
    }
    public static void nMaxFile$set( MemorySegment seg, int x) {
        tagOFNA.nMaxFile$VH.set(seg, x);
    }
    public static int nMaxFile$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nMaxFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxFile$set(MemorySegment seg, long index, int x) {
        tagOFNA.nMaxFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrFileTitle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrFileTitle")));
    public static VarHandle lpstrFileTitle$VH() {
        return tagOFNA.lpstrFileTitle$VH;
    }
    public static MemoryAddress lpstrFileTitle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrFileTitle$VH.get(seg);
    }
    public static void lpstrFileTitle$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrFileTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpstrFileTitle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrFileTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrFileTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrFileTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxFileTitle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxFileTitle"));
    public static VarHandle nMaxFileTitle$VH() {
        return tagOFNA.nMaxFileTitle$VH;
    }
    public static int nMaxFileTitle$get(MemorySegment seg) {
        return (int)tagOFNA.nMaxFileTitle$VH.get(seg);
    }
    public static void nMaxFileTitle$set( MemorySegment seg, int x) {
        tagOFNA.nMaxFileTitle$VH.set(seg, x);
    }
    public static int nMaxFileTitle$get(MemorySegment seg, long index) {
        return (int)tagOFNA.nMaxFileTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxFileTitle$set(MemorySegment seg, long index, int x) {
        tagOFNA.nMaxFileTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrInitialDir$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrInitialDir")));
    public static VarHandle lpstrInitialDir$VH() {
        return tagOFNA.lpstrInitialDir$VH;
    }
    public static MemoryAddress lpstrInitialDir$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrInitialDir$VH.get(seg);
    }
    public static void lpstrInitialDir$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrInitialDir$VH.set(seg, x);
    }
    public static MemoryAddress lpstrInitialDir$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrInitialDir$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrInitialDir$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrInitialDir$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrTitle")));
    public static VarHandle lpstrTitle$VH() {
        return tagOFNA.lpstrTitle$VH;
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrTitle$VH.get(seg);
    }
    public static void lpstrTitle$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Flags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Flags"));
    public static VarHandle Flags$VH() {
        return tagOFNA.Flags$VH;
    }
    public static int Flags$get(MemorySegment seg) {
        return (int)tagOFNA.Flags$VH.get(seg);
    }
    public static void Flags$set( MemorySegment seg, int x) {
        tagOFNA.Flags$VH.set(seg, x);
    }
    public static int Flags$get(MemorySegment seg, long index) {
        return (int)tagOFNA.Flags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Flags$set(MemorySegment seg, long index, int x) {
        tagOFNA.Flags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileOffset$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("nFileOffset"));
    public static VarHandle nFileOffset$VH() {
        return tagOFNA.nFileOffset$VH;
    }
    public static short nFileOffset$get(MemorySegment seg) {
        return (short)tagOFNA.nFileOffset$VH.get(seg);
    }
    public static void nFileOffset$set( MemorySegment seg, short x) {
        tagOFNA.nFileOffset$VH.set(seg, x);
    }
    public static short nFileOffset$get(MemorySegment seg, long index) {
        return (short)tagOFNA.nFileOffset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileOffset$set(MemorySegment seg, long index, short x) {
        tagOFNA.nFileOffset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nFileExtension$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("nFileExtension"));
    public static VarHandle nFileExtension$VH() {
        return tagOFNA.nFileExtension$VH;
    }
    public static short nFileExtension$get(MemorySegment seg) {
        return (short)tagOFNA.nFileExtension$VH.get(seg);
    }
    public static void nFileExtension$set( MemorySegment seg, short x) {
        tagOFNA.nFileExtension$VH.set(seg, x);
    }
    public static short nFileExtension$get(MemorySegment seg, long index) {
        return (short)tagOFNA.nFileExtension$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nFileExtension$set(MemorySegment seg, long index, short x) {
        tagOFNA.nFileExtension$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrDefExt$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrDefExt")));
    public static VarHandle lpstrDefExt$VH() {
        return tagOFNA.lpstrDefExt$VH;
    }
    public static MemoryAddress lpstrDefExt$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrDefExt$VH.get(seg);
    }
    public static void lpstrDefExt$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpstrDefExt$VH.set(seg, x);
    }
    public static MemoryAddress lpstrDefExt$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpstrDefExt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrDefExt$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpstrDefExt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lCustData$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lCustData"));
    public static VarHandle lCustData$VH() {
        return tagOFNA.lCustData$VH;
    }
    public static long lCustData$get(MemorySegment seg) {
        return (long)tagOFNA.lCustData$VH.get(seg);
    }
    public static void lCustData$set( MemorySegment seg, long x) {
        tagOFNA.lCustData$VH.set(seg, x);
    }
    public static long lCustData$get(MemorySegment seg, long index) {
        return (long)tagOFNA.lCustData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lCustData$set(MemorySegment seg, long index, long x) {
        tagOFNA.lCustData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnHook$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfnHook")));
    public static VarHandle lpfnHook$VH() {
        return tagOFNA.lpfnHook$VH;
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpfnHook$VH.get(seg);
    }
    public static void lpfnHook$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpfnHook$VH.set(seg, x);
    }
    public static MemoryAddress lpfnHook$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpfnHook$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnHook$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpfnHook$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOFNHOOKPROC lpfnHook (MemorySegment segment) {
        return LPOFNHOOKPROC.ofAddress(lpfnHook$get(segment));
    }
    static final VarHandle lpTemplateName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpTemplateName")));
    public static VarHandle lpTemplateName$VH() {
        return tagOFNA.lpTemplateName$VH;
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpTemplateName$VH.get(seg);
    }
    public static void lpTemplateName$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.lpTemplateName$VH.set(seg, x);
    }
    public static MemoryAddress lpTemplateName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.lpTemplateName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpTemplateName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.lpTemplateName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pvReserved$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvReserved")));
    public static VarHandle pvReserved$VH() {
        return tagOFNA.pvReserved$VH;
    }
    public static MemoryAddress pvReserved$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.pvReserved$VH.get(seg);
    }
    public static void pvReserved$set( MemorySegment seg, MemoryAddress x) {
        tagOFNA.pvReserved$VH.set(seg, x);
    }
    public static MemoryAddress pvReserved$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagOFNA.pvReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvReserved$set(MemorySegment seg, long index, MemoryAddress x) {
        tagOFNA.pvReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwReserved$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwReserved"));
    public static VarHandle dwReserved$VH() {
        return tagOFNA.dwReserved$VH;
    }
    public static int dwReserved$get(MemorySegment seg) {
        return (int)tagOFNA.dwReserved$VH.get(seg);
    }
    public static void dwReserved$set( MemorySegment seg, int x) {
        tagOFNA.dwReserved$VH.set(seg, x);
    }
    public static int dwReserved$get(MemorySegment seg, long index) {
        return (int)tagOFNA.dwReserved$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwReserved$set(MemorySegment seg, long index, int x) {
        tagOFNA.dwReserved$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle FlagsEx$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("FlagsEx"));
    public static VarHandle FlagsEx$VH() {
        return tagOFNA.FlagsEx$VH;
    }
    public static int FlagsEx$get(MemorySegment seg) {
        return (int)tagOFNA.FlagsEx$VH.get(seg);
    }
    public static void FlagsEx$set( MemorySegment seg, int x) {
        tagOFNA.FlagsEx$VH.set(seg, x);
    }
    public static int FlagsEx$get(MemorySegment seg, long index) {
        return (int)tagOFNA.FlagsEx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FlagsEx$set(MemorySegment seg, long index, int x) {
        tagOFNA.FlagsEx$VH.set(seg.asSlice(index*sizeof()), x);
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


