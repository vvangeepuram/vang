/**
 * PaymentStatusCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentStatusCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentStatusCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("Completed");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("Failed");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("Pending");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("Denied");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("Refunded");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("Reversed");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("Canceled-Reversal");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("Processed");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("Partially-Refunded");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("Voided");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("Expired");
    public static final org.apache.axis.types.Token _value13 = new org.apache.axis.types.Token("In-Progress");
    public static final org.apache.axis.types.Token _value14 = new org.apache.axis.types.Token("Created");
    public static final org.apache.axis.types.Token _value15 = new org.apache.axis.types.Token("Completed-Funds-Held");
    public static final org.apache.axis.types.Token _value16 = new org.apache.axis.types.Token("Instant");
    public static final org.apache.axis.types.Token _value17 = new org.apache.axis.types.Token("Delayed");
    public static final PaymentStatusCodeType value1 = new PaymentStatusCodeType(_value1);
    public static final PaymentStatusCodeType value2 = new PaymentStatusCodeType(_value2);
    public static final PaymentStatusCodeType value3 = new PaymentStatusCodeType(_value3);
    public static final PaymentStatusCodeType value4 = new PaymentStatusCodeType(_value4);
    public static final PaymentStatusCodeType value5 = new PaymentStatusCodeType(_value5);
    public static final PaymentStatusCodeType value6 = new PaymentStatusCodeType(_value6);
    public static final PaymentStatusCodeType value7 = new PaymentStatusCodeType(_value7);
    public static final PaymentStatusCodeType value8 = new PaymentStatusCodeType(_value8);
    public static final PaymentStatusCodeType value9 = new PaymentStatusCodeType(_value9);
    public static final PaymentStatusCodeType value10 = new PaymentStatusCodeType(_value10);
    public static final PaymentStatusCodeType value11 = new PaymentStatusCodeType(_value11);
    public static final PaymentStatusCodeType value12 = new PaymentStatusCodeType(_value12);
    public static final PaymentStatusCodeType value13 = new PaymentStatusCodeType(_value13);
    public static final PaymentStatusCodeType value14 = new PaymentStatusCodeType(_value14);
    public static final PaymentStatusCodeType value15 = new PaymentStatusCodeType(_value15);
    public static final PaymentStatusCodeType value16 = new PaymentStatusCodeType(_value16);
    public static final PaymentStatusCodeType value17 = new PaymentStatusCodeType(_value17);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PaymentStatusCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PaymentStatusCodeType enumeration = (PaymentStatusCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentStatusCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentStatusCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatusCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
