/**
 * OptionTypeListType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class OptionTypeListType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected OptionTypeListType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _NoOptionType = new org.apache.axis.types.Token("NoOptionType");
    public static final org.apache.axis.types.Token _FULL = new org.apache.axis.types.Token("FULL");
    public static final org.apache.axis.types.Token _EMI = new org.apache.axis.types.Token("EMI");
    public static final org.apache.axis.types.Token _VARIABLE = new org.apache.axis.types.Token("VARIABLE");
    public static final OptionTypeListType NoOptionType = new OptionTypeListType(_NoOptionType);
    public static final OptionTypeListType FULL = new OptionTypeListType(_FULL);
    public static final OptionTypeListType EMI = new OptionTypeListType(_EMI);
    public static final OptionTypeListType VARIABLE = new OptionTypeListType(_VARIABLE);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static OptionTypeListType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        OptionTypeListType enumeration = (OptionTypeListType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static OptionTypeListType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(OptionTypeListType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionTypeListType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
