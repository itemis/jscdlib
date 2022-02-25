package com.itemis.jscdlib.internal.memory;

import static com.itemis.fluffyj.tests.FluffyTestHelper.assertNullArgNotAccepted;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;

public class StringSegmentTest {

    private static final Logger LOG = LoggerFactory.getLogger(StringSegmentTest.class);

    private ResourceScope myScope;
    private StringSegment underTest;

    @BeforeEach
    public void setUp() {
        myScope = ResourceScope.newConfinedScope();
        underTest = new StringSegment(myScope);
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
    public void initial_value_is_empty_string() {
        var cut = new StringSegment(myScope);
        assertThat(cut.getValue()).isEqualTo("");
    }

    @Test
    public void wrap_wraps_provided_addr() {
        var expectedVal = "expectedVal";
        var initialValueSeg = CLinker.toCString(expectedVal, myScope);
        var wrappingSeg = new StringSegment(initialValueSeg.address(), myScope);
        assertThat(wrappingSeg.getValue()).isEqualTo(expectedVal);
    }

    @Test
    public void constructor_accepts_initial_value() {
        var expectedVal = "expectedVal";
        underTest = new StringSegment(expectedVal, myScope);
        assertThat(underTest.getValue()).isEqualTo(expectedVal);
    }

    @Test
    public void constructor_does_not_accept_null_str() {
        assertNullArgNotAccepted(() -> new StringSegment((String) null, myScope), "initialValue");
    }

    @Test
    public void constructor_does_not_accept_null_scope() {
        assertNullArgNotAccepted(() -> new StringSegment("initialValue", null), "scope");
    }
}
