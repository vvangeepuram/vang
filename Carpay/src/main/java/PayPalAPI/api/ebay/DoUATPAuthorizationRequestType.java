/**
 * DoUATPAuthorizationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoUATPAuthorizationRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* UATP card details */
    private eBLBaseComponents.apis.ebay.UATPDetailsType UATPDetails;

    /* Type of transaction to authorize. The only allowable value
     * is , which means that the transaction represents a customer order
     * that can be fulfilled over 29 days. 
     * 
     * 										
     * Optional */
    private eBLBaseComponents.apis.ebay.TransactionEntityType transactionEntity;

    /* Amount to authorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Invoice ID. A pass through. */
    private java.lang.String invoiceID;

    /* Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    public DoUATPAuthorizationRequestType() {
    }

    public DoUATPAuthorizationRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.UATPDetailsType UATPDetails,
           eBLBaseComponents.apis.ebay.TransactionEntityType transactionEntity,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String invoiceID,
           java.lang.String msgSubID) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.UATPDetails = UATPDetails;
        this.transactionEntity = transactionEntity;
        this.amount = amount;
        this.invoiceID = invoiceID;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the UATPDetails value for this DoUATPAuthorizationRequestType.
     * 
     * @return UATPDetails   * UATP card details
     */
    public eBLBaseComponents.apis.ebay.UATPDetailsType getUATPDetails() {
        return UATPDetails;
    }


    /**
     * Sets the UATPDetails value for this DoUATPAuthorizationRequestType.
     * 
     * @param UATPDetails   * UATP card details
     */
    public void setUATPDetails(eBLBaseComponents.apis.ebay.UATPDetailsType UATPDetails) {
        this.UATPDetails = UATPDetails;
    }


    /**
     * Gets the transactionEntity value for this DoUATPAuthorizationRequestType.
     * 
     * @return transactionEntity   * Type of transaction to authorize. The only allowable value
     * is , which means that the transaction represents a customer order
     * that can be fulfilled over 29 days. 
     * 
     * 										
     * Optional
     */
    public eBLBaseComponents.apis.ebay.TransactionEntityType getTransactionEntity() {
        return transactionEntity;
    }


    /**
     * Sets the transactionEntity value for this DoUATPAuthorizationRequestType.
     * 
     * @param transactionEntity   * Type of transaction to authorize. The only allowable value
     * is , which means that the transaction represents a customer order
     * that can be fulfilled over 29 days. 
     * 
     * 										
     * Optional
     */
    public void setTransactionEntity(eBLBaseComponents.apis.ebay.TransactionEntityType transactionEntity) {
        this.transactionEntity = transactionEntity;
    }


    /**
     * Gets the amount value for this DoUATPAuthorizationRequestType.
     * 
     * @return amount   * Amount to authorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoUATPAuthorizationRequestType.
     * 
     * @param amount   * Amount to authorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the invoiceID value for this DoUATPAuthorizationRequestType.
     * 
     * @return invoiceID   * Invoice ID. A pass through.
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this DoUATPAuthorizationRequestType.
     * 
     * @param invoiceID   * Invoice ID. A pass through.
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the msgSubID value for this DoUATPAuthorizationRequestType.
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
     * Sets the msgSubID value for this DoUATPAuthorizationRequestType.
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
        if (!(obj instanceof DoUATPAuthorizationRequestType)) return false;
        DoUATPAuthorizationRequestType other = (DoUATPAuthorizationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.UATPDetails==null && other.getUATPDetails()==null) || 
             (this.UATPDetails!=null &&
              this.UATPDetails.equals(other.getUATPDetails()))) &&
            ((this.transactionEntity==null && other.getTransactionEntity()==null) || 
             (this.transactionEntity!=null &&
              this.transactionEntity.equals(other.getTransactionEntity()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
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
        if (getUATPDetails() != null) {
            _hashCode += getUATPDetails().hashCode();
        }
        if (getTransactionEntity() != null) {
            _hashCode += getTransactionEntity().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoUATPAuthorizationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPAuthorizationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UATPDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
