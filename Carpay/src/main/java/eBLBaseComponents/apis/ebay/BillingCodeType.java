/**
 * BillingCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BillingCodeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BillingCodeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _None = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _MerchantInitiatedBilling = new org.apache.axis.types.Token("MerchantInitiatedBilling");
    public static final org.apache.axis.types.Token _RecurringPayments = new org.apache.axis.types.Token("RecurringPayments");
    public static final org.apache.axis.types.Token _MerchantInitiatedBillingSingleAgreement = new org.apache.axis.types.Token("MerchantInitiatedBillingSingleAgreement");
    public static final org.apache.axis.types.Token _ChannelInitiatedBilling = new org.apache.axis.types.Token("ChannelInitiatedBilling");
    public static final BillingCodeType None = new BillingCodeType(_None);
    public static final BillingCodeType MerchantInitiatedBilling = new BillingCodeType(_MerchantInitiatedBilling);
    public static final BillingCodeType RecurringPayments = new BillingCodeType(_RecurringPayments);
    public static final BillingCodeType MerchantInitiatedBillingSingleAgreement = new BillingCodeType(_MerchantInitiatedBillingSingleAgreement);
    public static final BillingCodeType ChannelInitiatedBilling = new BillingCodeType(_ChannelInitiatedBilling);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static BillingCodeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        BillingCodeType enumeration = (BillingCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BillingCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BillingCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
