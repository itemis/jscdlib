// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$518 {

    static final FunctionDescriptor TransparentBlt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle TransparentBlt$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "TransparentBlt",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;IIIII)I",
        constants$518.TransparentBlt$FUNC, false
    );
    static final FunctionDescriptor GdiTransparentBlt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle GdiTransparentBlt$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GdiTransparentBlt",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIILjdk/incubator/foreign/MemoryAddress;IIIII)I",
        constants$518.GdiTransparentBlt$FUNC, false
    );
    static final FunctionDescriptor GradientFill$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle GradientFill$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GradientFill",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)I",
        constants$518.GradientFill$FUNC, false
    );
    static final FunctionDescriptor GdiGradientFill$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle GdiGradientFill$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GdiGradientFill",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;II)I",
        constants$518.GdiGradientFill$FUNC, false
    );
    static final FunctionDescriptor PlayMetaFileRecord$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle PlayMetaFileRecord$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PlayMetaFileRecord",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$518.PlayMetaFileRecord$FUNC, false
    );
    static final FunctionDescriptor MFENUMPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG_LONG
    );
}


