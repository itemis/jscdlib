// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IOleInPlaceUIWindowVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetWindow"),
        C_POINTER.withName("ContextSensitiveHelp"),
        C_POINTER.withName("GetBorder"),
        C_POINTER.withName("RequestBorderSpace"),
        C_POINTER.withName("SetBorderSpace"),
        C_POINTER.withName("SetActiveObject")
    ).withName("IOleInPlaceUIWindowVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleInPlaceUIWindowVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleInPlaceUIWindowVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleInPlaceUIWindowVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IOleInPlaceUIWindowVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleInPlaceUIWindowVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleInPlaceUIWindowVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IOleInPlaceUIWindowVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleInPlaceUIWindowVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleInPlaceUIWindowVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IOleInPlaceUIWindowVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor GetWindow$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetWindow$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.GetWindow$FUNC, false
    );
    public interface GetWindow {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetWindow fi) {
            return RuntimeHelper.upcallStub(GetWindow.class, fi, IOleInPlaceUIWindowVtbl.GetWindow$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetWindow fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetWindow.class, fi, IOleInPlaceUIWindowVtbl.GetWindow$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetWindow ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.GetWindow$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindow$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetWindow")));
    public static VarHandle GetWindow$VH() {
        return IOleInPlaceUIWindowVtbl.GetWindow$VH;
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetWindow$VH.get(seg);
    }
    public static void GetWindow$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetWindow$VH.set(seg, x);
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetWindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetWindow GetWindow (MemorySegment segment) {
        return GetWindow.ofAddress(GetWindow$get(segment));
    }
    static final FunctionDescriptor ContextSensitiveHelp$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ContextSensitiveHelp$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$FUNC, false
    );
    public interface ContextSensitiveHelp {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(ContextSensitiveHelp fi) {
            return RuntimeHelper.upcallStub(ContextSensitiveHelp.class, fi, IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(ContextSensitiveHelp fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ContextSensitiveHelp.class, fi, IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static ContextSensitiveHelp ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ContextSensitiveHelp$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ContextSensitiveHelp")));
    public static VarHandle ContextSensitiveHelp$VH() {
        return IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH;
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.get(seg);
    }
    public static void ContextSensitiveHelp$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.set(seg, x);
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSensitiveHelp$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.ContextSensitiveHelp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ContextSensitiveHelp ContextSensitiveHelp (MemorySegment segment) {
        return ContextSensitiveHelp.ofAddress(ContextSensitiveHelp$get(segment));
    }
    static final FunctionDescriptor GetBorder$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetBorder$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.GetBorder$FUNC, false
    );
    public interface GetBorder {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetBorder fi) {
            return RuntimeHelper.upcallStub(GetBorder.class, fi, IOleInPlaceUIWindowVtbl.GetBorder$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetBorder fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetBorder.class, fi, IOleInPlaceUIWindowVtbl.GetBorder$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetBorder ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.GetBorder$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetBorder$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetBorder")));
    public static VarHandle GetBorder$VH() {
        return IOleInPlaceUIWindowVtbl.GetBorder$VH;
    }
    public static MemoryAddress GetBorder$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetBorder$VH.get(seg);
    }
    public static void GetBorder$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetBorder$VH.set(seg, x);
    }
    public static MemoryAddress GetBorder$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.GetBorder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetBorder$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.GetBorder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static GetBorder GetBorder (MemorySegment segment) {
        return GetBorder.ofAddress(GetBorder$get(segment));
    }
    static final FunctionDescriptor RequestBorderSpace$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle RequestBorderSpace$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.RequestBorderSpace$FUNC, false
    );
    public interface RequestBorderSpace {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(RequestBorderSpace fi) {
            return RuntimeHelper.upcallStub(RequestBorderSpace.class, fi, IOleInPlaceUIWindowVtbl.RequestBorderSpace$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(RequestBorderSpace fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(RequestBorderSpace.class, fi, IOleInPlaceUIWindowVtbl.RequestBorderSpace$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static RequestBorderSpace ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.RequestBorderSpace$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle RequestBorderSpace$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("RequestBorderSpace")));
    public static VarHandle RequestBorderSpace$VH() {
        return IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH;
    }
    public static MemoryAddress RequestBorderSpace$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.get(seg);
    }
    public static void RequestBorderSpace$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.set(seg, x);
    }
    public static MemoryAddress RequestBorderSpace$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void RequestBorderSpace$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.RequestBorderSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static RequestBorderSpace RequestBorderSpace (MemorySegment segment) {
        return RequestBorderSpace.ofAddress(RequestBorderSpace$get(segment));
    }
    static final FunctionDescriptor SetBorderSpace$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetBorderSpace$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.SetBorderSpace$FUNC, false
    );
    public interface SetBorderSpace {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(SetBorderSpace fi) {
            return RuntimeHelper.upcallStub(SetBorderSpace.class, fi, IOleInPlaceUIWindowVtbl.SetBorderSpace$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetBorderSpace fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetBorderSpace.class, fi, IOleInPlaceUIWindowVtbl.SetBorderSpace$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetBorderSpace ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.SetBorderSpace$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetBorderSpace$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetBorderSpace")));
    public static VarHandle SetBorderSpace$VH() {
        return IOleInPlaceUIWindowVtbl.SetBorderSpace$VH;
    }
    public static MemoryAddress SetBorderSpace$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.get(seg);
    }
    public static void SetBorderSpace$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.set(seg, x);
    }
    public static MemoryAddress SetBorderSpace$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetBorderSpace$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetBorderSpace$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetBorderSpace SetBorderSpace (MemorySegment segment) {
        return SetBorderSpace.ofAddress(SetBorderSpace$get(segment));
    }
    static final FunctionDescriptor SetActiveObject$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetActiveObject$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceUIWindowVtbl.SetActiveObject$FUNC, false
    );
    public interface SetActiveObject {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(SetActiveObject fi) {
            return RuntimeHelper.upcallStub(SetActiveObject.class, fi, IOleInPlaceUIWindowVtbl.SetActiveObject$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(SetActiveObject fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetActiveObject.class, fi, IOleInPlaceUIWindowVtbl.SetActiveObject$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static SetActiveObject ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleInPlaceUIWindowVtbl.SetActiveObject$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetActiveObject$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetActiveObject")));
    public static VarHandle SetActiveObject$VH() {
        return IOleInPlaceUIWindowVtbl.SetActiveObject$VH;
    }
    public static MemoryAddress SetActiveObject$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetActiveObject$VH.get(seg);
    }
    public static void SetActiveObject$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetActiveObject$VH.set(seg, x);
    }
    public static MemoryAddress SetActiveObject$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceUIWindowVtbl.SetActiveObject$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetActiveObject$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceUIWindowVtbl.SetActiveObject$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetActiveObject SetActiveObject (MemorySegment segment) {
        return SetActiveObject.ofAddress(SetActiveObject$get(segment));
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


