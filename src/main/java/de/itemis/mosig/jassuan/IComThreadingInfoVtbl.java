// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IComThreadingInfoVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetCurrentApartmentType"),
        C_POINTER.withName("GetCurrentThreadType"),
        C_POINTER.withName("GetCurrentLogicalThreadId"),
        C_POINTER.withName("SetCurrentLogicalThreadId")
    ).withName("IComThreadingInfoVtbl");
    public static MemoryLayout $LAYOUT() {
        return IComThreadingInfoVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IComThreadingInfoVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IComThreadingInfoVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IComThreadingInfoVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IComThreadingInfoVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IComThreadingInfoVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IComThreadingInfoVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IComThreadingInfoVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IComThreadingInfoVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IComThreadingInfoVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IComThreadingInfoVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IComThreadingInfoVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IComThreadingInfoVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor GetCurrentApartmentType$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetCurrentApartmentType$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.GetCurrentApartmentType$FUNC, false
    );
    public interface GetCurrentApartmentType {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetCurrentApartmentType fi) {
            return RuntimeHelper.upcallStub(GetCurrentApartmentType.class, fi, IComThreadingInfoVtbl.GetCurrentApartmentType$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetCurrentApartmentType fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetCurrentApartmentType.class, fi, IComThreadingInfoVtbl.GetCurrentApartmentType$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetCurrentApartmentType ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.GetCurrentApartmentType$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentApartmentType$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetCurrentApartmentType")));
    public static VarHandle GetCurrentApartmentType$VH() {
        return IComThreadingInfoVtbl.GetCurrentApartmentType$VH;
    }
    public static MemoryAddress GetCurrentApartmentType$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentApartmentType$VH.get(seg);
    }
    public static void GetCurrentApartmentType$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentApartmentType$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentApartmentType$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentApartmentType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentApartmentType$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentApartmentType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentApartmentType GetCurrentApartmentType (MemorySegment segment) {
        return GetCurrentApartmentType.ofAddress(GetCurrentApartmentType$get(segment));
    }
    static final FunctionDescriptor GetCurrentThreadType$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetCurrentThreadType$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.GetCurrentThreadType$FUNC, false
    );
    public interface GetCurrentThreadType {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetCurrentThreadType fi) {
            return RuntimeHelper.upcallStub(GetCurrentThreadType.class, fi, IComThreadingInfoVtbl.GetCurrentThreadType$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetCurrentThreadType fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetCurrentThreadType.class, fi, IComThreadingInfoVtbl.GetCurrentThreadType$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetCurrentThreadType ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.GetCurrentThreadType$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentThreadType$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetCurrentThreadType")));
    public static VarHandle GetCurrentThreadType$VH() {
        return IComThreadingInfoVtbl.GetCurrentThreadType$VH;
    }
    public static MemoryAddress GetCurrentThreadType$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentThreadType$VH.get(seg);
    }
    public static void GetCurrentThreadType$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentThreadType$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentThreadType$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentThreadType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentThreadType$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentThreadType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentThreadType GetCurrentThreadType (MemorySegment segment) {
        return GetCurrentThreadType.ofAddress(GetCurrentThreadType$get(segment));
    }
    static final FunctionDescriptor GetCurrentLogicalThreadId$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetCurrentLogicalThreadId$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.GetCurrentLogicalThreadId$FUNC, false
    );
    public interface GetCurrentLogicalThreadId {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetCurrentLogicalThreadId fi) {
            return RuntimeHelper.upcallStub(GetCurrentLogicalThreadId.class, fi, IComThreadingInfoVtbl.GetCurrentLogicalThreadId$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetCurrentLogicalThreadId fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetCurrentLogicalThreadId.class, fi, IComThreadingInfoVtbl.GetCurrentLogicalThreadId$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetCurrentLogicalThreadId ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.GetCurrentLogicalThreadId$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetCurrentLogicalThreadId$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetCurrentLogicalThreadId")));
    public static VarHandle GetCurrentLogicalThreadId$VH() {
        return IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH;
    }
    public static MemoryAddress GetCurrentLogicalThreadId$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.get(seg);
    }
    public static void GetCurrentLogicalThreadId$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.set(seg, x);
    }
    public static MemoryAddress GetCurrentLogicalThreadId$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetCurrentLogicalThreadId$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.GetCurrentLogicalThreadId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetCurrentLogicalThreadId GetCurrentLogicalThreadId (MemorySegment segment) {
        return GetCurrentLogicalThreadId.ofAddress(GetCurrentLogicalThreadId$get(segment));
    }
    static final FunctionDescriptor SetCurrentLogicalThreadId$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetCurrentLogicalThreadId$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IComThreadingInfoVtbl.SetCurrentLogicalThreadId$FUNC, false
    );
    public interface SetCurrentLogicalThreadId {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetCurrentLogicalThreadId fi) {
            return RuntimeHelper.upcallStub(SetCurrentLogicalThreadId.class, fi, IComThreadingInfoVtbl.SetCurrentLogicalThreadId$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetCurrentLogicalThreadId fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetCurrentLogicalThreadId.class, fi, IComThreadingInfoVtbl.SetCurrentLogicalThreadId$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetCurrentLogicalThreadId ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IComThreadingInfoVtbl.SetCurrentLogicalThreadId$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetCurrentLogicalThreadId$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetCurrentLogicalThreadId")));
    public static VarHandle SetCurrentLogicalThreadId$VH() {
        return IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH;
    }
    public static MemoryAddress SetCurrentLogicalThreadId$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.get(seg);
    }
    public static void SetCurrentLogicalThreadId$set( MemorySegment seg, MemoryAddress x) {
        IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.set(seg, x);
    }
    public static MemoryAddress SetCurrentLogicalThreadId$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetCurrentLogicalThreadId$set(MemorySegment seg, long index, MemoryAddress x) {
        IComThreadingInfoVtbl.SetCurrentLogicalThreadId$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetCurrentLogicalThreadId SetCurrentLogicalThreadId (MemorySegment segment) {
        return SetCurrentLogicalThreadId.ofAddress(SetCurrentLogicalThreadId$get(segment));
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


