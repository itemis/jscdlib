// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$680 {

    static final FunctionDescriptor FoldStringA$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle FoldStringA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FoldStringA",
        "(ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$680.FoldStringA$FUNC, false
    );
    static final FunctionDescriptor EnumSystemLocalesA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle EnumSystemLocalesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemLocalesA",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$680.EnumSystemLocalesA$FUNC, false
    );
    static final FunctionDescriptor EnumSystemLocalesW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle EnumSystemLocalesW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemLocalesW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$680.EnumSystemLocalesW$FUNC, false
    );
    static final FunctionDescriptor EnumSystemLanguageGroupsA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle EnumSystemLanguageGroupsA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemLanguageGroupsA",
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$680.EnumSystemLanguageGroupsA$FUNC, false
    );
    static final FunctionDescriptor EnumSystemLanguageGroupsW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle EnumSystemLanguageGroupsW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumSystemLanguageGroupsW",
        "(Ljdk/incubator/foreign/MemoryAddress;IJ)I",
        constants$680.EnumSystemLanguageGroupsW$FUNC, false
    );
    static final FunctionDescriptor EnumLanguageGroupLocalesA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_LONG_LONG
    );
    static final MethodHandle EnumLanguageGroupLocalesA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "EnumLanguageGroupLocalesA",
        "(Ljdk/incubator/foreign/MemoryAddress;IIJ)I",
        constants$680.EnumLanguageGroupLocalesA$FUNC, false
    );
}


