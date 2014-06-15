/**
 * UpdateAuthorizationReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class UpdateAuthorizationReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.UpdateAuthorizationRequestType updateAuthorizationRequest;

    public UpdateAuthorizationReq() {
    }

    public UpdateAuthorizationReq(
           PayPalAPI.api.ebay.UpdateAuthorizationRequestType updateAuthorizationRequest) {
           this.updateAuthorizationRequest = updateAuthorizationRequest;
    }


    /**
     * Gets the updateAuthorizationRequest value for this UpdateAuthorizationReq.
     * 
     * @return updateAuthorizationRequest
     */
    public PayPalAPI.api.ebay.UpdateAuthorizationRequestType getUpdateAuthorizationRequest() {
        return updateAuthorizationRequest;
    }


    /**
     * Sets the updateAuthorizationRequest value for this UpdateAuthorizationReq.
     * 
     * @param updateAuthorizationRequest
     */
    public void setUpdateAuthorizationRequest(PayPalAPI.api.ebay.UpdateAuthorizationRequestType updateAuthorizationRequest) {
        this.updateAuthorizationRequest = updateAuthorizationRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateAuthorizationReq)) return false;
        UpdateAuthorizationReq other = (UpdateAuthorizationReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateAuthorizationRequest==null && other.getUpdateAuthorizationRequest()==null) || 
             (this.updateAuthorizationRequest!=null &&
              this.updateAuthorizationRequest.equals(other.getUpdateAuthorizationRequest())));
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
        if (getUpdateAuthorizationRequest() != null) {
            _hashCode += getUpdateAuthorizationRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateAuthorizationReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">UpdateAuthorizationReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateAuthorizationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "UpdateAuthorizationRequestType"));
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
