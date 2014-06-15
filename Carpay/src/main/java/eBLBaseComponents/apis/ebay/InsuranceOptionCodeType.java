/**
 * InsuranceOptionCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class InsuranceOptionCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InsuranceOptionCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Optional = new org.apache.axis.types.Token("Optional");
    public static final org.apache.axis.types.Token _Required = new org.apache.axis.types.Token("Required");
    public static final org.apache.axis.types.Token _NotOffered = new org.apache.axis.types.Token("NotOffered");
    public static final org.apache.axis.types.Token _IncludedInShippingHandling = new org.apache.axis.types.Token("IncludedInShippingHandling");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final InsuranceOptionCodeType Optional = new InsuranceOptionCodeType(_Optional);
    public static final InsuranceOptionCodeType Required = new InsuranceOptionCodeType(_Required);
    public static final InsuranceOptionCodeType NotOffered = new InsuranceOptionCodeType(_NotOffered);
    public static final InsuranceOptionCodeType IncludedInShippingHandling = new InsuranceOptionCodeType(_IncludedInShippingHandling);
    public static final InsuranceOptionCodeType CustomCode = new InsuranceOptionCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static InsuranceOptionCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        InsuranceOptionCodeType enumeration = (InsuranceOptionCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InsuranceOptionCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InsuranceOptionCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOptionCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
