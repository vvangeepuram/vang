/**
 * ListingDurationCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ListingDurationCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ListingDurationCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Days_1 = new org.apache.axis.types.Token("Days_1");
    public static final org.apache.axis.types.Token _Days_3 = new org.apache.axis.types.Token("Days_3");
    public static final org.apache.axis.types.Token _Days_5 = new org.apache.axis.types.Token("Days_5");
    public static final org.apache.axis.types.Token _Days_7 = new org.apache.axis.types.Token("Days_7");
    public static final org.apache.axis.types.Token _Days_10 = new org.apache.axis.types.Token("Days_10");
    public static final org.apache.axis.types.Token _Days_30 = new org.apache.axis.types.Token("Days_30");
    public static final org.apache.axis.types.Token _Days_60 = new org.apache.axis.types.Token("Days_60");
    public static final org.apache.axis.types.Token _Days_90 = new org.apache.axis.types.Token("Days_90");
    public static final org.apache.axis.types.Token _Days_120 = new org.apache.axis.types.Token("Days_120");
    public static final org.apache.axis.types.Token _GTC = new org.apache.axis.types.Token("GTC");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final ListingDurationCodeType Days_1 = new ListingDurationCodeType(_Days_1);
    public static final ListingDurationCodeType Days_3 = new ListingDurationCodeType(_Days_3);
    public static final ListingDurationCodeType Days_5 = new ListingDurationCodeType(_Days_5);
    public static final ListingDurationCodeType Days_7 = new ListingDurationCodeType(_Days_7);
    public static final ListingDurationCodeType Days_10 = new ListingDurationCodeType(_Days_10);
    public static final ListingDurationCodeType Days_30 = new ListingDurationCodeType(_Days_30);
    public static final ListingDurationCodeType Days_60 = new ListingDurationCodeType(_Days_60);
    public static final ListingDurationCodeType Days_90 = new ListingDurationCodeType(_Days_90);
    public static final ListingDurationCodeType Days_120 = new ListingDurationCodeType(_Days_120);
    public static final ListingDurationCodeType GTC = new ListingDurationCodeType(_GTC);
    public static final ListingDurationCodeType CustomCode = new ListingDurationCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ListingDurationCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ListingDurationCodeType enumeration = (ListingDurationCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ListingDurationCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ListingDurationCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDurationCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
