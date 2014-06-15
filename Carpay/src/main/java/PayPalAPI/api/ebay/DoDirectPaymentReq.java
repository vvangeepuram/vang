/**
 * DoDirectPaymentReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoDirectPaymentReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoDirectPaymentRequestType doDirectPaymentRequest;

    public DoDirectPaymentReq() {
    }

    public DoDirectPaymentReq(
           PayPalAPI.api.ebay.DoDirectPaymentRequestType doDirectPaymentRequest) {
           this.doDirectPaymentRequest = doDirectPaymentRequest;
    }


    /**
     * Gets the doDirectPaymentRequest value for this DoDirectPaymentReq.
     * 
     * @return doDirectPaymentRequest
     */
    public PayPalAPI.api.ebay.DoDirectPaymentRequestType getDoDirectPaymentRequest() {
        return doDirectPaymentRequest;
    }


    /**
     * Sets the doDirectPaymentRequest value for this DoDirectPaymentReq.
     * 
     * @param doDirectPaymentRequest
     */
    public void setDoDirectPaymentRequest(PayPalAPI.api.ebay.DoDirectPaymentRequestType doDirectPaymentRequest) {
        this.doDirectPaymentRequest = doDirectPaymentRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoDirectPaymentReq)) return false;
        DoDirectPaymentReq other = (DoDirectPaymentReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doDirectPaymentRequest==null && other.getDoDirectPaymentRequest()==null) || 
             (this.doDirectPaymentRequest!=null &&
              this.doDirectPaymentRequest.equals(other.getDoDirectPaymentRequest())));
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
        if (getDoDirectPaymentRequest() != null) {
            _hashCode += getDoDirectPaymentRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoDirectPaymentReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoDirectPaymentReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doDirectPaymentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentRequestType"));
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
