/**
 * UserChannelCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UserChannelCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserChannelCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _WEB = new org.apache.axis.types.Token("WEB");
    public static final org.apache.axis.types.Token _MOBILE = new org.apache.axis.types.Token("MOBILE");
    public static final org.apache.axis.types.Token _POS = new org.apache.axis.types.Token("POS");
    public static final org.apache.axis.types.Token _KIOSK = new org.apache.axis.types.Token("KIOSK");
    public static final org.apache.axis.types.Token _IHSTB = new org.apache.axis.types.Token("IHSTB");
    public static final org.apache.axis.types.Token _IVR = new org.apache.axis.types.Token("IVR");
    public static final org.apache.axis.types.Token _ADMIN = new org.apache.axis.types.Token("ADMIN");
    public static final org.apache.axis.types.Token _CSOPS = new org.apache.axis.types.Token("CSOPS");
    public static final UserChannelCodeType WEB = new UserChannelCodeType(_WEB);
    public static final UserChannelCodeType MOBILE = new UserChannelCodeType(_MOBILE);
    public static final UserChannelCodeType POS = new UserChannelCodeType(_POS);
    public static final UserChannelCodeType KIOSK = new UserChannelCodeType(_KIOSK);
    public static final UserChannelCodeType IHSTB = new UserChannelCodeType(_IHSTB);
    public static final UserChannelCodeType IVR = new UserChannelCodeType(_IVR);
    public static final UserChannelCodeType ADMIN = new UserChannelCodeType(_ADMIN);
    public static final UserChannelCodeType CSOPS = new UserChannelCodeType(_CSOPS);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static UserChannelCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        UserChannelCodeType enumeration = (UserChannelCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserChannelCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserChannelCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserChannelCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
