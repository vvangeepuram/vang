/**
 * RefundTransactionReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class RefundTransactionReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.RefundTransactionRequestType refundTransactionRequest;

    public RefundTransactionReq() {
    }

    public RefundTransactionReq(
           PayPalAPI.api.ebay.RefundTransactionRequestType refundTransactionRequest) {
           this.refundTransactionRequest = refundTransactionRequest;
    }


    /**
     * Gets the refundTransactionRequest value for this RefundTransactionReq.
     * 
     * @return refundTransactionRequest
     */
    public PayPalAPI.api.ebay.RefundTransactionRequestType getRefundTransactionRequest() {
        return refundTransactionRequest;
    }


    /**
     * Sets the refundTransactionRequest value for this RefundTransactionReq.
     * 
     * @param refundTransactionRequest
     */
    public void setRefundTransactionRequest(PayPalAPI.api.ebay.RefundTransactionRequestType refundTransactionRequest) {
        this.refundTransactionRequest = refundTransactionRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundTransactionReq)) return false;
        RefundTransactionReq other = (RefundTransactionReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refundTransactionRequest==null && other.getRefundTransactionRequest()==null) || 
             (this.refundTransactionRequest!=null &&
              this.refundTransactionRequest.equals(other.getRefundTransactionRequest())));
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
        if (getRefundTransactionRequest() != null) {
            _hashCode += getRefundTransactionRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundTransactionReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">RefundTransactionReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTransactionRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionRequestType"));
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
