/**
 * ScheduleDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ScheduleDetailsType  implements java.io.Serializable {
    /* Schedule details for the Recurring Payment */
    private java.lang.String description;

    /* Trial period of this schedule */
    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType trialPeriod;

    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType paymentPeriod;

    /* The max number of payments the buyer can fail before this Recurring
     * Payments profile is cancelled */
    private java.lang.Integer maxFailedPayments;

    private eBLBaseComponents.apis.ebay.ActivationDetailsType activationDetails;

    private eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount;

    public ScheduleDetailsType() {
    }

    public ScheduleDetailsType(
           java.lang.String description,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType trialPeriod,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType paymentPeriod,
           java.lang.Integer maxFailedPayments,
           eBLBaseComponents.apis.ebay.ActivationDetailsType activationDetails,
           eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount) {
           this.description = description;
           this.trialPeriod = trialPeriod;
           this.paymentPeriod = paymentPeriod;
           this.maxFailedPayments = maxFailedPayments;
           this.activationDetails = activationDetails;
           this.autoBillOutstandingAmount = autoBillOutstandingAmount;
    }


    /**
     * Gets the description value for this ScheduleDetailsType.
     * 
     * @return description   * Schedule details for the Recurring Payment
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ScheduleDetailsType.
     * 
     * @param description   * Schedule details for the Recurring Payment
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the trialPeriod value for this ScheduleDetailsType.
     * 
     * @return trialPeriod   * Trial period of this schedule
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType getTrialPeriod() {
        return trialPeriod;
    }


    /**
     * Sets the trialPeriod value for this ScheduleDetailsType.
     * 
     * @param trialPeriod   * Trial period of this schedule
     */
    public void setTrialPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType trialPeriod) {
        this.trialPeriod = trialPeriod;
    }


    /**
     * Gets the paymentPeriod value for this ScheduleDetailsType.
     * 
     * @return paymentPeriod
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType getPaymentPeriod() {
        return paymentPeriod;
    }


    /**
     * Sets the paymentPeriod value for this ScheduleDetailsType.
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }


    /**
     * Gets the maxFailedPayments value for this ScheduleDetailsType.
     * 
     * @return maxFailedPayments   * The max number of payments the buyer can fail before this Recurring
     * Payments profile is cancelled
     */
    public java.lang.Integer getMaxFailedPayments() {
        return maxFailedPayments;
    }


    /**
     * Sets the maxFailedPayments value for this ScheduleDetailsType.
     * 
     * @param maxFailedPayments   * The max number of payments the buyer can fail before this Recurring
     * Payments profile is cancelled
     */
    public void setMaxFailedPayments(java.lang.Integer maxFailedPayments) {
        this.maxFailedPayments = maxFailedPayments;
    }


    /**
     * Gets the activationDetails value for this ScheduleDetailsType.
     * 
     * @return activationDetails
     */
    public eBLBaseComponents.apis.ebay.ActivationDetailsType getActivationDetails() {
        return activationDetails;
    }


    /**
     * Sets the activationDetails value for this ScheduleDetailsType.
     * 
     * @param activationDetails
     */
    public void setActivationDetails(eBLBaseComponents.apis.ebay.ActivationDetailsType activationDetails) {
        this.activationDetails = activationDetails;
    }


    /**
     * Gets the autoBillOutstandingAmount value for this ScheduleDetailsType.
     * 
     * @return autoBillOutstandingAmount
     */
    public eBLBaseComponents.apis.ebay.AutoBillType getAutoBillOutstandingAmount() {
        return autoBillOutstandingAmount;
    }


    /**
     * Sets the autoBillOutstandingAmount value for this ScheduleDetailsType.
     * 
     * @param autoBillOutstandingAmount
     */
    public void setAutoBillOutstandingAmount(eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount) {
        this.autoBillOutstandingAmount = autoBillOutstandingAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleDetailsType)) return false;
        ScheduleDetailsType other = (ScheduleDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.trialPeriod==null && other.getTrialPeriod()==null) || 
             (this.trialPeriod!=null &&
              this.trialPeriod.equals(other.getTrialPeriod()))) &&
            ((this.paymentPeriod==null && other.getPaymentPeriod()==null) || 
             (this.paymentPeriod!=null &&
              this.paymentPeriod.equals(other.getPaymentPeriod()))) &&
            ((this.maxFailedPayments==null && other.getMaxFailedPayments()==null) || 
             (this.maxFailedPayments!=null &&
              this.maxFailedPayments.equals(other.getMaxFailedPayments()))) &&
            ((this.activationDetails==null && other.getActivationDetails()==null) || 
             (this.activationDetails!=null &&
              this.activationDetails.equals(other.getActivationDetails()))) &&
            ((this.autoBillOutstandingAmount==null && other.getAutoBillOutstandingAmount()==null) || 
             (this.autoBillOutstandingAmount!=null &&
              this.autoBillOutstandingAmount.equals(other.getAutoBillOutstandingAmount())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getTrialPeriod() != null) {
            _hashCode += getTrialPeriod().hashCode();
        }
        if (getPaymentPeriod() != null) {
            _hashCode += getPaymentPeriod().hashCode();
        }
        if (getMaxFailedPayments() != null) {
            _hashCode += getMaxFailedPayments().hashCode();
        }
        if (getActivationDetails() != null) {
            _hashCode += getActivationDetails().hashCode();
        }
        if (getAutoBillOutstandingAmount() != null) {
            _hashCode += getAutoBillOutstandingAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ScheduleDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ScheduleDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TrialPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFailedPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxFailedPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ActivationDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ActivationDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoBillOutstandingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoBillOutstandingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoBillType"));
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
