/**
 * ListingTypeCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ListingTypeCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ListingTypeCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Unknown = new org.apache.axis.types.Token("Unknown");
    public static final org.apache.axis.types.Token _Chinese = new org.apache.axis.types.Token("Chinese");
    public static final org.apache.axis.types.Token _Dutch = new org.apache.axis.types.Token("Dutch");
    public static final org.apache.axis.types.Token _Live = new org.apache.axis.types.Token("Live");
    public static final org.apache.axis.types.Token _AdType = new org.apache.axis.types.Token("AdType");
    public static final org.apache.axis.types.Token _StoresFixedPrice = new org.apache.axis.types.Token("StoresFixedPrice");
    public static final org.apache.axis.types.Token _PersonalOffer = new org.apache.axis.types.Token("PersonalOffer");
    public static final org.apache.axis.types.Token _FixedPriceItem = new org.apache.axis.types.Token("FixedPriceItem");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final ListingTypeCodeType Unknown = new ListingTypeCodeType(_Unknown);
    public static final ListingTypeCodeType Chinese = new ListingTypeCodeType(_Chinese);
    public static final ListingTypeCodeType Dutch = new ListingTypeCodeType(_Dutch);
    public static final ListingTypeCodeType Live = new ListingTypeCodeType(_Live);
    public static final ListingTypeCodeType AdType = new ListingTypeCodeType(_AdType);
    public static final ListingTypeCodeType StoresFixedPrice = new ListingTypeCodeType(_StoresFixedPrice);
    public static final ListingTypeCodeType PersonalOffer = new ListingTypeCodeType(_PersonalOffer);
    public static final ListingTypeCodeType FixedPriceItem = new ListingTypeCodeType(_FixedPriceItem);
    public static final ListingTypeCodeType CustomCode = new ListingTypeCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ListingTypeCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ListingTypeCodeType enumeration = (ListingTypeCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ListingTypeCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ListingTypeCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingTypeCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
