// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class OPENCARDNAME_EXA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwStructSize"),
        MemoryLayout.paddingLayout(32),
        C_LONG_LONG.withName("hSCardContext"),
        C_POINTER.withName("hwndOwner"),
        C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrTitle"),
        C_POINTER.withName("lpstrSearchDesc"),
        C_POINTER.withName("hIcon"),
        C_POINTER.withName("pOpenCardSearchCriteria"),
        C_POINTER.withName("lpfnConnect"),
        C_POINTER.withName("pvUserData"),
        C_LONG.withName("dwShareMode"),
        C_LONG.withName("dwPreferredProtocols"),
        C_POINTER.withName("lpstrRdr"),
        C_LONG.withName("nMaxRdr"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("lpstrCard"),
        C_LONG.withName("nMaxCard"),
        C_LONG.withName("dwActiveProtocol"),
        C_LONG_LONG.withName("hCardHandle")
    );
    public static MemoryLayout $LAYOUT() {
        return OPENCARDNAME_EXA.$struct$LAYOUT;
    }
    static final VarHandle dwStructSize$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwStructSize"));
    public static VarHandle dwStructSize$VH() {
        return OPENCARDNAME_EXA.dwStructSize$VH;
    }
    public static int dwStructSize$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.dwStructSize$VH.get(seg);
    }
    public static void dwStructSize$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.dwStructSize$VH.set(seg, x);
    }
    public static int dwStructSize$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.dwStructSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwStructSize$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.dwStructSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hSCardContext$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hSCardContext"));
    public static VarHandle hSCardContext$VH() {
        return OPENCARDNAME_EXA.hSCardContext$VH;
    }
    public static long hSCardContext$get(MemorySegment seg) {
        return (long)OPENCARDNAME_EXA.hSCardContext$VH.get(seg);
    }
    public static void hSCardContext$set( MemorySegment seg, long x) {
        OPENCARDNAME_EXA.hSCardContext$VH.set(seg, x);
    }
    public static long hSCardContext$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAME_EXA.hSCardContext$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hSCardContext$set(MemorySegment seg, long index, long x) {
        OPENCARDNAME_EXA.hSCardContext$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hwndOwner$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hwndOwner")));
    public static VarHandle hwndOwner$VH() {
        return OPENCARDNAME_EXA.hwndOwner$VH;
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.hwndOwner$VH.get(seg);
    }
    public static void hwndOwner$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.hwndOwner$VH.set(seg, x);
    }
    public static MemoryAddress hwndOwner$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.hwndOwner$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hwndOwner$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.hwndOwner$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwFlags$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwFlags"));
    public static VarHandle dwFlags$VH() {
        return OPENCARDNAME_EXA.dwFlags$VH;
    }
    public static int dwFlags$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.dwFlags$VH.get(seg);
    }
    public static void dwFlags$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.dwFlags$VH.set(seg, x);
    }
    public static int dwFlags$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.dwFlags$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwFlags$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.dwFlags$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrTitle$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrTitle")));
    public static VarHandle lpstrTitle$VH() {
        return OPENCARDNAME_EXA.lpstrTitle$VH;
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrTitle$VH.get(seg);
    }
    public static void lpstrTitle$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrTitle$VH.set(seg, x);
    }
    public static MemoryAddress lpstrTitle$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrTitle$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrSearchDesc$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrSearchDesc")));
    public static VarHandle lpstrSearchDesc$VH() {
        return OPENCARDNAME_EXA.lpstrSearchDesc$VH;
    }
    public static MemoryAddress lpstrSearchDesc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrSearchDesc$VH.get(seg);
    }
    public static void lpstrSearchDesc$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrSearchDesc$VH.set(seg, x);
    }
    public static MemoryAddress lpstrSearchDesc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrSearchDesc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrSearchDesc$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrSearchDesc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hIcon$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hIcon")));
    public static VarHandle hIcon$VH() {
        return OPENCARDNAME_EXA.hIcon$VH;
    }
    public static MemoryAddress hIcon$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.hIcon$VH.get(seg);
    }
    public static void hIcon$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.hIcon$VH.set(seg, x);
    }
    public static MemoryAddress hIcon$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.hIcon$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hIcon$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.hIcon$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle pOpenCardSearchCriteria$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pOpenCardSearchCriteria")));
    public static VarHandle pOpenCardSearchCriteria$VH() {
        return OPENCARDNAME_EXA.pOpenCardSearchCriteria$VH;
    }
    public static MemoryAddress pOpenCardSearchCriteria$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.pOpenCardSearchCriteria$VH.get(seg);
    }
    public static void pOpenCardSearchCriteria$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.pOpenCardSearchCriteria$VH.set(seg, x);
    }
    public static MemoryAddress pOpenCardSearchCriteria$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.pOpenCardSearchCriteria$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pOpenCardSearchCriteria$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.pOpenCardSearchCriteria$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpfnConnect$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpfnConnect")));
    public static VarHandle lpfnConnect$VH() {
        return OPENCARDNAME_EXA.lpfnConnect$VH;
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpfnConnect$VH.get(seg);
    }
    public static void lpfnConnect$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.lpfnConnect$VH.set(seg, x);
    }
    public static MemoryAddress lpfnConnect$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpfnConnect$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpfnConnect$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.lpfnConnect$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LPOCNCONNPROCA lpfnConnect (MemorySegment segment) {
        return LPOCNCONNPROCA.ofAddress(lpfnConnect$get(segment));
    }
    static final VarHandle pvUserData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("pvUserData")));
    public static VarHandle pvUserData$VH() {
        return OPENCARDNAME_EXA.pvUserData$VH;
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.pvUserData$VH.get(seg);
    }
    public static void pvUserData$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.pvUserData$VH.set(seg, x);
    }
    public static MemoryAddress pvUserData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.pvUserData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void pvUserData$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.pvUserData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwShareMode$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwShareMode"));
    public static VarHandle dwShareMode$VH() {
        return OPENCARDNAME_EXA.dwShareMode$VH;
    }
    public static int dwShareMode$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.dwShareMode$VH.get(seg);
    }
    public static void dwShareMode$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.dwShareMode$VH.set(seg, x);
    }
    public static int dwShareMode$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.dwShareMode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwShareMode$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.dwShareMode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwPreferredProtocols$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwPreferredProtocols"));
    public static VarHandle dwPreferredProtocols$VH() {
        return OPENCARDNAME_EXA.dwPreferredProtocols$VH;
    }
    public static int dwPreferredProtocols$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.dwPreferredProtocols$VH.get(seg);
    }
    public static void dwPreferredProtocols$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.dwPreferredProtocols$VH.set(seg, x);
    }
    public static int dwPreferredProtocols$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.dwPreferredProtocols$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwPreferredProtocols$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.dwPreferredProtocols$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrRdr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrRdr")));
    public static VarHandle lpstrRdr$VH() {
        return OPENCARDNAME_EXA.lpstrRdr$VH;
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrRdr$VH.get(seg);
    }
    public static void lpstrRdr$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrRdr$VH.set(seg, x);
    }
    public static MemoryAddress lpstrRdr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrRdr$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxRdr$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxRdr"));
    public static VarHandle nMaxRdr$VH() {
        return OPENCARDNAME_EXA.nMaxRdr$VH;
    }
    public static int nMaxRdr$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.nMaxRdr$VH.get(seg);
    }
    public static void nMaxRdr$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.nMaxRdr$VH.set(seg, x);
    }
    public static int nMaxRdr$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.nMaxRdr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxRdr$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.nMaxRdr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle lpstrCard$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("lpstrCard")));
    public static VarHandle lpstrCard$VH() {
        return OPENCARDNAME_EXA.lpstrCard$VH;
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrCard$VH.get(seg);
    }
    public static void lpstrCard$set( MemorySegment seg, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrCard$VH.set(seg, x);
    }
    public static MemoryAddress lpstrCard$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)OPENCARDNAME_EXA.lpstrCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void lpstrCard$set(MemorySegment seg, long index, MemoryAddress x) {
        OPENCARDNAME_EXA.lpstrCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle nMaxCard$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("nMaxCard"));
    public static VarHandle nMaxCard$VH() {
        return OPENCARDNAME_EXA.nMaxCard$VH;
    }
    public static int nMaxCard$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.nMaxCard$VH.get(seg);
    }
    public static void nMaxCard$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.nMaxCard$VH.set(seg, x);
    }
    public static int nMaxCard$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.nMaxCard$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void nMaxCard$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.nMaxCard$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle dwActiveProtocol$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwActiveProtocol"));
    public static VarHandle dwActiveProtocol$VH() {
        return OPENCARDNAME_EXA.dwActiveProtocol$VH;
    }
    public static int dwActiveProtocol$get(MemorySegment seg) {
        return (int)OPENCARDNAME_EXA.dwActiveProtocol$VH.get(seg);
    }
    public static void dwActiveProtocol$set( MemorySegment seg, int x) {
        OPENCARDNAME_EXA.dwActiveProtocol$VH.set(seg, x);
    }
    public static int dwActiveProtocol$get(MemorySegment seg, long index) {
        return (int)OPENCARDNAME_EXA.dwActiveProtocol$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwActiveProtocol$set(MemorySegment seg, long index, int x) {
        OPENCARDNAME_EXA.dwActiveProtocol$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle hCardHandle$VH = $struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("hCardHandle"));
    public static VarHandle hCardHandle$VH() {
        return OPENCARDNAME_EXA.hCardHandle$VH;
    }
    public static long hCardHandle$get(MemorySegment seg) {
        return (long)OPENCARDNAME_EXA.hCardHandle$VH.get(seg);
    }
    public static void hCardHandle$set( MemorySegment seg, long x) {
        OPENCARDNAME_EXA.hCardHandle$VH.set(seg, x);
    }
    public static long hCardHandle$get(MemorySegment seg, long index) {
        return (long)OPENCARDNAME_EXA.hCardHandle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void hCardHandle$set(MemorySegment seg, long index, long x) {
        OPENCARDNAME_EXA.hCardHandle$VH.set(seg.asSlice(index*sizeof()), x);
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


