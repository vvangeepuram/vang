/**
 * DoDirectPaymentRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoDirectPaymentRequestDetailsType  implements java.io.Serializable {
    /* How you want to obtain payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     * 
     * 						
     * NOTE: Order is not allowed for Direct Payment.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters */
    private eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction;

    /* Information about the payment */
    private eBLBaseComponents.apis.ebay.PaymentDetailsType paymentDetails;

    /* Information about the credit card to be charged. */
    private eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard;

    /* IP address of the payer's browser as recorded in its HTTP request
     * to your website. PayPal records this IP addresses as a means to detect
     * possible fraud. 
     * 
     * 						
     * 						
     * 						
     * 						Character length and limitations: 15 single-byte characters,
     * including periods, in dotted-quad format: ???.???.???.??? */
    private java.lang.String IPAddress;

    /* Your customer session identification token. PayPal records
     * this optional session identification token as an additional means
     * to detect possible fraud. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 64 single-byte numeric characters */
    private java.lang.String merchantSessionId;

    private java.lang.Boolean returnFMFDetails;

    public DoDirectPaymentRequestDetailsType() {
    }

    public DoDirectPaymentRequestDetailsType(
           eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction,
           eBLBaseComponents.apis.ebay.PaymentDetailsType paymentDetails,
           eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard,
           java.lang.String IPAddress,
           java.lang.String merchantSessionId,
           java.lang.Boolean returnFMFDetails) {
           this.paymentAction = paymentAction;
           this.paymentDetails = paymentDetails;
           this.creditCard = creditCard;
           this.IPAddress = IPAddress;
           this.merchantSessionId = merchantSessionId;
           this.returnFMFDetails = returnFMFDetails;
    }


    /**
     * Gets the paymentAction value for this DoDirectPaymentRequestDetailsType.
     * 
     * @return paymentAction   * How you want to obtain payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     * 
     * 						
     * NOTE: Order is not allowed for Direct Payment.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters
     */
    public eBLBaseComponents.apis.ebay.PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }


    /**
     * Sets the paymentAction value for this DoDirectPaymentRequestDetailsType.
     * 
     * @param paymentAction   * How you want to obtain payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     * 
     * 						
     * NOTE: Order is not allowed for Direct Payment.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters
     */
    public void setPaymentAction(eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction) {
        this.paymentAction = paymentAction;
    }


    /**
     * Gets the paymentDetails value for this DoDirectPaymentRequestDetailsType.
     * 
     * @return paymentDetails   * Information about the payment
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsType getPaymentDetails() {
        return paymentDetails;
    }


    /**
     * Sets the paymentDetails value for this DoDirectPaymentRequestDetailsType.
     * 
     * @param paymentDetails   * Information about the payment
     */
    public void setPaymentDetails(eBLBaseComponents.apis.ebay.PaymentDetailsType paymentDetails) {
        this.paymentDetails = paymentDetails;
    }


    /**
     * Gets the creditCard value for this DoDirectPaymentRequestDetailsType.
     * 
     * @return creditCard   * Information about the credit card to be charged.
     */
    public eBLBaseComponents.apis.ebay.CreditCardDetailsType getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this DoDirectPaymentRequestDetailsType.
     * 
     * @param creditCard   * Information about the credit card to be charged.
     */
    public void setCreditCard(eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the IPAddress value for this DoDirectPaymentRequestDetailsType.
     * 
     * @return IPAddress   * IP address of the payer's browser as recorded in its HTTP request
     * to your website. PayPal records this IP addresses as a means to detect
     * possible fraud. 
     * 
     * 						
     * 						
     * 						
     * 						Character length and limitations: 15 single-byte characters,
     * including periods, in dotted-quad format: ???.???.???.???
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this DoDirectPaymentRequestDetailsType.
     * 
     * @param IPAddress   * IP address of the payer's browser as recorded in its HTTP request
     * to your website. PayPal records this IP addresses as a means to detect
     * possible fraud. 
     * 
     * 						
     * 						
     * 						
     * 						Character length and limitations: 15 single-byte characters,
     * including periods, in dotted-quad format: ???.???.???.???
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the merchantSessionId value for this DoDirectPaymentRequestDetailsType.
     * 
     * @return merchantSessionId   * Your customer session identification token. PayPal records
     * this optional session identification token as an additional means
     * to detect possible fraud. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 64 single-byte numeric characters
     */
    public java.lang.String getMerchantSessionId() {
        return merchantSessionId;
    }


    /**
     * Sets the merchantSessionId value for this DoDirectPaymentRequestDetailsType.
     * 
     * @param merchantSessionId   * Your customer session identification token. PayPal records
     * this optional session identification token as an additional means
     * to detect possible fraud. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 64 single-byte numeric characters
     */
    public void setMerchantSessionId(java.lang.String merchantSessionId) {
        this.merchantSessionId = merchantSessionId;
    }


    /**
     * Gets the returnFMFDetails value for this DoDirectPaymentRequestDetailsType.
     * 
     * @return returnFMFDetails
     */
    public java.lang.Boolean getReturnFMFDetails() {
        return returnFMFDetails;
    }


    /**
     * Sets the returnFMFDetails value for this DoDirectPaymentRequestDetailsType.
     * 
     * @param returnFMFDetails
     */
    public void setReturnFMFDetails(java.lang.Boolean returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoDirectPaymentRequestDetailsType)) return false;
        DoDirectPaymentRequestDetailsType other = (DoDirectPaymentRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentAction==null && other.getPaymentAction()==null) || 
             (this.paymentAction!=null &&
              this.paymentAction.equals(other.getPaymentAction()))) &&
            ((this.paymentDetails==null && other.getPaymentDetails()==null) || 
             (this.paymentDetails!=null &&
              this.paymentDetails.equals(other.getPaymentDetails()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress()))) &&
            ((this.merchantSessionId==null && other.getMerchantSessionId()==null) || 
             (this.merchantSessionId!=null &&
              this.merchantSessionId.equals(other.getMerchantSessionId()))) &&
            ((this.returnFMFDetails==null && other.getReturnFMFDetails()==null) || 
             (this.returnFMFDetails!=null &&
              this.returnFMFDetails.equals(other.getReturnFMFDetails())));
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
        if (getPaymentAction() != null) {
            _hashCode += getPaymentAction().hashCode();
        }
        if (getPaymentDetails() != null) {
            _hashCode += getPaymentDetails().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        if (getMerchantSessionId() != null) {
            _hashCode += getMerchantSessionId().hashCode();
        }
        if (getReturnFMFDetails() != null) {
            _hashCode += getReturnFMFDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoDirectPaymentRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoDirectPaymentRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentActionCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantSessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantSessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnFMFDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReturnFMFDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
