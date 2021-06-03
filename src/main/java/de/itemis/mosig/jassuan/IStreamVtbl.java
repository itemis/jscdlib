// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class IStreamVtbl {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("QueryInterface"),
        C_POINTER.withName("AddRef"),
        C_POINTER.withName("Release"),
        C_POINTER.withName("Read"),
        C_POINTER.withName("Write"),
        C_POINTER.withName("Seek"),
        C_POINTER.withName("SetSize"),
        C_POINTER.withName("CopyTo"),
        C_POINTER.withName("Commit"),
        C_POINTER.withName("Revert"),
        C_POINTER.withName("LockRegion"),
        C_POINTER.withName("UnlockRegion"),
        C_POINTER.withName("Stat"),
        C_POINTER.withName("Clone")
    ).withName("IStreamVtbl");
    public static MemoryLayout $LAYOUT() {
        return IStreamVtbl.$struct$LAYOUT;
    }
    static final FunctionDescriptor QueryInterface$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle QueryInterface$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.QueryInterface$FUNC, false
    );
    public interface QueryInterface {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2);
        static MemoryAddress allocate(QueryInterface fi) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IStreamVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(QueryInterface fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(QueryInterface.class, fi, IStreamVtbl.QueryInterface$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static QueryInterface ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemoryAddress x2) -> {
                try {
                    return (int)IStreamVtbl.QueryInterface$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle QueryInterface$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("QueryInterface")));
    public static VarHandle QueryInterface$VH() {
        return IStreamVtbl.QueryInterface$VH;
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.QueryInterface$VH.get(seg);
    }
    public static void QueryInterface$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.QueryInterface$VH.set(seg, x);
    }
    public static MemoryAddress QueryInterface$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.QueryInterface$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void QueryInterface$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.QueryInterface$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static QueryInterface QueryInterface (MemorySegment segment) {
        return QueryInterface.ofAddress(QueryInterface$get(segment));
    }
    static final FunctionDescriptor AddRef$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle AddRef$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.AddRef$FUNC, false
    );
    public interface AddRef {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(AddRef fi) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IStreamVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(AddRef fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(AddRef.class, fi, IStreamVtbl.AddRef$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static AddRef ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IStreamVtbl.AddRef$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle AddRef$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("AddRef")));
    public static VarHandle AddRef$VH() {
        return IStreamVtbl.AddRef$VH;
    }
    public static MemoryAddress AddRef$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.AddRef$VH.get(seg);
    }
    public static void AddRef$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.AddRef$VH.set(seg, x);
    }
    public static MemoryAddress AddRef$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.AddRef$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void AddRef$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.AddRef$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static AddRef AddRef (MemorySegment segment) {
        return AddRef.ofAddress(AddRef$get(segment));
    }
    static final FunctionDescriptor Release$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Release$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.Release$FUNC, false
    );
    public interface Release {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Release fi) {
            return RuntimeHelper.upcallStub(Release.class, fi, IStreamVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Release fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Release.class, fi, IStreamVtbl.Release$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Release ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IStreamVtbl.Release$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Release$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Release")));
    public static VarHandle Release$VH() {
        return IStreamVtbl.Release$VH;
    }
    public static MemoryAddress Release$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Release$VH.get(seg);
    }
    public static void Release$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Release$VH.set(seg, x);
    }
    public static MemoryAddress Release$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Release$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Release$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Release$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Release Release (MemorySegment segment) {
        return Release.ofAddress(Release$get(segment));
    }
    static final FunctionDescriptor Read$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle Read$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.Read$FUNC, false
    );
    public interface Read {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(Read fi) {
            return RuntimeHelper.upcallStub(Read.class, fi, IStreamVtbl.Read$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Read fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Read.class, fi, IStreamVtbl.Read$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Read ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IStreamVtbl.Read$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Read$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Read")));
    public static VarHandle Read$VH() {
        return IStreamVtbl.Read$VH;
    }
    public static MemoryAddress Read$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Read$VH.get(seg);
    }
    public static void Read$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Read$VH.set(seg, x);
    }
    public static MemoryAddress Read$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Read$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Read$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Read$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Read Read (MemorySegment segment) {
        return Read.ofAddress(Read$get(segment));
    }
    static final FunctionDescriptor Write$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle Write$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.Write$FUNC, false
    );
    public interface Write {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(Write fi) {
            return RuntimeHelper.upcallStub(Write.class, fi, IStreamVtbl.Write$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Write fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Write.class, fi, IStreamVtbl.Write$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Write ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IStreamVtbl.Write$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Write$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Write")));
    public static VarHandle Write$VH() {
        return IStreamVtbl.Write$VH;
    }
    public static MemoryAddress Write$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Write$VH.get(seg);
    }
    public static void Write$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Write$VH.set(seg, x);
    }
    public static MemoryAddress Write$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Write$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Write$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Write$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Write Write (MemorySegment segment) {
        return Write.ofAddress(Write$get(segment));
    }
    static final FunctionDescriptor Seek$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_LARGE_INTEGER"),
        C_LONG,
        C_POINTER
    );
    static final MethodHandle Seek$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;ILjdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.Seek$FUNC, false
    );
    public interface Seek {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1, int x2, jdk.incubator.foreign.MemoryAddress x3);
        static MemoryAddress allocate(Seek fi) {
            return RuntimeHelper.upcallStub(Seek.class, fi, IStreamVtbl.Seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;ILjdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Seek fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Seek.class, fi, IStreamVtbl.Seek$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;ILjdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Seek ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1, int x2, jdk.incubator.foreign.MemoryAddress x3) -> {
                try {
                    return (int)IStreamVtbl.Seek$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Seek$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Seek")));
    public static VarHandle Seek$VH() {
        return IStreamVtbl.Seek$VH;
    }
    public static MemoryAddress Seek$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Seek$VH.get(seg);
    }
    public static void Seek$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Seek$VH.set(seg, x);
    }
    public static MemoryAddress Seek$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Seek$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Seek$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Seek$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Seek Seek (MemorySegment segment) {
        return Seek.ofAddress(Seek$get(segment));
    }
    static final FunctionDescriptor SetSize$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER")
    );
    static final MethodHandle SetSize$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;)I",
        IStreamVtbl.SetSize$FUNC, false
    );
    public interface SetSize {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1);
        static MemoryAddress allocate(SetSize fi) {
            return RuntimeHelper.upcallStub(SetSize.class, fi, IStreamVtbl.SetSize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;)I");
        }
        static MemoryAddress allocate(SetSize fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(SetSize.class, fi, IStreamVtbl.SetSize$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;)I", scope);
        }
        static SetSize ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1) -> {
                try {
                    return (int)IStreamVtbl.SetSize$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle SetSize$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("SetSize")));
    public static VarHandle SetSize$VH() {
        return IStreamVtbl.SetSize$VH;
    }
    public static MemoryAddress SetSize$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.SetSize$VH.get(seg);
    }
    public static void SetSize$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.SetSize$VH.set(seg, x);
    }
    public static MemoryAddress SetSize$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.SetSize$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void SetSize$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.SetSize$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static SetSize SetSize (MemorySegment segment) {
        return SetSize.ofAddress(SetSize$get(segment));
    }
    static final FunctionDescriptor CopyTo$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CopyTo$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.CopyTo$FUNC, false
    );
    public interface CopyTo {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemorySegment x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4);
        static MemoryAddress allocate(CopyTo fi) {
            return RuntimeHelper.upcallStub(CopyTo.class, fi, IStreamVtbl.CopyTo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(CopyTo fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(CopyTo.class, fi, IStreamVtbl.CopyTo$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static CopyTo ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, jdk.incubator.foreign.MemorySegment x2, jdk.incubator.foreign.MemoryAddress x3, jdk.incubator.foreign.MemoryAddress x4) -> {
                try {
                    return (int)IStreamVtbl.CopyTo$MH.invokeExact((Addressable)addr, x0, x1, x2, x3, x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle CopyTo$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("CopyTo")));
    public static VarHandle CopyTo$VH() {
        return IStreamVtbl.CopyTo$VH;
    }
    public static MemoryAddress CopyTo$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.CopyTo$VH.get(seg);
    }
    public static void CopyTo$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.CopyTo$VH.set(seg, x);
    }
    public static MemoryAddress CopyTo$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.CopyTo$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CopyTo$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.CopyTo$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static CopyTo CopyTo (MemorySegment segment) {
        return CopyTo.ofAddress(CopyTo$get(segment));
    }
    static final FunctionDescriptor Commit$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle Commit$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        IStreamVtbl.Commit$FUNC, false
    );
    public interface Commit {

        int apply(jdk.incubator.foreign.MemoryAddress x0, int x1);
        static MemoryAddress allocate(Commit fi) {
            return RuntimeHelper.upcallStub(Commit.class, fi, IStreamVtbl.Commit$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(Commit fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Commit.class, fi, IStreamVtbl.Commit$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static Commit ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, int x1) -> {
                try {
                    return (int)IStreamVtbl.Commit$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Commit$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Commit")));
    public static VarHandle Commit$VH() {
        return IStreamVtbl.Commit$VH;
    }
    public static MemoryAddress Commit$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Commit$VH.get(seg);
    }
    public static void Commit$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Commit$VH.set(seg, x);
    }
    public static MemoryAddress Commit$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Commit$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Commit$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Commit$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Commit Commit (MemorySegment segment) {
        return Commit.ofAddress(Commit$get(segment));
    }
    static final FunctionDescriptor Revert$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle Revert$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.Revert$FUNC, false
    );
    public interface Revert {

        int apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(Revert fi) {
            return RuntimeHelper.upcallStub(Revert.class, fi, IStreamVtbl.Revert$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Revert fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Revert.class, fi, IStreamVtbl.Revert$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Revert ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    return (int)IStreamVtbl.Revert$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Revert$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Revert")));
    public static VarHandle Revert$VH() {
        return IStreamVtbl.Revert$VH;
    }
    public static MemoryAddress Revert$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Revert$VH.get(seg);
    }
    public static void Revert$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Revert$VH.set(seg, x);
    }
    public static MemoryAddress Revert$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Revert$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Revert$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Revert$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Revert Revert (MemorySegment segment) {
        return Revert.ofAddress(Revert$get(segment));
    }
    static final FunctionDescriptor LockRegion$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        C_LONG
    );
    static final MethodHandle LockRegion$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I",
        IStreamVtbl.LockRegion$FUNC, false
    );
    public interface LockRegion {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1, jdk.incubator.foreign.MemorySegment x2, int x3);
        static MemoryAddress allocate(LockRegion fi) {
            return RuntimeHelper.upcallStub(LockRegion.class, fi, IStreamVtbl.LockRegion$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I");
        }
        static MemoryAddress allocate(LockRegion fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(LockRegion.class, fi, IStreamVtbl.LockRegion$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I", scope);
        }
        static LockRegion ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1, jdk.incubator.foreign.MemorySegment x2, int x3) -> {
                try {
                    return (int)IStreamVtbl.LockRegion$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle LockRegion$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("LockRegion")));
    public static VarHandle LockRegion$VH() {
        return IStreamVtbl.LockRegion$VH;
    }
    public static MemoryAddress LockRegion$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.LockRegion$VH.get(seg);
    }
    public static void LockRegion$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.LockRegion$VH.set(seg, x);
    }
    public static MemoryAddress LockRegion$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.LockRegion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void LockRegion$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.LockRegion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static LockRegion LockRegion (MemorySegment segment) {
        return LockRegion.ofAddress(LockRegion$get(segment));
    }
    static final FunctionDescriptor UnlockRegion$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        MemoryLayout.unionLayout(
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("$anon$0"),
            MemoryLayout.structLayout(
                C_LONG.withName("LowPart"),
                C_LONG.withName("HighPart")
            ).withName("u"),
            C_LONG_LONG.withName("QuadPart")
        ).withName("_ULARGE_INTEGER"),
        C_LONG
    );
    static final MethodHandle UnlockRegion$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I",
        IStreamVtbl.UnlockRegion$FUNC, false
    );
    public interface UnlockRegion {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1, jdk.incubator.foreign.MemorySegment x2, int x3);
        static MemoryAddress allocate(UnlockRegion fi) {
            return RuntimeHelper.upcallStub(UnlockRegion.class, fi, IStreamVtbl.UnlockRegion$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I");
        }
        static MemoryAddress allocate(UnlockRegion fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(UnlockRegion.class, fi, IStreamVtbl.UnlockRegion$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;I)I", scope);
        }
        static UnlockRegion ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemorySegment x1, jdk.incubator.foreign.MemorySegment x2, int x3) -> {
                try {
                    return (int)IStreamVtbl.UnlockRegion$MH.invokeExact((Addressable)addr, x0, x1, x2, x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle UnlockRegion$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("UnlockRegion")));
    public static VarHandle UnlockRegion$VH() {
        return IStreamVtbl.UnlockRegion$VH;
    }
    public static MemoryAddress UnlockRegion$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.UnlockRegion$VH.get(seg);
    }
    public static void UnlockRegion$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.UnlockRegion$VH.set(seg, x);
    }
    public static MemoryAddress UnlockRegion$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.UnlockRegion$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void UnlockRegion$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.UnlockRegion$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static UnlockRegion UnlockRegion (MemorySegment segment) {
        return UnlockRegion.ofAddress(UnlockRegion$get(segment));
    }
    static final FunctionDescriptor Stat$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle Stat$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        IStreamVtbl.Stat$FUNC, false
    );
    public interface Stat {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2);
        static MemoryAddress allocate(Stat fi) {
            return RuntimeHelper.upcallStub(Stat.class, fi, IStreamVtbl.Stat$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I");
        }
        static MemoryAddress allocate(Stat fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Stat.class, fi, IStreamVtbl.Stat$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I", scope);
        }
        static Stat ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1, int x2) -> {
                try {
                    return (int)IStreamVtbl.Stat$MH.invokeExact((Addressable)addr, x0, x1, x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Stat$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Stat")));
    public static VarHandle Stat$VH() {
        return IStreamVtbl.Stat$VH;
    }
    public static MemoryAddress Stat$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Stat$VH.get(seg);
    }
    public static void Stat$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Stat$VH.set(seg, x);
    }
    public static MemoryAddress Stat$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Stat$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Stat$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Stat$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static Stat Stat (MemorySegment segment) {
        return Stat.ofAddress(Stat$get(segment));
    }
    static final FunctionDescriptor Clone$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle Clone$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        IStreamVtbl.Clone$FUNC, false
    );
    public interface Clone {

        int apply(jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1);
        static MemoryAddress allocate(Clone fi) {
            return RuntimeHelper.upcallStub(Clone.class, fi, IStreamVtbl.Clone$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I");
        }
        static MemoryAddress allocate(Clone fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(Clone.class, fi, IStreamVtbl.Clone$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I", scope);
        }
        static Clone ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, jdk.incubator.foreign.MemoryAddress x1) -> {
                try {
                    return (int)IStreamVtbl.Clone$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle Clone$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("Clone")));
    public static VarHandle Clone$VH() {
        return IStreamVtbl.Clone$VH;
    }
    public static MemoryAddress Clone$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Clone$VH.get(seg);
    }
    public static void Clone$set( MemorySegment seg, MemoryAddress x) {
        IStreamVtbl.Clone$VH.set(seg, x);
    }
    public static MemoryAddress Clone$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)IStreamVtbl.Clone$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void Clone$set(MemorySegment seg, long index, MemoryAddress x) {
        IStreamVtbl.Clone$VH.set(seg.asSlice(index*sizeof()), x);
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


