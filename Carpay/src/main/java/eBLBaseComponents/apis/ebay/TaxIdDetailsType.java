/**
 * TaxIdDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details about the payer's tax info passed in by the merchant or
 * partner.
 * 				Optional.
 */
public class TaxIdDetailsType  implements java.io.Serializable {
    /* The payer's Tax ID type; CNPJ/CPF for BR country. */
    private java.lang.String taxIdType;

    /* The payer's Tax ID */
    private java.lang.String taxId;

    public TaxIdDetailsType() {
    }

    public TaxIdDetailsType(
           java.lang.String taxIdType,
           java.lang.String taxId) {
           this.taxIdType = taxIdType;
           this.taxId = taxId;
    }


    /**
     * Gets the taxIdType value for this TaxIdDetailsType.
     * 
     * @return taxIdType   * The payer's Tax ID type; CNPJ/CPF for BR country.
     */
    public java.lang.String getTaxIdType() {
        return taxIdType;
    }


    /**
     * Sets the taxIdType value for this TaxIdDetailsType.
     * 
     * @param taxIdType   * The payer's Tax ID type; CNPJ/CPF for BR country.
     */
    public void setTaxIdType(java.lang.String taxIdType) {
        this.taxIdType = taxIdType;
    }


    /**
     * Gets the taxId value for this TaxIdDetailsType.
     * 
     * @return taxId   * The payer's Tax ID
     */
    public java.lang.String getTaxId() {
        return taxId;
    }


    /**
     * Sets the taxId value for this TaxIdDetailsType.
     * 
     * @param taxId   * The payer's Tax ID
     */
    public void setTaxId(java.lang.String taxId) {
        this.taxId = taxId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxIdDetailsType)) return false;
        TaxIdDetailsType other = (TaxIdDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxIdType==null && other.getTaxIdType()==null) || 
             (this.taxIdType!=null &&
              this.taxIdType.equals(other.getTaxIdType()))) &&
            ((this.taxId==null && other.getTaxId()==null) || 
             (this.taxId!=null &&
              this.taxId.equals(other.getTaxId())));
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
        if (getTaxIdType() != null) {
            _hashCode += getTaxIdType().hashCode();
        }
        if (getTaxId() != null) {
            _hashCode += getTaxId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxIdDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxId"));
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
