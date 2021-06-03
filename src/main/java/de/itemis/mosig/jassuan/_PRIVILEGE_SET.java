// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PRIVILEGE_SET {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("PrivilegeCount"),
        C_LONG.withName("Control"),
        MemoryLayout.sequenceLayout(1, MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("Luid"),
            C_LONG.withName("Attributes")
        ).withName("_LUID_AND_ATTRIBUTES")).withName("Privilege")
    ).withName("_PRIVILEGE_SET");
    public static MemoryLayout $LAYOUT() {
        return _PRIVILEGE_SET.$struct$LAYOUT;
    }
    static final VarHandle PrivilegeCount$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("PrivilegeCount"));
    public static VarHandle PrivilegeCount$VH() {
        return _PRIVILEGE_SET.PrivilegeCount$VH;
    }
    public static int PrivilegeCount$get(MemorySegment seg) {
        return (int)_PRIVILEGE_SET.PrivilegeCount$VH.get(seg);
    }
    public static void PrivilegeCount$set( MemorySegment seg, int x) {
        _PRIVILEGE_SET.PrivilegeCount$VH.set(seg, x);
    }
    public static int PrivilegeCount$get(MemorySegment seg, long index) {
        return (int)_PRIVILEGE_SET.PrivilegeCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void PrivilegeCount$set(MemorySegment seg, long index, int x) {
        _PRIVILEGE_SET.PrivilegeCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Control$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Control"));
    public static VarHandle Control$VH() {
        return _PRIVILEGE_SET.Control$VH;
    }
    public static int Control$get(MemorySegment seg) {
        return (int)_PRIVILEGE_SET.Control$VH.get(seg);
    }
    public static void Control$set( MemorySegment seg, int x) {
        _PRIVILEGE_SET.Control$VH.set(seg, x);
    }
    public static int Control$get(MemorySegment seg, long index) {
        return (int)_PRIVILEGE_SET.Control$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Control$set(MemorySegment seg, long index, int x) {
        _PRIVILEGE_SET.Control$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Privilege$slice(MemorySegment seg) {
        return seg.asSlice(8, 12);
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


