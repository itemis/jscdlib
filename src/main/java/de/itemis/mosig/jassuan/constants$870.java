// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$870 {

    static final FunctionDescriptor PFN_CMSG_ALLOC$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle PFN_CMSG_ALLOC$MH = RuntimeHelper.downcallHandle(
        "(J)Ljdk/incubator/foreign/MemoryAddress;",
        constants$870.PFN_CMSG_ALLOC$FUNC, false
    );
    static final FunctionDescriptor PFN_CMSG_FREE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFN_CMSG_FREE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$870.PFN_CMSG_FREE$FUNC, false
    );
    static final FunctionDescriptor PFN_CMSG_GEN_ENCRYPT_KEY$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PFN_CMSG_GEN_ENCRYPT_KEY$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$870.PFN_CMSG_GEN_ENCRYPT_KEY$FUNC, false
    );
    static final FunctionDescriptor PFN_CMSG_EXPORT_ENCRYPT_KEY$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
}


