// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$726 {

    static final FunctionDescriptor WNetConnectionDialog1A$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle WNetConnectionDialog1A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetConnectionDialog1A",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$726.WNetConnectionDialog1A$FUNC, false
    );
    static final FunctionDescriptor WNetConnectionDialog1W$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle WNetConnectionDialog1W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetConnectionDialog1W",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$726.WNetConnectionDialog1W$FUNC, false
    );
    static final FunctionDescriptor WNetDisconnectDialog1A$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle WNetDisconnectDialog1A$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetDisconnectDialog1A",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$726.WNetDisconnectDialog1A$FUNC, false
    );
    static final FunctionDescriptor WNetDisconnectDialog1W$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle WNetDisconnectDialog1W$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetDisconnectDialog1W",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$726.WNetDisconnectDialog1W$FUNC, false
    );
    static final FunctionDescriptor WNetOpenEnumA$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle WNetOpenEnumA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetOpenEnumA",
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$726.WNetOpenEnumA$FUNC, false
    );
    static final FunctionDescriptor WNetOpenEnumW$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle WNetOpenEnumW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WNetOpenEnumW",
        "(IIILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$726.WNetOpenEnumW$FUNC, false
    );
}


