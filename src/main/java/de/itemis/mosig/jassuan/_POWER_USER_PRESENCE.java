// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _POWER_USER_PRESENCE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("UserPresence")
    ).withName("_POWER_USER_PRESENCE");
    public static MemoryLayout $LAYOUT() {
        return _POWER_USER_PRESENCE.$struct$LAYOUT;
    }
    static final VarHandle UserPresence$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("UserPresence"));
    public static VarHandle UserPresence$VH() {
        return _POWER_USER_PRESENCE.UserPresence$VH;
    }
    public static int UserPresence$get(MemorySegment seg) {
        return (int)_POWER_USER_PRESENCE.UserPresence$VH.get(seg);
    }
    public static void UserPresence$set( MemorySegment seg, int x) {
        _POWER_USER_PRESENCE.UserPresence$VH.set(seg, x);
    }
    public static int UserPresence$get(MemorySegment seg, long index) {
        return (int)_POWER_USER_PRESENCE.UserPresence$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UserPresence$set(MemorySegment seg, long index, int x) {
        _POWER_USER_PRESENCE.UserPresence$VH.set(seg.asSlice(index*sizeof()), x);
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


