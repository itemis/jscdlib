// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$683 {

    static final FunctionDescriptor GetStringTypeExA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle GetStringTypeExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetStringTypeExA",
        "(IILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$683.GetStringTypeExA$FUNC, false
    );
    static final FunctionDescriptor GetUserDefaultUILanguage$FUNC = FunctionDescriptor.of(C_SHORT);
    static final MethodHandle GetUserDefaultUILanguage$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetUserDefaultUILanguage",
        "()S",
        constants$683.GetUserDefaultUILanguage$FUNC, false
    );
    static final FunctionDescriptor EnumUILanguagesA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle EnumUILanguagesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumUILanguagesA",
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$683.EnumUILanguagesA$FUNC, false
    );
    static final FunctionDescriptor EnumUILanguagesW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle EnumUILanguagesW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumUILanguagesW",
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$683.EnumUILanguagesW$FUNC, false
    );
    static final FunctionDescriptor EnumSystemCodePagesA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle EnumSystemCodePagesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemCodePagesA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$683.EnumSystemCodePagesA$FUNC, false
    );
    static final FunctionDescriptor EnumSystemCodePagesW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle EnumSystemCodePagesW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemCodePagesW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$683.EnumSystemCodePagesW$FUNC, false
    );
}


