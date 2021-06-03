// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class assuan_malloc_hooks {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_POINTER.withName("malloc"),
        C_POINTER.withName("realloc"),
        C_POINTER.withName("free")
    ).withName("assuan_malloc_hooks");
    public static MemoryLayout $LAYOUT() {
        return assuan_malloc_hooks.$struct$LAYOUT;
    }
    static final FunctionDescriptor malloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle malloc$MH = RuntimeHelper.downcallHandle(
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        assuan_malloc_hooks.malloc$FUNC, false
    );
    public interface malloc {

        jdk.incubator.foreign.MemoryAddress apply(long x0);
        static MemoryAddress allocate(malloc fi) {
            return RuntimeHelper.upcallStub(malloc.class, fi, assuan_malloc_hooks.malloc$FUNC, "(J)Ljdk/incubator/foreign/MemoryAddress;");
        }
        static MemoryAddress allocate(malloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(malloc.class, fi, assuan_malloc_hooks.malloc$FUNC, "(J)Ljdk/incubator/foreign/MemoryAddress;", scope);
        }
        static malloc ofAddress(MemoryAddress addr) {
            return (long x0) -> {
                try {
                    return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.malloc$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle malloc$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("malloc")));
    public static VarHandle malloc$VH() {
        return assuan_malloc_hooks.malloc$VH;
    }
    public static MemoryAddress malloc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.malloc$VH.get(seg);
    }
    public static void malloc$set( MemorySegment seg, MemoryAddress x) {
        assuan_malloc_hooks.malloc$VH.set(seg, x);
    }
    public static MemoryAddress malloc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.malloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void malloc$set(MemorySegment seg, long index, MemoryAddress x) {
        assuan_malloc_hooks.malloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static malloc malloc (MemorySegment segment) {
        return malloc.ofAddress(malloc$get(segment));
    }
    static final FunctionDescriptor realloc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle realloc$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;",
        assuan_malloc_hooks.realloc$FUNC, false
    );
    public interface realloc {

        jdk.incubator.foreign.MemoryAddress apply(jdk.incubator.foreign.MemoryAddress x0, long x1);
        static MemoryAddress allocate(realloc fi) {
            return RuntimeHelper.upcallStub(realloc.class, fi, assuan_malloc_hooks.realloc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;");
        }
        static MemoryAddress allocate(realloc fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(realloc.class, fi, assuan_malloc_hooks.realloc$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;J)Ljdk/incubator/foreign/MemoryAddress;", scope);
        }
        static realloc ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0, long x1) -> {
                try {
                    return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.realloc$MH.invokeExact((Addressable)addr, x0, x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle realloc$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("realloc")));
    public static VarHandle realloc$VH() {
        return assuan_malloc_hooks.realloc$VH;
    }
    public static MemoryAddress realloc$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.realloc$VH.get(seg);
    }
    public static void realloc$set( MemorySegment seg, MemoryAddress x) {
        assuan_malloc_hooks.realloc$VH.set(seg, x);
    }
    public static MemoryAddress realloc$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.realloc$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void realloc$set(MemorySegment seg, long index, MemoryAddress x) {
        assuan_malloc_hooks.realloc$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static realloc realloc (MemorySegment segment) {
        return realloc.ofAddress(realloc$get(segment));
    }
    static final FunctionDescriptor free$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle free$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        assuan_malloc_hooks.free$FUNC, false
    );
    public interface free {

        void apply(jdk.incubator.foreign.MemoryAddress x0);
        static MemoryAddress allocate(free fi) {
            return RuntimeHelper.upcallStub(free.class, fi, assuan_malloc_hooks.free$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V");
        }
        static MemoryAddress allocate(free fi, ResourceScope scope) {
            return RuntimeHelper.upcallStub(free.class, fi, assuan_malloc_hooks.free$FUNC, "(Ljdk/incubator/foreign/MemoryAddress;)V", scope);
        }
        static free ofAddress(MemoryAddress addr) {
            return (jdk.incubator.foreign.MemoryAddress x0) -> {
                try {
                    assuan_malloc_hooks.free$MH.invokeExact((Addressable)addr, x0);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle free$VH = MemoryHandles.asAddressVarHandle($struct$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("free")));
    public static VarHandle free$VH() {
        return assuan_malloc_hooks.free$VH;
    }
    public static MemoryAddress free$get(MemorySegment seg) {
        return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.free$VH.get(seg);
    }
    public static void free$set( MemorySegment seg, MemoryAddress x) {
        assuan_malloc_hooks.free$VH.set(seg, x);
    }
    public static MemoryAddress free$get(MemorySegment seg, long index) {
        return (jdk.incubator.foreign.MemoryAddress)assuan_malloc_hooks.free$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void free$set(MemorySegment seg, long index, MemoryAddress x) {
        assuan_malloc_hooks.free$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static free free (MemorySegment segment) {
        return free.ofAddress(free$get(segment));
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


