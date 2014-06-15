/**
 * AuctionTypeCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class AuctionTypeCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuctionTypeCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("Unknown");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("Chinese");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("Dutch");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("Live");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("Ad type");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("Stores Fixed-price");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("Personal Offer");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("Fixed Price Item");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("CustomCode");
    public static final AuctionTypeCodeType value1 = new AuctionTypeCodeType(_value1);
    public static final AuctionTypeCodeType value2 = new AuctionTypeCodeType(_value2);
    public static final AuctionTypeCodeType value3 = new AuctionTypeCodeType(_value3);
    public static final AuctionTypeCodeType value4 = new AuctionTypeCodeType(_value4);
    public static final AuctionTypeCodeType value5 = new AuctionTypeCodeType(_value5);
    public static final AuctionTypeCodeType value6 = new AuctionTypeCodeType(_value6);
    public static final AuctionTypeCodeType value7 = new AuctionTypeCodeType(_value7);
    public static final AuctionTypeCodeType value8 = new AuctionTypeCodeType(_value8);
    public static final AuctionTypeCodeType value9 = new AuctionTypeCodeType(_value9);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static AuctionTypeCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        AuctionTypeCodeType enumeration = (AuctionTypeCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuctionTypeCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuctionTypeCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuctionTypeCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
