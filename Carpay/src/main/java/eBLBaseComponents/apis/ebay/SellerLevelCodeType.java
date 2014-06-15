/**
 * SellerLevelCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SellerLevelCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellerLevelCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Bronze = new org.apache.axis.types.Token("Bronze");
    public static final org.apache.axis.types.Token _Silver = new org.apache.axis.types.Token("Silver");
    public static final org.apache.axis.types.Token _Gold = new org.apache.axis.types.Token("Gold");
    public static final org.apache.axis.types.Token _Platinum = new org.apache.axis.types.Token("Platinum");
    public static final org.apache.axis.types.Token _Titanium = new org.apache.axis.types.Token("Titanium");
    public static final org.apache.axis.types.Token _None = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final SellerLevelCodeType Bronze = new SellerLevelCodeType(_Bronze);
    public static final SellerLevelCodeType Silver = new SellerLevelCodeType(_Silver);
    public static final SellerLevelCodeType Gold = new SellerLevelCodeType(_Gold);
    public static final SellerLevelCodeType Platinum = new SellerLevelCodeType(_Platinum);
    public static final SellerLevelCodeType Titanium = new SellerLevelCodeType(_Titanium);
    public static final SellerLevelCodeType None = new SellerLevelCodeType(_None);
    public static final SellerLevelCodeType CustomCode = new SellerLevelCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static SellerLevelCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        SellerLevelCodeType enumeration = (SellerLevelCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SellerLevelCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SellerLevelCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerLevelCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
