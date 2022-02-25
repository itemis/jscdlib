package com.itemis.jscdlib.internal.memory;

import static java.util.Objects.requireNonNull;

import jdk.incubator.foreign.Addressable;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public abstract class PointerSegment<T> extends LongSegment implements Dereferenceable<T> {

    public PointerSegment(ResourceScope scope) {
        super(scope);
    }

    public PointerSegment(MemoryAddress addr, ResourceScope scope) {
        super(addr, scope);
    }

    public final MemoryAddress getContainedAddress() {
        return MemoryAddress.ofLong(getValue());
    }

    public void pointTo(MemoryAddress addr) {
        requireNonNull(addr, "addr");
        setValue(addr.toRawLongValue());
    }

    public void pointTo(Addressable seg) {
        requireNonNull(seg, "seg");
        setValue(seg.address().toRawLongValue());
    }
}
