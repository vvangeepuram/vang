/**
 * AuthorizationInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Authorization details
 */
public class AuthorizationInfoType  implements java.io.Serializable {
    /* The status of the payment:
     * 
     * 						
     * Pending: The payment is pending. See "PendingReason" for more information. */
    private eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus;

    /* The reason the payment is pending:
     * none: No pending reason
     * 
     * 						
     * address: The payment is pending because your customer did not include
     * a confirmed shipping address and your Payment Receiving Preferences
     * is set such that you want to manually accept or deny each of these
     * payments. To change your preference, go to the Preferences section
     * of your Profile.
     * 
     * 						
     * authorization: The authorization is pending at time of creation if
     * payment is not under review
     * 
     * 						
     * echeck: The payment is pending because it was made by an eCheck that
     * has not yet cleared.
     * 
     * 						
     * intl: The payment is pending because you hold a non-U.S. account and
     * do not have a withdrawal mechanism. You must manually accept or deny
     * this payment from your Account Overview.
     * 
     * 						
     * multi-currency: You do not have a balance in the currency sent, and
     * you do not have your Payment Receiving Preferences set to automatically
     * convert and accept this payment. You must manually accept or deny
     * this payment.
     * 
     * 						
     * unilateral: The payment is pending because it was made to an email
     * address that is not yet registered or confirmed.
     * 
     * 						
     * upgrade: The payment is pending because it was made via credit card
     * and you must upgrade your account to Business or Premier status in
     * order to receive the funds. upgrade can also mean that you have reached
     * the monthly limit for transactions on your account.
     * 
     * 						
     * verify: The payment is pending because you are not yet verified. You
     * must verify your account before you can accept this payment.
     * 
     * 						
     * payment_review: The payment is pending because it is under payment
     * review.
     * 
     * 						
     * other: The payment is pending for a reason other than those listed
     * above. For more information, contact PayPal Customer Service. */
    private eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason;

    /* Protection Eligibility for this Transaction - None, SPP or
     * ESPP */
    private java.lang.String protectionEligibility;

    /* Protection Eligibility Type  for this Transaction */
    private java.lang.String protectionEligibilityType;

    public AuthorizationInfoType() {
    }

    public AuthorizationInfoType(
           eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus,
           eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason,
           java.lang.String protectionEligibility,
           java.lang.String protectionEligibilityType) {
           this.paymentStatus = paymentStatus;
           this.pendingReason = pendingReason;
           this.protectionEligibility = protectionEligibility;
           this.protectionEligibilityType = protectionEligibilityType;
    }


    /**
     * Gets the paymentStatus value for this AuthorizationInfoType.
     * 
     * @return paymentStatus   * The status of the payment:
     * 
     * 						
     * Pending: The payment is pending. See "PendingReason" for more information.
     */
    public eBLBaseComponents.apis.ebay.PaymentStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this AuthorizationInfoType.
     * 
     * @param paymentStatus   * The status of the payment:
     * 
     * 						
     * Pending: The payment is pending. See "PendingReason" for more information.
     */
    public void setPaymentStatus(eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the pendingReason value for this AuthorizationInfoType.
     * 
     * @return pendingReason   * The reason the payment is pending:
     * none: No pending reason
     * 
     * 						
     * address: The payment is pending because your customer did not include
     * a confirmed shipping address and your Payment Receiving Preferences
     * is set such that you want to manually accept or deny each of these
     * payments. To change your preference, go to the Preferences section
     * of your Profile.
     * 
     * 						
     * authorization: The authorization is pending at time of creation if
     * payment is not under review
     * 
     * 						
     * echeck: The payment is pending because it was made by an eCheck that
     * has not yet cleared.
     * 
     * 						
     * intl: The payment is pending because you hold a non-U.S. account and
     * do not have a withdrawal mechanism. You must manually accept or deny
     * this payment from your Account Overview.
     * 
     * 						
     * multi-currency: You do not have a balance in the currency sent, and
     * you do not have your Payment Receiving Preferences set to automatically
     * convert and accept this payment. You must manually accept or deny
     * this payment.
     * 
     * 						
     * unilateral: The payment is pending because it was made to an email
     * address that is not yet registered or confirmed.
     * 
     * 						
     * upgrade: The payment is pending because it was made via credit card
     * and you must upgrade your account to Business or Premier status in
     * order to receive the funds. upgrade can also mean that you have reached
     * the monthly limit for transactions on your account.
     * 
     * 						
     * verify: The payment is pending because you are not yet verified. You
     * must verify your account before you can accept this payment.
     * 
     * 						
     * payment_review: The payment is pending because it is under payment
     * review.
     * 
     * 						
     * other: The payment is pending for a reason other than those listed
     * above. For more information, contact PayPal Customer Service.
     */
    public eBLBaseComponents.apis.ebay.PendingStatusCodeType getPendingReason() {
        return pendingReason;
    }


    /**
     * Sets the pendingReason value for this AuthorizationInfoType.
     * 
     * @param pendingReason   * The reason the payment is pending:
     * none: No pending reason
     * 
     * 						
     * address: The payment is pending because your customer did not include
     * a confirmed shipping address and your Payment Receiving Preferences
     * is set such that you want to manually accept or deny each of these
     * payments. To change your preference, go to the Preferences section
     * of your Profile.
     * 
     * 						
     * authorization: The authorization is pending at time of creation if
     * payment is not under review
     * 
     * 						
     * echeck: The payment is pending because it was made by an eCheck that
     * has not yet cleared.
     * 
     * 						
     * intl: The payment is pending because you hold a non-U.S. account and
     * do not have a withdrawal mechanism. You must manually accept or deny
     * this payment from your Account Overview.
     * 
     * 						
     * multi-currency: You do not have a balance in the currency sent, and
     * you do not have your Payment Receiving Preferences set to automatically
     * convert and accept this payment. You must manually accept or deny
     * this payment.
     * 
     * 						
     * unilateral: The payment is pending because it was made to an email
     * address that is not yet registered or confirmed.
     * 
     * 						
     * upgrade: The payment is pending because it was made via credit card
     * and you must upgrade your account to Business or Premier status in
     * order to receive the funds. upgrade can also mean that you have reached
     * the monthly limit for transactions on your account.
     * 
     * 						
     * verify: The payment is pending because you are not yet verified. You
     * must verify your account before you can accept this payment.
     * 
     * 						
     * payment_review: The payment is pending because it is under payment
     * review.
     * 
     * 						
     * other: The payment is pending for a reason other than those listed
     * above. For more information, contact PayPal Customer Service.
     */
    public void setPendingReason(eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason) {
        this.pendingReason = pendingReason;
    }


    /**
     * Gets the protectionEligibility value for this AuthorizationInfoType.
     * 
     * @return protectionEligibility   * Protection Eligibility for this Transaction - None, SPP or
     * ESPP
     */
    public java.lang.String getProtectionEligibility() {
        return protectionEligibility;
    }


    /**
     * Sets the protectionEligibility value for this AuthorizationInfoType.
     * 
     * @param protectionEligibility   * Protection Eligibility for this Transaction - None, SPP or
     * ESPP
     */
    public void setProtectionEligibility(java.lang.String protectionEligibility) {
        this.protectionEligibility = protectionEligibility;
    }


    /**
     * Gets the protectionEligibilityType value for this AuthorizationInfoType.
     * 
     * @return protectionEligibilityType   * Protection Eligibility Type  for this Transaction
     */
    public java.lang.String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }


    /**
     * Sets the protectionEligibilityType value for this AuthorizationInfoType.
     * 
     * @param protectionEligibilityType   * Protection Eligibility Type  for this Transaction
     */
    public void setProtectionEligibilityType(java.lang.String protectionEligibilityType) {
        this.protectionEligibilityType = protectionEligibilityType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuthorizationInfoType)) return false;
        AuthorizationInfoType other = (AuthorizationInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.pendingReason==null && other.getPendingReason()==null) || 
             (this.pendingReason!=null &&
              this.pendingReason.equals(other.getPendingReason()))) &&
            ((this.protectionEligibility==null && other.getProtectionEligibility()==null) || 
             (this.protectionEligibility!=null &&
              this.protectionEligibility.equals(other.getProtectionEligibility()))) &&
            ((this.protectionEligibilityType==null && other.getProtectionEligibilityType()==null) || 
             (this.protectionEligibilityType!=null &&
              this.protectionEligibilityType.equals(other.getProtectionEligibilityType())));
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
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getPendingReason() != null) {
            _hashCode += getPendingReason().hashCode();
        }
        if (getProtectionEligibility() != null) {
            _hashCode += getProtectionEligibility().hashCode();
        }
        if (getProtectionEligibilityType() != null) {
            _hashCode += getProtectionEligibilityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuthorizationInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentStatusCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PendingStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProtectionEligibility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protectionEligibilityType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProtectionEligibilityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
