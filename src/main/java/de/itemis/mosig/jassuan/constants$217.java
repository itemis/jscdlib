// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$217 {

    static final FunctionDescriptor _mm_cvtsi32_sd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_INT
    );
    static final MethodHandle _mm_cvtsi32_sd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cvtsi32_sd",
        "(DI)D",
        constants$217._mm_cvtsi32_sd$FUNC, false
    );
    static final FunctionDescriptor _mm_cvtss_sd$FUNC = FunctionDescriptor.of(C_DOUBLE,
        C_DOUBLE,
        C_FLOAT
    );
    static final MethodHandle _mm_cvtss_sd$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cvtss_sd",
        "(DF)D",
        constants$217._mm_cvtss_sd$FUNC, false
    );
    static final FunctionDescriptor _mm_cvttpd_epi32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_DOUBLE
    );
    static final MethodHandle _mm_cvttpd_epi32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cvttpd_epi32",
        "(D)J",
        constants$217._mm_cvttpd_epi32$FUNC, false
    );
    static final FunctionDescriptor _mm_cvttsd_si32$FUNC = FunctionDescriptor.of(C_INT,
        C_DOUBLE
    );
    static final MethodHandle _mm_cvttsd_si32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cvttsd_si32",
        "(D)I",
        constants$217._mm_cvttsd_si32$FUNC, false
    );
    static final FunctionDescriptor _mm_cvtpd_pi32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_DOUBLE
    );
    static final MethodHandle _mm_cvtpd_pi32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cvtpd_pi32",
        "(D)J",
        constants$217._mm_cvtpd_pi32$FUNC, false
    );
    static final FunctionDescriptor _mm_cvttpd_pi32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_DOUBLE
    );
    static final MethodHandle _mm_cvttpd_pi32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cvttpd_pi32",
        "(D)J",
        constants$217._mm_cvttpd_pi32$FUNC, false
    );
}


