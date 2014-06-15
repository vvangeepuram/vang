/**
 * BAUpdateResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BAUpdateResponseDetailsType  implements java.io.Serializable {
    private java.lang.String billingAgreementID;

    private java.lang.String billingAgreementDescription;

    private eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType billingAgreementStatus;

    private java.lang.String billingAgreementCustom;

    private eBLBaseComponents.apis.ebay.PayerInfoType payerInfo;

    private CoreComponentTypes.apis.ebay.BasicAmountType billingAgreementMax;

    /* Customer's billing address.
     * 					
     * 					Optional
     * 					
     * 					If you have credit card mapped in your account then billing address
     * of the 
     * 					credit card is returned otherwise your primary address is returned
     * , PayPal 
     * 					returns this address in BAUpdateResponseDetails. */
    private eBLBaseComponents.apis.ebay.AddressType billingAddress;

    public BAUpdateResponseDetailsType() {
    }

    public BAUpdateResponseDetailsType(
           java.lang.String billingAgreementID,
           java.lang.String billingAgreementDescription,
           eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType billingAgreementStatus,
           java.lang.String billingAgreementCustom,
           eBLBaseComponents.apis.ebay.PayerInfoType payerInfo,
           CoreComponentTypes.apis.ebay.BasicAmountType billingAgreementMax,
           eBLBaseComponents.apis.ebay.AddressType billingAddress) {
           this.billingAgreementID = billingAgreementID;
           this.billingAgreementDescription = billingAgreementDescription;
           this.billingAgreementStatus = billingAgreementStatus;
           this.billingAgreementCustom = billingAgreementCustom;
           this.payerInfo = payerInfo;
           this.billingAgreementMax = billingAgreementMax;
           this.billingAddress = billingAddress;
    }


    /**
     * Gets the billingAgreementID value for this BAUpdateResponseDetailsType.
     * 
     * @return billingAgreementID
     */
    public java.lang.String getBillingAgreementID() {
        return billingAgreementID;
    }


    /**
     * Sets the billingAgreementID value for this BAUpdateResponseDetailsType.
     * 
     * @param billingAgreementID
     */
    public void setBillingAgreementID(java.lang.String billingAgreementID) {
        this.billingAgreementID = billingAgreementID;
    }


    /**
     * Gets the billingAgreementDescription value for this BAUpdateResponseDetailsType.
     * 
     * @return billingAgreementDescription
     */
    public java.lang.String getBillingAgreementDescription() {
        return billingAgreementDescription;
    }


    /**
     * Sets the billingAgreementDescription value for this BAUpdateResponseDetailsType.
     * 
     * @param billingAgreementDescription
     */
    public void setBillingAgreementDescription(java.lang.String billingAgreementDescription) {
        this.billingAgreementDescription = billingAgreementDescription;
    }


    /**
     * Gets the billingAgreementStatus value for this BAUpdateResponseDetailsType.
     * 
     * @return billingAgreementStatus
     */
    public eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType getBillingAgreementStatus() {
        return billingAgreementStatus;
    }


    /**
     * Sets the billingAgreementStatus value for this BAUpdateResponseDetailsType.
     * 
     * @param billingAgreementStatus
     */
    public void setBillingAgreementStatus(eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType billingAgreementStatus) {
        this.billingAgreementStatus = billingAgreementStatus;
    }


    /**
     * Gets the billingAgreementCustom value for this BAUpdateResponseDetailsType.
     * 
     * @return billingAgreementCustom
     */
    public java.lang.String getBillingAgreementCustom() {
        return billingAgreementCustom;
    }


    /**
     * Sets the billingAgreementCustom value for this BAUpdateResponseDetailsType.
     * 
     * @param billingAgreementCustom
     */
    public void setBillingAgreementCustom(java.lang.String billingAgreementCustom) {
        this.billingAgreementCustom = billingAgreementCustom;
    }


    /**
     * Gets the payerInfo value for this BAUpdateResponseDetailsType.
     * 
     * @return payerInfo
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getPayerInfo() {
        return payerInfo;
    }


    /**
     * Sets the payerInfo value for this BAUpdateResponseDetailsType.
     * 
     * @param payerInfo
     */
    public void setPayerInfo(eBLBaseComponents.apis.ebay.PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }


    /**
     * Gets the billingAgreementMax value for this BAUpdateResponseDetailsType.
     * 
     * @return billingAgreementMax
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBillingAgreementMax() {
        return billingAgreementMax;
    }


    /**
     * Sets the billingAgreementMax value for this BAUpdateResponseDetailsType.
     * 
     * @param billingAgreementMax
     */
    public void setBillingAgreementMax(CoreComponentTypes.apis.ebay.BasicAmountType billingAgreementMax) {
        this.billingAgreementMax = billingAgreementMax;
    }


    /**
     * Gets the billingAddress value for this BAUpdateResponseDetailsType.
     * 
     * @return billingAddress   * Customer's billing address.
     * 					
     * 					Optional
     * 					
     * 					If you have credit card mapped in your account then billing address
     * of the 
     * 					credit card is returned otherwise your primary address is returned
     * , PayPal 
     * 					returns this address in BAUpdateResponseDetails.
     */
    public eBLBaseComponents.apis.ebay.AddressType getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this BAUpdateResponseDetailsType.
     * 
     * @param billingAddress   * Customer's billing address.
     * 					
     * 					Optional
     * 					
     * 					If you have credit card mapped in your account then billing address
     * of the 
     * 					credit card is returned otherwise your primary address is returned
     * , PayPal 
     * 					returns this address in BAUpdateResponseDetails.
     */
    public void setBillingAddress(eBLBaseComponents.apis.ebay.AddressType billingAddress) {
        this.billingAddress = billingAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BAUpdateResponseDetailsType)) return false;
        BAUpdateResponseDetailsType other = (BAUpdateResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAgreementID==null && other.getBillingAgreementID()==null) || 
             (this.billingAgreementID!=null &&
              this.billingAgreementID.equals(other.getBillingAgreementID()))) &&
            ((this.billingAgreementDescription==null && other.getBillingAgreementDescription()==null) || 
             (this.billingAgreementDescription!=null &&
              this.billingAgreementDescription.equals(other.getBillingAgreementDescription()))) &&
            ((this.billingAgreementStatus==null && other.getBillingAgreementStatus()==null) || 
             (this.billingAgreementStatus!=null &&
              this.billingAgreementStatus.equals(other.getBillingAgreementStatus()))) &&
            ((this.billingAgreementCustom==null && other.getBillingAgreementCustom()==null) || 
             (this.billingAgreementCustom!=null &&
              this.billingAgreementCustom.equals(other.getBillingAgreementCustom()))) &&
            ((this.payerInfo==null && other.getPayerInfo()==null) || 
             (this.payerInfo!=null &&
              this.payerInfo.equals(other.getPayerInfo()))) &&
            ((this.billingAgreementMax==null && other.getBillingAgreementMax()==null) || 
             (this.billingAgreementMax!=null &&
              this.billingAgreementMax.equals(other.getBillingAgreementMax()))) &&
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
        if (getBillingAgreementID() != null) {
            _hashCode += getBillingAgreementID().hashCode();
        }
        if (getBillingAgreementDescription() != null) {
            _hashCode += getBillingAgreementDescription().hashCode();
        }
        if (getBillingAgreementStatus() != null) {
            _hashCode += getBillingAgreementStatus().hashCode();
        }
        if (getBillingAgreementCustom() != null) {
            _hashCode += getBillingAgreementCustom().hashCode();
        }
        if (getPayerInfo() != null) {
            _hashCode += getPayerInfo().hashCode();
        }
        if (getBillingAgreementMax() != null) {
            _hashCode += getBillingAgreementMax().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BAUpdateResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BAUpdateResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullStatusCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementCustom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementMax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
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
