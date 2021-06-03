// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class POWERBROADCAST_SETTING {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            C_LONG.withName("Data1"),
            C_SHORT.withName("Data2"),
            C_SHORT.withName("Data3"),
            MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
        ).withName("PowerSetting"),
        C_LONG.withName("DataLength"),
        MemoryLayout.sequenceLayout(1, C_CHAR).withName("Data"),
        MemoryLayout.paddingLayout(24)
    );
    public static MemoryLayout $LAYOUT() {
        return POWERBROADCAST_SETTING.$struct$LAYOUT;
    }
    public static MemorySegment PowerSetting$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final VarHandle DataLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DataLength"));
    public static VarHandle DataLength$VH() {
        return POWERBROADCAST_SETTING.DataLength$VH;
    }
    public static int DataLength$get(MemorySegment seg) {
        return (int)POWERBROADCAST_SETTING.DataLength$VH.get(seg);
    }
    public static void DataLength$set( MemorySegment seg, int x) {
        POWERBROADCAST_SETTING.DataLength$VH.set(seg, x);
    }
    public static int DataLength$get(MemorySegment seg, long index) {
        return (int)POWERBROADCAST_SETTING.DataLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DataLength$set(MemorySegment seg, long index, int x) {
        POWERBROADCAST_SETTING.DataLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Data$slice(MemorySegment seg) {
        return seg.asSlice(20, 1);
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


