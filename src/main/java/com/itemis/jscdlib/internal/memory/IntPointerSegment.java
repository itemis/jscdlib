package com.itemis.jscdlib.internal.memory;

import jdk.incubator.foreign.ResourceScope;

public class IntPointerSegment extends PointerSegment<Integer> {

    public IntPointerSegment(ResourceScope scope) {
        super(scope);
    }

    @Override
    public Integer dereference() {
        try (var localScope = ResourceScope.newConfinedScope()) {
            var intSeg = new IntSegment(getContainedAddress(), localScope);
            return intSeg.getValue();
        }
    }
}
