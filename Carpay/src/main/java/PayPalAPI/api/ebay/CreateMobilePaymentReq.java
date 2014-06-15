/**
 * CreateMobilePaymentReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class CreateMobilePaymentReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.CreateMobilePaymentRequestType createMobilePaymentRequest;

    public CreateMobilePaymentReq() {
    }

    public CreateMobilePaymentReq(
           PayPalAPI.api.ebay.CreateMobilePaymentRequestType createMobilePaymentRequest) {
           this.createMobilePaymentRequest = createMobilePaymentRequest;
    }


    /**
     * Gets the createMobilePaymentRequest value for this CreateMobilePaymentReq.
     * 
     * @return createMobilePaymentRequest
     */
    public PayPalAPI.api.ebay.CreateMobilePaymentRequestType getCreateMobilePaymentRequest() {
        return createMobilePaymentRequest;
    }


    /**
     * Sets the createMobilePaymentRequest value for this CreateMobilePaymentReq.
     * 
     * @param createMobilePaymentRequest
     */
    public void setCreateMobilePaymentRequest(PayPalAPI.api.ebay.CreateMobilePaymentRequestType createMobilePaymentRequest) {
        this.createMobilePaymentRequest = createMobilePaymentRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMobilePaymentReq)) return false;
        CreateMobilePaymentReq other = (CreateMobilePaymentReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createMobilePaymentRequest==null && other.getCreateMobilePaymentRequest()==null) || 
             (this.createMobilePaymentRequest!=null &&
              this.createMobilePaymentRequest.equals(other.getCreateMobilePaymentRequest())));
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
        if (getCreateMobilePaymentRequest() != null) {
            _hashCode += getCreateMobilePaymentRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMobilePaymentReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">CreateMobilePaymentReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createMobilePaymentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateMobilePaymentRequestType"));
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
