/**
 * ShippingPackageCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ShippingPackageCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ShippingPackageCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _None = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _Letter = new org.apache.axis.types.Token("Letter");
    public static final org.apache.axis.types.Token _LargeEnvelope = new org.apache.axis.types.Token("LargeEnvelope");
    public static final org.apache.axis.types.Token _USPSLargePack = new org.apache.axis.types.Token("USPSLargePack");
    public static final org.apache.axis.types.Token _VeryLargePack = new org.apache.axis.types.Token("VeryLargePack");
    public static final org.apache.axis.types.Token _UPSLetter = new org.apache.axis.types.Token("UPSLetter");
    public static final org.apache.axis.types.Token _USPSFlatRateEnvelope = new org.apache.axis.types.Token("USPSFlatRateEnvelope");
    public static final org.apache.axis.types.Token _PackageThickEnvelope = new org.apache.axis.types.Token("PackageThickEnvelope");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final ShippingPackageCodeType None = new ShippingPackageCodeType(_None);
    public static final ShippingPackageCodeType Letter = new ShippingPackageCodeType(_Letter);
    public static final ShippingPackageCodeType LargeEnvelope = new ShippingPackageCodeType(_LargeEnvelope);
    public static final ShippingPackageCodeType USPSLargePack = new ShippingPackageCodeType(_USPSLargePack);
    public static final ShippingPackageCodeType VeryLargePack = new ShippingPackageCodeType(_VeryLargePack);
    public static final ShippingPackageCodeType UPSLetter = new ShippingPackageCodeType(_UPSLetter);
    public static final ShippingPackageCodeType USPSFlatRateEnvelope = new ShippingPackageCodeType(_USPSFlatRateEnvelope);
    public static final ShippingPackageCodeType PackageThickEnvelope = new ShippingPackageCodeType(_PackageThickEnvelope);
    public static final ShippingPackageCodeType CustomCode = new ShippingPackageCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ShippingPackageCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ShippingPackageCodeType enumeration = (ShippingPackageCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ShippingPackageCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ShippingPackageCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingPackageCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
