// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class tagCREATESTRUCTA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("lpCreateParams"),
        C_POINTER.withName("hInstance"),
        C_POINTER.withName("hMenu"),
        C_POINTER.withName("hwndParent"),
        C_INT.withName("cy"),
        C_INT.withName("cx"),
        C_INT.withName("y"),
        C_INT.withName("x"),
        C_LONG.withName("style"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpszName"),
        C_POINTER.withName("lpszClass"),
        C_LONG.withName("dwExStyle"),
        MemoryLayout.paddingLayout(32)
    ).withName("tagCREATESTRUCTA");
    public static MemoryLayout $LAYOUT() {
        return tagCREATESTRUCTA.$struct$LAYOUT;
    }
    static final VarHandle lpCreateParams$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpCreateParams")));
    public static VarHandle lpCreateParams$VH() {
        return tagCREATESTRUCTA.lpCreateParams$VH;
    }
    public static MemoryAddress lpCreateParams$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.lpCreateParams$VH.get(seg);
    }
    public static void lpCreateParams$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTA.lpCreateParams$VH.set(seg, x);
    }
    public static MemoryAddress lpCreateParams$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.lpCreateParams$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpCreateParams$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTA.lpCreateParams$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hInstance$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hInstance")));
    public static VarHandle hInstance$VH() {
        return tagCREATESTRUCTA.hInstance$VH;
    }
    public static MemoryAddress hInstance$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.hInstance$VH.get(seg);
    }
    public static void hInstance$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTA.hInstance$VH.set(seg, x);
    }
    public static MemoryAddress hInstance$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.hInstance$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hInstance$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTA.hInstance$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hMenu$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hMenu")));
    public static VarHandle hMenu$VH() {
        return tagCREATESTRUCTA.hMenu$VH;
    }
    public static MemoryAddress hMenu$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.hMenu$VH.get(seg);
    }
    public static void hMenu$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTA.hMenu$VH.set(seg, x);
    }
    public static MemoryAddress hMenu$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.hMenu$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hMenu$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTA.hMenu$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndParent$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndParent")));
    public static VarHandle hwndParent$VH() {
        return tagCREATESTRUCTA.hwndParent$VH;
    }
    public static MemoryAddress hwndParent$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.hwndParent$VH.get(seg);
    }
    public static void hwndParent$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTA.hwndParent$VH.set(seg, x);
    }
    public static MemoryAddress hwndParent$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.hwndParent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndParent$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTA.hwndParent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cy$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cy"));
    public static VarHandle cy$VH() {
        return tagCREATESTRUCTA.cy$VH;
    }
    public static int cy$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTA.cy$VH.get(seg);
    }
    public static void cy$set( MemorySegment seg, int x) {
        tagCREATESTRUCTA.cy$VH.set(seg, x);
    }
    public static int cy$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTA.cy$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cy$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTA.cy$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle cx$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cx"));
    public static VarHandle cx$VH() {
        return tagCREATESTRUCTA.cx$VH;
    }
    public static int cx$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTA.cx$VH.get(seg);
    }
    public static void cx$set( MemorySegment seg, int x) {
        tagCREATESTRUCTA.cx$VH.set(seg, x);
    }
    public static int cx$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTA.cx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cx$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTA.cx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return tagCREATESTRUCTA.y$VH;
    }
    public static int y$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTA.y$VH.get(seg);
    }
    public static void y$set( MemorySegment seg, int x) {
        tagCREATESTRUCTA.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTA.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTA.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return tagCREATESTRUCTA.x$VH;
    }
    public static int x$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTA.x$VH.get(seg);
    }
    public static void x$set( MemorySegment seg, int x) {
        tagCREATESTRUCTA.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTA.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTA.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle style$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("style"));
    public static VarHandle style$VH() {
        return tagCREATESTRUCTA.style$VH;
    }
    public static int style$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTA.style$VH.get(seg);
    }
    public static void style$set( MemorySegment seg, int x) {
        tagCREATESTRUCTA.style$VH.set(seg, x);
    }
    public static int style$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTA.style$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void style$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTA.style$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszName")));
    public static VarHandle lpszName$VH() {
        return tagCREATESTRUCTA.lpszName$VH;
    }
    public static MemoryAddress lpszName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.lpszName$VH.get(seg);
    }
    public static void lpszName$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTA.lpszName$VH.set(seg, x);
    }
    public static MemoryAddress lpszName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.lpszName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszName$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTA.lpszName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpszClass$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpszClass")));
    public static VarHandle lpszClass$VH() {
        return tagCREATESTRUCTA.lpszClass$VH;
    }
    public static MemoryAddress lpszClass$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.lpszClass$VH.get(seg);
    }
    public static void lpszClass$set( MemorySegment seg, MemoryAddress x) {
        tagCREATESTRUCTA.lpszClass$VH.set(seg, x);
    }
    public static MemoryAddress lpszClass$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)tagCREATESTRUCTA.lpszClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpszClass$set(MemorySegment seg, long index, MemoryAddress x) {
        tagCREATESTRUCTA.lpszClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwExStyle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwExStyle"));
    public static VarHandle dwExStyle$VH() {
        return tagCREATESTRUCTA.dwExStyle$VH;
    }
    public static int dwExStyle$get(MemorySegment seg) {
        return (int)tagCREATESTRUCTA.dwExStyle$VH.get(seg);
    }
    public static void dwExStyle$set( MemorySegment seg, int x) {
        tagCREATESTRUCTA.dwExStyle$VH.set(seg, x);
    }
    public static int dwExStyle$get(MemorySegment seg, long index) {
        return (int)tagCREATESTRUCTA.dwExStyle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwExStyle$set(MemorySegment seg, long index, int x) {
        tagCREATESTRUCTA.dwExStyle$VH.set(seg.asSlice(index*sizeof()), x);
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


