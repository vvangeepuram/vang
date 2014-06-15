/**
 * DoUATPAuthorizationReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoUATPAuthorizationReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoUATPAuthorizationRequestType doUATPAuthorizationRequest;

    public DoUATPAuthorizationReq() {
    }

    public DoUATPAuthorizationReq(
           PayPalAPI.api.ebay.DoUATPAuthorizationRequestType doUATPAuthorizationRequest) {
           this.doUATPAuthorizationRequest = doUATPAuthorizationRequest;
    }


    /**
     * Gets the doUATPAuthorizationRequest value for this DoUATPAuthorizationReq.
     * 
     * @return doUATPAuthorizationRequest
     */
    public PayPalAPI.api.ebay.DoUATPAuthorizationRequestType getDoUATPAuthorizationRequest() {
        return doUATPAuthorizationRequest;
    }


    /**
     * Sets the doUATPAuthorizationRequest value for this DoUATPAuthorizationReq.
     * 
     * @param doUATPAuthorizationRequest
     */
    public void setDoUATPAuthorizationRequest(PayPalAPI.api.ebay.DoUATPAuthorizationRequestType doUATPAuthorizationRequest) {
        this.doUATPAuthorizationRequest = doUATPAuthorizationRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoUATPAuthorizationReq)) return false;
        DoUATPAuthorizationReq other = (DoUATPAuthorizationReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doUATPAuthorizationRequest==null && other.getDoUATPAuthorizationRequest()==null) || 
             (this.doUATPAuthorizationRequest!=null &&
              this.doUATPAuthorizationRequest.equals(other.getDoUATPAuthorizationRequest())));
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
        if (getDoUATPAuthorizationRequest() != null) {
            _hashCode += getDoUATPAuthorizationRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoUATPAuthorizationReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoUATPAuthorizationReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doUATPAuthorizationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationRequestType"));
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
