/**
 * PaymentTransactionCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentTransactionCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentTransactionCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("none");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("web-accept");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("cart");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("send-money");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("subscr-failed");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("subscr-cancel");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("subscr-payment");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("subscr-signup");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("subscr-eot");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("subscr-modify");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("mercht-pmt");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("mass-pay");
    public static final org.apache.axis.types.Token _value13 = new org.apache.axis.types.Token("virtual-terminal");
    public static final org.apache.axis.types.Token _value14 = new org.apache.axis.types.Token("integral-evolution");
    public static final org.apache.axis.types.Token _value15 = new org.apache.axis.types.Token("express-checkout");
    public static final org.apache.axis.types.Token _value16 = new org.apache.axis.types.Token("pro-hosted");
    public static final org.apache.axis.types.Token _value17 = new org.apache.axis.types.Token("pro-api");
    public static final org.apache.axis.types.Token _value18 = new org.apache.axis.types.Token("credit");
    public static final PaymentTransactionCodeType value1 = new PaymentTransactionCodeType(_value1);
    public static final PaymentTransactionCodeType value2 = new PaymentTransactionCodeType(_value2);
    public static final PaymentTransactionCodeType value3 = new PaymentTransactionCodeType(_value3);
    public static final PaymentTransactionCodeType value4 = new PaymentTransactionCodeType(_value4);
    public static final PaymentTransactionCodeType value5 = new PaymentTransactionCodeType(_value5);
    public static final PaymentTransactionCodeType value6 = new PaymentTransactionCodeType(_value6);
    public static final PaymentTransactionCodeType value7 = new PaymentTransactionCodeType(_value7);
    public static final PaymentTransactionCodeType value8 = new PaymentTransactionCodeType(_value8);
    public static final PaymentTransactionCodeType value9 = new PaymentTransactionCodeType(_value9);
    public static final PaymentTransactionCodeType value10 = new PaymentTransactionCodeType(_value10);
    public static final PaymentTransactionCodeType value11 = new PaymentTransactionCodeType(_value11);
    public static final PaymentTransactionCodeType value12 = new PaymentTransactionCodeType(_value12);
    public static final PaymentTransactionCodeType value13 = new PaymentTransactionCodeType(_value13);
    public static final PaymentTransactionCodeType value14 = new PaymentTransactionCodeType(_value14);
    public static final PaymentTransactionCodeType value15 = new PaymentTransactionCodeType(_value15);
    public static final PaymentTransactionCodeType value16 = new PaymentTransactionCodeType(_value16);
    public static final PaymentTransactionCodeType value17 = new PaymentTransactionCodeType(_value17);
    public static final PaymentTransactionCodeType value18 = new PaymentTransactionCodeType(_value18);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PaymentTransactionCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PaymentTransactionCodeType enumeration = (PaymentTransactionCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentTransactionCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentTransactionCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
