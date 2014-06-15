/**
 * GetBillingAgreementCustomerDetailsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetBillingAgreementCustomerDetailsResponseDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.PayerInfoType payerInfo;

    /* Customer's billing address.
     * 
     * 						
     * Optional
     * 
     * 						
     * If you have a credit card mapped in your PayPal account, PayPal returns
     * the billing address of the credit billing address otherwise your primary
     * address as billing address in GetBillingAgreementCustomerDetails. */
    private eBLBaseComponents.apis.ebay.AddressType billingAddress;

    public GetBillingAgreementCustomerDetailsResponseDetailsType() {
    }

    public GetBillingAgreementCustomerDetailsResponseDetailsType(
           eBLBaseComponents.apis.ebay.PayerInfoType payerInfo,
           eBLBaseComponents.apis.ebay.AddressType billingAddress) {
           this.payerInfo = payerInfo;
           this.billingAddress = billingAddress;
    }


    /**
     * Gets the payerInfo value for this GetBillingAgreementCustomerDetailsResponseDetailsType.
     * 
     * @return payerInfo
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getPayerInfo() {
        return payerInfo;
    }


    /**
     * Sets the payerInfo value for this GetBillingAgreementCustomerDetailsResponseDetailsType.
     * 
     * @param payerInfo
     */
    public void setPayerInfo(eBLBaseComponents.apis.ebay.PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }


    /**
     * Gets the billingAddress value for this GetBillingAgreementCustomerDetailsResponseDetailsType.
     * 
     * @return billingAddress   * Customer's billing address.
     * 
     * 						
     * Optional
     * 
     * 						
     * If you have a credit card mapped in your PayPal account, PayPal returns
     * the billing address of the credit billing address otherwise your primary
     * address as billing address in GetBillingAgreementCustomerDetails.
     */
    public eBLBaseComponents.apis.ebay.AddressType getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this GetBillingAgreementCustomerDetailsResponseDetailsType.
     * 
     * @param billingAddress   * Customer's billing address.
     * 
     * 						
     * Optional
     * 
     * 						
     * If you have a credit card mapped in your PayPal account, PayPal returns
     * the billing address of the credit billing address otherwise your primary
     * address as billing address in GetBillingAgreementCustomerDetails.
     */
    public void setBillingAddress(eBLBaseComponents.apis.ebay.AddressType billingAddress) {
        this.billingAddress = billingAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBillingAgreementCustomerDetailsResponseDetailsType)) return false;
        GetBillingAgreementCustomerDetailsResponseDetailsType other = (GetBillingAgreementCustomerDetailsResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payerInfo==null && other.getPayerInfo()==null) || 
             (this.payerInfo!=null &&
              this.payerInfo.equals(other.getPayerInfo()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress())));
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
        if (getPayerInfo() != null) {
            _hashCode += getPayerInfo().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBillingAgreementCustomerDetailsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetBillingAgreementCustomerDetailsResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
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
