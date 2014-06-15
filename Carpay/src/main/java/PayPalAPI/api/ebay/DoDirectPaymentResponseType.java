/**
 * DoDirectPaymentResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoDirectPaymentResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* The amount of the payment as specified by you on DoDirectPaymentRequest. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Address Verification System response code. Character limit:
     * One single-byte alphanumeric character */
    private java.lang.String AVSCode;

    /* Result of the CVV2 check by PayPal. */
    private java.lang.String CVV2Code;

    /* Transaction identification number.
     * 							
     * 							Character length and limitations: 19 characters maximum. */
    private java.lang.String transactionID;

    /* The reason why a particular transaction went in pending. */
    private eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason;

    /* This will identify the actual transaction status. */
    private eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus;

    private eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails;

    private eBLBaseComponents.apis.ebay.ThreeDSecureResponseType threeDSecureResponse;

    /* Response code from the processor when a recurring transaction
     * is declined. */
    private java.lang.String paymentAdviceCode;

    public DoDirectPaymentResponseType() {
    }

    public DoDirectPaymentResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           java.lang.String AVSCode,
           java.lang.String CVV2Code,
           java.lang.String transactionID,
           eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason,
           eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus,
           eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails,
           eBLBaseComponents.apis.ebay.ThreeDSecureResponseType threeDSecureResponse,
           java.lang.String paymentAdviceCode) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.amount = amount;
        this.AVSCode = AVSCode;
        this.CVV2Code = CVV2Code;
        this.transactionID = transactionID;
        this.pendingReason = pendingReason;
        this.paymentStatus = paymentStatus;
        this.FMFDetails = FMFDetails;
        this.threeDSecureResponse = threeDSecureResponse;
        this.paymentAdviceCode = paymentAdviceCode;
    }


    /**
     * Gets the amount value for this DoDirectPaymentResponseType.
     * 
     * @return amount   * The amount of the payment as specified by you on DoDirectPaymentRequest.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoDirectPaymentResponseType.
     * 
     * @param amount   * The amount of the payment as specified by you on DoDirectPaymentRequest.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the AVSCode value for this DoDirectPaymentResponseType.
     * 
     * @return AVSCode   * Address Verification System response code. Character limit:
     * One single-byte alphanumeric character
     */
    public java.lang.String getAVSCode() {
        return AVSCode;
    }


    /**
     * Sets the AVSCode value for this DoDirectPaymentResponseType.
     * 
     * @param AVSCode   * Address Verification System response code. Character limit:
     * One single-byte alphanumeric character
     */
    public void setAVSCode(java.lang.String AVSCode) {
        this.AVSCode = AVSCode;
    }


    /**
     * Gets the CVV2Code value for this DoDirectPaymentResponseType.
     * 
     * @return CVV2Code   * Result of the CVV2 check by PayPal.
     */
    public java.lang.String getCVV2Code() {
        return CVV2Code;
    }


    /**
     * Sets the CVV2Code value for this DoDirectPaymentResponseType.
     * 
     * @param CVV2Code   * Result of the CVV2 check by PayPal.
     */
    public void setCVV2Code(java.lang.String CVV2Code) {
        this.CVV2Code = CVV2Code;
    }


    /**
     * Gets the transactionID value for this DoDirectPaymentResponseType.
     * 
     * @return transactionID   * Transaction identification number.
     * 							
     * 							Character length and limitations: 19 characters maximum.
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this DoDirectPaymentResponseType.
     * 
     * @param transactionID   * Transaction identification number.
     * 							
     * 							Character length and limitations: 19 characters maximum.
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the pendingReason value for this DoDirectPaymentResponseType.
     * 
     * @return pendingReason   * The reason why a particular transaction went in pending.
     */
    public eBLBaseComponents.apis.ebay.PendingStatusCodeType getPendingReason() {
        return pendingReason;
    }


    /**
     * Sets the pendingReason value for this DoDirectPaymentResponseType.
     * 
     * @param pendingReason   * The reason why a particular transaction went in pending.
     */
    public void setPendingReason(eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason) {
        this.pendingReason = pendingReason;
    }


    /**
     * Gets the paymentStatus value for this DoDirectPaymentResponseType.
     * 
     * @return paymentStatus   * This will identify the actual transaction status.
     */
    public eBLBaseComponents.apis.ebay.PaymentStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this DoDirectPaymentResponseType.
     * 
     * @param paymentStatus   * This will identify the actual transaction status.
     */
    public void setPaymentStatus(eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the FMFDetails value for this DoDirectPaymentResponseType.
     * 
     * @return FMFDetails
     */
    public eBLBaseComponents.apis.ebay.FMFDetailsType getFMFDetails() {
        return FMFDetails;
    }


    /**
     * Sets the FMFDetails value for this DoDirectPaymentResponseType.
     * 
     * @param FMFDetails
     */
    public void setFMFDetails(eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails) {
        this.FMFDetails = FMFDetails;
    }


    /**
     * Gets the threeDSecureResponse value for this DoDirectPaymentResponseType.
     * 
     * @return threeDSecureResponse
     */
    public eBLBaseComponents.apis.ebay.ThreeDSecureResponseType getThreeDSecureResponse() {
        return threeDSecureResponse;
    }


    /**
     * Sets the threeDSecureResponse value for this DoDirectPaymentResponseType.
     * 
     * @param threeDSecureResponse
     */
    public void setThreeDSecureResponse(eBLBaseComponents.apis.ebay.ThreeDSecureResponseType threeDSecureResponse) {
        this.threeDSecureResponse = threeDSecureResponse;
    }


    /**
     * Gets the paymentAdviceCode value for this DoDirectPaymentResponseType.
     * 
     * @return paymentAdviceCode   * Response code from the processor when a recurring transaction
     * is declined.
     */
    public java.lang.String getPaymentAdviceCode() {
        return paymentAdviceCode;
    }


    /**
     * Sets the paymentAdviceCode value for this DoDirectPaymentResponseType.
     * 
     * @param paymentAdviceCode   * Response code from the processor when a recurring transaction
     * is declined.
     */
    public void setPaymentAdviceCode(java.lang.String paymentAdviceCode) {
        this.paymentAdviceCode = paymentAdviceCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoDirectPaymentResponseType)) return false;
        DoDirectPaymentResponseType other = (DoDirectPaymentResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
            ((this.pendingReason==null && other.getPendingReason()==null) || 
             (this.pendingReason!=null &&
              this.pendingReason.equals(other.getPendingReason()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.FMFDetails==null && other.getFMFDetails()==null) || 
             (this.FMFDetails!=null &&
              this.FMFDetails.equals(other.getFMFDetails()))) &&
            ((this.threeDSecureResponse==null && other.getThreeDSecureResponse()==null) || 
             (this.threeDSecureResponse!=null &&
              this.threeDSecureResponse.equals(other.getThreeDSecureResponse()))) &&
            ((this.paymentAdviceCode==null && other.getPaymentAdviceCode()==null) || 
             (this.paymentAdviceCode!=null &&
              this.paymentAdviceCode.equals(other.getPaymentAdviceCode())));
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
        if (getPendingReason() != null) {
            _hashCode += getPendingReason().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getFMFDetails() != null) {
            _hashCode += getFMFDetails().hashCode();
        }
        if (getThreeDSecureResponse() != null) {
            _hashCode += getThreeDSecureResponse().hashCode();
        }
        if (getPaymentAdviceCode() != null) {
            _hashCode += getPaymentAdviceCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoDirectPaymentResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AVSCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AVSCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVV2Code");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CVV2Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PendingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FMFDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "FMFDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDSecureResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ThreeDSecureResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureResponseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAdviceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PaymentAdviceCode"));
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
