/**
 * MarketingCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class MarketingCategoryType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MarketingCategoryType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("Marketing-Category-Default");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("Marketing-Category1");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("Marketing-Category2");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("Marketing-Category3");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("Marketing-Category4");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("Marketing-Category5");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("Marketing-Category6");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("Marketing-Category7");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("Marketing-Category8");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("Marketing-Category9");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("Marketing-Category10");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("Marketing-Category11");
    public static final org.apache.axis.types.Token _value13 = new org.apache.axis.types.Token("Marketing-Category12");
    public static final org.apache.axis.types.Token _value14 = new org.apache.axis.types.Token("Marketing-Category13");
    public static final org.apache.axis.types.Token _value15 = new org.apache.axis.types.Token("Marketing-Category14");
    public static final org.apache.axis.types.Token _value16 = new org.apache.axis.types.Token("Marketing-Category15");
    public static final org.apache.axis.types.Token _value17 = new org.apache.axis.types.Token("Marketing-Category16");
    public static final org.apache.axis.types.Token _value18 = new org.apache.axis.types.Token("Marketing-Category17");
    public static final org.apache.axis.types.Token _value19 = new org.apache.axis.types.Token("Marketing-Category18");
    public static final org.apache.axis.types.Token _value20 = new org.apache.axis.types.Token("Marketing-Category19");
    public static final org.apache.axis.types.Token _value21 = new org.apache.axis.types.Token("Marketing-Category20");
    public static final MarketingCategoryType value1 = new MarketingCategoryType(_value1);
    public static final MarketingCategoryType value2 = new MarketingCategoryType(_value2);
    public static final MarketingCategoryType value3 = new MarketingCategoryType(_value3);
    public static final MarketingCategoryType value4 = new MarketingCategoryType(_value4);
    public static final MarketingCategoryType value5 = new MarketingCategoryType(_value5);
    public static final MarketingCategoryType value6 = new MarketingCategoryType(_value6);
    public static final MarketingCategoryType value7 = new MarketingCategoryType(_value7);
    public static final MarketingCategoryType value8 = new MarketingCategoryType(_value8);
    public static final MarketingCategoryType value9 = new MarketingCategoryType(_value9);
    public static final MarketingCategoryType value10 = new MarketingCategoryType(_value10);
    public static final MarketingCategoryType value11 = new MarketingCategoryType(_value11);
    public static final MarketingCategoryType value12 = new MarketingCategoryType(_value12);
    public static final MarketingCategoryType value13 = new MarketingCategoryType(_value13);
    public static final MarketingCategoryType value14 = new MarketingCategoryType(_value14);
    public static final MarketingCategoryType value15 = new MarketingCategoryType(_value15);
    public static final MarketingCategoryType value16 = new MarketingCategoryType(_value16);
    public static final MarketingCategoryType value17 = new MarketingCategoryType(_value17);
    public static final MarketingCategoryType value18 = new MarketingCategoryType(_value18);
    public static final MarketingCategoryType value19 = new MarketingCategoryType(_value19);
    public static final MarketingCategoryType value20 = new MarketingCategoryType(_value20);
    public static final MarketingCategoryType value21 = new MarketingCategoryType(_value21);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static MarketingCategoryType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        MarketingCategoryType enumeration = (MarketingCategoryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MarketingCategoryType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MarketingCategoryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MarketingCategoryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
