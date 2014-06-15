/**
 * MeasureType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package CoreComponentTypes.apis.ebay;

public class MeasureType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private double _value;

    private org.apache.axis.types.Token unit;  // attribute

    public MeasureType() {
    }

    // Simple Types must have a String constructor
    public MeasureType(double _value) {
        this._value = _value;
    }
    public MeasureType(java.lang.String _value) {
        this._value = new Double(_value).doubleValue();
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return new Double(_value).toString();
    }


    /**
     * Gets the _value value for this MeasureType.
     * 
     * @return _value
     */
    public double get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this MeasureType.
     * 
     * @param _value
     */
    public void set_value(double _value) {
        this._value = _value;
    }


    /**
     * Gets the unit value for this MeasureType.
     * 
     * @return unit
     */
    public org.apache.axis.types.Token getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this MeasureType.
     * 
     * @param unit
     */
    public void setUnit(org.apache.axis.types.Token unit) {
        this.unit = unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MeasureType)) return false;
        MeasureType other = (MeasureType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this._value == other.get_value() &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit())));
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
        _hashCode += new Double(get_value()).hashCode();
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MeasureType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("unit");
        attrField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "token"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
