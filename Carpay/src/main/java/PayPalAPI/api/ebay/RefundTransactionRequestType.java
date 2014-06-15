/**
 * RefundTransactionRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class RefundTransactionRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Unique identifier of the  transaction you are refunding.
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limitations: 17 single-byte alphanumeric characters */
    private java.lang.String transactionID;

    /* Encrypted PayPal customer account identification number.
     * 										
     * 										
     * 										
     * 										
     * 										
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String payerID;

    /* Invoice number corresponding to transaction details for tracking
     * the refund of a payment. This parameter is passed by the merchant
     * or recipient while refunding the transaction. This parameter does
     * not affect the business logic, it is persisted in the DB for transaction
     * reference */
    private java.lang.String invoiceID;

    /* Type of refund you are making */
    private eBLBaseComponents.apis.ebay.RefundType refundType;

    /* Refund amount. 
     * 
     * 										
     * Amount is   if RefundType is Partial.
     * 
     * 										
     * NOTE: If RefundType is Full, do not set Amount. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Custom memo about the refund. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limitations: 255 single-byte alphanumeric characters */
    private java.lang.String memo;

    /* The maximum time till which refund must be tried.
     * 									
     * 									Optional */
    private java.util.Calendar retryUntil;

    /* The type of funding source for refund.
     * 									
     * 									Optional */
    private eBLBaseComponents.apis.ebay.RefundSourceCodeType refundSource;

    /* Flag to indicate that the customer was already given store
     * credit for a given transaction. This will allow us to make sure we
     * do not double refund. */
    private java.lang.Boolean refundAdvice;

    /* To pass the Merchant store information */
    private eBLBaseComponents.apis.ebay.MerchantStoreDetailsType merchantStoreDetails;

    /* Information about the individual details of the items to be
     * refunded. */
    private eBLBaseComponents.apis.ebay.InvoiceItemType[] refundItemDetails;

    /* Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    public RefundTransactionRequestType() {
    }

    public RefundTransactionRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String transactionID,
           java.lang.String payerID,
           java.lang.String invoiceID,
           eBLBaseComponents.apis.ebay.RefundType refundType,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String memo,
           java.util.Calendar retryUntil,
           eBLBaseComponents.apis.ebay.RefundSourceCodeType refundSource,
           java.lang.Boolean refundAdvice,
           eBLBaseComponents.apis.ebay.MerchantStoreDetailsType merchantStoreDetails,
           eBLBaseComponents.apis.ebay.InvoiceItemType[] refundItemDetails,
           java.lang.String msgSubID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.transactionID = transactionID;
        this.payerID = payerID;
        this.invoiceID = invoiceID;
        this.refundType = refundType;
        this.amount = amount;
        this.memo = memo;
        this.retryUntil = retryUntil;
        this.refundSource = refundSource;
        this.refundAdvice = refundAdvice;
        this.merchantStoreDetails = merchantStoreDetails;
        this.refundItemDetails = refundItemDetails;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the transactionID value for this RefundTransactionRequestType.
     * 
     * @return transactionID   * Unique identifier of the  transaction you are refunding.
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limitations: 17 single-byte alphanumeric characters
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this RefundTransactionRequestType.
     * 
     * @param transactionID   * Unique identifier of the  transaction you are refunding.
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limitations: 17 single-byte alphanumeric characters
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the payerID value for this RefundTransactionRequestType.
     * 
     * @return payerID   * Encrypted PayPal customer account identification number.
     * 										
     * 										
     * 										
     * 										
     * 										
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this RefundTransactionRequestType.
     * 
     * @param payerID   * Encrypted PayPal customer account identification number.
     * 										
     * 										
     * 										
     * 										
     * 										
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }


    /**
     * Gets the invoiceID value for this RefundTransactionRequestType.
     * 
     * @return invoiceID   * Invoice number corresponding to transaction details for tracking
     * the refund of a payment. This parameter is passed by the merchant
     * or recipient while refunding the transaction. This parameter does
     * not affect the business logic, it is persisted in the DB for transaction
     * reference
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this RefundTransactionRequestType.
     * 
     * @param invoiceID   * Invoice number corresponding to transaction details for tracking
     * the refund of a payment. This parameter is passed by the merchant
     * or recipient while refunding the transaction. This parameter does
     * not affect the business logic, it is persisted in the DB for transaction
     * reference
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the refundType value for this RefundTransactionRequestType.
     * 
     * @return refundType   * Type of refund you are making
     */
    public eBLBaseComponents.apis.ebay.RefundType getRefundType() {
        return refundType;
    }


    /**
     * Sets the refundType value for this RefundTransactionRequestType.
     * 
     * @param refundType   * Type of refund you are making
     */
    public void setRefundType(eBLBaseComponents.apis.ebay.RefundType refundType) {
        this.refundType = refundType;
    }


    /**
     * Gets the amount value for this RefundTransactionRequestType.
     * 
     * @return amount   * Refund amount. 
     * 
     * 										
     * Amount is   if RefundType is Partial.
     * 
     * 										
     * NOTE: If RefundType is Full, do not set Amount.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RefundTransactionRequestType.
     * 
     * @param amount   * Refund amount. 
     * 
     * 										
     * Amount is   if RefundType is Partial.
     * 
     * 										
     * NOTE: If RefundType is Full, do not set Amount.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the memo value for this RefundTransactionRequestType.
     * 
     * @return memo   * Custom memo about the refund. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this RefundTransactionRequestType.
     * 
     * @param memo   * Custom memo about the refund. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limitations: 255 single-byte alphanumeric characters
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the retryUntil value for this RefundTransactionRequestType.
     * 
     * @return retryUntil   * The maximum time till which refund must be tried.
     * 									
     * 									Optional
     */
    public java.util.Calendar getRetryUntil() {
        return retryUntil;
    }


    /**
     * Sets the retryUntil value for this RefundTransactionRequestType.
     * 
     * @param retryUntil   * The maximum time till which refund must be tried.
     * 									
     * 									Optional
     */
    public void setRetryUntil(java.util.Calendar retryUntil) {
        this.retryUntil = retryUntil;
    }


    /**
     * Gets the refundSource value for this RefundTransactionRequestType.
     * 
     * @return refundSource   * The type of funding source for refund.
     * 									
     * 									Optional
     */
    public eBLBaseComponents.apis.ebay.RefundSourceCodeType getRefundSource() {
        return refundSource;
    }


    /**
     * Sets the refundSource value for this RefundTransactionRequestType.
     * 
     * @param refundSource   * The type of funding source for refund.
     * 									
     * 									Optional
     */
    public void setRefundSource(eBLBaseComponents.apis.ebay.RefundSourceCodeType refundSource) {
        this.refundSource = refundSource;
    }


    /**
     * Gets the refundAdvice value for this RefundTransactionRequestType.
     * 
     * @return refundAdvice   * Flag to indicate that the customer was already given store
     * credit for a given transaction. This will allow us to make sure we
     * do not double refund.
     */
    public java.lang.Boolean getRefundAdvice() {
        return refundAdvice;
    }


    /**
     * Sets the refundAdvice value for this RefundTransactionRequestType.
     * 
     * @param refundAdvice   * Flag to indicate that the customer was already given store
     * credit for a given transaction. This will allow us to make sure we
     * do not double refund.
     */
    public void setRefundAdvice(java.lang.Boolean refundAdvice) {
        this.refundAdvice = refundAdvice;
    }


    /**
     * Gets the merchantStoreDetails value for this RefundTransactionRequestType.
     * 
     * @return merchantStoreDetails   * To pass the Merchant store information
     */
    public eBLBaseComponents.apis.ebay.MerchantStoreDetailsType getMerchantStoreDetails() {
        return merchantStoreDetails;
    }


    /**
     * Sets the merchantStoreDetails value for this RefundTransactionRequestType.
     * 
     * @param merchantStoreDetails   * To pass the Merchant store information
     */
    public void setMerchantStoreDetails(eBLBaseComponents.apis.ebay.MerchantStoreDetailsType merchantStoreDetails) {
        this.merchantStoreDetails = merchantStoreDetails;
    }


    /**
     * Gets the refundItemDetails value for this RefundTransactionRequestType.
     * 
     * @return refundItemDetails   * Information about the individual details of the items to be
     * refunded.
     */
    public eBLBaseComponents.apis.ebay.InvoiceItemType[] getRefundItemDetails() {
        return refundItemDetails;
    }


    /**
     * Sets the refundItemDetails value for this RefundTransactionRequestType.
     * 
     * @param refundItemDetails   * Information about the individual details of the items to be
     * refunded.
     */
    public void setRefundItemDetails(eBLBaseComponents.apis.ebay.InvoiceItemType[] refundItemDetails) {
        this.refundItemDetails = refundItemDetails;
    }

    public eBLBaseComponents.apis.ebay.InvoiceItemType getRefundItemDetails(int i) {
        return this.refundItemDetails[i];
    }

    public void setRefundItemDetails(int i, eBLBaseComponents.apis.ebay.InvoiceItemType _value) {
        this.refundItemDetails[i] = _value;
    }


    /**
     * Gets the msgSubID value for this RefundTransactionRequestType.
     * 
     * @return msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this RefundTransactionRequestType.
     * 
     * @param msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundTransactionRequestType)) return false;
        RefundTransactionRequestType other = (RefundTransactionRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.payerID==null && other.getPayerID()==null) || 
             (this.payerID!=null &&
              this.payerID.equals(other.getPayerID()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.refundType==null && other.getRefundType()==null) || 
             (this.refundType!=null &&
              this.refundType.equals(other.getRefundType()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.retryUntil==null && other.getRetryUntil()==null) || 
             (this.retryUntil!=null &&
              this.retryUntil.equals(other.getRetryUntil()))) &&
            ((this.refundSource==null && other.getRefundSource()==null) || 
             (this.refundSource!=null &&
              this.refundSource.equals(other.getRefundSource()))) &&
            ((this.refundAdvice==null && other.getRefundAdvice()==null) || 
             (this.refundAdvice!=null &&
              this.refundAdvice.equals(other.getRefundAdvice()))) &&
            ((this.merchantStoreDetails==null && other.getMerchantStoreDetails()==null) || 
             (this.merchantStoreDetails!=null &&
              this.merchantStoreDetails.equals(other.getMerchantStoreDetails()))) &&
            ((this.refundItemDetails==null && other.getRefundItemDetails()==null) || 
             (this.refundItemDetails!=null &&
              java.util.Arrays.equals(this.refundItemDetails, other.getRefundItemDetails()))) &&
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
        int _hashCode = super.hashCode();
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getRefundType() != null) {
            _hashCode += getRefundType().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getRetryUntil() != null) {
            _hashCode += getRetryUntil().hashCode();
        }
        if (getRefundSource() != null) {
            _hashCode += getRefundSource().hashCode();
        }
        if (getRefundAdvice() != null) {
            _hashCode += getRefundAdvice().hashCode();
        }
        if (getMerchantStoreDetails() != null) {
            _hashCode += getMerchantStoreDetails().hashCode();
        }
        if (getRefundItemDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRefundItemDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRefundItemDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundTransactionRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PayerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InvoiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retryUntil");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RetryUntil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundSourceCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundAdvice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundAdvice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantStoreDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantStoreDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantStoreDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundItemDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MsgSubID"));
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
