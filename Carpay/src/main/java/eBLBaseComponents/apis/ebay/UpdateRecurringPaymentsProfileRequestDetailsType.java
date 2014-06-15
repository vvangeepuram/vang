/**
 * UpdateRecurringPaymentsProfileRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UpdateRecurringPaymentsProfileRequestDetailsType  implements java.io.Serializable {
    private java.lang.String profileID;

    private java.lang.String note;

    private java.lang.String description;

    private java.lang.String subscriberName;

    private eBLBaseComponents.apis.ebay.AddressType subscriberShippingAddress;

    private java.lang.String profileReference;

    private java.lang.Integer additionalBillingCycles;

    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    private CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType taxAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType outstandingBalance;

    private eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount;

    private java.lang.Integer maxFailedPayments;

    /* Information about the credit card to be charged (required if
     * Direct Payment) */
    private eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard;

    /* When does this Profile begin billing? */
    private java.util.Calendar billingStartDate;

    /* Trial period of this schedule */
    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update trialPeriod;

    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update paymentPeriod;

    public UpdateRecurringPaymentsProfileRequestDetailsType() {
    }

    public UpdateRecurringPaymentsProfileRequestDetailsType(
           java.lang.String profileID,
           java.lang.String note,
           java.lang.String description,
           java.lang.String subscriberName,
           eBLBaseComponents.apis.ebay.AddressType subscriberShippingAddress,
           java.lang.String profileReference,
           java.lang.Integer additionalBillingCycles,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType taxAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType outstandingBalance,
           eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount,
           java.lang.Integer maxFailedPayments,
           eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard,
           java.util.Calendar billingStartDate,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update trialPeriod,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update paymentPeriod) {
           this.profileID = profileID;
           this.note = note;
           this.description = description;
           this.subscriberName = subscriberName;
           this.subscriberShippingAddress = subscriberShippingAddress;
           this.profileReference = profileReference;
           this.additionalBillingCycles = additionalBillingCycles;
           this.amount = amount;
           this.shippingAmount = shippingAmount;
           this.taxAmount = taxAmount;
           this.outstandingBalance = outstandingBalance;
           this.autoBillOutstandingAmount = autoBillOutstandingAmount;
           this.maxFailedPayments = maxFailedPayments;
           this.creditCard = creditCard;
           this.billingStartDate = billingStartDate;
           this.trialPeriod = trialPeriod;
           this.paymentPeriod = paymentPeriod;
    }


    /**
     * Gets the profileID value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return profileID
     */
    public java.lang.String getProfileID() {
        return profileID;
    }


    /**
     * Sets the profileID value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param profileID
     */
    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }


    /**
     * Gets the note value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the description value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the subscriberName value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return subscriberName
     */
    public java.lang.String getSubscriberName() {
        return subscriberName;
    }


    /**
     * Sets the subscriberName value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param subscriberName
     */
    public void setSubscriberName(java.lang.String subscriberName) {
        this.subscriberName = subscriberName;
    }


    /**
     * Gets the subscriberShippingAddress value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return subscriberShippingAddress
     */
    public eBLBaseComponents.apis.ebay.AddressType getSubscriberShippingAddress() {
        return subscriberShippingAddress;
    }


    /**
     * Sets the subscriberShippingAddress value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param subscriberShippingAddress
     */
    public void setSubscriberShippingAddress(eBLBaseComponents.apis.ebay.AddressType subscriberShippingAddress) {
        this.subscriberShippingAddress = subscriberShippingAddress;
    }


    /**
     * Gets the profileReference value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return profileReference
     */
    public java.lang.String getProfileReference() {
        return profileReference;
    }


    /**
     * Sets the profileReference value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param profileReference
     */
    public void setProfileReference(java.lang.String profileReference) {
        this.profileReference = profileReference;
    }


    /**
     * Gets the additionalBillingCycles value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return additionalBillingCycles
     */
    public java.lang.Integer getAdditionalBillingCycles() {
        return additionalBillingCycles;
    }


    /**
     * Sets the additionalBillingCycles value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param additionalBillingCycles
     */
    public void setAdditionalBillingCycles(java.lang.Integer additionalBillingCycles) {
        this.additionalBillingCycles = additionalBillingCycles;
    }


    /**
     * Gets the amount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return amount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param amount
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the shippingAmount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return shippingAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(CoreComponentTypes.apis.ebay.BasicAmountType shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the taxAmount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return taxAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the outstandingBalance value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return outstandingBalance
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getOutstandingBalance() {
        return outstandingBalance;
    }


    /**
     * Sets the outstandingBalance value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param outstandingBalance
     */
    public void setOutstandingBalance(CoreComponentTypes.apis.ebay.BasicAmountType outstandingBalance) {
        this.outstandingBalance = outstandingBalance;
    }


    /**
     * Gets the autoBillOutstandingAmount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return autoBillOutstandingAmount
     */
    public eBLBaseComponents.apis.ebay.AutoBillType getAutoBillOutstandingAmount() {
        return autoBillOutstandingAmount;
    }


    /**
     * Sets the autoBillOutstandingAmount value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param autoBillOutstandingAmount
     */
    public void setAutoBillOutstandingAmount(eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount) {
        this.autoBillOutstandingAmount = autoBillOutstandingAmount;
    }


    /**
     * Gets the maxFailedPayments value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return maxFailedPayments
     */
    public java.lang.Integer getMaxFailedPayments() {
        return maxFailedPayments;
    }


    /**
     * Sets the maxFailedPayments value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param maxFailedPayments
     */
    public void setMaxFailedPayments(java.lang.Integer maxFailedPayments) {
        this.maxFailedPayments = maxFailedPayments;
    }


    /**
     * Gets the creditCard value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return creditCard   * Information about the credit card to be charged (required if
     * Direct Payment)
     */
    public eBLBaseComponents.apis.ebay.CreditCardDetailsType getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param creditCard   * Information about the credit card to be charged (required if
     * Direct Payment)
     */
    public void setCreditCard(eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the billingStartDate value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return billingStartDate   * When does this Profile begin billing?
     */
    public java.util.Calendar getBillingStartDate() {
        return billingStartDate;
    }


    /**
     * Sets the billingStartDate value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param billingStartDate   * When does this Profile begin billing?
     */
    public void setBillingStartDate(java.util.Calendar billingStartDate) {
        this.billingStartDate = billingStartDate;
    }


    /**
     * Gets the trialPeriod value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return trialPeriod   * Trial period of this schedule
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update getTrialPeriod() {
        return trialPeriod;
    }


    /**
     * Sets the trialPeriod value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param trialPeriod   * Trial period of this schedule
     */
    public void setTrialPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update trialPeriod) {
        this.trialPeriod = trialPeriod;
    }


    /**
     * Gets the paymentPeriod value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @return paymentPeriod
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update getPaymentPeriod() {
        return paymentPeriod;
    }


    /**
     * Sets the paymentPeriod value for this UpdateRecurringPaymentsProfileRequestDetailsType.
     * 
     * @param paymentPeriod
     */
    public void setPaymentPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType_Update paymentPeriod) {
        this.paymentPeriod = paymentPeriod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateRecurringPaymentsProfileRequestDetailsType)) return false;
        UpdateRecurringPaymentsProfileRequestDetailsType other = (UpdateRecurringPaymentsProfileRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profileID==null && other.getProfileID()==null) || 
             (this.profileID!=null &&
              this.profileID.equals(other.getProfileID()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.subscriberName==null && other.getSubscriberName()==null) || 
             (this.subscriberName!=null &&
              this.subscriberName.equals(other.getSubscriberName()))) &&
            ((this.subscriberShippingAddress==null && other.getSubscriberShippingAddress()==null) || 
             (this.subscriberShippingAddress!=null &&
              this.subscriberShippingAddress.equals(other.getSubscriberShippingAddress()))) &&
            ((this.profileReference==null && other.getProfileReference()==null) || 
             (this.profileReference!=null &&
              this.profileReference.equals(other.getProfileReference()))) &&
            ((this.additionalBillingCycles==null && other.getAdditionalBillingCycles()==null) || 
             (this.additionalBillingCycles!=null &&
              this.additionalBillingCycles.equals(other.getAdditionalBillingCycles()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.outstandingBalance==null && other.getOutstandingBalance()==null) || 
             (this.outstandingBalance!=null &&
              this.outstandingBalance.equals(other.getOutstandingBalance()))) &&
            ((this.autoBillOutstandingAmount==null && other.getAutoBillOutstandingAmount()==null) || 
             (this.autoBillOutstandingAmount!=null &&
              this.autoBillOutstandingAmount.equals(other.getAutoBillOutstandingAmount()))) &&
            ((this.maxFailedPayments==null && other.getMaxFailedPayments()==null) || 
             (this.maxFailedPayments!=null &&
              this.maxFailedPayments.equals(other.getMaxFailedPayments()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.billingStartDate==null && other.getBillingStartDate()==null) || 
             (this.billingStartDate!=null &&
              this.billingStartDate.equals(other.getBillingStartDate()))) &&
            ((this.trialPeriod==null && other.getTrialPeriod()==null) || 
             (this.trialPeriod!=null &&
              this.trialPeriod.equals(other.getTrialPeriod()))) &&
            ((this.paymentPeriod==null && other.getPaymentPeriod()==null) || 
             (this.paymentPeriod!=null &&
              this.paymentPeriod.equals(other.getPaymentPeriod())));
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
        if (getProfileID() != null) {
            _hashCode += getProfileID().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSubscriberName() != null) {
            _hashCode += getSubscriberName().hashCode();
        }
        if (getSubscriberShippingAddress() != null) {
            _hashCode += getSubscriberShippingAddress().hashCode();
        }
        if (getProfileReference() != null) {
            _hashCode += getProfileReference().hashCode();
        }
        if (getAdditionalBillingCycles() != null) {
            _hashCode += getAdditionalBillingCycles().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getOutstandingBalance() != null) {
            _hashCode += getOutstandingBalance().hashCode();
        }
        if (getAutoBillOutstandingAmount() != null) {
            _hashCode += getAutoBillOutstandingAmount().hashCode();
        }
        if (getMaxFailedPayments() != null) {
            _hashCode += getMaxFailedPayments().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getBillingStartDate() != null) {
            _hashCode += getBillingStartDate().hashCode();
        }
        if (getTrialPeriod() != null) {
            _hashCode += getTrialPeriod().hashCode();
        }
        if (getPaymentPeriod() != null) {
            _hashCode += getPaymentPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateRecurringPaymentsProfileRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UpdateRecurringPaymentsProfileRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriberName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberShippingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscriberShippingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileReference");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalBillingCycles");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalBillingCycles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outstandingBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OutstandingBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFailedPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxFailedPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("billingStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TrialPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType_Update"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType_Update"));
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
