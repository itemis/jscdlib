// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$295 {

    static final FunctionDescriptor CreateFileA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER,
        C_LONG,
        C_LONG,
        C_POINTER
    );
    static final MethodHandle CreateFileA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "CreateFileA",
        "(Ljdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;IILjdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$295.CreateFileA$FUNC, false
    );
    static final FunctionDescriptor DefineDosDeviceW$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle DefineDosDeviceW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "DefineDosDeviceW",
        "(ILjdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$295.DefineDosDeviceW$FUNC, false
    );
    static final FunctionDescriptor FindCloseChangeNotification$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle FindCloseChangeNotification$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindCloseChangeNotification",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$295.FindCloseChangeNotification$FUNC, false
    );
    static final FunctionDescriptor FindFirstChangeNotificationA$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle FindFirstChangeNotificationA$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindFirstChangeNotificationA",
        "(Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$295.FindFirstChangeNotificationA$FUNC, false
    );
    static final FunctionDescriptor FindFirstChangeNotificationW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle FindFirstChangeNotificationW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindFirstChangeNotificationW",
        "(Ljdk/incubator/foreign/MemoryAddress;II)Ljdk/incubator/foreign/MemoryAddress;",
        constants$295.FindFirstChangeNotificationW$FUNC, false
    );
    static final FunctionDescriptor FindFirstVolumeW$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle FindFirstVolumeW$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "FindFirstVolumeW",
        "(Ljdk/incubator/foreign/MemoryAddress;I)Ljdk/incubator/foreign/MemoryAddress;",
        constants$295.FindFirstVolumeW$FUNC, false
    );
}


