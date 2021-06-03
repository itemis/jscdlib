// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IRunnableObjectVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetRunningClass"),
        C_POINTER.withName("Run"),
        C_POINTER.withName("IsRunning"),
        C_POINTER.withName("LockRunning"),
        C_POINTER.withName("SetContainedObject")
    ).withName("IRunnableObjectVtbl");
    public static MemoryLayout $LAYOUT() {
        return IRunnableObjectVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IRunnableObjectVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IRunnableObjectVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IRunnableObjectVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IRunnableObjectVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IRunnableObjectVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IRunnableObjectVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IRunnableObjectVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IRunnableObjectVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IRunnableObjectVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IRunnableObjectVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IRunnableObjectVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IRunnableObjectVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IRunnableObjectVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IRunnableObjectVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IRunnableObjectVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor GetRunningClass$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetRunningClass$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IRunnableObjectVtbl.GetRunningClass$FUNC, false
    );
    public interface GetRunningClass {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetRunningClass fi) {
            return RuntimeHelper.upcallStub(GetRunningClass.class, fi, IRunnableObjectVtbl.GetRunningClass$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetRunningClass fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetRunningClass.class, fi, IRunnableObjectVtbl.GetRunningClass$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetRunningClass ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IRunnableObjectVtbl.GetRunningClass$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetRunningClass$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetRunningClass")));
    public static VarHandle GetRunningClass$VH() {
        return IRunnableObjectVtbl.GetRunningClass$VH;
    }
    public static MemoryAddress GetRunningClass$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.GetRunningClass$VH.get(seg);
    }
    public static void GetRunningClass$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.GetRunningClass$VH.set(seg, x);
    }
    public static MemoryAddress GetRunningClass$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.GetRunningClass$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetRunningClass$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.GetRunningClass$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetRunningClass GetRunningClass (MemorySegment segment) {
        return GetRunningClass.ofAddress(GetRunningClass$get(segment));
    }
    static final FunctionDescriptor Run$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Run$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IRunnableObjectVtbl.Run$FUNC, false
    );
    public interface Run {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(Run fi) {
            return RuntimeHelper.upcallStub(Run.class, fi, IRunnableObjectVtbl.Run$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Run fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Run.class, fi, IRunnableObjectVtbl.Run$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Run ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IRunnableObjectVtbl.Run$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Run$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Run")));
    public static VarHandle Run$VH() {
        return IRunnableObjectVtbl.Run$VH;
    }
    public static MemoryAddress Run$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.Run$VH.get(seg);
    }
    public static void Run$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.Run$VH.set(seg, x);
    }
    public static MemoryAddress Run$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.Run$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Run$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.Run$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Run Run (MemorySegment segment) {
        return Run.ofAddress(Run$get(segment));
    }
    static final FunctionDescriptor IsRunning$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IsRunning$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IRunnableObjectVtbl.IsRunning$FUNC, false
    );
    public interface IsRunning {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(IsRunning fi) {
            return RuntimeHelper.upcallStub(IsRunning.class, fi, IRunnableObjectVtbl.IsRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(IsRunning fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(IsRunning.class, fi, IRunnableObjectVtbl.IsRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static IsRunning ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IRunnableObjectVtbl.IsRunning$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle IsRunning$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("IsRunning")));
    public static VarHandle IsRunning$VH() {
        return IRunnableObjectVtbl.IsRunning$VH;
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.IsRunning$VH.get(seg);
    }
    public static void IsRunning$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.IsRunning$VH.set(seg, x);
    }
    public static MemoryAddress IsRunning$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.IsRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void IsRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.IsRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static IsRunning IsRunning (MemorySegment segment) {
        return IsRunning.ofAddress(IsRunning$get(segment));
    }
    static final FunctionDescriptor LockRunning$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT,
        C_INT
    );
    static final MethodHandle LockRunning$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        IRunnableObjectVtbl.LockRunning$FUNC, false
    );
    public interface LockRunning {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1, int x2);
        static MemoryAddress allocate(LockRunning fi) {
            return RuntimeHelper.upcallStub(LockRunning.class, fi, IRunnableObjectVtbl.LockRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I");
        }
        static MemoryAddress allocate(LockRunning fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(LockRunning.class, fi, IRunnableObjectVtbl.LockRunning$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;II)I", scope);
        }
        static LockRunning ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1, int x2) -> {
                try {
                    return (int)IRunnableObjectVtbl.LockRunning$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockRunning$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("LockRunning")));
    public static VarHandle LockRunning$VH() {
        return IRunnableObjectVtbl.LockRunning$VH;
    }
    public static MemoryAddress LockRunning$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.LockRunning$VH.get(seg);
    }
    public static void LockRunning$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.LockRunning$VH.set(seg, x);
    }
    public static MemoryAddress LockRunning$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.LockRunning$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockRunning$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.LockRunning$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockRunning LockRunning (MemorySegment segment) {
        return LockRunning.ofAddress(LockRunning$get(segment));
    }
    static final FunctionDescriptor SetContainedObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetContainedObject$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IRunnableObjectVtbl.SetContainedObject$FUNC, false
    );
    public interface SetContainedObject {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(SetContainedObject fi) {
            return RuntimeHelper.upcallStub(SetContainedObject.class, fi, IRunnableObjectVtbl.SetContainedObject$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(SetContainedObject fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetContainedObject.class, fi, IRunnableObjectVtbl.SetContainedObject$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static SetContainedObject ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IRunnableObjectVtbl.SetContainedObject$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetContainedObject$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetContainedObject")));
    public static VarHandle SetContainedObject$VH() {
        return IRunnableObjectVtbl.SetContainedObject$VH;
    }
    public static MemoryAddress SetContainedObject$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.SetContainedObject$VH.get(seg);
    }
    public static void SetContainedObject$set( MemorySegment seg, MemoryAddress x) {
        IRunnableObjectVtbl.SetContainedObject$VH.set(seg, x);
    }
    public static MemoryAddress SetContainedObject$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IRunnableObjectVtbl.SetContainedObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetContainedObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IRunnableObjectVtbl.SetContainedObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetContainedObject SetContainedObject (MemorySegment segment) {
        return SetContainedObject.ofAddress(SetContainedObject$get(segment));
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


