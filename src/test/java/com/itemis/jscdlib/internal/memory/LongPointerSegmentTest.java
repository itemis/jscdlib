package com.itemis.jscdlib.internal.memory;

import static com.itemis.fluffyj.exceptions.ThrowablePrettyfier.pretty;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import jdk.incubator.foreign.ResourceScope;

public class LongPointerSegmentTest {

    private ResourceScope testMemoryScope;

    @BeforeEach
    public void setUp() {
        testMemoryScope = ResourceScope.newConfinedScope();
    }

    @AfterEach
    public void tearDown() {
        if (testMemoryScope.isAlive()) {
            try {
                testMemoryScope.close();
            } catch (Throwable t) {
                System.err.println("WARN: Possible ressource leak: Could not close test memory scope. Reason: " + pretty(t));
            }
        }
    }

    @Test
    public void dereference_long_seg_usecase() {
        var longSeg = new LongSegment(testMemoryScope);
        var underTest = new LongPointerSegment(testMemoryScope);
        var expectedValue = 123L;
        longSeg.setValue(expectedValue);

        underTest.pointTo(longSeg.address());

        assertThat(underTest.dereference()).isEqualTo(expectedValue);
    }

    @Test
    public void no_arg_constructor_creates_new_seg_containing_zero() {
        var underTest = new LongPointerSegment(testMemoryScope);
        assertThat(underTest.getValue()).isEqualTo(-1L);
    }

    @ParameterizedTest
    @ValueSource(longs = {Long.MIN_VALUE, Long.MAX_VALUE})
    public void dereference_works_with_long_boundaries(long expectedValue) {
        var thisSegHoldsTheValue = new LongSegment(testMemoryScope);
        thisSegHoldsTheValue.setValue(expectedValue);

        var underTest = new LongPointerSegment(testMemoryScope);
        underTest.pointTo(thisSegHoldsTheValue.address());

        assertThat(underTest.dereference()).isEqualTo(expectedValue);
    }
}
