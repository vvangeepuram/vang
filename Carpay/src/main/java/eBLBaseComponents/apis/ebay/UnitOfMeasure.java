/**
 * UnitOfMeasure.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UnitOfMeasure implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UnitOfMeasure(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _value1 = new org.apache.axis.types.Token("EA");
    public static final org.apache.axis.types.Token _value2 = new org.apache.axis.types.Token("Hours");
    public static final org.apache.axis.types.Token _value3 = new org.apache.axis.types.Token("Days");
    public static final org.apache.axis.types.Token _value4 = new org.apache.axis.types.Token("Seconds");
    public static final org.apache.axis.types.Token _value5 = new org.apache.axis.types.Token("CrateOf12");
    public static final org.apache.axis.types.Token _value6 = new org.apache.axis.types.Token("6Pack");
    public static final org.apache.axis.types.Token _value7 = new org.apache.axis.types.Token("GLI");
    public static final org.apache.axis.types.Token _value8 = new org.apache.axis.types.Token("GLL");
    public static final org.apache.axis.types.Token _value9 = new org.apache.axis.types.Token("LTR");
    public static final org.apache.axis.types.Token _value10 = new org.apache.axis.types.Token("INH");
    public static final org.apache.axis.types.Token _value11 = new org.apache.axis.types.Token("FOT");
    public static final org.apache.axis.types.Token _value12 = new org.apache.axis.types.Token("MMT");
    public static final org.apache.axis.types.Token _value13 = new org.apache.axis.types.Token("CMQ");
    public static final org.apache.axis.types.Token _value14 = new org.apache.axis.types.Token("MTR");
    public static final org.apache.axis.types.Token _value15 = new org.apache.axis.types.Token("MTK");
    public static final org.apache.axis.types.Token _value16 = new org.apache.axis.types.Token("MTQ");
    public static final org.apache.axis.types.Token _value17 = new org.apache.axis.types.Token("GRM");
    public static final org.apache.axis.types.Token _value18 = new org.apache.axis.types.Token("KGM");
    public static final org.apache.axis.types.Token _value19 = new org.apache.axis.types.Token("KG");
    public static final org.apache.axis.types.Token _value20 = new org.apache.axis.types.Token("LBR");
    public static final org.apache.axis.types.Token _value21 = new org.apache.axis.types.Token("ANN");
    public static final org.apache.axis.types.Token _value22 = new org.apache.axis.types.Token("CEL");
    public static final org.apache.axis.types.Token _value23 = new org.apache.axis.types.Token("FAH");
    public static final org.apache.axis.types.Token _value24 = new org.apache.axis.types.Token("RESERVED");
    public static final UnitOfMeasure value1 = new UnitOfMeasure(_value1);
    public static final UnitOfMeasure value2 = new UnitOfMeasure(_value2);
    public static final UnitOfMeasure value3 = new UnitOfMeasure(_value3);
    public static final UnitOfMeasure value4 = new UnitOfMeasure(_value4);
    public static final UnitOfMeasure value5 = new UnitOfMeasure(_value5);
    public static final UnitOfMeasure value6 = new UnitOfMeasure(_value6);
    public static final UnitOfMeasure value7 = new UnitOfMeasure(_value7);
    public static final UnitOfMeasure value8 = new UnitOfMeasure(_value8);
    public static final UnitOfMeasure value9 = new UnitOfMeasure(_value9);
    public static final UnitOfMeasure value10 = new UnitOfMeasure(_value10);
    public static final UnitOfMeasure value11 = new UnitOfMeasure(_value11);
    public static final UnitOfMeasure value12 = new UnitOfMeasure(_value12);
    public static final UnitOfMeasure value13 = new UnitOfMeasure(_value13);
    public static final UnitOfMeasure value14 = new UnitOfMeasure(_value14);
    public static final UnitOfMeasure value15 = new UnitOfMeasure(_value15);
    public static final UnitOfMeasure value16 = new UnitOfMeasure(_value16);
    public static final UnitOfMeasure value17 = new UnitOfMeasure(_value17);
    public static final UnitOfMeasure value18 = new UnitOfMeasure(_value18);
    public static final UnitOfMeasure value19 = new UnitOfMeasure(_value19);
    public static final UnitOfMeasure value20 = new UnitOfMeasure(_value20);
    public static final UnitOfMeasure value21 = new UnitOfMeasure(_value21);
    public static final UnitOfMeasure value22 = new UnitOfMeasure(_value22);
    public static final UnitOfMeasure value23 = new UnitOfMeasure(_value23);
    public static final UnitOfMeasure value24 = new UnitOfMeasure(_value24);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static UnitOfMeasure fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        UnitOfMeasure enumeration = (UnitOfMeasure)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UnitOfMeasure fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UnitOfMeasure.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UnitOfMeasure"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
