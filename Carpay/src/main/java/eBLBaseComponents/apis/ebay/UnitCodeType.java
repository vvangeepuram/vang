/**
 * UnitCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UnitCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UnitCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _kg = new org.apache.axis.types.Token("kg");
    public static final org.apache.axis.types.Token _lbs = new org.apache.axis.types.Token("lbs");
    public static final org.apache.axis.types.Token _oz = new org.apache.axis.types.Token("oz");
    public static final org.apache.axis.types.Token _cm = new org.apache.axis.types.Token("cm");
    public static final org.apache.axis.types.Token _inches = new org.apache.axis.types.Token("inches");
    public static final org.apache.axis.types.Token _ft = new org.apache.axis.types.Token("ft");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final UnitCodeType kg = new UnitCodeType(_kg);
    public static final UnitCodeType lbs = new UnitCodeType(_lbs);
    public static final UnitCodeType oz = new UnitCodeType(_oz);
    public static final UnitCodeType cm = new UnitCodeType(_cm);
    public static final UnitCodeType inches = new UnitCodeType(_inches);
    public static final UnitCodeType ft = new UnitCodeType(_ft);
    public static final UnitCodeType CustomCode = new UnitCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static UnitCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        UnitCodeType enumeration = (UnitCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UnitCodeType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(new org.apache.axis.types.Token(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UnitCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UnitCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
