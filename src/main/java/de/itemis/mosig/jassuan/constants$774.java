// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$774 {

    static final FunctionDescriptor mciGetErrorStringW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_INT
    );
    static final MethodHandle mciGetErrorStringW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mciGetErrorStringW",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$774.mciGetErrorStringW$FUNC, false
    );
    static final FunctionDescriptor mciSetYieldProc$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle mciSetYieldProc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mciSetYieldProc",
        "(ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$774.mciSetYieldProc$FUNC, false
    );
    static final FunctionDescriptor mciGetCreatorTask$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle mciGetCreatorTask$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mciGetCreatorTask",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$774.mciGetCreatorTask$FUNC, false
    );
    static final FunctionDescriptor mciGetYieldProc$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle mciGetYieldProc$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "mciGetYieldProc",
        "(ILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$774.mciGetYieldProc$FUNC, false
    );
    static final FunctionDescriptor Netbios$FUNC = FunctionDescriptor.of(C_CHAR,
        C_POINTER
    );
    static final MethodHandle Netbios$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "Netbios",
        "(Ljdk/incubator/foreign/MemoryAddress;)B",
        constants$774.Netbios$FUNC, false
    );
    static final FunctionDescriptor RPC_OBJECT_INQ_FN$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
}


