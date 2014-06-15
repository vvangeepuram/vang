/**
 * RefundTransactionResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class RefundTransactionResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    /* Unique transaction ID of the refund. 
     * 
     * 										
     * Character length and limitations:17 single-byte characters */
    private java.lang.String refundTransactionID;

    /* Amount subtracted from PayPal balance of original recipient
     * of payment to make this refund */
    private CoreComponentTypes.apis.ebay.BasicAmountType netRefundAmount;

    /* Transaction fee refunded to original recipient of payment */
    private CoreComponentTypes.apis.ebay.BasicAmountType feeRefundAmount;

    /* Amount of money refunded to original payer */
    private CoreComponentTypes.apis.ebay.BasicAmountType grossRefundAmount;

    /* Total of all previous refunds */
    private CoreComponentTypes.apis.ebay.BasicAmountType totalRefundedAmount;

    /* Contains Refund Payment status information. */
    private eBLBaseComponents.apis.ebay.RefundInfoType refundInfo;

    /* Any general information like offer details that is reinstated
     * or any other marketing data */
    private java.lang.String receiptData;

    /* Return msgsubid back to merchant */
    private java.lang.String msgSubID;

    public RefundTransactionResponseType() {
    }

    public RefundTransactionResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String refundTransactionID,
           CoreComponentTypes.apis.ebay.BasicAmountType netRefundAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType feeRefundAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType grossRefundAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType totalRefundedAmount,
           eBLBaseComponents.apis.ebay.RefundInfoType refundInfo,
           java.lang.String receiptData,
           java.lang.String msgSubID) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.refundTransactionID = refundTransactionID;
        this.netRefundAmount = netRefundAmount;
        this.feeRefundAmount = feeRefundAmount;
        this.grossRefundAmount = grossRefundAmount;
        this.totalRefundedAmount = totalRefundedAmount;
        this.refundInfo = refundInfo;
        this.receiptData = receiptData;
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the refundTransactionID value for this RefundTransactionResponseType.
     * 
     * @return refundTransactionID   * Unique transaction ID of the refund. 
     * 
     * 										
     * Character length and limitations:17 single-byte characters
     */
    public java.lang.String getRefundTransactionID() {
        return refundTransactionID;
    }


    /**
     * Sets the refundTransactionID value for this RefundTransactionResponseType.
     * 
     * @param refundTransactionID   * Unique transaction ID of the refund. 
     * 
     * 										
     * Character length and limitations:17 single-byte characters
     */
    public void setRefundTransactionID(java.lang.String refundTransactionID) {
        this.refundTransactionID = refundTransactionID;
    }


    /**
     * Gets the netRefundAmount value for this RefundTransactionResponseType.
     * 
     * @return netRefundAmount   * Amount subtracted from PayPal balance of original recipient
     * of payment to make this refund
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getNetRefundAmount() {
        return netRefundAmount;
    }


    /**
     * Sets the netRefundAmount value for this RefundTransactionResponseType.
     * 
     * @param netRefundAmount   * Amount subtracted from PayPal balance of original recipient
     * of payment to make this refund
     */
    public void setNetRefundAmount(CoreComponentTypes.apis.ebay.BasicAmountType netRefundAmount) {
        this.netRefundAmount = netRefundAmount;
    }


    /**
     * Gets the feeRefundAmount value for this RefundTransactionResponseType.
     * 
     * @return feeRefundAmount   * Transaction fee refunded to original recipient of payment
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getFeeRefundAmount() {
        return feeRefundAmount;
    }


    /**
     * Sets the feeRefundAmount value for this RefundTransactionResponseType.
     * 
     * @param feeRefundAmount   * Transaction fee refunded to original recipient of payment
     */
    public void setFeeRefundAmount(CoreComponentTypes.apis.ebay.BasicAmountType feeRefundAmount) {
        this.feeRefundAmount = feeRefundAmount;
    }


    /**
     * Gets the grossRefundAmount value for this RefundTransactionResponseType.
     * 
     * @return grossRefundAmount   * Amount of money refunded to original payer
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGrossRefundAmount() {
        return grossRefundAmount;
    }


    /**
     * Sets the grossRefundAmount value for this RefundTransactionResponseType.
     * 
     * @param grossRefundAmount   * Amount of money refunded to original payer
     */
    public void setGrossRefundAmount(CoreComponentTypes.apis.ebay.BasicAmountType grossRefundAmount) {
        this.grossRefundAmount = grossRefundAmount;
    }


    /**
     * Gets the totalRefundedAmount value for this RefundTransactionResponseType.
     * 
     * @return totalRefundedAmount   * Total of all previous refunds
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTotalRefundedAmount() {
        return totalRefundedAmount;
    }


    /**
     * Sets the totalRefundedAmount value for this RefundTransactionResponseType.
     * 
     * @param totalRefundedAmount   * Total of all previous refunds
     */
    public void setTotalRefundedAmount(CoreComponentTypes.apis.ebay.BasicAmountType totalRefundedAmount) {
        this.totalRefundedAmount = totalRefundedAmount;
    }


    /**
     * Gets the refundInfo value for this RefundTransactionResponseType.
     * 
     * @return refundInfo   * Contains Refund Payment status information.
     */
    public eBLBaseComponents.apis.ebay.RefundInfoType getRefundInfo() {
        return refundInfo;
    }


    /**
     * Sets the refundInfo value for this RefundTransactionResponseType.
     * 
     * @param refundInfo   * Contains Refund Payment status information.
     */
    public void setRefundInfo(eBLBaseComponents.apis.ebay.RefundInfoType refundInfo) {
        this.refundInfo = refundInfo;
    }


    /**
     * Gets the receiptData value for this RefundTransactionResponseType.
     * 
     * @return receiptData   * Any general information like offer details that is reinstated
     * or any other marketing data
     */
    public java.lang.String getReceiptData() {
        return receiptData;
    }


    /**
     * Sets the receiptData value for this RefundTransactionResponseType.
     * 
     * @param receiptData   * Any general information like offer details that is reinstated
     * or any other marketing data
     */
    public void setReceiptData(java.lang.String receiptData) {
        this.receiptData = receiptData;
    }


    /**
     * Gets the msgSubID value for this RefundTransactionResponseType.
     * 
     * @return msgSubID   * Return msgsubid back to merchant
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this RefundTransactionResponseType.
     * 
     * @param msgSubID   * Return msgsubid back to merchant
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefundTransactionResponseType)) return false;
        RefundTransactionResponseType other = (RefundTransactionResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.refundTransactionID==null && other.getRefundTransactionID()==null) || 
             (this.refundTransactionID!=null &&
              this.refundTransactionID.equals(other.getRefundTransactionID()))) &&
            ((this.netRefundAmount==null && other.getNetRefundAmount()==null) || 
             (this.netRefundAmount!=null &&
              this.netRefundAmount.equals(other.getNetRefundAmount()))) &&
            ((this.feeRefundAmount==null && other.getFeeRefundAmount()==null) || 
             (this.feeRefundAmount!=null &&
              this.feeRefundAmount.equals(other.getFeeRefundAmount()))) &&
            ((this.grossRefundAmount==null && other.getGrossRefundAmount()==null) || 
             (this.grossRefundAmount!=null &&
              this.grossRefundAmount.equals(other.getGrossRefundAmount()))) &&
            ((this.totalRefundedAmount==null && other.getTotalRefundedAmount()==null) || 
             (this.totalRefundedAmount!=null &&
              this.totalRefundedAmount.equals(other.getTotalRefundedAmount()))) &&
            ((this.refundInfo==null && other.getRefundInfo()==null) || 
             (this.refundInfo!=null &&
              this.refundInfo.equals(other.getRefundInfo()))) &&
            ((this.receiptData==null && other.getReceiptData()==null) || 
             (this.receiptData!=null &&
              this.receiptData.equals(other.getReceiptData()))) &&
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
        if (getRefundTransactionID() != null) {
            _hashCode += getRefundTransactionID().hashCode();
        }
        if (getNetRefundAmount() != null) {
            _hashCode += getNetRefundAmount().hashCode();
        }
        if (getFeeRefundAmount() != null) {
            _hashCode += getFeeRefundAmount().hashCode();
        }
        if (getGrossRefundAmount() != null) {
            _hashCode += getGrossRefundAmount().hashCode();
        }
        if (getTotalRefundedAmount() != null) {
            _hashCode += getTotalRefundedAmount().hashCode();
        }
        if (getRefundInfo() != null) {
            _hashCode += getRefundInfo().hashCode();
        }
        if (getReceiptData() != null) {
            _hashCode += getReceiptData().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefundTransactionResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "RefundTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "NetRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "FeeRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GrossRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRefundedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TotalRefundedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReceiptData"));
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
