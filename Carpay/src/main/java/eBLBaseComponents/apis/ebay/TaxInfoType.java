/**
 * TaxInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class TaxInfoType  implements java.io.Serializable {
    private CoreComponentTypes.apis.ebay.BasicAmountType taxAmount;

    private java.lang.String salesTaxPercentage;

    private java.lang.String taxState;

    public TaxInfoType() {
    }

    public TaxInfoType(
           CoreComponentTypes.apis.ebay.BasicAmountType taxAmount,
           java.lang.String salesTaxPercentage,
           java.lang.String taxState) {
           this.taxAmount = taxAmount;
           this.salesTaxPercentage = salesTaxPercentage;
           this.taxState = taxState;
    }


    /**
     * Gets the taxAmount value for this TaxInfoType.
     * 
     * @return taxAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxInfoType.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the salesTaxPercentage value for this TaxInfoType.
     * 
     * @return salesTaxPercentage
     */
    public java.lang.String getSalesTaxPercentage() {
        return salesTaxPercentage;
    }


    /**
     * Sets the salesTaxPercentage value for this TaxInfoType.
     * 
     * @param salesTaxPercentage
     */
    public void setSalesTaxPercentage(java.lang.String salesTaxPercentage) {
        this.salesTaxPercentage = salesTaxPercentage;
    }


    /**
     * Gets the taxState value for this TaxInfoType.
     * 
     * @return taxState
     */
    public java.lang.String getTaxState() {
        return taxState;
    }


    /**
     * Sets the taxState value for this TaxInfoType.
     * 
     * @param taxState
     */
    public void setTaxState(java.lang.String taxState) {
        this.taxState = taxState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxInfoType)) return false;
        TaxInfoType other = (TaxInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.salesTaxPercentage==null && other.getSalesTaxPercentage()==null) || 
             (this.salesTaxPercentage!=null &&
              this.salesTaxPercentage.equals(other.getSalesTaxPercentage()))) &&
            ((this.taxState==null && other.getTaxState()==null) || 
             (this.taxState!=null &&
              this.taxState.equals(other.getTaxState())));
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
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getSalesTaxPercentage() != null) {
            _hashCode += getSalesTaxPercentage().hashCode();
        }
        if (getTaxState() != null) {
            _hashCode += getTaxState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxPercentage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTaxPercentage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
