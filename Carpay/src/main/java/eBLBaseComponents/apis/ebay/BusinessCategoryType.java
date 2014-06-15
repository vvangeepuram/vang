/**
 * BusinessCategoryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BusinessCategoryType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BusinessCategoryType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("Category-Unspecified");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("Antiques");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("Arts");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("Automotive");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("Beauty");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("Books");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("Business");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("Cameras-and-Photography");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("Clothing");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("Collectibles");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("Computer-Hardware-and-Software");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("Culture-and-Religion");
    public static final org.apache.axis.types.Token _value13 = new org.apache.axis.types.Token("Electronics-and-Telecom");
    public static final org.apache.axis.types.Token _value14 = new org.apache.axis.types.Token("Entertainment");
    public static final org.apache.axis.types.Token _value15 = new org.apache.axis.types.Token("Entertainment-Memorabilia");
    public static final org.apache.axis.types.Token _value16 = new org.apache.axis.types.Token("Food-Drink-and-Nutrition");
    public static final org.apache.axis.types.Token _value17 = new org.apache.axis.types.Token("Gifts-and-Flowers");
    public static final org.apache.axis.types.Token _value18 = new org.apache.axis.types.Token("Hobbies-Toys-and-Games");
    public static final org.apache.axis.types.Token _value19 = new org.apache.axis.types.Token("Home-and-Garden");
    public static final org.apache.axis.types.Token _value20 = new org.apache.axis.types.Token("Internet-and-Network-Services");
    public static final org.apache.axis.types.Token _value21 = new org.apache.axis.types.Token("Media-and-Entertainment");
    public static final org.apache.axis.types.Token _value22 = new org.apache.axis.types.Token("Medical-and-Pharmaceutical");
    public static final org.apache.axis.types.Token _value23 = new org.apache.axis.types.Token("Money-Service-Businesses");
    public static final org.apache.axis.types.Token _value24 = new org.apache.axis.types.Token("Non-Profit-Political-and-Religion");
    public static final org.apache.axis.types.Token _value25 = new org.apache.axis.types.Token("Not-Elsewhere-Classified");
    public static final org.apache.axis.types.Token _value26 = new org.apache.axis.types.Token("Pets-and-Animals");
    public static final org.apache.axis.types.Token _value27 = new org.apache.axis.types.Token("Real-Estate");
    public static final org.apache.axis.types.Token _value28 = new org.apache.axis.types.Token("Services");
    public static final org.apache.axis.types.Token _value29 = new org.apache.axis.types.Token("Sports-and-Recreation");
    public static final org.apache.axis.types.Token _value30 = new org.apache.axis.types.Token("Travel");
    public static final org.apache.axis.types.Token _value31 = new org.apache.axis.types.Token("Other-Categories");
    public static final BusinessCategoryType value1 = new BusinessCategoryType(_value1);
    public static final BusinessCategoryType value2 = new BusinessCategoryType(_value2);
    public static final BusinessCategoryType value3 = new BusinessCategoryType(_value3);
    public static final BusinessCategoryType value4 = new BusinessCategoryType(_value4);
    public static final BusinessCategoryType value5 = new BusinessCategoryType(_value5);
    public static final BusinessCategoryType value6 = new BusinessCategoryType(_value6);
    public static final BusinessCategoryType value7 = new BusinessCategoryType(_value7);
    public static final BusinessCategoryType value8 = new BusinessCategoryType(_value8);
    public static final BusinessCategoryType value9 = new BusinessCategoryType(_value9);
    public static final BusinessCategoryType value10 = new BusinessCategoryType(_value10);
    public static final BusinessCategoryType value11 = new BusinessCategoryType(_value11);
    public static final BusinessCategoryType value12 = new BusinessCategoryType(_value12);
    public static final BusinessCategoryType value13 = new BusinessCategoryType(_value13);
    public static final BusinessCategoryType value14 = new BusinessCategoryType(_value14);
    public static final BusinessCategoryType value15 = new BusinessCategoryType(_value15);
    public static final BusinessCategoryType value16 = new BusinessCategoryType(_value16);
    public static final BusinessCategoryType value17 = new BusinessCategoryType(_value17);
    public static final BusinessCategoryType value18 = new BusinessCategoryType(_value18);
    public static final BusinessCategoryType value19 = new BusinessCategoryType(_value19);
    public static final BusinessCategoryType value20 = new BusinessCategoryType(_value20);
    public static final BusinessCategoryType value21 = new BusinessCategoryType(_value21);
    public static final BusinessCategoryType value22 = new BusinessCategoryType(_value22);
    public static final BusinessCategoryType value23 = new BusinessCategoryType(_value23);
    public static final BusinessCategoryType value24 = new BusinessCategoryType(_value24);
    public static final BusinessCategoryType value25 = new BusinessCategoryType(_value25);
    public static final BusinessCategoryType value26 = new BusinessCategoryType(_value26);
    public static final BusinessCategoryType value27 = new BusinessCategoryType(_value27);
    public static final BusinessCategoryType value28 = new BusinessCategoryType(_value28);
    public static final BusinessCategoryType value29 = new BusinessCategoryType(_value29);
    public static final BusinessCategoryType value30 = new BusinessCategoryType(_value30);
    public static final BusinessCategoryType value31 = new BusinessCategoryType(_value31);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static BusinessCategoryType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        BusinessCategoryType enumeration = (BusinessCategoryType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BusinessCategoryType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BusinessCategoryType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessCategoryType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
