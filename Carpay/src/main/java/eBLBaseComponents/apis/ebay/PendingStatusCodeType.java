/**
 * PendingStatusCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PendingStatusCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PendingStatusCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("none");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("echeck");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("intl");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("verify");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("address");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("unilateral");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("other");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("upgrade");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("multi-currency");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("authorization");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("order");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("payment-review");
    public static final org.apache.axis.types.Token _value13 = new org.apache.axis.types.Token("regulatory-review");
    public static final PendingStatusCodeType value1 = new PendingStatusCodeType(_value1);
    public static final PendingStatusCodeType value2 = new PendingStatusCodeType(_value2);
    public static final PendingStatusCodeType value3 = new PendingStatusCodeType(_value3);
    public static final PendingStatusCodeType value4 = new PendingStatusCodeType(_value4);
    public static final PendingStatusCodeType value5 = new PendingStatusCodeType(_value5);
    public static final PendingStatusCodeType value6 = new PendingStatusCodeType(_value6);
    public static final PendingStatusCodeType value7 = new PendingStatusCodeType(_value7);
    public static final PendingStatusCodeType value8 = new PendingStatusCodeType(_value8);
    public static final PendingStatusCodeType value9 = new PendingStatusCodeType(_value9);
    public static final PendingStatusCodeType value10 = new PendingStatusCodeType(_value10);
    public static final PendingStatusCodeType value11 = new PendingStatusCodeType(_value11);
    public static final PendingStatusCodeType value12 = new PendingStatusCodeType(_value12);
    public static final PendingStatusCodeType value13 = new PendingStatusCodeType(_value13);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PendingStatusCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PendingStatusCodeType enumeration = (PendingStatusCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PendingStatusCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PendingStatusCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingStatusCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
