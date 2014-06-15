/**
 * WalletItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class WalletItemType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WalletItemType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _MERCHANT_COUPON = new org.apache.axis.types.Token("MERCHANT_COUPON");
    public static final org.apache.axis.types.Token _LOYALTY_CARD = new org.apache.axis.types.Token("LOYALTY_CARD");
    public static final org.apache.axis.types.Token _MANUFACTURER_COUPON = new org.apache.axis.types.Token("MANUFACTURER_COUPON");
    public static final WalletItemType MERCHANT_COUPON = new WalletItemType(_MERCHANT_COUPON);
    public static final WalletItemType LOYALTY_CARD = new WalletItemType(_LOYALTY_CARD);
    public static final WalletItemType MANUFACTURER_COUPON = new WalletItemType(_MANUFACTURER_COUPON);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static WalletItemType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        WalletItemType enumeration = (WalletItemType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WalletItemType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WalletItemType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItemType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
