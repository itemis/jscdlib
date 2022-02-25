package com.itemis.jscdlib.internal.memory;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public class LongPointerSegment extends PointerSegment<Long> {

    public LongPointerSegment(ResourceScope scope) {
        super(scope);
    }

    public LongPointerSegment(MemoryAddress addr, ResourceScope scope) {
        super(addr, scope);
    }

    @Override
    public Long dereference() {
        try (var scope = ResourceScope.newConfinedScope()) {
            var longSeg = new LongSegment(getContainedAddress(), scope);
            return longSeg.getValue();
        }
    }
}
