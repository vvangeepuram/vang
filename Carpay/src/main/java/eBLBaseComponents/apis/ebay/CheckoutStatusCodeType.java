/**
 * CheckoutStatusCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CheckoutStatusCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CheckoutStatusCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _CheckoutComplete = new org.apache.axis.types.Token("CheckoutComplete");
    public static final org.apache.axis.types.Token _CheckoutIncomplete = new org.apache.axis.types.Token("CheckoutIncomplete");
    public static final org.apache.axis.types.Token _BuyerRequestsTotal = new org.apache.axis.types.Token("BuyerRequestsTotal");
    public static final org.apache.axis.types.Token _SellerResponded = new org.apache.axis.types.Token("SellerResponded");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final CheckoutStatusCodeType CheckoutComplete = new CheckoutStatusCodeType(_CheckoutComplete);
    public static final CheckoutStatusCodeType CheckoutIncomplete = new CheckoutStatusCodeType(_CheckoutIncomplete);
    public static final CheckoutStatusCodeType BuyerRequestsTotal = new CheckoutStatusCodeType(_BuyerRequestsTotal);
    public static final CheckoutStatusCodeType SellerResponded = new CheckoutStatusCodeType(_SellerResponded);
    public static final CheckoutStatusCodeType CustomCode = new CheckoutStatusCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static CheckoutStatusCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        CheckoutStatusCodeType enumeration = (CheckoutStatusCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CheckoutStatusCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CheckoutStatusCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CheckoutStatusCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
