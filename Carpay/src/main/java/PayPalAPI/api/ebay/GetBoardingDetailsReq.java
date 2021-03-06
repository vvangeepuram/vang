/**
 * GetBoardingDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetBoardingDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetBoardingDetailsRequestType getBoardingDetailsRequest;

    public GetBoardingDetailsReq() {
    }

    public GetBoardingDetailsReq(
           PayPalAPI.api.ebay.GetBoardingDetailsRequestType getBoardingDetailsRequest) {
           this.getBoardingDetailsRequest = getBoardingDetailsRequest;
    }


    /**
     * Gets the getBoardingDetailsRequest value for this GetBoardingDetailsReq.
     * 
     * @return getBoardingDetailsRequest
     */
    public PayPalAPI.api.ebay.GetBoardingDetailsRequestType getGetBoardingDetailsRequest() {
        return getBoardingDetailsRequest;
    }


    /**
     * Sets the getBoardingDetailsRequest value for this GetBoardingDetailsReq.
     * 
     * @param getBoardingDetailsRequest
     */
    public void setGetBoardingDetailsRequest(PayPalAPI.api.ebay.GetBoardingDetailsRequestType getBoardingDetailsRequest) {
        this.getBoardingDetailsRequest = getBoardingDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBoardingDetailsReq)) return false;
        GetBoardingDetailsReq other = (GetBoardingDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBoardingDetailsRequest==null && other.getGetBoardingDetailsRequest()==null) || 
             (this.getBoardingDetailsRequest!=null &&
              this.getBoardingDetailsRequest.equals(other.getGetBoardingDetailsRequest())));
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
        if (getGetBoardingDetailsRequest() != null) {
            _hashCode += getGetBoardingDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBoardingDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetBoardingDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBoardingDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBoardingDetailsRequestType"));
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
