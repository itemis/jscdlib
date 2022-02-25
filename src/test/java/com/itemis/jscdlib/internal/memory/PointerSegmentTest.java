package com.itemis.jscdlib.internal.memory;

import static com.itemis.jscdlib.internal.memory.LongSegment.DEFAULT_VALUE;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jdk.incubator.foreign.MemoryAddress;
import jdk.incubator.foreign.MemoryLayouts;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;

public class PointerSegmentTest {

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
    public void pointTo_addr_changes_contained_address() {
        var expectedAddr = MemoryAddress.ofLong(123L);
        var underTest = constructSeg();
        underTest.pointTo(expectedAddr);

        assertThat(underTest.getContainedAddress()).isEqualTo(expectedAddr);
        assertThat(underTest.getValue()).isEqualTo(expectedAddr.toRawLongValue());
    }

    @Test
    public void pointTo_seg_changes_contained_address_to_address_of_seg() {
        var testSeg = MemorySegment.allocateNative(MemoryLayouts.JAVA_LONG, myScope);
        var expectedAddr = testSeg.address();
        var underTest = constructSeg();
        underTest.pointTo(testSeg);

        assertThat(underTest.getContainedAddress()).isEqualTo(expectedAddr);
        assertThat(underTest.getValue()).isEqualTo(expectedAddr.toRawLongValue());
    }

    @Test
    public void no_arg_constructor_creates_new_seg_with_default_value() {
        var underTest = constructSeg();
        assertThat(underTest.getValue()).isEqualTo(DEFAULT_VALUE);
    }

    @Test
    public void getContainedAddress_returns_contained_address() {
        var expectedValue = 123L;
        var underTest = constructSeg();
        underTest.setValue(expectedValue);
        assertThat(underTest.getContainedAddress().toRawLongValue()).isEqualTo(expectedValue);
    }

    @Test
    public void constructor_with_addr_sets_addr_correctly() {
        long addr = 123L;
        MemoryAddress expectedAddr = MemoryAddress.ofLong(addr);
        var underTest = constructSeg(expectedAddr);
        assertThat(underTest.address()).isEqualTo(expectedAddr);
    }

    @Test
    public void test_addr_constructor_does_not_accept_null() {
        assertThatThrownBy(() -> constructSeg(null)).isInstanceOf(NullPointerException.class).hasMessage("addr");
    }

    private PointerSegment<Object> constructSeg() {
        return new PointerSegment<Object>(myScope) {
            @Override
            public Object dereference() {
                return null;
            }
        };
    }

    private PointerSegment<Object> constructSeg(MemoryAddress addr) {
        return new PointerSegment<>(addr, myScope) {
            @Override
            public Object dereference() {
                return null;
            }
        };
    }
}
