// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1113 {

    static final FunctionDescriptor IXMLDOMNodeList_reset_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNodeList_reset_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNodeList_reset_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1113.IXMLDOMNodeList_reset_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNodeList_reset_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNodeList_reset_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNodeList_reset_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1113.IXMLDOMNodeList_reset_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNodeList_get__newEnum_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNodeList_get__newEnum_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNodeList_get__newEnum_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1113.IXMLDOMNodeList_get__newEnum_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMNodeList_get__newEnum_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNodeList_get__newEnum_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNodeList_get__newEnum_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1113.IXMLDOMNodeList_get__newEnum_Stub$FUNC, false
    );
    static final MemoryLayout IID_IXMLDOMNamedNodeMap$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLDOMNamedNodeMap$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IXMLDOMNamedNodeMap", constants$1113.IID_IXMLDOMNamedNodeMap$LAYOUT);
    static final FunctionDescriptor IXMLDOMNamedNodeMap_getNamedItem_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMNamedNodeMap_getNamedItem_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMNamedNodeMap_getNamedItem_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1113.IXMLDOMNamedNodeMap_getNamedItem_Proxy$FUNC, false
    );
}


