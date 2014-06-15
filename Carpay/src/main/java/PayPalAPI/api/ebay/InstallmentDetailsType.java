/**
 * InstallmentDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class InstallmentDetailsType  implements java.io.Serializable {
    /* Installment Period. */
    private eBLBaseComponents.apis.ebay.BillingPeriodType billingPeriod;

    /* Installment Frequency. */
    private java.lang.Integer billingFrequency;

    /* Installment Cycles. */
    private java.lang.Integer totalBillingCycles;

    /* Installment Amount. */
    private java.lang.String amount;

    /* Installment Amount. */
    private java.lang.String shippingAmount;

    /* Installment Amount. */
    private java.lang.String taxAmount;

    public InstallmentDetailsType() {
    }

    public InstallmentDetailsType(
           eBLBaseComponents.apis.ebay.BillingPeriodType billingPeriod,
           java.lang.Integer billingFrequency,
           java.lang.Integer totalBillingCycles,
           java.lang.String amount,
           java.lang.String shippingAmount,
           java.lang.String taxAmount) {
           this.billingPeriod = billingPeriod;
           this.billingFrequency = billingFrequency;
           this.totalBillingCycles = totalBillingCycles;
           this.amount = amount;
           this.shippingAmount = shippingAmount;
           this.taxAmount = taxAmount;
    }


    /**
     * Gets the billingPeriod value for this InstallmentDetailsType.
     * 
     * @return billingPeriod   * Installment Period.
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodType getBillingPeriod() {
        return billingPeriod;
    }


    /**
     * Sets the billingPeriod value for this InstallmentDetailsType.
     * 
     * @param billingPeriod   * Installment Period.
     */
    public void setBillingPeriod(eBLBaseComponents.apis.ebay.BillingPeriodType billingPeriod) {
        this.billingPeriod = billingPeriod;
    }


    /**
     * Gets the billingFrequency value for this InstallmentDetailsType.
     * 
     * @return billingFrequency   * Installment Frequency.
     */
    public java.lang.Integer getBillingFrequency() {
        return billingFrequency;
    }


    /**
     * Sets the billingFrequency value for this InstallmentDetailsType.
     * 
     * @param billingFrequency   * Installment Frequency.
     */
    public void setBillingFrequency(java.lang.Integer billingFrequency) {
        this.billingFrequency = billingFrequency;
    }


    /**
     * Gets the totalBillingCycles value for this InstallmentDetailsType.
     * 
     * @return totalBillingCycles   * Installment Cycles.
     */
    public java.lang.Integer getTotalBillingCycles() {
        return totalBillingCycles;
    }


    /**
     * Sets the totalBillingCycles value for this InstallmentDetailsType.
     * 
     * @param totalBillingCycles   * Installment Cycles.
     */
    public void setTotalBillingCycles(java.lang.Integer totalBillingCycles) {
        this.totalBillingCycles = totalBillingCycles;
    }


    /**
     * Gets the amount value for this InstallmentDetailsType.
     * 
     * @return amount   * Installment Amount.
     */
    public java.lang.String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this InstallmentDetailsType.
     * 
     * @param amount   * Installment Amount.
     */
    public void setAmount(java.lang.String amount) {
        this.amount = amount;
    }


    /**
     * Gets the shippingAmount value for this InstallmentDetailsType.
     * 
     * @return shippingAmount   * Installment Amount.
     */
    public java.lang.String getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this InstallmentDetailsType.
     * 
     * @param shippingAmount   * Installment Amount.
     */
    public void setShippingAmount(java.lang.String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the taxAmount value for this InstallmentDetailsType.
     * 
     * @return taxAmount   * Installment Amount.
     */
    public java.lang.String getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this InstallmentDetailsType.
     * 
     * @param taxAmount   * Installment Amount.
     */
    public void setTaxAmount(java.lang.String taxAmount) {
        this.taxAmount = taxAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstallmentDetailsType)) return false;
        InstallmentDetailsType other = (InstallmentDetailsType) obj;
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
        new org.apache.axis.description.TypeDesc(InstallmentDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InstallmentDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillingFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalBillingCycles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TotalBillingCycles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ShippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TaxAmount"));
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
