/**
 * ShippingRegionCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ShippingRegionCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingRegionCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Africa = new org.apache.axis.types.Token("Africa");
    public static final org.apache.axis.types.Token _Asia = new org.apache.axis.types.Token("Asia");
    public static final org.apache.axis.types.Token _Caribbean = new org.apache.axis.types.Token("Caribbean");
    public static final org.apache.axis.types.Token _Europe = new org.apache.axis.types.Token("Europe");
    public static final org.apache.axis.types.Token _LatinAmerica = new org.apache.axis.types.Token("LatinAmerica");
    public static final org.apache.axis.types.Token _MiddleEast = new org.apache.axis.types.Token("MiddleEast");
    public static final org.apache.axis.types.Token _NorthAmerica = new org.apache.axis.types.Token("NorthAmerica");
    public static final org.apache.axis.types.Token _Oceania = new org.apache.axis.types.Token("Oceania");
    public static final org.apache.axis.types.Token _SouthAmerica = new org.apache.axis.types.Token("SouthAmerica");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final ShippingRegionCodeType Africa = new ShippingRegionCodeType(_Africa);
    public static final ShippingRegionCodeType Asia = new ShippingRegionCodeType(_Asia);
    public static final ShippingRegionCodeType Caribbean = new ShippingRegionCodeType(_Caribbean);
    public static final ShippingRegionCodeType Europe = new ShippingRegionCodeType(_Europe);
    public static final ShippingRegionCodeType LatinAmerica = new ShippingRegionCodeType(_LatinAmerica);
    public static final ShippingRegionCodeType MiddleEast = new ShippingRegionCodeType(_MiddleEast);
    public static final ShippingRegionCodeType NorthAmerica = new ShippingRegionCodeType(_NorthAmerica);
    public static final ShippingRegionCodeType Oceania = new ShippingRegionCodeType(_Oceania);
    public static final ShippingRegionCodeType SouthAmerica = new ShippingRegionCodeType(_SouthAmerica);
    public static final ShippingRegionCodeType CustomCode = new ShippingRegionCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ShippingRegionCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ShippingRegionCodeType enumeration = (ShippingRegionCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShippingRegionCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShippingRegionCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingRegionCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
