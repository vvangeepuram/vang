/**
 * PaymentRequestInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentRequestInfoType  implements java.io.Serializable {
    /* Contains the transaction id of the bucket. */
    private java.lang.String transactionId;

    /* Contains the bucket id. */
    private java.lang.String paymentRequestID;

    /* Contains the error details. */
    private eBLBaseComponents.apis.ebay.ErrorType paymentError;

    public PaymentRequestInfoType() {
    }

    public PaymentRequestInfoType(
           java.lang.String transactionId,
           java.lang.String paymentRequestID,
           eBLBaseComponents.apis.ebay.ErrorType paymentError) {
           this.transactionId = transactionId;
           this.paymentRequestID = paymentRequestID;
           this.paymentError = paymentError;
    }


    /**
     * Gets the transactionId value for this PaymentRequestInfoType.
     * 
     * @return transactionId   * Contains the transaction id of the bucket.
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentRequestInfoType.
     * 
     * @param transactionId   * Contains the transaction id of the bucket.
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the paymentRequestID value for this PaymentRequestInfoType.
     * 
     * @return paymentRequestID   * Contains the bucket id.
     */
    public java.lang.String getPaymentRequestID() {
        return paymentRequestID;
    }


    /**
     * Sets the paymentRequestID value for this PaymentRequestInfoType.
     * 
     * @param paymentRequestID   * Contains the bucket id.
     */
    public void setPaymentRequestID(java.lang.String paymentRequestID) {
        this.paymentRequestID = paymentRequestID;
    }


    /**
     * Gets the paymentError value for this PaymentRequestInfoType.
     * 
     * @return paymentError   * Contains the error details.
     */
    public eBLBaseComponents.apis.ebay.ErrorType getPaymentError() {
        return paymentError;
    }


    /**
     * Sets the paymentError value for this PaymentRequestInfoType.
     * 
     * @param paymentError   * Contains the error details.
     */
    public void setPaymentError(eBLBaseComponents.apis.ebay.ErrorType paymentError) {
        this.paymentError = paymentError;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentRequestInfoType)) return false;
        PaymentRequestInfoType other = (PaymentRequestInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.paymentRequestID==null && other.getPaymentRequestID()==null) || 
             (this.paymentRequestID!=null &&
              this.paymentRequestID.equals(other.getPaymentRequestID()))) &&
            ((this.paymentError==null && other.getPaymentError()==null) || 
             (this.paymentError!=null &&
              this.paymentError.equals(other.getPaymentError())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getPaymentRequestID() != null) {
            _hashCode += getPaymentRequestID().hashCode();
        }
        if (getPaymentError() != null) {
            _hashCode += getPaymentError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentRequestInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentError"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorType"));
        elemField.setMinOccurs(0);
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
