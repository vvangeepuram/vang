/**
 * AccountSummaryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Includes account summary for the user.
 */
public class AccountSummaryType  implements java.io.Serializable, org.apache.axis.encoding.MixedContentType {
    private eBLBaseComponents.apis.ebay.AccountStateCodeType accountState;

    private eBLBaseComponents.apis.ebay.AdditionalAccountType[] additionalAccount;

    /* Number of additional accounts. */
    private java.lang.Integer additionalAccountsCount;

    /* Amount past due, 0.00 if not past due. */
    private CoreComponentTypes.apis.ebay.AmountType amountPastDue;

    /* First four digits (with remainder Xed-out). This may be an
     * empty 
     *                                 string depending upon the value of
     * the payment type for the 
     *                                 user account (e.g, if no debit-card
     * specified). */
    private java.lang.String bankAccountInfo;

    /* Last time/day BankAccountInfo and/or BankRoutingInfo was 
     *                                 modified, in GMT. This may be an empty
     * string depending 
     *                                 upon the value of the payment type
     * for the user account 
     *                                 (e.g, if no debit-card specified). */
    private java.util.Calendar bankModifyDate;

    /* Indicates the billing cycle in which eBay sends a billing 
     *                                 invoice to the specified user. Possible
     * values:
     *     						0 = On the last day of the month.
     *     						15 = On the 15th day of the month. */
    private java.util.Calendar billingCycleDate;

    /* Expiration date for the credit card selected as payment method,
     * 
     *                                 in GMT. Empty string if no credit
     * card is on file or if account is
     *                                 inactive -- even if there is a credit
     * card on file. */
    private java.util.Calendar CCExp;

    /* Last four digits of user's credit card selected as payment
     *                                 type. Empty string if no credit is
     * on file. This may be an empty 
     *                                 string depending upon the value of
     * the payment type for the 
     *                                 user account (e.g, if no debit-card
     * specified). */
    private java.lang.String CCInfo;

    /* Last date credit card or credit card expiration date was 
     *                                 modified, in GMT. This may be an empty
     * string depending 
     *                                 upon the value of the payment type
     * for the user account 
     *                                 (e.g, Empty string if no credit card
     * is on file. */
    private java.util.Calendar CCModifyDate;

    /* User's current balance. Can be 0.00, positive, or negative. */
    private CoreComponentTypes.apis.ebay.AmountType currentBalance;

    /* Amount of last payment posted, 0.00 if no payments posted. */
    private CoreComponentTypes.apis.ebay.AmountType lastAmountPaid;

    /* Amount of last invoice. 0.00 if account not yet invoiced. */
    private CoreComponentTypes.apis.ebay.AmountType lastInvoiceAmount;

    /* Date of last invoice sent by eBay to the user, in GMT. 
     *                                 Empty string if this account has not
     * been invoiced yet. */
    private java.util.Calendar lastInvoiceDate;

    /* Date of last payment by specified user to eBay, in GMT. 
     *                                 Empty string if no payments posted. */
    private java.util.Calendar lastPaymentDate;

    /* Indicates whether the account has past due amounts 
     *                                 outstanding. Possible values:
     *     						true = Account is past due.
     *     						false = Account is current. */
    private java.lang.Boolean pastDue;

    /* Indicates the method the specified user selected for paying
     * 
     *                                eBay. The values for PaymentType vary
     * for each SiteID. */
    private eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType paymentMethod;

    private org.apache.axis.message.MessageElement [] _any;  // attribute

    public AccountSummaryType() {
    }

    public AccountSummaryType(
           eBLBaseComponents.apis.ebay.AccountStateCodeType accountState,
           eBLBaseComponents.apis.ebay.AdditionalAccountType[] additionalAccount,
           java.lang.Integer additionalAccountsCount,
           CoreComponentTypes.apis.ebay.AmountType amountPastDue,
           java.lang.String bankAccountInfo,
           java.util.Calendar bankModifyDate,
           java.util.Calendar billingCycleDate,
           java.util.Calendar CCExp,
           java.lang.String CCInfo,
           java.util.Calendar CCModifyDate,
           CoreComponentTypes.apis.ebay.AmountType currentBalance,
           CoreComponentTypes.apis.ebay.AmountType lastAmountPaid,
           CoreComponentTypes.apis.ebay.AmountType lastInvoiceAmount,
           java.util.Calendar lastInvoiceDate,
           java.util.Calendar lastPaymentDate,
           java.lang.Boolean pastDue,
           eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType paymentMethod,
           org.apache.axis.message.MessageElement [] _any) {
           this.accountState = accountState;
           this.additionalAccount = additionalAccount;
           this.additionalAccountsCount = additionalAccountsCount;
           this.amountPastDue = amountPastDue;
           this.bankAccountInfo = bankAccountInfo;
           this.bankModifyDate = bankModifyDate;
           this.billingCycleDate = billingCycleDate;
           this.CCExp = CCExp;
           this.CCInfo = CCInfo;
           this.CCModifyDate = CCModifyDate;
           this.currentBalance = currentBalance;
           this.lastAmountPaid = lastAmountPaid;
           this.lastInvoiceAmount = lastInvoiceAmount;
           this.lastInvoiceDate = lastInvoiceDate;
           this.lastPaymentDate = lastPaymentDate;
           this.pastDue = pastDue;
           this.paymentMethod = paymentMethod;
           this._any = _any;
    }


    /**
     * Gets the accountState value for this AccountSummaryType.
     * 
     * @return accountState
     */
    public eBLBaseComponents.apis.ebay.AccountStateCodeType getAccountState() {
        return accountState;
    }


    /**
     * Sets the accountState value for this AccountSummaryType.
     * 
     * @param accountState
     */
    public void setAccountState(eBLBaseComponents.apis.ebay.AccountStateCodeType accountState) {
        this.accountState = accountState;
    }


    /**
     * Gets the additionalAccount value for this AccountSummaryType.
     * 
     * @return additionalAccount
     */
    public eBLBaseComponents.apis.ebay.AdditionalAccountType[] getAdditionalAccount() {
        return additionalAccount;
    }


    /**
     * Sets the additionalAccount value for this AccountSummaryType.
     * 
     * @param additionalAccount
     */
    public void setAdditionalAccount(eBLBaseComponents.apis.ebay.AdditionalAccountType[] additionalAccount) {
        this.additionalAccount = additionalAccount;
    }

    public eBLBaseComponents.apis.ebay.AdditionalAccountType getAdditionalAccount(int i) {
        return this.additionalAccount[i];
    }

    public void setAdditionalAccount(int i, eBLBaseComponents.apis.ebay.AdditionalAccountType _value) {
        this.additionalAccount[i] = _value;
    }


    /**
     * Gets the additionalAccountsCount value for this AccountSummaryType.
     * 
     * @return additionalAccountsCount   * Number of additional accounts.
     */
    public java.lang.Integer getAdditionalAccountsCount() {
        return additionalAccountsCount;
    }


    /**
     * Sets the additionalAccountsCount value for this AccountSummaryType.
     * 
     * @param additionalAccountsCount   * Number of additional accounts.
     */
    public void setAdditionalAccountsCount(java.lang.Integer additionalAccountsCount) {
        this.additionalAccountsCount = additionalAccountsCount;
    }


    /**
     * Gets the amountPastDue value for this AccountSummaryType.
     * 
     * @return amountPastDue   * Amount past due, 0.00 if not past due.
     */
    public CoreComponentTypes.apis.ebay.AmountType getAmountPastDue() {
        return amountPastDue;
    }


    /**
     * Sets the amountPastDue value for this AccountSummaryType.
     * 
     * @param amountPastDue   * Amount past due, 0.00 if not past due.
     */
    public void setAmountPastDue(CoreComponentTypes.apis.ebay.AmountType amountPastDue) {
        this.amountPastDue = amountPastDue;
    }


    /**
     * Gets the bankAccountInfo value for this AccountSummaryType.
     * 
     * @return bankAccountInfo   * First four digits (with remainder Xed-out). This may be an
     * empty 
     *                                 string depending upon the value of
     * the payment type for the 
     *                                 user account (e.g, if no debit-card
     * specified).
     */
    public java.lang.String getBankAccountInfo() {
        return bankAccountInfo;
    }


    /**
     * Sets the bankAccountInfo value for this AccountSummaryType.
     * 
     * @param bankAccountInfo   * First four digits (with remainder Xed-out). This may be an
     * empty 
     *                                 string depending upon the value of
     * the payment type for the 
     *                                 user account (e.g, if no debit-card
     * specified).
     */
    public void setBankAccountInfo(java.lang.String bankAccountInfo) {
        this.bankAccountInfo = bankAccountInfo;
    }


    /**
     * Gets the bankModifyDate value for this AccountSummaryType.
     * 
     * @return bankModifyDate   * Last time/day BankAccountInfo and/or BankRoutingInfo was 
     *                                 modified, in GMT. This may be an empty
     * string depending 
     *                                 upon the value of the payment type
     * for the user account 
     *                                 (e.g, if no debit-card specified).
     */
    public java.util.Calendar getBankModifyDate() {
        return bankModifyDate;
    }


    /**
     * Sets the bankModifyDate value for this AccountSummaryType.
     * 
     * @param bankModifyDate   * Last time/day BankAccountInfo and/or BankRoutingInfo was 
     *                                 modified, in GMT. This may be an empty
     * string depending 
     *                                 upon the value of the payment type
     * for the user account 
     *                                 (e.g, if no debit-card specified).
     */
    public void setBankModifyDate(java.util.Calendar bankModifyDate) {
        this.bankModifyDate = bankModifyDate;
    }


    /**
     * Gets the billingCycleDate value for this AccountSummaryType.
     * 
     * @return billingCycleDate   * Indicates the billing cycle in which eBay sends a billing 
     *                                 invoice to the specified user. Possible
     * values:
     *     						0 = On the last day of the month.
     *     						15 = On the 15th day of the month.
     */
    public java.util.Calendar getBillingCycleDate() {
        return billingCycleDate;
    }


    /**
     * Sets the billingCycleDate value for this AccountSummaryType.
     * 
     * @param billingCycleDate   * Indicates the billing cycle in which eBay sends a billing 
     *                                 invoice to the specified user. Possible
     * values:
     *     						0 = On the last day of the month.
     *     						15 = On the 15th day of the month.
     */
    public void setBillingCycleDate(java.util.Calendar billingCycleDate) {
        this.billingCycleDate = billingCycleDate;
    }


    /**
     * Gets the CCExp value for this AccountSummaryType.
     * 
     * @return CCExp   * Expiration date for the credit card selected as payment method,
     * 
     *                                 in GMT. Empty string if no credit
     * card is on file or if account is
     *                                 inactive -- even if there is a credit
     * card on file.
     */
    public java.util.Calendar getCCExp() {
        return CCExp;
    }


    /**
     * Sets the CCExp value for this AccountSummaryType.
     * 
     * @param CCExp   * Expiration date for the credit card selected as payment method,
     * 
     *                                 in GMT. Empty string if no credit
     * card is on file or if account is
     *                                 inactive -- even if there is a credit
     * card on file.
     */
    public void setCCExp(java.util.Calendar CCExp) {
        this.CCExp = CCExp;
    }


    /**
     * Gets the CCInfo value for this AccountSummaryType.
     * 
     * @return CCInfo   * Last four digits of user's credit card selected as payment
     *                                 type. Empty string if no credit is
     * on file. This may be an empty 
     *                                 string depending upon the value of
     * the payment type for the 
     *                                 user account (e.g, if no debit-card
     * specified).
     */
    public java.lang.String getCCInfo() {
        return CCInfo;
    }


    /**
     * Sets the CCInfo value for this AccountSummaryType.
     * 
     * @param CCInfo   * Last four digits of user's credit card selected as payment
     *                                 type. Empty string if no credit is
     * on file. This may be an empty 
     *                                 string depending upon the value of
     * the payment type for the 
     *                                 user account (e.g, if no debit-card
     * specified).
     */
    public void setCCInfo(java.lang.String CCInfo) {
        this.CCInfo = CCInfo;
    }


    /**
     * Gets the CCModifyDate value for this AccountSummaryType.
     * 
     * @return CCModifyDate   * Last date credit card or credit card expiration date was 
     *                                 modified, in GMT. This may be an empty
     * string depending 
     *                                 upon the value of the payment type
     * for the user account 
     *                                 (e.g, Empty string if no credit card
     * is on file.
     */
    public java.util.Calendar getCCModifyDate() {
        return CCModifyDate;
    }


    /**
     * Sets the CCModifyDate value for this AccountSummaryType.
     * 
     * @param CCModifyDate   * Last date credit card or credit card expiration date was 
     *                                 modified, in GMT. This may be an empty
     * string depending 
     *                                 upon the value of the payment type
     * for the user account 
     *                                 (e.g, Empty string if no credit card
     * is on file.
     */
    public void setCCModifyDate(java.util.Calendar CCModifyDate) {
        this.CCModifyDate = CCModifyDate;
    }


    /**
     * Gets the currentBalance value for this AccountSummaryType.
     * 
     * @return currentBalance   * User's current balance. Can be 0.00, positive, or negative.
     */
    public CoreComponentTypes.apis.ebay.AmountType getCurrentBalance() {
        return currentBalance;
    }


    /**
     * Sets the currentBalance value for this AccountSummaryType.
     * 
     * @param currentBalance   * User's current balance. Can be 0.00, positive, or negative.
     */
    public void setCurrentBalance(CoreComponentTypes.apis.ebay.AmountType currentBalance) {
        this.currentBalance = currentBalance;
    }


    /**
     * Gets the lastAmountPaid value for this AccountSummaryType.
     * 
     * @return lastAmountPaid   * Amount of last payment posted, 0.00 if no payments posted.
     */
    public CoreComponentTypes.apis.ebay.AmountType getLastAmountPaid() {
        return lastAmountPaid;
    }


    /**
     * Sets the lastAmountPaid value for this AccountSummaryType.
     * 
     * @param lastAmountPaid   * Amount of last payment posted, 0.00 if no payments posted.
     */
    public void setLastAmountPaid(CoreComponentTypes.apis.ebay.AmountType lastAmountPaid) {
        this.lastAmountPaid = lastAmountPaid;
    }


    /**
     * Gets the lastInvoiceAmount value for this AccountSummaryType.
     * 
     * @return lastInvoiceAmount   * Amount of last invoice. 0.00 if account not yet invoiced.
     */
    public CoreComponentTypes.apis.ebay.AmountType getLastInvoiceAmount() {
        return lastInvoiceAmount;
    }


    /**
     * Sets the lastInvoiceAmount value for this AccountSummaryType.
     * 
     * @param lastInvoiceAmount   * Amount of last invoice. 0.00 if account not yet invoiced.
     */
    public void setLastInvoiceAmount(CoreComponentTypes.apis.ebay.AmountType lastInvoiceAmount) {
        this.lastInvoiceAmount = lastInvoiceAmount;
    }


    /**
     * Gets the lastInvoiceDate value for this AccountSummaryType.
     * 
     * @return lastInvoiceDate   * Date of last invoice sent by eBay to the user, in GMT. 
     *                                 Empty string if this account has not
     * been invoiced yet.
     */
    public java.util.Calendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }


    /**
     * Sets the lastInvoiceDate value for this AccountSummaryType.
     * 
     * @param lastInvoiceDate   * Date of last invoice sent by eBay to the user, in GMT. 
     *                                 Empty string if this account has not
     * been invoiced yet.
     */
    public void setLastInvoiceDate(java.util.Calendar lastInvoiceDate) {
        this.lastInvoiceDate = lastInvoiceDate;
    }


    /**
     * Gets the lastPaymentDate value for this AccountSummaryType.
     * 
     * @return lastPaymentDate   * Date of last payment by specified user to eBay, in GMT. 
     *                                 Empty string if no payments posted.
     */
    public java.util.Calendar getLastPaymentDate() {
        return lastPaymentDate;
    }


    /**
     * Sets the lastPaymentDate value for this AccountSummaryType.
     * 
     * @param lastPaymentDate   * Date of last payment by specified user to eBay, in GMT. 
     *                                 Empty string if no payments posted.
     */
    public void setLastPaymentDate(java.util.Calendar lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }


    /**
     * Gets the pastDue value for this AccountSummaryType.
     * 
     * @return pastDue   * Indicates whether the account has past due amounts 
     *                                 outstanding. Possible values:
     *     						true = Account is past due.
     *     						false = Account is current.
     */
    public java.lang.Boolean getPastDue() {
        return pastDue;
    }


    /**
     * Sets the pastDue value for this AccountSummaryType.
     * 
     * @param pastDue   * Indicates whether the account has past due amounts 
     *                                 outstanding. Possible values:
     *     						true = Account is past due.
     *     						false = Account is current.
     */
    public void setPastDue(java.lang.Boolean pastDue) {
        this.pastDue = pastDue;
    }


    /**
     * Gets the paymentMethod value for this AccountSummaryType.
     * 
     * @return paymentMethod   * Indicates the method the specified user selected for paying
     * 
     *                                eBay. The values for PaymentType vary
     * for each SiteID.
     */
    public eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this AccountSummaryType.
     * 
     * @param paymentMethod   * Indicates the method the specified user selected for paying
     * 
     *                                eBay. The values for PaymentType vary
     * for each SiteID.
     */
    public void setPaymentMethod(eBLBaseComponents.apis.ebay.SellerPaymentMethodCodeType paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the _any value for this AccountSummaryType.
     * 
     * @return _any
     */
    public org.apache.axis.message.MessageElement [] get_any() {
        return _any;
    }


    /**
     * Sets the _any value for this AccountSummaryType.
     * 
     * @param _any
     */
    public void set_any(org.apache.axis.message.MessageElement [] _any) {
        this._any = _any;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountSummaryType)) return false;
        AccountSummaryType other = (AccountSummaryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountState==null && other.getAccountState()==null) || 
             (this.accountState!=null &&
              this.accountState.equals(other.getAccountState()))) &&
            ((this.additionalAccount==null && other.getAdditionalAccount()==null) || 
             (this.additionalAccount!=null &&
              java.util.Arrays.equals(this.additionalAccount, other.getAdditionalAccount()))) &&
            ((this.additionalAccountsCount==null && other.getAdditionalAccountsCount()==null) || 
             (this.additionalAccountsCount!=null &&
              this.additionalAccountsCount.equals(other.getAdditionalAccountsCount()))) &&
            ((this.amountPastDue==null && other.getAmountPastDue()==null) || 
             (this.amountPastDue!=null &&
              this.amountPastDue.equals(other.getAmountPastDue()))) &&
            ((this.bankAccountInfo==null && other.getBankAccountInfo()==null) || 
             (this.bankAccountInfo!=null &&
              this.bankAccountInfo.equals(other.getBankAccountInfo()))) &&
            ((this.bankModifyDate==null && other.getBankModifyDate()==null) || 
             (this.bankModifyDate!=null &&
              this.bankModifyDate.equals(other.getBankModifyDate()))) &&
            ((this.billingCycleDate==null && other.getBillingCycleDate()==null) || 
             (this.billingCycleDate!=null &&
              this.billingCycleDate.equals(other.getBillingCycleDate()))) &&
            ((this.CCExp==null && other.getCCExp()==null) || 
             (this.CCExp!=null &&
              this.CCExp.equals(other.getCCExp()))) &&
            ((this.CCInfo==null && other.getCCInfo()==null) || 
             (this.CCInfo!=null &&
              this.CCInfo.equals(other.getCCInfo()))) &&
            ((this.CCModifyDate==null && other.getCCModifyDate()==null) || 
             (this.CCModifyDate!=null &&
              this.CCModifyDate.equals(other.getCCModifyDate()))) &&
            ((this.currentBalance==null && other.getCurrentBalance()==null) || 
             (this.currentBalance!=null &&
              this.currentBalance.equals(other.getCurrentBalance()))) &&
            ((this.lastAmountPaid==null && other.getLastAmountPaid()==null) || 
             (this.lastAmountPaid!=null &&
              this.lastAmountPaid.equals(other.getLastAmountPaid()))) &&
            ((this.lastInvoiceAmount==null && other.getLastInvoiceAmount()==null) || 
             (this.lastInvoiceAmount!=null &&
              this.lastInvoiceAmount.equals(other.getLastInvoiceAmount()))) &&
            ((this.lastInvoiceDate==null && other.getLastInvoiceDate()==null) || 
             (this.lastInvoiceDate!=null &&
              this.lastInvoiceDate.equals(other.getLastInvoiceDate()))) &&
            ((this.lastPaymentDate==null && other.getLastPaymentDate()==null) || 
             (this.lastPaymentDate!=null &&
              this.lastPaymentDate.equals(other.getLastPaymentDate()))) &&
            ((this.pastDue==null && other.getPastDue()==null) || 
             (this.pastDue!=null &&
              this.pastDue.equals(other.getPastDue()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this._any==null && other.get_any()==null) || 
             (this._any!=null &&
              java.util.Arrays.equals(this._any, other.get_any())));
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
        if (getAccountState() != null) {
            _hashCode += getAccountState().hashCode();
        }
        if (getAdditionalAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAdditionalAccountsCount() != null) {
            _hashCode += getAdditionalAccountsCount().hashCode();
        }
        if (getAmountPastDue() != null) {
            _hashCode += getAmountPastDue().hashCode();
        }
        if (getBankAccountInfo() != null) {
            _hashCode += getBankAccountInfo().hashCode();
        }
        if (getBankModifyDate() != null) {
            _hashCode += getBankModifyDate().hashCode();
        }
        if (getBillingCycleDate() != null) {
            _hashCode += getBillingCycleDate().hashCode();
        }
        if (getCCExp() != null) {
            _hashCode += getCCExp().hashCode();
        }
        if (getCCInfo() != null) {
            _hashCode += getCCInfo().hashCode();
        }
        if (getCCModifyDate() != null) {
            _hashCode += getCCModifyDate().hashCode();
        }
        if (getCurrentBalance() != null) {
            _hashCode += getCurrentBalance().hashCode();
        }
        if (getLastAmountPaid() != null) {
            _hashCode += getLastAmountPaid().hashCode();
        }
        if (getLastInvoiceAmount() != null) {
            _hashCode += getLastInvoiceAmount().hashCode();
        }
        if (getLastInvoiceDate() != null) {
            _hashCode += getLastInvoiceDate().hashCode();
        }
        if (getLastPaymentDate() != null) {
            _hashCode += getLastPaymentDate().hashCode();
        }
        if (getPastDue() != null) {
            _hashCode += getPastDue().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (get_any() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_any());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_any(), i);
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
        new org.apache.axis.description.TypeDesc(AccountSummaryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountSummaryType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccountStateCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalAccountsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AdditionalAccountsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPastDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AmountPastDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCycleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingCycleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCExp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CCExp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CCInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCModifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CCModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrentBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastAmountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastAmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInvoiceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastInvoiceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastInvoiceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastInvoiceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPaymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastPaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pastDue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PastDue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentMethodCodeType"));
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
