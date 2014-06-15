/**
 * SellerPaymentMethodCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SellerPaymentMethodCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellerPaymentMethodCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Other = new org.apache.axis.types.Token("Other");
    public static final org.apache.axis.types.Token _Amex = new org.apache.axis.types.Token("Amex");
    public static final org.apache.axis.types.Token _Visa = new org.apache.axis.types.Token("Visa");
    public static final org.apache.axis.types.Token _Mastercard = new org.apache.axis.types.Token("Mastercard");
    public static final org.apache.axis.types.Token _Discover = new org.apache.axis.types.Token("Discover");
    public static final org.apache.axis.types.Token _JCB = new org.apache.axis.types.Token("JCB");
    public static final org.apache.axis.types.Token _Diners = new org.apache.axis.types.Token("Diners");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final SellerPaymentMethodCodeType Other = new SellerPaymentMethodCodeType(_Other);
    public static final SellerPaymentMethodCodeType Amex = new SellerPaymentMethodCodeType(_Amex);
    public static final SellerPaymentMethodCodeType Visa = new SellerPaymentMethodCodeType(_Visa);
    public static final SellerPaymentMethodCodeType Mastercard = new SellerPaymentMethodCodeType(_Mastercard);
    public static final SellerPaymentMethodCodeType Discover = new SellerPaymentMethodCodeType(_Discover);
    public static final SellerPaymentMethodCodeType JCB = new SellerPaymentMethodCodeType(_JCB);
    public static final SellerPaymentMethodCodeType Diners = new SellerPaymentMethodCodeType(_Diners);
    public static final SellerPaymentMethodCodeType CustomCode = new SellerPaymentMethodCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static SellerPaymentMethodCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        SellerPaymentMethodCodeType enumeration = (SellerPaymentMethodCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SellerPaymentMethodCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SellerPaymentMethodCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentMethodCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
