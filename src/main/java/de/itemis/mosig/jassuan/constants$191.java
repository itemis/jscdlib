// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$191 {

    static final FunctionDescriptor _mm_cmpgt_ss$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle _mm_cmpgt_ss$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cmpgt_ss",
        "(FF)F",
        constants$191._mm_cmpgt_ss$FUNC, false
    );
    static final FunctionDescriptor _mm_cmpgt_ps$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle _mm_cmpgt_ps$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cmpgt_ps",
        "(FF)F",
        constants$191._mm_cmpgt_ps$FUNC, false
    );
    static final FunctionDescriptor _mm_cmpge_ss$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle _mm_cmpge_ss$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cmpge_ss",
        "(FF)F",
        constants$191._mm_cmpge_ss$FUNC, false
    );
    static final FunctionDescriptor _mm_cmpge_ps$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle _mm_cmpge_ps$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cmpge_ps",
        "(FF)F",
        constants$191._mm_cmpge_ps$FUNC, false
    );
    static final FunctionDescriptor _mm_cmpneq_ss$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle _mm_cmpneq_ss$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cmpneq_ss",
        "(FF)F",
        constants$191._mm_cmpneq_ss$FUNC, false
    );
    static final FunctionDescriptor _mm_cmpneq_ps$FUNC = FunctionDescriptor.of(C_FLOAT,
        C_FLOAT,
        C_FLOAT
    );
    static final MethodHandle _mm_cmpneq_ps$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "_mm_cmpneq_ps",
        "(FF)F",
        constants$191._mm_cmpneq_ps$FUNC, false
    );
}


