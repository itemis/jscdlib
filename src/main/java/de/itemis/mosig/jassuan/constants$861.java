// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$861 {

    static final FunctionDescriptor NCryptSecretAgreement$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle NCryptSecretAgreement$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptSecretAgreement",
        "(JJLjdk/incubator/foreign/MemoryAddress;I)I",
        constants$861.NCryptSecretAgreement$FUNC, false
    );
    static final FunctionDescriptor NCryptDeriveKey$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle NCryptDeriveKey$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "NCryptDeriveKey",
        "(JLjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$861.NCryptDeriveKey$FUNC, false
    );
    static final FunctionDescriptor PCRYPT_DECRYPT_PRIVATE_KEY_FUNC$FUNC = FunctionDescriptor.of(C_INT,
        MemoryLayout.structLayout(
            C_POINTER.withName("pszObjId"),
            MemoryLayout.structLayout(
                C_LONG.withName("cbData"),
                MemoryLayout.paddingLayout(32),
                C_POINTER.withName("pbData")
            ).withName("Parameters")
        ).withName("_CRYPT_ALGORITHM_IDENTIFIER"),
        MemoryLayout.structLayout(
            C_LONG.withName("cbData"),
            MemoryLayout.paddingLayout(32),
            C_POINTER.withName("pbData")
        ).withName("_CRYPTOAPI_BLOB"),
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PCRYPT_DECRYPT_PRIVATE_KEY_FUNC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemorySegment;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$861.PCRYPT_DECRYPT_PRIVATE_KEY_FUNC$FUNC, false
    );
    static final FunctionDescriptor PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$861.PCRYPT_ENCRYPT_PRIVATE_KEY_FUNC$FUNC, false
    );
}


