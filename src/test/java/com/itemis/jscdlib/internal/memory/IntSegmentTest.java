package com.itemis.jscdlib.internal.memory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jdk.incubator.foreign.MemoryLayouts;
import jdk.incubator.foreign.MemorySegment;
import jdk.incubator.foreign.ResourceScope;

public class IntSegmentTest {

    private static final Logger LOG = LoggerFactory.getLogger(IntSegmentTest.class);

    private ResourceScope myScope;
    private IntSegment underTest;

    @BeforeEach
    public void setUp() {
        myScope = ResourceScope.newConfinedScope();
        underTest = new IntSegment(myScope);
    }

    @AfterEach
    public void tearDown() {
        if (myScope.isAlive()) {
            try {
                myScope.close();
            } catch (Exception e) {
                LOG.warn("Possible ressource leak. Could not close segment handle.", e);
            }
        }
    }

    @Test
    public void initial_value_is_minus_one() {
        assertThat(underTest.getValue()).isEqualTo(-1L);
    }

    @Test
    public void wrap_wraps_provided_segment() {
        var testSeg = MemorySegment.allocateNative(MemoryLayouts.JAVA_INT, myScope);
        var wrappingSeg = new IntSegment(testSeg);
        assertThat(wrappingSeg.address()).isEqualTo(testSeg.address());
    }

    @Test
    public void wrap_wraps_provided_addr() {
        var expectedVal = 123;
        underTest.setValue(expectedVal);
        var wrappingSeg = new IntSegment(underTest.address(), myScope);
        assertThat(wrappingSeg.getValue()).isEqualTo(expectedVal);
        assertThat(wrappingSeg.address()).isEqualTo(underTest.address());
    }

    @Test
    public void getValue_getsValue_setValue_setsValue() {
        var expectedVal = Integer.MAX_VALUE;
        underTest.setValue(expectedVal);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);

        expectedVal = Integer.MIN_VALUE;
        underTest.setValue(expectedVal);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);
    }

    @Test
    public void setValue_does_not_accept_null() {
        assertThatThrownBy(() -> underTest.setValue(null)).isInstanceOf(NullPointerException.class).hasMessage("newValue");
    }

    @Test
    public void setValue_returns_old_value() {
        var oldValue = 123;
        var newValue = 321;
        underTest.setValue(oldValue);
        assertThat(underTest.setValue(newValue)).isEqualTo(oldValue);
    }

    @Test
    public void constructor_accepts_initial_value() {
        var expectedVal = 123;
        underTest = new IntSegment(expectedVal, myScope);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);
    }
}
