package com.itemis.jscdlib.internal.memory;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.Objects.requireNonNull;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public class StringSegment extends TypedMemorySegment<String> {

    private static final String INITIAL_VALUE = "";

    public StringSegment(MemoryAddress addrOfInitialValueSeg, ResourceScope scope) {
        super(addrOfInitialValueSeg, CLinker.toJavaString(addrOfInitialValueSeg).getBytes(UTF_8).length + 1, scope);
    }

    public StringSegment(String initialValue, ResourceScope scope) {
        super(CLinker.toCString(requireNonNull(initialValue, "initialValue"), requireNonNull(scope, "scope")));
    }

    public StringSegment(ResourceScope scope) {
        this(INITIAL_VALUE, scope);
    }

    @Override
    public final String getValue() {
        return CLinker.toJavaString(address());
    }

    public final StringSegment withValue(String newValue) {
        requireNonNull(newValue, "newValue");
        return new StringSegment(newValue, scope);
    }
}
