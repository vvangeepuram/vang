/**
 * ShippingOptionCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ShippingOptionCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingOptionCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _SiteOnly = new org.apache.axis.types.Token("SiteOnly");
    public static final org.apache.axis.types.Token _WorldWide = new org.apache.axis.types.Token("WorldWide");
    public static final org.apache.axis.types.Token _SitePlusRegions = new org.apache.axis.types.Token("SitePlusRegions");
    public static final org.apache.axis.types.Token _WillNotShip = new org.apache.axis.types.Token("WillNotShip");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final ShippingOptionCodeType SiteOnly = new ShippingOptionCodeType(_SiteOnly);
    public static final ShippingOptionCodeType WorldWide = new ShippingOptionCodeType(_WorldWide);
    public static final ShippingOptionCodeType SitePlusRegions = new ShippingOptionCodeType(_SitePlusRegions);
    public static final ShippingOptionCodeType WillNotShip = new ShippingOptionCodeType(_WillNotShip);
    public static final ShippingOptionCodeType CustomCode = new ShippingOptionCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ShippingOptionCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ShippingOptionCodeType enumeration = (ShippingOptionCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShippingOptionCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShippingOptionCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
