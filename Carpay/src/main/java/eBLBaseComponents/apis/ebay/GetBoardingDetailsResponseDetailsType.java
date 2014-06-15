/**
 * GetBoardingDetailsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetBoardingDetailsResponseDetailsType  implements java.io.Serializable {
    /* Status of merchant's onboarding process:
     * 			
     * 						
     * 			Completed
     * Cancelled
     * Pending
     * 
     * 						Character length and limitations: Eight alphabetic characters */
    private eBLBaseComponents.apis.ebay.BoardingStatusType status;

    /* Date the boarding process started */
    private java.util.Calendar startDate;

    /* Date the merchantâs status or progress was last updated */
    private java.util.Calendar lastUpdated;

    /* Reason for merchantâs cancellation of sign-up.
     * 
     * 						
     * Character length and limitations: 1,024 alphanumeric characters */
    private java.lang.String reason;

    private java.lang.String programName;

    private java.lang.String programCode;

    private java.lang.String campaignID;

    /* Indicates if there is a limitation on the amount of money the
     * business can withdraw from PayPal */
    private eBLBaseComponents.apis.ebay.UserWithdrawalLimitTypeType userWithdrawalLimit;

    /* Custom information you set on the EnterBoarding API call
     * 
     * 						Character length and limitations: 256 alphanumeric characters */
    private java.lang.String partnerCustom;

    /* Details about the owner of the account */
    private eBLBaseComponents.apis.ebay.PayerInfoType accountOwner;

    /* Merchantâs PayPal API credentials */
    private eBLBaseComponents.apis.ebay.APICredentialsType credentials;

    /* The APIs that this merchant has granted the business partner
     * permission to call on his behalf.
     * 
     * 						
     * 						For example:
     * 						
     * SetExpressCheckout,GetExpressCheckoutDetails,DoExpressCheckoutPayment */
    private java.lang.String configureAPIs;

    /* Primary email verification status. Confirmed, Unconfirmed */
    private java.lang.String emailVerificationStatus;

    /* Gives VettingStatus - Pending, Cancelled, Approved, UnderReview
     * 
     * 						Character length and limitations: 256 alphanumeric characters */
    private java.lang.String vettingStatus;

    /* Gives BankAccountVerificationStatus - Added, Confirmed
     * 
     * 						Character length and limitations: 256 alphanumeric characters */
    private java.lang.String bankAccountVerificationStatus;

    public GetBoardingDetailsResponseDetailsType() {
    }

    public GetBoardingDetailsResponseDetailsType(
           eBLBaseComponents.apis.ebay.BoardingStatusType status,
           java.util.Calendar startDate,
           java.util.Calendar lastUpdated,
           java.lang.String reason,
           java.lang.String programName,
           java.lang.String programCode,
           java.lang.String campaignID,
           eBLBaseComponents.apis.ebay.UserWithdrawalLimitTypeType userWithdrawalLimit,
           java.lang.String partnerCustom,
           eBLBaseComponents.apis.ebay.PayerInfoType accountOwner,
           eBLBaseComponents.apis.ebay.APICredentialsType credentials,
           java.lang.String configureAPIs,
           java.lang.String emailVerificationStatus,
           java.lang.String vettingStatus,
           java.lang.String bankAccountVerificationStatus) {
           this.status = status;
           this.startDate = startDate;
           this.lastUpdated = lastUpdated;
           this.reason = reason;
           this.programName = programName;
           this.programCode = programCode;
           this.campaignID = campaignID;
           this.userWithdrawalLimit = userWithdrawalLimit;
           this.partnerCustom = partnerCustom;
           this.accountOwner = accountOwner;
           this.credentials = credentials;
           this.configureAPIs = configureAPIs;
           this.emailVerificationStatus = emailVerificationStatus;
           this.vettingStatus = vettingStatus;
           this.bankAccountVerificationStatus = bankAccountVerificationStatus;
    }


    /**
     * Gets the status value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return status   * Status of merchant's onboarding process:
     * 			
     * 						
     * 			Completed
     * Cancelled
     * Pending
     * 
     * 						Character length and limitations: Eight alphabetic characters
     */
    public eBLBaseComponents.apis.ebay.BoardingStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param status   * Status of merchant's onboarding process:
     * 			
     * 						
     * 			Completed
     * Cancelled
     * Pending
     * 
     * 						Character length and limitations: Eight alphabetic characters
     */
    public void setStatus(eBLBaseComponents.apis.ebay.BoardingStatusType status) {
        this.status = status;
    }


    /**
     * Gets the startDate value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return startDate   * Date the boarding process started
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param startDate   * Date the boarding process started
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the lastUpdated value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return lastUpdated   * Date the merchantâs status or progress was last updated
     */
    public java.util.Calendar getLastUpdated() {
        return lastUpdated;
    }


    /**
     * Sets the lastUpdated value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param lastUpdated   * Date the merchantâs status or progress was last updated
     */
    public void setLastUpdated(java.util.Calendar lastUpdated) {
        this.lastUpdated = lastUpdated;
    }


    /**
     * Gets the reason value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return reason   * Reason for merchantâs cancellation of sign-up.
     * 
     * 						
     * Character length and limitations: 1,024 alphanumeric characters
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param reason   * Reason for merchantâs cancellation of sign-up.
     * 
     * 						
     * Character length and limitations: 1,024 alphanumeric characters
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the programName value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return programName
     */
    public java.lang.String getProgramName() {
        return programName;
    }


    /**
     * Sets the programName value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param programName
     */
    public void setProgramName(java.lang.String programName) {
        this.programName = programName;
    }


    /**
     * Gets the programCode value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return programCode
     */
    public java.lang.String getProgramCode() {
        return programCode;
    }


    /**
     * Sets the programCode value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param programCode
     */
    public void setProgramCode(java.lang.String programCode) {
        this.programCode = programCode;
    }


    /**
     * Gets the campaignID value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return campaignID
     */
    public java.lang.String getCampaignID() {
        return campaignID;
    }


    /**
     * Sets the campaignID value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param campaignID
     */
    public void setCampaignID(java.lang.String campaignID) {
        this.campaignID = campaignID;
    }


    /**
     * Gets the userWithdrawalLimit value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return userWithdrawalLimit   * Indicates if there is a limitation on the amount of money the
     * business can withdraw from PayPal
     */
    public eBLBaseComponents.apis.ebay.UserWithdrawalLimitTypeType getUserWithdrawalLimit() {
        return userWithdrawalLimit;
    }


    /**
     * Sets the userWithdrawalLimit value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param userWithdrawalLimit   * Indicates if there is a limitation on the amount of money the
     * business can withdraw from PayPal
     */
    public void setUserWithdrawalLimit(eBLBaseComponents.apis.ebay.UserWithdrawalLimitTypeType userWithdrawalLimit) {
        this.userWithdrawalLimit = userWithdrawalLimit;
    }


    /**
     * Gets the partnerCustom value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return partnerCustom   * Custom information you set on the EnterBoarding API call
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public java.lang.String getPartnerCustom() {
        return partnerCustom;
    }


    /**
     * Sets the partnerCustom value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param partnerCustom   * Custom information you set on the EnterBoarding API call
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public void setPartnerCustom(java.lang.String partnerCustom) {
        this.partnerCustom = partnerCustom;
    }


    /**
     * Gets the accountOwner value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return accountOwner   * Details about the owner of the account
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getAccountOwner() {
        return accountOwner;
    }


    /**
     * Sets the accountOwner value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param accountOwner   * Details about the owner of the account
     */
    public void setAccountOwner(eBLBaseComponents.apis.ebay.PayerInfoType accountOwner) {
        this.accountOwner = accountOwner;
    }


    /**
     * Gets the credentials value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return credentials   * Merchantâs PayPal API credentials
     */
    public eBLBaseComponents.apis.ebay.APICredentialsType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param credentials   * Merchantâs PayPal API credentials
     */
    public void setCredentials(eBLBaseComponents.apis.ebay.APICredentialsType credentials) {
        this.credentials = credentials;
    }


    /**
     * Gets the configureAPIs value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return configureAPIs   * The APIs that this merchant has granted the business partner
     * permission to call on his behalf.
     * 
     * 						
     * 						For example:
     * 						
     * SetExpressCheckout,GetExpressCheckoutDetails,DoExpressCheckoutPayment
     */
    public java.lang.String getConfigureAPIs() {
        return configureAPIs;
    }


    /**
     * Sets the configureAPIs value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param configureAPIs   * The APIs that this merchant has granted the business partner
     * permission to call on his behalf.
     * 
     * 						
     * 						For example:
     * 						
     * SetExpressCheckout,GetExpressCheckoutDetails,DoExpressCheckoutPayment
     */
    public void setConfigureAPIs(java.lang.String configureAPIs) {
        this.configureAPIs = configureAPIs;
    }


    /**
     * Gets the emailVerificationStatus value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return emailVerificationStatus   * Primary email verification status. Confirmed, Unconfirmed
     */
    public java.lang.String getEmailVerificationStatus() {
        return emailVerificationStatus;
    }


    /**
     * Sets the emailVerificationStatus value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param emailVerificationStatus   * Primary email verification status. Confirmed, Unconfirmed
     */
    public void setEmailVerificationStatus(java.lang.String emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
    }


    /**
     * Gets the vettingStatus value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return vettingStatus   * Gives VettingStatus - Pending, Cancelled, Approved, UnderReview
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public java.lang.String getVettingStatus() {
        return vettingStatus;
    }


    /**
     * Sets the vettingStatus value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param vettingStatus   * Gives VettingStatus - Pending, Cancelled, Approved, UnderReview
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public void setVettingStatus(java.lang.String vettingStatus) {
        this.vettingStatus = vettingStatus;
    }


    /**
     * Gets the bankAccountVerificationStatus value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @return bankAccountVerificationStatus   * Gives BankAccountVerificationStatus - Added, Confirmed
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public java.lang.String getBankAccountVerificationStatus() {
        return bankAccountVerificationStatus;
    }


    /**
     * Sets the bankAccountVerificationStatus value for this GetBoardingDetailsResponseDetailsType.
     * 
     * @param bankAccountVerificationStatus   * Gives BankAccountVerificationStatus - Added, Confirmed
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public void setBankAccountVerificationStatus(java.lang.String bankAccountVerificationStatus) {
        this.bankAccountVerificationStatus = bankAccountVerificationStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBoardingDetailsResponseDetailsType)) return false;
        GetBoardingDetailsResponseDetailsType other = (GetBoardingDetailsResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.lastUpdated==null && other.getLastUpdated()==null) || 
             (this.lastUpdated!=null &&
              this.lastUpdated.equals(other.getLastUpdated()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.programName==null && other.getProgramName()==null) || 
             (this.programName!=null &&
              this.programName.equals(other.getProgramName()))) &&
            ((this.programCode==null && other.getProgramCode()==null) || 
             (this.programCode!=null &&
              this.programCode.equals(other.getProgramCode()))) &&
            ((this.campaignID==null && other.getCampaignID()==null) || 
             (this.campaignID!=null &&
              this.campaignID.equals(other.getCampaignID()))) &&
            ((this.userWithdrawalLimit==null && other.getUserWithdrawalLimit()==null) || 
             (this.userWithdrawalLimit!=null &&
              this.userWithdrawalLimit.equals(other.getUserWithdrawalLimit()))) &&
            ((this.partnerCustom==null && other.getPartnerCustom()==null) || 
             (this.partnerCustom!=null &&
              this.partnerCustom.equals(other.getPartnerCustom()))) &&
            ((this.accountOwner==null && other.getAccountOwner()==null) || 
             (this.accountOwner!=null &&
              this.accountOwner.equals(other.getAccountOwner()))) &&
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials()))) &&
            ((this.configureAPIs==null && other.getConfigureAPIs()==null) || 
             (this.configureAPIs!=null &&
              this.configureAPIs.equals(other.getConfigureAPIs()))) &&
            ((this.emailVerificationStatus==null && other.getEmailVerificationStatus()==null) || 
             (this.emailVerificationStatus!=null &&
              this.emailVerificationStatus.equals(other.getEmailVerificationStatus()))) &&
            ((this.vettingStatus==null && other.getVettingStatus()==null) || 
             (this.vettingStatus!=null &&
              this.vettingStatus.equals(other.getVettingStatus()))) &&
            ((this.bankAccountVerificationStatus==null && other.getBankAccountVerificationStatus()==null) || 
             (this.bankAccountVerificationStatus!=null &&
              this.bankAccountVerificationStatus.equals(other.getBankAccountVerificationStatus())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getLastUpdated() != null) {
            _hashCode += getLastUpdated().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getProgramName() != null) {
            _hashCode += getProgramName().hashCode();
        }
        if (getProgramCode() != null) {
            _hashCode += getProgramCode().hashCode();
        }
        if (getCampaignID() != null) {
            _hashCode += getCampaignID().hashCode();
        }
        if (getUserWithdrawalLimit() != null) {
            _hashCode += getUserWithdrawalLimit().hashCode();
        }
        if (getPartnerCustom() != null) {
            _hashCode += getPartnerCustom().hashCode();
        }
        if (getAccountOwner() != null) {
            _hashCode += getAccountOwner().hashCode();
        }
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        if (getConfigureAPIs() != null) {
            _hashCode += getConfigureAPIs().hashCode();
        }
        if (getEmailVerificationStatus() != null) {
            _hashCode += getEmailVerificationStatus().hashCode();
        }
        if (getVettingStatus() != null) {
            _hashCode += getVettingStatus().hashCode();
        }
        if (getBankAccountVerificationStatus() != null) {
            _hashCode += getBankAccountVerificationStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBoardingDetailsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetBoardingDetailsResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BoardingStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastUpdated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProgramName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProgramCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CampaignID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userWithdrawalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserWithdrawalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserWithdrawalLimitTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PartnerCustom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APICredentialsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configureAPIs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConfigureAPIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailVerificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EmailVerificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vettingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VettingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountVerificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountVerificationStatus"));
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
