// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class RPC_BINDING_HANDLE_SECURITY {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Version"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("ServerPrincName"),
        C_LONG.withName("AuthnLevel"),
        C_LONG.withName("AuthnSvc"),
        C_POINTER.withName("AuthIdentity"),
        C_POINTER.withName("SecurityQos")
    );
    public static MemoryLayout $LAYOUT() {
        return RPC_BINDING_HANDLE_SECURITY.$struct$LAYOUT;
    }
    static final VarHandle Version$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Version"));
    public static VarHandle Version$VH() {
        return RPC_BINDING_HANDLE_SECURITY.Version$VH;
    }
    public static int Version$get(MemorySegment seg) {
        return (int)RPC_BINDING_HANDLE_SECURITY.Version$VH.get(seg);
    }
    public static void Version$set( MemorySegment seg, int x) {
        RPC_BINDING_HANDLE_SECURITY.Version$VH.set(seg, x);
    }
    public static int Version$get(MemorySegment seg, long index) {
        return (int)RPC_BINDING_HANDLE_SECURITY.Version$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Version$set(MemorySegment seg, long index, int x) {
        RPC_BINDING_HANDLE_SECURITY.Version$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ServerPrincName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ServerPrincName")));
    public static VarHandle ServerPrincName$VH() {
        return RPC_BINDING_HANDLE_SECURITY.ServerPrincName$VH;
    }
    public static MemoryAddress ServerPrincName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)RPC_BINDING_HANDLE_SECURITY.ServerPrincName$VH.get(seg);
    }
    public static void ServerPrincName$set( MemorySegment seg, MemoryAddress x) {
        RPC_BINDING_HANDLE_SECURITY.ServerPrincName$VH.set(seg, x);
    }
    public static MemoryAddress ServerPrincName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)RPC_BINDING_HANDLE_SECURITY.ServerPrincName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ServerPrincName$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_BINDING_HANDLE_SECURITY.ServerPrincName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthnLevel$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("AuthnLevel"));
    public static VarHandle AuthnLevel$VH() {
        return RPC_BINDING_HANDLE_SECURITY.AuthnLevel$VH;
    }
    public static int AuthnLevel$get(MemorySegment seg) {
        return (int)RPC_BINDING_HANDLE_SECURITY.AuthnLevel$VH.get(seg);
    }
    public static void AuthnLevel$set( MemorySegment seg, int x) {
        RPC_BINDING_HANDLE_SECURITY.AuthnLevel$VH.set(seg, x);
    }
    public static int AuthnLevel$get(MemorySegment seg, long index) {
        return (int)RPC_BINDING_HANDLE_SECURITY.AuthnLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthnLevel$set(MemorySegment seg, long index, int x) {
        RPC_BINDING_HANDLE_SECURITY.AuthnLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthnSvc$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("AuthnSvc"));
    public static VarHandle AuthnSvc$VH() {
        return RPC_BINDING_HANDLE_SECURITY.AuthnSvc$VH;
    }
    public static int AuthnSvc$get(MemorySegment seg) {
        return (int)RPC_BINDING_HANDLE_SECURITY.AuthnSvc$VH.get(seg);
    }
    public static void AuthnSvc$set( MemorySegment seg, int x) {
        RPC_BINDING_HANDLE_SECURITY.AuthnSvc$VH.set(seg, x);
    }
    public static int AuthnSvc$get(MemorySegment seg, long index) {
        return (int)RPC_BINDING_HANDLE_SECURITY.AuthnSvc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthnSvc$set(MemorySegment seg, long index, int x) {
        RPC_BINDING_HANDLE_SECURITY.AuthnSvc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle AuthIdentity$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AuthIdentity")));
    public static VarHandle AuthIdentity$VH() {
        return RPC_BINDING_HANDLE_SECURITY.AuthIdentity$VH;
    }
    public static MemoryAddress AuthIdentity$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)RPC_BINDING_HANDLE_SECURITY.AuthIdentity$VH.get(seg);
    }
    public static void AuthIdentity$set( MemorySegment seg, MemoryAddress x) {
        RPC_BINDING_HANDLE_SECURITY.AuthIdentity$VH.set(seg, x);
    }
    public static MemoryAddress AuthIdentity$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)RPC_BINDING_HANDLE_SECURITY.AuthIdentity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AuthIdentity$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_BINDING_HANDLE_SECURITY.AuthIdentity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle SecurityQos$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SecurityQos")));
    public static VarHandle SecurityQos$VH() {
        return RPC_BINDING_HANDLE_SECURITY.SecurityQos$VH;
    }
    public static MemoryAddress SecurityQos$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)RPC_BINDING_HANDLE_SECURITY.SecurityQos$VH.get(seg);
    }
    public static void SecurityQos$set( MemorySegment seg, MemoryAddress x) {
        RPC_BINDING_HANDLE_SECURITY.SecurityQos$VH.set(seg, x);
    }
    public static MemoryAddress SecurityQos$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)RPC_BINDING_HANDLE_SECURITY.SecurityQos$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SecurityQos$set(MemorySegment seg, long index, MemoryAddress x) {
        RPC_BINDING_HANDLE_SECURITY.SecurityQos$VH.set(seg.asSlice(index*sizeof()), x);
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


