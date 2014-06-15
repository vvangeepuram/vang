/**
 * ExternalRememberMeOptOutReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ExternalRememberMeOptOutReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.ExternalRememberMeOptOutRequestType externalRememberMeOptOutRequest;

    public ExternalRememberMeOptOutReq() {
    }

    public ExternalRememberMeOptOutReq(
           PayPalAPI.api.ebay.ExternalRememberMeOptOutRequestType externalRememberMeOptOutRequest) {
           this.externalRememberMeOptOutRequest = externalRememberMeOptOutRequest;
    }


    /**
     * Gets the externalRememberMeOptOutRequest value for this ExternalRememberMeOptOutReq.
     * 
     * @return externalRememberMeOptOutRequest
     */
    public PayPalAPI.api.ebay.ExternalRememberMeOptOutRequestType getExternalRememberMeOptOutRequest() {
        return externalRememberMeOptOutRequest;
    }


    /**
     * Sets the externalRememberMeOptOutRequest value for this ExternalRememberMeOptOutReq.
     * 
     * @param externalRememberMeOptOutRequest
     */
    public void setExternalRememberMeOptOutRequest(PayPalAPI.api.ebay.ExternalRememberMeOptOutRequestType externalRememberMeOptOutRequest) {
        this.externalRememberMeOptOutRequest = externalRememberMeOptOutRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRememberMeOptOutReq)) return false;
        ExternalRememberMeOptOutReq other = (ExternalRememberMeOptOutReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRememberMeOptOutRequest==null && other.getExternalRememberMeOptOutRequest()==null) || 
             (this.externalRememberMeOptOutRequest!=null &&
              this.externalRememberMeOptOutRequest.equals(other.getExternalRememberMeOptOutRequest())));
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
        if (getExternalRememberMeOptOutRequest() != null) {
            _hashCode += getExternalRememberMeOptOutRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRememberMeOptOutReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ExternalRememberMeOptOutReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOptOutRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutRequestType"));
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
