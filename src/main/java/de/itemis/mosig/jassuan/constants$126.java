// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$126 {

    static final FunctionDescriptor PtrToLong$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle PtrToLong$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PtrToLong",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$126.PtrToLong$FUNC, false
    );
    static final FunctionDescriptor PtrToInt$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle PtrToInt$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PtrToInt",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$126.PtrToInt$FUNC, false
    );
    static final FunctionDescriptor PtrToShort$FUNC = FunctionDescriptor.of(C_SHORT,
        C_POINTER
    );
    static final MethodHandle PtrToShort$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "PtrToShort",
        "(Ljdk/incubator/foreign/MemoryAddress;)S",
        constants$126.PtrToShort$FUNC, false
    );
    static final FunctionDescriptor IntToPtr$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle IntToPtr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IntToPtr",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$126.IntToPtr$FUNC, false
    );
    static final FunctionDescriptor UIntToPtr$FUNC = FunctionDescriptor.of(C_POINTER,
        C_INT
    );
    static final MethodHandle UIntToPtr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "UIntToPtr",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$126.UIntToPtr$FUNC, false
    );
    static final FunctionDescriptor LongToPtr$FUNC = FunctionDescriptor.of(C_POINTER,
        C_LONG
    );
    static final MethodHandle LongToPtr$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LongToPtr",
        "(I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$126.LongToPtr$FUNC, false
    );
}


