package com.itemis.jscdlib.internal.memory;

import static java.util.Objects.requireNonNull;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayouts;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;

public class LongSegment extends TypedMutableMemorySegment<Long> {

    /**
     * When creating a {@link LongSegment}, its value will be set to this.
     */
    public static final long DEFAULT_VALUE = -1L;

    public LongSegment(ResourceScope scope) {
        super(MemoryLayouts.JAVA_LONG, scope);
        setValue(DEFAULT_VALUE);
    }

    public LongSegment(MemoryAddress addr, ResourceScope scope) {
        super(addr, MemoryLayouts.JAVA_LONG.byteSize(), scope);
    }

    public LongSegment(MemorySegment seg) {
        super(seg);
    }

    public LongSegment(long initialValue, ResourceScope scope) {
        this(scope);
        setValue(initialValue);
    }

    @Override
    public Long getValue() {
        return getReadOnlyBuf().getLong();
    }

    @Override
    public Long setValue(Long newValue) {
        requireNonNull(newValue, "newValue");
        var oldVal = getValue();
        getWriteableBuf().putLong(newValue);
        return oldVal;
    }
}
