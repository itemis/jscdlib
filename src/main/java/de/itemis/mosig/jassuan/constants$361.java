// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$361 {

    static final FunctionDescriptor InitializeAcl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG,
        C_LONG
    );
    static final MethodHandle InitializeAcl$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitializeAcl",
        "(Ljdk/incubator/foreign/MemoryAddress;II)I",
        constants$361.InitializeAcl$FUNC, false
    );
    static final FunctionDescriptor InitializeSecurityDescriptor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle InitializeSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitializeSecurityDescriptor",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$361.InitializeSecurityDescriptor$FUNC, false
    );
    static final FunctionDescriptor InitializeSid$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER,
        C_CHAR
    );
    static final MethodHandle InitializeSid$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "InitializeSid",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;B)I",
        constants$361.InitializeSid$FUNC, false
    );
    static final FunctionDescriptor IsValidAcl$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IsValidAcl$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsValidAcl",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$361.IsValidAcl$FUNC, false
    );
    static final FunctionDescriptor IsValidSecurityDescriptor$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IsValidSecurityDescriptor$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsValidSecurityDescriptor",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$361.IsValidSecurityDescriptor$FUNC, false
    );
    static final FunctionDescriptor IsValidSid$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle IsValidSid$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IsValidSid",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$361.IsValidSid$FUNC, false
    );
}


