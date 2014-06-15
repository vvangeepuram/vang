/**
 * SetExpressCheckoutRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetExpressCheckoutRequestDetailsType  implements java.io.Serializable {
    /* The total cost of the order to the customer. If shipping cost
     * and tax charges are known, include them in OrderTotal; if not, OrderTotal
     * should be the current sub-total of the order. 
     * 
     * 						
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType orderTotal;

    /* URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit. */
    private java.lang.String returnURL;

    /* URL to which the customer is returned if he does not approve
     * the use of PayPal to pay you. PayPal recommends that the value of
     * CancelURL be the original page on which the customer chose to pay
     * with PayPal. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit */
    private java.lang.String cancelURL;

    /* Tracking URL for ebay. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit */
    private java.lang.String trackingImageURL;

    /* URL to which the customer's browser is returned after paying
     * with giropay online. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit. */
    private java.lang.String giropaySuccessURL;

    /* URL to which the customer's browser is returned after fail
     * to pay with giropay online. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit. */
    private java.lang.String giropayCancelURL;

    /* URL to which the customer's browser can be returned in the
     * mEFT done page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit. */
    private java.lang.String banktxnPendingURL;

    /* On your first invocation of SetExpressCheckoutRequest, the
     * value of this token is returned by SetExpressCheckoutResponse. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Include this element and its value only if you want to modify an existing
     * checkout session with another invocation of SetExpressCheckoutRequest;
     * for example, if you want the customer to edit his shipping address
     * on PayPal. 
     * 
     * 						
     * Character length and limitations: 20 single-byte characters */
    private java.lang.String token;

    /* The expected maximum total amount of the complete order, including
     * shipping cost and tax charges. 
     * 
     * 						
     * Optional
     * 
     * 						
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType maxAmount;

    /* Description of items the customer is purchasing. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String orderDescription;

    /* A free-form field for your own use, such as a tracking number
     * or other value you want PayPal to return on GetExpressCheckoutDetailsResponse
     * and DoExpressCheckoutPaymentResponse. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters */
    private java.lang.String custom;

    /* Your own unique invoice or tracking number. PayPal returns
     * this value to you on DoExpressCheckoutPaymentResponse. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String invoiceID;

    /* The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Any value
     * other than 1 indicates that the customer's shipping address on file
     * with PayPal need NOT be a confirmed address. Setting this element
     * overrides the setting you have specified in the recipient's Merchant
     * Account Profile. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character. */
    private java.lang.String reqConfirmShipping;

    /* The value 1 indicates that you require that the customer's
     * billing address on file. Setting this element overrides the setting
     * you have specified in Admin.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character. */
    private java.lang.String reqBillingAddress;

    /* The billing address for the buyer.
     * 							
     * 						Optional
     * 							
     * 							
     * 						If you include the BillingAddress element, the AddressType elements
     * are required:
     * 							
     * 							
     * 						Name
     * 							
     * 							
     * 						Street1
     * 							
     * 							
     * 						CityName
     * 							
     * 							
     * 						CountryCode */
    private eBLBaseComponents.apis.ebay.AddressType billingAddress;

    /* The value 1 indicates that on the PayPal pages, no shipping
     * address fields should be displayed whatsoever. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Four single-byte numeric characters. */
    private java.lang.String noShipping;

    /* The value 1 indicates that the PayPal pages should display
     * the shipping address set by you in the Address element on this SetExpressCheckoutRequest,
     * not the shipping address on file with PayPal for this customer. Displaying
     * the PayPal street address on file does not allow the customer to edit
     * that address. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: Four single-byte numeric characters. */
    private java.lang.String addressOverride;

    /* Locale of pages displayed by PayPal during Express Checkout.
     * 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Five single-byte alphabetic characters,
     * upper- or lowercase. 
     * 
     * 						
     * Allowable values: 
     * 
     * AU or en_AU
     * 
     * DE or de_DE
     * 
     * FR or fr_FR
     * 
     * GB or en_GB
     * 
     * IT or it_IT
     * 
     * JP or ja_JP
     * 
     * US or en_US */
    private java.lang.String localeCode;

    /* Sets the Custom Payment Page Style for payment pages associated
     * with this button/link. PageStyle corresponds to the HTML variable
     * page_style for customizing payment pages. The value is the same as
     * the Page Style Name you chose when adding or editing the page style
     * from the Profile subtab of the My Account tab of your PayPal account.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 30 single-byte alphabetic
     * characters. */
    private java.lang.String pageStyle;

    /* A URL for the image you want to appear at the top left of the
     * payment page. The image has a maximum size of 750 pixels wide by 90
     * pixels high. PayPal recommends that you provide an image that is stored
     * on a secure (https) server. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 */
    private java.lang.String cppHeaderImage;

    /* Sets the border color around the header of the payment page.
     * The border is a 2-pixel perimeter around the header space, which is
     * 750 pixels wide by 90 pixels high. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String cppHeaderBorderColor;

    /* Sets the background color for the header of the payment page.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String cppHeaderBackColor;

    /* Sets the background color for the payment page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String cppPayflowColor;

    /* Sets the cart gradient color for the Mini Cart on 1X flow.
     * 
     * 
     *                         
     * Optional
     * 
     *                         Character length and limitation: Six character
     * HTML hexadecimal color code in ASCII */
    private java.lang.String cppCartBorderColor;

    /* A URL for the image you want to appear above the mini-cart.
     * The image has a maximum size of 190 pixels wide by 60 pixels high.
     * PayPal recommends that you provide an image that is stored on a secure
     * (https) server. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 */
    private java.lang.String cppLogoImage;

    /* Customer's shipping address. 
     * 
     * 						
     * Optional
     * 
     * 						
     * If you include a shipping address and set the AddressOverride element
     * on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse. */
    private eBLBaseComponents.apis.ebay.AddressType address;

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
     * IMPORTANT: You cannot set PaymentAction to Sale or Order on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 
     * 						
     * Character length and limit: Up to 13 single-byte alphabetic characters */
    private eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction;

    /* This will indicate which flow you are choosing (expresschecheckout
     * or expresscheckout optional)
     * 
     * 						
     * Optional
     * 
     * 						
     * None
     * 
     * 						
     * Sole indicates that you are in the ExpressO flow
     * 
     * 						
     * Mark indicates that you are in the old express flow. */
    private eBLBaseComponents.apis.ebay.SolutionTypeType solutionType;

    /* This indicates Which page to display for ExpressO (Billing
     * or Login) 
     * 
     * 						
     * Optional
     * 
     * 						
     * None
     * 
     * 						
     * Billing indicates that you are not a paypal account holder
     * 
     * 						
     * Login indicates that you are a paypal account holder */
    private eBLBaseComponents.apis.ebay.LandingPageType landingPage;

    /* Email address of the buyer as entered during checkout. PayPal
     * uses this value to pre-fill the PayPal membership sign-up portion
     * of the PayPal login page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limit: 127 single-byte alphanumeric characters */
    private java.lang.String buyerEmail;

    private eBLBaseComponents.apis.ebay.ChannelType channelType;

    private eBLBaseComponents.apis.ebay.BillingAgreementDetailsType[] billingAgreementDetails;

    /* Promo Code
     * 						
     * 						Optional
     * 						
     * 						List of promo codes supplied by merchant. These promo codes
     * enable the Merchant Services Promotion Financing feature. */
    private java.lang.String[] promoCodes;

    /* Default Funding option for PayLater Checkout button. */
    private java.lang.String payPalCheckOutBtnType;

    private eBLBaseComponents.apis.ebay.ProductCategoryType productCategory;

    private eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingMethod;

    /* Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
     * which address was changed by the user. */
    private java.util.Calendar profileAddressChangeDate;

    /* The value 1 indicates that the customer may enter a note to
     * the merchant on the PayPal page during checkout. The note is returned
     * in the GetExpressCheckoutDetails response and the DoExpressCheckoutPayment
     * response.
     * 			Optional
     * 			Character length and limitations: One single-byte numeric character.
     * 			Allowable values: 0,1 */
    private java.lang.String allowNote;

    /* Funding source preferences. */
    private eBLBaseComponents.apis.ebay.FundingSourceDetailsType fundingSourceDetails;

    /* The label that needs to be displayed on the cancel links in
     * the PayPal hosted checkout pages.  
     * 			Optional  
     * 			Character length and limit: 127 single-byte alphanumeric characters */
    private java.lang.String brandName;

    /* URL for PayPal to use to retrieve shipping, handling, insurance,
     * and tax details from your website.
     * 			Optional
     * 			Character length and limitations: 2048 characters. */
    private java.lang.String callbackURL;

    /* Enhanced data for different industry segments. 
     * 			Optional */
    private EnhancedDataTypes.apis.ebay.EnhancedCheckoutDataType enhancedCheckoutData;

    /* List of other payment methods the user can pay with.
     * 			Optional
     * 			Refer to the OtherPaymentMethodDetailsType for more details. */
    private eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType[] otherPaymentMethods;

    /* Details about the buyer's account. 
     * 			Optional
     * 			Refer to the BuyerDetailsType for more details. */
    private eBLBaseComponents.apis.ebay.BuyerDetailsType buyerDetails;

    /* Information about the payment. */
    private eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails;

    /* List of Fall Back Shipping options provided by merchant. */
    private eBLBaseComponents.apis.ebay.ShippingOptionType[] flatRateShippingOptions;

    /* Information about the call back timeout override. */
    private java.lang.String callbackTimeout;

    /* Information about the call back version. */
    private java.lang.String callbackVersion;

    /* Information about the Customer service number. */
    private java.lang.String customerServiceNumber;

    /* Information about the Gift message enable. */
    private java.lang.String giftMessageEnable;

    /* Information about the Gift receipt enable. */
    private java.lang.String giftReceiptEnable;

    /* Information about the Gift Wrap enable. */
    private java.lang.String giftWrapEnable;

    /* Information about the Gift Wrap name. */
    private java.lang.String giftWrapName;

    /* Information about the Gift Wrap amount. */
    private CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount;

    /* Information about the Buyer email option enable . */
    private java.lang.String buyerEmailOptInEnable;

    /* Information about the survey enable. */
    private java.lang.String surveyEnable;

    /* Information about the survey question. */
    private java.lang.String surveyQuestion;

    /* Information about the survey choices for survey question. */
    private java.lang.String[] surveyChoice;

    private eBLBaseComponents.apis.ebay.TotalType totalType;

    /* Any message the seller would like to be displayed in the Mini
     * Cart for UX. */
    private java.lang.String noteToBuyer;

    /* Incentive Code
     * 						
     * 						Optional
     * 						
     * 						List of incentive codes supplied by ebay/merchant. */
    private eBLBaseComponents.apis.ebay.IncentiveInfoType[] incentives;

    /* Merchant specified flag which indicates whether to return Funding
     * Instrument Details in DoEC or not. */
    private java.lang.String reqInstrumentDetails;

    /* This element contains information that allows the merchant
     * to request to
     * 						opt into external remember me on behalf of the buyer or to request
     * login
     * 						bypass using external remember me.  Note the opt-in details
     * are silently
     * 						ignored if the ExternalRememberMeID is present. */
    private eBLBaseComponents.apis.ebay.ExternalRememberMeOptInDetailsType externalRememberMeOptInDetails;

    /* An optional set of values related to flow-specific details. */
    private eBLBaseComponents.apis.ebay.FlowControlDetailsType flowControlDetails;

    /* An optional set of values related to display-specific details. */
    private eBLBaseComponents.apis.ebay.DisplayControlDetailsType displayControlDetails;

    /* An optional set of values related to tracking for external
     * partner. */
    private eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails;

    /* Optional element that defines relationship between buckets */
    private eBLBaseComponents.apis.ebay.CoupledBucketsType[] coupledBuckets;

    public SetExpressCheckoutRequestDetailsType() {
    }

    public SetExpressCheckoutRequestDetailsType(
           CoreComponentTypes.apis.ebay.BasicAmountType orderTotal,
           java.lang.String returnURL,
           java.lang.String cancelURL,
           java.lang.String trackingImageURL,
           java.lang.String giropaySuccessURL,
           java.lang.String giropayCancelURL,
           java.lang.String banktxnPendingURL,
           java.lang.String token,
           CoreComponentTypes.apis.ebay.BasicAmountType maxAmount,
           java.lang.String orderDescription,
           java.lang.String custom,
           java.lang.String invoiceID,
           java.lang.String reqConfirmShipping,
           java.lang.String reqBillingAddress,
           eBLBaseComponents.apis.ebay.AddressType billingAddress,
           java.lang.String noShipping,
           java.lang.String addressOverride,
           java.lang.String localeCode,
           java.lang.String pageStyle,
           java.lang.String cppHeaderImage,
           java.lang.String cppHeaderBorderColor,
           java.lang.String cppHeaderBackColor,
           java.lang.String cppPayflowColor,
           java.lang.String cppCartBorderColor,
           java.lang.String cppLogoImage,
           eBLBaseComponents.apis.ebay.AddressType address,
           eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction,
           eBLBaseComponents.apis.ebay.SolutionTypeType solutionType,
           eBLBaseComponents.apis.ebay.LandingPageType landingPage,
           java.lang.String buyerEmail,
           eBLBaseComponents.apis.ebay.ChannelType channelType,
           eBLBaseComponents.apis.ebay.BillingAgreementDetailsType[] billingAgreementDetails,
           java.lang.String[] promoCodes,
           java.lang.String payPalCheckOutBtnType,
           eBLBaseComponents.apis.ebay.ProductCategoryType productCategory,
           eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingMethod,
           java.util.Calendar profileAddressChangeDate,
           java.lang.String allowNote,
           eBLBaseComponents.apis.ebay.FundingSourceDetailsType fundingSourceDetails,
           java.lang.String brandName,
           java.lang.String callbackURL,
           EnhancedDataTypes.apis.ebay.EnhancedCheckoutDataType enhancedCheckoutData,
           eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType[] otherPaymentMethods,
           eBLBaseComponents.apis.ebay.BuyerDetailsType buyerDetails,
           eBLBaseComponents.apis.ebay.PaymentDetailsType[] paymentDetails,
           eBLBaseComponents.apis.ebay.ShippingOptionType[] flatRateShippingOptions,
           java.lang.String callbackTimeout,
           java.lang.String callbackVersion,
           java.lang.String customerServiceNumber,
           java.lang.String giftMessageEnable,
           java.lang.String giftReceiptEnable,
           java.lang.String giftWrapEnable,
           java.lang.String giftWrapName,
           CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount,
           java.lang.String buyerEmailOptInEnable,
           java.lang.String surveyEnable,
           java.lang.String surveyQuestion,
           java.lang.String[] surveyChoice,
           eBLBaseComponents.apis.ebay.TotalType totalType,
           java.lang.String noteToBuyer,
           eBLBaseComponents.apis.ebay.IncentiveInfoType[] incentives,
           java.lang.String reqInstrumentDetails,
           eBLBaseComponents.apis.ebay.ExternalRememberMeOptInDetailsType externalRememberMeOptInDetails,
           eBLBaseComponents.apis.ebay.FlowControlDetailsType flowControlDetails,
           eBLBaseComponents.apis.ebay.DisplayControlDetailsType displayControlDetails,
           eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails,
           eBLBaseComponents.apis.ebay.CoupledBucketsType[] coupledBuckets) {
           this.orderTotal = orderTotal;
           this.returnURL = returnURL;
           this.cancelURL = cancelURL;
           this.trackingImageURL = trackingImageURL;
           this.giropaySuccessURL = giropaySuccessURL;
           this.giropayCancelURL = giropayCancelURL;
           this.banktxnPendingURL = banktxnPendingURL;
           this.token = token;
           this.maxAmount = maxAmount;
           this.orderDescription = orderDescription;
           this.custom = custom;
           this.invoiceID = invoiceID;
           this.reqConfirmShipping = reqConfirmShipping;
           this.reqBillingAddress = reqBillingAddress;
           this.billingAddress = billingAddress;
           this.noShipping = noShipping;
           this.addressOverride = addressOverride;
           this.localeCode = localeCode;
           this.pageStyle = pageStyle;
           this.cppHeaderImage = cppHeaderImage;
           this.cppHeaderBorderColor = cppHeaderBorderColor;
           this.cppHeaderBackColor = cppHeaderBackColor;
           this.cppPayflowColor = cppPayflowColor;
           this.cppCartBorderColor = cppCartBorderColor;
           this.cppLogoImage = cppLogoImage;
           this.address = address;
           this.paymentAction = paymentAction;
           this.solutionType = solutionType;
           this.landingPage = landingPage;
           this.buyerEmail = buyerEmail;
           this.channelType = channelType;
           this.billingAgreementDetails = billingAgreementDetails;
           this.promoCodes = promoCodes;
           this.payPalCheckOutBtnType = payPalCheckOutBtnType;
           this.productCategory = productCategory;
           this.shippingMethod = shippingMethod;
           this.profileAddressChangeDate = profileAddressChangeDate;
           this.allowNote = allowNote;
           this.fundingSourceDetails = fundingSourceDetails;
           this.brandName = brandName;
           this.callbackURL = callbackURL;
           this.enhancedCheckoutData = enhancedCheckoutData;
           this.otherPaymentMethods = otherPaymentMethods;
           this.buyerDetails = buyerDetails;
           this.paymentDetails = paymentDetails;
           this.flatRateShippingOptions = flatRateShippingOptions;
           this.callbackTimeout = callbackTimeout;
           this.callbackVersion = callbackVersion;
           this.customerServiceNumber = customerServiceNumber;
           this.giftMessageEnable = giftMessageEnable;
           this.giftReceiptEnable = giftReceiptEnable;
           this.giftWrapEnable = giftWrapEnable;
           this.giftWrapName = giftWrapName;
           this.giftWrapAmount = giftWrapAmount;
           this.buyerEmailOptInEnable = buyerEmailOptInEnable;
           this.surveyEnable = surveyEnable;
           this.surveyQuestion = surveyQuestion;
           this.surveyChoice = surveyChoice;
           this.totalType = totalType;
           this.noteToBuyer = noteToBuyer;
           this.incentives = incentives;
           this.reqInstrumentDetails = reqInstrumentDetails;
           this.externalRememberMeOptInDetails = externalRememberMeOptInDetails;
           this.flowControlDetails = flowControlDetails;
           this.displayControlDetails = displayControlDetails;
           this.externalPartnerTrackingDetails = externalPartnerTrackingDetails;
           this.coupledBuckets = coupledBuckets;
    }


    /**
     * Gets the orderTotal value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return orderTotal   * The total cost of the order to the customer. If shipping cost
     * and tax charges are known, include them in OrderTotal; if not, OrderTotal
     * should be the current sub-total of the order. 
     * 
     * 						
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getOrderTotal() {
        return orderTotal;
    }


    /**
     * Sets the orderTotal value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param orderTotal   * The total cost of the order to the customer. If shipping cost
     * and tax charges are known, include them in OrderTotal; if not, OrderTotal
     * should be the current sub-total of the order. 
     * 
     * 						
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setOrderTotal(CoreComponentTypes.apis.ebay.BasicAmountType orderTotal) {
        this.orderTotal = orderTotal;
    }


    /**
     * Gets the returnURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return returnURL   * URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit.
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param returnURL   * URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit.
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the cancelURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cancelURL   * URL to which the customer is returned if he does not approve
     * the use of PayPal to pay you. PayPal recommends that the value of
     * CancelURL be the original page on which the customer chose to pay
     * with PayPal. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cancelURL   * URL to which the customer is returned if he does not approve
     * the use of PayPal to pay you. PayPal recommends that the value of
     * CancelURL be the original page on which the customer chose to pay
     * with PayPal. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the trackingImageURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return trackingImageURL   * Tracking URL for ebay. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit
     */
    public java.lang.String getTrackingImageURL() {
        return trackingImageURL;
    }


    /**
     * Sets the trackingImageURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param trackingImageURL   * Tracking URL for ebay. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit
     */
    public void setTrackingImageURL(java.lang.String trackingImageURL) {
        this.trackingImageURL = trackingImageURL;
    }


    /**
     * Gets the giropaySuccessURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giropaySuccessURL   * URL to which the customer's browser is returned after paying
     * with giropay online. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit.
     */
    public java.lang.String getGiropaySuccessURL() {
        return giropaySuccessURL;
    }


    /**
     * Sets the giropaySuccessURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giropaySuccessURL   * URL to which the customer's browser is returned after paying
     * with giropay online. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit.
     */
    public void setGiropaySuccessURL(java.lang.String giropaySuccessURL) {
        this.giropaySuccessURL = giropaySuccessURL;
    }


    /**
     * Gets the giropayCancelURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giropayCancelURL   * URL to which the customer's browser is returned after fail
     * to pay with giropay online. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit.
     */
    public java.lang.String getGiropayCancelURL() {
        return giropayCancelURL;
    }


    /**
     * Sets the giropayCancelURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giropayCancelURL   * URL to which the customer's browser is returned after fail
     * to pay with giropay online. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit.
     */
    public void setGiropayCancelURL(java.lang.String giropayCancelURL) {
        this.giropayCancelURL = giropayCancelURL;
    }


    /**
     * Gets the banktxnPendingURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return banktxnPendingURL   * URL to which the customer's browser can be returned in the
     * mEFT done page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit.
     */
    public java.lang.String getBanktxnPendingURL() {
        return banktxnPendingURL;
    }


    /**
     * Sets the banktxnPendingURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param banktxnPendingURL   * URL to which the customer's browser can be returned in the
     * mEFT done page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: no limit.
     */
    public void setBanktxnPendingURL(java.lang.String banktxnPendingURL) {
        this.banktxnPendingURL = banktxnPendingURL;
    }


    /**
     * Gets the token value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return token   * On your first invocation of SetExpressCheckoutRequest, the
     * value of this token is returned by SetExpressCheckoutResponse. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Include this element and its value only if you want to modify an existing
     * checkout session with another invocation of SetExpressCheckoutRequest;
     * for example, if you want the customer to edit his shipping address
     * on PayPal. 
     * 
     * 						
     * Character length and limitations: 20 single-byte characters
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param token   * On your first invocation of SetExpressCheckoutRequest, the
     * value of this token is returned by SetExpressCheckoutResponse. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Include this element and its value only if you want to modify an existing
     * checkout session with another invocation of SetExpressCheckoutRequest;
     * for example, if you want the customer to edit his shipping address
     * on PayPal. 
     * 
     * 						
     * Character length and limitations: 20 single-byte characters
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the maxAmount value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return maxAmount   * The expected maximum total amount of the complete order, including
     * shipping cost and tax charges. 
     * 
     * 						
     * Optional
     * 
     * 						
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param maxAmount   * The expected maximum total amount of the complete order, including
     * shipping cost and tax charges. 
     * 
     * 						
     * Optional
     * 
     * 						
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setMaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType maxAmount) {
        this.maxAmount = maxAmount;
    }


    /**
     * Gets the orderDescription value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return orderDescription   * Description of items the customer is purchasing. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getOrderDescription() {
        return orderDescription;
    }


    /**
     * Sets the orderDescription value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param orderDescription   * Description of items the customer is purchasing. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setOrderDescription(java.lang.String orderDescription) {
        this.orderDescription = orderDescription;
    }


    /**
     * Gets the custom value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return custom   * A free-form field for your own use, such as a tracking number
     * or other value you want PayPal to return on GetExpressCheckoutDetailsResponse
     * and DoExpressCheckoutPaymentResponse. 
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
     * Sets the custom value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param custom   * A free-form field for your own use, such as a tracking number
     * or other value you want PayPal to return on GetExpressCheckoutDetailsResponse
     * and DoExpressCheckoutPaymentResponse. 
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
     * Gets the invoiceID value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return invoiceID   * Your own unique invoice or tracking number. PayPal returns
     * this value to you on DoExpressCheckoutPaymentResponse. 
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
     * Sets the invoiceID value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param invoiceID   * Your own unique invoice or tracking number. PayPal returns
     * this value to you on DoExpressCheckoutPaymentResponse. 
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
     * Gets the reqConfirmShipping value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return reqConfirmShipping   * The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Any value
     * other than 1 indicates that the customer's shipping address on file
     * with PayPal need NOT be a confirmed address. Setting this element
     * overrides the setting you have specified in the recipient's Merchant
     * Account Profile. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character.
     */
    public java.lang.String getReqConfirmShipping() {
        return reqConfirmShipping;
    }


    /**
     * Sets the reqConfirmShipping value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param reqConfirmShipping   * The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Any value
     * other than 1 indicates that the customer's shipping address on file
     * with PayPal need NOT be a confirmed address. Setting this element
     * overrides the setting you have specified in the recipient's Merchant
     * Account Profile. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character.
     */
    public void setReqConfirmShipping(java.lang.String reqConfirmShipping) {
        this.reqConfirmShipping = reqConfirmShipping;
    }


    /**
     * Gets the reqBillingAddress value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return reqBillingAddress   * The value 1 indicates that you require that the customer's
     * billing address on file. Setting this element overrides the setting
     * you have specified in Admin.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character.
     */
    public java.lang.String getReqBillingAddress() {
        return reqBillingAddress;
    }


    /**
     * Sets the reqBillingAddress value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param reqBillingAddress   * The value 1 indicates that you require that the customer's
     * billing address on file. Setting this element overrides the setting
     * you have specified in Admin.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character.
     */
    public void setReqBillingAddress(java.lang.String reqBillingAddress) {
        this.reqBillingAddress = reqBillingAddress;
    }


    /**
     * Gets the billingAddress value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return billingAddress   * The billing address for the buyer.
     * 							
     * 						Optional
     * 							
     * 							
     * 						If you include the BillingAddress element, the AddressType elements
     * are required:
     * 							
     * 							
     * 						Name
     * 							
     * 							
     * 						Street1
     * 							
     * 							
     * 						CityName
     * 							
     * 							
     * 						CountryCode
     */
    public eBLBaseComponents.apis.ebay.AddressType getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param billingAddress   * The billing address for the buyer.
     * 							
     * 						Optional
     * 							
     * 							
     * 						If you include the BillingAddress element, the AddressType elements
     * are required:
     * 							
     * 							
     * 						Name
     * 							
     * 							
     * 						Street1
     * 							
     * 							
     * 						CityName
     * 							
     * 							
     * 						CountryCode
     */
    public void setBillingAddress(eBLBaseComponents.apis.ebay.AddressType billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the noShipping value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return noShipping   * The value 1 indicates that on the PayPal pages, no shipping
     * address fields should be displayed whatsoever. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Four single-byte numeric characters.
     */
    public java.lang.String getNoShipping() {
        return noShipping;
    }


    /**
     * Sets the noShipping value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param noShipping   * The value 1 indicates that on the PayPal pages, no shipping
     * address fields should be displayed whatsoever. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Four single-byte numeric characters.
     */
    public void setNoShipping(java.lang.String noShipping) {
        this.noShipping = noShipping;
    }


    /**
     * Gets the addressOverride value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return addressOverride   * The value 1 indicates that the PayPal pages should display
     * the shipping address set by you in the Address element on this SetExpressCheckoutRequest,
     * not the shipping address on file with PayPal for this customer. Displaying
     * the PayPal street address on file does not allow the customer to edit
     * that address. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: Four single-byte numeric characters.
     */
    public java.lang.String getAddressOverride() {
        return addressOverride;
    }


    /**
     * Sets the addressOverride value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param addressOverride   * The value 1 indicates that the PayPal pages should display
     * the shipping address set by you in the Address element on this SetExpressCheckoutRequest,
     * not the shipping address on file with PayPal for this customer. Displaying
     * the PayPal street address on file does not allow the customer to edit
     * that address. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: Four single-byte numeric characters.
     */
    public void setAddressOverride(java.lang.String addressOverride) {
        this.addressOverride = addressOverride;
    }


    /**
     * Gets the localeCode value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return localeCode   * Locale of pages displayed by PayPal during Express Checkout.
     * 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Five single-byte alphabetic characters,
     * upper- or lowercase. 
     * 
     * 						
     * Allowable values: 
     * 
     * AU or en_AU
     * 
     * DE or de_DE
     * 
     * FR or fr_FR
     * 
     * GB or en_GB
     * 
     * IT or it_IT
     * 
     * JP or ja_JP
     * 
     * US or en_US
     */
    public java.lang.String getLocaleCode() {
        return localeCode;
    }


    /**
     * Sets the localeCode value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param localeCode   * Locale of pages displayed by PayPal during Express Checkout.
     * 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Five single-byte alphabetic characters,
     * upper- or lowercase. 
     * 
     * 						
     * Allowable values: 
     * 
     * AU or en_AU
     * 
     * DE or de_DE
     * 
     * FR or fr_FR
     * 
     * GB or en_GB
     * 
     * IT or it_IT
     * 
     * JP or ja_JP
     * 
     * US or en_US
     */
    public void setLocaleCode(java.lang.String localeCode) {
        this.localeCode = localeCode;
    }


    /**
     * Gets the pageStyle value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return pageStyle   * Sets the Custom Payment Page Style for payment pages associated
     * with this button/link. PageStyle corresponds to the HTML variable
     * page_style for customizing payment pages. The value is the same as
     * the Page Style Name you chose when adding or editing the page style
     * from the Profile subtab of the My Account tab of your PayPal account.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 30 single-byte alphabetic
     * characters.
     */
    public java.lang.String getPageStyle() {
        return pageStyle;
    }


    /**
     * Sets the pageStyle value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param pageStyle   * Sets the Custom Payment Page Style for payment pages associated
     * with this button/link. PageStyle corresponds to the HTML variable
     * page_style for customizing payment pages. The value is the same as
     * the Page Style Name you chose when adding or editing the page style
     * from the Profile subtab of the My Account tab of your PayPal account.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 30 single-byte alphabetic
     * characters.
     */
    public void setPageStyle(java.lang.String pageStyle) {
        this.pageStyle = pageStyle;
    }


    /**
     * Gets the cppHeaderImage value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cppHeaderImage   * A URL for the image you want to appear at the top left of the
     * payment page. The image has a maximum size of 750 pixels wide by 90
     * pixels high. PayPal recommends that you provide an image that is stored
     * on a secure (https) server. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127
     */
    public java.lang.String getCppHeaderImage() {
        return cppHeaderImage;
    }


    /**
     * Sets the cppHeaderImage value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cppHeaderImage   * A URL for the image you want to appear at the top left of the
     * payment page. The image has a maximum size of 750 pixels wide by 90
     * pixels high. PayPal recommends that you provide an image that is stored
     * on a secure (https) server. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127
     */
    public void setCppHeaderImage(java.lang.String cppHeaderImage) {
        this.cppHeaderImage = cppHeaderImage;
    }


    /**
     * Gets the cppHeaderBorderColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cppHeaderBorderColor   * Sets the border color around the header of the payment page.
     * The border is a 2-pixel perimeter around the header space, which is
     * 750 pixels wide by 90 pixels high. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getCppHeaderBorderColor() {
        return cppHeaderBorderColor;
    }


    /**
     * Sets the cppHeaderBorderColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cppHeaderBorderColor   * Sets the border color around the header of the payment page.
     * The border is a 2-pixel perimeter around the header space, which is
     * 750 pixels wide by 90 pixels high. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setCppHeaderBorderColor(java.lang.String cppHeaderBorderColor) {
        this.cppHeaderBorderColor = cppHeaderBorderColor;
    }


    /**
     * Gets the cppHeaderBackColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cppHeaderBackColor   * Sets the background color for the header of the payment page.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getCppHeaderBackColor() {
        return cppHeaderBackColor;
    }


    /**
     * Sets the cppHeaderBackColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cppHeaderBackColor   * Sets the background color for the header of the payment page.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setCppHeaderBackColor(java.lang.String cppHeaderBackColor) {
        this.cppHeaderBackColor = cppHeaderBackColor;
    }


    /**
     * Gets the cppPayflowColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cppPayflowColor   * Sets the background color for the payment page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getCppPayflowColor() {
        return cppPayflowColor;
    }


    /**
     * Sets the cppPayflowColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cppPayflowColor   * Sets the background color for the payment page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setCppPayflowColor(java.lang.String cppPayflowColor) {
        this.cppPayflowColor = cppPayflowColor;
    }


    /**
     * Gets the cppCartBorderColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cppCartBorderColor   * Sets the cart gradient color for the Mini Cart on 1X flow.
     * 
     * 
     *                         
     * Optional
     * 
     *                         Character length and limitation: Six character
     * HTML hexadecimal color code in ASCII
     */
    public java.lang.String getCppCartBorderColor() {
        return cppCartBorderColor;
    }


    /**
     * Sets the cppCartBorderColor value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cppCartBorderColor   * Sets the cart gradient color for the Mini Cart on 1X flow.
     * 
     * 
     *                         
     * Optional
     * 
     *                         Character length and limitation: Six character
     * HTML hexadecimal color code in ASCII
     */
    public void setCppCartBorderColor(java.lang.String cppCartBorderColor) {
        this.cppCartBorderColor = cppCartBorderColor;
    }


    /**
     * Gets the cppLogoImage value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return cppLogoImage   * A URL for the image you want to appear above the mini-cart.
     * The image has a maximum size of 190 pixels wide by 60 pixels high.
     * PayPal recommends that you provide an image that is stored on a secure
     * (https) server. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127
     */
    public java.lang.String getCppLogoImage() {
        return cppLogoImage;
    }


    /**
     * Sets the cppLogoImage value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param cppLogoImage   * A URL for the image you want to appear above the mini-cart.
     * The image has a maximum size of 190 pixels wide by 60 pixels high.
     * PayPal recommends that you provide an image that is stored on a secure
     * (https) server. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127
     */
    public void setCppLogoImage(java.lang.String cppLogoImage) {
        this.cppLogoImage = cppLogoImage;
    }


    /**
     * Gets the address value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return address   * Customer's shipping address. 
     * 
     * 						
     * Optional
     * 
     * 						
     * If you include a shipping address and set the AddressOverride element
     * on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse.
     */
    public eBLBaseComponents.apis.ebay.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param address   * Customer's shipping address. 
     * 
     * 						
     * Optional
     * 
     * 						
     * If you include a shipping address and set the AddressOverride element
     * on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse.
     */
    public void setAddress(eBLBaseComponents.apis.ebay.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the paymentAction value for this SetExpressCheckoutRequestDetailsType.
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
     * IMPORTANT: You cannot set PaymentAction to Sale or Order on SetExpressCheckoutRequest
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
     * Sets the paymentAction value for this SetExpressCheckoutRequestDetailsType.
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
     * IMPORTANT: You cannot set PaymentAction to Sale or Order on SetExpressCheckoutRequest
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
     * Gets the solutionType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return solutionType   * This will indicate which flow you are choosing (expresschecheckout
     * or expresscheckout optional)
     * 
     * 						
     * Optional
     * 
     * 						
     * None
     * 
     * 						
     * Sole indicates that you are in the ExpressO flow
     * 
     * 						
     * Mark indicates that you are in the old express flow.
     */
    public eBLBaseComponents.apis.ebay.SolutionTypeType getSolutionType() {
        return solutionType;
    }


    /**
     * Sets the solutionType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param solutionType   * This will indicate which flow you are choosing (expresschecheckout
     * or expresscheckout optional)
     * 
     * 						
     * Optional
     * 
     * 						
     * None
     * 
     * 						
     * Sole indicates that you are in the ExpressO flow
     * 
     * 						
     * Mark indicates that you are in the old express flow.
     */
    public void setSolutionType(eBLBaseComponents.apis.ebay.SolutionTypeType solutionType) {
        this.solutionType = solutionType;
    }


    /**
     * Gets the landingPage value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return landingPage   * This indicates Which page to display for ExpressO (Billing
     * or Login) 
     * 
     * 						
     * Optional
     * 
     * 						
     * None
     * 
     * 						
     * Billing indicates that you are not a paypal account holder
     * 
     * 						
     * Login indicates that you are a paypal account holder
     */
    public eBLBaseComponents.apis.ebay.LandingPageType getLandingPage() {
        return landingPage;
    }


    /**
     * Sets the landingPage value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param landingPage   * This indicates Which page to display for ExpressO (Billing
     * or Login) 
     * 
     * 						
     * Optional
     * 
     * 						
     * None
     * 
     * 						
     * Billing indicates that you are not a paypal account holder
     * 
     * 						
     * Login indicates that you are a paypal account holder
     */
    public void setLandingPage(eBLBaseComponents.apis.ebay.LandingPageType landingPage) {
        this.landingPage = landingPage;
    }


    /**
     * Gets the buyerEmail value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return buyerEmail   * Email address of the buyer as entered during checkout. PayPal
     * uses this value to pre-fill the PayPal membership sign-up portion
     * of the PayPal login page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limit: 127 single-byte alphanumeric characters
     */
    public java.lang.String getBuyerEmail() {
        return buyerEmail;
    }


    /**
     * Sets the buyerEmail value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param buyerEmail   * Email address of the buyer as entered during checkout. PayPal
     * uses this value to pre-fill the PayPal membership sign-up portion
     * of the PayPal login page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limit: 127 single-byte alphanumeric characters
     */
    public void setBuyerEmail(java.lang.String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }


    /**
     * Gets the channelType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return channelType
     */
    public eBLBaseComponents.apis.ebay.ChannelType getChannelType() {
        return channelType;
    }


    /**
     * Sets the channelType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param channelType
     */
    public void setChannelType(eBLBaseComponents.apis.ebay.ChannelType channelType) {
        this.channelType = channelType;
    }


    /**
     * Gets the billingAgreementDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return billingAgreementDetails
     */
    public eBLBaseComponents.apis.ebay.BillingAgreementDetailsType[] getBillingAgreementDetails() {
        return billingAgreementDetails;
    }


    /**
     * Sets the billingAgreementDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param billingAgreementDetails
     */
    public void setBillingAgreementDetails(eBLBaseComponents.apis.ebay.BillingAgreementDetailsType[] billingAgreementDetails) {
        this.billingAgreementDetails = billingAgreementDetails;
    }

    public eBLBaseComponents.apis.ebay.BillingAgreementDetailsType getBillingAgreementDetails(int i) {
        return this.billingAgreementDetails[i];
    }

    public void setBillingAgreementDetails(int i, eBLBaseComponents.apis.ebay.BillingAgreementDetailsType _value) {
        this.billingAgreementDetails[i] = _value;
    }


    /**
     * Gets the promoCodes value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return promoCodes   * Promo Code
     * 						
     * 						Optional
     * 						
     * 						List of promo codes supplied by merchant. These promo codes
     * enable the Merchant Services Promotion Financing feature.
     */
    public java.lang.String[] getPromoCodes() {
        return promoCodes;
    }


    /**
     * Sets the promoCodes value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param promoCodes   * Promo Code
     * 						
     * 						Optional
     * 						
     * 						List of promo codes supplied by merchant. These promo codes
     * enable the Merchant Services Promotion Financing feature.
     */
    public void setPromoCodes(java.lang.String[] promoCodes) {
        this.promoCodes = promoCodes;
    }

    public java.lang.String getPromoCodes(int i) {
        return this.promoCodes[i];
    }

    public void setPromoCodes(int i, java.lang.String _value) {
        this.promoCodes[i] = _value;
    }


    /**
     * Gets the payPalCheckOutBtnType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return payPalCheckOutBtnType   * Default Funding option for PayLater Checkout button.
     */
    public java.lang.String getPayPalCheckOutBtnType() {
        return payPalCheckOutBtnType;
    }


    /**
     * Sets the payPalCheckOutBtnType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param payPalCheckOutBtnType   * Default Funding option for PayLater Checkout button.
     */
    public void setPayPalCheckOutBtnType(java.lang.String payPalCheckOutBtnType) {
        this.payPalCheckOutBtnType = payPalCheckOutBtnType;
    }


    /**
     * Gets the productCategory value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return productCategory
     */
    public eBLBaseComponents.apis.ebay.ProductCategoryType getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param productCategory
     */
    public void setProductCategory(eBLBaseComponents.apis.ebay.ProductCategoryType productCategory) {
        this.productCategory = productCategory;
    }


    /**
     * Gets the shippingMethod value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return shippingMethod
     */
    public eBLBaseComponents.apis.ebay.ShippingServiceCodeType getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the profileAddressChangeDate value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return profileAddressChangeDate   * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
     * which address was changed by the user.
     */
    public java.util.Calendar getProfileAddressChangeDate() {
        return profileAddressChangeDate;
    }


    /**
     * Sets the profileAddressChangeDate value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param profileAddressChangeDate   * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
     * which address was changed by the user.
     */
    public void setProfileAddressChangeDate(java.util.Calendar profileAddressChangeDate) {
        this.profileAddressChangeDate = profileAddressChangeDate;
    }


    /**
     * Gets the allowNote value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return allowNote   * The value 1 indicates that the customer may enter a note to
     * the merchant on the PayPal page during checkout. The note is returned
     * in the GetExpressCheckoutDetails response and the DoExpressCheckoutPayment
     * response.
     * 			Optional
     * 			Character length and limitations: One single-byte numeric character.
     * 			Allowable values: 0,1
     */
    public java.lang.String getAllowNote() {
        return allowNote;
    }


    /**
     * Sets the allowNote value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param allowNote   * The value 1 indicates that the customer may enter a note to
     * the merchant on the PayPal page during checkout. The note is returned
     * in the GetExpressCheckoutDetails response and the DoExpressCheckoutPayment
     * response.
     * 			Optional
     * 			Character length and limitations: One single-byte numeric character.
     * 			Allowable values: 0,1
     */
    public void setAllowNote(java.lang.String allowNote) {
        this.allowNote = allowNote;
    }


    /**
     * Gets the fundingSourceDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return fundingSourceDetails   * Funding source preferences.
     */
    public eBLBaseComponents.apis.ebay.FundingSourceDetailsType getFundingSourceDetails() {
        return fundingSourceDetails;
    }


    /**
     * Sets the fundingSourceDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param fundingSourceDetails   * Funding source preferences.
     */
    public void setFundingSourceDetails(eBLBaseComponents.apis.ebay.FundingSourceDetailsType fundingSourceDetails) {
        this.fundingSourceDetails = fundingSourceDetails;
    }


    /**
     * Gets the brandName value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return brandName   * The label that needs to be displayed on the cancel links in
     * the PayPal hosted checkout pages.  
     * 			Optional  
     * 			Character length and limit: 127 single-byte alphanumeric characters
     */
    public java.lang.String getBrandName() {
        return brandName;
    }


    /**
     * Sets the brandName value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param brandName   * The label that needs to be displayed on the cancel links in
     * the PayPal hosted checkout pages.  
     * 			Optional  
     * 			Character length and limit: 127 single-byte alphanumeric characters
     */
    public void setBrandName(java.lang.String brandName) {
        this.brandName = brandName;
    }


    /**
     * Gets the callbackURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return callbackURL   * URL for PayPal to use to retrieve shipping, handling, insurance,
     * and tax details from your website.
     * 			Optional
     * 			Character length and limitations: 2048 characters.
     */
    public java.lang.String getCallbackURL() {
        return callbackURL;
    }


    /**
     * Sets the callbackURL value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param callbackURL   * URL for PayPal to use to retrieve shipping, handling, insurance,
     * and tax details from your website.
     * 			Optional
     * 			Character length and limitations: 2048 characters.
     */
    public void setCallbackURL(java.lang.String callbackURL) {
        this.callbackURL = callbackURL;
    }


    /**
     * Gets the enhancedCheckoutData value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return enhancedCheckoutData   * Enhanced data for different industry segments. 
     * 			Optional
     */
    public EnhancedDataTypes.apis.ebay.EnhancedCheckoutDataType getEnhancedCheckoutData() {
        return enhancedCheckoutData;
    }


    /**
     * Sets the enhancedCheckoutData value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param enhancedCheckoutData   * Enhanced data for different industry segments. 
     * 			Optional
     */
    public void setEnhancedCheckoutData(EnhancedDataTypes.apis.ebay.EnhancedCheckoutDataType enhancedCheckoutData) {
        this.enhancedCheckoutData = enhancedCheckoutData;
    }


    /**
     * Gets the otherPaymentMethods value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return otherPaymentMethods   * List of other payment methods the user can pay with.
     * 			Optional
     * 			Refer to the OtherPaymentMethodDetailsType for more details.
     */
    public eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType[] getOtherPaymentMethods() {
        return otherPaymentMethods;
    }


    /**
     * Sets the otherPaymentMethods value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param otherPaymentMethods   * List of other payment methods the user can pay with.
     * 			Optional
     * 			Refer to the OtherPaymentMethodDetailsType for more details.
     */
    public void setOtherPaymentMethods(eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType[] otherPaymentMethods) {
        this.otherPaymentMethods = otherPaymentMethods;
    }

    public eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType getOtherPaymentMethods(int i) {
        return this.otherPaymentMethods[i];
    }

    public void setOtherPaymentMethods(int i, eBLBaseComponents.apis.ebay.OtherPaymentMethodDetailsType _value) {
        this.otherPaymentMethods[i] = _value;
    }


    /**
     * Gets the buyerDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return buyerDetails   * Details about the buyer's account. 
     * 			Optional
     * 			Refer to the BuyerDetailsType for more details.
     */
    public eBLBaseComponents.apis.ebay.BuyerDetailsType getBuyerDetails() {
        return buyerDetails;
    }


    /**
     * Sets the buyerDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param buyerDetails   * Details about the buyer's account. 
     * 			Optional
     * 			Refer to the BuyerDetailsType for more details.
     */
    public void setBuyerDetails(eBLBaseComponents.apis.ebay.BuyerDetailsType buyerDetails) {
        this.buyerDetails = buyerDetails;
    }


    /**
     * Gets the paymentDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return paymentDetails   * Information about the payment.
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsType[] getPaymentDetails() {
        return paymentDetails;
    }


    /**
     * Sets the paymentDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param paymentDetails   * Information about the payment.
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
     * Gets the flatRateShippingOptions value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return flatRateShippingOptions   * List of Fall Back Shipping options provided by merchant.
     */
    public eBLBaseComponents.apis.ebay.ShippingOptionType[] getFlatRateShippingOptions() {
        return flatRateShippingOptions;
    }


    /**
     * Sets the flatRateShippingOptions value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param flatRateShippingOptions   * List of Fall Back Shipping options provided by merchant.
     */
    public void setFlatRateShippingOptions(eBLBaseComponents.apis.ebay.ShippingOptionType[] flatRateShippingOptions) {
        this.flatRateShippingOptions = flatRateShippingOptions;
    }

    public eBLBaseComponents.apis.ebay.ShippingOptionType getFlatRateShippingOptions(int i) {
        return this.flatRateShippingOptions[i];
    }

    public void setFlatRateShippingOptions(int i, eBLBaseComponents.apis.ebay.ShippingOptionType _value) {
        this.flatRateShippingOptions[i] = _value;
    }


    /**
     * Gets the callbackTimeout value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return callbackTimeout   * Information about the call back timeout override.
     */
    public java.lang.String getCallbackTimeout() {
        return callbackTimeout;
    }


    /**
     * Sets the callbackTimeout value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param callbackTimeout   * Information about the call back timeout override.
     */
    public void setCallbackTimeout(java.lang.String callbackTimeout) {
        this.callbackTimeout = callbackTimeout;
    }


    /**
     * Gets the callbackVersion value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return callbackVersion   * Information about the call back version.
     */
    public java.lang.String getCallbackVersion() {
        return callbackVersion;
    }


    /**
     * Sets the callbackVersion value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param callbackVersion   * Information about the call back version.
     */
    public void setCallbackVersion(java.lang.String callbackVersion) {
        this.callbackVersion = callbackVersion;
    }


    /**
     * Gets the customerServiceNumber value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return customerServiceNumber   * Information about the Customer service number.
     */
    public java.lang.String getCustomerServiceNumber() {
        return customerServiceNumber;
    }


    /**
     * Sets the customerServiceNumber value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param customerServiceNumber   * Information about the Customer service number.
     */
    public void setCustomerServiceNumber(java.lang.String customerServiceNumber) {
        this.customerServiceNumber = customerServiceNumber;
    }


    /**
     * Gets the giftMessageEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giftMessageEnable   * Information about the Gift message enable.
     */
    public java.lang.String getGiftMessageEnable() {
        return giftMessageEnable;
    }


    /**
     * Sets the giftMessageEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giftMessageEnable   * Information about the Gift message enable.
     */
    public void setGiftMessageEnable(java.lang.String giftMessageEnable) {
        this.giftMessageEnable = giftMessageEnable;
    }


    /**
     * Gets the giftReceiptEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giftReceiptEnable   * Information about the Gift receipt enable.
     */
    public java.lang.String getGiftReceiptEnable() {
        return giftReceiptEnable;
    }


    /**
     * Sets the giftReceiptEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giftReceiptEnable   * Information about the Gift receipt enable.
     */
    public void setGiftReceiptEnable(java.lang.String giftReceiptEnable) {
        this.giftReceiptEnable = giftReceiptEnable;
    }


    /**
     * Gets the giftWrapEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giftWrapEnable   * Information about the Gift Wrap enable.
     */
    public java.lang.String getGiftWrapEnable() {
        return giftWrapEnable;
    }


    /**
     * Sets the giftWrapEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giftWrapEnable   * Information about the Gift Wrap enable.
     */
    public void setGiftWrapEnable(java.lang.String giftWrapEnable) {
        this.giftWrapEnable = giftWrapEnable;
    }


    /**
     * Gets the giftWrapName value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giftWrapName   * Information about the Gift Wrap name.
     */
    public java.lang.String getGiftWrapName() {
        return giftWrapName;
    }


    /**
     * Sets the giftWrapName value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giftWrapName   * Information about the Gift Wrap name.
     */
    public void setGiftWrapName(java.lang.String giftWrapName) {
        this.giftWrapName = giftWrapName;
    }


    /**
     * Gets the giftWrapAmount value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGiftWrapAmount() {
        return giftWrapAmount;
    }


    /**
     * Sets the giftWrapAmount value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param giftWrapAmount   * Information about the Gift Wrap amount.
     */
    public void setGiftWrapAmount(CoreComponentTypes.apis.ebay.BasicAmountType giftWrapAmount) {
        this.giftWrapAmount = giftWrapAmount;
    }


    /**
     * Gets the buyerEmailOptInEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return buyerEmailOptInEnable   * Information about the Buyer email option enable .
     */
    public java.lang.String getBuyerEmailOptInEnable() {
        return buyerEmailOptInEnable;
    }


    /**
     * Sets the buyerEmailOptInEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param buyerEmailOptInEnable   * Information about the Buyer email option enable .
     */
    public void setBuyerEmailOptInEnable(java.lang.String buyerEmailOptInEnable) {
        this.buyerEmailOptInEnable = buyerEmailOptInEnable;
    }


    /**
     * Gets the surveyEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return surveyEnable   * Information about the survey enable.
     */
    public java.lang.String getSurveyEnable() {
        return surveyEnable;
    }


    /**
     * Sets the surveyEnable value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param surveyEnable   * Information about the survey enable.
     */
    public void setSurveyEnable(java.lang.String surveyEnable) {
        this.surveyEnable = surveyEnable;
    }


    /**
     * Gets the surveyQuestion value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return surveyQuestion   * Information about the survey question.
     */
    public java.lang.String getSurveyQuestion() {
        return surveyQuestion;
    }


    /**
     * Sets the surveyQuestion value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param surveyQuestion   * Information about the survey question.
     */
    public void setSurveyQuestion(java.lang.String surveyQuestion) {
        this.surveyQuestion = surveyQuestion;
    }


    /**
     * Gets the surveyChoice value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return surveyChoice   * Information about the survey choices for survey question.
     */
    public java.lang.String[] getSurveyChoice() {
        return surveyChoice;
    }


    /**
     * Sets the surveyChoice value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param surveyChoice   * Information about the survey choices for survey question.
     */
    public void setSurveyChoice(java.lang.String[] surveyChoice) {
        this.surveyChoice = surveyChoice;
    }

    public java.lang.String getSurveyChoice(int i) {
        return this.surveyChoice[i];
    }

    public void setSurveyChoice(int i, java.lang.String _value) {
        this.surveyChoice[i] = _value;
    }


    /**
     * Gets the totalType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return totalType
     */
    public eBLBaseComponents.apis.ebay.TotalType getTotalType() {
        return totalType;
    }


    /**
     * Sets the totalType value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param totalType
     */
    public void setTotalType(eBLBaseComponents.apis.ebay.TotalType totalType) {
        this.totalType = totalType;
    }


    /**
     * Gets the noteToBuyer value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return noteToBuyer   * Any message the seller would like to be displayed in the Mini
     * Cart for UX.
     */
    public java.lang.String getNoteToBuyer() {
        return noteToBuyer;
    }


    /**
     * Sets the noteToBuyer value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param noteToBuyer   * Any message the seller would like to be displayed in the Mini
     * Cart for UX.
     */
    public void setNoteToBuyer(java.lang.String noteToBuyer) {
        this.noteToBuyer = noteToBuyer;
    }


    /**
     * Gets the incentives value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return incentives   * Incentive Code
     * 						
     * 						Optional
     * 						
     * 						List of incentive codes supplied by ebay/merchant.
     */
    public eBLBaseComponents.apis.ebay.IncentiveInfoType[] getIncentives() {
        return incentives;
    }


    /**
     * Sets the incentives value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param incentives   * Incentive Code
     * 						
     * 						Optional
     * 						
     * 						List of incentive codes supplied by ebay/merchant.
     */
    public void setIncentives(eBLBaseComponents.apis.ebay.IncentiveInfoType[] incentives) {
        this.incentives = incentives;
    }

    public eBLBaseComponents.apis.ebay.IncentiveInfoType getIncentives(int i) {
        return this.incentives[i];
    }

    public void setIncentives(int i, eBLBaseComponents.apis.ebay.IncentiveInfoType _value) {
        this.incentives[i] = _value;
    }


    /**
     * Gets the reqInstrumentDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return reqInstrumentDetails   * Merchant specified flag which indicates whether to return Funding
     * Instrument Details in DoEC or not.
     */
    public java.lang.String getReqInstrumentDetails() {
        return reqInstrumentDetails;
    }


    /**
     * Sets the reqInstrumentDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param reqInstrumentDetails   * Merchant specified flag which indicates whether to return Funding
     * Instrument Details in DoEC or not.
     */
    public void setReqInstrumentDetails(java.lang.String reqInstrumentDetails) {
        this.reqInstrumentDetails = reqInstrumentDetails;
    }


    /**
     * Gets the externalRememberMeOptInDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return externalRememberMeOptInDetails   * This element contains information that allows the merchant
     * to request to
     * 						opt into external remember me on behalf of the buyer or to request
     * login
     * 						bypass using external remember me.  Note the opt-in details
     * are silently
     * 						ignored if the ExternalRememberMeID is present.
     */
    public eBLBaseComponents.apis.ebay.ExternalRememberMeOptInDetailsType getExternalRememberMeOptInDetails() {
        return externalRememberMeOptInDetails;
    }


    /**
     * Sets the externalRememberMeOptInDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param externalRememberMeOptInDetails   * This element contains information that allows the merchant
     * to request to
     * 						opt into external remember me on behalf of the buyer or to request
     * login
     * 						bypass using external remember me.  Note the opt-in details
     * are silently
     * 						ignored if the ExternalRememberMeID is present.
     */
    public void setExternalRememberMeOptInDetails(eBLBaseComponents.apis.ebay.ExternalRememberMeOptInDetailsType externalRememberMeOptInDetails) {
        this.externalRememberMeOptInDetails = externalRememberMeOptInDetails;
    }


    /**
     * Gets the flowControlDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return flowControlDetails   * An optional set of values related to flow-specific details.
     */
    public eBLBaseComponents.apis.ebay.FlowControlDetailsType getFlowControlDetails() {
        return flowControlDetails;
    }


    /**
     * Sets the flowControlDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param flowControlDetails   * An optional set of values related to flow-specific details.
     */
    public void setFlowControlDetails(eBLBaseComponents.apis.ebay.FlowControlDetailsType flowControlDetails) {
        this.flowControlDetails = flowControlDetails;
    }


    /**
     * Gets the displayControlDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return displayControlDetails   * An optional set of values related to display-specific details.
     */
    public eBLBaseComponents.apis.ebay.DisplayControlDetailsType getDisplayControlDetails() {
        return displayControlDetails;
    }


    /**
     * Sets the displayControlDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param displayControlDetails   * An optional set of values related to display-specific details.
     */
    public void setDisplayControlDetails(eBLBaseComponents.apis.ebay.DisplayControlDetailsType displayControlDetails) {
        this.displayControlDetails = displayControlDetails;
    }


    /**
     * Gets the externalPartnerTrackingDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return externalPartnerTrackingDetails   * An optional set of values related to tracking for external
     * partner.
     */
    public eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType getExternalPartnerTrackingDetails() {
        return externalPartnerTrackingDetails;
    }


    /**
     * Sets the externalPartnerTrackingDetails value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @param externalPartnerTrackingDetails   * An optional set of values related to tracking for external
     * partner.
     */
    public void setExternalPartnerTrackingDetails(eBLBaseComponents.apis.ebay.ExternalPartnerTrackingDetailsType externalPartnerTrackingDetails) {
        this.externalPartnerTrackingDetails = externalPartnerTrackingDetails;
    }


    /**
     * Gets the coupledBuckets value for this SetExpressCheckoutRequestDetailsType.
     * 
     * @return coupledBuckets   * Optional element that defines relationship between buckets
     */
    public eBLBaseComponents.apis.ebay.CoupledBucketsType[] getCoupledBuckets() {
        return coupledBuckets;
    }


    /**
     * Sets the coupledBuckets value for this SetExpressCheckoutRequestDetailsType.
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
        if (!(obj instanceof SetExpressCheckoutRequestDetailsType)) return false;
        SetExpressCheckoutRequestDetailsType other = (SetExpressCheckoutRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderTotal==null && other.getOrderTotal()==null) || 
             (this.orderTotal!=null &&
              this.orderTotal.equals(other.getOrderTotal()))) &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
            ((this.trackingImageURL==null && other.getTrackingImageURL()==null) || 
             (this.trackingImageURL!=null &&
              this.trackingImageURL.equals(other.getTrackingImageURL()))) &&
            ((this.giropaySuccessURL==null && other.getGiropaySuccessURL()==null) || 
             (this.giropaySuccessURL!=null &&
              this.giropaySuccessURL.equals(other.getGiropaySuccessURL()))) &&
            ((this.giropayCancelURL==null && other.getGiropayCancelURL()==null) || 
             (this.giropayCancelURL!=null &&
              this.giropayCancelURL.equals(other.getGiropayCancelURL()))) &&
            ((this.banktxnPendingURL==null && other.getBanktxnPendingURL()==null) || 
             (this.banktxnPendingURL!=null &&
              this.banktxnPendingURL.equals(other.getBanktxnPendingURL()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount()))) &&
            ((this.orderDescription==null && other.getOrderDescription()==null) || 
             (this.orderDescription!=null &&
              this.orderDescription.equals(other.getOrderDescription()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.reqConfirmShipping==null && other.getReqConfirmShipping()==null) || 
             (this.reqConfirmShipping!=null &&
              this.reqConfirmShipping.equals(other.getReqConfirmShipping()))) &&
            ((this.reqBillingAddress==null && other.getReqBillingAddress()==null) || 
             (this.reqBillingAddress!=null &&
              this.reqBillingAddress.equals(other.getReqBillingAddress()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.noShipping==null && other.getNoShipping()==null) || 
             (this.noShipping!=null &&
              this.noShipping.equals(other.getNoShipping()))) &&
            ((this.addressOverride==null && other.getAddressOverride()==null) || 
             (this.addressOverride!=null &&
              this.addressOverride.equals(other.getAddressOverride()))) &&
            ((this.localeCode==null && other.getLocaleCode()==null) || 
             (this.localeCode!=null &&
              this.localeCode.equals(other.getLocaleCode()))) &&
            ((this.pageStyle==null && other.getPageStyle()==null) || 
             (this.pageStyle!=null &&
              this.pageStyle.equals(other.getPageStyle()))) &&
            ((this.cppHeaderImage==null && other.getCppHeaderImage()==null) || 
             (this.cppHeaderImage!=null &&
              this.cppHeaderImage.equals(other.getCppHeaderImage()))) &&
            ((this.cppHeaderBorderColor==null && other.getCppHeaderBorderColor()==null) || 
             (this.cppHeaderBorderColor!=null &&
              this.cppHeaderBorderColor.equals(other.getCppHeaderBorderColor()))) &&
            ((this.cppHeaderBackColor==null && other.getCppHeaderBackColor()==null) || 
             (this.cppHeaderBackColor!=null &&
              this.cppHeaderBackColor.equals(other.getCppHeaderBackColor()))) &&
            ((this.cppPayflowColor==null && other.getCppPayflowColor()==null) || 
             (this.cppPayflowColor!=null &&
              this.cppPayflowColor.equals(other.getCppPayflowColor()))) &&
            ((this.cppCartBorderColor==null && other.getCppCartBorderColor()==null) || 
             (this.cppCartBorderColor!=null &&
              this.cppCartBorderColor.equals(other.getCppCartBorderColor()))) &&
            ((this.cppLogoImage==null && other.getCppLogoImage()==null) || 
             (this.cppLogoImage!=null &&
              this.cppLogoImage.equals(other.getCppLogoImage()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.paymentAction==null && other.getPaymentAction()==null) || 
             (this.paymentAction!=null &&
              this.paymentAction.equals(other.getPaymentAction()))) &&
            ((this.solutionType==null && other.getSolutionType()==null) || 
             (this.solutionType!=null &&
              this.solutionType.equals(other.getSolutionType()))) &&
            ((this.landingPage==null && other.getLandingPage()==null) || 
             (this.landingPage!=null &&
              this.landingPage.equals(other.getLandingPage()))) &&
            ((this.buyerEmail==null && other.getBuyerEmail()==null) || 
             (this.buyerEmail!=null &&
              this.buyerEmail.equals(other.getBuyerEmail()))) &&
            ((this.channelType==null && other.getChannelType()==null) || 
             (this.channelType!=null &&
              this.channelType.equals(other.getChannelType()))) &&
            ((this.billingAgreementDetails==null && other.getBillingAgreementDetails()==null) || 
             (this.billingAgreementDetails!=null &&
              java.util.Arrays.equals(this.billingAgreementDetails, other.getBillingAgreementDetails()))) &&
            ((this.promoCodes==null && other.getPromoCodes()==null) || 
             (this.promoCodes!=null &&
              java.util.Arrays.equals(this.promoCodes, other.getPromoCodes()))) &&
            ((this.payPalCheckOutBtnType==null && other.getPayPalCheckOutBtnType()==null) || 
             (this.payPalCheckOutBtnType!=null &&
              this.payPalCheckOutBtnType.equals(other.getPayPalCheckOutBtnType()))) &&
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              this.productCategory.equals(other.getProductCategory()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.profileAddressChangeDate==null && other.getProfileAddressChangeDate()==null) || 
             (this.profileAddressChangeDate!=null &&
              this.profileAddressChangeDate.equals(other.getProfileAddressChangeDate()))) &&
            ((this.allowNote==null && other.getAllowNote()==null) || 
             (this.allowNote!=null &&
              this.allowNote.equals(other.getAllowNote()))) &&
            ((this.fundingSourceDetails==null && other.getFundingSourceDetails()==null) || 
             (this.fundingSourceDetails!=null &&
              this.fundingSourceDetails.equals(other.getFundingSourceDetails()))) &&
            ((this.brandName==null && other.getBrandName()==null) || 
             (this.brandName!=null &&
              this.brandName.equals(other.getBrandName()))) &&
            ((this.callbackURL==null && other.getCallbackURL()==null) || 
             (this.callbackURL!=null &&
              this.callbackURL.equals(other.getCallbackURL()))) &&
            ((this.enhancedCheckoutData==null && other.getEnhancedCheckoutData()==null) || 
             (this.enhancedCheckoutData!=null &&
              this.enhancedCheckoutData.equals(other.getEnhancedCheckoutData()))) &&
            ((this.otherPaymentMethods==null && other.getOtherPaymentMethods()==null) || 
             (this.otherPaymentMethods!=null &&
              java.util.Arrays.equals(this.otherPaymentMethods, other.getOtherPaymentMethods()))) &&
            ((this.buyerDetails==null && other.getBuyerDetails()==null) || 
             (this.buyerDetails!=null &&
              this.buyerDetails.equals(other.getBuyerDetails()))) &&
            ((this.paymentDetails==null && other.getPaymentDetails()==null) || 
             (this.paymentDetails!=null &&
              java.util.Arrays.equals(this.paymentDetails, other.getPaymentDetails()))) &&
            ((this.flatRateShippingOptions==null && other.getFlatRateShippingOptions()==null) || 
             (this.flatRateShippingOptions!=null &&
              java.util.Arrays.equals(this.flatRateShippingOptions, other.getFlatRateShippingOptions()))) &&
            ((this.callbackTimeout==null && other.getCallbackTimeout()==null) || 
             (this.callbackTimeout!=null &&
              this.callbackTimeout.equals(other.getCallbackTimeout()))) &&
            ((this.callbackVersion==null && other.getCallbackVersion()==null) || 
             (this.callbackVersion!=null &&
              this.callbackVersion.equals(other.getCallbackVersion()))) &&
            ((this.customerServiceNumber==null && other.getCustomerServiceNumber()==null) || 
             (this.customerServiceNumber!=null &&
              this.customerServiceNumber.equals(other.getCustomerServiceNumber()))) &&
            ((this.giftMessageEnable==null && other.getGiftMessageEnable()==null) || 
             (this.giftMessageEnable!=null &&
              this.giftMessageEnable.equals(other.getGiftMessageEnable()))) &&
            ((this.giftReceiptEnable==null && other.getGiftReceiptEnable()==null) || 
             (this.giftReceiptEnable!=null &&
              this.giftReceiptEnable.equals(other.getGiftReceiptEnable()))) &&
            ((this.giftWrapEnable==null && other.getGiftWrapEnable()==null) || 
             (this.giftWrapEnable!=null &&
              this.giftWrapEnable.equals(other.getGiftWrapEnable()))) &&
            ((this.giftWrapName==null && other.getGiftWrapName()==null) || 
             (this.giftWrapName!=null &&
              this.giftWrapName.equals(other.getGiftWrapName()))) &&
            ((this.giftWrapAmount==null && other.getGiftWrapAmount()==null) || 
             (this.giftWrapAmount!=null &&
              this.giftWrapAmount.equals(other.getGiftWrapAmount()))) &&
            ((this.buyerEmailOptInEnable==null && other.getBuyerEmailOptInEnable()==null) || 
             (this.buyerEmailOptInEnable!=null &&
              this.buyerEmailOptInEnable.equals(other.getBuyerEmailOptInEnable()))) &&
            ((this.surveyEnable==null && other.getSurveyEnable()==null) || 
             (this.surveyEnable!=null &&
              this.surveyEnable.equals(other.getSurveyEnable()))) &&
            ((this.surveyQuestion==null && other.getSurveyQuestion()==null) || 
             (this.surveyQuestion!=null &&
              this.surveyQuestion.equals(other.getSurveyQuestion()))) &&
            ((this.surveyChoice==null && other.getSurveyChoice()==null) || 
             (this.surveyChoice!=null &&
              java.util.Arrays.equals(this.surveyChoice, other.getSurveyChoice()))) &&
            ((this.totalType==null && other.getTotalType()==null) || 
             (this.totalType!=null &&
              this.totalType.equals(other.getTotalType()))) &&
            ((this.noteToBuyer==null && other.getNoteToBuyer()==null) || 
             (this.noteToBuyer!=null &&
              this.noteToBuyer.equals(other.getNoteToBuyer()))) &&
            ((this.incentives==null && other.getIncentives()==null) || 
             (this.incentives!=null &&
              java.util.Arrays.equals(this.incentives, other.getIncentives()))) &&
            ((this.reqInstrumentDetails==null && other.getReqInstrumentDetails()==null) || 
             (this.reqInstrumentDetails!=null &&
              this.reqInstrumentDetails.equals(other.getReqInstrumentDetails()))) &&
            ((this.externalRememberMeOptInDetails==null && other.getExternalRememberMeOptInDetails()==null) || 
             (this.externalRememberMeOptInDetails!=null &&
              this.externalRememberMeOptInDetails.equals(other.getExternalRememberMeOptInDetails()))) &&
            ((this.flowControlDetails==null && other.getFlowControlDetails()==null) || 
             (this.flowControlDetails!=null &&
              this.flowControlDetails.equals(other.getFlowControlDetails()))) &&
            ((this.displayControlDetails==null && other.getDisplayControlDetails()==null) || 
             (this.displayControlDetails!=null &&
              this.displayControlDetails.equals(other.getDisplayControlDetails()))) &&
            ((this.externalPartnerTrackingDetails==null && other.getExternalPartnerTrackingDetails()==null) || 
             (this.externalPartnerTrackingDetails!=null &&
              this.externalPartnerTrackingDetails.equals(other.getExternalPartnerTrackingDetails()))) &&
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
        if (getOrderTotal() != null) {
            _hashCode += getOrderTotal().hashCode();
        }
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
        }
        if (getTrackingImageURL() != null) {
            _hashCode += getTrackingImageURL().hashCode();
        }
        if (getGiropaySuccessURL() != null) {
            _hashCode += getGiropaySuccessURL().hashCode();
        }
        if (getGiropayCancelURL() != null) {
            _hashCode += getGiropayCancelURL().hashCode();
        }
        if (getBanktxnPendingURL() != null) {
            _hashCode += getBanktxnPendingURL().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        if (getOrderDescription() != null) {
            _hashCode += getOrderDescription().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getReqConfirmShipping() != null) {
            _hashCode += getReqConfirmShipping().hashCode();
        }
        if (getReqBillingAddress() != null) {
            _hashCode += getReqBillingAddress().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getNoShipping() != null) {
            _hashCode += getNoShipping().hashCode();
        }
        if (getAddressOverride() != null) {
            _hashCode += getAddressOverride().hashCode();
        }
        if (getLocaleCode() != null) {
            _hashCode += getLocaleCode().hashCode();
        }
        if (getPageStyle() != null) {
            _hashCode += getPageStyle().hashCode();
        }
        if (getCppHeaderImage() != null) {
            _hashCode += getCppHeaderImage().hashCode();
        }
        if (getCppHeaderBorderColor() != null) {
            _hashCode += getCppHeaderBorderColor().hashCode();
        }
        if (getCppHeaderBackColor() != null) {
            _hashCode += getCppHeaderBackColor().hashCode();
        }
        if (getCppPayflowColor() != null) {
            _hashCode += getCppPayflowColor().hashCode();
        }
        if (getCppCartBorderColor() != null) {
            _hashCode += getCppCartBorderColor().hashCode();
        }
        if (getCppLogoImage() != null) {
            _hashCode += getCppLogoImage().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getPaymentAction() != null) {
            _hashCode += getPaymentAction().hashCode();
        }
        if (getSolutionType() != null) {
            _hashCode += getSolutionType().hashCode();
        }
        if (getLandingPage() != null) {
            _hashCode += getLandingPage().hashCode();
        }
        if (getBuyerEmail() != null) {
            _hashCode += getBuyerEmail().hashCode();
        }
        if (getChannelType() != null) {
            _hashCode += getChannelType().hashCode();
        }
        if (getBillingAgreementDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingAgreementDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingAgreementDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromoCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalCheckOutBtnType() != null) {
            _hashCode += getPayPalCheckOutBtnType().hashCode();
        }
        if (getProductCategory() != null) {
            _hashCode += getProductCategory().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getProfileAddressChangeDate() != null) {
            _hashCode += getProfileAddressChangeDate().hashCode();
        }
        if (getAllowNote() != null) {
            _hashCode += getAllowNote().hashCode();
        }
        if (getFundingSourceDetails() != null) {
            _hashCode += getFundingSourceDetails().hashCode();
        }
        if (getBrandName() != null) {
            _hashCode += getBrandName().hashCode();
        }
        if (getCallbackURL() != null) {
            _hashCode += getCallbackURL().hashCode();
        }
        if (getEnhancedCheckoutData() != null) {
            _hashCode += getEnhancedCheckoutData().hashCode();
        }
        if (getOtherPaymentMethods() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherPaymentMethods());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherPaymentMethods(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyerDetails() != null) {
            _hashCode += getBuyerDetails().hashCode();
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
        if (getFlatRateShippingOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlatRateShippingOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlatRateShippingOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCallbackTimeout() != null) {
            _hashCode += getCallbackTimeout().hashCode();
        }
        if (getCallbackVersion() != null) {
            _hashCode += getCallbackVersion().hashCode();
        }
        if (getCustomerServiceNumber() != null) {
            _hashCode += getCustomerServiceNumber().hashCode();
        }
        if (getGiftMessageEnable() != null) {
            _hashCode += getGiftMessageEnable().hashCode();
        }
        if (getGiftReceiptEnable() != null) {
            _hashCode += getGiftReceiptEnable().hashCode();
        }
        if (getGiftWrapEnable() != null) {
            _hashCode += getGiftWrapEnable().hashCode();
        }
        if (getGiftWrapName() != null) {
            _hashCode += getGiftWrapName().hashCode();
        }
        if (getGiftWrapAmount() != null) {
            _hashCode += getGiftWrapAmount().hashCode();
        }
        if (getBuyerEmailOptInEnable() != null) {
            _hashCode += getBuyerEmailOptInEnable().hashCode();
        }
        if (getSurveyEnable() != null) {
            _hashCode += getSurveyEnable().hashCode();
        }
        if (getSurveyQuestion() != null) {
            _hashCode += getSurveyQuestion().hashCode();
        }
        if (getSurveyChoice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSurveyChoice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSurveyChoice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalType() != null) {
            _hashCode += getTotalType().hashCode();
        }
        if (getNoteToBuyer() != null) {
            _hashCode += getNoteToBuyer().hashCode();
        }
        if (getIncentives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncentives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncentives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReqInstrumentDetails() != null) {
            _hashCode += getReqInstrumentDetails().hashCode();
        }
        if (getExternalRememberMeOptInDetails() != null) {
            _hashCode += getExternalRememberMeOptInDetails().hashCode();
        }
        if (getFlowControlDetails() != null) {
            _hashCode += getFlowControlDetails().hashCode();
        }
        if (getDisplayControlDetails() != null) {
            _hashCode += getDisplayControlDetails().hashCode();
        }
        if (getExternalPartnerTrackingDetails() != null) {
            _hashCode += getExternalPartnerTrackingDetails().hashCode();
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
        new org.apache.axis.description.TypeDesc(SetExpressCheckoutRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetExpressCheckoutRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReturnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CancelURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingImageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TrackingImageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giropaySuccessURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "giropaySuccessURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giropayCancelURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "giropayCancelURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banktxnPendingURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BanktxnPendingURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("reqConfirmShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqConfirmShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqBillingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqBillingAddress"));
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
        elemField.setFieldName("noShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NoShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LocaleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PageStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppHeaderImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-header-image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppHeaderBorderColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-header-border-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppHeaderBackColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-header-back-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppPayflowColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-payflow-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppCartBorderColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-cart-border-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppLogoImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-logo-image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentActionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solutionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SolutionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SolutionTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("landingPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LandingPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LandingPageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ChannelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ChannelType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromoCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalCheckOutBtnType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayPalCheckOutBtnType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingServiceCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileAddressChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProfileAddressChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNote");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundingSourceDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FundingSourceDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FundingSourceDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BrandName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CallbackURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedCheckoutData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedCheckoutData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCheckoutDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPaymentMethods");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OtherPaymentMethodDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetailsType"));
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
        elemField.setFieldName("flatRateShippingOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlatRateShippingOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingOptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CallbackTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CallbackVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomerServiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftMessageEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftMessageEnable"));
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
        elemField.setFieldName("giftWrapEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GiftWrapEnable"));
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
        elemField.setFieldName("buyerEmailOptInEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerEmailOptInEnable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surveyEnable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SurveyEnable"));
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
        elemField.setFieldName("surveyChoice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SurveyChoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteToBuyer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NoteToBuyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentives");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Incentives"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqInstrumentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqInstrumentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOptInDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOptInDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOptInDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowControlDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlowControlDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FlowControlDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayControlDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DisplayControlDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DisplayControlDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalPartnerTrackingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerTrackingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalPartnerTrackingDetailsType"));
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
