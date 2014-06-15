/**
 * CreateBillingAgreementReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class CreateBillingAgreementReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.CreateBillingAgreementRequestType createBillingAgreementRequest;

    public CreateBillingAgreementReq() {
    }

    public CreateBillingAgreementReq(
           PayPalAPI.api.ebay.CreateBillingAgreementRequestType createBillingAgreementRequest) {
           this.createBillingAgreementRequest = createBillingAgreementRequest;
    }


    /**
     * Gets the createBillingAgreementRequest value for this CreateBillingAgreementReq.
     * 
     * @return createBillingAgreementRequest
     */
    public PayPalAPI.api.ebay.CreateBillingAgreementRequestType getCreateBillingAgreementRequest() {
        return createBillingAgreementRequest;
    }


    /**
     * Sets the createBillingAgreementRequest value for this CreateBillingAgreementReq.
     * 
     * @param createBillingAgreementRequest
     */
    public void setCreateBillingAgreementRequest(PayPalAPI.api.ebay.CreateBillingAgreementRequestType createBillingAgreementRequest) {
        this.createBillingAgreementRequest = createBillingAgreementRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateBillingAgreementReq)) return false;
        CreateBillingAgreementReq other = (CreateBillingAgreementReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createBillingAgreementRequest==null && other.getCreateBillingAgreementRequest()==null) || 
             (this.createBillingAgreementRequest!=null &&
              this.createBillingAgreementRequest.equals(other.getCreateBillingAgreementRequest())));
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
        if (getCreateBillingAgreementRequest() != null) {
            _hashCode += getCreateBillingAgreementRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateBillingAgreementReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateBillingAgreementReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createBillingAgreementRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateBillingAgreementRequestType"));
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
