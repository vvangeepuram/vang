/**
 * DoReferenceTransactionRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoReferenceTransactionRequestDetailsType  implements java.io.Serializable {
    private java.lang.String referenceID;

    private eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction;

    private eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType;

    private eBLBaseComponents.apis.ebay.PaymentDetailsType paymentDetails;

    private eBLBaseComponents.apis.ebay.ReferenceCreditCardDetailsType creditCard;

    private java.lang.String IPAddress;

    private java.lang.String merchantSessionId;

    private java.lang.String reqConfirmShipping;

    private java.lang.String softDescriptor;

    private eBLBaseComponents.apis.ebay.SenderDetailsType senderDetails;

    /* Unique id for each API request to prevent duplicate payments.
     * 					
     * 					
     * 					
     * 					Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    public DoReferenceTransactionRequestDetailsType() {
    }

    public DoReferenceTransactionRequestDetailsType(
           java.lang.String referenceID,
           eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction,
           eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType,
           eBLBaseComponents.apis.ebay.PaymentDetailsType paymentDetails,
           eBLBaseComponents.apis.ebay.ReferenceCreditCardDetailsType creditCard,
           java.lang.String IPAddress,
           java.lang.String merchantSessionId,
           java.lang.String reqConfirmShipping,
           java.lang.String softDescriptor,
           eBLBaseComponents.apis.ebay.SenderDetailsType senderDetails,
           java.lang.String msgSubID) {
           this.referenceID = referenceID;
           this.paymentAction = paymentAction;
           this.paymentType = paymentType;
           this.paymentDetails = paymentDetails;
           this.creditCard = creditCard;
           this.IPAddress = IPAddress;
           this.merchantSessionId = merchantSessionId;
           this.reqConfirmShipping = reqConfirmShipping;
           this.softDescriptor = softDescriptor;
           this.senderDetails = senderDetails;
           this.msgSubID = msgSubID;
    }


    /**
     * Gets the referenceID value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return referenceID
     */
    public java.lang.String getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param referenceID
     */
    public void setReferenceID(java.lang.String referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the paymentAction value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return paymentAction
     */
    public eBLBaseComponents.apis.ebay.PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }


    /**
     * Sets the paymentAction value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param paymentAction
     */
    public void setPaymentAction(eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction) {
        this.paymentAction = paymentAction;
    }


    /**
     * Gets the paymentType value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return paymentType
     */
    public eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param paymentType
     */
    public void setPaymentType(eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the paymentDetails value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return paymentDetails
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }


    /**
     * Sets the paymentDetails value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param paymentDetails
     */
    public void setPaymentDetails(eBLBaseComponents.apis.ebay.PaymentDetailsType paymentDetails) {
        this.paymentDetails = paymentDetails;
    }


    /**
     * Gets the creditCard value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return creditCard
     */
    public eBLBaseComponents.apis.ebay.ReferenceCreditCardDetailsType getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param creditCard
     */
    public void setCreditCard(eBLBaseComponents.apis.ebay.ReferenceCreditCardDetailsType creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the IPAddress value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return IPAddress
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param IPAddress
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the merchantSessionId value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return merchantSessionId
     */
    public java.lang.String getMerchantSessionId() {
        return merchantSessionId;
    }


    /**
     * Sets the merchantSessionId value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param merchantSessionId
     */
    public void setMerchantSessionId(java.lang.String merchantSessionId) {
        this.merchantSessionId = merchantSessionId;
    }


    /**
     * Gets the reqConfirmShipping value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return reqConfirmShipping
     */
    public java.lang.String getReqConfirmShipping() {
        return reqConfirmShipping;
    }


    /**
     * Sets the reqConfirmShipping value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param reqConfirmShipping
     */
    public void setReqConfirmShipping(java.lang.String reqConfirmShipping) {
        this.reqConfirmShipping = reqConfirmShipping;
    }


    /**
     * Gets the softDescriptor value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return softDescriptor
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the senderDetails value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return senderDetails
     */
    public eBLBaseComponents.apis.ebay.SenderDetailsType getSenderDetails() {
        return senderDetails;
    }


    /**
     * Sets the senderDetails value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param senderDetails
     */
    public void setSenderDetails(eBLBaseComponents.apis.ebay.SenderDetailsType senderDetails) {
        this.senderDetails = senderDetails;
    }


    /**
     * Gets the msgSubID value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @return msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 					
     * 					
     * 					
     * 					Character length and limits: 38 single-byte characters maximum.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoReferenceTransactionRequestDetailsType.
     * 
     * @param msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 					
     * 					
     * 					
     * 					Character length and limits: 38 single-byte characters maximum.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReferenceTransactionRequestDetailsType)) return false;
        DoReferenceTransactionRequestDetailsType other = (DoReferenceTransactionRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.paymentAction==null && other.getPaymentAction()==null) || 
             (this.paymentAction!=null &&
              this.paymentAction.equals(other.getPaymentAction()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.paymentDetails==null && other.getPaymentDetails()==null) || 
             (this.paymentDetails!=null &&
              this.paymentDetails.equals(other.getPaymentDetails()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.merchantSessionId==null && other.getMerchantSessionId()==null) || 
             (this.merchantSessionId!=null &&
              this.merchantSessionId.equals(other.getMerchantSessionId()))) &&
            ((this.reqConfirmShipping==null && other.getReqConfirmShipping()==null) || 
             (this.reqConfirmShipping!=null &&
              this.reqConfirmShipping.equals(other.getReqConfirmShipping()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.senderDetails==null && other.getSenderDetails()==null) || 
             (this.senderDetails!=null &&
              this.senderDetails.equals(other.getSenderDetails()))) &&
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
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getPaymentAction() != null) {
            _hashCode += getPaymentAction().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPaymentDetails() != null) {
            _hashCode += getPaymentDetails().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getMerchantSessionId() != null) {
            _hashCode += getMerchantSessionId().hashCode();
        }
        if (getReqConfirmShipping() != null) {
            _hashCode += getReqConfirmShipping().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getSenderDetails() != null) {
            _hashCode += getSenderDetails().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReferenceTransactionRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoReferenceTransactionRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentActionCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReferenceCreditCardDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqConfirmShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqConfirmShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SoftDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SenderDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SenderDetailsType"));
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
