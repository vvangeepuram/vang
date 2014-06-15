/**
 * UserStatusCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UserStatusCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UserStatusCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _Unknown = new org.apache.axis.types.Token("Unknown");
    public static final org.apache.axis.types.Token _Suspended = new org.apache.axis.types.Token("Suspended");
    public static final org.apache.axis.types.Token _Confirmed = new org.apache.axis.types.Token("Confirmed");
    public static final org.apache.axis.types.Token _Unconfirmed = new org.apache.axis.types.Token("Unconfirmed");
    public static final org.apache.axis.types.Token _Ghost = new org.apache.axis.types.Token("Ghost");
    public static final org.apache.axis.types.Token _InMaintenance = new org.apache.axis.types.Token("InMaintenance");
    public static final org.apache.axis.types.Token _Deleted = new org.apache.axis.types.Token("Deleted");
    public static final org.apache.axis.types.Token _CreditCardVerify = new org.apache.axis.types.Token("CreditCardVerify");
    public static final org.apache.axis.types.Token _AccountOnHold = new org.apache.axis.types.Token("AccountOnHold");
    public static final org.apache.axis.types.Token _Merged = new org.apache.axis.types.Token("Merged");
    public static final org.apache.axis.types.Token _RegistrationCodeMailOut = new org.apache.axis.types.Token("RegistrationCodeMailOut");
    public static final org.apache.axis.types.Token _TermPending = new org.apache.axis.types.Token("TermPending");
    public static final org.apache.axis.types.Token _UnconfirmedHalfOptIn = new org.apache.axis.types.Token("UnconfirmedHalfOptIn");
    public static final org.apache.axis.types.Token _CreditCardVerifyHalfOptIn = new org.apache.axis.types.Token("CreditCardVerifyHalfOptIn");
    public static final org.apache.axis.types.Token _UnconfirmedPassport = new org.apache.axis.types.Token("UnconfirmedPassport");
    public static final org.apache.axis.types.Token _CreditCardVerifyPassport = new org.apache.axis.types.Token("CreditCardVerifyPassport");
    public static final org.apache.axis.types.Token _UnconfirmedExpress = new org.apache.axis.types.Token("UnconfirmedExpress");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final UserStatusCodeType Unknown = new UserStatusCodeType(_Unknown);
    public static final UserStatusCodeType Suspended = new UserStatusCodeType(_Suspended);
    public static final UserStatusCodeType Confirmed = new UserStatusCodeType(_Confirmed);
    public static final UserStatusCodeType Unconfirmed = new UserStatusCodeType(_Unconfirmed);
    public static final UserStatusCodeType Ghost = new UserStatusCodeType(_Ghost);
    public static final UserStatusCodeType InMaintenance = new UserStatusCodeType(_InMaintenance);
    public static final UserStatusCodeType Deleted = new UserStatusCodeType(_Deleted);
    public static final UserStatusCodeType CreditCardVerify = new UserStatusCodeType(_CreditCardVerify);
    public static final UserStatusCodeType AccountOnHold = new UserStatusCodeType(_AccountOnHold);
    public static final UserStatusCodeType Merged = new UserStatusCodeType(_Merged);
    public static final UserStatusCodeType RegistrationCodeMailOut = new UserStatusCodeType(_RegistrationCodeMailOut);
    public static final UserStatusCodeType TermPending = new UserStatusCodeType(_TermPending);
    public static final UserStatusCodeType UnconfirmedHalfOptIn = new UserStatusCodeType(_UnconfirmedHalfOptIn);
    public static final UserStatusCodeType CreditCardVerifyHalfOptIn = new UserStatusCodeType(_CreditCardVerifyHalfOptIn);
    public static final UserStatusCodeType UnconfirmedPassport = new UserStatusCodeType(_UnconfirmedPassport);
    public static final UserStatusCodeType CreditCardVerifyPassport = new UserStatusCodeType(_CreditCardVerifyPassport);
    public static final UserStatusCodeType UnconfirmedExpress = new UserStatusCodeType(_UnconfirmedExpress);
    public static final UserStatusCodeType CustomCode = new UserStatusCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static UserStatusCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        UserStatusCodeType enumeration = (UserStatusCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UserStatusCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UserStatusCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserStatusCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
