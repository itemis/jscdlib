package com.itemis.jscdlib.demo;

import static com.itemis.fluffyj.memory.FluffyMemory.pointer;
import static java.lang.foreign.MemorySegment.NULL;
import static java.lang.foreign.SymbolLookup.libraryLookup;

import com.itemis.jscdlib.internal.ScardLibNativeBridge;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public class JscdTestMain {

    public static void main(String[] args) {
        try (var arena = Arena.openConfined();
                var bridge = new ScardLibNativeBridge(scope -> libraryLookup("winscard", scope))) {
            var scope = arena.scope();

            var phContext = pointer().allocate(scope);

            System.err.println(bridge.sCardEstablishContext(2, NULL, NULL, phContext.address()));

            var hContext = phContext.getValue();
            var mszReaders = pointer().of(String.class).allocate(scope);
            var pcchReaders = MemorySegment.allocateNative(ValueLayout.ADDRESS, scope);
            pcchReaders.set(ValueLayout.JAVA_INT, 0, -1);

            System.err.println(bridge.sCardListReaders(hContext, NULL,
                mszReaders.address(), pcchReaders));

            var addr = mszReaders.rawDereference();
            var rd1 = addr.getUtf8String(0);
            var rd2 = addr.getUtf8String(rd1.length() + 1L);

            System.err.println(rd1);
            System.err.println(rd2);
            System.err.println(bridge.sCardFreeMemory(hContext, mszReaders.address()));
            System.err.println(bridge.sCardReleaseContext(hContext));
        }
    }
}
