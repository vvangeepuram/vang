/**
 * ValType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ValType  implements java.io.Serializable {
    private java.lang.String valueLiteral;

    private java.lang.String valueID;  // attribute

    public ValType() {
    }

    public ValType(
           java.lang.String valueLiteral,
           java.lang.String valueID) {
           this.valueLiteral = valueLiteral;
           this.valueID = valueID;
    }


    /**
     * Gets the valueLiteral value for this ValType.
     * 
     * @return valueLiteral
     */
    public java.lang.String getValueLiteral() {
        return valueLiteral;
    }


    /**
     * Sets the valueLiteral value for this ValType.
     * 
     * @param valueLiteral
     */
    public void setValueLiteral(java.lang.String valueLiteral) {
        this.valueLiteral = valueLiteral;
    }


    /**
     * Gets the valueID value for this ValType.
     * 
     * @return valueID
     */
    public java.lang.String getValueID() {
        return valueID;
    }


    /**
     * Sets the valueID value for this ValType.
     * 
     * @param valueID
     */
    public void setValueID(java.lang.String valueID) {
        this.valueID = valueID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValType)) return false;
        ValType other = (ValType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valueLiteral==null && other.getValueLiteral()==null) || 
             (this.valueLiteral!=null &&
              this.valueLiteral.equals(other.getValueLiteral()))) &&
            ((this.valueID==null && other.getValueID()==null) || 
             (this.valueID!=null &&
              this.valueID.equals(other.getValueID())));
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
        if (getValueLiteral() != null) {
            _hashCode += getValueLiteral().hashCode();
        }
        if (getValueID() != null) {
            _hashCode += getValueID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ValType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("valueID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ValueID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueLiteral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ValueLiteral"));
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
