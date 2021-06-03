// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _BIDI_DATA {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("dwBidiType"),
        MemoryLayout.paddingLayout(32),
        MemoryLayout.unionLayout(
            C_INT.withName("bData"),
            C_LONG.withName("iData"),
            C_POINTER.withName("sData"),
            C_FLOAT.withName("fData"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbBuf"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pData")
            ).withName("biData")
        ).withName("u")
    ).withName("_BIDI_DATA");
    public static MemoryLayout $LAYOUT() {
        return _BIDI_DATA.$struct$LAYOUT;
    }
    static final VarHandle dwBidiType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("dwBidiType"));
    public static VarHandle dwBidiType$VH() {
        return _BIDI_DATA.dwBidiType$VH;
    }
    public static int dwBidiType$get(MemorySegment seg) {
        return (int)_BIDI_DATA.dwBidiType$VH.get(seg);
    }
    public static void dwBidiType$set( MemorySegment seg, int x) {
        _BIDI_DATA.dwBidiType$VH.set(seg, x);
    }
    public static int dwBidiType$get(MemorySegment seg, long index) {
        return (int)_BIDI_DATA.dwBidiType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void dwBidiType$set(MemorySegment seg, long index, int x) {
        _BIDI_DATA.dwBidiType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class u {

        static final MemoryLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            C_INT.withName("bData"),
            C_LONG.withName("iData"),
            C_POINTER.withName("sData"),
            C_FLOAT.withName("fData"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbBuf"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pData")
            ).withName("biData")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        static final VarHandle bData$VH = u$union$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("bData"));
        public static VarHandle bData$VH() {
            return u.bData$VH;
        }
        public static int bData$get(MemorySegment seg) {
            return (int)u.bData$VH.get(seg);
        }
        public static void bData$set( MemorySegment seg, int x) {
            u.bData$VH.set(seg, x);
        }
        public static int bData$get(MemorySegment seg, long index) {
            return (int)u.bData$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void bData$set(MemorySegment seg, long index, int x) {
            u.bData$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle iData$VH = u$union$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("iData"));
        public static VarHandle iData$VH() {
            return u.iData$VH;
        }
        public static int iData$get(MemorySegment seg) {
            return (int)u.iData$VH.get(seg);
        }
        public static void iData$set( MemorySegment seg, int x) {
            u.iData$VH.set(seg, x);
        }
        public static int iData$get(MemorySegment seg, long index) {
            return (int)u.iData$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void iData$set(MemorySegment seg, long index, int x) {
            u.iData$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle sData$VH = MemoryHandles.asAddressVarHandle(u$union$LAYOUT.varHandle(long.class, MemoryLayout.PathElement.groupElement("sData")));
        public static VarHandle sData$VH() {
            return u.sData$VH;
        }
        public static MemoryAddress sData$get(MemorySegment seg) {
            return (jdk.incubator.foreign.MemoryAddress)u.sData$VH.get(seg);
        }
        public static void sData$set( MemorySegment seg, MemoryAddress x) {
            u.sData$VH.set(seg, x);
        }
        public static MemoryAddress sData$get(MemorySegment seg, long index) {
            return (jdk.incubator.foreign.MemoryAddress)u.sData$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sData$set(MemorySegment seg, long index, MemoryAddress x) {
            u.sData$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle fData$VH = u$union$LAYOUT.varHandle(float.class, MemoryLayout.PathElement.groupElement("fData"));
        public static VarHandle fData$VH() {
            return u.fData$VH;
        }
        public static float fData$get(MemorySegment seg) {
            return (float)u.fData$VH.get(seg);
        }
        public static void fData$set( MemorySegment seg, float x) {
            u.fData$VH.set(seg, x);
        }
        public static float fData$get(MemorySegment seg, long index) {
            return (float)u.fData$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void fData$set(MemorySegment seg, long index, float x) {
            u.fData$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static MemorySegment biData$slice(MemorySegment seg) {
            return seg.asSlice(0, 16);
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

    public static MemorySegment u$slice(MemorySegment seg) {
        return seg.asSlice(8, 16);
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


