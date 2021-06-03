// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IInternetProtocolSinkVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("Switch"),
        C_POINTER.withName("ReportProgress"),
        C_POINTER.withName("ReportData"),
        C_POINTER.withName("ReportResult")
    ).withName("IInternetProtocolSinkVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetProtocolSinkVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetProtocolSinkVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetProtocolSinkVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetProtocolSinkVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IInternetProtocolSinkVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetProtocolSinkVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetProtocolSinkVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetProtocolSinkVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IInternetProtocolSinkVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetProtocolSinkVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetProtocolSinkVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetProtocolSinkVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IInternetProtocolSinkVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor Switch$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Switch$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetProtocolSinkVtbl.Switch$FUNC, false
    );
    public interface Switch {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(Switch fi) {
            return RuntimeHelper.upcallStub(Switch.class, fi, IInternetProtocolSinkVtbl.Switch$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Switch fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Switch.class, fi, IInternetProtocolSinkVtbl.Switch$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Switch ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.Switch$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Switch$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Switch")));
    public static VarHandle Switch$VH() {
        return IInternetProtocolSinkVtbl.Switch$VH;
    }
    public static MemoryAddress Switch$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Switch$VH.get(seg);
    }
    public static void Switch$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Switch$VH.set(seg, x);
    }
    public static MemoryAddress Switch$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.Switch$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Switch$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.Switch$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Switch Switch (MemorySegment segment) {
        return Switch.ofAddress(Switch$get(segment));
    }
    static final FunctionDescriptor ReportProgress$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ReportProgress$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IInternetProtocolSinkVtbl.ReportProgress$FUNC, false
    );
    public interface ReportProgress {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(ReportProgress fi) {
            return RuntimeHelper.upcallStub(ReportProgress.class, fi, IInternetProtocolSinkVtbl.ReportProgress$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(ReportProgress fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ReportProgress.class, fi, IInternetProtocolSinkVtbl.ReportProgress$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static ReportProgress ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.ReportProgress$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReportProgress$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ReportProgress")));
    public static VarHandle ReportProgress$VH() {
        return IInternetProtocolSinkVtbl.ReportProgress$VH;
    }
    public static MemoryAddress ReportProgress$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportProgress$VH.get(seg);
    }
    public static void ReportProgress$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportProgress$VH.set(seg, x);
    }
    public static MemoryAddress ReportProgress$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportProgress$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportProgress$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportProgress$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReportProgress ReportProgress (MemorySegment segment) {
        return ReportProgress.ofAddress(ReportProgress$get(segment));
    }
    static final FunctionDescriptor ReportData$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG
    );
    static final MethodHandle ReportData$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;III)I",
        IInternetProtocolSinkVtbl.ReportData$FUNC, false
    );
    public interface ReportData {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3);
        static MemoryAddress allocate(ReportData fi) {
            return RuntimeHelper.upcallStub(ReportData.class, fi, IInternetProtocolSinkVtbl.ReportData$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I");
        }
        static MemoryAddress allocate(ReportData fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ReportData.class, fi, IInternetProtocolSinkVtbl.ReportData$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;III)I", scope);
        }
        static ReportData ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, int x3) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.ReportData$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReportData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ReportData")));
    public static VarHandle ReportData$VH() {
        return IInternetProtocolSinkVtbl.ReportData$VH;
    }
    public static MemoryAddress ReportData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportData$VH.get(seg);
    }
    public static void ReportData$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportData$VH.set(seg, x);
    }
    public static MemoryAddress ReportData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportData$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReportData ReportData (MemorySegment segment) {
        return ReportData.ofAddress(ReportData$get(segment));
    }
    static final FunctionDescriptor ReportResult$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ReportResult$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        IInternetProtocolSinkVtbl.ReportResult$FUNC, false
    );
    public interface ReportResult {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(ReportResult fi) {
            return RuntimeHelper.upcallStub(ReportResult.class, fi, IInternetProtocolSinkVtbl.ReportResult$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(ReportResult fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ReportResult.class, fi, IInternetProtocolSinkVtbl.ReportResult$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static ReportResult ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IInternetProtocolSinkVtbl.ReportResult$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReportResult$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ReportResult")));
    public static VarHandle ReportResult$VH() {
        return IInternetProtocolSinkVtbl.ReportResult$VH;
    }
    public static MemoryAddress ReportResult$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportResult$VH.get(seg);
    }
    public static void ReportResult$set( MemorySegment seg, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportResult$VH.set(seg, x);
    }
    public static MemoryAddress ReportResult$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetProtocolSinkVtbl.ReportResult$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReportResult$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetProtocolSinkVtbl.ReportResult$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReportResult ReportResult (MemorySegment segment) {
        return ReportResult.ofAddress(ReportResult$get(segment));
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


