/**
 * ReversalReasonCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ReversalReasonCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ReversalReasonCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("none");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("chargeback");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("guarantee");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("buyer-complaint");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("refund");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("other");
    public static final ReversalReasonCodeType value1 = new ReversalReasonCodeType(_value1);
    public static final ReversalReasonCodeType value2 = new ReversalReasonCodeType(_value2);
    public static final ReversalReasonCodeType value3 = new ReversalReasonCodeType(_value3);
    public static final ReversalReasonCodeType value4 = new ReversalReasonCodeType(_value4);
    public static final ReversalReasonCodeType value5 = new ReversalReasonCodeType(_value5);
    public static final ReversalReasonCodeType value6 = new ReversalReasonCodeType(_value6);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ReversalReasonCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ReversalReasonCodeType enumeration = (ReversalReasonCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ReversalReasonCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ReversalReasonCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReversalReasonCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
