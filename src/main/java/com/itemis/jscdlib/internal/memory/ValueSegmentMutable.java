package com.itemis.jscdlib.internal.memory;

public interface ValueSegmentMutable<T> extends ValueSegment<T> {

    T setValue(T newValue);
}
