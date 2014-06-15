/**
 * GetBillingAgreementCustomerDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetBillingAgreementCustomerDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsRequestType getBillingAgreementCustomerDetailsRequest;

    public GetBillingAgreementCustomerDetailsReq() {
    }

    public GetBillingAgreementCustomerDetailsReq(
           PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsRequestType getBillingAgreementCustomerDetailsRequest) {
           this.getBillingAgreementCustomerDetailsRequest = getBillingAgreementCustomerDetailsRequest;
    }


    /**
     * Gets the getBillingAgreementCustomerDetailsRequest value for this GetBillingAgreementCustomerDetailsReq.
     * 
     * @return getBillingAgreementCustomerDetailsRequest
     */
    public PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsRequestType getGetBillingAgreementCustomerDetailsRequest() {
        return getBillingAgreementCustomerDetailsRequest;
    }


    /**
     * Sets the getBillingAgreementCustomerDetailsRequest value for this GetBillingAgreementCustomerDetailsReq.
     * 
     * @param getBillingAgreementCustomerDetailsRequest
     */
    public void setGetBillingAgreementCustomerDetailsRequest(PayPalAPI.api.ebay.GetBillingAgreementCustomerDetailsRequestType getBillingAgreementCustomerDetailsRequest) {
        this.getBillingAgreementCustomerDetailsRequest = getBillingAgreementCustomerDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBillingAgreementCustomerDetailsReq)) return false;
        GetBillingAgreementCustomerDetailsReq other = (GetBillingAgreementCustomerDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBillingAgreementCustomerDetailsRequest==null && other.getGetBillingAgreementCustomerDetailsRequest()==null) || 
             (this.getBillingAgreementCustomerDetailsRequest!=null &&
              this.getBillingAgreementCustomerDetailsRequest.equals(other.getGetBillingAgreementCustomerDetailsRequest())));
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
        if (getGetBillingAgreementCustomerDetailsRequest() != null) {
            _hashCode += getGetBillingAgreementCustomerDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBillingAgreementCustomerDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">GetBillingAgreementCustomerDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBillingAgreementCustomerDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsRequestType"));
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
