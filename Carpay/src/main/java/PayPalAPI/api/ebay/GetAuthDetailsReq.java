/**
 * GetAuthDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetAuthDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetAuthDetailsRequestType getAuthDetailsRequest;

    public GetAuthDetailsReq() {
    }

    public GetAuthDetailsReq(
           PayPalAPI.api.ebay.GetAuthDetailsRequestType getAuthDetailsRequest) {
           this.getAuthDetailsRequest = getAuthDetailsRequest;
    }


    /**
     * Gets the getAuthDetailsRequest value for this GetAuthDetailsReq.
     * 
     * @return getAuthDetailsRequest
     */
    public PayPalAPI.api.ebay.GetAuthDetailsRequestType getGetAuthDetailsRequest() {
        return getAuthDetailsRequest;
    }


    /**
     * Sets the getAuthDetailsRequest value for this GetAuthDetailsReq.
     * 
     * @param getAuthDetailsRequest
     */
    public void setGetAuthDetailsRequest(PayPalAPI.api.ebay.GetAuthDetailsRequestType getAuthDetailsRequest) {
        this.getAuthDetailsRequest = getAuthDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAuthDetailsReq)) return false;
        GetAuthDetailsReq other = (GetAuthDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAuthDetailsRequest==null && other.getGetAuthDetailsRequest()==null) || 
             (this.getAuthDetailsRequest!=null &&
              this.getAuthDetailsRequest.equals(other.getGetAuthDetailsRequest())));
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
        if (getGetAuthDetailsRequest() != null) {
            _hashCode += getGetAuthDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAuthDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetAuthDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAuthDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAuthDetailsRequestType"));
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
