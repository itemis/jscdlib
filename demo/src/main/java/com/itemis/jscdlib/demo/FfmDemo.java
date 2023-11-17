package com.itemis.jscdlib.demo;

import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_INT;

import com.itemis.fluffyj.memory.FluffyMemory;
import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Arrays;

public class FfmDemo {

    public static void main(final String[] args) {
        // arena is a FFM concept that models memory segment lifecycle
        final var arena = Arena.ofAuto();
        // easy creation of buf seg via FluffyJ-Memory API
        final var bufSeg = FluffyMemory.segment().ofArray(new Byte[] {9, 1, 4, 5, 7, 2, 3, 0, 8, 6}).allocate();
        // Create a qsort handle
        final var qsort = FluffyNativeMethodHandle.fromCStdLib()
            .noReturnType()
            .func("qsort")
            .args(ADDRESS, JAVA_INT, JAVA_INT, ADDRESS);
        // Create a function pointer to the qsort_compar method.
        final var comparPtr = FluffyMemory.pointer()
            .toCFunc("qsort_compar")
            .of(new Comp())
            .autoBindTo(arena);

        // Sort bufSeg
        qsort.call(bufSeg.address(), 10, 1, comparPtr);

        // prints 0 1 2 3 4 5 6 7 8 9
        Arrays.stream(bufSeg.getValue()).forEach(elm -> System.out.println(elm));
    }

    // Class must at least be protected, method must be public.
    // This is a FluffyJ-restriction in order for the linker to be able to find the method.
    protected static class Comp {
        public int qsort_compar(final MemorySegment left, final MemorySegment right) {
            // use FluffyJ-Memory API to dereference the pointers.
            final var leftByte = FluffyMemory.dereference(left).as(Byte.class);
            final var rightByte = FluffyMemory.dereference(right).as(Byte.class);
            var result = 0;
            if (leftByte < rightByte) {
                result = -1;
            } else if (leftByte > rightByte) {
                result = 1;
            }
            return result;
        }
    }
}
