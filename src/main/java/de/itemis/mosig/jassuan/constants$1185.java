// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1185 {

    static final FunctionDescriptor URLOpenStreamW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle URLOpenStreamW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "URLOpenStreamW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1185.URLOpenStreamW$FUNC, false
    );
    static final FunctionDescriptor URLOpenPullStreamA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle URLOpenPullStreamA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "URLOpenPullStreamA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1185.URLOpenPullStreamA$FUNC, false
    );
    static final FunctionDescriptor URLOpenPullStreamW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle URLOpenPullStreamW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "URLOpenPullStreamW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1185.URLOpenPullStreamW$FUNC, false
    );
    static final FunctionDescriptor URLDownloadToFileA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle URLDownloadToFileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "URLDownloadToFileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1185.URLDownloadToFileA$FUNC, false
    );
    static final FunctionDescriptor URLDownloadToFileW$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle URLDownloadToFileW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "URLDownloadToFileW",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;ILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1185.URLDownloadToFileW$FUNC, false
    );
    static final FunctionDescriptor URLDownloadToCacheFileA$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle URLDownloadToCacheFileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "URLDownloadToCacheFileA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)I",
        constants$1185.URLDownloadToCacheFileA$FUNC, false
    );
}


