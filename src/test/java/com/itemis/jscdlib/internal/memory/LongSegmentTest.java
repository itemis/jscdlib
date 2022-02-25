package com.itemis.jscdlib.internal.memory;

import static jdk.incubator.foreign.MemorySegment.allocateNative;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jdk.incubator.foreign.MemoryLayouts;
import jdk.incubator.foreign.ResourceScope;

public class LongSegmentTest {

    private static final Logger LOG = LoggerFactory.getLogger(LongSegmentTest.class);

    private ResourceScope testMemoryScope;

    private LongSegment underTest;

    @BeforeEach
    public void setUp() {
        testMemoryScope = ResourceScope.newConfinedScope();
        underTest = new LongSegment(testMemoryScope);
    }

    @AfterEach
    public void tearDown() {
        if (testMemoryScope != null && testMemoryScope.isAlive()) {
            try {
                testMemoryScope.close();
            } catch (Exception e) {
                LOG.warn("Possible ressource leak. Could not close test memory scope.", e);
            }
        }
    }

    @Test
    public void initial_value_is_minus_one() {
        var cut = new LongSegment(testMemoryScope);
        assertThat(cut.getValue()).isEqualTo(-1L);
    }

    @Test
    public void wrap_wraps_provided_segment() {
        var testSeg = allocateNative(MemoryLayouts.JAVA_LONG, testMemoryScope);

        var wrappingSeg = new LongSegment(testSeg);
        assertThat(wrappingSeg.address()).isEqualTo(testSeg.address());
    }

    @Test
    public void wrap_wraps_provided_addr() {
        var expectedVal = 123L;
        underTest.setValue(expectedVal);

        var wrappingSeg = new LongSegment(underTest.address(), testMemoryScope);
        assertThat(wrappingSeg.getValue()).isEqualTo(expectedVal);
        assertThat(wrappingSeg.address()).isEqualTo(underTest.address());
    }

    @Test
    public void getValue_getsValue_setValue_setsValue() {
        var expectedVal = Long.MAX_VALUE;
        underTest.setValue(expectedVal);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);

        expectedVal = Long.MIN_VALUE;
        underTest.setValue(expectedVal);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);
    }

    @Test
    public void setValue_does_not_accept_null() {
        assertThatThrownBy(() -> underTest.setValue(null)).isInstanceOf(NullPointerException.class).hasMessage("newValue");
    }

    @Test
    public void setValue_returns_old_value() {
        var oldValue = 123L;
        var newValue = 321L;
        underTest.setValue(oldValue);
        assertThat(underTest.setValue(newValue)).isEqualTo(oldValue);
    }

    @Test
    public void constructor_accepts_initial_value() {
        var expectedVal = 123L;
        underTest = new LongSegment(expectedVal, testMemoryScope);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);
    }
}
