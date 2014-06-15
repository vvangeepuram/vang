/**
 * TransactionSearchRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class TransactionSearchRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The earliest transaction date at which to start the search.
     * No wildcards are allowed. */
    private java.util.Calendar startDate;

    /* The latest transaction date to be included in the search 
     * 
     * Optional */
    private java.util.Calendar endDate;

    /* Search by the buyer's email address 
     * 
     * Optional
     * 
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String payer;

    /* Search by the receiver's email address. If the merchant account
     * has only one email, this is the primary email. Can also be a non-primary
     * email.
     * 
     * Optional */
    private java.lang.String receiver;

    /* Search by the PayPal Account Optional receipt ID
     * 
     * Optional */
    private java.lang.String receiptID;

    /* Search by the transaction ID. 
     * 
     * Optional
     * 
     * The returned results are from the merchant's transaction records.
     * 
     * 
     * Character length and limitations: 19 single-byte characters maximum */
    private java.lang.String transactionID;

    /* Search by Recurring Payment Profile id.  The ProfileID is returned
     * as part of the CreateRecurringPaymentsProfile API response. 
     * 
     * Optional */
    private java.lang.String profileID;

    /* Search by the buyer's name 
     * 
     * Optional
     * 
     * Salutation: 20 single-byte character limit.
     * 
     * FirstName: 25 single-byte character limit.
     * 
     * MiddleName: 25 single-byte character limit.
     * 
     * LastName: 25 single-byte character limit.
     * 
     * Suffix: 12 single-byte character limit. */
    private eBLBaseComponents.apis.ebay.PersonNameType payerName;

    /* Search by item number of the purchased goods.
     * 
     * Optional
     * 
     * To search for purchased items not related to auctions, set the AuctionItemNumber
     * element to the value of the HTML item_number variable set in the shopping
     * cart for the original transaction. */
    private java.lang.String auctionItemNumber;

    /* Search by invoice identification key, as set by you for the
     * original transaction. InvoiceID searches the invoice records for items
     * sold by the merchant, not the items purchased. 
     * 
     * Optional
     * 
     * The value for InvoiceID must exactly match an invoice identification
     * number. No wildcards are allowed. 
     * 
     * Character length and limitations: 127 single-byte characters maximum */
    private java.lang.String invoiceID;

    private java.lang.String cardNumber;

    /* Search by classification of transaction. Some kinds of possible
     * classes of transactions are not searchable with TransactionSearchRequest.
     * You cannot search for bank transfer withdrawals, for example. 
     * 
     * Optional
     * 
     * All: all transaction classifications.
     * 
     * Sent: only payments sent.
     * 
     * Received: only payments received.
     * 
     * MassPay: only mass payments.
     * 
     * MoneyRequest: only money requests.
     * 
     * FundsAdded: only funds added to balance.
     * 
     * FundsWithdrawn: only funds withdrawn from balance.
     * 
     * Referral: only transactions involving referrals.
     * 
     * Fee: only transactions involving fees.
     * 
     * Subscription: only transactions involving subscriptions.
     * 
     * Dividend: only transactions involving dividends.
     * 
     * Billpay: only transactions involving BillPay Transactions.
     * 
     * Refund: only transactions involving funds.
     * 
     * CurrencyConversions: only transactions involving currency conversions.
     * 
     * BalanceTransfer: only transactions involving balance transfers.
     * 
     * Reversal: only transactions involving BillPay reversals.
     * 
     * Shipping: only transactions involving UPS shipping fees.
     * 
     * BalanceAffecting: only transactions that affect the account balance.
     * 
     * ECheck: only transactions involving eCheck
     * 
     * ForcedPostTransaction: forced post transaction.
     * 
     * NonReferencedRefunds: non-referenced refunds. */
    private eBLBaseComponents.apis.ebay.PaymentTransactionClassCodeType transactionClass;

    /* Search by transaction amount 
     * 
     * Optional
     * 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Search by currency code
     * 
     * Optional */
    private eBLBaseComponents.apis.ebay.CurrencyCodeType currencyCode;

    /* Search by transaction status 
     * 
     * Optional
     * 
     * Pending: The payment is pending. The specific reason the payment is
     * pending is returned by the GetTransactionDetails APIPendingReason
     * element. For more information, see PendingReason.
     * 
     * Processing: The payment is being processed.
     * 
     * Success: The payment has been completed and the funds have been added
     * successfully to your account balance.
     * 
     * Denied: You denied the payment. This happens only if the payment was
     * previously pending.
     * 
     * Reversed: A payment was reversed due to a chargeback or other type
     * of reversal. The funds have been removed from your account balance
     * and returned to the buyer. */
    private eBLBaseComponents.apis.ebay.PaymentTransactionStatusCodeType status;

    public TransactionSearchRequestType() {
    }

    public TransactionSearchRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.String payer,
           java.lang.String receiver,
           java.lang.String receiptID,
           java.lang.String transactionID,
           java.lang.String profileID,
           eBLBaseComponents.apis.ebay.PersonNameType payerName,
           java.lang.String auctionItemNumber,
           java.lang.String invoiceID,
           java.lang.String cardNumber,
           eBLBaseComponents.apis.ebay.PaymentTransactionClassCodeType transactionClass,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.CurrencyCodeType currencyCode,
           eBLBaseComponents.apis.ebay.PaymentTransactionStatusCodeType status) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.startDate = startDate;
        this.endDate = endDate;
        this.payer = payer;
        this.receiver = receiver;
        this.receiptID = receiptID;
        this.transactionID = transactionID;
        this.profileID = profileID;
        this.payerName = payerName;
        this.auctionItemNumber = auctionItemNumber;
        this.invoiceID = invoiceID;
        this.cardNumber = cardNumber;
        this.transactionClass = transactionClass;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.status = status;
    }


    /**
     * Gets the startDate value for this TransactionSearchRequestType.
     * 
     * @return startDate   * The earliest transaction date at which to start the search.
     * No wildcards are allowed.
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TransactionSearchRequestType.
     * 
     * @param startDate   * The earliest transaction date at which to start the search.
     * No wildcards are allowed.
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TransactionSearchRequestType.
     * 
     * @return endDate   * The latest transaction date to be included in the search 
     * 
     * Optional
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TransactionSearchRequestType.
     * 
     * @param endDate   * The latest transaction date to be included in the search 
     * 
     * Optional
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the payer value for this TransactionSearchRequestType.
     * 
     * @return payer   * Search by the buyer's email address 
     * 
     * Optional
     * 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getPayer() {
        return payer;
    }


    /**
     * Sets the payer value for this TransactionSearchRequestType.
     * 
     * @param payer   * Search by the buyer's email address 
     * 
     * Optional
     * 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setPayer(java.lang.String payer) {
        this.payer = payer;
    }


    /**
     * Gets the receiver value for this TransactionSearchRequestType.
     * 
     * @return receiver   * Search by the receiver's email address. If the merchant account
     * has only one email, this is the primary email. Can also be a non-primary
     * email.
     * 
     * Optional
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this TransactionSearchRequestType.
     * 
     * @param receiver   * Search by the receiver's email address. If the merchant account
     * has only one email, this is the primary email. Can also be a non-primary
     * email.
     * 
     * Optional
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the receiptID value for this TransactionSearchRequestType.
     * 
     * @return receiptID   * Search by the PayPal Account Optional receipt ID
     * 
     * Optional
     */
    public java.lang.String getReceiptID() {
        return receiptID;
    }


    /**
     * Sets the receiptID value for this TransactionSearchRequestType.
     * 
     * @param receiptID   * Search by the PayPal Account Optional receipt ID
     * 
     * Optional
     */
    public void setReceiptID(java.lang.String receiptID) {
        this.receiptID = receiptID;
    }


    /**
     * Gets the transactionID value for this TransactionSearchRequestType.
     * 
     * @return transactionID   * Search by the transaction ID. 
     * 
     * Optional
     * 
     * The returned results are from the merchant's transaction records.
     * 
     * 
     * Character length and limitations: 19 single-byte characters maximum
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this TransactionSearchRequestType.
     * 
     * @param transactionID   * Search by the transaction ID. 
     * 
     * Optional
     * 
     * The returned results are from the merchant's transaction records.
     * 
     * 
     * Character length and limitations: 19 single-byte characters maximum
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the profileID value for this TransactionSearchRequestType.
     * 
     * @return profileID   * Search by Recurring Payment Profile id.  The ProfileID is returned
     * as part of the CreateRecurringPaymentsProfile API response. 
     * 
     * Optional
     */
    public java.lang.String getProfileID() {
        return profileID;
    }


    /**
     * Sets the profileID value for this TransactionSearchRequestType.
     * 
     * @param profileID   * Search by Recurring Payment Profile id.  The ProfileID is returned
     * as part of the CreateRecurringPaymentsProfile API response. 
     * 
     * Optional
     */
    public void setProfileID(java.lang.String profileID) {
        this.profileID = profileID;
    }


    /**
     * Gets the payerName value for this TransactionSearchRequestType.
     * 
     * @return payerName   * Search by the buyer's name 
     * 
     * Optional
     * 
     * Salutation: 20 single-byte character limit.
     * 
     * FirstName: 25 single-byte character limit.
     * 
     * MiddleName: 25 single-byte character limit.
     * 
     * LastName: 25 single-byte character limit.
     * 
     * Suffix: 12 single-byte character limit.
     */
    public eBLBaseComponents.apis.ebay.PersonNameType getPayerName() {
        return payerName;
    }


    /**
     * Sets the payerName value for this TransactionSearchRequestType.
     * 
     * @param payerName   * Search by the buyer's name 
     * 
     * Optional
     * 
     * Salutation: 20 single-byte character limit.
     * 
     * FirstName: 25 single-byte character limit.
     * 
     * MiddleName: 25 single-byte character limit.
     * 
     * LastName: 25 single-byte character limit.
     * 
     * Suffix: 12 single-byte character limit.
     */
    public void setPayerName(eBLBaseComponents.apis.ebay.PersonNameType payerName) {
        this.payerName = payerName;
    }


    /**
     * Gets the auctionItemNumber value for this TransactionSearchRequestType.
     * 
     * @return auctionItemNumber   * Search by item number of the purchased goods.
     * 
     * Optional
     * 
     * To search for purchased items not related to auctions, set the AuctionItemNumber
     * element to the value of the HTML item_number variable set in the shopping
     * cart for the original transaction.
     */
    public java.lang.String getAuctionItemNumber() {
        return auctionItemNumber;
    }


    /**
     * Sets the auctionItemNumber value for this TransactionSearchRequestType.
     * 
     * @param auctionItemNumber   * Search by item number of the purchased goods.
     * 
     * Optional
     * 
     * To search for purchased items not related to auctions, set the AuctionItemNumber
     * element to the value of the HTML item_number variable set in the shopping
     * cart for the original transaction.
     */
    public void setAuctionItemNumber(java.lang.String auctionItemNumber) {
        this.auctionItemNumber = auctionItemNumber;
    }


    /**
     * Gets the invoiceID value for this TransactionSearchRequestType.
     * 
     * @return invoiceID   * Search by invoice identification key, as set by you for the
     * original transaction. InvoiceID searches the invoice records for items
     * sold by the merchant, not the items purchased. 
     * 
     * Optional
     * 
     * The value for InvoiceID must exactly match an invoice identification
     * number. No wildcards are allowed. 
     * 
     * Character length and limitations: 127 single-byte characters maximum
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this TransactionSearchRequestType.
     * 
     * @param invoiceID   * Search by invoice identification key, as set by you for the
     * original transaction. InvoiceID searches the invoice records for items
     * sold by the merchant, not the items purchased. 
     * 
     * Optional
     * 
     * The value for InvoiceID must exactly match an invoice identification
     * number. No wildcards are allowed. 
     * 
     * Character length and limitations: 127 single-byte characters maximum
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the cardNumber value for this TransactionSearchRequestType.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this TransactionSearchRequestType.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the transactionClass value for this TransactionSearchRequestType.
     * 
     * @return transactionClass   * Search by classification of transaction. Some kinds of possible
     * classes of transactions are not searchable with TransactionSearchRequest.
     * You cannot search for bank transfer withdrawals, for example. 
     * 
     * Optional
     * 
     * All: all transaction classifications.
     * 
     * Sent: only payments sent.
     * 
     * Received: only payments received.
     * 
     * MassPay: only mass payments.
     * 
     * MoneyRequest: only money requests.
     * 
     * FundsAdded: only funds added to balance.
     * 
     * FundsWithdrawn: only funds withdrawn from balance.
     * 
     * Referral: only transactions involving referrals.
     * 
     * Fee: only transactions involving fees.
     * 
     * Subscription: only transactions involving subscriptions.
     * 
     * Dividend: only transactions involving dividends.
     * 
     * Billpay: only transactions involving BillPay Transactions.
     * 
     * Refund: only transactions involving funds.
     * 
     * CurrencyConversions: only transactions involving currency conversions.
     * 
     * BalanceTransfer: only transactions involving balance transfers.
     * 
     * Reversal: only transactions involving BillPay reversals.
     * 
     * Shipping: only transactions involving UPS shipping fees.
     * 
     * BalanceAffecting: only transactions that affect the account balance.
     * 
     * ECheck: only transactions involving eCheck
     * 
     * ForcedPostTransaction: forced post transaction.
     * 
     * NonReferencedRefunds: non-referenced refunds.
     */
    public eBLBaseComponents.apis.ebay.PaymentTransactionClassCodeType getTransactionClass() {
        return transactionClass;
    }


    /**
     * Sets the transactionClass value for this TransactionSearchRequestType.
     * 
     * @param transactionClass   * Search by classification of transaction. Some kinds of possible
     * classes of transactions are not searchable with TransactionSearchRequest.
     * You cannot search for bank transfer withdrawals, for example. 
     * 
     * Optional
     * 
     * All: all transaction classifications.
     * 
     * Sent: only payments sent.
     * 
     * Received: only payments received.
     * 
     * MassPay: only mass payments.
     * 
     * MoneyRequest: only money requests.
     * 
     * FundsAdded: only funds added to balance.
     * 
     * FundsWithdrawn: only funds withdrawn from balance.
     * 
     * Referral: only transactions involving referrals.
     * 
     * Fee: only transactions involving fees.
     * 
     * Subscription: only transactions involving subscriptions.
     * 
     * Dividend: only transactions involving dividends.
     * 
     * Billpay: only transactions involving BillPay Transactions.
     * 
     * Refund: only transactions involving funds.
     * 
     * CurrencyConversions: only transactions involving currency conversions.
     * 
     * BalanceTransfer: only transactions involving balance transfers.
     * 
     * Reversal: only transactions involving BillPay reversals.
     * 
     * Shipping: only transactions involving UPS shipping fees.
     * 
     * BalanceAffecting: only transactions that affect the account balance.
     * 
     * ECheck: only transactions involving eCheck
     * 
     * ForcedPostTransaction: forced post transaction.
     * 
     * NonReferencedRefunds: non-referenced refunds.
     */
    public void setTransactionClass(eBLBaseComponents.apis.ebay.PaymentTransactionClassCodeType transactionClass) {
        this.transactionClass = transactionClass;
    }


    /**
     * Gets the amount value for this TransactionSearchRequestType.
     * 
     * @return amount   * Search by transaction amount 
     * 
     * Optional
     * 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionSearchRequestType.
     * 
     * @param amount   * Search by transaction amount 
     * 
     * Optional
     * 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the currencyCode value for this TransactionSearchRequestType.
     * 
     * @return currencyCode   * Search by currency code
     * 
     * Optional
     */
    public eBLBaseComponents.apis.ebay.CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this TransactionSearchRequestType.
     * 
     * @param currencyCode   * Search by currency code
     * 
     * Optional
     */
    public void setCurrencyCode(eBLBaseComponents.apis.ebay.CurrencyCodeType currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the status value for this TransactionSearchRequestType.
     * 
     * @return status   * Search by transaction status 
     * 
     * Optional
     * 
     * Pending: The payment is pending. The specific reason the payment is
     * pending is returned by the GetTransactionDetails APIPendingReason
     * element. For more information, see PendingReason.
     * 
     * Processing: The payment is being processed.
     * 
     * Success: The payment has been completed and the funds have been added
     * successfully to your account balance.
     * 
     * Denied: You denied the payment. This happens only if the payment was
     * previously pending.
     * 
     * Reversed: A payment was reversed due to a chargeback or other type
     * of reversal. The funds have been removed from your account balance
     * and returned to the buyer.
     */
    public eBLBaseComponents.apis.ebay.PaymentTransactionStatusCodeType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionSearchRequestType.
     * 
     * @param status   * Search by transaction status 
     * 
     * Optional
     * 
     * Pending: The payment is pending. The specific reason the payment is
     * pending is returned by the GetTransactionDetails APIPendingReason
     * element. For more information, see PendingReason.
     * 
     * Processing: The payment is being processed.
     * 
     * Success: The payment has been completed and the funds have been added
     * successfully to your account balance.
     * 
     * Denied: You denied the payment. This happens only if the payment was
     * previously pending.
     * 
     * Reversed: A payment was reversed due to a chargeback or other type
     * of reversal. The funds have been removed from your account balance
     * and returned to the buyer.
     */
    public void setStatus(eBLBaseComponents.apis.ebay.PaymentTransactionStatusCodeType status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchRequestType)) return false;
        TransactionSearchRequestType other = (TransactionSearchRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.payer==null && other.getPayer()==null) || 
             (this.payer!=null &&
              this.payer.equals(other.getPayer()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.receiptID==null && other.getReceiptID()==null) || 
             (this.receiptID!=null &&
              this.receiptID.equals(other.getReceiptID()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.profileID==null && other.getProfileID()==null) || 
             (this.profileID!=null &&
              this.profileID.equals(other.getProfileID()))) &&
            ((this.payerName==null && other.getPayerName()==null) || 
             (this.payerName!=null &&
              this.payerName.equals(other.getPayerName()))) &&
            ((this.auctionItemNumber==null && other.getAuctionItemNumber()==null) || 
             (this.auctionItemNumber!=null &&
              this.auctionItemNumber.equals(other.getAuctionItemNumber()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.transactionClass==null && other.getTransactionClass()==null) || 
             (this.transactionClass!=null &&
              this.transactionClass.equals(other.getTransactionClass()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPayer() != null) {
            _hashCode += getPayer().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getReceiptID() != null) {
            _hashCode += getReceiptID().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getProfileID() != null) {
            _hashCode += getProfileID().hashCode();
        }
        if (getPayerName() != null) {
            _hashCode += getPayerName().hashCode();
        }
        if (getAuctionItemNumber() != null) {
            _hashCode += getAuctionItemNumber().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getTransactionClass() != null) {
            _hashCode += getTransactionClass().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionSearchRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Payer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReceiptID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ProfileID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "PayerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PersonNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auctionItemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AuctionItemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InvoiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionClassCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrencyCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionStatusCodeType"));
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
