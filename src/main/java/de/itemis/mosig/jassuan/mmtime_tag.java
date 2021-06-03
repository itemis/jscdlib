// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class mmtime_tag {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_INT.withName("wType"),
        MemoryLayout.unionLayout(
            C_LONG.withName("ms"),
            C_LONG.withName("sample"),
            C_LONG.withName("cb"),
            C_LONG.withName("ticks"),
            MemoryLayout.structLayout(
                C_CHAR.withName("hour"),
                C_CHAR.withName("min"),
                C_CHAR.withName("sec"),
                C_CHAR.withName("frame"),
                C_CHAR.withName("fps"),
                C_CHAR.withName("dummy"),
                MemoryLayout.sequenceLayout(2, C_CHAR).withName("pad")
            ).withName("smpte"),
            MemoryLayout.structLayout(
                C_LONG.withName("songptrpos")
            ).withName("midi")
        ).withName("u")
    ).withName("mmtime_tag");
    public static MemoryLayout $LAYOUT() {
        return mmtime_tag.$struct$LAYOUT;
    }
    static final VarHandle wType$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("wType"));
    public static VarHandle wType$VH() {
        return mmtime_tag.wType$VH;
    }
    public static int wType$get(MemorySegment seg) {
        return (int)mmtime_tag.wType$VH.get(seg);
    }
    public static void wType$set( MemorySegment seg, int x) {
        mmtime_tag.wType$VH.set(seg, x);
    }
    public static int wType$get(MemorySegment seg, long index) {
        return (int)mmtime_tag.wType$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void wType$set(MemorySegment seg, long index, int x) {
        mmtime_tag.wType$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static class u {

        static final MemoryLayout u$union$LAYOUT = MemoryLayout.unionLayout(
            C_LONG.withName("ms"),
            C_LONG.withName("sample"),
            C_LONG.withName("cb"),
            C_LONG.withName("ticks"),
            MemoryLayout.structLayout(
                C_CHAR.withName("hour"),
                C_CHAR.withName("min"),
                C_CHAR.withName("sec"),
                C_CHAR.withName("frame"),
                C_CHAR.withName("fps"),
                C_CHAR.withName("dummy"),
                MemoryLayout.sequenceLayout(2, C_CHAR).withName("pad")
            ).withName("smpte"),
            MemoryLayout.structLayout(
                C_LONG.withName("songptrpos")
            ).withName("midi")
        );
        public static MemoryLayout $LAYOUT() {
            return u.u$union$LAYOUT;
        }
        static final VarHandle ms$VH = u$union$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ms"));
        public static VarHandle ms$VH() {
            return u.ms$VH;
        }
        public static int ms$get(MemorySegment seg) {
            return (int)u.ms$VH.get(seg);
        }
        public static void ms$set( MemorySegment seg, int x) {
            u.ms$VH.set(seg, x);
        }
        public static int ms$get(MemorySegment seg, long index) {
            return (int)u.ms$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ms$set(MemorySegment seg, long index, int x) {
            u.ms$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle sample$VH = u$union$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("sample"));
        public static VarHandle sample$VH() {
            return u.sample$VH;
        }
        public static int sample$get(MemorySegment seg) {
            return (int)u.sample$VH.get(seg);
        }
        public static void sample$set( MemorySegment seg, int x) {
            u.sample$VH.set(seg, x);
        }
        public static int sample$get(MemorySegment seg, long index) {
            return (int)u.sample$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void sample$set(MemorySegment seg, long index, int x) {
            u.sample$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle cb$VH = u$union$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("cb"));
        public static VarHandle cb$VH() {
            return u.cb$VH;
        }
        public static int cb$get(MemorySegment seg) {
            return (int)u.cb$VH.get(seg);
        }
        public static void cb$set( MemorySegment seg, int x) {
            u.cb$VH.set(seg, x);
        }
        public static int cb$get(MemorySegment seg, long index) {
            return (int)u.cb$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void cb$set(MemorySegment seg, long index, int x) {
            u.cb$VH.set(seg.asSlice(index*sizeof()), x);
        }
        static final VarHandle ticks$VH = u$union$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ticks"));
        public static VarHandle ticks$VH() {
            return u.ticks$VH;
        }
        public static int ticks$get(MemorySegment seg) {
            return (int)u.ticks$VH.get(seg);
        }
        public static void ticks$set( MemorySegment seg, int x) {
            u.ticks$VH.set(seg, x);
        }
        public static int ticks$get(MemorySegment seg, long index) {
            return (int)u.ticks$VH.get(seg.asSlice(index*sizeof()));
        }
        public static void ticks$set(MemorySegment seg, long index, int x) {
            u.ticks$VH.set(seg.asSlice(index*sizeof()), x);
        }
        public static class smpte {

            static final MemoryLayout u$smpte$struct$LAYOUT = MemoryLayout.structLayout(
                C_CHAR.withName("hour"),
                C_CHAR.withName("min"),
                C_CHAR.withName("sec"),
                C_CHAR.withName("frame"),
                C_CHAR.withName("fps"),
                C_CHAR.withName("dummy"),
                MemoryLayout.sequenceLayout(2, C_CHAR).withName("pad")
            );
            public static MemoryLayout $LAYOUT() {
                return smpte.u$smpte$struct$LAYOUT;
            }
            static final VarHandle hour$VH = u$smpte$struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("hour"));
            public static VarHandle hour$VH() {
                return smpte.hour$VH;
            }
            public static byte hour$get(MemorySegment seg) {
                return (byte)smpte.hour$VH.get(seg);
            }
            public static void hour$set( MemorySegment seg, byte x) {
                smpte.hour$VH.set(seg, x);
            }
            public static byte hour$get(MemorySegment seg, long index) {
                return (byte)smpte.hour$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void hour$set(MemorySegment seg, long index, byte x) {
                smpte.hour$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle min$VH = u$smpte$struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("min"));
            public static VarHandle min$VH() {
                return smpte.min$VH;
            }
            public static byte min$get(MemorySegment seg) {
                return (byte)smpte.min$VH.get(seg);
            }
            public static void min$set( MemorySegment seg, byte x) {
                smpte.min$VH.set(seg, x);
            }
            public static byte min$get(MemorySegment seg, long index) {
                return (byte)smpte.min$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void min$set(MemorySegment seg, long index, byte x) {
                smpte.min$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle sec$VH = u$smpte$struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("sec"));
            public static VarHandle sec$VH() {
                return smpte.sec$VH;
            }
            public static byte sec$get(MemorySegment seg) {
                return (byte)smpte.sec$VH.get(seg);
            }
            public static void sec$set( MemorySegment seg, byte x) {
                smpte.sec$VH.set(seg, x);
            }
            public static byte sec$get(MemorySegment seg, long index) {
                return (byte)smpte.sec$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void sec$set(MemorySegment seg, long index, byte x) {
                smpte.sec$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle frame$VH = u$smpte$struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("frame"));
            public static VarHandle frame$VH() {
                return smpte.frame$VH;
            }
            public static byte frame$get(MemorySegment seg) {
                return (byte)smpte.frame$VH.get(seg);
            }
            public static void frame$set( MemorySegment seg, byte x) {
                smpte.frame$VH.set(seg, x);
            }
            public static byte frame$get(MemorySegment seg, long index) {
                return (byte)smpte.frame$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void frame$set(MemorySegment seg, long index, byte x) {
                smpte.frame$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle fps$VH = u$smpte$struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("fps"));
            public static VarHandle fps$VH() {
                return smpte.fps$VH;
            }
            public static byte fps$get(MemorySegment seg) {
                return (byte)smpte.fps$VH.get(seg);
            }
            public static void fps$set( MemorySegment seg, byte x) {
                smpte.fps$VH.set(seg, x);
            }
            public static byte fps$get(MemorySegment seg, long index) {
                return (byte)smpte.fps$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void fps$set(MemorySegment seg, long index, byte x) {
                smpte.fps$VH.set(seg.asSlice(index*sizeof()), x);
            }
            static final VarHandle dummy$VH = u$smpte$struct$LAYOUT.varHandle(byte.class, MemoryLayout.PathElement.groupElement("dummy"));
            public static VarHandle dummy$VH() {
                return smpte.dummy$VH;
            }
            public static byte dummy$get(MemorySegment seg) {
                return (byte)smpte.dummy$VH.get(seg);
            }
            public static void dummy$set( MemorySegment seg, byte x) {
                smpte.dummy$VH.set(seg, x);
            }
            public static byte dummy$get(MemorySegment seg, long index) {
                return (byte)smpte.dummy$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void dummy$set(MemorySegment seg, long index, byte x) {
                smpte.dummy$VH.set(seg.asSlice(index*sizeof()), x);
            }
            public static MemorySegment pad$slice(MemorySegment seg) {
                return seg.asSlice(6, 2);
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

        public static MemorySegment smpte$slice(MemorySegment seg) {
            return seg.asSlice(0, 8);
        }
        public static class midi {

            static final MemoryLayout u$midi$struct$LAYOUT = MemoryLayout.structLayout(
                C_LONG.withName("songptrpos")
            );
            public static MemoryLayout $LAYOUT() {
                return midi.u$midi$struct$LAYOUT;
            }
            static final VarHandle songptrpos$VH = u$midi$struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("songptrpos"));
            public static VarHandle songptrpos$VH() {
                return midi.songptrpos$VH;
            }
            public static int songptrpos$get(MemorySegment seg) {
                return (int)midi.songptrpos$VH.get(seg);
            }
            public static void songptrpos$set( MemorySegment seg, int x) {
                midi.songptrpos$VH.set(seg, x);
            }
            public static int songptrpos$get(MemorySegment seg, long index) {
                return (int)midi.songptrpos$VH.get(seg.asSlice(index*sizeof()));
            }
            public static void songptrpos$set(MemorySegment seg, long index, int x) {
                midi.songptrpos$VH.set(seg.asSlice(index*sizeof()), x);
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

        public static MemorySegment midi$slice(MemorySegment seg) {
            return seg.asSlice(0, 4);
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
        return seg.asSlice(4, 8);
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


