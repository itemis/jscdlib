// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$511 {

    static final FunctionDescriptor RemoveFontResourceA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle RemoveFontResourceA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RemoveFontResourceA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$511.RemoveFontResourceA$FUNC, false
    );
    static final FunctionDescriptor RemoveFontResourceW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle RemoveFontResourceW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RemoveFontResourceW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$511.RemoveFontResourceW$FUNC, false
    );
    static final FunctionDescriptor RoundRect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle RoundRect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "RoundRect",
        "(Ljdk/incubator/foreign/MemoryAddress;IIIIII)I",
        constants$511.RoundRect$FUNC, false
    );
    static final FunctionDescriptor ResizePalette$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle ResizePalette$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ResizePalette",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$511.ResizePalette$FUNC, false
    );
    static final FunctionDescriptor SaveDC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SaveDC$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SaveDC",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$511.SaveDC$FUNC, false
    );
    static final FunctionDescriptor SelectClipRgn$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SelectClipRgn$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SelectClipRgn",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$511.SelectClipRgn$FUNC, false
    );
}


