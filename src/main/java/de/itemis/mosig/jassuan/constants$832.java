// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$832 {

    static final FunctionDescriptor SHFileOperationA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SHFileOperationA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHFileOperationA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$832.SHFileOperationA$FUNC, false
    );
    static final FunctionDescriptor SHFileOperationW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SHFileOperationW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHFileOperationW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$832.SHFileOperationW$FUNC, false
    );
    static final FunctionDescriptor SHFreeNameMappings$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle SHFreeNameMappings$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHFreeNameMappings",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$832.SHFreeNameMappings$FUNC, false
    );
    static final FunctionDescriptor ShellExecuteExA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ShellExecuteExA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ShellExecuteExA",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$832.ShellExecuteExA$FUNC, false
    );
    static final FunctionDescriptor ShellExecuteExW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle ShellExecuteExW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ShellExecuteExW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$832.ShellExecuteExW$FUNC, false
    );
    static final FunctionDescriptor SHCreateProcessAsUserW$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SHCreateProcessAsUserW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SHCreateProcessAsUserW",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$832.SHCreateProcessAsUserW$FUNC, false
    );
}


