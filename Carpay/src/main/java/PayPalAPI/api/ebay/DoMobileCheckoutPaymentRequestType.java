/**
 * DoMobileCheckoutPaymentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoMobileCheckoutPaymentRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* A timestamped token, the value of which was returned by SetMobileCheckoutResponse.
     * 
     * 
     * 
     * 
     * Character length and limitations: 20 single-byte characters */
    private java.lang.String token;

    public DoMobileCheckoutPaymentRequestType() {
    }

    public DoMobileCheckoutPaymentRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String token) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.token = token;
    }


    /**
     * Gets the token value for this DoMobileCheckoutPaymentRequestType.
     * 
     * @return token   * A timestamped token, the value of which was returned by SetMobileCheckoutResponse.
     * 
     * 
     * 
     * 
     * Character length and limitations: 20 single-byte characters
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this DoMobileCheckoutPaymentRequestType.
     * 
     * @param token   * A timestamped token, the value of which was returned by SetMobileCheckoutResponse.
     * 
     * 
     * 
     * 
     * Character length and limitations: 20 single-byte characters
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMobileCheckoutPaymentRequestType)) return false;
        DoMobileCheckoutPaymentRequestType other = (DoMobileCheckoutPaymentRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMobileCheckoutPaymentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoMobileCheckoutPaymentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
