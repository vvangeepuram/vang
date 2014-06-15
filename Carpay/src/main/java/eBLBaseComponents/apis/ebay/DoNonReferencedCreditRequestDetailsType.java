/**
 * DoNonReferencedCreditRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoNonReferencedCreditRequestDetailsType  implements java.io.Serializable {
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    private CoreComponentTypes.apis.ebay.BasicAmountType netAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType taxAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount;

    private eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard;

    private java.lang.String receiverEmail;

    private java.lang.String comment;

    public DoNonReferencedCreditRequestDetailsType() {
    }

    public DoNonReferencedCreditRequestDetailsType(
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           CoreComponentTypes.apis.ebay.BasicAmountType netAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType taxAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount,
           eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard,
           java.lang.String receiverEmail,
           java.lang.String comment) {
           this.amount = amount;
           this.netAmount = netAmount;
           this.taxAmount = taxAmount;
           this.shippingAmount = shippingAmount;
           this.creditCard = creditCard;
           this.receiverEmail = receiverEmail;
           this.comment = comment;
    }


    /**
     * Gets the amount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return amount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param amount
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the netAmount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return netAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param netAmount
     */
    public void setNetAmount(CoreComponentTypes.apis.ebay.BasicAmountType netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the taxAmount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return taxAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the shippingAmount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return shippingAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the creditCard value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return creditCard
     */
    public eBLBaseComponents.apis.ebay.CreditCardDetailsType getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param creditCard
     */
    public void setCreditCard(eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the receiverEmail value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return receiverEmail
     */
    public java.lang.String getReceiverEmail() {
        return receiverEmail;
    }


    /**
     * Sets the receiverEmail value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param receiverEmail
     */
    public void setReceiverEmail(java.lang.String receiverEmail) {
        this.receiverEmail = receiverEmail;
    }


    /**
     * Gets the comment value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this DoNonReferencedCreditRequestDetailsType.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNonReferencedCreditRequestDetailsType)) return false;
        DoNonReferencedCreditRequestDetailsType other = (DoNonReferencedCreditRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.receiverEmail==null && other.getReceiverEmail()==null) || 
             (this.receiverEmail!=null &&
              this.receiverEmail.equals(other.getReceiverEmail()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getReceiverEmail() != null) {
            _hashCode += getReceiverEmail().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoNonReferencedCreditRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiverEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiverEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Comment"));
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
