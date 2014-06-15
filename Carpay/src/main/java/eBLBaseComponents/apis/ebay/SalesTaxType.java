/**
 * SalesTaxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SalesTaxType  implements java.io.Serializable {
    /* Amount of the sales tax to be collected for the transaction.
     * 
     *                                    Sales tax is only for US. */
    private java.lang.Float salesTaxPercent;

    /* Sales tax for the transaction, expressed as a percentage. Should
     * 
     *                                     be empty for items listed on international
     * sites (hence, this is 
     *                                     US-only element). */
    private java.lang.String salesTaxState;

    /* Indicates whether shipping is included in the tax. Applicable
     * if 
     *                                    ShippingType = 1 or 2. This element
     * is used for US-only. */
    private java.lang.Boolean shippingIncludedInTax;

    public SalesTaxType() {
    }

    public SalesTaxType(
           java.lang.Float salesTaxPercent,
           java.lang.String salesTaxState,
           java.lang.Boolean shippingIncludedInTax) {
           this.salesTaxPercent = salesTaxPercent;
           this.salesTaxState = salesTaxState;
           this.shippingIncludedInTax = shippingIncludedInTax;
    }


    /**
     * Gets the salesTaxPercent value for this SalesTaxType.
     * 
     * @return salesTaxPercent   * Amount of the sales tax to be collected for the transaction.
     * 
     *                                    Sales tax is only for US.
     */
    public java.lang.Float getSalesTaxPercent() {
        return salesTaxPercent;
    }


    /**
     * Sets the salesTaxPercent value for this SalesTaxType.
     * 
     * @param salesTaxPercent   * Amount of the sales tax to be collected for the transaction.
     * 
     *                                    Sales tax is only for US.
     */
    public void setSalesTaxPercent(java.lang.Float salesTaxPercent) {
        this.salesTaxPercent = salesTaxPercent;
    }


    /**
     * Gets the salesTaxState value for this SalesTaxType.
     * 
     * @return salesTaxState   * Sales tax for the transaction, expressed as a percentage. Should
     * 
     *                                     be empty for items listed on international
     * sites (hence, this is 
     *                                     US-only element).
     */
    public java.lang.String getSalesTaxState() {
        return salesTaxState;
    }


    /**
     * Sets the salesTaxState value for this SalesTaxType.
     * 
     * @param salesTaxState   * Sales tax for the transaction, expressed as a percentage. Should
     * 
     *                                     be empty for items listed on international
     * sites (hence, this is 
     *                                     US-only element).
     */
    public void setSalesTaxState(java.lang.String salesTaxState) {
        this.salesTaxState = salesTaxState;
    }


    /**
     * Gets the shippingIncludedInTax value for this SalesTaxType.
     * 
     * @return shippingIncludedInTax   * Indicates whether shipping is included in the tax. Applicable
     * if 
     *                                    ShippingType = 1 or 2. This element
     * is used for US-only.
     */
    public java.lang.Boolean getShippingIncludedInTax() {
        return shippingIncludedInTax;
    }


    /**
     * Sets the shippingIncludedInTax value for this SalesTaxType.
     * 
     * @param shippingIncludedInTax   * Indicates whether shipping is included in the tax. Applicable
     * if 
     *                                    ShippingType = 1 or 2. This element
     * is used for US-only.
     */
    public void setShippingIncludedInTax(java.lang.Boolean shippingIncludedInTax) {
        this.shippingIncludedInTax = shippingIncludedInTax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SalesTaxType)) return false;
        SalesTaxType other = (SalesTaxType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.salesTaxPercent==null && other.getSalesTaxPercent()==null) || 
             (this.salesTaxPercent!=null &&
              this.salesTaxPercent.equals(other.getSalesTaxPercent()))) &&
            ((this.salesTaxState==null && other.getSalesTaxState()==null) || 
             (this.salesTaxState!=null &&
              this.salesTaxState.equals(other.getSalesTaxState()))) &&
            ((this.shippingIncludedInTax==null && other.getShippingIncludedInTax()==null) || 
             (this.shippingIncludedInTax!=null &&
              this.shippingIncludedInTax.equals(other.getShippingIncludedInTax())));
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
        if (getSalesTaxPercent() != null) {
            _hashCode += getSalesTaxPercent().hashCode();
        }
        if (getSalesTaxState() != null) {
            _hashCode += getSalesTaxState().hashCode();
        }
        if (getShippingIncludedInTax() != null) {
            _hashCode += getShippingIncludedInTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SalesTaxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTaxType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTaxPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTaxState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingIncludedInTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingIncludedInTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
