/**
 * DoMobileCheckoutPaymentResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoMobileCheckoutPaymentResponseDetailsType  implements java.io.Serializable {
    /* A free-form field for your own use, such as a tracking number
     * or other value you want returned to you in IPN.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters */
    private java.lang.String custom;

    /* Your own unique invoice or tracking number.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String invoiceID;

    /* Information about the payer */
    private eBLBaseComponents.apis.ebay.PayerInfoType payerInfo;

    /* Information about the transaction */
    private eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo;

    public DoMobileCheckoutPaymentResponseDetailsType() {
    }

    public DoMobileCheckoutPaymentResponseDetailsType(
           java.lang.String custom,
           java.lang.String invoiceID,
           eBLBaseComponents.apis.ebay.PayerInfoType payerInfo,
           eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo) {
           this.custom = custom;
           this.invoiceID = invoiceID;
           this.payerInfo = payerInfo;
           this.paymentInfo = paymentInfo;
    }


    /**
     * Gets the custom value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @return custom   * A free-form field for your own use, such as a tracking number
     * or other value you want returned to you in IPN.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @param custom   * A free-form field for your own use, such as a tracking number
     * or other value you want returned to you in IPN.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the invoiceID value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @return invoiceID   * Your own unique invoice or tracking number.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @param invoiceID   * Your own unique invoice or tracking number.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the payerInfo value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @return payerInfo   * Information about the payer
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getPayerInfo() {
        return payerInfo;
    }


    /**
     * Sets the payerInfo value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @param payerInfo   * Information about the payer
     */
    public void setPayerInfo(eBLBaseComponents.apis.ebay.PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }


    /**
     * Gets the paymentInfo value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @return paymentInfo   * Information about the transaction
     */
    public eBLBaseComponents.apis.ebay.PaymentInfoType getPaymentInfo() {
        return paymentInfo;
    }


    /**
     * Sets the paymentInfo value for this DoMobileCheckoutPaymentResponseDetailsType.
     * 
     * @param paymentInfo   * Information about the transaction
     */
    public void setPaymentInfo(eBLBaseComponents.apis.ebay.PaymentInfoType paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoMobileCheckoutPaymentResponseDetailsType)) return false;
        DoMobileCheckoutPaymentResponseDetailsType other = (DoMobileCheckoutPaymentResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.payerInfo==null && other.getPayerInfo()==null) || 
             (this.payerInfo!=null &&
              this.payerInfo.equals(other.getPayerInfo()))) &&
            ((this.paymentInfo==null && other.getPaymentInfo()==null) || 
             (this.paymentInfo!=null &&
              this.paymentInfo.equals(other.getPaymentInfo())));
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
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getPayerInfo() != null) {
            _hashCode += getPayerInfo().hashCode();
        }
        if (getPaymentInfo() != null) {
            _hashCode += getPaymentInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoMobileCheckoutPaymentResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoMobileCheckoutPaymentResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceID"));
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
        elemField.setFieldName("paymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
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
