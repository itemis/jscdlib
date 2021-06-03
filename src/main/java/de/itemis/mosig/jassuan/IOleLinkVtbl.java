// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IOleLinkVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("SetUpdateOptions"),
        C_POINTER.withName("GetUpdateOptions"),
        C_POINTER.withName("SetSourceMoniker"),
        C_POINTER.withName("GetSourceMoniker"),
        C_POINTER.withName("SetSourceDisplayName"),
        C_POINTER.withName("GetSourceDisplayName"),
        C_POINTER.withName("BindToSource"),
        C_POINTER.withName("BindIfRunning"),
        C_POINTER.withName("GetBoundSource"),
        C_POINTER.withName("UnbindSource"),
        C_POINTER.withName("Update")
    ).withName("IOleLinkVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleLinkVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleLinkVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleLinkVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleLinkVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IOleLinkVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleLinkVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleLinkVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleLinkVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IOleLinkVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleLinkVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleLinkVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleLinkVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IOleLinkVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor SetUpdateOptions$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle SetUpdateOptions$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleLinkVtbl.SetUpdateOptions$FUNC, false
    );
    public interface SetUpdateOptions {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(SetUpdateOptions fi) {
            return RuntimeHelper.upcallStub(SetUpdateOptions.class, fi, IOleLinkVtbl.SetUpdateOptions$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(SetUpdateOptions fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetUpdateOptions.class, fi, IOleLinkVtbl.SetUpdateOptions$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static SetUpdateOptions ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleLinkVtbl.SetUpdateOptions$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetUpdateOptions$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetUpdateOptions")));
    public static VarHandle SetUpdateOptions$VH() {
        return IOleLinkVtbl.SetUpdateOptions$VH;
    }
    public static MemoryAddress SetUpdateOptions$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.SetUpdateOptions$VH.get(seg);
    }
    public static void SetUpdateOptions$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.SetUpdateOptions$VH.set(seg, x);
    }
    public static MemoryAddress SetUpdateOptions$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.SetUpdateOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetUpdateOptions$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.SetUpdateOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetUpdateOptions SetUpdateOptions (MemorySegment segment) {
        return SetUpdateOptions.ofAddress(SetUpdateOptions$get(segment));
    }
    static final FunctionDescriptor GetUpdateOptions$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetUpdateOptions$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.GetUpdateOptions$FUNC, false
    );
    public interface GetUpdateOptions {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetUpdateOptions fi) {
            return RuntimeHelper.upcallStub(GetUpdateOptions.class, fi, IOleLinkVtbl.GetUpdateOptions$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetUpdateOptions fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetUpdateOptions.class, fi, IOleLinkVtbl.GetUpdateOptions$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetUpdateOptions ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetUpdateOptions$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetUpdateOptions$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetUpdateOptions")));
    public static VarHandle GetUpdateOptions$VH() {
        return IOleLinkVtbl.GetUpdateOptions$VH;
    }
    public static MemoryAddress GetUpdateOptions$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetUpdateOptions$VH.get(seg);
    }
    public static void GetUpdateOptions$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetUpdateOptions$VH.set(seg, x);
    }
    public static MemoryAddress GetUpdateOptions$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetUpdateOptions$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetUpdateOptions$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetUpdateOptions$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetUpdateOptions GetUpdateOptions (MemorySegment segment) {
        return GetUpdateOptions.ofAddress(GetUpdateOptions$get(segment));
    }
    static final FunctionDescriptor SetSourceMoniker$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetSourceMoniker$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.SetSourceMoniker$FUNC, false
    );
    public interface SetSourceMoniker {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(SetSourceMoniker fi) {
            return RuntimeHelper.upcallStub(SetSourceMoniker.class, fi, IOleLinkVtbl.SetSourceMoniker$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetSourceMoniker fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetSourceMoniker.class, fi, IOleLinkVtbl.SetSourceMoniker$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetSourceMoniker ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleLinkVtbl.SetSourceMoniker$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSourceMoniker$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetSourceMoniker")));
    public static VarHandle SetSourceMoniker$VH() {
        return IOleLinkVtbl.SetSourceMoniker$VH;
    }
    public static MemoryAddress SetSourceMoniker$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.SetSourceMoniker$VH.get(seg);
    }
    public static void SetSourceMoniker$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.SetSourceMoniker$VH.set(seg, x);
    }
    public static MemoryAddress SetSourceMoniker$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.SetSourceMoniker$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSourceMoniker$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.SetSourceMoniker$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSourceMoniker SetSourceMoniker (MemorySegment segment) {
        return SetSourceMoniker.ofAddress(SetSourceMoniker$get(segment));
    }
    static final FunctionDescriptor GetSourceMoniker$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetSourceMoniker$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.GetSourceMoniker$FUNC, false
    );
    public interface GetSourceMoniker {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetSourceMoniker fi) {
            return RuntimeHelper.upcallStub(GetSourceMoniker.class, fi, IOleLinkVtbl.GetSourceMoniker$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetSourceMoniker fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetSourceMoniker.class, fi, IOleLinkVtbl.GetSourceMoniker$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetSourceMoniker ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetSourceMoniker$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSourceMoniker$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetSourceMoniker")));
    public static VarHandle GetSourceMoniker$VH() {
        return IOleLinkVtbl.GetSourceMoniker$VH;
    }
    public static MemoryAddress GetSourceMoniker$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetSourceMoniker$VH.get(seg);
    }
    public static void GetSourceMoniker$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetSourceMoniker$VH.set(seg, x);
    }
    public static MemoryAddress GetSourceMoniker$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetSourceMoniker$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSourceMoniker$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetSourceMoniker$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSourceMoniker GetSourceMoniker (MemorySegment segment) {
        return GetSourceMoniker.ofAddress(GetSourceMoniker$get(segment));
    }
    static final FunctionDescriptor SetSourceDisplayName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetSourceDisplayName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.SetSourceDisplayName$FUNC, false
    );
    public interface SetSourceDisplayName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetSourceDisplayName fi) {
            return RuntimeHelper.upcallStub(SetSourceDisplayName.class, fi, IOleLinkVtbl.SetSourceDisplayName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetSourceDisplayName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetSourceDisplayName.class, fi, IOleLinkVtbl.SetSourceDisplayName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetSourceDisplayName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleLinkVtbl.SetSourceDisplayName$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSourceDisplayName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetSourceDisplayName")));
    public static VarHandle SetSourceDisplayName$VH() {
        return IOleLinkVtbl.SetSourceDisplayName$VH;
    }
    public static MemoryAddress SetSourceDisplayName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.SetSourceDisplayName$VH.get(seg);
    }
    public static void SetSourceDisplayName$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.SetSourceDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress SetSourceDisplayName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.SetSourceDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSourceDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.SetSourceDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSourceDisplayName SetSourceDisplayName (MemorySegment segment) {
        return SetSourceDisplayName.ofAddress(SetSourceDisplayName$get(segment));
    }
    static final FunctionDescriptor GetSourceDisplayName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetSourceDisplayName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.GetSourceDisplayName$FUNC, false
    );
    public interface GetSourceDisplayName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetSourceDisplayName fi) {
            return RuntimeHelper.upcallStub(GetSourceDisplayName.class, fi, IOleLinkVtbl.GetSourceDisplayName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetSourceDisplayName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetSourceDisplayName.class, fi, IOleLinkVtbl.GetSourceDisplayName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetSourceDisplayName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetSourceDisplayName$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetSourceDisplayName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetSourceDisplayName")));
    public static VarHandle GetSourceDisplayName$VH() {
        return IOleLinkVtbl.GetSourceDisplayName$VH;
    }
    public static MemoryAddress GetSourceDisplayName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetSourceDisplayName$VH.get(seg);
    }
    public static void GetSourceDisplayName$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetSourceDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress GetSourceDisplayName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetSourceDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetSourceDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetSourceDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetSourceDisplayName GetSourceDisplayName (MemorySegment segment) {
        return GetSourceDisplayName.ofAddress(GetSourceDisplayName$get(segment));
    }
    static final FunctionDescriptor BindToSource$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle BindToSource$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.BindToSource$FUNC, false
    );
    public interface BindToSource {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(BindToSource fi) {
            return RuntimeHelper.upcallStub(BindToSource.class, fi, IOleLinkVtbl.BindToSource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(BindToSource fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(BindToSource.class, fi, IOleLinkVtbl.BindToSource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static BindToSource ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleLinkVtbl.BindToSource$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BindToSource$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("BindToSource")));
    public static VarHandle BindToSource$VH() {
        return IOleLinkVtbl.BindToSource$VH;
    }
    public static MemoryAddress BindToSource$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.BindToSource$VH.get(seg);
    }
    public static void BindToSource$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.BindToSource$VH.set(seg, x);
    }
    public static MemoryAddress BindToSource$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.BindToSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BindToSource$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.BindToSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BindToSource BindToSource (MemorySegment segment) {
        return BindToSource.ofAddress(BindToSource$get(segment));
    }
    static final FunctionDescriptor BindIfRunning$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle BindIfRunning$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.BindIfRunning$FUNC, false
    );
    public interface BindIfRunning {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(BindIfRunning fi) {
            return RuntimeHelper.upcallStub(BindIfRunning.class, fi, IOleLinkVtbl.BindIfRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(BindIfRunning fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(BindIfRunning.class, fi, IOleLinkVtbl.BindIfRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static BindIfRunning ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleLinkVtbl.BindIfRunning$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle BindIfRunning$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("BindIfRunning")));
    public static VarHandle BindIfRunning$VH() {
        return IOleLinkVtbl.BindIfRunning$VH;
    }
    public static MemoryAddress BindIfRunning$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.BindIfRunning$VH.get(seg);
    }
    public static void BindIfRunning$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.BindIfRunning$VH.set(seg, x);
    }
    public static MemoryAddress BindIfRunning$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.BindIfRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void BindIfRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.BindIfRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static BindIfRunning BindIfRunning (MemorySegment segment) {
        return BindIfRunning.ofAddress(BindIfRunning$get(segment));
    }
    static final FunctionDescriptor GetBoundSource$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetBoundSource$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.GetBoundSource$FUNC, false
    );
    public interface GetBoundSource {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetBoundSource fi) {
            return RuntimeHelper.upcallStub(GetBoundSource.class, fi, IOleLinkVtbl.GetBoundSource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBoundSource fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBoundSource.class, fi, IOleLinkVtbl.GetBoundSource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBoundSource ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleLinkVtbl.GetBoundSource$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBoundSource$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBoundSource")));
    public static VarHandle GetBoundSource$VH() {
        return IOleLinkVtbl.GetBoundSource$VH;
    }
    public static MemoryAddress GetBoundSource$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetBoundSource$VH.get(seg);
    }
    public static void GetBoundSource$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.GetBoundSource$VH.set(seg, x);
    }
    public static MemoryAddress GetBoundSource$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.GetBoundSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBoundSource$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.GetBoundSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBoundSource GetBoundSource (MemorySegment segment) {
        return GetBoundSource.ofAddress(GetBoundSource$get(segment));
    }
    static final FunctionDescriptor UnbindSource$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle UnbindSource$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.UnbindSource$FUNC, false
    );
    public interface UnbindSource {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(UnbindSource fi) {
            return RuntimeHelper.upcallStub(UnbindSource.class, fi, IOleLinkVtbl.UnbindSource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(UnbindSource fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(UnbindSource.class, fi, IOleLinkVtbl.UnbindSource$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static UnbindSource ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleLinkVtbl.UnbindSource$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnbindSource$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("UnbindSource")));
    public static VarHandle UnbindSource$VH() {
        return IOleLinkVtbl.UnbindSource$VH;
    }
    public static MemoryAddress UnbindSource$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.UnbindSource$VH.get(seg);
    }
    public static void UnbindSource$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.UnbindSource$VH.set(seg, x);
    }
    public static MemoryAddress UnbindSource$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.UnbindSource$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnbindSource$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.UnbindSource$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnbindSource UnbindSource (MemorySegment segment) {
        return UnbindSource.ofAddress(UnbindSource$get(segment));
    }
    static final FunctionDescriptor Update$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Update$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleLinkVtbl.Update$FUNC, false
    );
    public interface Update {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(Update fi) {
            return RuntimeHelper.upcallStub(Update.class, fi, IOleLinkVtbl.Update$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Update fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Update.class, fi, IOleLinkVtbl.Update$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Update ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleLinkVtbl.Update$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Update$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Update")));
    public static VarHandle Update$VH() {
        return IOleLinkVtbl.Update$VH;
    }
    public static MemoryAddress Update$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.Update$VH.get(seg);
    }
    public static void Update$set( MemorySegment seg, MemoryAddress x) {
        IOleLinkVtbl.Update$VH.set(seg, x);
    }
    public static MemoryAddress Update$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleLinkVtbl.Update$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Update$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleLinkVtbl.Update$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Update Update (MemorySegment segment) {
        return Update.ofAddress(Update$get(segment));
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


