// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$692 {

    static final FunctionDescriptor WriteConsoleOutputCharacterW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        MemoryLayout.structLayout(
            C_SHORT.withName("X"),
            C_SHORT.withName("Y")
        ).withName("_COORD"),
        C_POINTER
    );
    static final MethodHandle WriteConsoleOutputCharacterW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WriteConsoleOutputCharacterW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$692.WriteConsoleOutputCharacterW$FUNC, false
    );
    static final FunctionDescriptor WriteConsoleOutputAttribute$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        MemoryLayout.structLayout(
            C_SHORT.withName("X"),
            C_SHORT.withName("Y")
        ).withName("_COORD"),
        C_POINTER
    );
    static final MethodHandle WriteConsoleOutputAttribute$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "WriteConsoleOutputAttribute",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$692.WriteConsoleOutputAttribute$FUNC, false
    );
    static final FunctionDescriptor FillConsoleOutputCharacterA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_CHAR,
        C_LONG,
        MemoryLayout.structLayout(
            C_SHORT.withName("X"),
            C_SHORT.withName("Y")
        ).withName("_COORD"),
        C_POINTER
    );
    static final MethodHandle FillConsoleOutputCharacterA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FillConsoleOutputCharacterA",
        "(Ljdk/incubator/foreign/MemoryAddress;BILjdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$692.FillConsoleOutputCharacterA$FUNC, false
    );
    static final FunctionDescriptor FillConsoleOutputCharacterW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_SHORT,
        C_LONG,
        MemoryLayout.structLayout(
            C_SHORT.withName("X"),
            C_SHORT.withName("Y")
        ).withName("_COORD"),
        C_POINTER
    );
    static final MethodHandle FillConsoleOutputCharacterW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FillConsoleOutputCharacterW",
        "(Ljdk/incubator/foreign/MemoryAddress;SILjdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$692.FillConsoleOutputCharacterW$FUNC, false
    );
    static final FunctionDescriptor FillConsoleOutputAttribute$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_SHORT,
        C_LONG,
        MemoryLayout.structLayout(
            C_SHORT.withName("X"),
            C_SHORT.withName("Y")
        ).withName("_COORD"),
        C_POINTER
    );
    static final MethodHandle FillConsoleOutputAttribute$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FillConsoleOutputAttribute",
        "(Ljdk/incubator/foreign/MemoryAddress;SILjdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$692.FillConsoleOutputAttribute$FUNC, false
    );
    static final FunctionDescriptor GetConsoleMode$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle GetConsoleMode$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetConsoleMode",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$692.GetConsoleMode$FUNC, false
    );
}


