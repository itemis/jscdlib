// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$478 {

    static final FunctionDescriptor SetThreadpoolCallbackLibrary$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SetThreadpoolCallbackLibrary$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadpoolCallbackLibrary",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$478.SetThreadpoolCallbackLibrary$FUNC, false
    );
    static final FunctionDescriptor SetThreadpoolCallbackPriority$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_INT
    );
    static final MethodHandle SetThreadpoolCallbackPriority$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadpoolCallbackPriority",
        "(Ljdk/incubator/foreign/MemoryAddress;I)V",
        constants$478.SetThreadpoolCallbackPriority$FUNC, false
    );
    static final FunctionDescriptor DestroyThreadpoolEnvironment$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle DestroyThreadpoolEnvironment$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DestroyThreadpoolEnvironment",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$478.DestroyThreadpoolEnvironment$FUNC, false
    );
    static final FunctionDescriptor OLDFONTENUMPROCA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle OLDFONTENUMPROCA$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$478.OLDFONTENUMPROCA$FUNC, false
    );
    static final FunctionDescriptor OLDFONTENUMPROCW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG_LONG
    );
}


