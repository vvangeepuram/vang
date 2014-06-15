/**
 * DoReauthorizationReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoReauthorizationReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoReauthorizationRequestType doReauthorizationRequest;

    public DoReauthorizationReq() {
    }

    public DoReauthorizationReq(
           PayPalAPI.api.ebay.DoReauthorizationRequestType doReauthorizationRequest) {
           this.doReauthorizationRequest = doReauthorizationRequest;
    }


    /**
     * Gets the doReauthorizationRequest value for this DoReauthorizationReq.
     * 
     * @return doReauthorizationRequest
     */
    public PayPalAPI.api.ebay.DoReauthorizationRequestType getDoReauthorizationRequest() {
        return doReauthorizationRequest;
    }


    /**
     * Sets the doReauthorizationRequest value for this DoReauthorizationReq.
     * 
     * @param doReauthorizationRequest
     */
    public void setDoReauthorizationRequest(PayPalAPI.api.ebay.DoReauthorizationRequestType doReauthorizationRequest) {
        this.doReauthorizationRequest = doReauthorizationRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReauthorizationReq)) return false;
        DoReauthorizationReq other = (DoReauthorizationReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doReauthorizationRequest==null && other.getDoReauthorizationRequest()==null) || 
             (this.doReauthorizationRequest!=null &&
              this.doReauthorizationRequest.equals(other.getDoReauthorizationRequest())));
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
        if (getDoReauthorizationRequest() != null) {
            _hashCode += getDoReauthorizationRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReauthorizationReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoReauthorizationReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReauthorizationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReauthorizationRequestType"));
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
