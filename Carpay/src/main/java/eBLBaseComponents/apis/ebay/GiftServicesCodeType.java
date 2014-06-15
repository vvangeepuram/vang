/**
 * GiftServicesCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GiftServicesCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GiftServicesCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _GiftExpressShipping = new org.apache.axis.types.Token("GiftExpressShipping");
    public static final org.apache.axis.types.Token _GiftShipToRecipient = new org.apache.axis.types.Token("GiftShipToRecipient");
    public static final org.apache.axis.types.Token _GiftWrap = new org.apache.axis.types.Token("GiftWrap");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final GiftServicesCodeType GiftExpressShipping = new GiftServicesCodeType(_GiftExpressShipping);
    public static final GiftServicesCodeType GiftShipToRecipient = new GiftServicesCodeType(_GiftShipToRecipient);
    public static final GiftServicesCodeType GiftWrap = new GiftServicesCodeType(_GiftWrap);
    public static final GiftServicesCodeType CustomCode = new GiftServicesCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static GiftServicesCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        GiftServicesCodeType enumeration = (GiftServicesCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GiftServicesCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GiftServicesCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftServicesCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
