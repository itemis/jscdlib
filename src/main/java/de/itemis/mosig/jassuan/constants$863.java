// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$863 {

    static final FunctionDescriptor PFN_CRYPT_FREE$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle PFN_CRYPT_FREE$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$863.PFN_CRYPT_FREE$FUNC, false
    );
    static final FunctionDescriptor CryptEncodeObjectEx$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptEncodeObjectEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptEncodeObjectEx",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$863.CryptEncodeObjectEx$FUNC, false
    );
    static final FunctionDescriptor CryptEncodeObject$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptEncodeObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptEncodeObject",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$863.CryptEncodeObject$FUNC, false
    );
    static final FunctionDescriptor CryptDecodeObjectEx$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptDecodeObjectEx$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptDecodeObjectEx",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$863.CryptDecodeObjectEx$FUNC, false
    );
    static final FunctionDescriptor CryptDecodeObject$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle CryptDecodeObject$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptDecodeObject",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$863.CryptDecodeObject$FUNC, false
    );
    static final FunctionDescriptor CryptInstallOIDFunctionAddress$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle CryptInstallOIDFunctionAddress$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CryptInstallOIDFunctionAddress",
        "(Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;I)I",
        constants$863.CryptInstallOIDFunctionAddress$FUNC, false
    );
}


