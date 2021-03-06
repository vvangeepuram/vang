/**
 * DoCaptureReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoCaptureReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoCaptureRequestType doCaptureRequest;

    public DoCaptureReq() {
    }

    public DoCaptureReq(
           PayPalAPI.api.ebay.DoCaptureRequestType doCaptureRequest) {
           this.doCaptureRequest = doCaptureRequest;
    }


    /**
     * Gets the doCaptureRequest value for this DoCaptureReq.
     * 
     * @return doCaptureRequest
     */
    public PayPalAPI.api.ebay.DoCaptureRequestType getDoCaptureRequest() {
        return doCaptureRequest;
    }


    /**
     * Sets the doCaptureRequest value for this DoCaptureReq.
     * 
     * @param doCaptureRequest
     */
    public void setDoCaptureRequest(PayPalAPI.api.ebay.DoCaptureRequestType doCaptureRequest) {
        this.doCaptureRequest = doCaptureRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCaptureReq)) return false;
        DoCaptureReq other = (DoCaptureReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doCaptureRequest==null && other.getDoCaptureRequest()==null) || 
             (this.doCaptureRequest!=null &&
              this.doCaptureRequest.equals(other.getDoCaptureRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDoCaptureRequest() != null) {
            _hashCode += getDoCaptureRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCaptureReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoCaptureReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doCaptureRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureRequestType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
