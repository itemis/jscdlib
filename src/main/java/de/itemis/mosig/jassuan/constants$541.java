// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$541 {

    static final FunctionDescriptor wglDeleteContext$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle wglDeleteContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wglDeleteContext",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$541.wglDeleteContext$FUNC, false
    );
    static final FunctionDescriptor wglGetCurrentContext$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle wglGetCurrentContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wglGetCurrentContext",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$541.wglGetCurrentContext$FUNC, false
    );
    static final FunctionDescriptor wglGetCurrentDC$FUNC = FunctionDescriptor.of(C_POINTER);
    static final MethodHandle wglGetCurrentDC$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wglGetCurrentDC",
        "()Ljdk/incubator/foreign/MemoryAddress;",
        constants$541.wglGetCurrentDC$FUNC, false
    );
    static final FunctionDescriptor wglGetProcAddress$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle wglGetProcAddress$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wglGetProcAddress",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$541.wglGetProcAddress$FUNC, false
    );
    static final FunctionDescriptor wglMakeCurrent$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle wglMakeCurrent$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wglMakeCurrent",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$541.wglMakeCurrent$FUNC, false
    );
    static final FunctionDescriptor wglShareLists$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle wglShareLists$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "wglShareLists",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$541.wglShareLists$FUNC, false
    );
}


