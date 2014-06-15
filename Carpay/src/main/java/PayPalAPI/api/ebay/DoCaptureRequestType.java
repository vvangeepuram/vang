/**
 * DoCaptureRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoCaptureRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The authorization identification number of the payment you
     * want to capture. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters maximum */
    private java.lang.String authorizationID;

    /* Amount to authorize. You must set the currencyID attribute
     * to USD. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,) */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Indicates if this capture is the last capture you intend to
     * make. The default is Complete. If CompleteType is Complete, any remaining
     * amount of the original reauthorized transaction is automatically voided.
     * 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 12 single-byte alphanumeric characters */
    private eBLBaseComponents.apis.ebay.CompleteCodeType completeType;

    /* An informational note about this settlement that is displayed
     * to the payer in email and in  transaction history. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 255 single-byte characters */
    private java.lang.String note;

    /* Your invoice number or other identification number. 
     * 
     * 										
     * The InvoiceID value is recorded only if the authorization you are
     * capturing is an order authorization, not a basic authorization.
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 127 single-byte alphanumeric characters */
    private java.lang.String invoiceID;

    /* Contains enhanced data like airline itinerary information. */
    private eBLBaseComponents.apis.ebay.EnhancedDataType enhancedData;

    /* dynamic descriptor
     * 										
     * 										
     * Dynamic descriptor is used for merchant to provide detail of a transaction
     * appears on statement
     * 										
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: <18 characters alphanumeric characters */
    private java.lang.String descriptor;

    /* To pass the Merchant store information */
    private eBLBaseComponents.apis.ebay.MerchantStoreDetailsType merchantStoreDetails;

    /* Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    /* This holds key-value pair which merchants wants to pass it
     * to the open wallet-PLCC processor */
    private eBLBaseComponents.apis.ebay.MerchantDataType merchantData;

    public DoCaptureRequestType() {
    }

    public DoCaptureRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String authorizationID,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.CompleteCodeType completeType,
           java.lang.String note,
           java.lang.String invoiceID,
           eBLBaseComponents.apis.ebay.EnhancedDataType enhancedData,
           java.lang.String descriptor,
           eBLBaseComponents.apis.ebay.MerchantStoreDetailsType merchantStoreDetails,
           java.lang.String msgSubID,
           eBLBaseComponents.apis.ebay.MerchantDataType merchantData) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.authorizationID = authorizationID;
        this.amount = amount;
        this.completeType = completeType;
        this.note = note;
        this.invoiceID = invoiceID;
        this.enhancedData = enhancedData;
        this.descriptor = descriptor;
        this.merchantStoreDetails = merchantStoreDetails;
        this.msgSubID = msgSubID;
        this.merchantData = merchantData;
    }


    /**
     * Gets the authorizationID value for this DoCaptureRequestType.
     * 
     * @return authorizationID   * The authorization identification number of the payment you
     * want to capture. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this DoCaptureRequestType.
     * 
     * @param authorizationID   * The authorization identification number of the payment you
     * want to capture. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 19 single-byte characters maximum
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the amount value for this DoCaptureRequestType.
     * 
     * @return amount   * Amount to authorize. You must set the currencyID attribute
     * to USD. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,)
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoCaptureRequestType.
     * 
     * @param amount   * Amount to authorize. You must set the currencyID attribute
     * to USD. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,)
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the completeType value for this DoCaptureRequestType.
     * 
     * @return completeType   * Indicates if this capture is the last capture you intend to
     * make. The default is Complete. If CompleteType is Complete, any remaining
     * amount of the original reauthorized transaction is automatically voided.
     * 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 12 single-byte alphanumeric characters
     */
    public eBLBaseComponents.apis.ebay.CompleteCodeType getCompleteType() {
        return completeType;
    }


    /**
     * Sets the completeType value for this DoCaptureRequestType.
     * 
     * @param completeType   * Indicates if this capture is the last capture you intend to
     * make. The default is Complete. If CompleteType is Complete, any remaining
     * amount of the original reauthorized transaction is automatically voided.
     * 
     * 
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: 12 single-byte alphanumeric characters
     */
    public void setCompleteType(eBLBaseComponents.apis.ebay.CompleteCodeType completeType) {
        this.completeType = completeType;
    }


    /**
     * Gets the note value for this DoCaptureRequestType.
     * 
     * @return note   * An informational note about this settlement that is displayed
     * to the payer in email and in  transaction history. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 255 single-byte characters
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this DoCaptureRequestType.
     * 
     * @param note   * An informational note about this settlement that is displayed
     * to the payer in email and in  transaction history. 
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 255 single-byte characters
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the invoiceID value for this DoCaptureRequestType.
     * 
     * @return invoiceID   * Your invoice number or other identification number. 
     * 
     * 										
     * The InvoiceID value is recorded only if the authorization you are
     * capturing is an order authorization, not a basic authorization.
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 127 single-byte alphanumeric characters
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this DoCaptureRequestType.
     * 
     * @param invoiceID   * Your invoice number or other identification number. 
     * 
     * 										
     * The InvoiceID value is recorded only if the authorization you are
     * capturing is an order authorization, not a basic authorization.
     * 
     * 										
     * Optional
     * 
     * 										
     * Character length and limits: 127 single-byte alphanumeric characters
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the enhancedData value for this DoCaptureRequestType.
     * 
     * @return enhancedData   * Contains enhanced data like airline itinerary information.
     */
    public eBLBaseComponents.apis.ebay.EnhancedDataType getEnhancedData() {
        return enhancedData;
    }


    /**
     * Sets the enhancedData value for this DoCaptureRequestType.
     * 
     * @param enhancedData   * Contains enhanced data like airline itinerary information.
     */
    public void setEnhancedData(eBLBaseComponents.apis.ebay.EnhancedDataType enhancedData) {
        this.enhancedData = enhancedData;
    }


    /**
     * Gets the descriptor value for this DoCaptureRequestType.
     * 
     * @return descriptor   * dynamic descriptor
     * 										
     * 										
     * Dynamic descriptor is used for merchant to provide detail of a transaction
     * appears on statement
     * 										
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: <18 characters alphanumeric characters
     */
    public java.lang.String getDescriptor() {
        return descriptor;
    }


    /**
     * Sets the descriptor value for this DoCaptureRequestType.
     * 
     * @param descriptor   * dynamic descriptor
     * 										
     * 										
     * Dynamic descriptor is used for merchant to provide detail of a transaction
     * appears on statement
     * 										
     * 										
     * 										
     * 										
     * 										
     * Character length and limits: <18 characters alphanumeric characters
     */
    public void setDescriptor(java.lang.String descriptor) {
        this.descriptor = descriptor;
    }


    /**
     * Gets the merchantStoreDetails value for this DoCaptureRequestType.
     * 
     * @return merchantStoreDetails   * To pass the Merchant store information
     */
    public eBLBaseComponents.apis.ebay.MerchantStoreDetailsType getMerchantStoreDetails() {
        return merchantStoreDetails;
    }


    /**
     * Sets the merchantStoreDetails value for this DoCaptureRequestType.
     * 
     * @param merchantStoreDetails   * To pass the Merchant store information
     */
    public void setMerchantStoreDetails(eBLBaseComponents.apis.ebay.MerchantStoreDetailsType merchantStoreDetails) {
        this.merchantStoreDetails = merchantStoreDetails;
    }


    /**
     * Gets the msgSubID value for this DoCaptureRequestType.
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
     * Sets the msgSubID value for this DoCaptureRequestType.
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


    /**
     * Gets the merchantData value for this DoCaptureRequestType.
     * 
     * @return merchantData   * This holds key-value pair which merchants wants to pass it
     * to the open wallet-PLCC processor
     */
    public eBLBaseComponents.apis.ebay.MerchantDataType getMerchantData() {
        return merchantData;
    }


    /**
     * Sets the merchantData value for this DoCaptureRequestType.
     * 
     * @param merchantData   * This holds key-value pair which merchants wants to pass it
     * to the open wallet-PLCC processor
     */
    public void setMerchantData(eBLBaseComponents.apis.ebay.MerchantDataType merchantData) {
        this.merchantData = merchantData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCaptureRequestType)) return false;
        DoCaptureRequestType other = (DoCaptureRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.authorizationID==null && other.getAuthorizationID()==null) || 
             (this.authorizationID!=null &&
              this.authorizationID.equals(other.getAuthorizationID()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.completeType==null && other.getCompleteType()==null) || 
             (this.completeType!=null &&
              this.completeType.equals(other.getCompleteType()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.enhancedData==null && other.getEnhancedData()==null) || 
             (this.enhancedData!=null &&
              this.enhancedData.equals(other.getEnhancedData()))) &&
            ((this.descriptor==null && other.getDescriptor()==null) || 
             (this.descriptor!=null &&
              this.descriptor.equals(other.getDescriptor()))) &&
            ((this.merchantStoreDetails==null && other.getMerchantStoreDetails()==null) || 
             (this.merchantStoreDetails!=null &&
              this.merchantStoreDetails.equals(other.getMerchantStoreDetails()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID()))) &&
            ((this.merchantData==null && other.getMerchantData()==null) || 
             (this.merchantData!=null &&
              this.merchantData.equals(other.getMerchantData())));
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
        if (getAuthorizationID() != null) {
            _hashCode += getAuthorizationID().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCompleteType() != null) {
            _hashCode += getCompleteType().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getEnhancedData() != null) {
            _hashCode += getEnhancedData().hashCode();
        }
        if (getDescriptor() != null) {
            _hashCode += getDescriptor().hashCode();
        }
        if (getMerchantStoreDetails() != null) {
            _hashCode += getMerchantStoreDetails().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        if (getMerchantData() != null) {
            _hashCode += getMerchantData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCaptureRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoCaptureRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AuthorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CompleteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CompleteCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Note"));
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
        elemField.setFieldName("enhancedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Descriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MsgSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantDataType"));
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
