// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IOleCacheVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("Cache"),
        C_POINTER.withName("Uncache"),
        C_POINTER.withName("EnumCache"),
        C_POINTER.withName("InitCache"),
        C_POINTER.withName("SetData")
    ).withName("IOleCacheVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleCacheVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleCacheVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleCacheVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleCacheVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleCacheVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IOleCacheVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleCacheVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleCacheVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleCacheVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleCacheVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IOleCacheVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleCacheVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleCacheVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleCacheVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleCacheVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IOleCacheVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor Cache$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle Cache$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IOleCacheVtbl.Cache$FUNC, false
    );
    public interface Cache {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(Cache fi) {
            return RuntimeHelper.upcallStub(Cache.class, fi, IOleCacheVtbl.Cache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Cache fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Cache.class, fi, IOleCacheVtbl.Cache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Cache ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IOleCacheVtbl.Cache$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Cache$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Cache")));
    public static VarHandle Cache$VH() {
        return IOleCacheVtbl.Cache$VH;
    }
    public static MemoryAddress Cache$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.Cache$VH.get(seg);
    }
    public static void Cache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.Cache$VH.set(seg, x);
    }
    public static MemoryAddress Cache$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.Cache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Cache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.Cache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Cache Cache (MemorySegment segment) {
        return Cache.ofAddress(Cache$get(segment));
    }
    static final FunctionDescriptor Uncache$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle Uncache$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleCacheVtbl.Uncache$FUNC, false
    );
    public interface Uncache {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(Uncache fi) {
            return RuntimeHelper.upcallStub(Uncache.class, fi, IOleCacheVtbl.Uncache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(Uncache fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Uncache.class, fi, IOleCacheVtbl.Uncache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static Uncache ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleCacheVtbl.Uncache$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Uncache$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Uncache")));
    public static VarHandle Uncache$VH() {
        return IOleCacheVtbl.Uncache$VH;
    }
    public static MemoryAddress Uncache$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.Uncache$VH.get(seg);
    }
    public static void Uncache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.Uncache$VH.set(seg, x);
    }
    public static MemoryAddress Uncache$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.Uncache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Uncache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.Uncache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Uncache Uncache (MemorySegment segment) {
        return Uncache.ofAddress(Uncache$get(segment));
    }
    static final FunctionDescriptor EnumCache$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle EnumCache$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleCacheVtbl.EnumCache$FUNC, false
    );
    public interface EnumCache {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(EnumCache fi) {
            return RuntimeHelper.upcallStub(EnumCache.class, fi, IOleCacheVtbl.EnumCache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(EnumCache fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(EnumCache.class, fi, IOleCacheVtbl.EnumCache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static EnumCache ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleCacheVtbl.EnumCache$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumCache$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("EnumCache")));
    public static VarHandle EnumCache$VH() {
        return IOleCacheVtbl.EnumCache$VH;
    }
    public static MemoryAddress EnumCache$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.EnumCache$VH.get(seg);
    }
    public static void EnumCache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.EnumCache$VH.set(seg, x);
    }
    public static MemoryAddress EnumCache$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.EnumCache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumCache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.EnumCache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumCache EnumCache (MemorySegment segment) {
        return EnumCache.ofAddress(EnumCache$get(segment));
    }
    static final FunctionDescriptor InitCache$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle InitCache$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleCacheVtbl.InitCache$FUNC, false
    );
    public interface InitCache {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(InitCache fi) {
            return RuntimeHelper.upcallStub(InitCache.class, fi, IOleCacheVtbl.InitCache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(InitCache fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(InitCache.class, fi, IOleCacheVtbl.InitCache$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static InitCache ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleCacheVtbl.InitCache$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle InitCache$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("InitCache")));
    public static VarHandle InitCache$VH() {
        return IOleCacheVtbl.InitCache$VH;
    }
    public static MemoryAddress InitCache$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.InitCache$VH.get(seg);
    }
    public static void InitCache$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.InitCache$VH.set(seg, x);
    }
    public static MemoryAddress InitCache$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.InitCache$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void InitCache$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.InitCache$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static InitCache InitCache (MemorySegment segment) {
        return InitCache.ofAddress(InitCache$get(segment));
    }
    static final FunctionDescriptor SetData$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetData$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleCacheVtbl.SetData$FUNC, false
    );
    public interface SetData {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
        static MemoryAddress allocate(SetData fi) {
            return RuntimeHelper.upcallStub(SetData.class, fi, IOleCacheVtbl.SetData$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(SetData fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetData.class, fi, IOleCacheVtbl.SetData$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static SetData ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
                try {
                    return (int)IOleCacheVtbl.SetData$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetData$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetData")));
    public static VarHandle SetData$VH() {
        return IOleCacheVtbl.SetData$VH;
    }
    public static MemoryAddress SetData$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.SetData$VH.get(seg);
    }
    public static void SetData$set( MemorySegment seg, MemoryAddress x) {
        IOleCacheVtbl.SetData$VH.set(seg, x);
    }
    public static MemoryAddress SetData$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleCacheVtbl.SetData$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetData$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleCacheVtbl.SetData$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetData SetData (MemorySegment segment) {
        return SetData.ofAddress(SetData$get(segment));
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


