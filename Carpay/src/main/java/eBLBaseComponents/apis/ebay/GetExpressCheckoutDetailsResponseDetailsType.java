/**
 * GetExpressCheckoutDetailsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetExpressCheckoutDetailsResponseDetailsType  implements java.io.Serializable {
    /* The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						Character length and limitations: 20 single-byte characters */
    private java.lang.String token;

    /* Information about the payer */
    private eBLBaseComponents.apis.ebay.PayerInfoType payerInfo;

    /* A free-form field for your own use, as set by you in the Custom
     * element of SetExpressCheckoutRequest. 
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters */
    private java.lang.String custom;

    /* Your own invoice or tracking number, as set by you in the InvoiceID
     * element of SetExpressCheckoutRequest. 
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String invoiceID;

    /* Payer's contact telephone number. PayPal returns a contact
     * telephone number only if your Merchant account profile settings require
     * that the buyer enter one. */
    private java.lang.String contactPhone;

    private java.lang.Boolean billingAgreementAcceptedStatus;

    private java.lang.String redirectRequired;

    /* Customer's billing address.
     * 
     * 						
     * Optional
     * 
     * 						
     * If you have credit card mapped in your account then billing address
     * of the credit card is returned otherwise your primary address is returned
     * , PayPal returns this address in GetExpressCheckoutDetailsResponse. */
    private eBLBaseComponents.apis.ebay.AddressType billingAddress;

    /* Text note entered by the buyer in PayPal flow. */
    private java.lang.String note;

    /* Returns the status of the EC checkout session.
     * 			Values include 'PaymentActionNotInitiated', 'PaymentActionFailed',
     * 'PaymentActionInProgress', 'PaymentCompleted'. */
    private java.lang.String checkoutStatus;

    /* PayPal may offer a discount or gift certificate to the buyer,
     * which will be represented by a negativeamount. If the buyer has a
     * negative balance, PayPal will add that amount to the current charges,
     * which will be represented as a positive amount. */
    private CoreComponentTypes.apis.ebay.BasicAmountType payPalAdjustment;

    /* Information about the individual purchased items. */
    private eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails;

    /* Information about the user selected options. */
    private eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions;

    /* Information about the incentives that were applied from Ebay
     * RYP page and PayPal RYP page. */
    private eBLBaseComponents.apis.ebay.IncentiveDetailsType[] incentiveDetails;

    /* Information about the Gift message. */
    private java.lang.String giftMessage;

    /* Information about the Gift receipt enable. */
    private java.lang.String giftReceiptEnable;

    /* Information about the Gift Wrap name. */
    private java.lang.String giftWrapName;

    /* Information about the Gift Wrap amount. */
    private CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount;

    /* Information about the Buyer marketing email. */
    private java.lang.String buyerMarketingEmail;

    /* Information about the survey question. */
    private java.lang.String surveyQuestion;

    /* Information about the survey choice selected by the user. */
    private java.lang.String[] surveyChoiceSelected;

    /* Contains payment request information about each bucket in the
     * cart. */
    private eBLBaseComponents.apis.ebay.PaymentRequestInfoType[] paymentRequestInfo;

    /* Response information resulting from opt-in operation or current
     * login bypass status. */
    private eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType externalRememberMeStatusDetails;

    /* Response information resulting from opt-in operation or current
     * login bypass status. */
    private eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType refreshTokenStatusDetails;

    public GetExpressCheckoutDetailsResponseDetailsType() {
    }

    public GetExpressCheckoutDetailsResponseDetailsType(
           java.lang.String token,
           eBLBaseComponents.apis.ebay.PayerInfoType payerInfo,
           java.lang.String custom,
           java.lang.String invoiceID,
           java.lang.String contactPhone,
           java.lang.Boolean billingAgreementAcceptedStatus,
           java.lang.String redirectRequired,
           eBLBaseComponents.apis.ebay.AddressType billingAddress,
           java.lang.String note,
           java.lang.String checkoutStatus,
           CoreComponentTypes.apis.ebay.BasicAmountType payPalAdjustment,
           eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails,
           eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions,
           eBLBaseComponents.apis.ebay.IncentiveDetailsType[] incentiveDetails,
           java.lang.String giftMessage,
           java.lang.String giftReceiptEnable,
           java.lang.String giftWrapName,
           CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount,
           java.lang.String buyerMarketingEmail,
           java.lang.String surveyQuestion,
           java.lang.String[] surveyChoiceSelected,
           eBLBaseComponents.apis.ebay.PaymentRequestInfoType[] paymentRequestInfo,
           eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType externalRememberMeStatusDetails,
           eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType refreshTokenStatusDetails) {
           this.token = token;
           this.payerInfo = payerInfo;
           this.custom = custom;
           this.invoiceID = invoiceID;
           this.contactPhone = contactPhone;
           this.billingAgreementAcceptedStatus = billingAgreementAcceptedStatus;
           this.redirectRequired = redirectRequired;
           this.billingAddress = billingAddress;
           this.note = note;
           this.checkoutStatus = checkoutStatus;
           this.payPalAdjustment = payPalAdjustment;
           this.paymentDetails = paymentDetails;
           this.userSelectedOptions = userSelectedOptions;
           this.incentiveDetails = incentiveDetails;
           this.giftMessage = giftMessage;
           this.giftReceiptEnable = giftReceiptEnable;
           this.giftWrapName = giftWrapName;
           this.giftWrapAmount = giftWrapAmount;
           this.buyerMarketingEmail = buyerMarketingEmail;
           this.surveyQuestion = surveyQuestion;
           this.surveyChoiceSelected = surveyChoiceSelected;
           this.paymentRequestInfo = paymentRequestInfo;
           this.externalRememberMeStatusDetails = externalRememberMeStatusDetails;
           this.refreshTokenStatusDetails = refreshTokenStatusDetails;
    }


    /**
     * Gets the token value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return token   * The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						Character length and limitations: 20 single-byte characters
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param token   * The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						Character length and limitations: 20 single-byte characters
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the payerInfo value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return payerInfo   * Information about the payer
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getPayerInfo() {
        return payerInfo;
    }


    /**
     * Sets the payerInfo value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param payerInfo   * Information about the payer
     */
    public void setPayerInfo(eBLBaseComponents.apis.ebay.PayerInfoType payerInfo) {
        this.payerInfo = payerInfo;
    }


    /**
     * Gets the custom value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return custom   * A free-form field for your own use, as set by you in the Custom
     * element of SetExpressCheckoutRequest. 
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param custom   * A free-form field for your own use, as set by you in the Custom
     * element of SetExpressCheckoutRequest. 
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the invoiceID value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return invoiceID   * Your own invoice or tracking number, as set by you in the InvoiceID
     * element of SetExpressCheckoutRequest. 
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param invoiceID   * Your own invoice or tracking number, as set by you in the InvoiceID
     * element of SetExpressCheckoutRequest. 
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the contactPhone value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return contactPhone   * Payer's contact telephone number. PayPal returns a contact
     * telephone number only if your Merchant account profile settings require
     * that the buyer enter one.
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param contactPhone   * Payer's contact telephone number. PayPal returns a contact
     * telephone number only if your Merchant account profile settings require
     * that the buyer enter one.
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the billingAgreementAcceptedStatus value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return billingAgreementAcceptedStatus
     */
    public java.lang.Boolean getBillingAgreementAcceptedStatus() {
        return billingAgreementAcceptedStatus;
    }


    /**
     * Sets the billingAgreementAcceptedStatus value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param billingAgreementAcceptedStatus
     */
    public void setBillingAgreementAcceptedStatus(java.lang.Boolean billingAgreementAcceptedStatus) {
        this.billingAgreementAcceptedStatus = billingAgreementAcceptedStatus;
    }


    /**
     * Gets the redirectRequired value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return redirectRequired
     */
    public java.lang.String getRedirectRequired() {
        return redirectRequired;
    }


    /**
     * Sets the redirectRequired value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param redirectRequired
     */
    public void setRedirectRequired(java.lang.String redirectRequired) {
        this.redirectRequired = redirectRequired;
    }


    /**
     * Gets the billingAddress value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return billingAddress   * Customer's billing address.
     * 
     * 						
     * Optional
     * 
     * 						
     * If you have credit card mapped in your account then billing address
     * of the credit card is returned otherwise your primary address is returned
     * , PayPal returns this address in GetExpressCheckoutDetailsResponse.
     */
    public eBLBaseComponents.apis.ebay.AddressType getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param billingAddress   * Customer's billing address.
     * 
     * 						
     * Optional
     * 
     * 						
     * If you have credit card mapped in your account then billing address
     * of the credit card is returned otherwise your primary address is returned
     * , PayPal returns this address in GetExpressCheckoutDetailsResponse.
     */
    public void setBillingAddress(eBLBaseComponents.apis.ebay.AddressType billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the note value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return note   * Text note entered by the buyer in PayPal flow.
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param note   * Text note entered by the buyer in PayPal flow.
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the checkoutStatus value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return checkoutStatus   * Returns the status of the EC checkout session.
     * 			Values include 'PaymentActionNotInitiated', 'PaymentActionFailed',
     * 'PaymentActionInProgress', 'PaymentCompleted'.
     */
    public java.lang.String getCheckoutStatus() {
        return checkoutStatus;
    }


    /**
     * Sets the checkoutStatus value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param checkoutStatus   * Returns the status of the EC checkout session.
     * 			Values include 'PaymentActionNotInitiated', 'PaymentActionFailed',
     * 'PaymentActionInProgress', 'PaymentCompleted'.
     */
    public void setCheckoutStatus(java.lang.String checkoutStatus) {
        this.checkoutStatus = checkoutStatus;
    }


    /**
     * Gets the payPalAdjustment value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return payPalAdjustment   * PayPal may offer a discount or gift certificate to the buyer,
     * which will be represented by a negativeamount. If the buyer has a
     * negative balance, PayPal will add that amount to the current charges,
     * which will be represented as a positive amount.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getPayPalAdjustment() {
        return payPalAdjustment;
    }


    /**
     * Sets the payPalAdjustment value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param payPalAdjustment   * PayPal may offer a discount or gift certificate to the buyer,
     * which will be represented by a negativeamount. If the buyer has a
     * negative balance, PayPal will add that amount to the current charges,
     * which will be represented as a positive amount.
     */
    public void setPayPalAdjustment(CoreComponentTypes.apis.ebay.BasicAmountType payPalAdjustment) {
        this.payPalAdjustment = payPalAdjustment;
    }


    /**
     * Gets the paymentDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return paymentDetails   * Information about the individual purchased items.
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsType[] getPaymentDetails() {
        return paymentDetails;
    }


    /**
     * Sets the paymentDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param paymentDetails   * Information about the individual purchased items.
     */
    public void setPaymentDetails(eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public eBLBaseComponents.apis.ebay.PaymentDetailsType getPaymentDetails(int i) {
        return this.paymentDetails[i];
    }

    public void setPaymentDetails(int i, eBLBaseComponents.apis.ebay.PaymentDetailsType _value) {
        this.paymentDetails[i] = _value;
    }


    /**
     * Gets the userSelectedOptions value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return userSelectedOptions   * Information about the user selected options.
     */
    public eBLBaseComponents.apis.ebay.UserSelectedOptionType getUserSelectedOptions() {
        return userSelectedOptions;
    }


    /**
     * Sets the userSelectedOptions value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param userSelectedOptions   * Information about the user selected options.
     */
    public void setUserSelectedOptions(eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions) {
        this.userSelectedOptions = userSelectedOptions;
    }


    /**
     * Gets the incentiveDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return incentiveDetails   * Information about the incentives that were applied from Ebay
     * RYP page and PayPal RYP page.
     */
    public eBLBaseComponents.apis.ebay.IncentiveDetailsType[] getIncentiveDetails() {
        return incentiveDetails;
    }


    /**
     * Sets the incentiveDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param incentiveDetails   * Information about the incentives that were applied from Ebay
     * RYP page and PayPal RYP page.
     */
    public void setIncentiveDetails(eBLBaseComponents.apis.ebay.IncentiveDetailsType[] incentiveDetails) {
        this.incentiveDetails = incentiveDetails;
    }

    public eBLBaseComponents.apis.ebay.IncentiveDetailsType getIncentiveDetails(int i) {
        return this.incentiveDetails[i];
    }

    public void setIncentiveDetails(int i, eBLBaseComponents.apis.ebay.IncentiveDetailsType _value) {
        this.incentiveDetails[i] = _value;
    }


    /**
     * Gets the giftMessage value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return giftMessage   * Information about the Gift message.
     */
    public java.lang.String getGiftMessage() {
        return giftMessage;
    }


    /**
     * Sets the giftMessage value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param giftMessage   * Information about the Gift message.
     */
    public void setGiftMessage(java.lang.String giftMessage) {
        this.giftMessage = giftMessage;
    }


    /**
     * Gets the giftReceiptEnable value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return giftReceiptEnable   * Information about the Gift receipt enable.
     */
    public java.lang.String getGiftReceiptEnable() {
        return giftReceiptEnable;
    }


    /**
     * Sets the giftReceiptEnable value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param giftReceiptEnable   * Information about the Gift receipt enable.
     */
    public void setGiftReceiptEnable(java.lang.String giftReceiptEnable) {
        this.giftReceiptEnable = giftReceiptEnable;
    }


    /**
     * Gets the giftWrapName value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return giftWrapName   * Information about the Gift Wrap name.
     */
    public java.lang.String getGiftWrapName() {
        return giftWrapName;
    }


    /**
     * Sets the giftWrapName value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param giftWrapName   * Information about the Gift Wrap name.
     */
    public void setGiftWrapName(java.lang.String giftWrapName) {
        this.giftWrapName = giftWrapName;
    }


    /**
     * Gets the giftWrapAmount value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public void setGiftWrapAmount(CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the buyerMarketingEmail value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return buyerMarketingEmail   * Information about the Buyer marketing email.
     */
    public java.lang.String getBuyerMarketingEmail() {
        return buyerMarketingEmail;
    }


    /**
     * Sets the buyerMarketingEmail value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param buyerMarketingEmail   * Information about the Buyer marketing email.
     */
    public void setBuyerMarketingEmail(java.lang.String buyerMarketingEmail) {
        this.buyerMarketingEmail = buyerMarketingEmail;
    }


    /**
     * Gets the surveyQuestion value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return surveyQuestion   * Information about the survey question.
     */
    public java.lang.String getSurveyQuestion() {
        return surveyQuestion;
    }


    /**
     * Sets the surveyQuestion value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param surveyQuestion   * Information about the survey question.
     */
    public void setSurveyQuestion(java.lang.String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }


    /**
     * Gets the surveyChoiceSelected value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return surveyChoiceSelected   * Information about the survey choice selected by the user.
     */
    public java.lang.String[] getSurveyChoiceSelected() {
        return surveyChoiceSelected;
    }


    /**
     * Sets the surveyChoiceSelected value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param surveyChoiceSelected   * Information about the survey choice selected by the user.
     */
    public void setSurveyChoiceSelected(java.lang.String[] surveyChoiceSelected) {
        this.surveyChoiceSelected = surveyChoiceSelected;
    }

    public java.lang.String getSurveyChoiceSelected(int i) {
        return this.surveyChoiceSelected[i];
    }

    public void setSurveyChoiceSelected(int i, java.lang.String _value) {
        this.surveyChoiceSelected[i] = _value;
    }


    /**
     * Gets the paymentRequestInfo value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return paymentRequestInfo   * Contains payment request information about each bucket in the
     * cart.
     */
    public eBLBaseComponents.apis.ebay.PaymentRequestInfoType[] getPaymentRequestInfo() {
        return paymentRequestInfo;
    }


    /**
     * Sets the paymentRequestInfo value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param paymentRequestInfo   * Contains payment request information about each bucket in the
     * cart.
     */
    public void setPaymentRequestInfo(eBLBaseComponents.apis.ebay.PaymentRequestInfoType[] paymentRequestInfo) {
        this.paymentRequestInfo = paymentRequestInfo;
    }

    public eBLBaseComponents.apis.ebay.PaymentRequestInfoType getPaymentRequestInfo(int i) {
        return this.paymentRequestInfo[i];
    }

    public void setPaymentRequestInfo(int i, eBLBaseComponents.apis.ebay.PaymentRequestInfoType _value) {
        this.paymentRequestInfo[i] = _value;
    }


    /**
     * Gets the externalRememberMeStatusDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return externalRememberMeStatusDetails   * Response information resulting from opt-in operation or current
     * login bypass status.
     */
    public eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType getExternalRememberMeStatusDetails() {
        return externalRememberMeStatusDetails;
    }


    /**
     * Sets the externalRememberMeStatusDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param externalRememberMeStatusDetails   * Response information resulting from opt-in operation or current
     * login bypass status.
     */
    public void setExternalRememberMeStatusDetails(eBLBaseComponents.apis.ebay.ExternalRememberMeStatusDetailsType externalRememberMeStatusDetails) {
        this.externalRememberMeStatusDetails = externalRememberMeStatusDetails;
    }


    /**
     * Gets the refreshTokenStatusDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @return refreshTokenStatusDetails   * Response information resulting from opt-in operation or current
     * login bypass status.
     */
    public eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType getRefreshTokenStatusDetails() {
        return refreshTokenStatusDetails;
    }


    /**
     * Sets the refreshTokenStatusDetails value for this GetExpressCheckoutDetailsResponseDetailsType.
     * 
     * @param refreshTokenStatusDetails   * Response information resulting from opt-in operation or current
     * login bypass status.
     */
    public void setRefreshTokenStatusDetails(eBLBaseComponents.apis.ebay.RefreshTokenStatusDetailsType refreshTokenStatusDetails) {
        this.refreshTokenStatusDetails = refreshTokenStatusDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExpressCheckoutDetailsResponseDetailsType)) return false;
        GetExpressCheckoutDetailsResponseDetailsType other = (GetExpressCheckoutDetailsResponseDetailsType) obj;
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
            ((this.payerInfo==null && other.getPayerInfo()==null) || 
             (this.payerInfo!=null &&
              this.payerInfo.equals(other.getPayerInfo()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone()))) &&
            ((this.billingAgreementAcceptedStatus==null && other.getBillingAgreementAcceptedStatus()==null) || 
             (this.billingAgreementAcceptedStatus!=null &&
              this.billingAgreementAcceptedStatus.equals(other.getBillingAgreementAcceptedStatus()))) &&
            ((this.redirectRequired==null && other.getRedirectRequired()==null) || 
             (this.redirectRequired!=null &&
              this.redirectRequired.equals(other.getRedirectRequired()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.checkoutStatus==null && other.getCheckoutStatus()==null) || 
             (this.checkoutStatus!=null &&
              this.checkoutStatus.equals(other.getCheckoutStatus()))) &&
            ((this.payPalAdjustment==null && other.getPayPalAdjustment()==null) || 
             (this.payPalAdjustment!=null &&
              this.payPalAdjustment.equals(other.getPayPalAdjustment()))) &&
            ((this.paymentDetails==null && other.getPaymentDetails()==null) || 
             (this.paymentDetails!=null &&
              java.util.Arrays.equals(this.paymentDetails, other.getPaymentDetails()))) &&
            ((this.userSelectedOptions==null && other.getUserSelectedOptions()==null) || 
             (this.userSelectedOptions!=null &&
              this.userSelectedOptions.equals(other.getUserSelectedOptions()))) &&
            ((this.incentiveDetails==null && other.getIncentiveDetails()==null) || 
             (this.incentiveDetails!=null &&
              java.util.Arrays.equals(this.incentiveDetails, other.getIncentiveDetails()))) &&
            ((this.giftMessage==null && other.getGiftMessage()==null) || 
             (this.giftMessage!=null &&
              this.giftMessage.equals(other.getGiftMessage()))) &&
            ((this.giftReceiptEnable==null && other.getGiftReceiptEnable()==null) || 
             (this.giftReceiptEnable!=null &&
              this.giftReceiptEnable.equals(other.getGiftReceiptEnable()))) &&
            ((this.giftWrapName==null && other.getGiftWrapName()==null) || 
             (this.giftWrapName!=null &&
              this.giftWrapName.equals(other.getGiftWrapName()))) &&
            ((this.giftWrapAmount==null && other.getGiftWrapAmount()==null) || 
             (this.giftWrapAmount!=null &&
              this.giftWrapAmount.equals(other.getGiftWrapAmount()))) &&
            ((this.buyerMarketingEmail==null && other.getBuyerMarketingEmail()==null) || 
             (this.buyerMarketingEmail!=null &&
              this.buyerMarketingEmail.equals(other.getBuyerMarketingEmail()))) &&
            ((this.surveyQuestion==null && other.getSurveyQuestion()==null) || 
             (this.surveyQuestion!=null &&
              this.surveyQuestion.equals(other.getSurveyQuestion()))) &&
            ((this.surveyChoiceSelected==null && other.getSurveyChoiceSelected()==null) || 
             (this.surveyChoiceSelected!=null &&
              java.util.Arrays.equals(this.surveyChoiceSelected, other.getSurveyChoiceSelected()))) &&
            ((this.paymentRequestInfo==null && other.getPaymentRequestInfo()==null) || 
             (this.paymentRequestInfo!=null &&
              java.util.Arrays.equals(this.paymentRequestInfo, other.getPaymentRequestInfo()))) &&
            ((this.externalRememberMeStatusDetails==null && other.getExternalRememberMeStatusDetails()==null) || 
             (this.externalRememberMeStatusDetails!=null &&
              this.externalRememberMeStatusDetails.equals(other.getExternalRememberMeStatusDetails()))) &&
            ((this.refreshTokenStatusDetails==null && other.getRefreshTokenStatusDetails()==null) || 
             (this.refreshTokenStatusDetails!=null &&
              this.refreshTokenStatusDetails.equals(other.getRefreshTokenStatusDetails())));
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
        if (getPayerInfo() != null) {
            _hashCode += getPayerInfo().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        if (getBillingAgreementAcceptedStatus() != null) {
            _hashCode += getBillingAgreementAcceptedStatus().hashCode();
        }
        if (getRedirectRequired() != null) {
            _hashCode += getRedirectRequired().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getCheckoutStatus() != null) {
            _hashCode += getCheckoutStatus().hashCode();
        }
        if (getPayPalAdjustment() != null) {
            _hashCode += getPayPalAdjustment().hashCode();
        }
        if (getPaymentDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserSelectedOptions() != null) {
            _hashCode += getUserSelectedOptions().hashCode();
        }
        if (getIncentiveDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncentiveDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncentiveDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftMessage() != null) {
            _hashCode += getGiftMessage().hashCode();
        }
        if (getGiftReceiptEnable() != null) {
            _hashCode += getGiftReceiptEnable().hashCode();
        }
        if (getGiftWrapName() != null) {
            _hashCode += getGiftWrapName().hashCode();
        }
        if (getGiftWrapAmount() != null) {
            _hashCode += getGiftWrapAmount().hashCode();
        }
        if (getBuyerMarketingEmail() != null) {
            _hashCode += getBuyerMarketingEmail().hashCode();
        }
        if (getSurveyQuestion() != null) {
            _hashCode += getSurveyQuestion().hashCode();
        }
        if (getSurveyChoiceSelected() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurveyChoiceSelected());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurveyChoiceSelected(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentRequestInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentRequestInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentRequestInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalRememberMeStatusDetails() != null) {
            _hashCode += getExternalRememberMeStatusDetails().hashCode();
        }
        if (getRefreshTokenStatusDetails() != null) {
            _hashCode += getRefreshTokenStatusDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExpressCheckoutDetailsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetExpressCheckoutDetailsResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ContactPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementAcceptedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementAcceptedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectRequired");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedirectRequired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkoutStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CheckoutStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayPalAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userSelectedOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserSelectedOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftReceiptEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftReceiptEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftWrapName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftWrapName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftWrapAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftWrapAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerMarketingEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerMarketingEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyQuestion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SurveyQuestion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyChoiceSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SurveyChoiceSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentRequestInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeStatusDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeStatusDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeStatusDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refreshTokenStatusDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefreshTokenStatusDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefreshTokenStatusDetailsType"));
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
