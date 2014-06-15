/**
 * BillingAgreementDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BillingAgreementDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.BillingCodeType billingType;

    /* Only needed for AutoBill billinng type. */
    private java.lang.String billingAgreementDescription;

    private eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType;

    /* Custom annotation field for your exclusive use. */
    private java.lang.String billingAgreementCustom;

    public BillingAgreementDetailsType() {
    }

    public BillingAgreementDetailsType(
           eBLBaseComponents.apis.ebay.BillingCodeType billingType,
           java.lang.String billingAgreementDescription,
           eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType,
           java.lang.String billingAgreementCustom) {
           this.billingType = billingType;
           this.billingAgreementDescription = billingAgreementDescription;
           this.paymentType = paymentType;
           this.billingAgreementCustom = billingAgreementCustom;
    }


    /**
     * Gets the billingType value for this BillingAgreementDetailsType.
     * 
     * @return billingType
     */
    public eBLBaseComponents.apis.ebay.BillingCodeType getBillingType() {
        return billingType;
    }


    /**
     * Sets the billingType value for this BillingAgreementDetailsType.
     * 
     * @param billingType
     */
    public void setBillingType(eBLBaseComponents.apis.ebay.BillingCodeType billingType) {
        this.billingType = billingType;
    }


    /**
     * Gets the billingAgreementDescription value for this BillingAgreementDetailsType.
     * 
     * @return billingAgreementDescription   * Only needed for AutoBill billinng type.
     */
    public java.lang.String getBillingAgreementDescription() {
        return billingAgreementDescription;
    }


    /**
     * Sets the billingAgreementDescription value for this BillingAgreementDetailsType.
     * 
     * @param billingAgreementDescription   * Only needed for AutoBill billinng type.
     */
    public void setBillingAgreementDescription(java.lang.String billingAgreementDescription) {
        this.billingAgreementDescription = billingAgreementDescription;
    }


    /**
     * Gets the paymentType value for this BillingAgreementDetailsType.
     * 
     * @return paymentType
     */
    public eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this BillingAgreementDetailsType.
     * 
     * @param paymentType
     */
    public void setPaymentType(eBLBaseComponents.apis.ebay.MerchantPullPaymentCodeType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the billingAgreementCustom value for this BillingAgreementDetailsType.
     * 
     * @return billingAgreementCustom   * Custom annotation field for your exclusive use.
     */
    public java.lang.String getBillingAgreementCustom() {
        return billingAgreementCustom;
    }


    /**
     * Sets the billingAgreementCustom value for this BillingAgreementDetailsType.
     * 
     * @param billingAgreementCustom   * Custom annotation field for your exclusive use.
     */
    public void setBillingAgreementCustom(java.lang.String billingAgreementCustom) {
        this.billingAgreementCustom = billingAgreementCustom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingAgreementDetailsType)) return false;
        BillingAgreementDetailsType other = (BillingAgreementDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingType==null && other.getBillingType()==null) || 
             (this.billingType!=null &&
              this.billingType.equals(other.getBillingType()))) &&
            ((this.billingAgreementDescription==null && other.getBillingAgreementDescription()==null) || 
             (this.billingAgreementDescription!=null &&
              this.billingAgreementDescription.equals(other.getBillingAgreementDescription()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.billingAgreementCustom==null && other.getBillingAgreementCustom()==null) || 
             (this.billingAgreementCustom!=null &&
              this.billingAgreementCustom.equals(other.getBillingAgreementCustom())));
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
        if (getBillingType() != null) {
            _hashCode += getBillingType().hashCode();
        }
        if (getBillingAgreementDescription() != null) {
            _hashCode += getBillingAgreementDescription().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getBillingAgreementCustom() != null) {
            _hashCode += getBillingAgreementCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingAgreementDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("billingAgreementCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementCustom"));
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
