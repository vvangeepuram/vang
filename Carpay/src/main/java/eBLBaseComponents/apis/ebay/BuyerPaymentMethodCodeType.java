/**
 * BuyerPaymentMethodCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BuyerPaymentMethodCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BuyerPaymentMethodCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _None = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _MOCC = new org.apache.axis.types.Token("MOCC");
    public static final org.apache.axis.types.Token _AmEx = new org.apache.axis.types.Token("AmEx");
    public static final org.apache.axis.types.Token _PaymentSeeDescription = new org.apache.axis.types.Token("PaymentSeeDescription");
    public static final org.apache.axis.types.Token _CCAccepted = new org.apache.axis.types.Token("CCAccepted");
    public static final org.apache.axis.types.Token _PersonalCheck = new org.apache.axis.types.Token("PersonalCheck");
    public static final org.apache.axis.types.Token _COD = new org.apache.axis.types.Token("COD");
    public static final org.apache.axis.types.Token _VisaMC = new org.apache.axis.types.Token("VisaMC");
    public static final org.apache.axis.types.Token _Other = new org.apache.axis.types.Token("Other");
    public static final org.apache.axis.types.Token _PayPal = new org.apache.axis.types.Token("PayPal");
    public static final org.apache.axis.types.Token _Discover = new org.apache.axis.types.Token("Discover");
    public static final org.apache.axis.types.Token _CashOnPickup = new org.apache.axis.types.Token("CashOnPickup");
    public static final org.apache.axis.types.Token _MoneyXferAccepted = new org.apache.axis.types.Token("MoneyXferAccepted");
    public static final org.apache.axis.types.Token _MoneyXferAcceptedinCheckout = new org.apache.axis.types.Token("MoneyXferAcceptedinCheckout");
    public static final org.apache.axis.types.Token _OtherOnlinePayments = new org.apache.axis.types.Token("OtherOnlinePayments");
    public static final org.apache.axis.types.Token _CustomCode = new org.apache.axis.types.Token("CustomCode");
    public static final BuyerPaymentMethodCodeType None = new BuyerPaymentMethodCodeType(_None);
    public static final BuyerPaymentMethodCodeType MOCC = new BuyerPaymentMethodCodeType(_MOCC);
    public static final BuyerPaymentMethodCodeType AmEx = new BuyerPaymentMethodCodeType(_AmEx);
    public static final BuyerPaymentMethodCodeType PaymentSeeDescription = new BuyerPaymentMethodCodeType(_PaymentSeeDescription);
    public static final BuyerPaymentMethodCodeType CCAccepted = new BuyerPaymentMethodCodeType(_CCAccepted);
    public static final BuyerPaymentMethodCodeType PersonalCheck = new BuyerPaymentMethodCodeType(_PersonalCheck);
    public static final BuyerPaymentMethodCodeType COD = new BuyerPaymentMethodCodeType(_COD);
    public static final BuyerPaymentMethodCodeType VisaMC = new BuyerPaymentMethodCodeType(_VisaMC);
    public static final BuyerPaymentMethodCodeType Other = new BuyerPaymentMethodCodeType(_Other);
    public static final BuyerPaymentMethodCodeType PayPal = new BuyerPaymentMethodCodeType(_PayPal);
    public static final BuyerPaymentMethodCodeType Discover = new BuyerPaymentMethodCodeType(_Discover);
    public static final BuyerPaymentMethodCodeType CashOnPickup = new BuyerPaymentMethodCodeType(_CashOnPickup);
    public static final BuyerPaymentMethodCodeType MoneyXferAccepted = new BuyerPaymentMethodCodeType(_MoneyXferAccepted);
    public static final BuyerPaymentMethodCodeType MoneyXferAcceptedinCheckout = new BuyerPaymentMethodCodeType(_MoneyXferAcceptedinCheckout);
    public static final BuyerPaymentMethodCodeType OtherOnlinePayments = new BuyerPaymentMethodCodeType(_OtherOnlinePayments);
    public static final BuyerPaymentMethodCodeType CustomCode = new BuyerPaymentMethodCodeType(_CustomCode);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static BuyerPaymentMethodCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        BuyerPaymentMethodCodeType enumeration = (BuyerPaymentMethodCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BuyerPaymentMethodCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BuyerPaymentMethodCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerPaymentMethodCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
