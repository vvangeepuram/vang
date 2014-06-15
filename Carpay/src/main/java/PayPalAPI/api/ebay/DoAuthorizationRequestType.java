/**
 * DoAuthorizationRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoAuthorizationRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The value of the order’s transaction identification number
     * returned by a PayPal product. 
     * 
     * 										
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters maximum */
    private java.lang.String transactionID;

    /* Type of transaction to authorize. The only allowable value
     * is , which means that the transaction represents a customer order
     * that can be fulfilled over 29 days. 
     * 
     * 										
     * Optional */
    private eBLBaseComponents.apis.ebay.TransactionEntityType transactionEntity;

    /* Amount to authorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Address the order will be shipped to.
     * 										
     * 										
     * 										Optional */
    private eBLBaseComponents.apis.ebay.AddressType shipToAddress;

    /* Information about the individual purchased items */
    private eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem;

    /* Sum of cost of all items in this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType itemTotal;

    /* Total shipping costs for this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType shippingTotal;

    /* Total handling costs for this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType handlingTotal;

    /* Sum of tax for all items in this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType taxTotal;

    /* Total shipping insurance costs for this order.
     * 										Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType insuranceTotal;

    /* Shipping discount for this order, specified as a negative number.
     * 										Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType shippingDiscount;

    /* Description of items the customer is purchasing.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String orderDescription;

    /* A free-form field for your own use.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Character length and limitations: 256 single-byte alphanumeric
     * characters */
    private java.lang.String custom;

    /* Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum. */
    private java.lang.String msgSubID;

    /* IP Address of the buyer */
    private java.lang.String IPAddress;

    public DoAuthorizationRequestType() {
    }

    public DoAuthorizationRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String transactionID,
           eBLBaseComponents.apis.ebay.TransactionEntityType transactionEntity,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.AddressType shipToAddress,
           eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] paymentDetailsItem,
           CoreComponentTypes.apis.ebay.BasicAmountType itemTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType handlingTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType taxTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType insuranceTotal,
           CoreComponentTypes.apis.ebay.BasicAmountType shippingDiscount,
           java.lang.String orderDescription,
           java.lang.String custom,
           java.lang.String msgSubID,
           java.lang.String IPAddress) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.transactionID = transactionID;
        this.transactionEntity = transactionEntity;
        this.amount = amount;
        this.shipToAddress = shipToAddress;
        this.paymentDetailsItem = paymentDetailsItem;
        this.itemTotal = itemTotal;
        this.shippingTotal = shippingTotal;
        this.handlingTotal = handlingTotal;
        this.taxTotal = taxTotal;
        this.insuranceTotal = insuranceTotal;
        this.shippingDiscount = shippingDiscount;
        this.orderDescription = orderDescription;
        this.custom = custom;
        this.msgSubID = msgSubID;
        this.IPAddress = IPAddress;
    }


    /**
     * Gets the transactionID value for this DoAuthorizationRequestType.
     * 
     * @return transactionID   * The value of the order’s transaction identification number
     * returned by a PayPal product. 
     * 
     * 										
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters maximum
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this DoAuthorizationRequestType.
     * 
     * @param transactionID   * The value of the order’s transaction identification number
     * returned by a PayPal product. 
     * 
     * 										
     * 										
     * 										
     * 										Character length and limits: 19 single-byte characters maximum
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the transactionEntity value for this DoAuthorizationRequestType.
     * 
     * @return transactionEntity   * Type of transaction to authorize. The only allowable value
     * is , which means that the transaction represents a customer order
     * that can be fulfilled over 29 days. 
     * 
     * 										
     * Optional
     */
    public eBLBaseComponents.apis.ebay.TransactionEntityType getTransactionEntity() {
        return transactionEntity;
    }


    /**
     * Sets the transactionEntity value for this DoAuthorizationRequestType.
     * 
     * @param transactionEntity   * Type of transaction to authorize. The only allowable value
     * is , which means that the transaction represents a customer order
     * that can be fulfilled over 29 days. 
     * 
     * 										
     * Optional
     */
    public void setTransactionEntity(eBLBaseComponents.apis.ebay.TransactionEntityType transactionEntity) {
        this.transactionEntity = transactionEntity;
    }


    /**
     * Gets the amount value for this DoAuthorizationRequestType.
     * 
     * @return amount   * Amount to authorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this DoAuthorizationRequestType.
     * 
     * @param amount   * Amount to authorize. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Limitations: Must not exceed $10,000 USD in any currency. No currency
     * symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,).
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the shipToAddress value for this DoAuthorizationRequestType.
     * 
     * @return shipToAddress   * Address the order will be shipped to.
     * 										
     * 										
     * 										Optional
     */
    public eBLBaseComponents.apis.ebay.AddressType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this DoAuthorizationRequestType.
     * 
     * @param shipToAddress   * Address the order will be shipped to.
     * 										
     * 										
     * 										Optional
     */
    public void setShipToAddress(eBLBaseComponents.apis.ebay.AddressType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the paymentDetailsItem value for this DoAuthorizationRequestType.
     * 
     * @return paymentDetailsItem   * Information about the individual purchased items
     */
    public eBLBaseComponents.apis.ebay.PaymentDetailsItemType[] getPaymentDetailsItem() {
        return paymentDetailsItem;
    }


    /**
     * Sets the paymentDetailsItem value for this DoAuthorizationRequestType.
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
     * Gets the itemTotal value for this DoAuthorizationRequestType.
     * 
     * @return itemTotal   * Sum of cost of all items in this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemTotal() {
        return itemTotal;
    }


    /**
     * Sets the itemTotal value for this DoAuthorizationRequestType.
     * 
     * @param itemTotal   * Sum of cost of all items in this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public void setItemTotal(CoreComponentTypes.apis.ebay.BasicAmountType itemTotal) {
        this.itemTotal = itemTotal;
    }


    /**
     * Gets the shippingTotal value for this DoAuthorizationRequestType.
     * 
     * @return shippingTotal   * Total shipping costs for this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingTotal() {
        return shippingTotal;
    }


    /**
     * Sets the shippingTotal value for this DoAuthorizationRequestType.
     * 
     * @param shippingTotal   * Total shipping costs for this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public void setShippingTotal(CoreComponentTypes.apis.ebay.BasicAmountType shippingTotal) {
        this.shippingTotal = shippingTotal;
    }


    /**
     * Gets the handlingTotal value for this DoAuthorizationRequestType.
     * 
     * @return handlingTotal   * Total handling costs for this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getHandlingTotal() {
        return handlingTotal;
    }


    /**
     * Sets the handlingTotal value for this DoAuthorizationRequestType.
     * 
     * @param handlingTotal   * Total handling costs for this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public void setHandlingTotal(CoreComponentTypes.apis.ebay.BasicAmountType handlingTotal) {
        this.handlingTotal = handlingTotal;
    }


    /**
     * Gets the taxTotal value for this DoAuthorizationRequestType.
     * 
     * @return taxTotal   * Sum of tax for all items in this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this DoAuthorizationRequestType.
     * 
     * @param taxTotal   * Sum of tax for all items in this order.
     * 										You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Limitations: Must not exceed $10,000 USD in any currency.
     * No currency symbol. Decimal separator must be a period (.), and the
     * thousands separator must be a comma (,).
     */
    public void setTaxTotal(CoreComponentTypes.apis.ebay.BasicAmountType taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the insuranceTotal value for this DoAuthorizationRequestType.
     * 
     * @return insuranceTotal   * Total shipping insurance costs for this order.
     * 										Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getInsuranceTotal() {
        return insuranceTotal;
    }


    /**
     * Sets the insuranceTotal value for this DoAuthorizationRequestType.
     * 
     * @param insuranceTotal   * Total shipping insurance costs for this order.
     * 										Optional
     */
    public void setInsuranceTotal(CoreComponentTypes.apis.ebay.BasicAmountType insuranceTotal) {
        this.insuranceTotal = insuranceTotal;
    }


    /**
     * Gets the shippingDiscount value for this DoAuthorizationRequestType.
     * 
     * @return shippingDiscount   * Shipping discount for this order, specified as a negative number.
     * 										Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShippingDiscount() {
        return shippingDiscount;
    }


    /**
     * Sets the shippingDiscount value for this DoAuthorizationRequestType.
     * 
     * @param shippingDiscount   * Shipping discount for this order, specified as a negative number.
     * 										Optional
     */
    public void setShippingDiscount(CoreComponentTypes.apis.ebay.BasicAmountType shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }


    /**
     * Gets the orderDescription value for this DoAuthorizationRequestType.
     * 
     * @return orderDescription   * Description of items the customer is purchasing.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getOrderDescription() {
        return orderDescription;
    }


    /**
     * Sets the orderDescription value for this DoAuthorizationRequestType.
     * 
     * @param orderDescription   * Description of items the customer is purchasing.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setOrderDescription(java.lang.String orderDescription) {
        this.orderDescription = orderDescription;
    }


    /**
     * Gets the custom value for this DoAuthorizationRequestType.
     * 
     * @return custom   * A free-form field for your own use.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this DoAuthorizationRequestType.
     * 
     * @param custom   * A free-form field for your own use.
     * 										
     * 										
     * 										Optional
     * 										
     * 										Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the msgSubID value for this DoAuthorizationRequestType.
     * 
     * @return msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum.
     */
    public java.lang.String getMsgSubID() {
        return msgSubID;
    }


    /**
     * Sets the msgSubID value for this DoAuthorizationRequestType.
     * 
     * @param msgSubID   * Unique id for each API request to prevent duplicate payments.
     * 										
     * 										
     * 										
     * 										Character length and limits: 38 single-byte characters maximum.
     */
    public void setMsgSubID(java.lang.String msgSubID) {
        this.msgSubID = msgSubID;
    }


    /**
     * Gets the IPAddress value for this DoAuthorizationRequestType.
     * 
     * @return IPAddress   * IP Address of the buyer
     */
    public java.lang.String getIPAddress() {
        return IPAddress;
    }


    /**
     * Sets the IPAddress value for this DoAuthorizationRequestType.
     * 
     * @param IPAddress   * IP Address of the buyer
     */
    public void setIPAddress(java.lang.String IPAddress) {
        this.IPAddress = IPAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoAuthorizationRequestType)) return false;
        DoAuthorizationRequestType other = (DoAuthorizationRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.transactionEntity==null && other.getTransactionEntity()==null) || 
             (this.transactionEntity!=null &&
              this.transactionEntity.equals(other.getTransactionEntity()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.paymentDetailsItem==null && other.getPaymentDetailsItem()==null) || 
             (this.paymentDetailsItem!=null &&
              java.util.Arrays.equals(this.paymentDetailsItem, other.getPaymentDetailsItem()))) &&
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
            ((this.insuranceTotal==null && other.getInsuranceTotal()==null) || 
             (this.insuranceTotal!=null &&
              this.insuranceTotal.equals(other.getInsuranceTotal()))) &&
            ((this.shippingDiscount==null && other.getShippingDiscount()==null) || 
             (this.shippingDiscount!=null &&
              this.shippingDiscount.equals(other.getShippingDiscount()))) &&
            ((this.orderDescription==null && other.getOrderDescription()==null) || 
             (this.orderDescription!=null &&
              this.orderDescription.equals(other.getOrderDescription()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.msgSubID==null && other.getMsgSubID()==null) || 
             (this.msgSubID!=null &&
              this.msgSubID.equals(other.getMsgSubID()))) &&
            ((this.IPAddress==null && other.getIPAddress()==null) || 
             (this.IPAddress!=null &&
              this.IPAddress.equals(other.getIPAddress())));
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
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getTransactionEntity() != null) {
            _hashCode += getTransactionEntity().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
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
        if (getInsuranceTotal() != null) {
            _hashCode += getInsuranceTotal().hashCode();
        }
        if (getShippingDiscount() != null) {
            _hashCode += getShippingDiscount().hashCode();
        }
        if (getOrderDescription() != null) {
            _hashCode += getOrderDescription().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getMsgSubID() != null) {
            _hashCode += getMsgSubID().hashCode();
        }
        if (getIPAddress() != null) {
            _hashCode += getIPAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoAuthorizationRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoAuthorizationRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TransactionEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionEntityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
        elemField.setFieldName("paymentDetailsItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ItemTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ShippingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "HandlingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TaxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InsuranceTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ShippingDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OrderDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "MsgSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "IPAddress"));
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
