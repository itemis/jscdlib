// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1125 {

    static final MemoryLayout IID_IXMLDOMProcessingInstruction$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLDOMProcessingInstruction$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IXMLDOMProcessingInstruction", constants$1125.IID_IXMLDOMProcessingInstruction$LAYOUT);
    static final FunctionDescriptor IXMLDOMProcessingInstruction_get_target_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMProcessingInstruction_get_target_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMProcessingInstruction_get_target_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1125.IXMLDOMProcessingInstruction_get_target_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMProcessingInstruction_get_target_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMProcessingInstruction_get_target_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMProcessingInstruction_get_target_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1125.IXMLDOMProcessingInstruction_get_target_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMProcessingInstruction_get_data_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMProcessingInstruction_get_data_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMProcessingInstruction_get_data_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1125.IXMLDOMProcessingInstruction_get_data_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMProcessingInstruction_get_data_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMProcessingInstruction_get_data_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMProcessingInstruction_get_data_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1125.IXMLDOMProcessingInstruction_get_data_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLDOMProcessingInstruction_put_data_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLDOMProcessingInstruction_put_data_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLDOMProcessingInstruction_put_data_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1125.IXMLDOMProcessingInstruction_put_data_Proxy$FUNC, false
    );
}


