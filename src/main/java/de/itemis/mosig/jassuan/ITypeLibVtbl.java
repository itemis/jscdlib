// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class ITypeLibVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetTypeInfoCount"),
        C_POINTER.withName("GetTypeInfo"),
        C_POINTER.withName("GetTypeInfoType"),
        C_POINTER.withName("GetTypeInfoOfGuid"),
        C_POINTER.withName("GetLibAttr"),
        C_POINTER.withName("GetTypeComp"),
        C_POINTER.withName("GetDocumentation"),
        C_POINTER.withName("IsName"),
        C_POINTER.withName("FindName"),
        C_POINTER.withName("ReleaseTLibAttr")
    ).withName("ITypeLibVtbl");
    public static MemoryLayout $LAYOUT() {
        return ITypeLibVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ITypeLibVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, ITypeLibVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)ITypeLibVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return ITypeLibVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ITypeLibVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, ITypeLibVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ITypeLibVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return ITypeLibVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, ITypeLibVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, ITypeLibVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ITypeLibVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return ITypeLibVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor GetTypeInfoCount$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle GetTypeInfoCount$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetTypeInfoCount$FUNC, false
    );
    public interface GetTypeInfoCount {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(GetTypeInfoCount fi) {
            return RuntimeHelper.upcallStub(GetTypeInfoCount.class, fi, ITypeLibVtbl.GetTypeInfoCount$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetTypeInfoCount fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetTypeInfoCount.class, fi, ITypeLibVtbl.GetTypeInfoCount$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetTypeInfoCount ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)ITypeLibVtbl.GetTypeInfoCount$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfoCount$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetTypeInfoCount")));
    public static VarHandle GetTypeInfoCount$VH() {
        return ITypeLibVtbl.GetTypeInfoCount$VH;
    }
    public static MemoryAddress GetTypeInfoCount$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfoCount$VH.get(seg);
    }
    public static void GetTypeInfoCount$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfoCount$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfoCount$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfoCount$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfoCount$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfoCount$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfoCount GetTypeInfoCount (MemorySegment segment) {
        return GetTypeInfoCount.ofAddress(GetTypeInfoCount$get(segment));
    }
    static final FunctionDescriptor GetTypeInfo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetTypeInfo$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetTypeInfo$FUNC, false
    );
    public interface GetTypeInfo {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(GetTypeInfo fi) {
            return RuntimeHelper.upcallStub(GetTypeInfo.class, fi, ITypeLibVtbl.GetTypeInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetTypeInfo fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetTypeInfo.class, fi, ITypeLibVtbl.GetTypeInfo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetTypeInfo ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)ITypeLibVtbl.GetTypeInfo$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetTypeInfo")));
    public static VarHandle GetTypeInfo$VH() {
        return ITypeLibVtbl.GetTypeInfo$VH;
    }
    public static MemoryAddress GetTypeInfo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfo$VH.get(seg);
    }
    public static void GetTypeInfo$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfo$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfo$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfo GetTypeInfo (MemorySegment segment) {
        return GetTypeInfo.ofAddress(GetTypeInfo$get(segment));
    }
    static final FunctionDescriptor GetTypeInfoType$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetTypeInfoType$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetTypeInfoType$FUNC, false
    );
    public interface GetTypeInfoType {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(GetTypeInfoType fi) {
            return RuntimeHelper.upcallStub(GetTypeInfoType.class, fi, ITypeLibVtbl.GetTypeInfoType$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetTypeInfoType fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetTypeInfoType.class, fi, ITypeLibVtbl.GetTypeInfoType$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetTypeInfoType ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)ITypeLibVtbl.GetTypeInfoType$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfoType$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetTypeInfoType")));
    public static VarHandle GetTypeInfoType$VH() {
        return ITypeLibVtbl.GetTypeInfoType$VH;
    }
    public static MemoryAddress GetTypeInfoType$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfoType$VH.get(seg);
    }
    public static void GetTypeInfoType$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfoType$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfoType$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfoType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfoType$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfoType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfoType GetTypeInfoType (MemorySegment segment) {
        return GetTypeInfoType.ofAddress(GetTypeInfoType$get(segment));
    }
    static final FunctionDescriptor GetTypeInfoOfGuid$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetTypeInfoOfGuid$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetTypeInfoOfGuid$FUNC, false
    );
    public interface GetTypeInfoOfGuid {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(GetTypeInfoOfGuid fi) {
            return RuntimeHelper.upcallStub(GetTypeInfoOfGuid.class, fi, ITypeLibVtbl.GetTypeInfoOfGuid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetTypeInfoOfGuid fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetTypeInfoOfGuid.class, fi, ITypeLibVtbl.GetTypeInfoOfGuid$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetTypeInfoOfGuid ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)ITypeLibVtbl.GetTypeInfoOfGuid$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeInfoOfGuid$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetTypeInfoOfGuid")));
    public static VarHandle GetTypeInfoOfGuid$VH() {
        return ITypeLibVtbl.GetTypeInfoOfGuid$VH;
    }
    public static MemoryAddress GetTypeInfoOfGuid$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfoOfGuid$VH.get(seg);
    }
    public static void GetTypeInfoOfGuid$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfoOfGuid$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeInfoOfGuid$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeInfoOfGuid$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeInfoOfGuid$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetTypeInfoOfGuid$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeInfoOfGuid GetTypeInfoOfGuid (MemorySegment segment) {
        return GetTypeInfoOfGuid.ofAddress(GetTypeInfoOfGuid$get(segment));
    }
    static final FunctionDescriptor GetLibAttr$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetLibAttr$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetLibAttr$FUNC, false
    );
    public interface GetLibAttr {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetLibAttr fi) {
            return RuntimeHelper.upcallStub(GetLibAttr.class, fi, ITypeLibVtbl.GetLibAttr$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetLibAttr fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetLibAttr.class, fi, ITypeLibVtbl.GetLibAttr$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetLibAttr ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)ITypeLibVtbl.GetLibAttr$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetLibAttr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetLibAttr")));
    public static VarHandle GetLibAttr$VH() {
        return ITypeLibVtbl.GetLibAttr$VH;
    }
    public static MemoryAddress GetLibAttr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetLibAttr$VH.get(seg);
    }
    public static void GetLibAttr$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetLibAttr$VH.set(seg, x);
    }
    public static MemoryAddress GetLibAttr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetLibAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetLibAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetLibAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetLibAttr GetLibAttr (MemorySegment segment) {
        return GetLibAttr.ofAddress(GetLibAttr$get(segment));
    }
    static final FunctionDescriptor GetTypeComp$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetTypeComp$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetTypeComp$FUNC, false
    );
    public interface GetTypeComp {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetTypeComp fi) {
            return RuntimeHelper.upcallStub(GetTypeComp.class, fi, ITypeLibVtbl.GetTypeComp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetTypeComp fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetTypeComp.class, fi, ITypeLibVtbl.GetTypeComp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetTypeComp ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)ITypeLibVtbl.GetTypeComp$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetTypeComp$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetTypeComp")));
    public static VarHandle GetTypeComp$VH() {
        return ITypeLibVtbl.GetTypeComp$VH;
    }
    public static MemoryAddress GetTypeComp$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeComp$VH.get(seg);
    }
    public static void GetTypeComp$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetTypeComp$VH.set(seg, x);
    }
    public static MemoryAddress GetTypeComp$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetTypeComp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetTypeComp$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetTypeComp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetTypeComp GetTypeComp (MemorySegment segment) {
        return GetTypeComp.ofAddress(GetTypeComp$get(segment));
    }
    static final FunctionDescriptor GetDocumentation$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetDocumentation$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.GetDocumentation$FUNC, false
    );
    public interface GetDocumentation {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
        static MemoryAddress allocate(GetDocumentation fi) {
            return RuntimeHelper.upcallStub(GetDocumentation.class, fi, ITypeLibVtbl.GetDocumentation$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetDocumentation fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetDocumentation.class, fi, ITypeLibVtbl.GetDocumentation$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetDocumentation ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
                try {
                    return (int)ITypeLibVtbl.GetDocumentation$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetDocumentation$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetDocumentation")));
    public static VarHandle GetDocumentation$VH() {
        return ITypeLibVtbl.GetDocumentation$VH;
    }
    public static MemoryAddress GetDocumentation$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetDocumentation$VH.get(seg);
    }
    public static void GetDocumentation$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.GetDocumentation$VH.set(seg, x);
    }
    public static MemoryAddress GetDocumentation$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.GetDocumentation$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetDocumentation$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.GetDocumentation$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetDocumentation GetDocumentation (MemorySegment segment) {
        return GetDocumentation.ofAddress(GetDocumentation$get(segment));
    }
    static final FunctionDescriptor IsName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle IsName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.IsName$FUNC, false
    );
    public interface IsName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(IsName fi) {
            return RuntimeHelper.upcallStub(IsName.class, fi, ITypeLibVtbl.IsName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(IsName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(IsName.class, fi, ITypeLibVtbl.IsName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static IsName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)ITypeLibVtbl.IsName$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("IsName")));
    public static VarHandle IsName$VH() {
        return ITypeLibVtbl.IsName$VH;
    }
    public static MemoryAddress IsName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.IsName$VH.get(seg);
    }
    public static void IsName$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.IsName$VH.set(seg, x);
    }
    public static MemoryAddress IsName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.IsName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsName$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.IsName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsName IsName (MemorySegment segment) {
        return IsName.ofAddress(IsName$get(segment));
    }
    static final FunctionDescriptor FindName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle FindName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        ITypeLibVtbl.FindName$FUNC, false
    );
    public interface FindName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
        static MemoryAddress allocate(FindName fi) {
            return RuntimeHelper.upcallStub(FindName.class, fi, ITypeLibVtbl.FindName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(FindName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(FindName.class, fi, ITypeLibVtbl.FindName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static FindName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
                try {
                    return (int)ITypeLibVtbl.FindName$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle FindName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("FindName")));
    public static VarHandle FindName$VH() {
        return ITypeLibVtbl.FindName$VH;
    }
    public static MemoryAddress FindName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.FindName$VH.get(seg);
    }
    public static void FindName$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.FindName$VH.set(seg, x);
    }
    public static MemoryAddress FindName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.FindName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void FindName$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.FindName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static FindName FindName (MemorySegment segment) {
        return FindName.ofAddress(FindName$get(segment));
    }
    static final FunctionDescriptor ReleaseTLibAttr$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ReleaseTLibAttr$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        ITypeLibVtbl.ReleaseTLibAttr$FUNC, false
    );
    public interface ReleaseTLibAttr {

        void apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(ReleaseTLibAttr fi) {
            return RuntimeHelper.upcallStub(ReleaseTLibAttr.class, fi, ITypeLibVtbl.ReleaseTLibAttr$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V");
        }
        static MemoryAddress allocate(ReleaseTLibAttr fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ReleaseTLibAttr.class, fi, ITypeLibVtbl.ReleaseTLibAttr$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static ReleaseTLibAttr ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    ITypeLibVtbl.ReleaseTLibAttr$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ReleaseTLibAttr$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ReleaseTLibAttr")));
    public static VarHandle ReleaseTLibAttr$VH() {
        return ITypeLibVtbl.ReleaseTLibAttr$VH;
    }
    public static MemoryAddress ReleaseTLibAttr$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.ReleaseTLibAttr$VH.get(seg);
    }
    public static void ReleaseTLibAttr$set( MemorySegment seg, MemoryAddress x) {
        ITypeLibVtbl.ReleaseTLibAttr$VH.set(seg, x);
    }
    public static MemoryAddress ReleaseTLibAttr$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)ITypeLibVtbl.ReleaseTLibAttr$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ReleaseTLibAttr$set(MemorySegment seg, long index, MemoryAddress x) {
        ITypeLibVtbl.ReleaseTLibAttr$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ReleaseTLibAttr ReleaseTLibAttr (MemorySegment segment) {
        return ReleaseTLibAttr.ofAddress(ReleaseTLibAttr$get(segment));
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


