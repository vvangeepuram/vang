/**
 * PaymentTransactionStatusCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentTransactionStatusCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentTransactionStatusCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Pending = new org.apache.axis.types.Token("Pending");
    public static final org.apache.axis.types.Token _Processing = new org.apache.axis.types.Token("Processing");
    public static final org.apache.axis.types.Token _Success = new org.apache.axis.types.Token("Success");
    public static final org.apache.axis.types.Token _Denied = new org.apache.axis.types.Token("Denied");
    public static final org.apache.axis.types.Token _Reversed = new org.apache.axis.types.Token("Reversed");
    public static final PaymentTransactionStatusCodeType Pending = new PaymentTransactionStatusCodeType(_Pending);
    public static final PaymentTransactionStatusCodeType Processing = new PaymentTransactionStatusCodeType(_Processing);
    public static final PaymentTransactionStatusCodeType Success = new PaymentTransactionStatusCodeType(_Success);
    public static final PaymentTransactionStatusCodeType Denied = new PaymentTransactionStatusCodeType(_Denied);
    public static final PaymentTransactionStatusCodeType Reversed = new PaymentTransactionStatusCodeType(_Reversed);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PaymentTransactionStatusCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PaymentTransactionStatusCodeType enumeration = (PaymentTransactionStatusCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentTransactionStatusCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentTransactionStatusCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionStatusCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
