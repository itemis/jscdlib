// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$757 {

    static final FunctionDescriptor midiOutOpen$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_LONG_LONG,
        C_LONG_LONG,
        C_LONG
    );
    static final MethodHandle midiOutOpen$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiOutOpen",
        "(Ljdk/incubator/foreign/MemoryAddress;IJJI)I",
        constants$757.midiOutOpen$FUNC, false
    );
    static final FunctionDescriptor midiOutClose$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle midiOutClose$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiOutClose",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$757.midiOutClose$FUNC, false
    );
    static final FunctionDescriptor midiOutPrepareHeader$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle midiOutPrepareHeader$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiOutPrepareHeader",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$757.midiOutPrepareHeader$FUNC, false
    );
    static final FunctionDescriptor midiOutUnprepareHeader$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle midiOutUnprepareHeader$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiOutUnprepareHeader",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$757.midiOutUnprepareHeader$FUNC, false
    );
    static final FunctionDescriptor midiOutShortMsg$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle midiOutShortMsg$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiOutShortMsg",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$757.midiOutShortMsg$FUNC, false
    );
    static final FunctionDescriptor midiOutLongMsg$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle midiOutLongMsg$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "midiOutLongMsg",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$757.midiOutLongMsg$FUNC, false
    );
}


