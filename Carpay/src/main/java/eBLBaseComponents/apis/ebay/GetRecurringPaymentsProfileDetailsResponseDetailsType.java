/**
 * GetRecurringPaymentsProfileDetailsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetRecurringPaymentsProfileDetailsResponseDetailsType  implements java.io.Serializable {
    /* Recurring Billing Profile ID */
    private java.lang.String profileID;

    private eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType profileStatus;

    private java.lang.String description;

    private eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount;

    private int maxFailedPayments;

    private eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails;

    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType currentRecurringPaymentsPeriod;

    private eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType recurringPaymentsSummary;

    private eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard;

    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType trialRecurringPaymentsPeriod;

    private eBLBaseComponents.apis.ebay.BillingPeriodDetailsType regularRecurringPaymentsPeriod;

    private CoreComponentTypes.apis.ebay.BasicAmountType trialAmountPaid;

    private CoreComponentTypes.apis.ebay.BasicAmountType regularAmountPaid;

    private CoreComponentTypes.apis.ebay.BasicAmountType aggregateAmount;

    private CoreComponentTypes.apis.ebay.BasicAmountType aggregateOptionalAmount;

    private java.util.Calendar finalPaymentDueDate;

    public GetRecurringPaymentsProfileDetailsResponseDetailsType() {
    }

    public GetRecurringPaymentsProfileDetailsResponseDetailsType(
           java.lang.String profileID,
           eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType profileStatus,
           java.lang.String description,
           eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount,
           int maxFailedPayments,
           eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType currentRecurringPaymentsPeriod,
           eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType recurringPaymentsSummary,
           eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType trialRecurringPaymentsPeriod,
           eBLBaseComponents.apis.ebay.BillingPeriodDetailsType regularRecurringPaymentsPeriod,
           CoreComponentTypes.apis.ebay.BasicAmountType trialAmountPaid,
           CoreComponentTypes.apis.ebay.BasicAmountType regularAmountPaid,
           CoreComponentTypes.apis.ebay.BasicAmountType aggregateAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType aggregateOptionalAmount,
           java.util.Calendar finalPaymentDueDate) {
           this.profileID = profileID;
           this.profileStatus = profileStatus;
           this.description = description;
           this.autoBillOutstandingAmount = autoBillOutstandingAmount;
           this.maxFailedPayments = maxFailedPayments;
           this.recurringPaymentsProfileDetails = recurringPaymentsProfileDetails;
           this.currentRecurringPaymentsPeriod = currentRecurringPaymentsPeriod;
           this.recurringPaymentsSummary = recurringPaymentsSummary;
           this.creditCard = creditCard;
           this.trialRecurringPaymentsPeriod = trialRecurringPaymentsPeriod;
           this.regularRecurringPaymentsPeriod = regularRecurringPaymentsPeriod;
           this.trialAmountPaid = trialAmountPaid;
           this.regularAmountPaid = regularAmountPaid;
           this.aggregateAmount = aggregateAmount;
           this.aggregateOptionalAmount = aggregateOptionalAmount;
           this.finalPaymentDueDate = finalPaymentDueDate;
    }


    /**
     * Gets the profileID value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return profileID   * Recurring Billing Profile ID
     */
    public java.lang.String getProfileID() {
        return profileID;
    }


    /**
     * Sets the profileID value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param profileID   * Recurring Billing Profile ID
     */
    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }


    /**
     * Gets the profileStatus value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return profileStatus
     */
    public eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType getProfileStatus() {
        return profileStatus;
    }


    /**
     * Sets the profileStatus value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param profileStatus
     */
    public void setProfileStatus(eBLBaseComponents.apis.ebay.RecurringPaymentsProfileStatusType profileStatus) {
        this.profileStatus = profileStatus;
    }


    /**
     * Gets the description value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the autoBillOutstandingAmount value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return autoBillOutstandingAmount
     */
    public eBLBaseComponents.apis.ebay.AutoBillType getAutoBillOutstandingAmount() {
        return autoBillOutstandingAmount;
    }


    /**
     * Sets the autoBillOutstandingAmount value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param autoBillOutstandingAmount
     */
    public void setAutoBillOutstandingAmount(eBLBaseComponents.apis.ebay.AutoBillType autoBillOutstandingAmount) {
        this.autoBillOutstandingAmount = autoBillOutstandingAmount;
    }


    /**
     * Gets the maxFailedPayments value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return maxFailedPayments
     */
    public int getMaxFailedPayments() {
        return maxFailedPayments;
    }


    /**
     * Sets the maxFailedPayments value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param maxFailedPayments
     */
    public void setMaxFailedPayments(int maxFailedPayments) {
        this.maxFailedPayments = maxFailedPayments;
    }


    /**
     * Gets the recurringPaymentsProfileDetails value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return recurringPaymentsProfileDetails
     */
    public eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType getRecurringPaymentsProfileDetails() {
        return recurringPaymentsProfileDetails;
    }


    /**
     * Sets the recurringPaymentsProfileDetails value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param recurringPaymentsProfileDetails
     */
    public void setRecurringPaymentsProfileDetails(eBLBaseComponents.apis.ebay.RecurringPaymentsProfileDetailsType recurringPaymentsProfileDetails) {
        this.recurringPaymentsProfileDetails = recurringPaymentsProfileDetails;
    }


    /**
     * Gets the currentRecurringPaymentsPeriod value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return currentRecurringPaymentsPeriod
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType getCurrentRecurringPaymentsPeriod() {
        return currentRecurringPaymentsPeriod;
    }


    /**
     * Sets the currentRecurringPaymentsPeriod value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param currentRecurringPaymentsPeriod
     */
    public void setCurrentRecurringPaymentsPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType currentRecurringPaymentsPeriod) {
        this.currentRecurringPaymentsPeriod = currentRecurringPaymentsPeriod;
    }


    /**
     * Gets the recurringPaymentsSummary value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return recurringPaymentsSummary
     */
    public eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType getRecurringPaymentsSummary() {
        return recurringPaymentsSummary;
    }


    /**
     * Sets the recurringPaymentsSummary value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param recurringPaymentsSummary
     */
    public void setRecurringPaymentsSummary(eBLBaseComponents.apis.ebay.RecurringPaymentsSummaryType recurringPaymentsSummary) {
        this.recurringPaymentsSummary = recurringPaymentsSummary;
    }


    /**
     * Gets the creditCard value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return creditCard
     */
    public eBLBaseComponents.apis.ebay.CreditCardDetailsType getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param creditCard
     */
    public void setCreditCard(eBLBaseComponents.apis.ebay.CreditCardDetailsType creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the trialRecurringPaymentsPeriod value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return trialRecurringPaymentsPeriod
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType getTrialRecurringPaymentsPeriod() {
        return trialRecurringPaymentsPeriod;
    }


    /**
     * Sets the trialRecurringPaymentsPeriod value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param trialRecurringPaymentsPeriod
     */
    public void setTrialRecurringPaymentsPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType trialRecurringPaymentsPeriod) {
        this.trialRecurringPaymentsPeriod = trialRecurringPaymentsPeriod;
    }


    /**
     * Gets the regularRecurringPaymentsPeriod value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return regularRecurringPaymentsPeriod
     */
    public eBLBaseComponents.apis.ebay.BillingPeriodDetailsType getRegularRecurringPaymentsPeriod() {
        return regularRecurringPaymentsPeriod;
    }


    /**
     * Sets the regularRecurringPaymentsPeriod value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param regularRecurringPaymentsPeriod
     */
    public void setRegularRecurringPaymentsPeriod(eBLBaseComponents.apis.ebay.BillingPeriodDetailsType regularRecurringPaymentsPeriod) {
        this.regularRecurringPaymentsPeriod = regularRecurringPaymentsPeriod;
    }


    /**
     * Gets the trialAmountPaid value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return trialAmountPaid
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTrialAmountPaid() {
        return trialAmountPaid;
    }


    /**
     * Sets the trialAmountPaid value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param trialAmountPaid
     */
    public void setTrialAmountPaid(CoreComponentTypes.apis.ebay.BasicAmountType trialAmountPaid) {
        this.trialAmountPaid = trialAmountPaid;
    }


    /**
     * Gets the regularAmountPaid value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return regularAmountPaid
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getRegularAmountPaid() {
        return regularAmountPaid;
    }


    /**
     * Sets the regularAmountPaid value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param regularAmountPaid
     */
    public void setRegularAmountPaid(CoreComponentTypes.apis.ebay.BasicAmountType regularAmountPaid) {
        this.regularAmountPaid = regularAmountPaid;
    }


    /**
     * Gets the aggregateAmount value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return aggregateAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAggregateAmount() {
        return aggregateAmount;
    }


    /**
     * Sets the aggregateAmount value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param aggregateAmount
     */
    public void setAggregateAmount(CoreComponentTypes.apis.ebay.BasicAmountType aggregateAmount) {
        this.aggregateAmount = aggregateAmount;
    }


    /**
     * Gets the aggregateOptionalAmount value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return aggregateOptionalAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAggregateOptionalAmount() {
        return aggregateOptionalAmount;
    }


    /**
     * Sets the aggregateOptionalAmount value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param aggregateOptionalAmount
     */
    public void setAggregateOptionalAmount(CoreComponentTypes.apis.ebay.BasicAmountType aggregateOptionalAmount) {
        this.aggregateOptionalAmount = aggregateOptionalAmount;
    }


    /**
     * Gets the finalPaymentDueDate value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @return finalPaymentDueDate
     */
    public java.util.Calendar getFinalPaymentDueDate() {
        return finalPaymentDueDate;
    }


    /**
     * Sets the finalPaymentDueDate value for this GetRecurringPaymentsProfileDetailsResponseDetailsType.
     * 
     * @param finalPaymentDueDate
     */
    public void setFinalPaymentDueDate(java.util.Calendar finalPaymentDueDate) {
        this.finalPaymentDueDate = finalPaymentDueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRecurringPaymentsProfileDetailsResponseDetailsType)) return false;
        GetRecurringPaymentsProfileDetailsResponseDetailsType other = (GetRecurringPaymentsProfileDetailsResponseDetailsType) obj;
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
            ((this.profileStatus==null && other.getProfileStatus()==null) || 
             (this.profileStatus!=null &&
              this.profileStatus.equals(other.getProfileStatus()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.autoBillOutstandingAmount==null && other.getAutoBillOutstandingAmount()==null) || 
             (this.autoBillOutstandingAmount!=null &&
              this.autoBillOutstandingAmount.equals(other.getAutoBillOutstandingAmount()))) &&
            this.maxFailedPayments == other.getMaxFailedPayments() &&
            ((this.recurringPaymentsProfileDetails==null && other.getRecurringPaymentsProfileDetails()==null) || 
             (this.recurringPaymentsProfileDetails!=null &&
              this.recurringPaymentsProfileDetails.equals(other.getRecurringPaymentsProfileDetails()))) &&
            ((this.currentRecurringPaymentsPeriod==null && other.getCurrentRecurringPaymentsPeriod()==null) || 
             (this.currentRecurringPaymentsPeriod!=null &&
              this.currentRecurringPaymentsPeriod.equals(other.getCurrentRecurringPaymentsPeriod()))) &&
            ((this.recurringPaymentsSummary==null && other.getRecurringPaymentsSummary()==null) || 
             (this.recurringPaymentsSummary!=null &&
              this.recurringPaymentsSummary.equals(other.getRecurringPaymentsSummary()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.trialRecurringPaymentsPeriod==null && other.getTrialRecurringPaymentsPeriod()==null) || 
             (this.trialRecurringPaymentsPeriod!=null &&
              this.trialRecurringPaymentsPeriod.equals(other.getTrialRecurringPaymentsPeriod()))) &&
            ((this.regularRecurringPaymentsPeriod==null && other.getRegularRecurringPaymentsPeriod()==null) || 
             (this.regularRecurringPaymentsPeriod!=null &&
              this.regularRecurringPaymentsPeriod.equals(other.getRegularRecurringPaymentsPeriod()))) &&
            ((this.trialAmountPaid==null && other.getTrialAmountPaid()==null) || 
             (this.trialAmountPaid!=null &&
              this.trialAmountPaid.equals(other.getTrialAmountPaid()))) &&
            ((this.regularAmountPaid==null && other.getRegularAmountPaid()==null) || 
             (this.regularAmountPaid!=null &&
              this.regularAmountPaid.equals(other.getRegularAmountPaid()))) &&
            ((this.aggregateAmount==null && other.getAggregateAmount()==null) || 
             (this.aggregateAmount!=null &&
              this.aggregateAmount.equals(other.getAggregateAmount()))) &&
            ((this.aggregateOptionalAmount==null && other.getAggregateOptionalAmount()==null) || 
             (this.aggregateOptionalAmount!=null &&
              this.aggregateOptionalAmount.equals(other.getAggregateOptionalAmount()))) &&
            ((this.finalPaymentDueDate==null && other.getFinalPaymentDueDate()==null) || 
             (this.finalPaymentDueDate!=null &&
              this.finalPaymentDueDate.equals(other.getFinalPaymentDueDate())));
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
        if (getProfileStatus() != null) {
            _hashCode += getProfileStatus().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getAutoBillOutstandingAmount() != null) {
            _hashCode += getAutoBillOutstandingAmount().hashCode();
        }
        _hashCode += getMaxFailedPayments();
        if (getRecurringPaymentsProfileDetails() != null) {
            _hashCode += getRecurringPaymentsProfileDetails().hashCode();
        }
        if (getCurrentRecurringPaymentsPeriod() != null) {
            _hashCode += getCurrentRecurringPaymentsPeriod().hashCode();
        }
        if (getRecurringPaymentsSummary() != null) {
            _hashCode += getRecurringPaymentsSummary().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getTrialRecurringPaymentsPeriod() != null) {
            _hashCode += getTrialRecurringPaymentsPeriod().hashCode();
        }
        if (getRegularRecurringPaymentsPeriod() != null) {
            _hashCode += getRegularRecurringPaymentsPeriod().hashCode();
        }
        if (getTrialAmountPaid() != null) {
            _hashCode += getTrialAmountPaid().hashCode();
        }
        if (getRegularAmountPaid() != null) {
            _hashCode += getRegularAmountPaid().hashCode();
        }
        if (getAggregateAmount() != null) {
            _hashCode += getAggregateAmount().hashCode();
        }
        if (getAggregateOptionalAmount() != null) {
            _hashCode += getAggregateOptionalAmount().hashCode();
        }
        if (getFinalPaymentDueDate() != null) {
            _hashCode += getFinalPaymentDueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRecurringPaymentsProfileDetailsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetRecurringPaymentsProfileDetailsResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoBillOutstandingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoBillOutstandingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AutoBillType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxFailedPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxFailedPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringPaymentsProfileDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsProfileDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentRecurringPaymentsPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrentRecurringPaymentsPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurringPaymentsSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringPaymentsSummaryType"));
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
        elemField.setFieldName("trialRecurringPaymentsPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TrialRecurringPaymentsPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regularRecurringPaymentsPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RegularRecurringPaymentsPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingPeriodDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trialAmountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TrialAmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regularAmountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RegularAmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AggregateAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aggregateOptionalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AggregateOptionalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalPaymentDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FinalPaymentDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
