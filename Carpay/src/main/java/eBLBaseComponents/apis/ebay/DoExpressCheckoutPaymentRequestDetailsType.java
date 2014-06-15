/**
 * DoExpressCheckoutPaymentRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class DoExpressCheckoutPaymentRequestDetailsType  implements java.io.Serializable {
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
     * Order indicates that this payment is is an order authorization subject
     * to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     * 
     * 						
     * IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters */
    private eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction;

    /* The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 20 single-byte characters */
    private java.lang.String token;

    /* Encrypted PayPal customer account identification number as
     * returned by GetExpressCheckoutDetailsResponse. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 127 single-byte characters. */
    private java.lang.String payerID;

    /* URL on Merchant site pertaining to this invoice. */
    private java.lang.String orderURL;

    /* Unique id for each API request to prevent duplicate payments
     * on merchant side. Passed directly back to merchant in response.
     * 					
     * 					
     * 					
     * 					Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    /* Information about the payment */
    private eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails;

    /* Flag to indicate if previously set promoCode shall be overriden.
     * Value 1 indicates overriding. */
    private java.lang.String promoOverrideFlag;

    /* Promotional financing code for item. Overrides any previous
     * PromoCode setting. */
    private java.lang.String promoCode;

    /* Contains data for enhanced data like Airline Itinerary Data. */
    private eBLBaseComponents.apis.ebay.EnhancedDataType enhancedData;

    /* Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored. */
    private java.lang.String softDescriptor;

    /* Information about the user selected options. */
    private eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions;

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

    /* An identification code for use by third-party applications
     * to identify transactions. 
     * 						
     * 							
     * 								Optional
     * 							
     * 						
     * 						Character length and limitations: 32 single-byte alphanumeric
     * characters */
    private java.lang.String buttonSource;

    /* Merchant specified flag which indicates whether to create billing
     * agreement as part of DoEC or not. */
    private java.lang.Boolean skipBACreation;

    /* Merchant specified flag which indicates to use payment details
     * from session if available. */
    private java.lang.String useSessionPaymentDetails;

    /* Optional element that defines relationship between buckets */
    private eBLBaseComponents.apis.ebay.CoupledBucketsType[] coupledBuckets;

    public DoExpressCheckoutPaymentRequestDetailsType() {
    }

    public DoExpressCheckoutPaymentRequestDetailsType(
           eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction,
           java.lang.String token,
           java.lang.String payerID,
           java.lang.String orderURL,
           java.lang.String msgSubID,
           eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails,
           java.lang.String promoOverrideFlag,
           java.lang.String promoCode,
           eBLBaseComponents.apis.ebay.EnhancedDataType enhancedData,
           java.lang.String softDescriptor,
           eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions,
           java.lang.String giftMessage,
           java.lang.String giftReceiptEnable,
           java.lang.String giftWrapName,
           CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount,
           java.lang.String buyerMarketingEmail,
           java.lang.String surveyQuestion,
           java.lang.String[] surveyChoiceSelected,
           java.lang.String buttonSource,
           java.lang.Boolean skipBACreation,
           java.lang.String useSessionPaymentDetails,
           eBLBaseComponents.apis.ebay.CoupledBucketsType[] coupledBuckets) {
           this.paymentAction = paymentAction;
           this.token = token;
           this.payerID = payerID;
           this.orderURL = orderURL;
           this.msgSubID = msgSubID;
           this.paymentDetails = paymentDetails;
           this.promoOverrideFlag = promoOverrideFlag;
           this.promoCode = promoCode;
           this.enhancedData = enhancedData;
           this.softDescriptor = softDescriptor;
           this.userSelectedOptions = userSelectedOptions;
           this.giftMessage = giftMessage;
           this.giftReceiptEnable = giftReceiptEnable;
           this.giftWrapName = giftWrapName;
           this.giftWrapAmount = giftWrapAmount;
           this.buyerMarketingEmail = buyerMarketingEmail;
           this.surveyQuestion = surveyQuestion;
           this.surveyChoiceSelected = surveyChoiceSelected;
           this.buttonSource = buttonSource;
           this.skipBACreation = skipBACreation;
           this.useSessionPaymentDetails = useSessionPaymentDetails;
           this.coupledBuckets = coupledBuckets;
    }


    /**
     * Gets the paymentAction value for this DoExpressCheckoutPaymentRequestDetailsType.
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
     * Order indicates that this payment is is an order authorization subject
     * to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     * 
     * 						
     * IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters
     */
    public eBLBaseComponents.apis.ebay.PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }


    /**
     * Sets the paymentAction value for this DoExpressCheckoutPaymentRequestDetailsType.
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
     * Order indicates that this payment is is an order authorization subject
     * to settlement with PayPal Authorization and Capture.
     * 
     * 						
     * Sale indicates that this is a final sale for which you are requesting
     * payment.
     * 
     * 						
     * IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters
     */
    public void setPaymentAction(eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction) {
        this.paymentAction = paymentAction;
    }


    /**
     * Gets the token value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return token   * The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 20 single-byte characters
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param token   * The timestamped token value that was returned by SetExpressCheckoutResponse
     * and passed on GetExpressCheckoutDetailsRequest. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 20 single-byte characters
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the payerID value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return payerID   * Encrypted PayPal customer account identification number as
     * returned by GetExpressCheckoutDetailsResponse. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 127 single-byte characters.
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param payerID   * Encrypted PayPal customer account identification number as
     * returned by GetExpressCheckoutDetailsResponse. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 127 single-byte characters.
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }


    /**
     * Gets the orderURL value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return orderURL   * URL on Merchant site pertaining to this invoice.
     */
    public java.lang.String getOrderURL() {
        return orderURL;
    }


    /**
     * Sets the orderURL value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param orderURL   * URL on Merchant site pertaining to this invoice.
     */
    public void setOrderURL(java.lang.String orderURL) {
        this.orderURL = orderURL;
    }


    /**
     * Gets the msgSubID value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return msgSubID   * Unique id for each API request to prevent duplicate payments
     * on merchant side. Passed directly back to merchant in response.
     * 					
     * 					
     * 					
     * 					Character length and limits: 38 single-byte characters maximum.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param msgSubID   * Unique id for each API request to prevent duplicate payments
     * on merchant side. Passed directly back to merchant in response.
     * 					
     * 					
     * 					
     * 					Character length and limits: 38 single-byte characters maximum.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the paymentDetails value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return paymentDetails   * Information about the payment
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsType[] getPaymentDetails() {
        return paymentDetails;
    }


    /**
     * Sets the paymentDetails value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param paymentDetails   * Information about the payment
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
     * Gets the promoOverrideFlag value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return promoOverrideFlag   * Flag to indicate if previously set promoCode shall be overriden.
     * Value 1 indicates overriding.
     */
    public java.lang.String getPromoOverrideFlag() {
        return promoOverrideFlag;
    }


    /**
     * Sets the promoOverrideFlag value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param promoOverrideFlag   * Flag to indicate if previously set promoCode shall be overriden.
     * Value 1 indicates overriding.
     */
    public void setPromoOverrideFlag(java.lang.String promoOverrideFlag) {
        this.promoOverrideFlag = promoOverrideFlag;
    }


    /**
     * Gets the promoCode value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return promoCode   * Promotional financing code for item. Overrides any previous
     * PromoCode setting.
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param promoCode   * Promotional financing code for item. Overrides any previous
     * PromoCode setting.
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the enhancedData value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return enhancedData   * Contains data for enhanced data like Airline Itinerary Data.
     */
    public eBLBaseComponents.apis.ebay.EnhancedDataType getEnhancedData() {
        return enhancedData;
    }


    /**
     * Sets the enhancedData value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param enhancedData   * Contains data for enhanced data like Airline Itinerary Data.
     */
    public void setEnhancedData(eBLBaseComponents.apis.ebay.EnhancedDataType enhancedData) {
        this.enhancedData = enhancedData;
    }


    /**
     * Gets the softDescriptor value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return softDescriptor   * Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored.
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param softDescriptor   * Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored.
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the userSelectedOptions value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return userSelectedOptions   * Information about the user selected options.
     */
    public eBLBaseComponents.apis.ebay.UserSelectedOptionType getUserSelectedOptions() {
        return userSelectedOptions;
    }


    /**
     * Sets the userSelectedOptions value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param userSelectedOptions   * Information about the user selected options.
     */
    public void setUserSelectedOptions(eBLBaseComponents.apis.ebay.UserSelectedOptionType userSelectedOptions) {
        this.userSelectedOptions = userSelectedOptions;
    }


    /**
     * Gets the giftMessage value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return giftMessage   * Information about the Gift message.
     */
    public java.lang.String getGiftMessage() {
        return giftMessage;
    }


    /**
     * Sets the giftMessage value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param giftMessage   * Information about the Gift message.
     */
    public void setGiftMessage(java.lang.String giftMessage) {
        this.giftMessage = giftMessage;
    }


    /**
     * Gets the giftReceiptEnable value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return giftReceiptEnable   * Information about the Gift receipt enable.
     */
    public java.lang.String getGiftReceiptEnable() {
        return giftReceiptEnable;
    }


    /**
     * Sets the giftReceiptEnable value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param giftReceiptEnable   * Information about the Gift receipt enable.
     */
    public void setGiftReceiptEnable(java.lang.String giftReceiptEnable) {
        this.giftReceiptEnable = giftReceiptEnable;
    }


    /**
     * Gets the giftWrapName value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return giftWrapName   * Information about the Gift Wrap name.
     */
    public java.lang.String getGiftWrapName() {
        return giftWrapName;
    }


    /**
     * Sets the giftWrapName value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param giftWrapName   * Information about the Gift Wrap name.
     */
    public void setGiftWrapName(java.lang.String giftWrapName) {
        this.giftWrapName = giftWrapName;
    }


    /**
     * Gets the giftWrapAmount value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public void setGiftWrapAmount(CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the buyerMarketingEmail value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return buyerMarketingEmail   * Information about the Buyer marketing email.
     */
    public java.lang.String getBuyerMarketingEmail() {
        return buyerMarketingEmail;
    }


    /**
     * Sets the buyerMarketingEmail value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param buyerMarketingEmail   * Information about the Buyer marketing email.
     */
    public void setBuyerMarketingEmail(java.lang.String buyerMarketingEmail) {
        this.buyerMarketingEmail = buyerMarketingEmail;
    }


    /**
     * Gets the surveyQuestion value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return surveyQuestion   * Information about the survey question.
     */
    public java.lang.String getSurveyQuestion() {
        return surveyQuestion;
    }


    /**
     * Sets the surveyQuestion value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param surveyQuestion   * Information about the survey question.
     */
    public void setSurveyQuestion(java.lang.String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }


    /**
     * Gets the surveyChoiceSelected value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return surveyChoiceSelected   * Information about the survey choice selected by the user.
     */
    public java.lang.String[] getSurveyChoiceSelected() {
        return surveyChoiceSelected;
    }


    /**
     * Sets the surveyChoiceSelected value for this DoExpressCheckoutPaymentRequestDetailsType.
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
     * Gets the buttonSource value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return buttonSource   * An identification code for use by third-party applications
     * to identify transactions. 
     * 						
     * 							
     * 								Optional
     * 							
     * 						
     * 						Character length and limitations: 32 single-byte alphanumeric
     * characters
     */
    public java.lang.String getButtonSource() {
        return buttonSource;
    }


    /**
     * Sets the buttonSource value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param buttonSource   * An identification code for use by third-party applications
     * to identify transactions. 
     * 						
     * 							
     * 								Optional
     * 							
     * 						
     * 						Character length and limitations: 32 single-byte alphanumeric
     * characters
     */
    public void setButtonSource(java.lang.String buttonSource) {
        this.buttonSource = buttonSource;
    }


    /**
     * Gets the skipBACreation value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return skipBACreation   * Merchant specified flag which indicates whether to create billing
     * agreement as part of DoEC or not.
     */
    public java.lang.Boolean getSkipBACreation() {
        return skipBACreation;
    }


    /**
     * Sets the skipBACreation value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param skipBACreation   * Merchant specified flag which indicates whether to create billing
     * agreement as part of DoEC or not.
     */
    public void setSkipBACreation(java.lang.Boolean skipBACreation) {
        this.skipBACreation = skipBACreation;
    }


    /**
     * Gets the useSessionPaymentDetails value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return useSessionPaymentDetails   * Merchant specified flag which indicates to use payment details
     * from session if available.
     */
    public java.lang.String getUseSessionPaymentDetails() {
        return useSessionPaymentDetails;
    }


    /**
     * Sets the useSessionPaymentDetails value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param useSessionPaymentDetails   * Merchant specified flag which indicates to use payment details
     * from session if available.
     */
    public void setUseSessionPaymentDetails(java.lang.String useSessionPaymentDetails) {
        this.useSessionPaymentDetails = useSessionPaymentDetails;
    }


    /**
     * Gets the coupledBuckets value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @return coupledBuckets   * Optional element that defines relationship between buckets
     */
    public eBLBaseComponents.apis.ebay.CoupledBucketsType[] getCoupledBuckets() {
        return coupledBuckets;
    }


    /**
     * Sets the coupledBuckets value for this DoExpressCheckoutPaymentRequestDetailsType.
     * 
     * @param coupledBuckets   * Optional element that defines relationship between buckets
     */
    public void setCoupledBuckets(eBLBaseComponents.apis.ebay.CoupledBucketsType[] coupledBuckets) {
        this.coupledBuckets = coupledBuckets;
    }

    public eBLBaseComponents.apis.ebay.CoupledBucketsType getCoupledBuckets(int i) {
        return this.coupledBuckets[i];
    }

    public void setCoupledBuckets(int i, eBLBaseComponents.apis.ebay.CoupledBucketsType _value) {
        this.coupledBuckets[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoExpressCheckoutPaymentRequestDetailsType)) return false;
        DoExpressCheckoutPaymentRequestDetailsType other = (DoExpressCheckoutPaymentRequestDetailsType) obj;
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
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.payerID==null && other.getPayerID()==null) || 
             (this.payerID!=null &&
              this.payerID.equals(other.getPayerID()))) &&
            ((this.orderURL==null && other.getOrderURL()==null) || 
             (this.orderURL!=null &&
              this.orderURL.equals(other.getOrderURL()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID()))) &&
            ((this.paymentDetails==null && other.getPaymentDetails()==null) || 
             (this.paymentDetails!=null &&
              java.util.Arrays.equals(this.paymentDetails, other.getPaymentDetails()))) &&
            ((this.promoOverrideFlag==null && other.getPromoOverrideFlag()==null) || 
             (this.promoOverrideFlag!=null &&
              this.promoOverrideFlag.equals(other.getPromoOverrideFlag()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.enhancedData==null && other.getEnhancedData()==null) || 
             (this.enhancedData!=null &&
              this.enhancedData.equals(other.getEnhancedData()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.userSelectedOptions==null && other.getUserSelectedOptions()==null) || 
             (this.userSelectedOptions!=null &&
              this.userSelectedOptions.equals(other.getUserSelectedOptions()))) &&
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
            ((this.buttonSource==null && other.getButtonSource()==null) || 
             (this.buttonSource!=null &&
              this.buttonSource.equals(other.getButtonSource()))) &&
            ((this.skipBACreation==null && other.getSkipBACreation()==null) || 
             (this.skipBACreation!=null &&
              this.skipBACreation.equals(other.getSkipBACreation()))) &&
            ((this.useSessionPaymentDetails==null && other.getUseSessionPaymentDetails()==null) || 
             (this.useSessionPaymentDetails!=null &&
              this.useSessionPaymentDetails.equals(other.getUseSessionPaymentDetails()))) &&
            ((this.coupledBuckets==null && other.getCoupledBuckets()==null) || 
             (this.coupledBuckets!=null &&
              java.util.Arrays.equals(this.coupledBuckets, other.getCoupledBuckets())));
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
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        if (getOrderURL() != null) {
            _hashCode += getOrderURL().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
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
        if (getPromoOverrideFlag() != null) {
            _hashCode += getPromoOverrideFlag().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getEnhancedData() != null) {
            _hashCode += getEnhancedData().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getUserSelectedOptions() != null) {
            _hashCode += getUserSelectedOptions().hashCode();
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
        if (getButtonSource() != null) {
            _hashCode += getButtonSource().hashCode();
        }
        if (getSkipBACreation() != null) {
            _hashCode += getSkipBACreation().hashCode();
        }
        if (getUseSessionPaymentDetails() != null) {
            _hashCode += getUseSessionPaymentDetails().hashCode();
        }
        if (getCoupledBuckets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCoupledBuckets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCoupledBuckets(), i);
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
        new org.apache.axis.description.TypeDesc(DoExpressCheckoutPaymentRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentActionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MsgSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("promoOverrideFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromoOverrideFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SoftDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("buttonSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipBACreation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SkipBACreation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSessionPaymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UseSessionPaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coupledBuckets");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledBuckets"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CoupledBucketsType"));
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
