/**
 * GeneralPaymentMethodCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GeneralPaymentMethodCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GeneralPaymentMethodCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Other = new org.apache.axis.types.Token("Other");
    public static final org.apache.axis.types.Token _Echeck = new org.apache.axis.types.Token("Echeck");
    public static final org.apache.axis.types.Token _ACH = new org.apache.axis.types.Token("ACH");
    public static final org.apache.axis.types.Token _Creditcard = new org.apache.axis.types.Token("Creditcard");
    public static final org.apache.axis.types.Token _PayPalBalance = new org.apache.axis.types.Token("PayPalBalance");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final GeneralPaymentMethodCodeType Other = new GeneralPaymentMethodCodeType(_Other);
    public static final GeneralPaymentMethodCodeType Echeck = new GeneralPaymentMethodCodeType(_Echeck);
    public static final GeneralPaymentMethodCodeType ACH = new GeneralPaymentMethodCodeType(_ACH);
    public static final GeneralPaymentMethodCodeType Creditcard = new GeneralPaymentMethodCodeType(_Creditcard);
    public static final GeneralPaymentMethodCodeType PayPalBalance = new GeneralPaymentMethodCodeType(_PayPalBalance);
    public static final GeneralPaymentMethodCodeType CustomCode = new GeneralPaymentMethodCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static GeneralPaymentMethodCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        GeneralPaymentMethodCodeType enumeration = (GeneralPaymentMethodCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GeneralPaymentMethodCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GeneralPaymentMethodCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GeneralPaymentMethodCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
