// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _NCB {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_CHAR.withName("ncb_command"),
        C_CHAR.withName("ncb_retcode"),
        C_CHAR.withName("ncb_lsn"),
        C_CHAR.withName("ncb_num"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("ncb_buffer"),
        C_SHORT.withName("ncb_length"),
        MemoryLayout.sequenceLayout(16, C_CHAR).withName("ncb_callname"),
        MemoryLayout.sequenceLayout(16, C_CHAR).withName("ncb_name"),
        C_CHAR.withName("ncb_rto"),
        C_CHAR.withName("ncb_sto"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("ncb_post"),
        C_CHAR.withName("ncb_lana_num"),
        C_CHAR.withName("ncb_cmd_cplt"),
        MemoryLayout.sequenceLayout(18, C_CHAR).withName("ncb_reserve"),
        MemoryLayout.paddingLayout(32),
        C_POINTER.withName("ncb_event")
    ).withName("_NCB");
    public static MemoryLayout $LAYOUT() {
        return _NCB.$struct$LAYOUT;
    }
    static final VarHandle ncb_command$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_command"));
    public static VarHandle ncb_command$VH() {
        return _NCB.ncb_command$VH;
    }
    public static byte ncb_command$get(MemorySegment seg) {
        return (byte)_NCB.ncb_command$VH.get(seg);
    }
    public static void ncb_command$set( MemorySegment seg, byte x) {
        _NCB.ncb_command$VH.set(seg, x);
    }
    public static byte ncb_command$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_command$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_command$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_command$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_retcode$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_retcode"));
    public static VarHandle ncb_retcode$VH() {
        return _NCB.ncb_retcode$VH;
    }
    public static byte ncb_retcode$get(MemorySegment seg) {
        return (byte)_NCB.ncb_retcode$VH.get(seg);
    }
    public static void ncb_retcode$set( MemorySegment seg, byte x) {
        _NCB.ncb_retcode$VH.set(seg, x);
    }
    public static byte ncb_retcode$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_retcode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_retcode$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_retcode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_lsn$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_lsn"));
    public static VarHandle ncb_lsn$VH() {
        return _NCB.ncb_lsn$VH;
    }
    public static byte ncb_lsn$get(MemorySegment seg) {
        return (byte)_NCB.ncb_lsn$VH.get(seg);
    }
    public static void ncb_lsn$set( MemorySegment seg, byte x) {
        _NCB.ncb_lsn$VH.set(seg, x);
    }
    public static byte ncb_lsn$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_lsn$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_lsn$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_lsn$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_num$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_num"));
    public static VarHandle ncb_num$VH() {
        return _NCB.ncb_num$VH;
    }
    public static byte ncb_num$get(MemorySegment seg) {
        return (byte)_NCB.ncb_num$VH.get(seg);
    }
    public static void ncb_num$set( MemorySegment seg, byte x) {
        _NCB.ncb_num$VH.set(seg, x);
    }
    public static byte ncb_num$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_num$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_num$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_num$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_buffer$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ncb_buffer")));
    public static VarHandle ncb_buffer$VH() {
        return _NCB.ncb_buffer$VH;
    }
    public static MemoryAddress ncb_buffer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NCB.ncb_buffer$VH.get(seg);
    }
    public static void ncb_buffer$set( MemorySegment seg, MemoryAddress x) {
        _NCB.ncb_buffer$VH.set(seg, x);
    }
    public static MemoryAddress ncb_buffer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NCB.ncb_buffer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_buffer$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCB.ncb_buffer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_length$VH = $struct$LAYOUT.varHandle(short.class, MemoryLayout.PathElement.groupElement("ncb_length"));
    public static VarHandle ncb_length$VH() {
        return _NCB.ncb_length$VH;
    }
    public static short ncb_length$get(MemorySegment seg) {
        return (short)_NCB.ncb_length$VH.get(seg);
    }
    public static void ncb_length$set( MemorySegment seg, short x) {
        _NCB.ncb_length$VH.set(seg, x);
    }
    public static short ncb_length$get(MemorySegment seg, long index) {
        return (short)_NCB.ncb_length$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_length$set(MemorySegment seg, long index, short x) {
        _NCB.ncb_length$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ncb_callname$slice(MemorySegment seg) {
        return seg.asSlice(18, 16);
    }
    public static MemorySegment ncb_name$slice(MemorySegment seg) {
        return seg.asSlice(34, 16);
    }
    static final VarHandle ncb_rto$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_rto"));
    public static VarHandle ncb_rto$VH() {
        return _NCB.ncb_rto$VH;
    }
    public static byte ncb_rto$get(MemorySegment seg) {
        return (byte)_NCB.ncb_rto$VH.get(seg);
    }
    public static void ncb_rto$set( MemorySegment seg, byte x) {
        _NCB.ncb_rto$VH.set(seg, x);
    }
    public static byte ncb_rto$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_rto$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_rto$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_rto$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_sto$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_sto"));
    public static VarHandle ncb_sto$VH() {
        return _NCB.ncb_sto$VH;
    }
    public static byte ncb_sto$get(MemorySegment seg) {
        return (byte)_NCB.ncb_sto$VH.get(seg);
    }
    public static void ncb_sto$set( MemorySegment seg, byte x) {
        _NCB.ncb_sto$VH.set(seg, x);
    }
    public static byte ncb_sto$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_sto$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_sto$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_sto$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final FunctionDescriptor ncb_post$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle ncb_post$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        _NCB.ncb_post$FUNC, false
    );
    public interface ncb_post {

        void apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(ncb_post fi) {
            return RuntimeHelper.upcallStub(ncb_post.class, fi, _NCB.ncb_post$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
        }
        static MemoryAddress allocate(ncb_post fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ncb_post.class, fi, _NCB.ncb_post$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static ncb_post ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    _NCB.ncb_post$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ncb_post$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ncb_post")));
    public static VarHandle ncb_post$VH() {
        return _NCB.ncb_post$VH;
    }
    public static MemoryAddress ncb_post$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NCB.ncb_post$VH.get(seg);
    }
    public static void ncb_post$set( MemorySegment seg, MemoryAddress x) {
        _NCB.ncb_post$VH.set(seg, x);
    }
    public static MemoryAddress ncb_post$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NCB.ncb_post$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_post$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCB.ncb_post$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ncb_post ncb_post (MemorySegment segment) {
        return ncb_post.ofAddress(ncb_post$get(segment));
    }
    static final VarHandle ncb_lana_num$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_lana_num"));
    public static VarHandle ncb_lana_num$VH() {
        return _NCB.ncb_lana_num$VH;
    }
    public static byte ncb_lana_num$get(MemorySegment seg) {
        return (byte)_NCB.ncb_lana_num$VH.get(seg);
    }
    public static void ncb_lana_num$set( MemorySegment seg, byte x) {
        _NCB.ncb_lana_num$VH.set(seg, x);
    }
    public static byte ncb_lana_num$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_lana_num$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_lana_num$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_lana_num$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ncb_cmd_cplt$VH = $struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("ncb_cmd_cplt"));
    public static VarHandle ncb_cmd_cplt$VH() {
        return _NCB.ncb_cmd_cplt$VH;
    }
    public static byte ncb_cmd_cplt$get(MemorySegment seg) {
        return (byte)_NCB.ncb_cmd_cplt$VH.get(seg);
    }
    public static void ncb_cmd_cplt$set( MemorySegment seg, byte x) {
        _NCB.ncb_cmd_cplt$VH.set(seg, x);
    }
    public static byte ncb_cmd_cplt$get(MemorySegment seg, long index) {
        return (byte)_NCB.ncb_cmd_cplt$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_cmd_cplt$set(MemorySegment seg, long index, byte x) {
        _NCB.ncb_cmd_cplt$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment ncb_reserve$slice(MemorySegment seg) {
        return seg.asSlice(66, 18);
    }
    static final VarHandle ncb_event$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ncb_event")));
    public static VarHandle ncb_event$VH() {
        return _NCB.ncb_event$VH;
    }
    public static MemoryAddress ncb_event$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)_NCB.ncb_event$VH.get(seg);
    }
    public static void ncb_event$set( MemorySegment seg, MemoryAddress x) {
        _NCB.ncb_event$VH.set(seg, x);
    }
    public static MemoryAddress ncb_event$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)_NCB.ncb_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ncb_event$set(MemorySegment seg, long index, MemoryAddress x) {
        _NCB.ncb_event$VH.set(seg.asSlice(index*sizeof()), x);
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


