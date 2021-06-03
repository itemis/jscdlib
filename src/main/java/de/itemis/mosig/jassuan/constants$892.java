// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$892 {

    static final FunctionDescriptor CertAddStoreToCollection$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle CertAddStoreToCollection$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertAddStoreToCollection",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$892.CertAddStoreToCollection$FUNC, false
    );
    static final FunctionDescriptor CertRemoveStoreFromCollection$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertRemoveStoreFromCollection$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertRemoveStoreFromCollection",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$892.CertRemoveStoreFromCollection$FUNC, false
    );
    static final FunctionDescriptor CertControlStore$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertControlStore$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertControlStore",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$892.CertControlStore$FUNC, false
    );
    static final FunctionDescriptor CertSetStoreProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertSetStoreProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertSetStoreProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$892.CertSetStoreProperty$FUNC, false
    );
    static final FunctionDescriptor CertGetStoreProperty$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CertGetStoreProperty$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertGetStoreProperty",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$892.CertGetStoreProperty$FUNC, false
    );
    static final FunctionDescriptor CertCreateContext$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CertCreateContext$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CertCreateContext",
        "(IILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$892.CertCreateContext$FUNC, false
    );
}


