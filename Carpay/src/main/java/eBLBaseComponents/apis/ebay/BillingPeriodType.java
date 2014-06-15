/**
 * BillingPeriodType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BillingPeriodType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingPeriodType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _NoBillingPeriodType = new org.apache.axis.types.Token("NoBillingPeriodType");
    public static final org.apache.axis.types.Token _Day = new org.apache.axis.types.Token("Day");
    public static final org.apache.axis.types.Token _Week = new org.apache.axis.types.Token("Week");
    public static final org.apache.axis.types.Token _SemiMonth = new org.apache.axis.types.Token("SemiMonth");
    public static final org.apache.axis.types.Token _Month = new org.apache.axis.types.Token("Month");
    public static final org.apache.axis.types.Token _Year = new org.apache.axis.types.Token("Year");
    public static final BillingPeriodType NoBillingPeriodType = new BillingPeriodType(_NoBillingPeriodType);
    public static final BillingPeriodType Day = new BillingPeriodType(_Day);
    public static final BillingPeriodType Week = new BillingPeriodType(_Week);
    public static final BillingPeriodType SemiMonth = new BillingPeriodType(_SemiMonth);
    public static final BillingPeriodType Month = new BillingPeriodType(_Month);
    public static final BillingPeriodType Year = new BillingPeriodType(_Year);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static BillingPeriodType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        BillingPeriodType enumeration = (BillingPeriodType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingPeriodType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingPeriodType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
