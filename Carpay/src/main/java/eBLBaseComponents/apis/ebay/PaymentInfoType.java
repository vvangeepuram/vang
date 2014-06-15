/**
 * PaymentInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentInfoType 
 * 				Payment information.
 */
public class PaymentInfoType  implements java.io.Serializable {
    /* A transaction identification number. 
     * Character length and limits: 19 single-byte characters maximum */
    private java.lang.String transactionID;

    /* Its Ebay transaction id.
     * 					EbayTransactionID will returned for immediate pay item transaction
     * in ECA */
    private java.lang.String ebayTransactionID;

    /* Parent or related transaction identification number. This field
     * is populated for the following transaction types: 
     * 
     * 						
     * Reversal
     * 
     * Capture of an authorized transaction.
     * 
     * Reauthorization of a transaction.
     * 
     * Capture of an order. The value of ParentTransactionID is the original
     * OrderID.
     * 
     * Authorization of an order. The value of ParentTransactionID is the
     * original OrderID.
     * 
     * Capture of an order authorization.
     * 
     * Void of an order. The value of ParentTransactionID is the original
     * OrderID.
     * 
     * 						
     * Character length and limits: 19 single-byte characters maximum */
    private java.lang.String parentTransactionID;

    /* Receipt ID 
     * 
     * 						
     * Character length and limitations: 16 digits in xxxx-xxxx-xxxx-xxxx
     * format */
    private java.lang.String receiptID;

    /* The type of transaction 
     * 
     * 						
     * cart: Transaction created via the PayPal Shopping Cart feature or
     * by Express Checkout with multiple purchased item
     * 
     * 						
     * express-checkout: Transaction created by Express Checkout with a single
     * purchased items
     * 
     * 						
     * send-money: Transaction created by customer from the Send Money tab
     * on the PayPal website.
     * 
     * 						
     * web-accept: Transaction created by customer via Buy Now, Donation,
     * or Auction Smart Logos.
     * 
     * 						
     * subscr-*: Transaction created by customer via Subscription. eot means
     * "end of subscription term."
     * 
     * 						
     * merch-pmt: preapproved payment.
     * 
     * 						
     * mass-pay: Transaction created via MassPay.
     * 
     * 						
     * virtual-terminal: Transaction created via merchant virtual terminal.
     * 
     * 						
     * credit: Transaction created via merchant virtual terminal or API to
     * credit a customer. */
    private eBLBaseComponents.apis.ebay.PaymentTransactionCodeType transactionType;

    /* The type of payment */
    private eBLBaseComponents.apis.ebay.PaymentCodeType paymentType;

    /* The type of funding source */
    private eBLBaseComponents.apis.ebay.RefundSourceCodeType refundSourceCodeType;

    /* eCheck latest expected clear date */
    private java.util.Calendar expectedeCheckClearDate;

    /* Date and time of payment */
    private java.util.Calendar paymentDate;

    /* Full amount of the customer's payment, before transaction fee
     * is subtracted */
    private CoreComponentTypes.apis.ebay.BasicAmountType grossAmount;

    /* Transaction fee associated with the payment */
    private CoreComponentTypes.apis.ebay.BasicAmountType feeAmount;

    /* Amount deposited into the account's primary balance after a
     * currency conversion from automatic conversion through your Payment
     * Receiving Preferences or manual conversion through manually accepting
     * a payment. This amount is calculated after fees and taxes have been
     * assessed. */
    private CoreComponentTypes.apis.ebay.BasicAmountType settleAmount;

    /* Amount of tax for transaction */
    private CoreComponentTypes.apis.ebay.BasicAmountType taxAmount;

    /* Exchange rate for transaction */
    private java.lang.String exchangeRate;

    /* The status of the payment:
     * 
     * 						
     * None: No status
     * 
     *                         
     * Created: A giropay payment has been initiated.
     * 
     * 						
     * Canceled-Reversal: A reversal has been canceled. For example, you
     * won a dispute with the customer, and the funds for the transaction
     * that was reversed have been returned to you.
     * 
     * 						
     * Completed: The payment has been completed, and the funds have been
     * added successfully to your account balance.
     * 
     * 						
     * Denied: You denied the payment. This happens only if the payment was
     * previously pending because of possible reasons described for the PendingReason
     * element.
     * 
     * 						
     * Expired: This authorization has expired and cannot be captured.
     * 
     * 						
     * Failed: The payment has failed. This happens only if the payment was
     * made from your customer's bank account.
     * 
     * 						
     * In-Progress: The transaction is in process of authorization and capture.
     * 
     * 						
     * Partially-Refunded: The transaction has been partially refunded.
     * 
     * 						
     * Pending: The payment is pending. See "PendingReason" for more information.
     * 
     * 						
     * Refunded: You refunded the payment.
     * 
     * 						
     * Reversed: A payment was reversed due to a chargeback or other type
     * of reversal. The funds have been removed from your account balance
     * and returned to the buyer. The reason for the reversal is specified
     * in the ReasonCode element.
     * 
     * 						
     * Processed: A payment has been accepted.
     * 
     * 						
     * Voided: This authorization has been voided.
     * 
     * 						
     * Completed-Funds-Held: The payment has been completed, and the funds
     * have been added successfully to your pending balance. See the "HoldDecision"
     * field for more information. */
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
     * authorization: You set PaymentAction to Authorization on SetExpressCheckoutRequest
     * and have not yet captured funds.
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
     * regulatory-review: This payment is pending while we make sure it meets
     * regulatory requirements. We'll contact you again in 24-72 hours with
     * the outcome of our review.
     * 
     * 						
     * other: The payment is pending for a reason other than those listed
     * above. For more information, contact PayPal Customer Service. */
    private eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason;

    /* The reason for a reversal if TransactionType is reversal: 
     * none: No reason code
     * 
     * 						
     * chargeback: A reversal has occurred on this transaction due to a chargeback
     * by your customer.
     * 
     * 						
     * guarantee: A reversal has occurred on this transaction due to your
     * customer triggering a money-back guarantee.
     * 
     * 						
     * buyer-complaint: A reversal has occurred on this transaction due to
     * a complaint about the transaction from your customer.
     * 
     * 						
     * refund: A reversal has occurred on this transaction because you have
     * given the customer a refund.
     * 
     * 						
     * other: A reversal has occurred on this transaction due to a reason
     * not listed above. */
    private eBLBaseComponents.apis.ebay.ReversalReasonCodeType reasonCode;

    /* HoldDecision is returned in the response only if PaymentStatus
     * is Completed-Funds-Held. The reason the funds are kept in pending
     * balance: 
     * newsellerpaymenthold: The seller is new.
     * 
     * 						
     * paymenthold: A hold is placed on your transaction due to a reason
     * not listed above. */
    private java.lang.String holdDecision;

    /* Shipping method selected by the user during check-out. */
    private java.lang.String shippingMethod;

    /* Protection Eligibility for this Transaction - None, SPP or
     * ESPP */
    private java.lang.String protectionEligibility;

    /* Protection Eligibility details  for this Transaction */
    private java.lang.String protectionEligibilityType;

    /* Receipt Reference Number for this Transaction */
    private java.lang.String receiptReferenceNumber;

    /* The type of POS transaction
     * 
     *                         
     * F: Forced post transaction. POS merchant can send transactions at
     * a later point if connectivity is lost.
     * 
     *                         
     * S: Single call checkout, and this is to identify PayPal Lite API usage. */
    private eBLBaseComponents.apis.ebay.POSTransactionCodeType POSTransactionType;

    /* Amount of shipping charged on transaction */
    private java.lang.String shipAmount;

    /* Amount of ship handling charged on transaction */
    private java.lang.String shipHandleAmount;

    /* Amount of shipping discount on transaction */
    private java.lang.String shipDiscount;

    /* Amount of Insurance amount on transaction */
    private java.lang.String insuranceAmount;

    /* Subject as entered in the transaction */
    private java.lang.String subject;

    /* StoreID as entered in the transaction */
    private java.lang.String storeID;

    /* TerminalID as entered in the transaction */
    private java.lang.String terminalID;

    /* Details about the seller.
     * 						Optional */
    private eBLBaseComponents.apis.ebay.SellerDetailsType sellerDetails;

    /* Unique identifier and mandatory for each bucket in case of
     * split payement */
    private java.lang.String paymentRequestID;

    /* Thes are filters that could result in accept/deny/pending action. */
    private eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails;

    /* This will be enhanced info for the payment: Example: UATP details */
    private EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType enhancedPaymentInfo;

    /* This will indicate the payment status for individual payment
     * request in case of split payment */
    private eBLBaseComponents.apis.ebay.ErrorType paymentError;

    /* Type of the payment instrument. */
    private eBLBaseComponents.apis.ebay.InstrumentDetailsType instrumentDetails;

    /* Offer Details. */
    private eBLBaseComponents.apis.ebay.OfferDetailsType offerDetails;

    /* This field indicates whether the credit card number used for
     * this transaction is in a particular bin range registered with PayPal
     * by the merchant. 
     * 						This filed is optional and will be present if merchant has a
     * registered bin range. 
     * 						The value of this field will be "true"  if merchant has a registered
     * bin range and the credit card used in the transaction is within the
     * registered bin range.
     * 						The value of this field will be false if merchant has a registered
     * bin range and credit card used in the transaction outside registered
     * bin range or the transaction is not done using a credit card. */
    private java.lang.String binEligibility;

    public PaymentInfoType() {
    }

    public PaymentInfoType(
           java.lang.String transactionID,
           java.lang.String ebayTransactionID,
           java.lang.String parentTransactionID,
           java.lang.String receiptID,
           eBLBaseComponents.apis.ebay.PaymentTransactionCodeType transactionType,
           eBLBaseComponents.apis.ebay.PaymentCodeType paymentType,
           eBLBaseComponents.apis.ebay.RefundSourceCodeType refundSourceCodeType,
           java.util.Calendar expectedeCheckClearDate,
           java.util.Calendar paymentDate,
           CoreComponentTypes.apis.ebay.BasicAmountType grossAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType feeAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType settleAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType taxAmount,
           java.lang.String exchangeRate,
           eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus,
           eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason,
           eBLBaseComponents.apis.ebay.ReversalReasonCodeType reasonCode,
           java.lang.String holdDecision,
           java.lang.String shippingMethod,
           java.lang.String protectionEligibility,
           java.lang.String protectionEligibilityType,
           java.lang.String receiptReferenceNumber,
           eBLBaseComponents.apis.ebay.POSTransactionCodeType POSTransactionType,
           java.lang.String shipAmount,
           java.lang.String shipHandleAmount,
           java.lang.String shipDiscount,
           java.lang.String insuranceAmount,
           java.lang.String subject,
           java.lang.String storeID,
           java.lang.String terminalID,
           eBLBaseComponents.apis.ebay.SellerDetailsType sellerDetails,
           java.lang.String paymentRequestID,
           eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails,
           EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType enhancedPaymentInfo,
           eBLBaseComponents.apis.ebay.ErrorType paymentError,
           eBLBaseComponents.apis.ebay.InstrumentDetailsType instrumentDetails,
           eBLBaseComponents.apis.ebay.OfferDetailsType offerDetails,
           java.lang.String binEligibility) {
           this.transactionID = transactionID;
           this.ebayTransactionID = ebayTransactionID;
           this.parentTransactionID = parentTransactionID;
           this.receiptID = receiptID;
           this.transactionType = transactionType;
           this.paymentType = paymentType;
           this.refundSourceCodeType = refundSourceCodeType;
           this.expectedeCheckClearDate = expectedeCheckClearDate;
           this.paymentDate = paymentDate;
           this.grossAmount = grossAmount;
           this.feeAmount = feeAmount;
           this.settleAmount = settleAmount;
           this.taxAmount = taxAmount;
           this.exchangeRate = exchangeRate;
           this.paymentStatus = paymentStatus;
           this.pendingReason = pendingReason;
           this.reasonCode = reasonCode;
           this.holdDecision = holdDecision;
           this.shippingMethod = shippingMethod;
           this.protectionEligibility = protectionEligibility;
           this.protectionEligibilityType = protectionEligibilityType;
           this.receiptReferenceNumber = receiptReferenceNumber;
           this.POSTransactionType = POSTransactionType;
           this.shipAmount = shipAmount;
           this.shipHandleAmount = shipHandleAmount;
           this.shipDiscount = shipDiscount;
           this.insuranceAmount = insuranceAmount;
           this.subject = subject;
           this.storeID = storeID;
           this.terminalID = terminalID;
           this.sellerDetails = sellerDetails;
           this.paymentRequestID = paymentRequestID;
           this.FMFDetails = FMFDetails;
           this.enhancedPaymentInfo = enhancedPaymentInfo;
           this.paymentError = paymentError;
           this.instrumentDetails = instrumentDetails;
           this.offerDetails = offerDetails;
           this.binEligibility = binEligibility;
    }


    /**
     * Gets the transactionID value for this PaymentInfoType.
     * 
     * @return transactionID   * A transaction identification number. 
     * Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this PaymentInfoType.
     * 
     * @param transactionID   * A transaction identification number. 
     * Character length and limits: 19 single-byte characters maximum
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the ebayTransactionID value for this PaymentInfoType.
     * 
     * @return ebayTransactionID   * Its Ebay transaction id.
     * 					EbayTransactionID will returned for immediate pay item transaction
     * in ECA
     */
    public java.lang.String getEbayTransactionID() {
        return ebayTransactionID;
    }


    /**
     * Sets the ebayTransactionID value for this PaymentInfoType.
     * 
     * @param ebayTransactionID   * Its Ebay transaction id.
     * 					EbayTransactionID will returned for immediate pay item transaction
     * in ECA
     */
    public void setEbayTransactionID(java.lang.String ebayTransactionID) {
        this.ebayTransactionID = ebayTransactionID;
    }


    /**
     * Gets the parentTransactionID value for this PaymentInfoType.
     * 
     * @return parentTransactionID   * Parent or related transaction identification number. This field
     * is populated for the following transaction types: 
     * 
     * 						
     * Reversal
     * 
     * Capture of an authorized transaction.
     * 
     * Reauthorization of a transaction.
     * 
     * Capture of an order. The value of ParentTransactionID is the original
     * OrderID.
     * 
     * Authorization of an order. The value of ParentTransactionID is the
     * original OrderID.
     * 
     * Capture of an order authorization.
     * 
     * Void of an order. The value of ParentTransactionID is the original
     * OrderID.
     * 
     * 						
     * Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getParentTransactionID() {
        return parentTransactionID;
    }


    /**
     * Sets the parentTransactionID value for this PaymentInfoType.
     * 
     * @param parentTransactionID   * Parent or related transaction identification number. This field
     * is populated for the following transaction types: 
     * 
     * 						
     * Reversal
     * 
     * Capture of an authorized transaction.
     * 
     * Reauthorization of a transaction.
     * 
     * Capture of an order. The value of ParentTransactionID is the original
     * OrderID.
     * 
     * Authorization of an order. The value of ParentTransactionID is the
     * original OrderID.
     * 
     * Capture of an order authorization.
     * 
     * Void of an order. The value of ParentTransactionID is the original
     * OrderID.
     * 
     * 						
     * Character length and limits: 19 single-byte characters maximum
     */
    public void setParentTransactionID(java.lang.String parentTransactionID) {
        this.parentTransactionID = parentTransactionID;
    }


    /**
     * Gets the receiptID value for this PaymentInfoType.
     * 
     * @return receiptID   * Receipt ID 
     * 
     * 						
     * Character length and limitations: 16 digits in xxxx-xxxx-xxxx-xxxx
     * format
     */
    public java.lang.String getReceiptID() {
        return receiptID;
    }


    /**
     * Sets the receiptID value for this PaymentInfoType.
     * 
     * @param receiptID   * Receipt ID 
     * 
     * 						
     * Character length and limitations: 16 digits in xxxx-xxxx-xxxx-xxxx
     * format
     */
    public void setReceiptID(java.lang.String receiptID) {
        this.receiptID = receiptID;
    }


    /**
     * Gets the transactionType value for this PaymentInfoType.
     * 
     * @return transactionType   * The type of transaction 
     * 
     * 						
     * cart: Transaction created via the PayPal Shopping Cart feature or
     * by Express Checkout with multiple purchased item
     * 
     * 						
     * express-checkout: Transaction created by Express Checkout with a single
     * purchased items
     * 
     * 						
     * send-money: Transaction created by customer from the Send Money tab
     * on the PayPal website.
     * 
     * 						
     * web-accept: Transaction created by customer via Buy Now, Donation,
     * or Auction Smart Logos.
     * 
     * 						
     * subscr-*: Transaction created by customer via Subscription. eot means
     * "end of subscription term."
     * 
     * 						
     * merch-pmt: preapproved payment.
     * 
     * 						
     * mass-pay: Transaction created via MassPay.
     * 
     * 						
     * virtual-terminal: Transaction created via merchant virtual terminal.
     * 
     * 						
     * credit: Transaction created via merchant virtual terminal or API to
     * credit a customer.
     */
    public eBLBaseComponents.apis.ebay.PaymentTransactionCodeType getTransactionType() {
        return transactionType;
    }


    /**
     * Sets the transactionType value for this PaymentInfoType.
     * 
     * @param transactionType   * The type of transaction 
     * 
     * 						
     * cart: Transaction created via the PayPal Shopping Cart feature or
     * by Express Checkout with multiple purchased item
     * 
     * 						
     * express-checkout: Transaction created by Express Checkout with a single
     * purchased items
     * 
     * 						
     * send-money: Transaction created by customer from the Send Money tab
     * on the PayPal website.
     * 
     * 						
     * web-accept: Transaction created by customer via Buy Now, Donation,
     * or Auction Smart Logos.
     * 
     * 						
     * subscr-*: Transaction created by customer via Subscription. eot means
     * "end of subscription term."
     * 
     * 						
     * merch-pmt: preapproved payment.
     * 
     * 						
     * mass-pay: Transaction created via MassPay.
     * 
     * 						
     * virtual-terminal: Transaction created via merchant virtual terminal.
     * 
     * 						
     * credit: Transaction created via merchant virtual terminal or API to
     * credit a customer.
     */
    public void setTransactionType(eBLBaseComponents.apis.ebay.PaymentTransactionCodeType transactionType) {
        this.transactionType = transactionType;
    }


    /**
     * Gets the paymentType value for this PaymentInfoType.
     * 
     * @return paymentType   * The type of payment
     */
    public eBLBaseComponents.apis.ebay.PaymentCodeType getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this PaymentInfoType.
     * 
     * @param paymentType   * The type of payment
     */
    public void setPaymentType(eBLBaseComponents.apis.ebay.PaymentCodeType paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the refundSourceCodeType value for this PaymentInfoType.
     * 
     * @return refundSourceCodeType   * The type of funding source
     */
    public eBLBaseComponents.apis.ebay.RefundSourceCodeType getRefundSourceCodeType() {
        return refundSourceCodeType;
    }


    /**
     * Sets the refundSourceCodeType value for this PaymentInfoType.
     * 
     * @param refundSourceCodeType   * The type of funding source
     */
    public void setRefundSourceCodeType(eBLBaseComponents.apis.ebay.RefundSourceCodeType refundSourceCodeType) {
        this.refundSourceCodeType = refundSourceCodeType;
    }


    /**
     * Gets the expectedeCheckClearDate value for this PaymentInfoType.
     * 
     * @return expectedeCheckClearDate   * eCheck latest expected clear date
     */
    public java.util.Calendar getExpectedeCheckClearDate() {
        return expectedeCheckClearDate;
    }


    /**
     * Sets the expectedeCheckClearDate value for this PaymentInfoType.
     * 
     * @param expectedeCheckClearDate   * eCheck latest expected clear date
     */
    public void setExpectedeCheckClearDate(java.util.Calendar expectedeCheckClearDate) {
        this.expectedeCheckClearDate = expectedeCheckClearDate;
    }


    /**
     * Gets the paymentDate value for this PaymentInfoType.
     * 
     * @return paymentDate   * Date and time of payment
     */
    public java.util.Calendar getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this PaymentInfoType.
     * 
     * @param paymentDate   * Date and time of payment
     */
    public void setPaymentDate(java.util.Calendar paymentDate) {
        this.paymentDate = paymentDate;
    }


    /**
     * Gets the grossAmount value for this PaymentInfoType.
     * 
     * @return grossAmount   * Full amount of the customer's payment, before transaction fee
     * is subtracted
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this PaymentInfoType.
     * 
     * @param grossAmount   * Full amount of the customer's payment, before transaction fee
     * is subtracted
     */
    public void setGrossAmount(CoreComponentTypes.apis.ebay.BasicAmountType grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the feeAmount value for this PaymentInfoType.
     * 
     * @return feeAmount   * Transaction fee associated with the payment
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this PaymentInfoType.
     * 
     * @param feeAmount   * Transaction fee associated with the payment
     */
    public void setFeeAmount(CoreComponentTypes.apis.ebay.BasicAmountType feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the settleAmount value for this PaymentInfoType.
     * 
     * @return settleAmount   * Amount deposited into the account's primary balance after a
     * currency conversion from automatic conversion through your Payment
     * Receiving Preferences or manual conversion through manually accepting
     * a payment. This amount is calculated after fees and taxes have been
     * assessed.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getSettleAmount() {
        return settleAmount;
    }


    /**
     * Sets the settleAmount value for this PaymentInfoType.
     * 
     * @param settleAmount   * Amount deposited into the account's primary balance after a
     * currency conversion from automatic conversion through your Payment
     * Receiving Preferences or manual conversion through manually accepting
     * a payment. This amount is calculated after fees and taxes have been
     * assessed.
     */
    public void setSettleAmount(CoreComponentTypes.apis.ebay.BasicAmountType settleAmount) {
        this.settleAmount = settleAmount;
    }


    /**
     * Gets the taxAmount value for this PaymentInfoType.
     * 
     * @return taxAmount   * Amount of tax for transaction
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this PaymentInfoType.
     * 
     * @param taxAmount   * Amount of tax for transaction
     */
    public void setTaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType taxAmount) {
        this.taxAmount = taxAmount;
    }


    /**
     * Gets the exchangeRate value for this PaymentInfoType.
     * 
     * @return exchangeRate   * Exchange rate for transaction
     */
    public java.lang.String getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this PaymentInfoType.
     * 
     * @param exchangeRate   * Exchange rate for transaction
     */
    public void setExchangeRate(java.lang.String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the paymentStatus value for this PaymentInfoType.
     * 
     * @return paymentStatus   * The status of the payment:
     * 
     * 						
     * None: No status
     * 
     *                         
     * Created: A giropay payment has been initiated.
     * 
     * 						
     * Canceled-Reversal: A reversal has been canceled. For example, you
     * won a dispute with the customer, and the funds for the transaction
     * that was reversed have been returned to you.
     * 
     * 						
     * Completed: The payment has been completed, and the funds have been
     * added successfully to your account balance.
     * 
     * 						
     * Denied: You denied the payment. This happens only if the payment was
     * previously pending because of possible reasons described for the PendingReason
     * element.
     * 
     * 						
     * Expired: This authorization has expired and cannot be captured.
     * 
     * 						
     * Failed: The payment has failed. This happens only if the payment was
     * made from your customer's bank account.
     * 
     * 						
     * In-Progress: The transaction is in process of authorization and capture.
     * 
     * 						
     * Partially-Refunded: The transaction has been partially refunded.
     * 
     * 						
     * Pending: The payment is pending. See "PendingReason" for more information.
     * 
     * 						
     * Refunded: You refunded the payment.
     * 
     * 						
     * Reversed: A payment was reversed due to a chargeback or other type
     * of reversal. The funds have been removed from your account balance
     * and returned to the buyer. The reason for the reversal is specified
     * in the ReasonCode element.
     * 
     * 						
     * Processed: A payment has been accepted.
     * 
     * 						
     * Voided: This authorization has been voided.
     * 
     * 						
     * Completed-Funds-Held: The payment has been completed, and the funds
     * have been added successfully to your pending balance. See the "HoldDecision"
     * field for more information.
     */
    public eBLBaseComponents.apis.ebay.PaymentStatusCodeType getPaymentStatus() {
        return paymentStatus;
    }


    /**
     * Sets the paymentStatus value for this PaymentInfoType.
     * 
     * @param paymentStatus   * The status of the payment:
     * 
     * 						
     * None: No status
     * 
     *                         
     * Created: A giropay payment has been initiated.
     * 
     * 						
     * Canceled-Reversal: A reversal has been canceled. For example, you
     * won a dispute with the customer, and the funds for the transaction
     * that was reversed have been returned to you.
     * 
     * 						
     * Completed: The payment has been completed, and the funds have been
     * added successfully to your account balance.
     * 
     * 						
     * Denied: You denied the payment. This happens only if the payment was
     * previously pending because of possible reasons described for the PendingReason
     * element.
     * 
     * 						
     * Expired: This authorization has expired and cannot be captured.
     * 
     * 						
     * Failed: The payment has failed. This happens only if the payment was
     * made from your customer's bank account.
     * 
     * 						
     * In-Progress: The transaction is in process of authorization and capture.
     * 
     * 						
     * Partially-Refunded: The transaction has been partially refunded.
     * 
     * 						
     * Pending: The payment is pending. See "PendingReason" for more information.
     * 
     * 						
     * Refunded: You refunded the payment.
     * 
     * 						
     * Reversed: A payment was reversed due to a chargeback or other type
     * of reversal. The funds have been removed from your account balance
     * and returned to the buyer. The reason for the reversal is specified
     * in the ReasonCode element.
     * 
     * 						
     * Processed: A payment has been accepted.
     * 
     * 						
     * Voided: This authorization has been voided.
     * 
     * 						
     * Completed-Funds-Held: The payment has been completed, and the funds
     * have been added successfully to your pending balance. See the "HoldDecision"
     * field for more information.
     */
    public void setPaymentStatus(eBLBaseComponents.apis.ebay.PaymentStatusCodeType paymentStatus) {
        this.paymentStatus = paymentStatus;
    }


    /**
     * Gets the pendingReason value for this PaymentInfoType.
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
     * authorization: You set PaymentAction to Authorization on SetExpressCheckoutRequest
     * and have not yet captured funds.
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
     * regulatory-review: This payment is pending while we make sure it meets
     * regulatory requirements. We'll contact you again in 24-72 hours with
     * the outcome of our review.
     * 
     * 						
     * other: The payment is pending for a reason other than those listed
     * above. For more information, contact PayPal Customer Service.
     */
    public eBLBaseComponents.apis.ebay.PendingStatusCodeType getPendingReason() {
        return pendingReason;
    }


    /**
     * Sets the pendingReason value for this PaymentInfoType.
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
     * authorization: You set PaymentAction to Authorization on SetExpressCheckoutRequest
     * and have not yet captured funds.
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
     * regulatory-review: This payment is pending while we make sure it meets
     * regulatory requirements. We'll contact you again in 24-72 hours with
     * the outcome of our review.
     * 
     * 						
     * other: The payment is pending for a reason other than those listed
     * above. For more information, contact PayPal Customer Service.
     */
    public void setPendingReason(eBLBaseComponents.apis.ebay.PendingStatusCodeType pendingReason) {
        this.pendingReason = pendingReason;
    }


    /**
     * Gets the reasonCode value for this PaymentInfoType.
     * 
     * @return reasonCode   * The reason for a reversal if TransactionType is reversal: 
     * none: No reason code
     * 
     * 						
     * chargeback: A reversal has occurred on this transaction due to a chargeback
     * by your customer.
     * 
     * 						
     * guarantee: A reversal has occurred on this transaction due to your
     * customer triggering a money-back guarantee.
     * 
     * 						
     * buyer-complaint: A reversal has occurred on this transaction due to
     * a complaint about the transaction from your customer.
     * 
     * 						
     * refund: A reversal has occurred on this transaction because you have
     * given the customer a refund.
     * 
     * 						
     * other: A reversal has occurred on this transaction due to a reason
     * not listed above.
     */
    public eBLBaseComponents.apis.ebay.ReversalReasonCodeType getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this PaymentInfoType.
     * 
     * @param reasonCode   * The reason for a reversal if TransactionType is reversal: 
     * none: No reason code
     * 
     * 						
     * chargeback: A reversal has occurred on this transaction due to a chargeback
     * by your customer.
     * 
     * 						
     * guarantee: A reversal has occurred on this transaction due to your
     * customer triggering a money-back guarantee.
     * 
     * 						
     * buyer-complaint: A reversal has occurred on this transaction due to
     * a complaint about the transaction from your customer.
     * 
     * 						
     * refund: A reversal has occurred on this transaction because you have
     * given the customer a refund.
     * 
     * 						
     * other: A reversal has occurred on this transaction due to a reason
     * not listed above.
     */
    public void setReasonCode(eBLBaseComponents.apis.ebay.ReversalReasonCodeType reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the holdDecision value for this PaymentInfoType.
     * 
     * @return holdDecision   * HoldDecision is returned in the response only if PaymentStatus
     * is Completed-Funds-Held. The reason the funds are kept in pending
     * balance: 
     * newsellerpaymenthold: The seller is new.
     * 
     * 						
     * paymenthold: A hold is placed on your transaction due to a reason
     * not listed above.
     */
    public java.lang.String getHoldDecision() {
        return holdDecision;
    }


    /**
     * Sets the holdDecision value for this PaymentInfoType.
     * 
     * @param holdDecision   * HoldDecision is returned in the response only if PaymentStatus
     * is Completed-Funds-Held. The reason the funds are kept in pending
     * balance: 
     * newsellerpaymenthold: The seller is new.
     * 
     * 						
     * paymenthold: A hold is placed on your transaction due to a reason
     * not listed above.
     */
    public void setHoldDecision(java.lang.String holdDecision) {
        this.holdDecision = holdDecision;
    }


    /**
     * Gets the shippingMethod value for this PaymentInfoType.
     * 
     * @return shippingMethod   * Shipping method selected by the user during check-out.
     */
    public java.lang.String getShippingMethod() {
        return shippingMethod;
    }


    /**
     * Sets the shippingMethod value for this PaymentInfoType.
     * 
     * @param shippingMethod   * Shipping method selected by the user during check-out.
     */
    public void setShippingMethod(java.lang.String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }


    /**
     * Gets the protectionEligibility value for this PaymentInfoType.
     * 
     * @return protectionEligibility   * Protection Eligibility for this Transaction - None, SPP or
     * ESPP
     */
    public java.lang.String getProtectionEligibility() {
        return protectionEligibility;
    }


    /**
     * Sets the protectionEligibility value for this PaymentInfoType.
     * 
     * @param protectionEligibility   * Protection Eligibility for this Transaction - None, SPP or
     * ESPP
     */
    public void setProtectionEligibility(java.lang.String protectionEligibility) {
        this.protectionEligibility = protectionEligibility;
    }


    /**
     * Gets the protectionEligibilityType value for this PaymentInfoType.
     * 
     * @return protectionEligibilityType   * Protection Eligibility details  for this Transaction
     */
    public java.lang.String getProtectionEligibilityType() {
        return protectionEligibilityType;
    }


    /**
     * Sets the protectionEligibilityType value for this PaymentInfoType.
     * 
     * @param protectionEligibilityType   * Protection Eligibility details  for this Transaction
     */
    public void setProtectionEligibilityType(java.lang.String protectionEligibilityType) {
        this.protectionEligibilityType = protectionEligibilityType;
    }


    /**
     * Gets the receiptReferenceNumber value for this PaymentInfoType.
     * 
     * @return receiptReferenceNumber   * Receipt Reference Number for this Transaction
     */
    public java.lang.String getReceiptReferenceNumber() {
        return receiptReferenceNumber;
    }


    /**
     * Sets the receiptReferenceNumber value for this PaymentInfoType.
     * 
     * @param receiptReferenceNumber   * Receipt Reference Number for this Transaction
     */
    public void setReceiptReferenceNumber(java.lang.String receiptReferenceNumber) {
        this.receiptReferenceNumber = receiptReferenceNumber;
    }


    /**
     * Gets the POSTransactionType value for this PaymentInfoType.
     * 
     * @return POSTransactionType   * The type of POS transaction
     * 
     *                         
     * F: Forced post transaction. POS merchant can send transactions at
     * a later point if connectivity is lost.
     * 
     *                         
     * S: Single call checkout, and this is to identify PayPal Lite API usage.
     */
    public eBLBaseComponents.apis.ebay.POSTransactionCodeType getPOSTransactionType() {
        return POSTransactionType;
    }


    /**
     * Sets the POSTransactionType value for this PaymentInfoType.
     * 
     * @param POSTransactionType   * The type of POS transaction
     * 
     *                         
     * F: Forced post transaction. POS merchant can send transactions at
     * a later point if connectivity is lost.
     * 
     *                         
     * S: Single call checkout, and this is to identify PayPal Lite API usage.
     */
    public void setPOSTransactionType(eBLBaseComponents.apis.ebay.POSTransactionCodeType POSTransactionType) {
        this.POSTransactionType = POSTransactionType;
    }


    /**
     * Gets the shipAmount value for this PaymentInfoType.
     * 
     * @return shipAmount   * Amount of shipping charged on transaction
     */
    public java.lang.String getShipAmount() {
        return shipAmount;
    }


    /**
     * Sets the shipAmount value for this PaymentInfoType.
     * 
     * @param shipAmount   * Amount of shipping charged on transaction
     */
    public void setShipAmount(java.lang.String shipAmount) {
        this.shipAmount = shipAmount;
    }


    /**
     * Gets the shipHandleAmount value for this PaymentInfoType.
     * 
     * @return shipHandleAmount   * Amount of ship handling charged on transaction
     */
    public java.lang.String getShipHandleAmount() {
        return shipHandleAmount;
    }


    /**
     * Sets the shipHandleAmount value for this PaymentInfoType.
     * 
     * @param shipHandleAmount   * Amount of ship handling charged on transaction
     */
    public void setShipHandleAmount(java.lang.String shipHandleAmount) {
        this.shipHandleAmount = shipHandleAmount;
    }


    /**
     * Gets the shipDiscount value for this PaymentInfoType.
     * 
     * @return shipDiscount   * Amount of shipping discount on transaction
     */
    public java.lang.String getShipDiscount() {
        return shipDiscount;
    }


    /**
     * Sets the shipDiscount value for this PaymentInfoType.
     * 
     * @param shipDiscount   * Amount of shipping discount on transaction
     */
    public void setShipDiscount(java.lang.String shipDiscount) {
        this.shipDiscount = shipDiscount;
    }


    /**
     * Gets the insuranceAmount value for this PaymentInfoType.
     * 
     * @return insuranceAmount   * Amount of Insurance amount on transaction
     */
    public java.lang.String getInsuranceAmount() {
        return insuranceAmount;
    }


    /**
     * Sets the insuranceAmount value for this PaymentInfoType.
     * 
     * @param insuranceAmount   * Amount of Insurance amount on transaction
     */
    public void setInsuranceAmount(java.lang.String insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }


    /**
     * Gets the subject value for this PaymentInfoType.
     * 
     * @return subject   * Subject as entered in the transaction
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this PaymentInfoType.
     * 
     * @param subject   * Subject as entered in the transaction
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the storeID value for this PaymentInfoType.
     * 
     * @return storeID   * StoreID as entered in the transaction
     */
    public java.lang.String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this PaymentInfoType.
     * 
     * @param storeID   * StoreID as entered in the transaction
     */
    public void setStoreID(java.lang.String storeID) {
        this.storeID = storeID;
    }


    /**
     * Gets the terminalID value for this PaymentInfoType.
     * 
     * @return terminalID   * TerminalID as entered in the transaction
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this PaymentInfoType.
     * 
     * @param terminalID   * TerminalID as entered in the transaction
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }


    /**
     * Gets the sellerDetails value for this PaymentInfoType.
     * 
     * @return sellerDetails   * Details about the seller.
     * 						Optional
     */
    public eBLBaseComponents.apis.ebay.SellerDetailsType getSellerDetails() {
        return sellerDetails;
    }


    /**
     * Sets the sellerDetails value for this PaymentInfoType.
     * 
     * @param sellerDetails   * Details about the seller.
     * 						Optional
     */
    public void setSellerDetails(eBLBaseComponents.apis.ebay.SellerDetailsType sellerDetails) {
        this.sellerDetails = sellerDetails;
    }


    /**
     * Gets the paymentRequestID value for this PaymentInfoType.
     * 
     * @return paymentRequestID   * Unique identifier and mandatory for each bucket in case of
     * split payement
     */
    public java.lang.String getPaymentRequestID() {
        return paymentRequestID;
    }


    /**
     * Sets the paymentRequestID value for this PaymentInfoType.
     * 
     * @param paymentRequestID   * Unique identifier and mandatory for each bucket in case of
     * split payement
     */
    public void setPaymentRequestID(java.lang.String paymentRequestID) {
        this.paymentRequestID = paymentRequestID;
    }


    /**
     * Gets the FMFDetails value for this PaymentInfoType.
     * 
     * @return FMFDetails   * Thes are filters that could result in accept/deny/pending action.
     */
    public eBLBaseComponents.apis.ebay.FMFDetailsType getFMFDetails() {
        return FMFDetails;
    }


    /**
     * Sets the FMFDetails value for this PaymentInfoType.
     * 
     * @param FMFDetails   * Thes are filters that could result in accept/deny/pending action.
     */
    public void setFMFDetails(eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails) {
        this.FMFDetails = FMFDetails;
    }


    /**
     * Gets the enhancedPaymentInfo value for this PaymentInfoType.
     * 
     * @return enhancedPaymentInfo   * This will be enhanced info for the payment: Example: UATP details
     */
    public EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType getEnhancedPaymentInfo() {
        return enhancedPaymentInfo;
    }


    /**
     * Sets the enhancedPaymentInfo value for this PaymentInfoType.
     * 
     * @param enhancedPaymentInfo   * This will be enhanced info for the payment: Example: UATP details
     */
    public void setEnhancedPaymentInfo(EnhancedDataTypes.apis.ebay.EnhancedPaymentInfoType enhancedPaymentInfo) {
        this.enhancedPaymentInfo = enhancedPaymentInfo;
    }


    /**
     * Gets the paymentError value for this PaymentInfoType.
     * 
     * @return paymentError   * This will indicate the payment status for individual payment
     * request in case of split payment
     */
    public eBLBaseComponents.apis.ebay.ErrorType getPaymentError() {
        return paymentError;
    }


    /**
     * Sets the paymentError value for this PaymentInfoType.
     * 
     * @param paymentError   * This will indicate the payment status for individual payment
     * request in case of split payment
     */
    public void setPaymentError(eBLBaseComponents.apis.ebay.ErrorType paymentError) {
        this.paymentError = paymentError;
    }


    /**
     * Gets the instrumentDetails value for this PaymentInfoType.
     * 
     * @return instrumentDetails   * Type of the payment instrument.
     */
    public eBLBaseComponents.apis.ebay.InstrumentDetailsType getInstrumentDetails() {
        return instrumentDetails;
    }


    /**
     * Sets the instrumentDetails value for this PaymentInfoType.
     * 
     * @param instrumentDetails   * Type of the payment instrument.
     */
    public void setInstrumentDetails(eBLBaseComponents.apis.ebay.InstrumentDetailsType instrumentDetails) {
        this.instrumentDetails = instrumentDetails;
    }


    /**
     * Gets the offerDetails value for this PaymentInfoType.
     * 
     * @return offerDetails   * Offer Details.
     */
    public eBLBaseComponents.apis.ebay.OfferDetailsType getOfferDetails() {
        return offerDetails;
    }


    /**
     * Sets the offerDetails value for this PaymentInfoType.
     * 
     * @param offerDetails   * Offer Details.
     */
    public void setOfferDetails(eBLBaseComponents.apis.ebay.OfferDetailsType offerDetails) {
        this.offerDetails = offerDetails;
    }


    /**
     * Gets the binEligibility value for this PaymentInfoType.
     * 
     * @return binEligibility   * This field indicates whether the credit card number used for
     * this transaction is in a particular bin range registered with PayPal
     * by the merchant. 
     * 						This filed is optional and will be present if merchant has a
     * registered bin range. 
     * 						The value of this field will be "true"  if merchant has a registered
     * bin range and the credit card used in the transaction is within the
     * registered bin range.
     * 						The value of this field will be false if merchant has a registered
     * bin range and credit card used in the transaction outside registered
     * bin range or the transaction is not done using a credit card.
     */
    public java.lang.String getBinEligibility() {
        return binEligibility;
    }


    /**
     * Sets the binEligibility value for this PaymentInfoType.
     * 
     * @param binEligibility   * This field indicates whether the credit card number used for
     * this transaction is in a particular bin range registered with PayPal
     * by the merchant. 
     * 						This filed is optional and will be present if merchant has a
     * registered bin range. 
     * 						The value of this field will be "true"  if merchant has a registered
     * bin range and the credit card used in the transaction is within the
     * registered bin range.
     * 						The value of this field will be false if merchant has a registered
     * bin range and credit card used in the transaction outside registered
     * bin range or the transaction is not done using a credit card.
     */
    public void setBinEligibility(java.lang.String binEligibility) {
        this.binEligibility = binEligibility;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentInfoType)) return false;
        PaymentInfoType other = (PaymentInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.ebayTransactionID==null && other.getEbayTransactionID()==null) || 
             (this.ebayTransactionID!=null &&
              this.ebayTransactionID.equals(other.getEbayTransactionID()))) &&
            ((this.parentTransactionID==null && other.getParentTransactionID()==null) || 
             (this.parentTransactionID!=null &&
              this.parentTransactionID.equals(other.getParentTransactionID()))) &&
            ((this.receiptID==null && other.getReceiptID()==null) || 
             (this.receiptID!=null &&
              this.receiptID.equals(other.getReceiptID()))) &&
            ((this.transactionType==null && other.getTransactionType()==null) || 
             (this.transactionType!=null &&
              this.transactionType.equals(other.getTransactionType()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.refundSourceCodeType==null && other.getRefundSourceCodeType()==null) || 
             (this.refundSourceCodeType!=null &&
              this.refundSourceCodeType.equals(other.getRefundSourceCodeType()))) &&
            ((this.expectedeCheckClearDate==null && other.getExpectedeCheckClearDate()==null) || 
             (this.expectedeCheckClearDate!=null &&
              this.expectedeCheckClearDate.equals(other.getExpectedeCheckClearDate()))) &&
            ((this.paymentDate==null && other.getPaymentDate()==null) || 
             (this.paymentDate!=null &&
              this.paymentDate.equals(other.getPaymentDate()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.settleAmount==null && other.getSettleAmount()==null) || 
             (this.settleAmount!=null &&
              this.settleAmount.equals(other.getSettleAmount()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.paymentStatus==null && other.getPaymentStatus()==null) || 
             (this.paymentStatus!=null &&
              this.paymentStatus.equals(other.getPaymentStatus()))) &&
            ((this.pendingReason==null && other.getPendingReason()==null) || 
             (this.pendingReason!=null &&
              this.pendingReason.equals(other.getPendingReason()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.holdDecision==null && other.getHoldDecision()==null) || 
             (this.holdDecision!=null &&
              this.holdDecision.equals(other.getHoldDecision()))) &&
            ((this.shippingMethod==null && other.getShippingMethod()==null) || 
             (this.shippingMethod!=null &&
              this.shippingMethod.equals(other.getShippingMethod()))) &&
            ((this.protectionEligibility==null && other.getProtectionEligibility()==null) || 
             (this.protectionEligibility!=null &&
              this.protectionEligibility.equals(other.getProtectionEligibility()))) &&
            ((this.protectionEligibilityType==null && other.getProtectionEligibilityType()==null) || 
             (this.protectionEligibilityType!=null &&
              this.protectionEligibilityType.equals(other.getProtectionEligibilityType()))) &&
            ((this.receiptReferenceNumber==null && other.getReceiptReferenceNumber()==null) || 
             (this.receiptReferenceNumber!=null &&
              this.receiptReferenceNumber.equals(other.getReceiptReferenceNumber()))) &&
            ((this.POSTransactionType==null && other.getPOSTransactionType()==null) || 
             (this.POSTransactionType!=null &&
              this.POSTransactionType.equals(other.getPOSTransactionType()))) &&
            ((this.shipAmount==null && other.getShipAmount()==null) || 
             (this.shipAmount!=null &&
              this.shipAmount.equals(other.getShipAmount()))) &&
            ((this.shipHandleAmount==null && other.getShipHandleAmount()==null) || 
             (this.shipHandleAmount!=null &&
              this.shipHandleAmount.equals(other.getShipHandleAmount()))) &&
            ((this.shipDiscount==null && other.getShipDiscount()==null) || 
             (this.shipDiscount!=null &&
              this.shipDiscount.equals(other.getShipDiscount()))) &&
            ((this.insuranceAmount==null && other.getInsuranceAmount()==null) || 
             (this.insuranceAmount!=null &&
              this.insuranceAmount.equals(other.getInsuranceAmount()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID()))) &&
            ((this.sellerDetails==null && other.getSellerDetails()==null) || 
             (this.sellerDetails!=null &&
              this.sellerDetails.equals(other.getSellerDetails()))) &&
            ((this.paymentRequestID==null && other.getPaymentRequestID()==null) || 
             (this.paymentRequestID!=null &&
              this.paymentRequestID.equals(other.getPaymentRequestID()))) &&
            ((this.FMFDetails==null && other.getFMFDetails()==null) || 
             (this.FMFDetails!=null &&
              this.FMFDetails.equals(other.getFMFDetails()))) &&
            ((this.enhancedPaymentInfo==null && other.getEnhancedPaymentInfo()==null) || 
             (this.enhancedPaymentInfo!=null &&
              this.enhancedPaymentInfo.equals(other.getEnhancedPaymentInfo()))) &&
            ((this.paymentError==null && other.getPaymentError()==null) || 
             (this.paymentError!=null &&
              this.paymentError.equals(other.getPaymentError()))) &&
            ((this.instrumentDetails==null && other.getInstrumentDetails()==null) || 
             (this.instrumentDetails!=null &&
              this.instrumentDetails.equals(other.getInstrumentDetails()))) &&
            ((this.offerDetails==null && other.getOfferDetails()==null) || 
             (this.offerDetails!=null &&
              this.offerDetails.equals(other.getOfferDetails()))) &&
            ((this.binEligibility==null && other.getBinEligibility()==null) || 
             (this.binEligibility!=null &&
              this.binEligibility.equals(other.getBinEligibility())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getEbayTransactionID() != null) {
            _hashCode += getEbayTransactionID().hashCode();
        }
        if (getParentTransactionID() != null) {
            _hashCode += getParentTransactionID().hashCode();
        }
        if (getReceiptID() != null) {
            _hashCode += getReceiptID().hashCode();
        }
        if (getTransactionType() != null) {
            _hashCode += getTransactionType().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getRefundSourceCodeType() != null) {
            _hashCode += getRefundSourceCodeType().hashCode();
        }
        if (getExpectedeCheckClearDate() != null) {
            _hashCode += getExpectedeCheckClearDate().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getSettleAmount() != null) {
            _hashCode += getSettleAmount().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getPaymentStatus() != null) {
            _hashCode += getPaymentStatus().hashCode();
        }
        if (getPendingReason() != null) {
            _hashCode += getPendingReason().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getHoldDecision() != null) {
            _hashCode += getHoldDecision().hashCode();
        }
        if (getShippingMethod() != null) {
            _hashCode += getShippingMethod().hashCode();
        }
        if (getProtectionEligibility() != null) {
            _hashCode += getProtectionEligibility().hashCode();
        }
        if (getProtectionEligibilityType() != null) {
            _hashCode += getProtectionEligibilityType().hashCode();
        }
        if (getReceiptReferenceNumber() != null) {
            _hashCode += getReceiptReferenceNumber().hashCode();
        }
        if (getPOSTransactionType() != null) {
            _hashCode += getPOSTransactionType().hashCode();
        }
        if (getShipAmount() != null) {
            _hashCode += getShipAmount().hashCode();
        }
        if (getShipHandleAmount() != null) {
            _hashCode += getShipHandleAmount().hashCode();
        }
        if (getShipDiscount() != null) {
            _hashCode += getShipDiscount().hashCode();
        }
        if (getInsuranceAmount() != null) {
            _hashCode += getInsuranceAmount().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        if (getSellerDetails() != null) {
            _hashCode += getSellerDetails().hashCode();
        }
        if (getPaymentRequestID() != null) {
            _hashCode += getPaymentRequestID().hashCode();
        }
        if (getFMFDetails() != null) {
            _hashCode += getFMFDetails().hashCode();
        }
        if (getEnhancedPaymentInfo() != null) {
            _hashCode += getEnhancedPaymentInfo().hashCode();
        }
        if (getPaymentError() != null) {
            _hashCode += getPaymentError().hashCode();
        }
        if (getInstrumentDetails() != null) {
            _hashCode += getInstrumentDetails().hashCode();
        }
        if (getOfferDetails() != null) {
            _hashCode += getOfferDetails().hashCode();
        }
        if (getBinEligibility() != null) {
            _hashCode += getBinEligibility().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebayTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTransactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ParentTransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiptID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundSourceCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundSourceCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RefundSourceCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedeCheckClearDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExpectedeCheckClearDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GrossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SettleAmount"));
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
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReversalReasonCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdDecision");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HoldDecision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReceiptReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("POSTransactionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "POSTransactionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "POSTransactionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShipAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipHandleAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShipHandleAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShipDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InsuranceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TerminalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paymentRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FMFDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedPaymentInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedPaymentInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedPaymentInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentError");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentError"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instrumentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InstrumentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InstrumentDetailsType"));
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
        elemField.setFieldName("binEligibility");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BinEligibility"));
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
