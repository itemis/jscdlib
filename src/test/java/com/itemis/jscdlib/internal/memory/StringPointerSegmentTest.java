package com.itemis.jscdlib.internal.memory;

import static com.itemis.jscdlib.internal.memory.LongSegment.DEFAULT_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.ResourceScope;

public class StringPointerSegmentTest {

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
        var expectedValue = "expectedValue";
        var stringSeg = new StringSegment(expectedValue, myScope);
        var underTest = new StringPointerSegment(myScope);

        underTest.pointTo(stringSeg.address());

        assertThat(underTest.dereference()).isEqualTo(expectedValue);
    }

    @Test
    public void no_arg_constructor_creates_new_seg_containing_default_value() {
        var underTest = new StringPointerSegment(myScope);
        assertThat(underTest.getValue()).isEqualTo(DEFAULT_VALUE);
    }

    @Test
    public void dereference_returns_string_the_segment_points_to() {
        var testString = "testString";
        var segHoldsStr = CLinker.toCString(testString, myScope);
        var underTest = new StringPointerSegment(myScope);
        underTest.pointTo(segHoldsStr);

        assertThat(underTest.dereference()).isEqualTo(testString);
    }

    @Test
    public void test_constructor_with_addr_sets_contents_correctly() {
        long addr = 123L;
        MemoryAddress expectedAddr = MemoryAddress.ofLong(addr);
        var underTest = new StringPointerSegment(expectedAddr, myScope);
        assertThat(underTest.address()).isEqualTo(expectedAddr);
    }
}
