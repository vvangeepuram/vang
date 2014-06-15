/**
 * ErrorParameterType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ErrorParameterType  implements java.io.Serializable {
    /* Value of the application-specific error parameter. */
    private java.lang.String value;

    private java.lang.String paramID;  // attribute

    public ErrorParameterType() {
    }

    public ErrorParameterType(
           java.lang.String value,
           java.lang.String paramID) {
           this.value = value;
           this.paramID = paramID;
    }


    /**
     * Gets the value value for this ErrorParameterType.
     * 
     * @return value   * Value of the application-specific error parameter.
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this ErrorParameterType.
     * 
     * @param value   * Value of the application-specific error parameter.
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the paramID value for this ErrorParameterType.
     * 
     * @return paramID
     */
    public java.lang.String getParamID() {
        return paramID;
    }


    /**
     * Sets the paramID value for this ErrorParameterType.
     * 
     * @param paramID
     */
    public void setParamID(java.lang.String paramID) {
        this.paramID = paramID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErrorParameterType)) return false;
        ErrorParameterType other = (ErrorParameterType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.paramID==null && other.getParamID()==null) || 
             (this.paramID!=null &&
              this.paramID.equals(other.getParamID())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getParamID() != null) {
            _hashCode += getParamID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErrorParameterType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorParameterType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("paramID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ParamID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Value"));
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
