// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _CERT_POLICY_QUALIFIER_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("pszPolicyQualifierId"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("Qualifier")
    ).withName("_CERT_POLICY_QUALIFIER_INFO");
    public static MemoryLayout $LAYOUT() {
        return _CERT_POLICY_QUALIFIER_INFO.$struct$LAYOUT;
    }
    static final VarHandle pszPolicyQualifierId$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszPolicyQualifierId")));
    public static VarHandle pszPolicyQualifierId$VH() {
        return _CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH;
    }
    public static MemoryAddress pszPolicyQualifierId$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.get(seg);
    }
    public static void pszPolicyQualifierId$set( MemorySegment seg, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.set(seg, x);
    }
    public static MemoryAddress pszPolicyQualifierId$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszPolicyQualifierId$set(MemorySegment seg, long index, MemoryAddress x) {
        _CERT_POLICY_QUALIFIER_INFO.pszPolicyQualifierId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Qualifier$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
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


