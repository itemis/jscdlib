// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IInternetBindInfoExVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetBindInfo"),
        C_POINTER.withName("GetBindString"),
        C_POINTER.withName("GetBindInfoEx")
    ).withName("IInternetBindInfoExVtbl");
    public static MemoryLayout $LAYOUT() {
        return IInternetBindInfoExVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetBindInfoExVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetBindInfoExVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IInternetBindInfoExVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IInternetBindInfoExVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IInternetBindInfoExVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IInternetBindInfoExVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetBindInfoExVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetBindInfoExVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetBindInfoExVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IInternetBindInfoExVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IInternetBindInfoExVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IInternetBindInfoExVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IInternetBindInfoExVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetBindInfoExVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetBindInfoExVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetBindInfoExVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IInternetBindInfoExVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IInternetBindInfoExVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IInternetBindInfoExVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IInternetBindInfoExVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetBindInfoExVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor GetBindInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetBindInfo$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetBindInfoExVtbl.GetBindInfo$FUNC, false
    );
    public interface GetBindInfo {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(GetBindInfo fi) {
            return RuntimeHelper.upcallStub(GetBindInfo.class, fi, IInternetBindInfoExVtbl.GetBindInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBindInfo fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBindInfo.class, fi, IInternetBindInfoExVtbl.GetBindInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBindInfo ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IInternetBindInfoExVtbl.GetBindInfo$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBindInfo")));
    public static VarHandle GetBindInfo$VH() {
        return IInternetBindInfoExVtbl.GetBindInfo$VH;
    }
    public static MemoryAddress GetBindInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.GetBindInfo$VH.get(seg);
    }
    public static void GetBindInfo$set( MemorySegment seg, MemoryAddress x) {
        IInternetBindInfoExVtbl.GetBindInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetBindInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.GetBindInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetBindInfoExVtbl.GetBindInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfo GetBindInfo (MemorySegment segment) {
        return GetBindInfo.ofAddress(GetBindInfo$get(segment));
    }
    static final FunctionDescriptor GetBindString$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle GetBindString$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IInternetBindInfoExVtbl.GetBindString$FUNC, false
    );
    public interface GetBindString {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(GetBindString fi) {
            return RuntimeHelper.upcallStub(GetBindString.class, fi, IInternetBindInfoExVtbl.GetBindString$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBindString fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBindString.class, fi, IInternetBindInfoExVtbl.GetBindString$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBindString ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, int x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IInternetBindInfoExVtbl.GetBindString$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindString$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBindString")));
    public static VarHandle GetBindString$VH() {
        return IInternetBindInfoExVtbl.GetBindString$VH;
    }
    public static MemoryAddress GetBindString$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.GetBindString$VH.get(seg);
    }
    public static void GetBindString$set( MemorySegment seg, MemoryAddress x) {
        IInternetBindInfoExVtbl.GetBindString$VH.set(seg, x);
    }
    public static MemoryAddress GetBindString$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.GetBindString$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindString$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetBindInfoExVtbl.GetBindString$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindString GetBindString (MemorySegment segment) {
        return GetBindString.ofAddress(GetBindString$get(segment));
    }
    static final FunctionDescriptor GetBindInfoEx$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetBindInfoEx$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IInternetBindInfoExVtbl.GetBindInfoEx$FUNC, false
    );
    public interface GetBindInfoEx {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(GetBindInfoEx fi) {
            return RuntimeHelper.upcallStub(GetBindInfoEx.class, fi, IInternetBindInfoExVtbl.GetBindInfoEx$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBindInfoEx fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBindInfoEx.class, fi, IInternetBindInfoExVtbl.GetBindInfoEx$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBindInfoEx ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IInternetBindInfoExVtbl.GetBindInfoEx$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBindInfoEx$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBindInfoEx")));
    public static VarHandle GetBindInfoEx$VH() {
        return IInternetBindInfoExVtbl.GetBindInfoEx$VH;
    }
    public static MemoryAddress GetBindInfoEx$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.GetBindInfoEx$VH.get(seg);
    }
    public static void GetBindInfoEx$set( MemorySegment seg, MemoryAddress x) {
        IInternetBindInfoExVtbl.GetBindInfoEx$VH.set(seg, x);
    }
    public static MemoryAddress GetBindInfoEx$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IInternetBindInfoExVtbl.GetBindInfoEx$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBindInfoEx$set(MemorySegment seg, long index, MemoryAddress x) {
        IInternetBindInfoExVtbl.GetBindInfoEx$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBindInfoEx GetBindInfoEx (MemorySegment segment) {
        return GetBindInfoEx.ofAddress(GetBindInfoEx$get(segment));
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


