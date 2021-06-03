// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class SYSTEM_BATTERY_STATE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("AcOnLine"),
        C_CHAR.withName("BatteryPresent"),
        C_CHAR.withName("Charging"),
        C_CHAR.withName("Discharging"),
        MemoryLayout.sequenceLayout(4, C_CHAR).withName("Spare1"),
        C_LONG.withName("MaxCapacity"),
        C_LONG.withName("RemainingCapacity"),
        C_LONG.withName("Rate"),
        C_LONG.withName("EstimatedTime"),
        C_LONG.withName("DefaultAlert1"),
        C_LONG.withName("DefaultAlert2")
    );
    public static MemoryLayout $LAYOUT() {
        return SYSTEM_BATTERY_STATE.$struct$LAYOUT;
    }
    static final VarHandle AcOnLine$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("AcOnLine"));
    public static VarHandle AcOnLine$VH() {
        return SYSTEM_BATTERY_STATE.AcOnLine$VH;
    }
    public static byte AcOnLine$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.AcOnLine$VH.get(seg);
    }
    public static void AcOnLine$set( MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.AcOnLine$VH.set(seg, x);
    }
    public static byte AcOnLine$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.AcOnLine$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AcOnLine$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.AcOnLine$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle BatteryPresent$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("BatteryPresent"));
    public static VarHandle BatteryPresent$VH() {
        return SYSTEM_BATTERY_STATE.BatteryPresent$VH;
    }
    public static byte BatteryPresent$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.BatteryPresent$VH.get(seg);
    }
    public static void BatteryPresent$set( MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.BatteryPresent$VH.set(seg, x);
    }
    public static byte BatteryPresent$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.BatteryPresent$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BatteryPresent$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.BatteryPresent$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Charging$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("Charging"));
    public static VarHandle Charging$VH() {
        return SYSTEM_BATTERY_STATE.Charging$VH;
    }
    public static byte Charging$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.Charging$VH.get(seg);
    }
    public static void Charging$set( MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.Charging$VH.set(seg, x);
    }
    public static byte Charging$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.Charging$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Charging$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.Charging$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Discharging$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("Discharging"));
    public static VarHandle Discharging$VH() {
        return SYSTEM_BATTERY_STATE.Discharging$VH;
    }
    public static byte Discharging$get(MemorySegment seg) {
        return (byte)SYSTEM_BATTERY_STATE.Discharging$VH.get(seg);
    }
    public static void Discharging$set( MemorySegment seg, byte x) {
        SYSTEM_BATTERY_STATE.Discharging$VH.set(seg, x);
    }
    public static byte Discharging$get(MemorySegment seg, long index) {
        return (byte)SYSTEM_BATTERY_STATE.Discharging$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Discharging$set(MemorySegment seg, long index, byte x) {
        SYSTEM_BATTERY_STATE.Discharging$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment Spare1$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    static final VarHandle MaxCapacity$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("MaxCapacity"));
    public static VarHandle MaxCapacity$VH() {
        return SYSTEM_BATTERY_STATE.MaxCapacity$VH;
    }
    public static int MaxCapacity$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.MaxCapacity$VH.get(seg);
    }
    public static void MaxCapacity$set( MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.MaxCapacity$VH.set(seg, x);
    }
    public static int MaxCapacity$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.MaxCapacity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void MaxCapacity$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.MaxCapacity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle RemainingCapacity$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("RemainingCapacity"));
    public static VarHandle RemainingCapacity$VH() {
        return SYSTEM_BATTERY_STATE.RemainingCapacity$VH;
    }
    public static int RemainingCapacity$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.RemainingCapacity$VH.get(seg);
    }
    public static void RemainingCapacity$set( MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.RemainingCapacity$VH.set(seg, x);
    }
    public static int RemainingCapacity$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.RemainingCapacity$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RemainingCapacity$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.RemainingCapacity$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle Rate$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("Rate"));
    public static VarHandle Rate$VH() {
        return SYSTEM_BATTERY_STATE.Rate$VH;
    }
    public static int Rate$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.Rate$VH.get(seg);
    }
    public static void Rate$set( MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.Rate$VH.set(seg, x);
    }
    public static int Rate$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.Rate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Rate$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.Rate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle EstimatedTime$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("EstimatedTime"));
    public static VarHandle EstimatedTime$VH() {
        return SYSTEM_BATTERY_STATE.EstimatedTime$VH;
    }
    public static int EstimatedTime$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.EstimatedTime$VH.get(seg);
    }
    public static void EstimatedTime$set( MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.EstimatedTime$VH.set(seg, x);
    }
    public static int EstimatedTime$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.EstimatedTime$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EstimatedTime$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.EstimatedTime$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultAlert1$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DefaultAlert1"));
    public static VarHandle DefaultAlert1$VH() {
        return SYSTEM_BATTERY_STATE.DefaultAlert1$VH;
    }
    public static int DefaultAlert1$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert1$VH.get(seg);
    }
    public static void DefaultAlert1$set( MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert1$VH.set(seg, x);
    }
    public static int DefaultAlert1$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert1$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultAlert1$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert1$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultAlert2$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DefaultAlert2"));
    public static VarHandle DefaultAlert2$VH() {
        return SYSTEM_BATTERY_STATE.DefaultAlert2$VH;
    }
    public static int DefaultAlert2$get(MemorySegment seg) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert2$VH.get(seg);
    }
    public static void DefaultAlert2$set( MemorySegment seg, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert2$VH.set(seg, x);
    }
    public static int DefaultAlert2$get(MemorySegment seg, long index) {
        return (int)SYSTEM_BATTERY_STATE.DefaultAlert2$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultAlert2$set(MemorySegment seg, long index, int x) {
        SYSTEM_BATTERY_STATE.DefaultAlert2$VH.set(seg.asSlice(index*sizeof()), x);
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


