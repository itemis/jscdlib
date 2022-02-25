package com.itemis.jscdlib.internal.memory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import jdk.incubator.foreign.ResourceScope;

public class IntPointerSegmentTest {

    private ResourceScope myScope;

    @BeforeEach
    public void setUp() {
        myScope = ResourceScope.newConfinedScope();
    }

    @AfterEach
    public void tearDown() {
        if (myScope.isAlive()) {
            myScope.close();
        }
    }

    @Test
    public void dereference_string_seg_usecase() {
        var intSeg = new IntSegment(myScope);
        var underTest = allocatePtrSeg();
        var expectedValue = 123;
        intSeg.setValue(expectedValue);

        underTest.pointTo(intSeg);

        assertThat(underTest.dereference()).isEqualTo(expectedValue);
    }

    @Test
    public void no_arg_constructor_creates_new_seg_containing_zero() {
        var underTest = allocatePtrSeg();
        assertThat(underTest.getValue()).isEqualTo(-1L);
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MIN_VALUE, Integer.MAX_VALUE})
    public void dereference_works_with_int_boundaries(int expectedValue) {
        var thisSegHoldsTheValue = allocateSeg();
        thisSegHoldsTheValue.setValue(expectedValue);
        var thisSegHoldsTheAddr = allocatePtrSeg();
        thisSegHoldsTheAddr.pointTo(thisSegHoldsTheValue);

        assertThat(thisSegHoldsTheAddr.dereference()).isEqualTo(expectedValue);
    }

    private IntSegment allocateSeg() {
        return new IntSegment(myScope);
    }

    private IntPointerSegment allocatePtrSeg() {
        return new IntPointerSegment(myScope);
    }
}
