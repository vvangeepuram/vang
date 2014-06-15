/**
 * AckCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class AckCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AckCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Success = new org.apache.axis.types.Token("Success");
    public static final org.apache.axis.types.Token _Failure = new org.apache.axis.types.Token("Failure");
    public static final org.apache.axis.types.Token _Warning = new org.apache.axis.types.Token("Warning");
    public static final org.apache.axis.types.Token _SuccessWithWarning = new org.apache.axis.types.Token("SuccessWithWarning");
    public static final org.apache.axis.types.Token _FailureWithWarning = new org.apache.axis.types.Token("FailureWithWarning");
    public static final org.apache.axis.types.Token _PartialSuccess = new org.apache.axis.types.Token("PartialSuccess");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final AckCodeType Success = new AckCodeType(_Success);
    public static final AckCodeType Failure = new AckCodeType(_Failure);
    public static final AckCodeType Warning = new AckCodeType(_Warning);
    public static final AckCodeType SuccessWithWarning = new AckCodeType(_SuccessWithWarning);
    public static final AckCodeType FailureWithWarning = new AckCodeType(_FailureWithWarning);
    public static final AckCodeType PartialSuccess = new AckCodeType(_PartialSuccess);
    public static final AckCodeType CustomCode = new AckCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static AckCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        AckCodeType enumeration = (AckCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AckCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AckCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AckCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
