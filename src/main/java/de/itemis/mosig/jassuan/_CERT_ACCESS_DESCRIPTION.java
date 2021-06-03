// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_ACCESS_DESCRIPTION {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pszAccessMethod"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwAltNameChoice"),
            MemoryLayout.paddingLayout(32),
            MemoryLayout.unionLayout(
                C_POINTER.withName("pOtherName"),
                C_POINTER.withName("pwszRfc822Name"),
                C_POINTER.withName("pwszDNSName"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pbData")
                ).withName("DirectoryName"),
                C_POINTER.withName("pwszURL"),
                MemoryLayout.structLayout(
                    C_LONG.withName("cbData"),
                    MemoryLayout.paddingLayout(32),
                    C_POINTER.withName("pbData")
                ).withName("IPAddress"),
                C_POINTER.withName("pszRegisteredID")
            ).withName("$anon$0")
        ).withName("AccessLocation")
    ).withName("_CERT_ACCESS_DESCRIPTION");
    public static MemoryLayout $LAYOUT() {
        return _CERT_ACCESS_DESCRIPTION.$struct$LAYOUT;
    }
    static final VarHandle pszAccessMethod$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszAccessMethod")));
    public static VarHandle pszAccessMethod$VH() {
        return _CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH;
    }
    public static MemoryAddress pszAccessMethod$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.get(seg);
    }
    public static void pszAccessMethod$set( MemorySegment seg, MemoryAddress x) {
        _CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.set(seg, x);
    }
    public static MemoryAddress pszAccessMethod$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszAccessMethod$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_ACCESS_DESCRIPTION.pszAccessMethod$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment AccessLocation$slice(MemorySegment seg) {
        return seg.asSlice(8, 24);
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


