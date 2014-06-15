/**
 * FeedbackRatingStarCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class FeedbackRatingStarCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeedbackRatingStarCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _None = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _Yellow = new org.apache.axis.types.Token("Yellow");
    public static final org.apache.axis.types.Token _Turquoise = new org.apache.axis.types.Token("Turquoise");
    public static final org.apache.axis.types.Token _Purple = new org.apache.axis.types.Token("Purple");
    public static final org.apache.axis.types.Token _Red = new org.apache.axis.types.Token("Red");
    public static final org.apache.axis.types.Token _Green = new org.apache.axis.types.Token("Green");
    public static final org.apache.axis.types.Token _YellowShooting = new org.apache.axis.types.Token("YellowShooting");
    public static final org.apache.axis.types.Token _TurquoiseShooting = new org.apache.axis.types.Token("TurquoiseShooting");
    public static final org.apache.axis.types.Token _PurpleShooting = new org.apache.axis.types.Token("PurpleShooting");
    public static final org.apache.axis.types.Token _RedShooting = new org.apache.axis.types.Token("RedShooting");
    public static final org.apache.axis.types.Token _Blue = new org.apache.axis.types.Token("Blue");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final FeedbackRatingStarCodeType None = new FeedbackRatingStarCodeType(_None);
    public static final FeedbackRatingStarCodeType Yellow = new FeedbackRatingStarCodeType(_Yellow);
    public static final FeedbackRatingStarCodeType Turquoise = new FeedbackRatingStarCodeType(_Turquoise);
    public static final FeedbackRatingStarCodeType Purple = new FeedbackRatingStarCodeType(_Purple);
    public static final FeedbackRatingStarCodeType Red = new FeedbackRatingStarCodeType(_Red);
    public static final FeedbackRatingStarCodeType Green = new FeedbackRatingStarCodeType(_Green);
    public static final FeedbackRatingStarCodeType YellowShooting = new FeedbackRatingStarCodeType(_YellowShooting);
    public static final FeedbackRatingStarCodeType TurquoiseShooting = new FeedbackRatingStarCodeType(_TurquoiseShooting);
    public static final FeedbackRatingStarCodeType PurpleShooting = new FeedbackRatingStarCodeType(_PurpleShooting);
    public static final FeedbackRatingStarCodeType RedShooting = new FeedbackRatingStarCodeType(_RedShooting);
    public static final FeedbackRatingStarCodeType Blue = new FeedbackRatingStarCodeType(_Blue);
    public static final FeedbackRatingStarCodeType CustomCode = new FeedbackRatingStarCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static FeedbackRatingStarCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        FeedbackRatingStarCodeType enumeration = (FeedbackRatingStarCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeedbackRatingStarCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeedbackRatingStarCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeedbackRatingStarCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
