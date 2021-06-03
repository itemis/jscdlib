// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
public class _PERF_OBJECT_TYPE {

    static final MemoryLayout $struct$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("TotalByteLength"),
        C_LONG.withName("DefinitionLength"),
        C_LONG.withName("HeaderLength"),
        C_LONG.withName("ObjectNameTitleIndex"),
        C_LONG.withName("ObjectNameTitle"),
        C_LONG.withName("ObjectHelpTitleIndex"),
        C_LONG.withName("ObjectHelpTitle"),
        C_LONG.withName("DetailLevel"),
        C_LONG.withName("NumCounters"),
        C_LONG.withName("DefaultCounter"),
        C_LONG.withName("NumInstances"),
        C_LONG.withName("CodePage"),
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
        ).withName("PerfTime"),
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
        ).withName("PerfFreq")
    ).withName("_PERF_OBJECT_TYPE");
    public static MemoryLayout $LAYOUT() {
        return _PERF_OBJECT_TYPE.$struct$LAYOUT;
    }
    static final VarHandle TotalByteLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("TotalByteLength"));
    public static VarHandle TotalByteLength$VH() {
        return _PERF_OBJECT_TYPE.TotalByteLength$VH;
    }
    public static int TotalByteLength$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.TotalByteLength$VH.get(seg);
    }
    public static void TotalByteLength$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.TotalByteLength$VH.set(seg, x);
    }
    public static int TotalByteLength$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.TotalByteLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void TotalByteLength$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.TotalByteLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefinitionLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DefinitionLength"));
    public static VarHandle DefinitionLength$VH() {
        return _PERF_OBJECT_TYPE.DefinitionLength$VH;
    }
    public static int DefinitionLength$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.DefinitionLength$VH.get(seg);
    }
    public static void DefinitionLength$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.DefinitionLength$VH.set(seg, x);
    }
    public static int DefinitionLength$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.DefinitionLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefinitionLength$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.DefinitionLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle HeaderLength$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("HeaderLength"));
    public static VarHandle HeaderLength$VH() {
        return _PERF_OBJECT_TYPE.HeaderLength$VH;
    }
    public static int HeaderLength$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.HeaderLength$VH.get(seg);
    }
    public static void HeaderLength$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.HeaderLength$VH.set(seg, x);
    }
    public static int HeaderLength$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.HeaderLength$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void HeaderLength$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.HeaderLength$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectNameTitleIndex$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ObjectNameTitleIndex"));
    public static VarHandle ObjectNameTitleIndex$VH() {
        return _PERF_OBJECT_TYPE.ObjectNameTitleIndex$VH;
    }
    public static int ObjectNameTitleIndex$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.ObjectNameTitleIndex$VH.get(seg);
    }
    public static void ObjectNameTitleIndex$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.ObjectNameTitleIndex$VH.set(seg, x);
    }
    public static int ObjectNameTitleIndex$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.ObjectNameTitleIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectNameTitleIndex$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.ObjectNameTitleIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectNameTitle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ObjectNameTitle"));
    public static VarHandle ObjectNameTitle$VH() {
        return _PERF_OBJECT_TYPE.ObjectNameTitle$VH;
    }
    public static int ObjectNameTitle$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.ObjectNameTitle$VH.get(seg);
    }
    public static void ObjectNameTitle$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.ObjectNameTitle$VH.set(seg, x);
    }
    public static int ObjectNameTitle$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.ObjectNameTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectNameTitle$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.ObjectNameTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectHelpTitleIndex$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ObjectHelpTitleIndex"));
    public static VarHandle ObjectHelpTitleIndex$VH() {
        return _PERF_OBJECT_TYPE.ObjectHelpTitleIndex$VH;
    }
    public static int ObjectHelpTitleIndex$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.ObjectHelpTitleIndex$VH.get(seg);
    }
    public static void ObjectHelpTitleIndex$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.ObjectHelpTitleIndex$VH.set(seg, x);
    }
    public static int ObjectHelpTitleIndex$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.ObjectHelpTitleIndex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectHelpTitleIndex$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.ObjectHelpTitleIndex$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle ObjectHelpTitle$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("ObjectHelpTitle"));
    public static VarHandle ObjectHelpTitle$VH() {
        return _PERF_OBJECT_TYPE.ObjectHelpTitle$VH;
    }
    public static int ObjectHelpTitle$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.ObjectHelpTitle$VH.get(seg);
    }
    public static void ObjectHelpTitle$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.ObjectHelpTitle$VH.set(seg, x);
    }
    public static int ObjectHelpTitle$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.ObjectHelpTitle$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void ObjectHelpTitle$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.ObjectHelpTitle$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DetailLevel$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DetailLevel"));
    public static VarHandle DetailLevel$VH() {
        return _PERF_OBJECT_TYPE.DetailLevel$VH;
    }
    public static int DetailLevel$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.DetailLevel$VH.get(seg);
    }
    public static void DetailLevel$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.DetailLevel$VH.set(seg, x);
    }
    public static int DetailLevel$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.DetailLevel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DetailLevel$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.DetailLevel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumCounters$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumCounters"));
    public static VarHandle NumCounters$VH() {
        return _PERF_OBJECT_TYPE.NumCounters$VH;
    }
    public static int NumCounters$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.NumCounters$VH.get(seg);
    }
    public static void NumCounters$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.NumCounters$VH.set(seg, x);
    }
    public static int NumCounters$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.NumCounters$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumCounters$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.NumCounters$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle DefaultCounter$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("DefaultCounter"));
    public static VarHandle DefaultCounter$VH() {
        return _PERF_OBJECT_TYPE.DefaultCounter$VH;
    }
    public static int DefaultCounter$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.DefaultCounter$VH.get(seg);
    }
    public static void DefaultCounter$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.DefaultCounter$VH.set(seg, x);
    }
    public static int DefaultCounter$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.DefaultCounter$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void DefaultCounter$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.DefaultCounter$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle NumInstances$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("NumInstances"));
    public static VarHandle NumInstances$VH() {
        return _PERF_OBJECT_TYPE.NumInstances$VH;
    }
    public static int NumInstances$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.NumInstances$VH.get(seg);
    }
    public static void NumInstances$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.NumInstances$VH.set(seg, x);
    }
    public static int NumInstances$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.NumInstances$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void NumInstances$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.NumInstances$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle CodePage$VH = $struct$LAYOUT.varHandle(int.class, MemoryLayout.PathElement.groupElement("CodePage"));
    public static VarHandle CodePage$VH() {
        return _PERF_OBJECT_TYPE.CodePage$VH;
    }
    public static int CodePage$get(MemorySegment seg) {
        return (int)_PERF_OBJECT_TYPE.CodePage$VH.get(seg);
    }
    public static void CodePage$set( MemorySegment seg, int x) {
        _PERF_OBJECT_TYPE.CodePage$VH.set(seg, x);
    }
    public static int CodePage$get(MemorySegment seg, long index) {
        return (int)_PERF_OBJECT_TYPE.CodePage$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void CodePage$set(MemorySegment seg, long index, int x) {
        _PERF_OBJECT_TYPE.CodePage$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment PerfTime$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static MemorySegment PerfFreq$slice(MemorySegment seg) {
        return seg.asSlice(56, 8);
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


