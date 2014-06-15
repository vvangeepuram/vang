/**
 * TransactionSearchReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class TransactionSearchReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.TransactionSearchRequestType transactionSearchRequest;

    public TransactionSearchReq() {
    }

    public TransactionSearchReq(
           PayPalAPI.api.ebay.TransactionSearchRequestType transactionSearchRequest) {
           this.transactionSearchRequest = transactionSearchRequest;
    }


    /**
     * Gets the transactionSearchRequest value for this TransactionSearchReq.
     * 
     * @return transactionSearchRequest
     */
    public PayPalAPI.api.ebay.TransactionSearchRequestType getTransactionSearchRequest() {
        return transactionSearchRequest;
    }


    /**
     * Sets the transactionSearchRequest value for this TransactionSearchReq.
     * 
     * @param transactionSearchRequest
     */
    public void setTransactionSearchRequest(PayPalAPI.api.ebay.TransactionSearchRequestType transactionSearchRequest) {
        this.transactionSearchRequest = transactionSearchRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchReq)) return false;
        TransactionSearchReq other = (TransactionSearchReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionSearchRequest==null && other.getTransactionSearchRequest()==null) || 
             (this.transactionSearchRequest!=null &&
              this.transactionSearchRequest.equals(other.getTransactionSearchRequest())));
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
        if (getTransactionSearchRequest() != null) {
            _hashCode += getTransactionSearchRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">TransactionSearchReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionSearchRequestType"));
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
