// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _ACL_REVISION_INFORMATION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("AclRevision")
    ).withName("_ACL_REVISION_INFORMATION");
    public static MemoryLayout $LAYOUT() {
        return _ACL_REVISION_INFORMATION.$struct$LAYOUT;
    }
    static final VarHandle AclRevision$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("AclRevision"));
    public static VarHandle AclRevision$VH() {
        return _ACL_REVISION_INFORMATION.AclRevision$VH;
    }
    public static int AclRevision$get(MemorySegment seg) {
        return (int)_ACL_REVISION_INFORMATION.AclRevision$VH.get(seg);
    }
    public static void AclRevision$set( MemorySegment seg, int x) {
        _ACL_REVISION_INFORMATION.AclRevision$VH.set(seg, x);
    }
    public static int AclRevision$get(MemorySegment seg, long index) {
        return (int)_ACL_REVISION_INFORMATION.AclRevision$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AclRevision$set(MemorySegment seg, long index, int x) {
        _ACL_REVISION_INFORMATION.AclRevision$VH.set(seg.asSlice(index*sizeof()), x);
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


