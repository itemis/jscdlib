// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IOleInPlaceActiveObjectVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("GetWindow"),
        C_POINTER.withName("ContextSensitiveHelp"),
        C_POINTER.withName("TranslateAcceleratorA"),
        C_POINTER.withName("OnFrameWindowActivate"),
        C_POINTER.withName("OnDocWindowActivate"),
        C_POINTER.withName("ResizeBorder"),
        C_POINTER.withName("EnableModeless")
    ).withName("IOleInPlaceActiveObjectVtbl");
    public static MemoryLayout $LAYOUT() {
        return IOleInPlaceActiveObjectVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceActiveObjectVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleInPlaceActiveObjectVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IOleInPlaceActiveObjectVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IOleInPlaceActiveObjectVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceActiveObjectVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleInPlaceActiveObjectVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IOleInPlaceActiveObjectVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IOleInPlaceActiveObjectVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceActiveObjectVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleInPlaceActiveObjectVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IOleInPlaceActiveObjectVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IOleInPlaceActiveObjectVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
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
        IOleInPlaceActiveObjectVtbl.GetWindow$FUNC, false
    );
    public interface GetWindow {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(GetWindow fi) {
            return RuntimeHelper.upcallStub(GetWindow.class, fi, IOleInPlaceActiveObjectVtbl.GetWindow$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(GetWindow fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(GetWindow.class, fi, IOleInPlaceActiveObjectVtbl.GetWindow$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static GetWindow ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.GetWindow$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle GetWindow$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("GetWindow")));
    public static VarHandle GetWindow$VH() {
        return IOleInPlaceActiveObjectVtbl.GetWindow$VH;
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.GetWindow$VH.get(seg);
    }
    public static void GetWindow$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.GetWindow$VH.set(seg, x);
    }
    public static MemoryAddress GetWindow$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.GetWindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void GetWindow$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.GetWindow$VH.set(seg.asSlice(index*sizeof()), x);
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
        IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$FUNC, false
    );
    public interface ContextSensitiveHelp {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(ContextSensitiveHelp fi) {
            return RuntimeHelper.upcallStub(ContextSensitiveHelp.class, fi, IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(ContextSensitiveHelp fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ContextSensitiveHelp.class, fi, IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static ContextSensitiveHelp ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ContextSensitiveHelp$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ContextSensitiveHelp")));
    public static VarHandle ContextSensitiveHelp$VH() {
        return IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$VH;
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$VH.get(seg);
    }
    public static void ContextSensitiveHelp$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$VH.set(seg, x);
    }
    public static MemoryAddress ContextSensitiveHelp$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ContextSensitiveHelp$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.ContextSensitiveHelp$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ContextSensitiveHelp ContextSensitiveHelp (MemorySegment segment) {
        return ContextSensitiveHelp.ofAddress(ContextSensitiveHelp$get(segment));
    }
    static final FunctionDescriptor TranslateAcceleratorA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle TranslateAcceleratorA$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$FUNC, false
    );
    public interface TranslateAcceleratorA {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(TranslateAcceleratorA fi) {
            return RuntimeHelper.upcallStub(TranslateAcceleratorA.class, fi, IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(TranslateAcceleratorA fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(TranslateAcceleratorA.class, fi, IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static TranslateAcceleratorA ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle TranslateAcceleratorA$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("TranslateAcceleratorA")));
    public static VarHandle TranslateAcceleratorA$VH() {
        return IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$VH;
    }
    public static MemoryAddress TranslateAcceleratorA$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$VH.get(seg);
    }
    public static void TranslateAcceleratorA$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$VH.set(seg, x);
    }
    public static MemoryAddress TranslateAcceleratorA$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TranslateAcceleratorA$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.TranslateAcceleratorA$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static TranslateAcceleratorA TranslateAcceleratorA (MemorySegment segment) {
        return TranslateAcceleratorA.ofAddress(TranslateAcceleratorA$get(segment));
    }
    static final FunctionDescriptor OnFrameWindowActivate$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle OnFrameWindowActivate$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$FUNC, false
    );
    public interface OnFrameWindowActivate {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(OnFrameWindowActivate fi) {
            return RuntimeHelper.upcallStub(OnFrameWindowActivate.class, fi, IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(OnFrameWindowActivate fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnFrameWindowActivate.class, fi, IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static OnFrameWindowActivate ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnFrameWindowActivate$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnFrameWindowActivate")));
    public static VarHandle OnFrameWindowActivate$VH() {
        return IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$VH;
    }
    public static MemoryAddress OnFrameWindowActivate$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$VH.get(seg);
    }
    public static void OnFrameWindowActivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$VH.set(seg, x);
    }
    public static MemoryAddress OnFrameWindowActivate$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnFrameWindowActivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.OnFrameWindowActivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnFrameWindowActivate OnFrameWindowActivate (MemorySegment segment) {
        return OnFrameWindowActivate.ofAddress(OnFrameWindowActivate$get(segment));
    }
    static final FunctionDescriptor OnDocWindowActivate$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle OnDocWindowActivate$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$FUNC, false
    );
    public interface OnDocWindowActivate {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(OnDocWindowActivate fi) {
            return RuntimeHelper.upcallStub(OnDocWindowActivate.class, fi, IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(OnDocWindowActivate fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(OnDocWindowActivate.class, fi, IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static OnDocWindowActivate ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle OnDocWindowActivate$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("OnDocWindowActivate")));
    public static VarHandle OnDocWindowActivate$VH() {
        return IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$VH;
    }
    public static MemoryAddress OnDocWindowActivate$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$VH.get(seg);
    }
    public static void OnDocWindowActivate$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$VH.set(seg, x);
    }
    public static MemoryAddress OnDocWindowActivate$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void OnDocWindowActivate$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.OnDocWindowActivate$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static OnDocWindowActivate OnDocWindowActivate (MemorySegment segment) {
        return OnDocWindowActivate.ofAddress(OnDocWindowActivate$get(segment));
    }
    static final FunctionDescriptor ResizeBorder$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ResizeBorder$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleInPlaceActiveObjectVtbl.ResizeBorder$FUNC, false
    );
    public interface ResizeBorder {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3);
        static MemoryAddress allocate(ResizeBorder fi) {
            return RuntimeHelper.upcallStub(ResizeBorder.class, fi, IOleInPlaceActiveObjectVtbl.ResizeBorder$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(ResizeBorder fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(ResizeBorder.class, fi, IOleInPlaceActiveObjectVtbl.ResizeBorder$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static ResizeBorder ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2, int x3) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.ResizeBorder$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle ResizeBorder$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("ResizeBorder")));
    public static VarHandle ResizeBorder$VH() {
        return IOleInPlaceActiveObjectVtbl.ResizeBorder$VH;
    }
    public static MemoryAddress ResizeBorder$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.ResizeBorder$VH.get(seg);
    }
    public static void ResizeBorder$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.ResizeBorder$VH.set(seg, x);
    }
    public static MemoryAddress ResizeBorder$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.ResizeBorder$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ResizeBorder$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.ResizeBorder$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static ResizeBorder ResizeBorder (MemorySegment segment) {
        return ResizeBorder.ofAddress(ResizeBorder$get(segment));
    }
    static final FunctionDescriptor EnableModeless$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle EnableModeless$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IOleInPlaceActiveObjectVtbl.EnableModeless$FUNC, false
    );
    public interface EnableModeless {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(EnableModeless fi) {
            return RuntimeHelper.upcallStub(EnableModeless.class, fi, IOleInPlaceActiveObjectVtbl.EnableModeless$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(EnableModeless fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(EnableModeless.class, fi, IOleInPlaceActiveObjectVtbl.EnableModeless$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static EnableModeless ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IOleInPlaceActiveObjectVtbl.EnableModeless$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle EnableModeless$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("EnableModeless")));
    public static VarHandle EnableModeless$VH() {
        return IOleInPlaceActiveObjectVtbl.EnableModeless$VH;
    }
    public static MemoryAddress EnableModeless$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.EnableModeless$VH.get(seg);
    }
    public static void EnableModeless$set( MemorySegment seg, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.EnableModeless$VH.set(seg, x);
    }
    public static MemoryAddress EnableModeless$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IOleInPlaceActiveObjectVtbl.EnableModeless$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void EnableModeless$set(MemorySegment seg, long index, MemoryAddress x) {
        IOleInPlaceActiveObjectVtbl.EnableModeless$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static EnableModeless EnableModeless (MemorySegment segment) {
        return EnableModeless.ofAddress(EnableModeless$get(segment));
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


