/**
 * GetExpressCheckoutDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetExpressCheckoutDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetExpressCheckoutDetailsRequestType getExpressCheckoutDetailsRequest;

    public GetExpressCheckoutDetailsReq() {
    }

    public GetExpressCheckoutDetailsReq(
           PayPalAPI.api.ebay.GetExpressCheckoutDetailsRequestType getExpressCheckoutDetailsRequest) {
           this.getExpressCheckoutDetailsRequest = getExpressCheckoutDetailsRequest;
    }


    /**
     * Gets the getExpressCheckoutDetailsRequest value for this GetExpressCheckoutDetailsReq.
     * 
     * @return getExpressCheckoutDetailsRequest
     */
    public PayPalAPI.api.ebay.GetExpressCheckoutDetailsRequestType getGetExpressCheckoutDetailsRequest() {
        return getExpressCheckoutDetailsRequest;
    }


    /**
     * Sets the getExpressCheckoutDetailsRequest value for this GetExpressCheckoutDetailsReq.
     * 
     * @param getExpressCheckoutDetailsRequest
     */
    public void setGetExpressCheckoutDetailsRequest(PayPalAPI.api.ebay.GetExpressCheckoutDetailsRequestType getExpressCheckoutDetailsRequest) {
        this.getExpressCheckoutDetailsRequest = getExpressCheckoutDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExpressCheckoutDetailsReq)) return false;
        GetExpressCheckoutDetailsReq other = (GetExpressCheckoutDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getExpressCheckoutDetailsRequest==null && other.getGetExpressCheckoutDetailsRequest()==null) || 
             (this.getExpressCheckoutDetailsRequest!=null &&
              this.getExpressCheckoutDetailsRequest.equals(other.getGetExpressCheckoutDetailsRequest())));
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
        if (getGetExpressCheckoutDetailsRequest() != null) {
            _hashCode += getGetExpressCheckoutDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExpressCheckoutDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetExpressCheckoutDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExpressCheckoutDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsRequestType"));
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
