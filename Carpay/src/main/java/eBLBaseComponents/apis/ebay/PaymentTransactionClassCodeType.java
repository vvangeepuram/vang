/**
 * PaymentTransactionClassCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class PaymentTransactionClassCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PaymentTransactionClassCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _All = new org.apache.axis.types.Token("All");
    public static final org.apache.axis.types.Token _Sent = new org.apache.axis.types.Token("Sent");
    public static final org.apache.axis.types.Token _Received = new org.apache.axis.types.Token("Received");
    public static final org.apache.axis.types.Token _MassPay = new org.apache.axis.types.Token("MassPay");
    public static final org.apache.axis.types.Token _MoneyRequest = new org.apache.axis.types.Token("MoneyRequest");
    public static final org.apache.axis.types.Token _FundsAdded = new org.apache.axis.types.Token("FundsAdded");
    public static final org.apache.axis.types.Token _FundsWithdrawn = new org.apache.axis.types.Token("FundsWithdrawn");
    public static final org.apache.axis.types.Token _PayPalDebitCard = new org.apache.axis.types.Token("PayPalDebitCard");
    public static final org.apache.axis.types.Token _Referral = new org.apache.axis.types.Token("Referral");
    public static final org.apache.axis.types.Token _Fee = new org.apache.axis.types.Token("Fee");
    public static final org.apache.axis.types.Token _Subscription = new org.apache.axis.types.Token("Subscription");
    public static final org.apache.axis.types.Token _Dividend = new org.apache.axis.types.Token("Dividend");
    public static final org.apache.axis.types.Token _Billpay = new org.apache.axis.types.Token("Billpay");
    public static final org.apache.axis.types.Token _Refund = new org.apache.axis.types.Token("Refund");
    public static final org.apache.axis.types.Token _CurrencyConversions = new org.apache.axis.types.Token("CurrencyConversions");
    public static final org.apache.axis.types.Token _BalanceTransfer = new org.apache.axis.types.Token("BalanceTransfer");
    public static final org.apache.axis.types.Token _Reversal = new org.apache.axis.types.Token("Reversal");
    public static final org.apache.axis.types.Token _Shipping = new org.apache.axis.types.Token("Shipping");
    public static final org.apache.axis.types.Token _BalanceAffecting = new org.apache.axis.types.Token("BalanceAffecting");
    public static final org.apache.axis.types.Token _ECheck = new org.apache.axis.types.Token("ECheck");
    public static final org.apache.axis.types.Token _ForcedPostTransaction = new org.apache.axis.types.Token("ForcedPostTransaction");
    public static final org.apache.axis.types.Token _NonReferencedRefunds = new org.apache.axis.types.Token("NonReferencedRefunds");
    public static final PaymentTransactionClassCodeType All = new PaymentTransactionClassCodeType(_All);
    public static final PaymentTransactionClassCodeType Sent = new PaymentTransactionClassCodeType(_Sent);
    public static final PaymentTransactionClassCodeType Received = new PaymentTransactionClassCodeType(_Received);
    public static final PaymentTransactionClassCodeType MassPay = new PaymentTransactionClassCodeType(_MassPay);
    public static final PaymentTransactionClassCodeType MoneyRequest = new PaymentTransactionClassCodeType(_MoneyRequest);
    public static final PaymentTransactionClassCodeType FundsAdded = new PaymentTransactionClassCodeType(_FundsAdded);
    public static final PaymentTransactionClassCodeType FundsWithdrawn = new PaymentTransactionClassCodeType(_FundsWithdrawn);
    public static final PaymentTransactionClassCodeType PayPalDebitCard = new PaymentTransactionClassCodeType(_PayPalDebitCard);
    public static final PaymentTransactionClassCodeType Referral = new PaymentTransactionClassCodeType(_Referral);
    public static final PaymentTransactionClassCodeType Fee = new PaymentTransactionClassCodeType(_Fee);
    public static final PaymentTransactionClassCodeType Subscription = new PaymentTransactionClassCodeType(_Subscription);
    public static final PaymentTransactionClassCodeType Dividend = new PaymentTransactionClassCodeType(_Dividend);
    public static final PaymentTransactionClassCodeType Billpay = new PaymentTransactionClassCodeType(_Billpay);
    public static final PaymentTransactionClassCodeType Refund = new PaymentTransactionClassCodeType(_Refund);
    public static final PaymentTransactionClassCodeType CurrencyConversions = new PaymentTransactionClassCodeType(_CurrencyConversions);
    public static final PaymentTransactionClassCodeType BalanceTransfer = new PaymentTransactionClassCodeType(_BalanceTransfer);
    public static final PaymentTransactionClassCodeType Reversal = new PaymentTransactionClassCodeType(_Reversal);
    public static final PaymentTransactionClassCodeType Shipping = new PaymentTransactionClassCodeType(_Shipping);
    public static final PaymentTransactionClassCodeType BalanceAffecting = new PaymentTransactionClassCodeType(_BalanceAffecting);
    public static final PaymentTransactionClassCodeType ECheck = new PaymentTransactionClassCodeType(_ECheck);
    public static final PaymentTransactionClassCodeType ForcedPostTransaction = new PaymentTransactionClassCodeType(_ForcedPostTransaction);
    public static final PaymentTransactionClassCodeType NonReferencedRefunds = new PaymentTransactionClassCodeType(_NonReferencedRefunds);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static PaymentTransactionClassCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        PaymentTransactionClassCodeType enumeration = (PaymentTransactionClassCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PaymentTransactionClassCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PaymentTransactionClassCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionClassCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
