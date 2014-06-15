/**
 * DoCancelReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoCancelReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoCancelRequestType doCancelRequest;

    public DoCancelReq() {
    }

    public DoCancelReq(
           PayPalAPI.api.ebay.DoCancelRequestType doCancelRequest) {
           this.doCancelRequest = doCancelRequest;
    }


    /**
     * Gets the doCancelRequest value for this DoCancelReq.
     * 
     * @return doCancelRequest
     */
    public PayPalAPI.api.ebay.DoCancelRequestType getDoCancelRequest() {
        return doCancelRequest;
    }


    /**
     * Sets the doCancelRequest value for this DoCancelReq.
     * 
     * @param doCancelRequest
     */
    public void setDoCancelRequest(PayPalAPI.api.ebay.DoCancelRequestType doCancelRequest) {
        this.doCancelRequest = doCancelRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCancelReq)) return false;
        DoCancelReq other = (DoCancelReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doCancelRequest==null && other.getDoCancelRequest()==null) || 
             (this.doCancelRequest!=null &&
              this.doCancelRequest.equals(other.getDoCancelRequest())));
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
        if (getDoCancelRequest() != null) {
            _hashCode += getDoCancelRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCancelReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoCancelReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doCancelRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCancelRequestType"));
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
