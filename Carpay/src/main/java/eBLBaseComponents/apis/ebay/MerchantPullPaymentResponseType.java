/**
 * MerchantPullPaymentResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * MerchantPullPaymentResponseType
 * 				Response data from the merchant pull.
 */
public class MerchantPullPaymentResponseType  implements java.io.Serializable {
    /* information about the customer */
    private eBLBaseComponents.apis.ebay.PayerInfoType payerInfo;

    /* Information about the transaction */
    private eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo;

    /* Specific information about the preapproved payment */
    private eBLBaseComponents.apis.ebay.MerchantPullInfoType merchantPullInfo;

    public MerchantPullPaymentResponseType() {
    }

    public MerchantPullPaymentResponseType(
           eBLBaseComponents.apis.ebay.PayerInfoType payerInfo,
           eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo,
           eBLBaseComponents.apis.ebay.MerchantPullInfoType merchantPullInfo) {
           this.payerInfo = payerInfo;
           this.paymentInfo = paymentInfo;
           this.merchantPullInfo = merchantPullInfo;
    }


    /**
     * Gets the payerInfo value for this MerchantPullPaymentResponseType.
     * 
     * @return payerInfo   * information about the customer
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getPayerInfo() {
        return payerInfo;
    }


    /**
     * Sets the payerInfo value for this MerchantPullPaymentResponseType.
     * 
     * @param payerInfo   * information about the customer
     */
    public void setPayerInfo(eBLBaseComponents.apis.ebay.PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }


    /**
     * Gets the paymentInfo value for this MerchantPullPaymentResponseType.
     * 
     * @return paymentInfo   * Information about the transaction
     */
    public eBLBaseComponents.apis.ebay.PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this MerchantPullPaymentResponseType.
     * 
     * @param paymentInfo   * Information about the transaction
     */
    public void setPaymentInfo(eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the merchantPullInfo value for this MerchantPullPaymentResponseType.
     * 
     * @return merchantPullInfo   * Specific information about the preapproved payment
     */
    public eBLBaseComponents.apis.ebay.MerchantPullInfoType getMerchantPullInfo() {
        return merchantPullInfo;
    }


    /**
     * Sets the merchantPullInfo value for this MerchantPullPaymentResponseType.
     * 
     * @param merchantPullInfo   * Specific information about the preapproved payment
     */
    public void setMerchantPullInfo(eBLBaseComponents.apis.ebay.MerchantPullInfoType merchantPullInfo) {
        this.merchantPullInfo = merchantPullInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantPullPaymentResponseType)) return false;
        MerchantPullPaymentResponseType other = (MerchantPullPaymentResponseType) obj;
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
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo()))) &&
            ((this.merchantPullInfo==null && other.getMerchantPullInfo()==null) || 
             (this.merchantPullInfo!=null &&
              this.merchantPullInfo.equals(other.getMerchantPullInfo())));
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
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        if (getMerchantPullInfo() != null) {
            _hashCode += getMerchantPullInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantPullPaymentResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantPullInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullInfoType"));
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
