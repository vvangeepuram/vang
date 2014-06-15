/**
 * BusinessTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BusinessTypeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BusinessTypeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Unknown = new org.apache.axis.types.Token("Unknown");
    public static final org.apache.axis.types.Token _Individual = new org.apache.axis.types.Token("Individual");
    public static final org.apache.axis.types.Token _Proprietorship = new org.apache.axis.types.Token("Proprietorship");
    public static final org.apache.axis.types.Token _Partnership = new org.apache.axis.types.Token("Partnership");
    public static final org.apache.axis.types.Token _Corporation = new org.apache.axis.types.Token("Corporation");
    public static final org.apache.axis.types.Token _Nonprofit = new org.apache.axis.types.Token("Nonprofit");
    public static final org.apache.axis.types.Token _Government = new org.apache.axis.types.Token("Government");
    public static final BusinessTypeType Unknown = new BusinessTypeType(_Unknown);
    public static final BusinessTypeType Individual = new BusinessTypeType(_Individual);
    public static final BusinessTypeType Proprietorship = new BusinessTypeType(_Proprietorship);
    public static final BusinessTypeType Partnership = new BusinessTypeType(_Partnership);
    public static final BusinessTypeType Corporation = new BusinessTypeType(_Corporation);
    public static final BusinessTypeType Nonprofit = new BusinessTypeType(_Nonprofit);
    public static final BusinessTypeType Government = new BusinessTypeType(_Government);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static BusinessTypeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        BusinessTypeType enumeration = (BusinessTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BusinessTypeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BusinessTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
