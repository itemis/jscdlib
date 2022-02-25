package com.itemis.jscdlib.internal.memory;

import static java.util.Objects.requireNonNull;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayouts;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;

public class IntSegment extends TypedMutableMemorySegment<Integer> {

    private static final int DEFAULT_VALUE = -1;

    public IntSegment(ResourceScope scope) {
        super(MemoryLayouts.JAVA_INT, scope);
        setValue(DEFAULT_VALUE);
    }

    public IntSegment(MemoryAddress addr, ResourceScope scope) {
        super(addr, MemoryLayouts.JAVA_INT.byteSize(), scope);
    }

    public IntSegment(MemorySegment seg) {
        super(seg);
    }

    public IntSegment(int initialValue, ResourceScope scope) {
        this(scope);
        setValue(initialValue);
    }

    @Override
    public Integer getValue() {
        return getReadOnlyBuf().getInt();
    }

    @Override
    public Integer setValue(Integer newValue) {
        requireNonNull(newValue, "newValue");
        var oldVal = getValue();
        getWriteableBuf().putInt(newValue);
        return oldVal;
    }
}
