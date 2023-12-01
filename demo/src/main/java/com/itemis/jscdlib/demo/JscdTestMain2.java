package com.itemis.jscdlib.demo;

import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static java.lang.foreign.ValueLayout.ADDRESS;
import static java.lang.foreign.ValueLayout.JAVA_LONG;

import com.itemis.fluffyj.memory.FluffyNativeMethodHandle;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SymbolLookup;
import java.lang.foreign.ValueLayout;

public class JscdTestMain2 {

    private static final MemorySegment NULL_PTR = MemorySegment.NULL;

    public static void main(final String[] args) {
        try (var arena = Arena.ofConfined()) {
            // The scard lib is called winscard on Windows
            final var winscard = SymbolLookup.libraryLookup("winscard", arena);

            final var sCardEstablishContext = FluffyNativeMethodHandle
                .fromCLib(winscard)
                .returnType(long.class)
                .func("SCardEstablishContext")
                .args(JAVA_LONG, ADDRESS, ADDRESS, ADDRESS);

            // The Windows variety of SCardListReaders ends with an A.
            // Other OS just use SCardListReaders without A.
            final var scardListReaders = FluffyNativeMethodHandle
                .fromCLib(winscard)
                .returnType(long.class)
                .func("SCardListReadersA")
                .args(ADDRESS, ADDRESS, ADDRESS, ADDRESS);

            final var scardFreeMemory = FluffyNativeMethodHandle
                .fromCLib(winscard)
                .returnType(long.class)
                .func("SCardFreeMemory")
                .args(ADDRESS, ADDRESS);

            final var scardReleaseContext = FluffyNativeMethodHandle
                .fromCLib(winscard)
                .returnType(long.class)
                .func("SCardReleaseContext")
                .args(ADDRESS);

            final var phContext = pointer().allocate(arena);

            // First arg is SCARD_SCOPE_SYSTEM
            sCardEstablishContext.call(2, NULL_PTR, NULL_PTR, phContext.address());

            final var hContext = phContext.getValue();
            final var mszReaders = pointer().of(String.class).allocate(arena);
            final var pcchReaders = arena.allocate(ValueLayout.ADDRESS);
            pcchReaders.set(ValueLayout.JAVA_INT, 0, -1);

            scardListReaders.call(hContext, NULL_PTR, mszReaders.address(), pcchReaders);

            final var readersMultiStrPtr = mszReaders.rawDereference();
            final var readerOne = readersMultiStrPtr.getUtf8String(0);
            final var readerTwo = readersMultiStrPtr.getUtf8String(readerOne.length() + 1L);

            System.err.println(readerOne);
            System.err.println(readerTwo);

            scardFreeMemory.call(hContext, mszReaders.address());
            scardReleaseContext.call(hContext);
        }
    }
}
