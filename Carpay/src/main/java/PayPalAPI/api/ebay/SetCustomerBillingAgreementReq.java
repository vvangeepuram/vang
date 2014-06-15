/**
 * SetCustomerBillingAgreementReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class SetCustomerBillingAgreementReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.SetCustomerBillingAgreementRequestType setCustomerBillingAgreementRequest;

    public SetCustomerBillingAgreementReq() {
    }

    public SetCustomerBillingAgreementReq(
           PayPalAPI.api.ebay.SetCustomerBillingAgreementRequestType setCustomerBillingAgreementRequest) {
           this.setCustomerBillingAgreementRequest = setCustomerBillingAgreementRequest;
    }


    /**
     * Gets the setCustomerBillingAgreementRequest value for this SetCustomerBillingAgreementReq.
     * 
     * @return setCustomerBillingAgreementRequest
     */
    public PayPalAPI.api.ebay.SetCustomerBillingAgreementRequestType getSetCustomerBillingAgreementRequest() {
        return setCustomerBillingAgreementRequest;
    }


    /**
     * Sets the setCustomerBillingAgreementRequest value for this SetCustomerBillingAgreementReq.
     * 
     * @param setCustomerBillingAgreementRequest
     */
    public void setSetCustomerBillingAgreementRequest(PayPalAPI.api.ebay.SetCustomerBillingAgreementRequestType setCustomerBillingAgreementRequest) {
        this.setCustomerBillingAgreementRequest = setCustomerBillingAgreementRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetCustomerBillingAgreementReq)) return false;
        SetCustomerBillingAgreementReq other = (SetCustomerBillingAgreementReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setCustomerBillingAgreementRequest==null && other.getSetCustomerBillingAgreementRequest()==null) || 
             (this.setCustomerBillingAgreementRequest!=null &&
              this.setCustomerBillingAgreementRequest.equals(other.getSetCustomerBillingAgreementRequest())));
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
        if (getSetCustomerBillingAgreementRequest() != null) {
            _hashCode += getSetCustomerBillingAgreementRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomerBillingAgreementReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetCustomerBillingAgreementReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setCustomerBillingAgreementRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetCustomerBillingAgreementRequestType"));
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
