/**
 * BillingPeriodDetailsType_Update.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BillingPeriodDetailsType_Update  implements java.io.Serializable {
    /* Unit of meausre for billing cycle */
    private eBLBaseComponents.apis.ebay.BillingPeriodType billingPeriod;

    /* Number of BillingPeriod that make up one billing cycle */
    private java.lang.Integer billingFrequency;

    /* Total billing cycles in this portion of the schedule */
    private java.lang.Integer totalBillingCycles;

    /* Amount to charge */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Additional shipping amount to charge */
    private CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount;

    /* Additional tax amount to charge */
    private CoreComponentTypes.apis.ebay.BasicAmountType taxAmount;

    public BillingPeriodDetailsType_Update() {
    }

    public BillingPeriodDetailsType_Update(
           eBLBaseComponents.apis.ebay.BillingPeriodType billingPeriod,
           java.lang.Integer billingFrequency,
           java.lang.Integer totalBillingCycles,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType taxAmount) {
           this.billingPeriod = billingPeriod;
           this.billingFrequency = billingFrequency;
           this.totalBillingCycles = totalBillingCycles;
           this.amount = amount;
           this.shippingAmount = shippingAmount;
           this.taxAmount = taxAmount;
    }


    /**
     * Gets the billingPeriod value for this BillingPeriodDetailsType_Update.
     * 
     * @return billingPeriod   * Unit of meausre for billing cycle
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodType getBillingPeriod() {
        return billingPeriod;
    }


    /**
     * Sets the billingPeriod value for this BillingPeriodDetailsType_Update.
     * 
     * @param billingPeriod   * Unit of meausre for billing cycle
     */
    public void setBillingPeriod(eBLBaseComponents.apis.ebay.BillingPeriodType billingPeriod) {
        this.billingPeriod = billingPeriod;
    }


    /**
     * Gets the billingFrequency value for this BillingPeriodDetailsType_Update.
     * 
     * @return billingFrequency   * Number of BillingPeriod that make up one billing cycle
     */
    public java.lang.Integer getBillingFrequency() {
        return billingFrequency;
    }


    /**
     * Sets the billingFrequency value for this BillingPeriodDetailsType_Update.
     * 
     * @param billingFrequency   * Number of BillingPeriod that make up one billing cycle
     */
    public void setBillingFrequency(java.lang.Integer billingFrequency) {
        this.billingFrequency = billingFrequency;
    }


    /**
     * Gets the totalBillingCycles value for this BillingPeriodDetailsType_Update.
     * 
     * @return totalBillingCycles   * Total billing cycles in this portion of the schedule
     */
    public java.lang.Integer getTotalBillingCycles() {
        return totalBillingCycles;
    }


    /**
     * Sets the totalBillingCycles value for this BillingPeriodDetailsType_Update.
     * 
     * @param totalBillingCycles   * Total billing cycles in this portion of the schedule
     */
    public void setTotalBillingCycles(java.lang.Integer totalBillingCycles) {
        this.totalBillingCycles = totalBillingCycles;
    }


    /**
     * Gets the amount value for this BillingPeriodDetailsType_Update.
     * 
     * @return amount   * Amount to charge
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BillingPeriodDetailsType_Update.
     * 
     * @param amount   * Amount to charge
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the shippingAmount value for this BillingPeriodDetailsType_Update.
     * 
     * @return shippingAmount   * Additional shipping amount to charge
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this BillingPeriodDetailsType_Update.
     * 
     * @param shippingAmount   * Additional shipping amount to charge
     */
    public void setShippingAmount(CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the taxAmount value for this BillingPeriodDetailsType_Update.
     * 
     * @return taxAmount   * Additional tax amount to charge
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this BillingPeriodDetailsType_Update.
     * 
     * @param taxAmount   * Additional tax amount to charge
     */
    public void setTaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType taxAmount) {
        this.taxAmount = taxAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingPeriodDetailsType_Update)) return false;
        BillingPeriodDetailsType_Update other = (BillingPeriodDetailsType_Update) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingPeriod==null && other.getBillingPeriod()==null) || 
             (this.billingPeriod!=null &&
              this.billingPeriod.equals(other.getBillingPeriod()))) &&
            ((this.billingFrequency==null && other.getBillingFrequency()==null) || 
             (this.billingFrequency!=null &&
              this.billingFrequency.equals(other.getBillingFrequency()))) &&
            ((this.totalBillingCycles==null && other.getTotalBillingCycles()==null) || 
             (this.totalBillingCycles!=null &&
              this.totalBillingCycles.equals(other.getTotalBillingCycles()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount())));
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
        if (getBillingPeriod() != null) {
            _hashCode += getBillingPeriod().hashCode();
        }
        if (getBillingFrequency() != null) {
            _hashCode += getBillingFrequency().hashCode();
        }
        if (getTotalBillingCycles() != null) {
            _hashCode += getTotalBillingCycles().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingPeriodDetailsType_Update.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType_Update"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBillingCycles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalBillingCycles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingAmount"));
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
