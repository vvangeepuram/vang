/**
 * TransactionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains information about a single transaction. A transaction
 * contains information 
 *                        about the sale of a particular item. The system
 * creates a transaction when a buyer 
 *                        has made a purchase (Fixed Price items) or
 * is the winning bidder (BIN and auction 
 *                        items). A listing can be associated with one
 * or more transactions in these cases:
 *                            	Multi-Item Fixed Price Listings
 *                            	Dutch Auction Listings
 *                       A listing is associated with a single transaction
 * in these cases:
 *                            	Single-Item Fixed Price Listings
 *                            	Single-Item Auction Listings
 */
public class TransactionType  implements java.io.Serializable {
    /* The amount the buyer paid for the item or agreed to pay, 
     * 						depending on how far into the checkout process the item is.
     * 
     * 						If the seller allowed the buyer to change the item total, the
     * buyer 
     * 						is able to change the total until the time that the transaction's
     * 
     * 						status moves to Complete. Determine whether the buyer 
     * 						changed the amount by calling GetSellerTransactions or 
     * 						GetSellerTransactions and comparing the AmountPaid value 
     * 						to what the seller expected. For Motors items, AmountPaid is
     * 
     * 						the amount paid by the buyer for the deposit. */
    private CoreComponentTypes.apis.ebay.AmountType amountPaid;

    /* Container for buyer data. */
    private eBLBaseComponents.apis.ebay.UserType buyer;

    /* Includes shipping payment data. */
    private eBLBaseComponents.apis.ebay.ShippingDetailsType shippingDetails;

    /* Value returned in the Transaction/AmountPaid element, converted
     * 
     * 			         		to the currency indicated by SiteCurrency. */
    private CoreComponentTypes.apis.ebay.AmountType convertedAmountPaid;

    /* Value returned in the Transaction/TransactionPrice element,
     * 
     * 			        		converted to the currency indicated by SiteCurrency. */
    private CoreComponentTypes.apis.ebay.AmountType convertedTransactionPrice;

    /* For fixed-price, Stores, and BIN items indicates when the 
     * 			        		purchase (or BIN) occurred. For all other item types
     * indicates 
     * 			        		when the transaction was created (the time when checkout
     * 
     * 			        		was initiated). */
    private java.util.Calendar createdDate;

    /* Deposit type for Motors items. If item is not a Motors item,
     * 
     * 			                    then returns a DepositType of None. Possible
     * values:
     *     							None
     *     							Other Method
     *     							Fast Deposit */
    private eBLBaseComponents.apis.ebay.DepositTypeCodeType depositType;

    /* Item info associated with the transaction. */
    private eBLBaseComponents.apis.ebay.ItemType item;

    /* Contains the number of individual items the buyer purchased
     * in 
     * 			                   the transaction. */
    private java.lang.Integer quantityPurchased;

    /* Shipping cost totals shown to user (for both flat and calculated
     * 
     * 			                    rates). */
    private CoreComponentTypes.apis.ebay.AmountType shippingHandlingTotal;

    /* Container node for transaction status data. */
    private eBLBaseComponents.apis.ebay.TransactionStatusType status;

    /* Unique identifier for a transaction. Returns 0 when Type=1
     * 
     * 			             		(Chinese auction). Typically, an ItemID and a TransactionID
     * 
     * 			             		uniquely identify a checkout  transaction. */
    private java.lang.String transactionID;

    /* Unique identifier for an authorization. */
    private java.lang.String authorizationID;

    /* Price of the item, before shipping and sales tax. For Motors,
     * 
     * 	                    		TransactionPrice is the deposit amount. */
    private CoreComponentTypes.apis.ebay.AmountType transactionPrice;

    /* VAT rate for the item, if the item price includes the VAT rate.
     * 
     * 			              	Specify the VATPercent if you want include the net
     * price in 
     * 			              	addition to the gross price in the listing. VAT
     * rates vary 
     * 			              	depending on the item and on the user's country
     * of residence; 
     * 			              	therefore a business seller is responsible for entering
     * the 
     * 			              	correct VAT rate (it will not be calculated by eBay). */
    private java.math.BigDecimal VATPercent;

    public TransactionType() {
    }

    public TransactionType(
           CoreComponentTypes.apis.ebay.AmountType amountPaid,
           eBLBaseComponents.apis.ebay.UserType buyer,
           eBLBaseComponents.apis.ebay.ShippingDetailsType shippingDetails,
           CoreComponentTypes.apis.ebay.AmountType convertedAmountPaid,
           CoreComponentTypes.apis.ebay.AmountType convertedTransactionPrice,
           java.util.Calendar createdDate,
           eBLBaseComponents.apis.ebay.DepositTypeCodeType depositType,
           eBLBaseComponents.apis.ebay.ItemType item,
           java.lang.Integer quantityPurchased,
           CoreComponentTypes.apis.ebay.AmountType shippingHandlingTotal,
           eBLBaseComponents.apis.ebay.TransactionStatusType status,
           java.lang.String transactionID,
           java.lang.String authorizationID,
           CoreComponentTypes.apis.ebay.AmountType transactionPrice,
           java.math.BigDecimal VATPercent) {
           this.amountPaid = amountPaid;
           this.buyer = buyer;
           this.shippingDetails = shippingDetails;
           this.convertedAmountPaid = convertedAmountPaid;
           this.convertedTransactionPrice = convertedTransactionPrice;
           this.createdDate = createdDate;
           this.depositType = depositType;
           this.item = item;
           this.quantityPurchased = quantityPurchased;
           this.shippingHandlingTotal = shippingHandlingTotal;
           this.status = status;
           this.transactionID = transactionID;
           this.authorizationID = authorizationID;
           this.transactionPrice = transactionPrice;
           this.VATPercent = VATPercent;
    }


    /**
     * Gets the amountPaid value for this TransactionType.
     * 
     * @return amountPaid   * The amount the buyer paid for the item or agreed to pay, 
     * 						depending on how far into the checkout process the item is.
     * 
     * 						If the seller allowed the buyer to change the item total, the
     * buyer 
     * 						is able to change the total until the time that the transaction's
     * 
     * 						status moves to Complete. Determine whether the buyer 
     * 						changed the amount by calling GetSellerTransactions or 
     * 						GetSellerTransactions and comparing the AmountPaid value 
     * 						to what the seller expected. For Motors items, AmountPaid is
     * 
     * 						the amount paid by the buyer for the deposit.
     */
    public CoreComponentTypes.apis.ebay.AmountType getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this TransactionType.
     * 
     * @param amountPaid   * The amount the buyer paid for the item or agreed to pay, 
     * 						depending on how far into the checkout process the item is.
     * 
     * 						If the seller allowed the buyer to change the item total, the
     * buyer 
     * 						is able to change the total until the time that the transaction's
     * 
     * 						status moves to Complete. Determine whether the buyer 
     * 						changed the amount by calling GetSellerTransactions or 
     * 						GetSellerTransactions and comparing the AmountPaid value 
     * 						to what the seller expected. For Motors items, AmountPaid is
     * 
     * 						the amount paid by the buyer for the deposit.
     */
    public void setAmountPaid(CoreComponentTypes.apis.ebay.AmountType amountPaid) {
        this.amountPaid = amountPaid;
    }


    /**
     * Gets the buyer value for this TransactionType.
     * 
     * @return buyer   * Container for buyer data.
     */
    public eBLBaseComponents.apis.ebay.UserType getBuyer() {
        return buyer;
    }


    /**
     * Sets the buyer value for this TransactionType.
     * 
     * @param buyer   * Container for buyer data.
     */
    public void setBuyer(eBLBaseComponents.apis.ebay.UserType buyer) {
        this.buyer = buyer;
    }


    /**
     * Gets the shippingDetails value for this TransactionType.
     * 
     * @return shippingDetails   * Includes shipping payment data.
     */
    public eBLBaseComponents.apis.ebay.ShippingDetailsType getShippingDetails() {
        return shippingDetails;
    }


    /**
     * Sets the shippingDetails value for this TransactionType.
     * 
     * @param shippingDetails   * Includes shipping payment data.
     */
    public void setShippingDetails(eBLBaseComponents.apis.ebay.ShippingDetailsType shippingDetails) {
        this.shippingDetails = shippingDetails;
    }


    /**
     * Gets the convertedAmountPaid value for this TransactionType.
     * 
     * @return convertedAmountPaid   * Value returned in the Transaction/AmountPaid element, converted
     * 
     * 			         		to the currency indicated by SiteCurrency.
     */
    public CoreComponentTypes.apis.ebay.AmountType getConvertedAmountPaid() {
        return convertedAmountPaid;
    }


    /**
     * Sets the convertedAmountPaid value for this TransactionType.
     * 
     * @param convertedAmountPaid   * Value returned in the Transaction/AmountPaid element, converted
     * 
     * 			         		to the currency indicated by SiteCurrency.
     */
    public void setConvertedAmountPaid(CoreComponentTypes.apis.ebay.AmountType convertedAmountPaid) {
        this.convertedAmountPaid = convertedAmountPaid;
    }


    /**
     * Gets the convertedTransactionPrice value for this TransactionType.
     * 
     * @return convertedTransactionPrice   * Value returned in the Transaction/TransactionPrice element,
     * 
     * 			        		converted to the currency indicated by SiteCurrency.
     */
    public CoreComponentTypes.apis.ebay.AmountType getConvertedTransactionPrice() {
        return convertedTransactionPrice;
    }


    /**
     * Sets the convertedTransactionPrice value for this TransactionType.
     * 
     * @param convertedTransactionPrice   * Value returned in the Transaction/TransactionPrice element,
     * 
     * 			        		converted to the currency indicated by SiteCurrency.
     */
    public void setConvertedTransactionPrice(CoreComponentTypes.apis.ebay.AmountType convertedTransactionPrice) {
        this.convertedTransactionPrice = convertedTransactionPrice;
    }


    /**
     * Gets the createdDate value for this TransactionType.
     * 
     * @return createdDate   * For fixed-price, Stores, and BIN items indicates when the 
     * 			        		purchase (or BIN) occurred. For all other item types
     * indicates 
     * 			        		when the transaction was created (the time when checkout
     * 
     * 			        		was initiated).
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TransactionType.
     * 
     * @param createdDate   * For fixed-price, Stores, and BIN items indicates when the 
     * 			        		purchase (or BIN) occurred. For all other item types
     * indicates 
     * 			        		when the transaction was created (the time when checkout
     * 
     * 			        		was initiated).
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the depositType value for this TransactionType.
     * 
     * @return depositType   * Deposit type for Motors items. If item is not a Motors item,
     * 
     * 			                    then returns a DepositType of None. Possible
     * values:
     *     							None
     *     							Other Method
     *     							Fast Deposit
     */
    public eBLBaseComponents.apis.ebay.DepositTypeCodeType getDepositType() {
        return depositType;
    }


    /**
     * Sets the depositType value for this TransactionType.
     * 
     * @param depositType   * Deposit type for Motors items. If item is not a Motors item,
     * 
     * 			                    then returns a DepositType of None. Possible
     * values:
     *     							None
     *     							Other Method
     *     							Fast Deposit
     */
    public void setDepositType(eBLBaseComponents.apis.ebay.DepositTypeCodeType depositType) {
        this.depositType = depositType;
    }


    /**
     * Gets the item value for this TransactionType.
     * 
     * @return item   * Item info associated with the transaction.
     */
    public eBLBaseComponents.apis.ebay.ItemType getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransactionType.
     * 
     * @param item   * Item info associated with the transaction.
     */
    public void setItem(eBLBaseComponents.apis.ebay.ItemType item) {
        this.item = item;
    }


    /**
     * Gets the quantityPurchased value for this TransactionType.
     * 
     * @return quantityPurchased   * Contains the number of individual items the buyer purchased
     * in 
     * 			                   the transaction.
     */
    public java.lang.Integer getQuantityPurchased() {
        return quantityPurchased;
    }


    /**
     * Sets the quantityPurchased value for this TransactionType.
     * 
     * @param quantityPurchased   * Contains the number of individual items the buyer purchased
     * in 
     * 			                   the transaction.
     */
    public void setQuantityPurchased(java.lang.Integer quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }


    /**
     * Gets the shippingHandlingTotal value for this TransactionType.
     * 
     * @return shippingHandlingTotal   * Shipping cost totals shown to user (for both flat and calculated
     * 
     * 			                    rates).
     */
    public CoreComponentTypes.apis.ebay.AmountType getShippingHandlingTotal() {
        return shippingHandlingTotal;
    }


    /**
     * Sets the shippingHandlingTotal value for this TransactionType.
     * 
     * @param shippingHandlingTotal   * Shipping cost totals shown to user (for both flat and calculated
     * 
     * 			                    rates).
     */
    public void setShippingHandlingTotal(CoreComponentTypes.apis.ebay.AmountType shippingHandlingTotal) {
        this.shippingHandlingTotal = shippingHandlingTotal;
    }


    /**
     * Gets the status value for this TransactionType.
     * 
     * @return status   * Container node for transaction status data.
     */
    public eBLBaseComponents.apis.ebay.TransactionStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionType.
     * 
     * @param status   * Container node for transaction status data.
     */
    public void setStatus(eBLBaseComponents.apis.ebay.TransactionStatusType status) {
        this.status = status;
    }


    /**
     * Gets the transactionID value for this TransactionType.
     * 
     * @return transactionID   * Unique identifier for a transaction. Returns 0 when Type=1
     * 
     * 			             		(Chinese auction). Typically, an ItemID and a TransactionID
     * 
     * 			             		uniquely identify a checkout  transaction.
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this TransactionType.
     * 
     * @param transactionID   * Unique identifier for a transaction. Returns 0 when Type=1
     * 
     * 			             		(Chinese auction). Typically, an ItemID and a TransactionID
     * 
     * 			             		uniquely identify a checkout  transaction.
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }


    /**
     * Gets the authorizationID value for this TransactionType.
     * 
     * @return authorizationID   * Unique identifier for an authorization.
     */
    public java.lang.String getAuthorizationID() {
        return authorizationID;
    }


    /**
     * Sets the authorizationID value for this TransactionType.
     * 
     * @param authorizationID   * Unique identifier for an authorization.
     */
    public void setAuthorizationID(java.lang.String authorizationID) {
        this.authorizationID = authorizationID;
    }


    /**
     * Gets the transactionPrice value for this TransactionType.
     * 
     * @return transactionPrice   * Price of the item, before shipping and sales tax. For Motors,
     * 
     * 	                    		TransactionPrice is the deposit amount.
     */
    public CoreComponentTypes.apis.ebay.AmountType getTransactionPrice() {
        return transactionPrice;
    }


    /**
     * Sets the transactionPrice value for this TransactionType.
     * 
     * @param transactionPrice   * Price of the item, before shipping and sales tax. For Motors,
     * 
     * 	                    		TransactionPrice is the deposit amount.
     */
    public void setTransactionPrice(CoreComponentTypes.apis.ebay.AmountType transactionPrice) {
        this.transactionPrice = transactionPrice;
    }


    /**
     * Gets the VATPercent value for this TransactionType.
     * 
     * @return VATPercent   * VAT rate for the item, if the item price includes the VAT rate.
     * 
     * 			              	Specify the VATPercent if you want include the net
     * price in 
     * 			              	addition to the gross price in the listing. VAT
     * rates vary 
     * 			              	depending on the item and on the user's country
     * of residence; 
     * 			              	therefore a business seller is responsible for entering
     * the 
     * 			              	correct VAT rate (it will not be calculated by eBay).
     */
    public java.math.BigDecimal getVATPercent() {
        return VATPercent;
    }


    /**
     * Sets the VATPercent value for this TransactionType.
     * 
     * @param VATPercent   * VAT rate for the item, if the item price includes the VAT rate.
     * 
     * 			              	Specify the VATPercent if you want include the net
     * price in 
     * 			              	addition to the gross price in the listing. VAT
     * rates vary 
     * 			              	depending on the item and on the user's country
     * of residence; 
     * 			              	therefore a business seller is responsible for entering
     * the 
     * 			              	correct VAT rate (it will not be calculated by eBay).
     */
    public void setVATPercent(java.math.BigDecimal VATPercent) {
        this.VATPercent = VATPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionType)) return false;
        TransactionType other = (TransactionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              this.amountPaid.equals(other.getAmountPaid()))) &&
            ((this.buyer==null && other.getBuyer()==null) || 
             (this.buyer!=null &&
              this.buyer.equals(other.getBuyer()))) &&
            ((this.shippingDetails==null && other.getShippingDetails()==null) || 
             (this.shippingDetails!=null &&
              this.shippingDetails.equals(other.getShippingDetails()))) &&
            ((this.convertedAmountPaid==null && other.getConvertedAmountPaid()==null) || 
             (this.convertedAmountPaid!=null &&
              this.convertedAmountPaid.equals(other.getConvertedAmountPaid()))) &&
            ((this.convertedTransactionPrice==null && other.getConvertedTransactionPrice()==null) || 
             (this.convertedTransactionPrice!=null &&
              this.convertedTransactionPrice.equals(other.getConvertedTransactionPrice()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.depositType==null && other.getDepositType()==null) || 
             (this.depositType!=null &&
              this.depositType.equals(other.getDepositType()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.quantityPurchased==null && other.getQuantityPurchased()==null) || 
             (this.quantityPurchased!=null &&
              this.quantityPurchased.equals(other.getQuantityPurchased()))) &&
            ((this.shippingHandlingTotal==null && other.getShippingHandlingTotal()==null) || 
             (this.shippingHandlingTotal!=null &&
              this.shippingHandlingTotal.equals(other.getShippingHandlingTotal()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID()))) &&
            ((this.authorizationID==null && other.getAuthorizationID()==null) || 
             (this.authorizationID!=null &&
              this.authorizationID.equals(other.getAuthorizationID()))) &&
            ((this.transactionPrice==null && other.getTransactionPrice()==null) || 
             (this.transactionPrice!=null &&
              this.transactionPrice.equals(other.getTransactionPrice()))) &&
            ((this.VATPercent==null && other.getVATPercent()==null) || 
             (this.VATPercent!=null &&
              this.VATPercent.equals(other.getVATPercent())));
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
        if (getAmountPaid() != null) {
            _hashCode += getAmountPaid().hashCode();
        }
        if (getBuyer() != null) {
            _hashCode += getBuyer().hashCode();
        }
        if (getShippingDetails() != null) {
            _hashCode += getShippingDetails().hashCode();
        }
        if (getConvertedAmountPaid() != null) {
            _hashCode += getConvertedAmountPaid().hashCode();
        }
        if (getConvertedTransactionPrice() != null) {
            _hashCode += getConvertedTransactionPrice().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDepositType() != null) {
            _hashCode += getDepositType().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getQuantityPurchased() != null) {
            _hashCode += getQuantityPurchased().hashCode();
        }
        if (getShippingHandlingTotal() != null) {
            _hashCode += getShippingHandlingTotal().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        if (getAuthorizationID() != null) {
            _hashCode += getAuthorizationID().hashCode();
        }
        if (getTransactionPrice() != null) {
            _hashCode += getTransactionPrice().hashCode();
        }
        if (getVATPercent() != null) {
            _hashCode += getVATPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Buyer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedAmountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConvertedAmountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedTransactionPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConvertedTransactionPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DepositType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DepositTypeCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPurchased");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "QuantityPurchased"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingHandlingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingHandlingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthorizationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VATPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "VATPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
