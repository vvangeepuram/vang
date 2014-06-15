/**
 * GetPalDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetPalDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetPalDetailsRequestType getPalDetailsRequest;

    public GetPalDetailsReq() {
    }

    public GetPalDetailsReq(
           PayPalAPI.api.ebay.GetPalDetailsRequestType getPalDetailsRequest) {
           this.getPalDetailsRequest = getPalDetailsRequest;
    }


    /**
     * Gets the getPalDetailsRequest value for this GetPalDetailsReq.
     * 
     * @return getPalDetailsRequest
     */
    public PayPalAPI.api.ebay.GetPalDetailsRequestType getGetPalDetailsRequest() {
        return getPalDetailsRequest;
    }


    /**
     * Sets the getPalDetailsRequest value for this GetPalDetailsReq.
     * 
     * @param getPalDetailsRequest
     */
    public void setGetPalDetailsRequest(PayPalAPI.api.ebay.GetPalDetailsRequestType getPalDetailsRequest) {
        this.getPalDetailsRequest = getPalDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPalDetailsReq)) return false;
        GetPalDetailsReq other = (GetPalDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPalDetailsRequest==null && other.getGetPalDetailsRequest()==null) || 
             (this.getPalDetailsRequest!=null &&
              this.getPalDetailsRequest.equals(other.getGetPalDetailsRequest())));
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
        if (getGetPalDetailsRequest() != null) {
            _hashCode += getGetPalDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPalDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetPalDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPalDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetPalDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetPalDetailsRequestType"));
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
