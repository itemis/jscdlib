package com.itemis.jscdlib.internal.memory;

import static com.google.common.base.Preconditions.checkArgument;
import static java.util.Objects.requireNonNull;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayout;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;

public abstract class TypedMemorySegment<TYPE> implements Addressable, ValueSegment<TYPE> {
    static final ByteOrder BYTE_ORDER = ByteOrder.nativeOrder();

    final ResourceScope scope;
    final MemorySegment segment;

    public TypedMemorySegment(MemorySegment seg) {
        this.segment = requireNonNull(seg, "seg");
        this.scope = seg.scope();
    }

    public TypedMemorySegment(MemoryAddress addr, long byteSize, ResourceScope scope) {
        requireNonNull(addr, "addr");
        checkArgument(addr != MemoryAddress.NULL, "Instances of this class do not work with the NULL address.");
        checkArgument(byteSize > 0, "byteSize must be greater than 0");
        this.scope = requireNonNull(scope, "scope");
        segment = addr.asSegment(byteSize, this.scope);
    }

    public TypedMemorySegment(MemoryLayout layout, ResourceScope scope) {
        requireNonNull(layout, "layout");
        this.scope = requireNonNull(scope, "scope");
        segment = MemorySegment.allocateNative(layout, this.scope);
    }

    public final ByteBuffer getReadOnlyBuf() {
        return segment.asByteBuffer().asReadOnlyBuffer().order(BYTE_ORDER);
    }

    @Override
    public final MemoryAddress address() {
        return segment.address();
    }

    public final long byteSize() {
        return segment.byteSize();
    }
}
