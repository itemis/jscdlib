package com.itemis.jscdlib.demo;

import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.SymbolLookup.libraryLookup;

import com.itemis.jscdlib.internal.ScardLibNativeBridge;

import java.lang.foreign.Arena;
import java.lang.foreign.ValueLayout;

public class JscdTestMain {

    public static void main(final String[] args) {
        try (var arena = Arena.ofConfined();
                var bridge = new ScardLibNativeBridge(scope -> libraryLookup("winscard", scope))) {
            final var phContext = pointer().allocate(arena);

            System.err.println(bridge.sCardEstablishContext(2, NULL, NULL, phContext.address()));

            final var hContext = phContext.getValue();
            final var mszReaders = pointer().of(String.class).allocate(arena);
            final var pcchReaders = arena.allocate(ValueLayout.ADDRESS);
            pcchReaders.set(ValueLayout.JAVA_INT, 0, -1);

            System.err.println(bridge.sCardListReaders(hContext, NULL,
                mszReaders.address(), pcchReaders));

            final var addr = mszReaders.rawDereference();
            final var rd1 = addr.getString(0);
            final var rd2 = addr.getString(rd1.length() + 1L);

            System.err.println(rd1);
            System.err.println(rd2);
            System.err.println(bridge.sCardFreeMemory(hContext, mszReaders.address()));
            System.err.println(bridge.sCardReleaseContext(hContext));
        }
    }
}
