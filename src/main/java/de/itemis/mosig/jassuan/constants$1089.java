// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1089 {

    static final FunctionDescriptor IXMLDOMNode_get_nodeValue_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_nodeValue_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_nodeValue_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1089.IXMLDOMNode_get_nodeValue_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_put_nodeValue_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        MemoryLayout.structLayout(
            MemoryLayout.unionLayout(
                MemoryLayout.structLayout(
                    C_SHORT.withName("vt"),
                    C_SHORT.withName("wReserved1"),
                    C_SHORT.withName("wReserved2"),
                    C_SHORT.withName("wReserved3"),
                    MemoryLayout.unionLayout(
                        C_LONG_LONG.withName("llVal"),
                        C_LONG.withName("lVal"),
                        C_CHAR.withName("bVal"),
                        C_SHORT.withName("iVal"),
                        C_FLOAT.withName("fltVal"),
                        C_DOUBLE.withName("dblVal"),
                        C_SHORT.withName("boolVal"),
                        C_LONG.withName("scode"),
                        MemoryLayout.unionLayout(
                            MemoryLayout.structLayout(
                                C_LONG.withName("Lo"),
                                C_LONG.withName("Hi")
                            ).withName("$anon$0"),
                            C_LONG_LONG.withName("int64")
                        ).withName("cyVal"),
                        C_DOUBLE.withName("date"),
                        C_POINTER.withName("bstrVal"),
                        C_POINTER.withName("punkVal"),
                        C_POINTER.withName("pdispVal"),
                        C_POINTER.withName("parray"),
                        C_POINTER.withName("pbVal"),
                        C_POINTER.withName("piVal"),
                        C_POINTER.withName("plVal"),
                        C_POINTER.withName("pllVal"),
                        C_POINTER.withName("pfltVal"),
                        C_POINTER.withName("pdblVal"),
                        C_POINTER.withName("pboolVal"),
                        C_POINTER.withName("pscode"),
                        C_POINTER.withName("pcyVal"),
                        C_POINTER.withName("pdate"),
                        C_POINTER.withName("pbstrVal"),
                        C_POINTER.withName("ppunkVal"),
                        C_POINTER.withName("ppdispVal"),
                        C_POINTER.withName("pparray"),
                        C_POINTER.withName("pvarVal"),
                        C_POINTER.withName("byref"),
                        C_CHAR.withName("cVal"),
                        C_SHORT.withName("uiVal"),
                        C_LONG.withName("ulVal"),
                        C_LONG_LONG.withName("ullVal"),
                        C_INT.withName("intVal"),
                        C_INT.withName("uintVal"),
                        C_POINTER.withName("pdecVal"),
                        C_POINTER.withName("pcVal"),
                        C_POINTER.withName("puiVal"),
                        C_POINTER.withName("pulVal"),
                        C_POINTER.withName("pullVal"),
                        C_POINTER.withName("pintVal"),
                        C_POINTER.withName("puintVal"),
                        MemoryLayout.structLayout(
                            C_POINTER.withName("pvRecord"),
                            C_POINTER.withName("pRecInfo")
                        ).withName("$anon$0")
                    ).withName("$anon$0")
                ).withName("$anon$0"),
                MemoryLayout.structLayout(
                    C_SHORT.withName("wReserved"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            C_CHAR.withName("scale"),
                            C_CHAR.withName("sign")
                        ).withName("$anon$0"),
                        C_SHORT.withName("signscale")
                    ).withName("$anon$0"),
                    C_LONG.withName("Hi32"),
                    MemoryLayout.unionLayout(
                        MemoryLayout.structLayout(
                            C_LONG.withName("Lo32"),
                            C_LONG.withName("Mid32")
                        ).withName("$anon$0"),
                        C_LONG_LONG.withName("Lo64")
                    ).withName("$anon$1")
                ).withName("decVal")
            ).withName("$anon$0")
        ).withName("tagVARIANT")
    );
    static final MethodHandle IXMLDOMNode_put_nodeValue_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_put_nodeValue_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemorySegment;)I",
        constants$1089.IXMLDOMNode_put_nodeValue_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_put_nodeValue_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_put_nodeValue_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_put_nodeValue_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1089.IXMLDOMNode_put_nodeValue_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_nodeType_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_nodeType_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_nodeType_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1089.IXMLDOMNode_get_nodeType_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_nodeType_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_nodeType_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_nodeType_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1089.IXMLDOMNode_get_nodeType_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_parentNode_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_parentNode_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_parentNode_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1089.IXMLDOMNode_get_parentNode_Proxy$FUNC, false
    );
}


