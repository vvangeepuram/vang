/**
 * PaymentCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _none = new org.apache.axis.types.Token("none");
    public static final org.apache.axis.types.Token _echeck = new org.apache.axis.types.Token("echeck");
    public static final org.apache.axis.types.Token _instant = new org.apache.axis.types.Token("instant");
    public static final PaymentCodeType none = new PaymentCodeType(_none);
    public static final PaymentCodeType echeck = new PaymentCodeType(_echeck);
    public static final PaymentCodeType instant = new PaymentCodeType(_instant);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PaymentCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PaymentCodeType enumeration = (PaymentCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}