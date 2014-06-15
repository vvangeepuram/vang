/**
 * ButtonTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ButtonTypeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ButtonTypeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _BUYNOW = new org.apache.axis.types.Token("BUYNOW");
    public static final org.apache.axis.types.Token _CART = new org.apache.axis.types.Token("CART");
    public static final org.apache.axis.types.Token _GIFTCERTIFICATE = new org.apache.axis.types.Token("GIFTCERTIFICATE");
    public static final org.apache.axis.types.Token _SUBSCRIBE = new org.apache.axis.types.Token("SUBSCRIBE");
    public static final org.apache.axis.types.Token _DONATE = new org.apache.axis.types.Token("DONATE");
    public static final org.apache.axis.types.Token _UNSUBSCRIBE = new org.apache.axis.types.Token("UNSUBSCRIBE");
    public static final org.apache.axis.types.Token _VIEWCART = new org.apache.axis.types.Token("VIEWCART");
    public static final org.apache.axis.types.Token _PAYMENTPLAN = new org.apache.axis.types.Token("PAYMENTPLAN");
    public static final org.apache.axis.types.Token _AUTOBILLING = new org.apache.axis.types.Token("AUTOBILLING");
    public static final org.apache.axis.types.Token _PAYMENT = new org.apache.axis.types.Token("PAYMENT");
    public static final ButtonTypeType BUYNOW = new ButtonTypeType(_BUYNOW);
    public static final ButtonTypeType CART = new ButtonTypeType(_CART);
    public static final ButtonTypeType GIFTCERTIFICATE = new ButtonTypeType(_GIFTCERTIFICATE);
    public static final ButtonTypeType SUBSCRIBE = new ButtonTypeType(_SUBSCRIBE);
    public static final ButtonTypeType DONATE = new ButtonTypeType(_DONATE);
    public static final ButtonTypeType UNSUBSCRIBE = new ButtonTypeType(_UNSUBSCRIBE);
    public static final ButtonTypeType VIEWCART = new ButtonTypeType(_VIEWCART);
    public static final ButtonTypeType PAYMENTPLAN = new ButtonTypeType(_PAYMENTPLAN);
    public static final ButtonTypeType AUTOBILLING = new ButtonTypeType(_AUTOBILLING);
    public static final ButtonTypeType PAYMENT = new ButtonTypeType(_PAYMENT);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ButtonTypeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ButtonTypeType enumeration = (ButtonTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ButtonTypeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ButtonTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
