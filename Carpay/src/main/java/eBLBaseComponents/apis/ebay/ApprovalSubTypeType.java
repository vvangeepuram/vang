/**
 * ApprovalSubTypeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ApprovalSubTypeType implements java.io.Serializable {
    private org.apache.axis.types.Token _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApprovalSubTypeType(org.apache.axis.types.Token value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final org.apache.axis.types.Token _None = new org.apache.axis.types.Token("None");
    public static final org.apache.axis.types.Token _MerchantInitiatedBilling = new org.apache.axis.types.Token("MerchantInitiatedBilling");
    public static final org.apache.axis.types.Token _MerchantInitiatedBillingSingleAgreement = new org.apache.axis.types.Token("MerchantInitiatedBillingSingleAgreement");
    public static final org.apache.axis.types.Token _ChannelInitiatedBilling = new org.apache.axis.types.Token("ChannelInitiatedBilling");
    public static final ApprovalSubTypeType None = new ApprovalSubTypeType(_None);
    public static final ApprovalSubTypeType MerchantInitiatedBilling = new ApprovalSubTypeType(_MerchantInitiatedBilling);
    public static final ApprovalSubTypeType MerchantInitiatedBillingSingleAgreement = new ApprovalSubTypeType(_MerchantInitiatedBillingSingleAgreement);
    public static final ApprovalSubTypeType ChannelInitiatedBilling = new ApprovalSubTypeType(_ChannelInitiatedBilling);
    public org.apache.axis.types.Token getValue() { return _value_;}
    public static ApprovalSubTypeType fromValue(org.apache.axis.types.Token value)
          throws java.lang.IllegalArgumentException {
        ApprovalSubTypeType enumeration = (ApprovalSubTypeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApprovalSubTypeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApprovalSubTypeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ApprovalSubTypeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
