// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1090 {

    static final FunctionDescriptor IXMLDOMNode_get_parentNode_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_parentNode_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_parentNode_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1090.IXMLDOMNode_get_parentNode_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_childNodes_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_childNodes_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_childNodes_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1090.IXMLDOMNode_get_childNodes_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_childNodes_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_childNodes_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_childNodes_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1090.IXMLDOMNode_get_childNodes_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_firstChild_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_firstChild_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_firstChild_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1090.IXMLDOMNode_get_firstChild_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_firstChild_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_firstChild_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_firstChild_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1090.IXMLDOMNode_get_firstChild_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNode_get_lastChild_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNode_get_lastChild_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNode_get_lastChild_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1090.IXMLDOMNode_get_lastChild_Proxy$FUNC, false
    );
}


