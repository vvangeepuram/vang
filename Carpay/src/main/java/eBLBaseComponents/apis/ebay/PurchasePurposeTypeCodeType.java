/**
 * PurchasePurposeTypeCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PurchasePurposeTypeCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PurchasePurposeTypeCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Other = new org.apache.axis.types.Token("Other");
    public static final org.apache.axis.types.Token _BuyNowItem = new org.apache.axis.types.Token("BuyNowItem");
    public static final org.apache.axis.types.Token _ShoppingCart = new org.apache.axis.types.Token("ShoppingCart");
    public static final org.apache.axis.types.Token _AuctionItem = new org.apache.axis.types.Token("AuctionItem");
    public static final org.apache.axis.types.Token _GiftCertificates = new org.apache.axis.types.Token("GiftCertificates");
    public static final org.apache.axis.types.Token _Subscription = new org.apache.axis.types.Token("Subscription");
    public static final org.apache.axis.types.Token _Donation = new org.apache.axis.types.Token("Donation");
    public static final org.apache.axis.types.Token _eBayBilling = new org.apache.axis.types.Token("eBayBilling");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final PurchasePurposeTypeCodeType Other = new PurchasePurposeTypeCodeType(_Other);
    public static final PurchasePurposeTypeCodeType BuyNowItem = new PurchasePurposeTypeCodeType(_BuyNowItem);
    public static final PurchasePurposeTypeCodeType ShoppingCart = new PurchasePurposeTypeCodeType(_ShoppingCart);
    public static final PurchasePurposeTypeCodeType AuctionItem = new PurchasePurposeTypeCodeType(_AuctionItem);
    public static final PurchasePurposeTypeCodeType GiftCertificates = new PurchasePurposeTypeCodeType(_GiftCertificates);
    public static final PurchasePurposeTypeCodeType Subscription = new PurchasePurposeTypeCodeType(_Subscription);
    public static final PurchasePurposeTypeCodeType Donation = new PurchasePurposeTypeCodeType(_Donation);
    public static final PurchasePurposeTypeCodeType eBayBilling = new PurchasePurposeTypeCodeType(_eBayBilling);
    public static final PurchasePurposeTypeCodeType CustomCode = new PurchasePurposeTypeCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PurchasePurposeTypeCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PurchasePurposeTypeCodeType enumeration = (PurchasePurposeTypeCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PurchasePurposeTypeCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PurchasePurposeTypeCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PurchasePurposeTypeCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
