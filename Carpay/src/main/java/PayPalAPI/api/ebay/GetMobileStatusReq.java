/**
 * GetMobileStatusReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetMobileStatusReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetMobileStatusRequestType getMobileStatusRequest;

    public GetMobileStatusReq() {
    }

    public GetMobileStatusReq(
           PayPalAPI.api.ebay.GetMobileStatusRequestType getMobileStatusRequest) {
           this.getMobileStatusRequest = getMobileStatusRequest;
    }


    /**
     * Gets the getMobileStatusRequest value for this GetMobileStatusReq.
     * 
     * @return getMobileStatusRequest
     */
    public PayPalAPI.api.ebay.GetMobileStatusRequestType getGetMobileStatusRequest() {
        return getMobileStatusRequest;
    }


    /**
     * Sets the getMobileStatusRequest value for this GetMobileStatusReq.
     * 
     * @param getMobileStatusRequest
     */
    public void setGetMobileStatusRequest(PayPalAPI.api.ebay.GetMobileStatusRequestType getMobileStatusRequest) {
        this.getMobileStatusRequest = getMobileStatusRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMobileStatusReq)) return false;
        GetMobileStatusReq other = (GetMobileStatusReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMobileStatusRequest==null && other.getGetMobileStatusRequest()==null) || 
             (this.getMobileStatusRequest!=null &&
              this.getMobileStatusRequest.equals(other.getGetMobileStatusRequest())));
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
        if (getGetMobileStatusRequest() != null) {
            _hashCode += getGetMobileStatusRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMobileStatusReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetMobileStatusReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMobileStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetMobileStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetMobileStatusRequestType"));
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
