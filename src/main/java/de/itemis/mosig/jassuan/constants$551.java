// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$551 {

    static final FunctionDescriptor DESKTOPENUMPROCA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle DESKTOPENUMPROCA$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$551.DESKTOPENUMPROCA$FUNC, false
    );
    static final FunctionDescriptor DESKTOPENUMPROCW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle DESKTOPENUMPROCW$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$551.DESKTOPENUMPROCW$FUNC, false
    );
    static final FunctionDescriptor WINSTAENUMPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
    static final MethodHandle WINSTAENUMPROC$MH = RuntimeHelper.downcallHandle(
        "(Ljdk/incubator/foreign/MemoryAddress;J)I",
        constants$551.WINSTAENUMPROC$FUNC, false
    );
    static final FunctionDescriptor DESKTOPENUMPROC$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_LONG_LONG
    );
}


