// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$81 {

    static final FunctionDescriptor _chmod$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _chmod$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_chmod",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$81._chmod$FUNC, false
    );
    static final FunctionDescriptor _chsize$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_LONG
    );
    static final MethodHandle _chsize$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_chsize",
        "(II)I",
        constants$81._chsize$FUNC, false
    );
    static final FunctionDescriptor _chsize_s$FUNC = FunctionDescriptor.of(C_INT,
        C_INT,
        C_LONG_LONG
    );
    static final MethodHandle _chsize_s$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_chsize_s",
        "(IJ)I",
        constants$81._chsize_s$FUNC, false
    );
    static final FunctionDescriptor _close$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle _close$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_close",
        "(I)I",
        constants$81._close$FUNC, false
    );
    static final FunctionDescriptor _commit$FUNC = FunctionDescriptor.of(C_INT,
        C_INT
    );
    static final MethodHandle _commit$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_commit",
        "(I)I",
        constants$81._commit$FUNC, false
    );
    static final FunctionDescriptor _creat$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_INT
    );
    static final MethodHandle _creat$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_creat",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$81._creat$FUNC, false
    );
}


