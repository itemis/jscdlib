package com.itemis.jscdlib.internal.memory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jdk.incubator.foreign.CLinker;
import jdk.incubator.foreign.ResourceScope;

public class NativeMethodHandleTest {

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

    // CLinker.systemLookup() provides a lookup for the standard C library.
    @Test
    public void test_strlen_usecase() {
        var underTest = NativeMethodHandle
            .ofLib(CLinker.systemLookup())
            .returnType(long.class)
            .func("strlen")
            .args(CLinker.C_POINTER)
            .create(CLinker.getInstance());

        String testStr = "Hello World!";

        var strSeg = new StringSegment(testStr, myScope);
        assertThat(underTest.call(strSeg.address())).as("Unexpected strlen result.").isEqualTo(testStr.length());
    }
}
