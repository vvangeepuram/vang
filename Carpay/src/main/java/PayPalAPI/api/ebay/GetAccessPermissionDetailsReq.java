/**
 * GetAccessPermissionDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetAccessPermissionDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetAccessPermissionDetailsRequestType getAccessPermissionDetailsRequest;

    public GetAccessPermissionDetailsReq() {
    }

    public GetAccessPermissionDetailsReq(
           PayPalAPI.api.ebay.GetAccessPermissionDetailsRequestType getAccessPermissionDetailsRequest) {
           this.getAccessPermissionDetailsRequest = getAccessPermissionDetailsRequest;
    }


    /**
     * Gets the getAccessPermissionDetailsRequest value for this GetAccessPermissionDetailsReq.
     * 
     * @return getAccessPermissionDetailsRequest
     */
    public PayPalAPI.api.ebay.GetAccessPermissionDetailsRequestType getGetAccessPermissionDetailsRequest() {
        return getAccessPermissionDetailsRequest;
    }


    /**
     * Sets the getAccessPermissionDetailsRequest value for this GetAccessPermissionDetailsReq.
     * 
     * @param getAccessPermissionDetailsRequest
     */
    public void setGetAccessPermissionDetailsRequest(PayPalAPI.api.ebay.GetAccessPermissionDetailsRequestType getAccessPermissionDetailsRequest) {
        this.getAccessPermissionDetailsRequest = getAccessPermissionDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccessPermissionDetailsReq)) return false;
        GetAccessPermissionDetailsReq other = (GetAccessPermissionDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAccessPermissionDetailsRequest==null && other.getGetAccessPermissionDetailsRequest()==null) || 
             (this.getAccessPermissionDetailsRequest!=null &&
              this.getAccessPermissionDetailsRequest.equals(other.getGetAccessPermissionDetailsRequest())));
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
        if (getGetAccessPermissionDetailsRequest() != null) {
            _hashCode += getGetAccessPermissionDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccessPermissionDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetAccessPermissionDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAccessPermissionDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetAccessPermissionDetailsRequestType"));
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
