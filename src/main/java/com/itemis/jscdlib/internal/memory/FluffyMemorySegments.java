package com.itemis.jscdlib.internal.memory;

import com.itemis.fluffyj.exceptions.InstantiationNotPermittedException;

import jdk.incubator.foreign.ResourceScope;

public final class FluffyMemorySegments {

    private FluffyMemorySegments() {
        throw new InstantiationNotPermittedException();
    }

    public static boolean safeClose(ResourceScope scope) {
        try {
            scope.close();
        } catch (Exception e) {

        }
        return false;
    }
}
