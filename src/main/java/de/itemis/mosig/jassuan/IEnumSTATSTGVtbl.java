// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IEnumSTATSTGVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("Next"),
        C_POINTER.withName("Skip"),
        C_POINTER.withName("Reset"),
        C_POINTER.withName("Clone")
    ).withName("IEnumSTATSTGVtbl");
    public static MemoryLayout $LAYOUT() {
        return IEnumSTATSTGVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IEnumSTATSTGVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IEnumSTATSTGVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IEnumSTATSTGVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IEnumSTATSTGVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IEnumSTATSTGVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IEnumSTATSTGVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IEnumSTATSTGVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IEnumSTATSTGVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IEnumSTATSTGVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IEnumSTATSTGVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IEnumSTATSTGVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IEnumSTATSTGVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor Next$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Next$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IEnumSTATSTGVtbl.Next$FUNC, false
    );
    public interface Next {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(Next fi) {
            return RuntimeHelper.upcallStub(Next.class, fi, IEnumSTATSTGVtbl.Next$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Next fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Next.class, fi, IEnumSTATSTGVtbl.Next$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Next ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.Next$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Next$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Next")));
    public static VarHandle Next$VH() {
        return IEnumSTATSTGVtbl.Next$VH;
    }
    public static MemoryAddress Next$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Next$VH.get(seg);
    }
    public static void Next$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.Next$VH.set(seg, x);
    }
    public static MemoryAddress Next$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Next$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Next$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.Next$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Next Next (MemorySegment segment) {
        return Next.ofAddress(Next$get(segment));
    }
    static final FunctionDescriptor Skip$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle Skip$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IEnumSTATSTGVtbl.Skip$FUNC, false
    );
    public interface Skip {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(Skip fi) {
            return RuntimeHelper.upcallStub(Skip.class, fi, IEnumSTATSTGVtbl.Skip$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(Skip fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Skip.class, fi, IEnumSTATSTGVtbl.Skip$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static Skip ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.Skip$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Skip$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Skip")));
    public static VarHandle Skip$VH() {
        return IEnumSTATSTGVtbl.Skip$VH;
    }
    public static MemoryAddress Skip$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Skip$VH.get(seg);
    }
    public static void Skip$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.Skip$VH.set(seg, x);
    }
    public static MemoryAddress Skip$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Skip$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Skip$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.Skip$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Skip Skip (MemorySegment segment) {
        return Skip.ofAddress(Skip$get(segment));
    }
    static final FunctionDescriptor Reset$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Reset$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IEnumSTATSTGVtbl.Reset$FUNC, false
    );
    public interface Reset {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Reset fi) {
            return RuntimeHelper.upcallStub(Reset.class, fi, IEnumSTATSTGVtbl.Reset$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Reset fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Reset.class, fi, IEnumSTATSTGVtbl.Reset$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Reset ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.Reset$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Reset$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Reset")));
    public static VarHandle Reset$VH() {
        return IEnumSTATSTGVtbl.Reset$VH;
    }
    public static MemoryAddress Reset$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Reset$VH.get(seg);
    }
    public static void Reset$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.Reset$VH.set(seg, x);
    }
    public static MemoryAddress Reset$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Reset$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Reset$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.Reset$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Reset Reset (MemorySegment segment) {
        return Reset.ofAddress(Reset$get(segment));
    }
    static final FunctionDescriptor Clone$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Clone$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IEnumSTATSTGVtbl.Clone$FUNC, false
    );
    public interface Clone {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(Clone fi) {
            return RuntimeHelper.upcallStub(Clone.class, fi, IEnumSTATSTGVtbl.Clone$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Clone fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Clone.class, fi, IEnumSTATSTGVtbl.Clone$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Clone ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IEnumSTATSTGVtbl.Clone$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Clone$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Clone")));
    public static VarHandle Clone$VH() {
        return IEnumSTATSTGVtbl.Clone$VH;
    }
    public static MemoryAddress Clone$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Clone$VH.get(seg);
    }
    public static void Clone$set( MemorySegment seg, MemoryAddress x) {
        IEnumSTATSTGVtbl.Clone$VH.set(seg, x);
    }
    public static MemoryAddress Clone$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IEnumSTATSTGVtbl.Clone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemoryAddress x) {
        IEnumSTATSTGVtbl.Clone$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Clone Clone (MemorySegment segment) {
        return Clone.ofAddress(Clone$get(segment));
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


