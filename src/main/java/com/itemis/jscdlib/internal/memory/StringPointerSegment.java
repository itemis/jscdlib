package com.itemis.jscdlib.internal.memory;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public class StringPointerSegment extends PointerSegment<String> {

    public StringPointerSegment(ResourceScope scope) {
        super(scope);
    }

    public StringPointerSegment(MemoryAddress addr, ResourceScope scope) {
        super(addr, scope);
    }

    @Override
    public String dereference() {
        return CLinker.toJavaString(getContainedAddress());
    }
}
