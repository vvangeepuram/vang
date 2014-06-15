/**
 * FundingSourceDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class FundingSourceDetailsType  implements java.io.Serializable {
    /* Allowable values: 0,1  
     * 					The value 1 indicates that the customer can accept push funding,
     * and 0 means they cannot.
     * 					Optional
     * 					Character length and limitations: One single-byte numeric character. */
    private java.lang.String allowPushFunding;

    /* Allowable values: ELV, CreditCard, ChinaUnionPay, BML 
     * 					This element could be used to specify the perered funding option
     * 
     * 					for a guest users. It has effect only if LandingPage element
     * is set to Billing. 
     * 					Otherwise it will be ignored. */
    private eBLBaseComponents.apis.ebay.UserSelectedFundingSourceType userSelectedFundingSource;

    public FundingSourceDetailsType() {
    }

    public FundingSourceDetailsType(
           java.lang.String allowPushFunding,
           eBLBaseComponents.apis.ebay.UserSelectedFundingSourceType userSelectedFundingSource) {
           this.allowPushFunding = allowPushFunding;
           this.userSelectedFundingSource = userSelectedFundingSource;
    }


    /**
     * Gets the allowPushFunding value for this FundingSourceDetailsType.
     * 
     * @return allowPushFunding   * Allowable values: 0,1  
     * 					The value 1 indicates that the customer can accept push funding,
     * and 0 means they cannot.
     * 					Optional
     * 					Character length and limitations: One single-byte numeric character.
     */
    public java.lang.String getAllowPushFunding() {
        return allowPushFunding;
    }


    /**
     * Sets the allowPushFunding value for this FundingSourceDetailsType.
     * 
     * @param allowPushFunding   * Allowable values: 0,1  
     * 					The value 1 indicates that the customer can accept push funding,
     * and 0 means they cannot.
     * 					Optional
     * 					Character length and limitations: One single-byte numeric character.
     */
    public void setAllowPushFunding(java.lang.String allowPushFunding) {
        this.allowPushFunding = allowPushFunding;
    }


    /**
     * Gets the userSelectedFundingSource value for this FundingSourceDetailsType.
     * 
     * @return userSelectedFundingSource   * Allowable values: ELV, CreditCard, ChinaUnionPay, BML 
     * 					This element could be used to specify the perered funding option
     * 
     * 					for a guest users. It has effect only if LandingPage element
     * is set to Billing. 
     * 					Otherwise it will be ignored.
     */
    public eBLBaseComponents.apis.ebay.UserSelectedFundingSourceType getUserSelectedFundingSource() {
        return userSelectedFundingSource;
    }


    /**
     * Sets the userSelectedFundingSource value for this FundingSourceDetailsType.
     * 
     * @param userSelectedFundingSource   * Allowable values: ELV, CreditCard, ChinaUnionPay, BML 
     * 					This element could be used to specify the perered funding option
     * 
     * 					for a guest users. It has effect only if LandingPage element
     * is set to Billing. 
     * 					Otherwise it will be ignored.
     */
    public void setUserSelectedFundingSource(eBLBaseComponents.apis.ebay.UserSelectedFundingSourceType userSelectedFundingSource) {
        this.userSelectedFundingSource = userSelectedFundingSource;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FundingSourceDetailsType)) return false;
        FundingSourceDetailsType other = (FundingSourceDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowPushFunding==null && other.getAllowPushFunding()==null) || 
             (this.allowPushFunding!=null &&
              this.allowPushFunding.equals(other.getAllowPushFunding()))) &&
            ((this.userSelectedFundingSource==null && other.getUserSelectedFundingSource()==null) || 
             (this.userSelectedFundingSource!=null &&
              this.userSelectedFundingSource.equals(other.getUserSelectedFundingSource())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAllowPushFunding() != null) {
            _hashCode += getAllowPushFunding().hashCode();
        }
        if (getUserSelectedFundingSource() != null) {
            _hashCode += getUserSelectedFundingSource().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FundingSourceDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FundingSourceDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPushFunding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowPushFunding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSelectedFundingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedFundingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedFundingSourceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
