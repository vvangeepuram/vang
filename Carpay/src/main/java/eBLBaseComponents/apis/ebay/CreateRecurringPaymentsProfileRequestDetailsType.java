/**
 * CreateRecurringPaymentsProfileRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class CreateRecurringPaymentsProfileRequestDetailsType  implements java.io.Serializable {
    /* Billing Agreement token (required if Express Checkout) */
    private java.lang.String token;

    /* Information about the credit card to be charged (required if
     * Direct Payment) */
    private eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard;

    /* Customer Information for this Recurring Payments */
    private eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails;

    /* Schedule Information for this Recurring Payments */
    private eBLBaseComponents.apis.ebay.ScheduleDetailsType scheduleDetails;

    /* Information about the Item Details. */
    private eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem;

    public CreateRecurringPaymentsProfileRequestDetailsType() {
    }

    public CreateRecurringPaymentsProfileRequestDetailsType(
           java.lang.String token,
           eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard,
           eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails,
           eBLBaseComponents.apis.ebay.ScheduleDetailsType scheduleDetails,
           eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem) {
           this.token = token;
           this.creditCard = creditCard;
           this.recurringPaymentsProfileDetails = recurringPaymentsProfileDetails;
           this.scheduleDetails = scheduleDetails;
           this.paymentDetailsItem = paymentDetailsItem;
    }


    /**
     * Gets the token value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return token   * Billing Agreement token (required if Express Checkout)
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param token   * Billing Agreement token (required if Express Checkout)
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the creditCard value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return creditCard   * Information about the credit card to be charged (required if
     * Direct Payment)
     */
    public eBLBaseComponents.apis.ebay.CreditCardDetailsType getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param creditCard   * Information about the credit card to be charged (required if
     * Direct Payment)
     */
    public void setCreditCard(eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the recurringPaymentsProfileDetails value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return recurringPaymentsProfileDetails   * Customer Information for this Recurring Payments
     */
    public eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
        return recurringPaymentsProfileDetails;
    }


    /**
     * Sets the recurringPaymentsProfileDetails value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param recurringPaymentsProfileDetails   * Customer Information for this Recurring Payments
     */
    public void setRecurringPaymentsProfileDetails(eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails) {
        this.recurringPaymentsProfileDetails = recurringPaymentsProfileDetails;
    }


    /**
     * Gets the scheduleDetails value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return scheduleDetails   * Schedule Information for this Recurring Payments
     */
    public eBLBaseComponents.apis.ebay.ScheduleDetailsType getScheduleDetails() {
        return scheduleDetails;
    }


    /**
     * Sets the scheduleDetails value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param scheduleDetails   * Schedule Information for this Recurring Payments
     */
    public void setScheduleDetails(eBLBaseComponents.apis.ebay.ScheduleDetailsType scheduleDetails) {
        this.scheduleDetails = scheduleDetails;
    }


    /**
     * Gets the paymentDetailsItem value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return paymentDetailsItem   * Information about the Item Details.
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] getPaymentDetailsItem() {
        return paymentDetailsItem;
    }


    /**
     * Sets the paymentDetailsItem value for this CreateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param paymentDetailsItem   * Information about the Item Details.
     */
    public void setPaymentDetailsItem(eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem) {
        this.paymentDetailsItem = paymentDetailsItem;
    }

    public eBLBaseComponents.apis.ebay.PaymentDetailsItemType getPaymentDetailsItem(int i) {
        return this.paymentDetailsItem[i];
    }

    public void setPaymentDetailsItem(int i, eBLBaseComponents.apis.ebay.PaymentDetailsItemType _value) {
        this.paymentDetailsItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateRecurringPaymentsProfileRequestDetailsType)) return false;
        CreateRecurringPaymentsProfileRequestDetailsType other = (CreateRecurringPaymentsProfileRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.recurringPaymentsProfileDetails==null && other.getRecurringPaymentsProfileDetails()==null) || 
             (this.recurringPaymentsProfileDetails!=null &&
              this.recurringPaymentsProfileDetails.equals(other.getRecurringPaymentsProfileDetails()))) &&
            ((this.scheduleDetails==null && other.getScheduleDetails()==null) || 
             (this.scheduleDetails!=null &&
              this.scheduleDetails.equals(other.getScheduleDetails()))) &&
            ((this.paymentDetailsItem==null && other.getPaymentDetailsItem()==null) || 
             (this.paymentDetailsItem!=null &&
              java.util.Arrays.equals(this.paymentDetailsItem, other.getPaymentDetailsItem())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getRecurringPaymentsProfileDetails() != null) {
            _hashCode += getRecurringPaymentsProfileDetails().hashCode();
        }
        if (getScheduleDetails() != null) {
            _hashCode += getScheduleDetails().hashCode();
        }
        if (getPaymentDetailsItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentDetailsItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentDetailsItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateRecurringPaymentsProfileRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringPaymentsProfileDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ScheduleDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ScheduleDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDetailsItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
