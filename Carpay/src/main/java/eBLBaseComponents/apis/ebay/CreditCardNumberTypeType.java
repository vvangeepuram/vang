/**
 * CreditCardNumberTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CreditCardNumberTypeType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.CreditCardTypeType creditCardType;

    private java.lang.String creditCardNumber;

    public CreditCardNumberTypeType() {
    }

    public CreditCardNumberTypeType(
           eBLBaseComponents.apis.ebay.CreditCardTypeType creditCardType,
           java.lang.String creditCardNumber) {
           this.creditCardType = creditCardType;
           this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the creditCardType value for this CreditCardNumberTypeType.
     * 
     * @return creditCardType
     */
    public eBLBaseComponents.apis.ebay.CreditCardTypeType getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this CreditCardNumberTypeType.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(eBLBaseComponents.apis.ebay.CreditCardTypeType creditCardType) {
        this.creditCardType = creditCardType;
    }


    /**
     * Gets the creditCardNumber value for this CreditCardNumberTypeType.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this CreditCardNumberTypeType.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditCardNumberTypeType)) return false;
        CreditCardNumberTypeType other = (CreditCardNumberTypeType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType()))) &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber())));
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
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditCardNumberTypeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardNumberTypeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardNumber"));
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
