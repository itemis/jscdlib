package com.itemis.jscdlib.internal.memory;

import static com.itemis.jscdlib.internal.memory.FluffyMemorySegments.safeClose;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.itemis.fluffyj.tests.logging.FluffyTestAppender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import jdk.incubator.foreign.ResourceScope;

public class FluffyMemorySegmentsTest {

    @RegisterExtension
    FluffyTestAppender logAssert = new FluffyTestAppender();

    private ResourceScope scope;

    @BeforeEach
    public void setUp() {
        scope = ResourceScope.newConfinedScope();
    }

    @Test
    public void safe_close_closes() {
        assertThat(scope.isAlive()).as("Scope must be alive.").isTrue();

        safeClose(scope);

        assertThat(scope.isAlive()).as("Scope must not be alive.").isFalse();
    }

    @Test
    public void safe_close_does_not_throw_on_already_closed_scope() {
        scope.close();

        assertDoesNotThrow(() -> safeClose(scope));
    }

    @Test
    public void safe_close_does_not_throw_on_null_scope() {
        safeClose(null);
        logAssert.assertLogIsEmpty();
    }

    @Test
    public void safe_close_does_not_log_on_null_scope() {

    }
}
