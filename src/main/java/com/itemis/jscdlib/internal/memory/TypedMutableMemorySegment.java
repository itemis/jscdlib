package com.itemis.jscdlib.internal.memory;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;

public abstract class TypedMutableMemorySegment<TYPE> extends TypedMemorySegment<TYPE> implements ValueSegmentMutable<TYPE> {
    static final ByteOrder BYTE_ORDER = ByteOrder.nativeOrder();

    public TypedMutableMemorySegment(MemorySegment seg) {
        super(seg);
    }

    public TypedMutableMemorySegment(MemoryAddress addr, long byteSize, ResourceScope scope) {
        super(addr, byteSize, scope);
    }

    public TypedMutableMemorySegment(MemoryLayout layout, ResourceScope scope) {
        super(layout, scope);
    }

    public final ByteBuffer getWriteableBuf() {
        return segment.asByteBuffer().order(BYTE_ORDER);
    }
}
