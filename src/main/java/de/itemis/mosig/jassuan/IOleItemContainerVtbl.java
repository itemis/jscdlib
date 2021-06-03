// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IOleItemContainerVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("ParseDisplayName"),
        C_POINTER.withName("EnumObjects"),
        C_POINTER.withName("LockContainer"),
        C_POINTER.withName("GetObjectA"),
        C_POINTER.withName("GetObjectStorage"),
        C_POINTER.withName("IsRunning")
    ).withName("IOleItemContainerVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleItemContainerVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleItemContainerVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleItemContainerVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleItemContainerVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IOleItemContainerVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleItemContainerVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleItemContainerVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleItemContainerVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IOleItemContainerVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleItemContainerVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleItemContainerVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleItemContainerVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IOleItemContainerVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor ParseDisplayName$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ParseDisplayName$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.ParseDisplayName$FUNC, false
    );
    public interface ParseDisplayName {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(ParseDisplayName fi) {
            return RuntimeHelper.upcallStub(ParseDisplayName.class, fi, IOleItemContainerVtbl.ParseDisplayName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(ParseDisplayName fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ParseDisplayName.class, fi, IOleItemContainerVtbl.ParseDisplayName$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static ParseDisplayName ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IOleItemContainerVtbl.ParseDisplayName$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ParseDisplayName$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ParseDisplayName")));
    public static VarHandle ParseDisplayName$VH() {
        return IOleItemContainerVtbl.ParseDisplayName$VH;
    }
    public static MemoryAddress ParseDisplayName$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.ParseDisplayName$VH.get(seg);
    }
    public static void ParseDisplayName$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.ParseDisplayName$VH.set(seg, x);
    }
    public static MemoryAddress ParseDisplayName$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.ParseDisplayName$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ParseDisplayName$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.ParseDisplayName$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ParseDisplayName ParseDisplayName (MemorySegment segment) {
        return ParseDisplayName.ofAddress(ParseDisplayName$get(segment));
    }
    static final FunctionDescriptor EnumObjects$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle EnumObjects$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.EnumObjects$FUNC, false
    );
    public interface EnumObjects {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(EnumObjects fi) {
            return RuntimeHelper.upcallStub(EnumObjects.class, fi, IOleItemContainerVtbl.EnumObjects$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(EnumObjects fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(EnumObjects.class, fi, IOleItemContainerVtbl.EnumObjects$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static EnumObjects ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleItemContainerVtbl.EnumObjects$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnumObjects$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("EnumObjects")));
    public static VarHandle EnumObjects$VH() {
        return IOleItemContainerVtbl.EnumObjects$VH;
    }
    public static MemoryAddress EnumObjects$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.EnumObjects$VH.get(seg);
    }
    public static void EnumObjects$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.EnumObjects$VH.set(seg, x);
    }
    public static MemoryAddress EnumObjects$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.EnumObjects$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnumObjects$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.EnumObjects$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnumObjects EnumObjects (MemorySegment segment) {
        return EnumObjects.ofAddress(EnumObjects$get(segment));
    }
    static final FunctionDescriptor LockContainer$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle LockContainer$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleItemContainerVtbl.LockContainer$FUNC, false
    );
    public interface LockContainer {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(LockContainer fi) {
            return RuntimeHelper.upcallStub(LockContainer.class, fi, IOleItemContainerVtbl.LockContainer$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(LockContainer fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(LockContainer.class, fi, IOleItemContainerVtbl.LockContainer$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static LockContainer ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleItemContainerVtbl.LockContainer$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockContainer$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("LockContainer")));
    public static VarHandle LockContainer$VH() {
        return IOleItemContainerVtbl.LockContainer$VH;
    }
    public static MemoryAddress LockContainer$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.LockContainer$VH.get(seg);
    }
    public static void LockContainer$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.LockContainer$VH.set(seg, x);
    }
    public static MemoryAddress LockContainer$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.LockContainer$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockContainer$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.LockContainer$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockContainer LockContainer (MemorySegment segment) {
        return LockContainer.ofAddress(LockContainer$get(segment));
    }
    static final FunctionDescriptor GetObjectA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetObjectA$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.GetObjectA$FUNC, false
    );
    public interface GetObjectA {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5);
        static MemoryAddress allocate(GetObjectA fi) {
            return RuntimeHelper.upcallStub(GetObjectA.class, fi, IOleItemContainerVtbl.GetObjectA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetObjectA fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetObjectA.class, fi, IOleItemContainerVtbl.GetObjectA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetObjectA ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4, jdk.incubator.foreign.MemoryAddress x5) -> {
                try {
                    return (int)IOleItemContainerVtbl.GetObjectA$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4, x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectA$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetObjectA")));
    public static VarHandle GetObjectA$VH() {
        return IOleItemContainerVtbl.GetObjectA$VH;
    }
    public static MemoryAddress GetObjectA$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectA$VH.get(seg);
    }
    public static void GetObjectA$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectA$VH.set(seg, x);
    }
    public static MemoryAddress GetObjectA$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectA$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectA GetObjectA (MemorySegment segment) {
        return GetObjectA.ofAddress(GetObjectA$get(segment));
    }
    static final FunctionDescriptor GetObjectStorage$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetObjectStorage$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.GetObjectStorage$FUNC, false
    );
    public interface GetObjectStorage {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(GetObjectStorage fi) {
            return RuntimeHelper.upcallStub(GetObjectStorage.class, fi, IOleItemContainerVtbl.GetObjectStorage$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetObjectStorage fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetObjectStorage.class, fi, IOleItemContainerVtbl.GetObjectStorage$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetObjectStorage ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IOleItemContainerVtbl.GetObjectStorage$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetObjectStorage$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetObjectStorage")));
    public static VarHandle GetObjectStorage$VH() {
        return IOleItemContainerVtbl.GetObjectStorage$VH;
    }
    public static MemoryAddress GetObjectStorage$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectStorage$VH.get(seg);
    }
    public static void GetObjectStorage$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectStorage$VH.set(seg, x);
    }
    public static MemoryAddress GetObjectStorage$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.GetObjectStorage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetObjectStorage$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.GetObjectStorage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetObjectStorage GetObjectStorage (MemorySegment segment) {
        return GetObjectStorage.ofAddress(GetObjectStorage$get(segment));
    }
    static final FunctionDescriptor IsRunning$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IsRunning$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleItemContainerVtbl.IsRunning$FUNC, false
    );
    public interface IsRunning {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(IsRunning fi) {
            return RuntimeHelper.upcallStub(IsRunning.class, fi, IOleItemContainerVtbl.IsRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(IsRunning fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(IsRunning.class, fi, IOleItemContainerVtbl.IsRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static IsRunning ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleItemContainerVtbl.IsRunning$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsRunning$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("IsRunning")));
    public static VarHandle IsRunning$VH() {
        return IOleItemContainerVtbl.IsRunning$VH;
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.IsRunning$VH.get(seg);
    }
    public static void IsRunning$set( MemorySegment seg, MemoryAddress x) {
        IOleItemContainerVtbl.IsRunning$VH.set(seg, x);
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleItemContainerVtbl.IsRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleItemContainerVtbl.IsRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsRunning IsRunning (MemorySegment segment) {
        return IsRunning.ofAddress(IsRunning$get(segment));
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


