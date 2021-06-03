// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _SERVICE_NOTIFYA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwVersion"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pfnNotifyCallback"),
        C_POINTER.withName("pContext"),
        C_LONG.withName("dwNotificationStatus"),
        MemoryLayout.structLayout(
            C_LONG.withName("dwServiceType"),
            C_LONG.withName("dwCurrentState"),
            C_LONG.withName("dwControlsAccepted"),
            C_LONG.withName("dwWin32ExitCode"),
            C_LONG.withName("dwServiceSpecificExitCode"),
            C_LONG.withName("dwCheckPoint"),
            C_LONG.withName("dwWaitHint"),
            C_LONG.withName("dwProcessId"),
            C_LONG.withName("dwServiceFlags")
        ).withName("ServiceStatus"),
        C_LONG.withName("dwNotificationTriggered"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("pszServiceNames")
    ).withName("_SERVICE_NOTIFYA");
    public static MemoryLayout $LAYOUT() {
        return _SERVICE_NOTIFYA.$struct$LAYOUT;
    }
    static final VarHandle dwVersion$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwVersion"));
    public static VarHandle dwVersion$VH() {
        return _SERVICE_NOTIFYA.dwVersion$VH;
    }
    public static int dwVersion$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFYA.dwVersion$VH.get(seg);
    }
    public static void dwVersion$set( MemorySegment seg, int x) {
        _SERVICE_NOTIFYA.dwVersion$VH.set(seg, x);
    }
    public static int dwVersion$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFYA.dwVersion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwVersion$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFYA.dwVersion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pfnNotifyCallback$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pfnNotifyCallback")));
    public static VarHandle pfnNotifyCallback$VH() {
        return _SERVICE_NOTIFYA.pfnNotifyCallback$VH;
    }
    public static MemoryAddress pfnNotifyCallback$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_NOTIFYA.pfnNotifyCallback$VH.get(seg);
    }
    public static void pfnNotifyCallback$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_NOTIFYA.pfnNotifyCallback$VH.set(seg, x);
    }
    public static MemoryAddress pfnNotifyCallback$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_NOTIFYA.pfnNotifyCallback$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pfnNotifyCallback$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_NOTIFYA.pfnNotifyCallback$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static PFN_SC_NOTIFY_CALLBACK pfnNotifyCallback (MemorySegment segment) {
        return PFN_SC_NOTIFY_CALLBACK.ofAddress(pfnNotifyCallback$get(segment));
    }
    static final VarHandle pContext$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pContext")));
    public static VarHandle pContext$VH() {
        return _SERVICE_NOTIFYA.pContext$VH;
    }
    public static MemoryAddress pContext$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_NOTIFYA.pContext$VH.get(seg);
    }
    public static void pContext$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_NOTIFYA.pContext$VH.set(seg, x);
    }
    public static MemoryAddress pContext$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_NOTIFYA.pContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pContext$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_NOTIFYA.pContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwNotificationStatus$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNotificationStatus"));
    public static VarHandle dwNotificationStatus$VH() {
        return _SERVICE_NOTIFYA.dwNotificationStatus$VH;
    }
    public static int dwNotificationStatus$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFYA.dwNotificationStatus$VH.get(seg);
    }
    public static void dwNotificationStatus$set( MemorySegment seg, int x) {
        _SERVICE_NOTIFYA.dwNotificationStatus$VH.set(seg, x);
    }
    public static int dwNotificationStatus$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFYA.dwNotificationStatus$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNotificationStatus$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFYA.dwNotificationStatus$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ServiceStatus$slice(MemorySegment seg) {
        return seg.asSlice(28, 36);
    }
    static final VarHandle dwNotificationTriggered$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwNotificationTriggered"));
    public static VarHandle dwNotificationTriggered$VH() {
        return _SERVICE_NOTIFYA.dwNotificationTriggered$VH;
    }
    public static int dwNotificationTriggered$get(MemorySegment seg) {
        return (int)_SERVICE_NOTIFYA.dwNotificationTriggered$VH.get(seg);
    }
    public static void dwNotificationTriggered$set( MemorySegment seg, int x) {
        _SERVICE_NOTIFYA.dwNotificationTriggered$VH.set(seg, x);
    }
    public static int dwNotificationTriggered$get(MemorySegment seg, long index) {
        return (int)_SERVICE_NOTIFYA.dwNotificationTriggered$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwNotificationTriggered$set(MemorySegment seg, long index, int x) {
        _SERVICE_NOTIFYA.dwNotificationTriggered$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pszServiceNames$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pszServiceNames")));
    public static VarHandle pszServiceNames$VH() {
        return _SERVICE_NOTIFYA.pszServiceNames$VH;
    }
    public static MemoryAddress pszServiceNames$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_NOTIFYA.pszServiceNames$VH.get(seg);
    }
    public static void pszServiceNames$set( MemorySegment seg, MemoryAddress x) {
        _SERVICE_NOTIFYA.pszServiceNames$VH.set(seg, x);
    }
    public static MemoryAddress pszServiceNames$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_SERVICE_NOTIFYA.pszServiceNames$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pszServiceNames$set(MemorySegment seg, long index, MemoryAddress x) {
        _SERVICE_NOTIFYA.pszServiceNames$VH.set(seg.asSlice(index*sizeof()), x);
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


