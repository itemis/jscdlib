// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _TXFS_TRANSACTION_ACTIVE_INFO {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("TransactionsActiveAtSnapshot")
    ).withName("_TXFS_TRANSACTION_ACTIVE_INFO");
    public static MemoryLayout $LAYOUT() {
        return _TXFS_TRANSACTION_ACTIVE_INFO.$struct$LAYOUT;
    }
    static final VarHandle TransactionsActiveAtSnapshot$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("TransactionsActiveAtSnapshot"));
    public static VarHandle TransactionsActiveAtSnapshot$VH() {
        return _TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH;
    }
    public static byte TransactionsActiveAtSnapshot$get(MemorySegment seg) {
        return (byte)_TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.get(seg);
    }
    public static void TransactionsActiveAtSnapshot$set( MemorySegment seg, byte x) {
        _TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.set(seg, x);
    }
    public static byte TransactionsActiveAtSnapshot$get(MemorySegment seg, long index) {
        return (byte)_TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TransactionsActiveAtSnapshot$set(MemorySegment seg, long index, byte x) {
        _TXFS_TRANSACTION_ACTIVE_INFO.TransactionsActiveAtSnapshot$VH.set(seg.asSlice(index*sizeof()), x);
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


