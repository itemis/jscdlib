// Generated by jextract

package de.itemis.mosig.jassuan;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$1163 {

    static final FunctionDescriptor IXMLElement2_get_attributes_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLElement2_get_attributes_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLElement2_get_attributes_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1163.IXMLElement2_get_attributes_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLElement2_get_attributes_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLElement2_get_attributes_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLElement2_get_attributes_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1163.IXMLElement2_get_attributes_Stub$FUNC, false
    );
    static final MemoryLayout IID_IXMLAttribute$LAYOUT = MemoryLayout.structLayout(
        C_LONG.withName("Data1"),
        C_SHORT.withName("Data2"),
        C_SHORT.withName("Data3"),
        MemoryLayout.sequenceLayout(8, C_CHAR).withName("Data4")
    ).withName("_GUID");
    static final MemorySegment IID_IXMLAttribute$SEGMENT = RuntimeHelper.lookupGlobalVariable(assuan_h.LIBRARIES, "IID_IXMLAttribute", constants$1163.IID_IXMLAttribute$LAYOUT);
    static final FunctionDescriptor IXMLAttribute_get_name_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLAttribute_get_name_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLAttribute_get_name_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1163.IXMLAttribute_get_name_Proxy$FUNC, false
    );
    static final FunctionDescriptor IXMLAttribute_get_name_Stub$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER,
        C_POINTER,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLAttribute_get_name_Stub$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLAttribute_get_name_Stub",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$1163.IXMLAttribute_get_name_Stub$FUNC, false
    );
    static final FunctionDescriptor IXMLAttribute_get_value_Proxy$FUNC = FunctionDescriptor.of(C_LONG,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle IXMLAttribute_get_value_Proxy$MH = RuntimeHelper.downcallHandle(
        assuan_h.LIBRARIES, "IXMLAttribute_get_value_Proxy",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$1163.IXMLAttribute_get_value_Proxy$FUNC, false
    );
}


