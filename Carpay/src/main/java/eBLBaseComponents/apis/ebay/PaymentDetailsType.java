/**
 * PaymentDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentDetailsType 
 * 				Information about a payment.  Used by DCC and Express Checkout.
 */
public class PaymentDetailsType  implements java.io.Serializable {
    /* Total of order, including shipping, handling, and tax. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType orderTotal;

    /* Sum of cost of all items in this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType itemTotal;

    /* Total shipping costs for this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType shippingTotal;

    /* Total handling costs for this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType handlingTotal;

    /* Sum of tax for all items in this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType taxTotal;

    /* Description of items the customer is purchasing. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String orderDescription;

    /* A free-form field for your own use. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters */
    private java.lang.String custom;

    /* Your own invoice or tracking number. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String invoiceID;

    /* An identification code for use by third-party applications
     * to identify transactions. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 32 single-byte alphanumeric
     * characters */
    private java.lang.String buttonSource;

    /* Your URL for receiving Instant Payment Notification (IPN) about
     * this transaction. 
     * 
     * 						
     * Optional
     * 
     * 						If you do not specify NotifyURL in the request, the notification
     * URL from your Merchant Profile is used, if one exists. 
     * 
     * 						Character length and limitations: 2,048 single-byte alphanumeric
     * characters */
    private java.lang.String notifyURL;

    /* Address the order will be shipped to. 
     * 
     * 						
     * Optional
     * 
     * 						
     * If you include the ShipToAddress element, the AddressType elements
     * are required: 
     * 
     * 						Name
     * 
     * 						
     * Street1
     * 
     * 						
     * CityName
     * 
     * 						
     * CountryCode */
    private eBLBaseComponents.apis.ebay.AddressType shipToAddress;

    /* The value 1 indicates that this payment is associated with
     * multiple shipping addresses. 
     * 						
     * 						
     * 						Optional
     * 						
     * 						
     * 						Character length and limitations: Four single-byte numeric characters. */
    private java.lang.String multiShipping;

    /* Thirdparty Fulfillment Reference Number.
     * 						Optional 
     * 						Character length and limitations: 32 alphanumeric characters. */
    private java.lang.String fulfillmentReferenceNumber;

    private eBLBaseComponents.apis.ebay.AddressType fulfillmentAddress;

    private eBLBaseComponents.apis.ebay.PaymentCategoryType paymentCategoryType;

    private eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingMethod;

    /* Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
     * which address was changed by the user. */
    private java.util.Calendar profileAddressChangeDate;

    /* Information about the individual purchased items */
    private eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem;

    /* Total shipping insurance costs for this order.
     * 						Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType insuranceTotal;

    /* Shipping discount for this order, specified as a negative number.
     * 						Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType shippingDiscount;

    /* Information about the Insurance options. */
    private java.lang.String insuranceOptionOffered;

    /* Allowed payment methods for this transaction. */
    private eBLBaseComponents.apis.ebay.AllowedPaymentMethodType allowedPaymentMethod;

    /* Enhanced Data section to accept channel specific data.
     * 						Optional
     * 						Refer to EnhancedPaymentDataType for details. */
    private EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType enhancedPaymentData;

    /* Details about the seller.
     * 						Optional */
    private eBLBaseComponents.apis.ebay.SellerDetailsType sellerDetails;

    /* Note to recipient/seller. 
     * 						Optional 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters. */
    private java.lang.String noteText;

    /* PayPal Transaction Id, returned once DoExpressCheckout is completed. */
    private java.lang.String transactionId;

    /* How you want to obtain payment.
     * 						
     * 						
     * 						This payment action input will be used for split payments
     * 						
     * 						
     * 							Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 						
     * 						
     * 							Order indicates that this payment is is an order authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 						
     * 						
     * 							Sale indicates that this is a final sale for which you are
     * requesting payment.
     * 						
     * 						
     * 							IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 						
     * 						
     * 							Character length and limit: Up to 13 single-byte alphabetic
     * characters */
    private eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction;

    /* Unique identifier and mandatory for the particular payment
     * request in case of multiple payment */
    private java.lang.String paymentRequestID;

    /* URL on Merchant site pertaining to this invoice. */
    private java.lang.String orderURL;

    /* Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored. */
    private java.lang.String softDescriptor;

    /* BranchLevel is used to identify chain payment.
     * 						If BranchLevel is 0 or 1, this payment is where money moves
     * to.
     * 						If BranchLevel greater than 1, this payment contains the actual
     * seller info.	
     * 						
     * 						
     * 						Optional */
    private java.math.BigInteger branchLevel;

    /* Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored. */
    private eBLBaseComponents.apis.ebay.OfferDetailsType offerDetails;

    /* Flag to indicate the recurring transaction */
    private eBLBaseComponents.apis.ebay.RecurringFlagType recurring;

    /* Indicates the purpose of this payment like Refund */
    private eBLBaseComponents.apis.ebay.PaymentReasonType paymentReason;

    /* For instance single use coupons should not be
     * 						returned in future CheckIn calls once they are redeemed. */
    private eBLBaseComponents.apis.ebay.DiscountInfoType[] redeemedOffers;

    /* Total loyalty points for a given id accumulated by the consumre
     * so far. */
    private eBLBaseComponents.apis.ebay.DiscountInfoType[] cummulativePoints;

    public PaymentDetailsType() {
    }

    public PaymentDetailsType(
           CoreComponentTypes.apis.ebay.BasicAmountType orderTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType itemTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType handlingTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType taxTotal,
           java.lang.String orderDescription,
           java.lang.String custom,
           java.lang.String invoiceID,
           java.lang.String buttonSource,
           java.lang.String notifyURL,
           eBLBaseComponents.apis.ebay.AddressType shipToAddress,
           java.lang.String multiShipping,
           java.lang.String fulfillmentReferenceNumber,
           eBLBaseComponents.apis.ebay.AddressType fulfillmentAddress,
           eBLBaseComponents.apis.ebay.PaymentCategoryType paymentCategoryType,
           eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingMethod,
           java.util.Calendar profileAddressChangeDate,
           eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem,
           CoreComponentTypes.apis.ebay.BasicAmountType insuranceTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingDiscount,
           java.lang.String insuranceOptionOffered,
           eBLBaseComponents.apis.ebay.AllowedPaymentMethodType allowedPaymentMethod,
           EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType enhancedPaymentData,
           eBLBaseComponents.apis.ebay.SellerDetailsType sellerDetails,
           java.lang.String noteText,
           java.lang.String transactionId,
           eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction,
           java.lang.String paymentRequestID,
           java.lang.String orderURL,
           java.lang.String softDescriptor,
           java.math.BigInteger branchLevel,
           eBLBaseComponents.apis.ebay.OfferDetailsType offerDetails,
           eBLBaseComponents.apis.ebay.RecurringFlagType recurring,
           eBLBaseComponents.apis.ebay.PaymentReasonType paymentReason,
           eBLBaseComponents.apis.ebay.DiscountInfoType[] redeemedOffers,
           eBLBaseComponents.apis.ebay.DiscountInfoType[] cummulativePoints) {
           this.orderTotal = orderTotal;
           this.itemTotal = itemTotal;
           this.shippingTotal = shippingTotal;
           this.handlingTotal = handlingTotal;
           this.taxTotal = taxTotal;
           this.orderDescription = orderDescription;
           this.custom = custom;
           this.invoiceID = invoiceID;
           this.buttonSource = buttonSource;
           this.notifyURL = notifyURL;
           this.shipToAddress = shipToAddress;
           this.multiShipping = multiShipping;
           this.fulfillmentReferenceNumber = fulfillmentReferenceNumber;
           this.fulfillmentAddress = fulfillmentAddress;
           this.paymentCategoryType = paymentCategoryType;
           this.shippingMethod = shippingMethod;
           this.profileAddressChangeDate = profileAddressChangeDate;
           this.paymentDetailsItem = paymentDetailsItem;
           this.insuranceTotal = insuranceTotal;
           this.shippingDiscount = shippingDiscount;
           this.insuranceOptionOffered = insuranceOptionOffered;
           this.allowedPaymentMethod = allowedPaymentMethod;
           this.enhancedPaymentData = enhancedPaymentData;
           this.sellerDetails = sellerDetails;
           this.noteText = noteText;
           this.transactionId = transactionId;
           this.paymentAction = paymentAction;
           this.paymentRequestID = paymentRequestID;
           this.orderURL = orderURL;
           this.softDescriptor = softDescriptor;
           this.branchLevel = branchLevel;
           this.offerDetails = offerDetails;
           this.recurring = recurring;
           this.paymentReason = paymentReason;
           this.redeemedOffers = redeemedOffers;
           this.cummulativePoints = cummulativePoints;
    }


    /**
     * Gets the orderTotal value for this PaymentDetailsType.
     * 
     * @return orderTotal   * Total of order, including shipping, handling, and tax. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getOrderTotal() {
        return orderTotal;
    }


    /**
     * Sets the orderTotal value for this PaymentDetailsType.
     * 
     * @param orderTotal   * Total of order, including shipping, handling, and tax. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setOrderTotal(CoreComponentTypes.apis.ebay.BasicAmountType orderTotal) {
        this.orderTotal = orderTotal;
    }


    /**
     * Gets the itemTotal value for this PaymentDetailsType.
     * 
     * @return itemTotal   * Sum of cost of all items in this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemTotal() {
        return itemTotal;
    }


    /**
     * Sets the itemTotal value for this PaymentDetailsType.
     * 
     * @param itemTotal   * Sum of cost of all items in this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						separator must be a comma (,).
     */
    public void setItemTotal(CoreComponentTypes.apis.ebay.BasicAmountType itemTotal) {
        this.itemTotal = itemTotal;
    }


    /**
     * Gets the shippingTotal value for this PaymentDetailsType.
     * 
     * @return shippingTotal   * Total shipping costs for this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingTotal() {
        return shippingTotal;
    }


    /**
     * Sets the shippingTotal value for this PaymentDetailsType.
     * 
     * @param shippingTotal   * Total shipping costs for this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setShippingTotal(CoreComponentTypes.apis.ebay.BasicAmountType shippingTotal) {
        this.shippingTotal = shippingTotal;
    }


    /**
     * Gets the handlingTotal value for this PaymentDetailsType.
     * 
     * @return handlingTotal   * Total handling costs for this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getHandlingTotal() {
        return handlingTotal;
    }


    /**
     * Sets the handlingTotal value for this PaymentDetailsType.
     * 
     * @param handlingTotal   * Total handling costs for this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setHandlingTotal(CoreComponentTypes.apis.ebay.BasicAmountType handlingTotal) {
        this.handlingTotal = handlingTotal;
    }


    /**
     * Gets the taxTotal value for this PaymentDetailsType.
     * 
     * @return taxTotal   * Sum of tax for all items in this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this PaymentDetailsType.
     * 
     * @param taxTotal   * Sum of tax for all items in this order. 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setTaxTotal(CoreComponentTypes.apis.ebay.BasicAmountType taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the orderDescription value for this PaymentDetailsType.
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
     * Sets the orderDescription value for this PaymentDetailsType.
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
     * Gets the custom value for this PaymentDetailsType.
     * 
     * @return custom   * A free-form field for your own use. 
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
     * Sets the custom value for this PaymentDetailsType.
     * 
     * @param custom   * A free-form field for your own use. 
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
     * Gets the invoiceID value for this PaymentDetailsType.
     * 
     * @return invoiceID   * Your own invoice or tracking number. 
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
     * Sets the invoiceID value for this PaymentDetailsType.
     * 
     * @param invoiceID   * Your own invoice or tracking number. 
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
     * Gets the buttonSource value for this PaymentDetailsType.
     * 
     * @return buttonSource   * An identification code for use by third-party applications
     * to identify transactions. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 32 single-byte alphanumeric
     * characters
     */
    public java.lang.String getButtonSource() {
        return buttonSource;
    }


    /**
     * Sets the buttonSource value for this PaymentDetailsType.
     * 
     * @param buttonSource   * An identification code for use by third-party applications
     * to identify transactions. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 32 single-byte alphanumeric
     * characters
     */
    public void setButtonSource(java.lang.String buttonSource) {
        this.buttonSource = buttonSource;
    }


    /**
     * Gets the notifyURL value for this PaymentDetailsType.
     * 
     * @return notifyURL   * Your URL for receiving Instant Payment Notification (IPN) about
     * this transaction. 
     * 
     * 						
     * Optional
     * 
     * 						If you do not specify NotifyURL in the request, the notification
     * URL from your Merchant Profile is used, if one exists. 
     * 
     * 						Character length and limitations: 2,048 single-byte alphanumeric
     * characters
     */
    public java.lang.String getNotifyURL() {
        return notifyURL;
    }


    /**
     * Sets the notifyURL value for this PaymentDetailsType.
     * 
     * @param notifyURL   * Your URL for receiving Instant Payment Notification (IPN) about
     * this transaction. 
     * 
     * 						
     * Optional
     * 
     * 						If you do not specify NotifyURL in the request, the notification
     * URL from your Merchant Profile is used, if one exists. 
     * 
     * 						Character length and limitations: 2,048 single-byte alphanumeric
     * characters
     */
    public void setNotifyURL(java.lang.String notifyURL) {
        this.notifyURL = notifyURL;
    }


    /**
     * Gets the shipToAddress value for this PaymentDetailsType.
     * 
     * @return shipToAddress   * Address the order will be shipped to. 
     * 
     * 						
     * Optional
     * 
     * 						
     * If you include the ShipToAddress element, the AddressType elements
     * are required: 
     * 
     * 						Name
     * 
     * 						
     * Street1
     * 
     * 						
     * CityName
     * 
     * 						
     * CountryCode
     */
    public eBLBaseComponents.apis.ebay.AddressType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this PaymentDetailsType.
     * 
     * @param shipToAddress   * Address the order will be shipped to. 
     * 
     * 						
     * Optional
     * 
     * 						
     * If you include the ShipToAddress element, the AddressType elements
     * are required: 
     * 
     * 						Name
     * 
     * 						
     * Street1
     * 
     * 						
     * CityName
     * 
     * 						
     * CountryCode
     */
    public void setShipToAddress(eBLBaseComponents.apis.ebay.AddressType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the multiShipping value for this PaymentDetailsType.
     * 
     * @return multiShipping   * The value 1 indicates that this payment is associated with
     * multiple shipping addresses. 
     * 						
     * 						
     * 						Optional
     * 						
     * 						
     * 						Character length and limitations: Four single-byte numeric characters.
     */
    public java.lang.String getMultiShipping() {
        return multiShipping;
    }


    /**
     * Sets the multiShipping value for this PaymentDetailsType.
     * 
     * @param multiShipping   * The value 1 indicates that this payment is associated with
     * multiple shipping addresses. 
     * 						
     * 						
     * 						Optional
     * 						
     * 						
     * 						Character length and limitations: Four single-byte numeric characters.
     */
    public void setMultiShipping(java.lang.String multiShipping) {
        this.multiShipping = multiShipping;
    }


    /**
     * Gets the fulfillmentReferenceNumber value for this PaymentDetailsType.
     * 
     * @return fulfillmentReferenceNumber   * Thirdparty Fulfillment Reference Number.
     * 						Optional 
     * 						Character length and limitations: 32 alphanumeric characters.
     */
    public java.lang.String getFulfillmentReferenceNumber() {
        return fulfillmentReferenceNumber;
    }


    /**
     * Sets the fulfillmentReferenceNumber value for this PaymentDetailsType.
     * 
     * @param fulfillmentReferenceNumber   * Thirdparty Fulfillment Reference Number.
     * 						Optional 
     * 						Character length and limitations: 32 alphanumeric characters.
     */
    public void setFulfillmentReferenceNumber(java.lang.String fulfillmentReferenceNumber) {
        this.fulfillmentReferenceNumber = fulfillmentReferenceNumber;
    }


    /**
     * Gets the fulfillmentAddress value for this PaymentDetailsType.
     * 
     * @return fulfillmentAddress
     */
    public eBLBaseComponents.apis.ebay.AddressType getFulfillmentAddress() {
        return fulfillmentAddress;
    }


    /**
     * Sets the fulfillmentAddress value for this PaymentDetailsType.
     * 
     * @param fulfillmentAddress
     */
    public void setFulfillmentAddress(eBLBaseComponents.apis.ebay.AddressType fulfillmentAddress) {
        this.fulfillmentAddress = fulfillmentAddress;
    }


    /**
     * Gets the paymentCategoryType value for this PaymentDetailsType.
     * 
     * @return paymentCategoryType
     */
    public eBLBaseComponents.apis.ebay.PaymentCategoryType getPaymentCategoryType() {
        return paymentCategoryType;
    }


    /**
     * Sets the paymentCategoryType value for this PaymentDetailsType.
     * 
     * @param paymentCategoryType
     */
    public void setPaymentCategoryType(eBLBaseComponents.apis.ebay.PaymentCategoryType paymentCategoryType) {
        this.paymentCategoryType = paymentCategoryType;
    }


    /**
     * Gets the shippingMethod value for this PaymentDetailsType.
     * 
     * @return shippingMethod
     */
    public eBLBaseComponents.apis.ebay.ShippingServiceCodeType getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this PaymentDetailsType.
     * 
     * @param shippingMethod
     */
    public void setShippingMethod(eBLBaseComponents.apis.ebay.ShippingServiceCodeType shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the profileAddressChangeDate value for this PaymentDetailsType.
     * 
     * @return profileAddressChangeDate   * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
     * which address was changed by the user.
     */
    public java.util.Calendar getProfileAddressChangeDate() {
        return profileAddressChangeDate;
    }


    /**
     * Sets the profileAddressChangeDate value for this PaymentDetailsType.
     * 
     * @param profileAddressChangeDate   * Date and time (in GMT in the format yyyy-MM-ddTHH:mm:ssZ) at
     * which address was changed by the user.
     */
    public void setProfileAddressChangeDate(java.util.Calendar profileAddressChangeDate) {
        this.profileAddressChangeDate = profileAddressChangeDate;
    }


    /**
     * Gets the paymentDetailsItem value for this PaymentDetailsType.
     * 
     * @return paymentDetailsItem   * Information about the individual purchased items
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] getPaymentDetailsItem() {
        return paymentDetailsItem;
    }


    /**
     * Sets the paymentDetailsItem value for this PaymentDetailsType.
     * 
     * @param paymentDetailsItem   * Information about the individual purchased items
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


    /**
     * Gets the insuranceTotal value for this PaymentDetailsType.
     * 
     * @return insuranceTotal   * Total shipping insurance costs for this order.
     * 						Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getInsuranceTotal() {
        return insuranceTotal;
    }


    /**
     * Sets the insuranceTotal value for this PaymentDetailsType.
     * 
     * @param insuranceTotal   * Total shipping insurance costs for this order.
     * 						Optional
     */
    public void setInsuranceTotal(CoreComponentTypes.apis.ebay.BasicAmountType insuranceTotal) {
        this.insuranceTotal = insuranceTotal;
    }


    /**
     * Gets the shippingDiscount value for this PaymentDetailsType.
     * 
     * @return shippingDiscount   * Shipping discount for this order, specified as a negative number.
     * 						Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingDiscount() {
        return shippingDiscount;
    }


    /**
     * Sets the shippingDiscount value for this PaymentDetailsType.
     * 
     * @param shippingDiscount   * Shipping discount for this order, specified as a negative number.
     * 						Optional
     */
    public void setShippingDiscount(CoreComponentTypes.apis.ebay.BasicAmountType shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }


    /**
     * Gets the insuranceOptionOffered value for this PaymentDetailsType.
     * 
     * @return insuranceOptionOffered   * Information about the Insurance options.
     */
    public java.lang.String getInsuranceOptionOffered() {
        return insuranceOptionOffered;
    }


    /**
     * Sets the insuranceOptionOffered value for this PaymentDetailsType.
     * 
     * @param insuranceOptionOffered   * Information about the Insurance options.
     */
    public void setInsuranceOptionOffered(java.lang.String insuranceOptionOffered) {
        this.insuranceOptionOffered = insuranceOptionOffered;
    }


    /**
     * Gets the allowedPaymentMethod value for this PaymentDetailsType.
     * 
     * @return allowedPaymentMethod   * Allowed payment methods for this transaction.
     */
    public eBLBaseComponents.apis.ebay.AllowedPaymentMethodType getAllowedPaymentMethod() {
        return allowedPaymentMethod;
    }


    /**
     * Sets the allowedPaymentMethod value for this PaymentDetailsType.
     * 
     * @param allowedPaymentMethod   * Allowed payment methods for this transaction.
     */
    public void setAllowedPaymentMethod(eBLBaseComponents.apis.ebay.AllowedPaymentMethodType allowedPaymentMethod) {
        this.allowedPaymentMethod = allowedPaymentMethod;
    }


    /**
     * Gets the enhancedPaymentData value for this PaymentDetailsType.
     * 
     * @return enhancedPaymentData   * Enhanced Data section to accept channel specific data.
     * 						Optional
     * 						Refer to EnhancedPaymentDataType for details.
     */
    public EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType getEnhancedPaymentData() {
        return enhancedPaymentData;
    }


    /**
     * Sets the enhancedPaymentData value for this PaymentDetailsType.
     * 
     * @param enhancedPaymentData   * Enhanced Data section to accept channel specific data.
     * 						Optional
     * 						Refer to EnhancedPaymentDataType for details.
     */
    public void setEnhancedPaymentData(EnhancedDataTypes.apis.ebay.EnhancedPaymentDataType enhancedPaymentData) {
        this.enhancedPaymentData = enhancedPaymentData;
    }


    /**
     * Gets the sellerDetails value for this PaymentDetailsType.
     * 
     * @return sellerDetails   * Details about the seller.
     * 						Optional
     */
    public eBLBaseComponents.apis.ebay.SellerDetailsType getSellerDetails() {
        return sellerDetails;
    }


    /**
     * Sets the sellerDetails value for this PaymentDetailsType.
     * 
     * @param sellerDetails   * Details about the seller.
     * 						Optional
     */
    public void setSellerDetails(eBLBaseComponents.apis.ebay.SellerDetailsType sellerDetails) {
        this.sellerDetails = sellerDetails;
    }


    /**
     * Gets the noteText value for this PaymentDetailsType.
     * 
     * @return noteText   * Note to recipient/seller. 
     * 						Optional 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters.
     */
    public java.lang.String getNoteText() {
        return noteText;
    }


    /**
     * Sets the noteText value for this PaymentDetailsType.
     * 
     * @param noteText   * Note to recipient/seller. 
     * 						Optional 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters.
     */
    public void setNoteText(java.lang.String noteText) {
        this.noteText = noteText;
    }


    /**
     * Gets the transactionId value for this PaymentDetailsType.
     * 
     * @return transactionId   * PayPal Transaction Id, returned once DoExpressCheckout is completed.
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this PaymentDetailsType.
     * 
     * @param transactionId   * PayPal Transaction Id, returned once DoExpressCheckout is completed.
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the paymentAction value for this PaymentDetailsType.
     * 
     * @return paymentAction   * How you want to obtain payment.
     * 						
     * 						
     * 						This payment action input will be used for split payments
     * 						
     * 						
     * 							Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 						
     * 						
     * 							Order indicates that this payment is is an order authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 						
     * 						
     * 							Sale indicates that this is a final sale for which you are
     * requesting payment.
     * 						
     * 						
     * 							IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 						
     * 						
     * 							Character length and limit: Up to 13 single-byte alphabetic
     * characters
     */
    public eBLBaseComponents.apis.ebay.PaymentActionCodeType getPaymentAction() {
        return paymentAction;
    }


    /**
     * Sets the paymentAction value for this PaymentDetailsType.
     * 
     * @param paymentAction   * How you want to obtain payment.
     * 						
     * 						
     * 						This payment action input will be used for split payments
     * 						
     * 						
     * 							Authorization indicates that this payment is a basic authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 						
     * 						
     * 							Order indicates that this payment is is an order authorization
     * subject to settlement with PayPal Authorization and Capture.
     * 						
     * 						
     * 							Sale indicates that this is a final sale for which you are
     * requesting payment.
     * 						
     * 						
     * 							IMPORTANT: You cannot set PaymentAction to Sale on SetExpressCheckoutRequest
     * and then change PaymentAction to Authorization on the final Express
     * Checkout API, DoExpressCheckoutPaymentRequest.
     * 						
     * 						
     * 							Character length and limit: Up to 13 single-byte alphabetic
     * characters
     */
    public void setPaymentAction(eBLBaseComponents.apis.ebay.PaymentActionCodeType paymentAction) {
        this.paymentAction = paymentAction;
    }


    /**
     * Gets the paymentRequestID value for this PaymentDetailsType.
     * 
     * @return paymentRequestID   * Unique identifier and mandatory for the particular payment
     * request in case of multiple payment
     */
    public java.lang.String getPaymentRequestID() {
        return paymentRequestID;
    }


    /**
     * Sets the paymentRequestID value for this PaymentDetailsType.
     * 
     * @param paymentRequestID   * Unique identifier and mandatory for the particular payment
     * request in case of multiple payment
     */
    public void setPaymentRequestID(java.lang.String paymentRequestID) {
        this.paymentRequestID = paymentRequestID;
    }


    /**
     * Gets the orderURL value for this PaymentDetailsType.
     * 
     * @return orderURL   * URL on Merchant site pertaining to this invoice.
     */
    public java.lang.String getOrderURL() {
        return orderURL;
    }


    /**
     * Sets the orderURL value for this PaymentDetailsType.
     * 
     * @param orderURL   * URL on Merchant site pertaining to this invoice.
     */
    public void setOrderURL(java.lang.String orderURL) {
        this.orderURL = orderURL;
    }


    /**
     * Gets the softDescriptor value for this PaymentDetailsType.
     * 
     * @return softDescriptor   * Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored.
     */
    public java.lang.String getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this PaymentDetailsType.
     * 
     * @param softDescriptor   * Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored.
     */
    public void setSoftDescriptor(java.lang.String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the branchLevel value for this PaymentDetailsType.
     * 
     * @return branchLevel   * BranchLevel is used to identify chain payment.
     * 						If BranchLevel is 0 or 1, this payment is where money moves
     * to.
     * 						If BranchLevel greater than 1, this payment contains the actual
     * seller info.	
     * 						
     * 						
     * 						Optional
     */
    public java.math.BigInteger getBranchLevel() {
        return branchLevel;
    }


    /**
     * Sets the branchLevel value for this PaymentDetailsType.
     * 
     * @param branchLevel   * BranchLevel is used to identify chain payment.
     * 						If BranchLevel is 0 or 1, this payment is where money moves
     * to.
     * 						If BranchLevel greater than 1, this payment contains the actual
     * seller info.	
     * 						
     * 						
     * 						Optional
     */
    public void setBranchLevel(java.math.BigInteger branchLevel) {
        this.branchLevel = branchLevel;
    }


    /**
     * Gets the offerDetails value for this PaymentDetailsType.
     * 
     * @return offerDetails   * Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored.
     */
    public eBLBaseComponents.apis.ebay.OfferDetailsType getOfferDetails() {
        return offerDetails;
    }


    /**
     * Sets the offerDetails value for this PaymentDetailsType.
     * 
     * @param offerDetails   * Soft Descriptor supported for Sale and Auth in DEC only. For
     * Order this will be ignored.
     */
    public void setOfferDetails(eBLBaseComponents.apis.ebay.OfferDetailsType offerDetails) {
        this.offerDetails = offerDetails;
    }


    /**
     * Gets the recurring value for this PaymentDetailsType.
     * 
     * @return recurring   * Flag to indicate the recurring transaction
     */
    public eBLBaseComponents.apis.ebay.RecurringFlagType getRecurring() {
        return recurring;
    }


    /**
     * Sets the recurring value for this PaymentDetailsType.
     * 
     * @param recurring   * Flag to indicate the recurring transaction
     */
    public void setRecurring(eBLBaseComponents.apis.ebay.RecurringFlagType recurring) {
        this.recurring = recurring;
    }


    /**
     * Gets the paymentReason value for this PaymentDetailsType.
     * 
     * @return paymentReason   * Indicates the purpose of this payment like Refund
     */
    public eBLBaseComponents.apis.ebay.PaymentReasonType getPaymentReason() {
        return paymentReason;
    }


    /**
     * Sets the paymentReason value for this PaymentDetailsType.
     * 
     * @param paymentReason   * Indicates the purpose of this payment like Refund
     */
    public void setPaymentReason(eBLBaseComponents.apis.ebay.PaymentReasonType paymentReason) {
        this.paymentReason = paymentReason;
    }


    /**
     * Gets the redeemedOffers value for this PaymentDetailsType.
     * 
     * @return redeemedOffers   * For instance single use coupons should not be
     * 						returned in future CheckIn calls once they are redeemed.
     */
    public eBLBaseComponents.apis.ebay.DiscountInfoType[] getRedeemedOffers() {
        return redeemedOffers;
    }


    /**
     * Sets the redeemedOffers value for this PaymentDetailsType.
     * 
     * @param redeemedOffers   * For instance single use coupons should not be
     * 						returned in future CheckIn calls once they are redeemed.
     */
    public void setRedeemedOffers(eBLBaseComponents.apis.ebay.DiscountInfoType[] redeemedOffers) {
        this.redeemedOffers = redeemedOffers;
    }

    public eBLBaseComponents.apis.ebay.DiscountInfoType getRedeemedOffers(int i) {
        return this.redeemedOffers[i];
    }

    public void setRedeemedOffers(int i, eBLBaseComponents.apis.ebay.DiscountInfoType _value) {
        this.redeemedOffers[i] = _value;
    }


    /**
     * Gets the cummulativePoints value for this PaymentDetailsType.
     * 
     * @return cummulativePoints   * Total loyalty points for a given id accumulated by the consumre
     * so far.
     */
    public eBLBaseComponents.apis.ebay.DiscountInfoType[] getCummulativePoints() {
        return cummulativePoints;
    }


    /**
     * Sets the cummulativePoints value for this PaymentDetailsType.
     * 
     * @param cummulativePoints   * Total loyalty points for a given id accumulated by the consumre
     * so far.
     */
    public void setCummulativePoints(eBLBaseComponents.apis.ebay.DiscountInfoType[] cummulativePoints) {
        this.cummulativePoints = cummulativePoints;
    }

    public eBLBaseComponents.apis.ebay.DiscountInfoType getCummulativePoints(int i) {
        return this.cummulativePoints[i];
    }

    public void setCummulativePoints(int i, eBLBaseComponents.apis.ebay.DiscountInfoType _value) {
        this.cummulativePoints[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDetailsType)) return false;
        PaymentDetailsType other = (PaymentDetailsType) obj;
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
            ((this.itemTotal==null && other.getItemTotal()==null) || 
             (this.itemTotal!=null &&
              this.itemTotal.equals(other.getItemTotal()))) &&
            ((this.shippingTotal==null && other.getShippingTotal()==null) || 
             (this.shippingTotal!=null &&
              this.shippingTotal.equals(other.getShippingTotal()))) &&
            ((this.handlingTotal==null && other.getHandlingTotal()==null) || 
             (this.handlingTotal!=null &&
              this.handlingTotal.equals(other.getHandlingTotal()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.orderDescription==null && other.getOrderDescription()==null) || 
             (this.orderDescription!=null &&
              this.orderDescription.equals(other.getOrderDescription()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.buttonSource==null && other.getButtonSource()==null) || 
             (this.buttonSource!=null &&
              this.buttonSource.equals(other.getButtonSource()))) &&
            ((this.notifyURL==null && other.getNotifyURL()==null) || 
             (this.notifyURL!=null &&
              this.notifyURL.equals(other.getNotifyURL()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.multiShipping==null && other.getMultiShipping()==null) || 
             (this.multiShipping!=null &&
              this.multiShipping.equals(other.getMultiShipping()))) &&
            ((this.fulfillmentReferenceNumber==null && other.getFulfillmentReferenceNumber()==null) || 
             (this.fulfillmentReferenceNumber!=null &&
              this.fulfillmentReferenceNumber.equals(other.getFulfillmentReferenceNumber()))) &&
            ((this.fulfillmentAddress==null && other.getFulfillmentAddress()==null) || 
             (this.fulfillmentAddress!=null &&
              this.fulfillmentAddress.equals(other.getFulfillmentAddress()))) &&
            ((this.paymentCategoryType==null && other.getPaymentCategoryType()==null) || 
             (this.paymentCategoryType!=null &&
              this.paymentCategoryType.equals(other.getPaymentCategoryType()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.profileAddressChangeDate==null && other.getProfileAddressChangeDate()==null) || 
             (this.profileAddressChangeDate!=null &&
              this.profileAddressChangeDate.equals(other.getProfileAddressChangeDate()))) &&
            ((this.paymentDetailsItem==null && other.getPaymentDetailsItem()==null) || 
             (this.paymentDetailsItem!=null &&
              java.util.Arrays.equals(this.paymentDetailsItem, other.getPaymentDetailsItem()))) &&
            ((this.insuranceTotal==null && other.getInsuranceTotal()==null) || 
             (this.insuranceTotal!=null &&
              this.insuranceTotal.equals(other.getInsuranceTotal()))) &&
            ((this.shippingDiscount==null && other.getShippingDiscount()==null) || 
             (this.shippingDiscount!=null &&
              this.shippingDiscount.equals(other.getShippingDiscount()))) &&
            ((this.insuranceOptionOffered==null && other.getInsuranceOptionOffered()==null) || 
             (this.insuranceOptionOffered!=null &&
              this.insuranceOptionOffered.equals(other.getInsuranceOptionOffered()))) &&
            ((this.allowedPaymentMethod==null && other.getAllowedPaymentMethod()==null) || 
             (this.allowedPaymentMethod!=null &&
              this.allowedPaymentMethod.equals(other.getAllowedPaymentMethod()))) &&
            ((this.enhancedPaymentData==null && other.getEnhancedPaymentData()==null) || 
             (this.enhancedPaymentData!=null &&
              this.enhancedPaymentData.equals(other.getEnhancedPaymentData()))) &&
            ((this.sellerDetails==null && other.getSellerDetails()==null) || 
             (this.sellerDetails!=null &&
              this.sellerDetails.equals(other.getSellerDetails()))) &&
            ((this.noteText==null && other.getNoteText()==null) || 
             (this.noteText!=null &&
              this.noteText.equals(other.getNoteText()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.paymentAction==null && other.getPaymentAction()==null) || 
             (this.paymentAction!=null &&
              this.paymentAction.equals(other.getPaymentAction()))) &&
            ((this.paymentRequestID==null && other.getPaymentRequestID()==null) || 
             (this.paymentRequestID!=null &&
              this.paymentRequestID.equals(other.getPaymentRequestID()))) &&
            ((this.orderURL==null && other.getOrderURL()==null) || 
             (this.orderURL!=null &&
              this.orderURL.equals(other.getOrderURL()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.branchLevel==null && other.getBranchLevel()==null) || 
             (this.branchLevel!=null &&
              this.branchLevel.equals(other.getBranchLevel()))) &&
            ((this.offerDetails==null && other.getOfferDetails()==null) || 
             (this.offerDetails!=null &&
              this.offerDetails.equals(other.getOfferDetails()))) &&
            ((this.recurring==null && other.getRecurring()==null) || 
             (this.recurring!=null &&
              this.recurring.equals(other.getRecurring()))) &&
            ((this.paymentReason==null && other.getPaymentReason()==null) || 
             (this.paymentReason!=null &&
              this.paymentReason.equals(other.getPaymentReason()))) &&
            ((this.redeemedOffers==null && other.getRedeemedOffers()==null) || 
             (this.redeemedOffers!=null &&
              java.util.Arrays.equals(this.redeemedOffers, other.getRedeemedOffers()))) &&
            ((this.cummulativePoints==null && other.getCummulativePoints()==null) || 
             (this.cummulativePoints!=null &&
              java.util.Arrays.equals(this.cummulativePoints, other.getCummulativePoints())));
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
        if (getItemTotal() != null) {
            _hashCode += getItemTotal().hashCode();
        }
        if (getShippingTotal() != null) {
            _hashCode += getShippingTotal().hashCode();
        }
        if (getHandlingTotal() != null) {
            _hashCode += getHandlingTotal().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
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
        if (getButtonSource() != null) {
            _hashCode += getButtonSource().hashCode();
        }
        if (getNotifyURL() != null) {
            _hashCode += getNotifyURL().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getMultiShipping() != null) {
            _hashCode += getMultiShipping().hashCode();
        }
        if (getFulfillmentReferenceNumber() != null) {
            _hashCode += getFulfillmentReferenceNumber().hashCode();
        }
        if (getFulfillmentAddress() != null) {
            _hashCode += getFulfillmentAddress().hashCode();
        }
        if (getPaymentCategoryType() != null) {
            _hashCode += getPaymentCategoryType().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getProfileAddressChangeDate() != null) {
            _hashCode += getProfileAddressChangeDate().hashCode();
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
        if (getInsuranceTotal() != null) {
            _hashCode += getInsuranceTotal().hashCode();
        }
        if (getShippingDiscount() != null) {
            _hashCode += getShippingDiscount().hashCode();
        }
        if (getInsuranceOptionOffered() != null) {
            _hashCode += getInsuranceOptionOffered().hashCode();
        }
        if (getAllowedPaymentMethod() != null) {
            _hashCode += getAllowedPaymentMethod().hashCode();
        }
        if (getEnhancedPaymentData() != null) {
            _hashCode += getEnhancedPaymentData().hashCode();
        }
        if (getSellerDetails() != null) {
            _hashCode += getSellerDetails().hashCode();
        }
        if (getNoteText() != null) {
            _hashCode += getNoteText().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getPaymentAction() != null) {
            _hashCode += getPaymentAction().hashCode();
        }
        if (getPaymentRequestID() != null) {
            _hashCode += getPaymentRequestID().hashCode();
        }
        if (getOrderURL() != null) {
            _hashCode += getOrderURL().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getBranchLevel() != null) {
            _hashCode += getBranchLevel().hashCode();
        }
        if (getOfferDetails() != null) {
            _hashCode += getOfferDetails().hashCode();
        }
        if (getRecurring() != null) {
            _hashCode += getRecurring().hashCode();
        }
        if (getPaymentReason() != null) {
            _hashCode += getPaymentReason().hashCode();
        }
        if (getRedeemedOffers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRedeemedOffers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRedeemedOffers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCummulativePoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCummulativePoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCummulativePoints(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HandlingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxTotal"));
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
        elemField.setFieldName("buttonSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifyURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NotifyURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShipToAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MultiShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FulfillmentReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillmentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FulfillmentAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentCategoryType"));
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
        elemField.setFieldName("paymentDetailsItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceOptionOffered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceOptionOffered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedPaymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowedPaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowedPaymentMethodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedPaymentData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedPaymentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedPaymentDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noteText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "NoteText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SoftDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BranchLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recurring");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Recurring"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RecurringFlagType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentReasonType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redeemedOffers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RedeemedOffers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cummulativePoints");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CummulativePoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DiscountInfoType"));
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
