// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$678 {

    static final FunctionDescriptor LCIDToLocaleName$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG,
        C_POINTER,
        C_INT,
        C_LONG
    );
    static final MethodHandle LCIDToLocaleName$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LCIDToLocaleName",
        "(ILjdk/incubator/foreign/MemoryAddress;II)I",
        constants$678.LCIDToLocaleName$FUNC, false
    );
    static final FunctionDescriptor LocaleNameToLCID$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_LONG
    );
    static final MethodHandle LocaleNameToLCID$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "LocaleNameToLCID",
        "(Ljdk/incubator/foreign/MemoryAddress;I)I",
        constants$678.LocaleNameToLCID$FUNC, false
    );
    static final FunctionDescriptor SetUserGeoID$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG
    );
    static final MethodHandle SetUserGeoID$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetUserGeoID",
        "(I)I",
        constants$678.SetUserGeoID$FUNC, false
    );
    static final FunctionDescriptor ConvertDefaultLocale$FUNC = FunctionDescriptor.of(C_LONG,
        C_LONG
    );
    static final MethodHandle ConvertDefaultLocale$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "ConvertDefaultLocale",
        "(I)I",
        constants$678.ConvertDefaultLocale$FUNC, false
    );
    static final FunctionDescriptor GetThreadLocale$FUNC = FunctionDescriptor.of(C_LONG);
    static final MethodHandle GetThreadLocale$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "GetThreadLocale",
        "()I",
        constants$678.GetThreadLocale$FUNC, false
    );
    static final FunctionDescriptor SetThreadLocale$FUNC = FunctionDescriptor.of(C_INT,
        C_LONG
    );
    static final MethodHandle SetThreadLocale$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "SetThreadLocale",
        "(I)I",
        constants$678.SetThreadLocale$FUNC, false
    );
}


