/**
 * AverageTransactionPriceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class AverageTransactionPriceType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AverageTransactionPriceType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("AverageTransactionPrice-Not-Applicable");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("AverageTransactionPrice-Range1");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("AverageTransactionPrice-Range2");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("AverageTransactionPrice-Range3");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("AverageTransactionPrice-Range4");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("AverageTransactionPrice-Range5");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("AverageTransactionPrice-Range6");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("AverageTransactionPrice-Range7");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("AverageTransactionPrice-Range8");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("AverageTransactionPrice-Range9");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("AverageTransactionPrice-Range10");
    public static final AverageTransactionPriceType value1 = new AverageTransactionPriceType(_value1);
    public static final AverageTransactionPriceType value2 = new AverageTransactionPriceType(_value2);
    public static final AverageTransactionPriceType value3 = new AverageTransactionPriceType(_value3);
    public static final AverageTransactionPriceType value4 = new AverageTransactionPriceType(_value4);
    public static final AverageTransactionPriceType value5 = new AverageTransactionPriceType(_value5);
    public static final AverageTransactionPriceType value6 = new AverageTransactionPriceType(_value6);
    public static final AverageTransactionPriceType value7 = new AverageTransactionPriceType(_value7);
    public static final AverageTransactionPriceType value8 = new AverageTransactionPriceType(_value8);
    public static final AverageTransactionPriceType value9 = new AverageTransactionPriceType(_value9);
    public static final AverageTransactionPriceType value10 = new AverageTransactionPriceType(_value10);
    public static final AverageTransactionPriceType value11 = new AverageTransactionPriceType(_value11);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static AverageTransactionPriceType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        AverageTransactionPriceType enumeration = (AverageTransactionPriceType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AverageTransactionPriceType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AverageTransactionPriceType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AverageTransactionPriceType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
