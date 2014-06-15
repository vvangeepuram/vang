/**
 * IncentiveAppliedDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details of incentive application on individual bucket/item.
 */
public class IncentiveAppliedDetailsType  implements java.io.Serializable {
    /* PaymentRequestID uniquely identifies a bucket. It is the "bucket
     * id" in the world of EC API. */
    private java.lang.String paymentRequestID;

    /* The item id passed through by the merchant. */
    private java.lang.String itemId;

    /* The item transaction id passed through by the merchant. */
    private java.lang.String externalTxnId;

    /* Discount offerred for this bucket or item. */
    private CoreComponentTypes.apis.ebay.BasicAmountType discountAmount;

    /* SubType for coupon. */
    private java.lang.String subType;

    public IncentiveAppliedDetailsType() {
    }

    public IncentiveAppliedDetailsType(
           java.lang.String paymentRequestID,
           java.lang.String itemId,
           java.lang.String externalTxnId,
           CoreComponentTypes.apis.ebay.BasicAmountType discountAmount,
           java.lang.String subType) {
           this.paymentRequestID = paymentRequestID;
           this.itemId = itemId;
           this.externalTxnId = externalTxnId;
           this.discountAmount = discountAmount;
           this.subType = subType;
    }


    /**
     * Gets the paymentRequestID value for this IncentiveAppliedDetailsType.
     * 
     * @return paymentRequestID   * PaymentRequestID uniquely identifies a bucket. It is the "bucket
     * id" in the world of EC API.
     */
    public java.lang.String getPaymentRequestID() {
        return paymentRequestID;
    }


    /**
     * Sets the paymentRequestID value for this IncentiveAppliedDetailsType.
     * 
     * @param paymentRequestID   * PaymentRequestID uniquely identifies a bucket. It is the "bucket
     * id" in the world of EC API.
     */
    public void setPaymentRequestID(java.lang.String paymentRequestID) {
        this.paymentRequestID = paymentRequestID;
    }


    /**
     * Gets the itemId value for this IncentiveAppliedDetailsType.
     * 
     * @return itemId   * The item id passed through by the merchant.
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this IncentiveAppliedDetailsType.
     * 
     * @param itemId   * The item id passed through by the merchant.
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the externalTxnId value for this IncentiveAppliedDetailsType.
     * 
     * @return externalTxnId   * The item transaction id passed through by the merchant.
     */
    public java.lang.String getExternalTxnId() {
        return externalTxnId;
    }


    /**
     * Sets the externalTxnId value for this IncentiveAppliedDetailsType.
     * 
     * @param externalTxnId   * The item transaction id passed through by the merchant.
     */
    public void setExternalTxnId(java.lang.String externalTxnId) {
        this.externalTxnId = externalTxnId;
    }


    /**
     * Gets the discountAmount value for this IncentiveAppliedDetailsType.
     * 
     * @return discountAmount   * Discount offerred for this bucket or item.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this IncentiveAppliedDetailsType.
     * 
     * @param discountAmount   * Discount offerred for this bucket or item.
     */
    public void setDiscountAmount(CoreComponentTypes.apis.ebay.BasicAmountType discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the subType value for this IncentiveAppliedDetailsType.
     * 
     * @return subType   * SubType for coupon.
     */
    public java.lang.String getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this IncentiveAppliedDetailsType.
     * 
     * @param subType   * SubType for coupon.
     */
    public void setSubType(java.lang.String subType) {
        this.subType = subType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveAppliedDetailsType)) return false;
        IncentiveAppliedDetailsType other = (IncentiveAppliedDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentRequestID==null && other.getPaymentRequestID()==null) || 
             (this.paymentRequestID!=null &&
              this.paymentRequestID.equals(other.getPaymentRequestID()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.externalTxnId==null && other.getExternalTxnId()==null) || 
             (this.externalTxnId!=null &&
              this.externalTxnId.equals(other.getExternalTxnId()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType())));
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
        if (getPaymentRequestID() != null) {
            _hashCode += getPaymentRequestID().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getExternalTxnId() != null) {
            _hashCode += getExternalTxnId().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveAppliedDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalTxnId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalTxnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubType"));
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
