// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class __NCRYPT_UI_POLICY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        C_LONG.withName("dwFlags"),
        C_POINTER.withName("pszCreationTitle"),
        C_POINTER.withName("pszFriendlyName"),
        C_POINTER.withName("pszDescription")
    ).withName("__NCRYPT_UI_POLICY");
    public static MemoryLayout $LAYOUT() {
        return __NCRYPT_UI_POLICY.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return __NCRYPT_UI_POLICY.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)__NCRYPT_UI_POLICY.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        __NCRYPT_UI_POLICY.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_UI_POLICY.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        __NCRYPT_UI_POLICY.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return __NCRYPT_UI_POLICY.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)__NCRYPT_UI_POLICY.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        __NCRYPT_UI_POLICY.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)__NCRYPT_UI_POLICY.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        __NCRYPT_UI_POLICY.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszCreationTitle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszCreationTitle")));
    public static VarHandle pszCreationTitle$VH() {
        return __NCRYPT_UI_POLICY.pszCreationTitle$VH;
    }
    public static MemoryAddress pszCreationTitle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__NCRYPT_UI_POLICY.pszCreationTitle$VH.get(seg);
    }
    public static void pszCreationTitle$set( MemorySegment seg, MemoryAddress x) {
        __NCRYPT_UI_POLICY.pszCreationTitle$VH.set(seg, x);
    }
    public static MemoryAddress pszCreationTitle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__NCRYPT_UI_POLICY.pszCreationTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszCreationTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        __NCRYPT_UI_POLICY.pszCreationTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszFriendlyName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszFriendlyName")));
    public static VarHandle pszFriendlyName$VH() {
        return __NCRYPT_UI_POLICY.pszFriendlyName$VH;
    }
    public static MemoryAddress pszFriendlyName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__NCRYPT_UI_POLICY.pszFriendlyName$VH.get(seg);
    }
    public static void pszFriendlyName$set( MemorySegment seg, MemoryAddress x) {
        __NCRYPT_UI_POLICY.pszFriendlyName$VH.set(seg, x);
    }
    public static MemoryAddress pszFriendlyName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__NCRYPT_UI_POLICY.pszFriendlyName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszFriendlyName$set(MemorySegment seg, long index, MemoryAddress x) {
        __NCRYPT_UI_POLICY.pszFriendlyName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszDescription$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszDescription")));
    public static VarHandle pszDescription$VH() {
        return __NCRYPT_UI_POLICY.pszDescription$VH;
    }
    public static MemoryAddress pszDescription$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)__NCRYPT_UI_POLICY.pszDescription$VH.get(seg);
    }
    public static void pszDescription$set( MemorySegment seg, MemoryAddress x) {
        __NCRYPT_UI_POLICY.pszDescription$VH.set(seg, x);
    }
    public static MemoryAddress pszDescription$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)__NCRYPT_UI_POLICY.pszDescription$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszDescription$set(MemorySegment seg, long index, MemoryAddress x) {
        __NCRYPT_UI_POLICY.pszDescription$VH.set(seg.asSlice(index*sizeof()), x);
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


