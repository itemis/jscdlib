// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1428 {

    static final FunctionDescriptor assuan_sock_connect$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle assuan_sock_connect$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "assuan_sock_connect",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1428.assuan_sock_connect$FUNC, false
    );
    static final FunctionDescriptor assuan_sock_connect_byname$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_SHORT,
        C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle assuan_sock_connect_byname$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "assuan_sock_connect_byname",
        "(Ljdk/incubator/foreign/MemoryAddress;SILjdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$1428.assuan_sock_connect_byname$FUNC, false
    );
    static final FunctionDescriptor assuan_sock_bind$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_INT
    );
    static final MethodHandle assuan_sock_bind$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "assuan_sock_bind",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$1428.assuan_sock_bind$FUNC, false
    );
    static final FunctionDescriptor assuan_sock_set_sockaddr_un$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle assuan_sock_set_sockaddr_un$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "assuan_sock_set_sockaddr_un",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1428.assuan_sock_set_sockaddr_un$FUNC, false
    );
    static final FunctionDescriptor assuan_sock_get_nonce$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT,
        C_POINTER
    );
    static final MethodHandle assuan_sock_get_nonce$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "assuan_sock_get_nonce",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1428.assuan_sock_get_nonce$FUNC, false
    );
    static final FunctionDescriptor assuan_sock_check_nonce$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle assuan_sock_check_nonce$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "assuan_sock_check_nonce",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1428.assuan_sock_check_nonce$FUNC, false
    );
}


