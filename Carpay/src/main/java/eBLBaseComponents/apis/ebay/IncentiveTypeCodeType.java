/**
 * IncentiveTypeCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IncentiveTypeCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IncentiveTypeCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Coupon = new org.apache.axis.types.Token("Coupon");
    public static final org.apache.axis.types.Token _eBayGiftCertificate = new org.apache.axis.types.Token("eBayGiftCertificate");
    public static final org.apache.axis.types.Token _eBayGiftCard = new org.apache.axis.types.Token("eBayGiftCard");
    public static final org.apache.axis.types.Token _PayPalRewardVoucher = new org.apache.axis.types.Token("PayPalRewardVoucher");
    public static final org.apache.axis.types.Token _MerchantGiftCertificate = new org.apache.axis.types.Token("MerchantGiftCertificate");
    public static final org.apache.axis.types.Token _eBayRewardVoucher = new org.apache.axis.types.Token("eBayRewardVoucher");
    public static final IncentiveTypeCodeType Coupon = new IncentiveTypeCodeType(_Coupon);
    public static final IncentiveTypeCodeType eBayGiftCertificate = new IncentiveTypeCodeType(_eBayGiftCertificate);
    public static final IncentiveTypeCodeType eBayGiftCard = new IncentiveTypeCodeType(_eBayGiftCard);
    public static final IncentiveTypeCodeType PayPalRewardVoucher = new IncentiveTypeCodeType(_PayPalRewardVoucher);
    public static final IncentiveTypeCodeType MerchantGiftCertificate = new IncentiveTypeCodeType(_MerchantGiftCertificate);
    public static final IncentiveTypeCodeType eBayRewardVoucher = new IncentiveTypeCodeType(_eBayRewardVoucher);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static IncentiveTypeCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        IncentiveTypeCodeType enumeration = (IncentiveTypeCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IncentiveTypeCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IncentiveTypeCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveTypeCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
