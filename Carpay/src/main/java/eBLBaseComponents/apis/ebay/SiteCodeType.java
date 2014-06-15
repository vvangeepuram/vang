/**
 * SiteCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SiteCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SiteCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _US = new org.apache.axis.types.Token("US");
    public static final org.apache.axis.types.Token _Canada = new org.apache.axis.types.Token("Canada");
    public static final org.apache.axis.types.Token _UK = new org.apache.axis.types.Token("UK");
    public static final org.apache.axis.types.Token _Australia = new org.apache.axis.types.Token("Australia");
    public static final org.apache.axis.types.Token _Austria = new org.apache.axis.types.Token("Austria");
    public static final org.apache.axis.types.Token _Belgium_French = new org.apache.axis.types.Token("Belgium_French");
    public static final org.apache.axis.types.Token _France = new org.apache.axis.types.Token("France");
    public static final org.apache.axis.types.Token _Germany = new org.apache.axis.types.Token("Germany");
    public static final org.apache.axis.types.Token _Italy = new org.apache.axis.types.Token("Italy");
    public static final org.apache.axis.types.Token _Belgium_Dutch = new org.apache.axis.types.Token("Belgium_Dutch");
    public static final org.apache.axis.types.Token _Netherlands = new org.apache.axis.types.Token("Netherlands");
    public static final org.apache.axis.types.Token _Spain = new org.apache.axis.types.Token("Spain");
    public static final org.apache.axis.types.Token _Switzerland = new org.apache.axis.types.Token("Switzerland");
    public static final org.apache.axis.types.Token _Taiwan = new org.apache.axis.types.Token("Taiwan");
    public static final org.apache.axis.types.Token _eBayMotors = new org.apache.axis.types.Token("eBayMotors");
    public static final org.apache.axis.types.Token _HongKong = new org.apache.axis.types.Token("HongKong");
    public static final org.apache.axis.types.Token _Singapore = new org.apache.axis.types.Token("Singapore");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final SiteCodeType US = new SiteCodeType(_US);
    public static final SiteCodeType Canada = new SiteCodeType(_Canada);
    public static final SiteCodeType UK = new SiteCodeType(_UK);
    public static final SiteCodeType Australia = new SiteCodeType(_Australia);
    public static final SiteCodeType Austria = new SiteCodeType(_Austria);
    public static final SiteCodeType Belgium_French = new SiteCodeType(_Belgium_French);
    public static final SiteCodeType France = new SiteCodeType(_France);
    public static final SiteCodeType Germany = new SiteCodeType(_Germany);
    public static final SiteCodeType Italy = new SiteCodeType(_Italy);
    public static final SiteCodeType Belgium_Dutch = new SiteCodeType(_Belgium_Dutch);
    public static final SiteCodeType Netherlands = new SiteCodeType(_Netherlands);
    public static final SiteCodeType Spain = new SiteCodeType(_Spain);
    public static final SiteCodeType Switzerland = new SiteCodeType(_Switzerland);
    public static final SiteCodeType Taiwan = new SiteCodeType(_Taiwan);
    public static final SiteCodeType eBayMotors = new SiteCodeType(_eBayMotors);
    public static final SiteCodeType HongKong = new SiteCodeType(_HongKong);
    public static final SiteCodeType Singapore = new SiteCodeType(_Singapore);
    public static final SiteCodeType CustomCode = new SiteCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static SiteCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        SiteCodeType enumeration = (SiteCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SiteCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SiteCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
