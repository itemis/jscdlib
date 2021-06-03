// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IWinInetFileStreamVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("SetHandleForUnlock"),
        C_POINTER.withName("SetDeleteFile")
    ).withName("IWinInetFileStreamVtbl");
    public static MemoryLayout $LAYOUT() {
        return IWinInetFileStreamVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IWinInetFileStreamVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IWinInetFileStreamVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IWinInetFileStreamVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IWinInetFileStreamVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IWinInetFileStreamVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IWinInetFileStreamVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IWinInetFileStreamVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IWinInetFileStreamVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IWinInetFileStreamVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IWinInetFileStreamVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IWinInetFileStreamVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IWinInetFileStreamVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor SetHandleForUnlock$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle SetHandleForUnlock$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;JJ)I",
        IWinInetFileStreamVtbl.SetHandleForUnlock$FUNC, false
    );
    public interface SetHandleForUnlock {

        int apply(jdk.incubator.foreign.MemoryAddress x0, long x1, long x2);
        static MemoryAddress allocate(SetHandleForUnlock fi) {
            return RuntimeHelper.upcallStub(SetHandleForUnlock.class, fi, IWinInetFileStreamVtbl.SetHandleForUnlock$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJ)I");
        }
        static MemoryAddress allocate(SetHandleForUnlock fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetHandleForUnlock.class, fi, IWinInetFileStreamVtbl.SetHandleForUnlock$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;JJ)I", scope);
        }
        static SetHandleForUnlock ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, long x1, long x2) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.SetHandleForUnlock$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetHandleForUnlock$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetHandleForUnlock")));
    public static VarHandle SetHandleForUnlock$VH() {
        return IWinInetFileStreamVtbl.SetHandleForUnlock$VH;
    }
    public static MemoryAddress SetHandleForUnlock$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetHandleForUnlock$VH.get(seg);
    }
    public static void SetHandleForUnlock$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetHandleForUnlock$VH.set(seg, x);
    }
    public static MemoryAddress SetHandleForUnlock$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetHandleForUnlock$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetHandleForUnlock$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetHandleForUnlock$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetHandleForUnlock SetHandleForUnlock (MemorySegment segment) {
        return SetHandleForUnlock.ofAddress(SetHandleForUnlock$get(segment));
    }
    static final FunctionDescriptor SetDeleteFile$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle SetDeleteFile$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        IWinInetFileStreamVtbl.SetDeleteFile$FUNC, false
    );
    public interface SetDeleteFile {

        int apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
        static MemoryAddress allocate(SetDeleteFile fi) {
            return RuntimeHelper.upcallStub(SetDeleteFile.class, fi, IWinInetFileStreamVtbl.SetDeleteFile$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I");
        }
        static MemoryAddress allocate(SetDeleteFile fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetDeleteFile.class, fi, IWinInetFileStreamVtbl.SetDeleteFile$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)I", scope);
        }
        static SetDeleteFile ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
                try {
                    return (int)IWinInetFileStreamVtbl.SetDeleteFile$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetDeleteFile$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetDeleteFile")));
    public static VarHandle SetDeleteFile$VH() {
        return IWinInetFileStreamVtbl.SetDeleteFile$VH;
    }
    public static MemoryAddress SetDeleteFile$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetDeleteFile$VH.get(seg);
    }
    public static void SetDeleteFile$set( MemorySegment seg, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetDeleteFile$VH.set(seg, x);
    }
    public static MemoryAddress SetDeleteFile$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IWinInetFileStreamVtbl.SetDeleteFile$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetDeleteFile$set(MemorySegment seg, long index, MemoryAddress x) {
        IWinInetFileStreamVtbl.SetDeleteFile$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetDeleteFile SetDeleteFile (MemorySegment segment) {
        return SetDeleteFile.ofAddress(SetDeleteFile$get(segment));
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


