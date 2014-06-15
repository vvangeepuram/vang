/**
 * DoReferenceTransactionResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoReferenceTransactionResponseDetailsType  implements java.io.Serializable {
    private java.lang.String billingAgreementID;

    private eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo;

    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    private java.lang.String AVSCode;

    private java.lang.String CVV2Code;

    private java.lang.String transactionID;

    /* Response code from the processor when a recurring transaction
     * is declined */
    private java.lang.String paymentAdviceCode;

    /* Return msgsubid back to merchant */
    private java.lang.String msgSubID;

    public DoReferenceTransactionResponseDetailsType() {
    }

    public DoReferenceTransactionResponseDetailsType(
           java.lang.String billingAgreementID,
           eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String AVSCode,
           java.lang.String CVV2Code,
           java.lang.String transactionID,
           java.lang.String paymentAdviceCode,
           java.lang.String msgSubID) {
           this.billingAgreementID = billingAgreementID;
           this.paymentInfo = paymentInfo;
           this.amount = amount;
           this.AVSCode = AVSCode;
           this.CVV2Code = CVV2Code;
           this.transactionID = transactionID;
           this.paymentAdviceCode = paymentAdviceCode;
           this.msgSubID = msgSubID;
    }


    /**
     * Gets the billingAgreementID value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return billingAgreementID
     */
    public java.lang.String getBillingAgreementID() {
        return billingAgreementID;
    }


    /**
     * Sets the billingAgreementID value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param billingAgreementID
     */
    public void setBillingAgreementID(java.lang.String billingAgreementID) {
        this.billingAgreementID = billingAgreementID;
    }


    /**
     * Gets the paymentInfo value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return paymentInfo
     */
    public eBLBaseComponents.apis.ebay.PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param paymentInfo
     */
    public void setPaymentInfo(eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the amount value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return amount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param amount
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the AVSCode value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return AVSCode
     */
    public java.lang.String getAVSCode() {
        return AVSCode;
    }


    /**
     * Sets the AVSCode value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param AVSCode
     */
    public void setAVSCode(java.lang.String AVSCode) {
        this.AVSCode = AVSCode;
    }


    /**
     * Gets the CVV2Code value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return CVV2Code
     */
    public java.lang.String getCVV2Code() {
        return CVV2Code;
    }


    /**
     * Sets the CVV2Code value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param CVV2Code
     */
    public void setCVV2Code(java.lang.String CVV2Code) {
        this.CVV2Code = CVV2Code;
    }


    /**
     * Gets the transactionID value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the paymentAdviceCode value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return paymentAdviceCode   * Response code from the processor when a recurring transaction
     * is declined
     */
    public java.lang.String getPaymentAdviceCode() {
        return paymentAdviceCode;
    }


    /**
     * Sets the paymentAdviceCode value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param paymentAdviceCode   * Response code from the processor when a recurring transaction
     * is declined
     */
    public void setPaymentAdviceCode(java.lang.String paymentAdviceCode) {
        this.paymentAdviceCode = paymentAdviceCode;
    }


    /**
     * Gets the msgSubID value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @return msgSubID   * Return msgsubid back to merchant
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoReferenceTransactionResponseDetailsType.
     * 
     * @param msgSubID   * Return msgsubid back to merchant
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReferenceTransactionResponseDetailsType)) return false;
        DoReferenceTransactionResponseDetailsType other = (DoReferenceTransactionResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAgreementID==null && other.getBillingAgreementID()==null) || 
             (this.billingAgreementID!=null &&
              this.billingAgreementID.equals(other.getBillingAgreementID()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.AVSCode==null && other.getAVSCode()==null) || 
             (this.AVSCode!=null &&
              this.AVSCode.equals(other.getAVSCode()))) &&
            ((this.CVV2Code==null && other.getCVV2Code()==null) || 
             (this.CVV2Code!=null &&
              this.CVV2Code.equals(other.getCVV2Code()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.paymentAdviceCode==null && other.getPaymentAdviceCode()==null) || 
             (this.paymentAdviceCode!=null &&
              this.paymentAdviceCode.equals(other.getPaymentAdviceCode()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID())));
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
        if (getBillingAgreementID() != null) {
            _hashCode += getBillingAgreementID().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAVSCode() != null) {
            _hashCode += getAVSCode().hashCode();
        }
        if (getCVV2Code() != null) {
            _hashCode += getCVV2Code().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getPaymentAdviceCode() != null) {
            _hashCode += getPaymentAdviceCode().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReferenceTransactionResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AVSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVV2Code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CVV2Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAdviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentAdviceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MsgSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
