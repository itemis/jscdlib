// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1342 {

    static final FunctionDescriptor ImmSetCompositionFontW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle ImmSetCompositionFontW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmSetCompositionFontW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1342.ImmSetCompositionFontW$FUNC, false
    );
    static final FunctionDescriptor REGISTERWORDENUMPROCA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle REGISTERWORDENUMPROCA$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1342.REGISTERWORDENUMPROCA$FUNC, false
    );
    static final FunctionDescriptor REGISTERWORDENUMPROCW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle REGISTERWORDENUMPROCW$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1342.REGISTERWORDENUMPROCW$FUNC, false
    );
    static final FunctionDescriptor ImmConfigureIMEA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle ImmConfigureIMEA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ImmConfigureIMEA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1342.ImmConfigureIMEA$FUNC, false
    );
}


