// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$236 {

    static final FunctionDescriptor _mm_set1_epi64$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_set1_epi64$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_set1_epi64",
        "(J)J",
        constants$236._mm_set1_epi64$FUNC, false
    );
    static final FunctionDescriptor _mm_set1_epi32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_INT
    );
    static final MethodHandle _mm_set1_epi32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_set1_epi32",
        "(I)J",
        constants$236._mm_set1_epi32$FUNC, false
    );
    static final FunctionDescriptor _mm_set1_epi16$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_SHORT
    );
    static final MethodHandle _mm_set1_epi16$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_set1_epi16",
        "(S)J",
        constants$236._mm_set1_epi16$FUNC, false
    );
    static final FunctionDescriptor _mm_set1_epi8$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_CHAR
    );
    static final MethodHandle _mm_set1_epi8$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_set1_epi8",
        "(B)J",
        constants$236._mm_set1_epi8$FUNC, false
    );
    static final FunctionDescriptor _mm_setr_epi64$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_LONG_LONG,
        C_LONG_LONG
    );
    static final MethodHandle _mm_setr_epi64$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_setr_epi64",
        "(JJ)J",
        constants$236._mm_setr_epi64$FUNC, false
    );
    static final FunctionDescriptor _mm_setr_epi32$FUNC = FunctionDescriptor.of(C_LONG_LONG,
        C_INT,
        C_INT,
        C_INT,
        C_INT
    );
    static final MethodHandle _mm_setr_epi32$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_setr_epi32",
        "(IIII)J",
        constants$236._mm_setr_epi32$FUNC, false
    );
}


