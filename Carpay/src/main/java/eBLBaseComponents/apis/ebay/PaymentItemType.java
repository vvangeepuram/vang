/**
 * PaymentItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentItemType 
 * 				Information about a Payment Item.
 */
public class PaymentItemType  implements java.io.Serializable {
    /* eBay Auction Transaction ID of the Item 
     * 						Optional
     * 						Character length and limitations: 255 single-byte characters */
    private java.lang.String ebayItemTxnId;

    /* Item name set by you or entered by the customer. 
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String name;

    /* Item number set by you. 
     * 
     * Character length and limitations: 127 single-byte alphanumeric characters */
    private java.lang.String number;

    /* Quantity set by you or entered by the customer. 
     * 
     * Character length and limitations: no limit */
    private java.lang.String quantity;

    /* Amount of tax charged on payment */
    private java.lang.String salesTax;

    /* Amount of shipping charged on payment */
    private java.lang.String shippingAmount;

    /* Amount of handling charged on payment */
    private java.lang.String handlingAmount;

    /* Invoice item details */
    private eBLBaseComponents.apis.ebay.InvoiceItemType invoiceItemDetails;

    /* Coupon ID Number */
    private java.lang.String couponID;

    /* Amount Value of The Coupon */
    private java.lang.String couponAmount;

    /* Currency of the Coupon Amount */
    private java.lang.String couponAmountCurrency;

    /* Amount of Discount on this Loyalty Card */
    private java.lang.String loyaltyCardDiscountAmount;

    /* Currency of the Discount */
    private java.lang.String loyaltyCardDiscountCurrency;

    /* Cost of item */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Item options selected in PayPal shopping cart */
    private eBLBaseComponents.apis.ebay.OptionType[] options;

    public PaymentItemType() {
    }

    public PaymentItemType(
           java.lang.String ebayItemTxnId,
           java.lang.String name,
           java.lang.String number,
           java.lang.String quantity,
           java.lang.String salesTax,
           java.lang.String shippingAmount,
           java.lang.String handlingAmount,
           eBLBaseComponents.apis.ebay.InvoiceItemType invoiceItemDetails,
           java.lang.String couponID,
           java.lang.String couponAmount,
           java.lang.String couponAmountCurrency,
           java.lang.String loyaltyCardDiscountAmount,
           java.lang.String loyaltyCardDiscountCurrency,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.OptionType[] options) {
           this.ebayItemTxnId = ebayItemTxnId;
           this.name = name;
           this.number = number;
           this.quantity = quantity;
           this.salesTax = salesTax;
           this.shippingAmount = shippingAmount;
           this.handlingAmount = handlingAmount;
           this.invoiceItemDetails = invoiceItemDetails;
           this.couponID = couponID;
           this.couponAmount = couponAmount;
           this.couponAmountCurrency = couponAmountCurrency;
           this.loyaltyCardDiscountAmount = loyaltyCardDiscountAmount;
           this.loyaltyCardDiscountCurrency = loyaltyCardDiscountCurrency;
           this.amount = amount;
           this.options = options;
    }


    /**
     * Gets the ebayItemTxnId value for this PaymentItemType.
     * 
     * @return ebayItemTxnId   * eBay Auction Transaction ID of the Item 
     * 						Optional
     * 						Character length and limitations: 255 single-byte characters
     */
    public java.lang.String getEbayItemTxnId() {
        return ebayItemTxnId;
    }


    /**
     * Sets the ebayItemTxnId value for this PaymentItemType.
     * 
     * @param ebayItemTxnId   * eBay Auction Transaction ID of the Item 
     * 						Optional
     * 						Character length and limitations: 255 single-byte characters
     */
    public void setEbayItemTxnId(java.lang.String ebayItemTxnId) {
        this.ebayItemTxnId = ebayItemTxnId;
    }


    /**
     * Gets the name value for this PaymentItemType.
     * 
     * @return name   * Item name set by you or entered by the customer. 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentItemType.
     * 
     * @param name   * Item name set by you or entered by the customer. 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this PaymentItemType.
     * 
     * @return number   * Item number set by you. 
     * 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this PaymentItemType.
     * 
     * @param number   * Item number set by you. 
     * 
     * Character length and limitations: 127 single-byte alphanumeric characters
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the quantity value for this PaymentItemType.
     * 
     * @return quantity   * Quantity set by you or entered by the customer. 
     * 
     * Character length and limitations: no limit
     */
    public java.lang.String getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PaymentItemType.
     * 
     * @param quantity   * Quantity set by you or entered by the customer. 
     * 
     * Character length and limitations: no limit
     */
    public void setQuantity(java.lang.String quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the salesTax value for this PaymentItemType.
     * 
     * @return salesTax   * Amount of tax charged on payment
     */
    public java.lang.String getSalesTax() {
        return salesTax;
    }


    /**
     * Sets the salesTax value for this PaymentItemType.
     * 
     * @param salesTax   * Amount of tax charged on payment
     */
    public void setSalesTax(java.lang.String salesTax) {
        this.salesTax = salesTax;
    }


    /**
     * Gets the shippingAmount value for this PaymentItemType.
     * 
     * @return shippingAmount   * Amount of shipping charged on payment
     */
    public java.lang.String getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this PaymentItemType.
     * 
     * @param shippingAmount   * Amount of shipping charged on payment
     */
    public void setShippingAmount(java.lang.String shippingAmount) {
        this.shippingAmount = shippingAmount;
    }


    /**
     * Gets the handlingAmount value for this PaymentItemType.
     * 
     * @return handlingAmount   * Amount of handling charged on payment
     */
    public java.lang.String getHandlingAmount() {
        return handlingAmount;
    }


    /**
     * Sets the handlingAmount value for this PaymentItemType.
     * 
     * @param handlingAmount   * Amount of handling charged on payment
     */
    public void setHandlingAmount(java.lang.String handlingAmount) {
        this.handlingAmount = handlingAmount;
    }


    /**
     * Gets the invoiceItemDetails value for this PaymentItemType.
     * 
     * @return invoiceItemDetails   * Invoice item details
     */
    public eBLBaseComponents.apis.ebay.InvoiceItemType getInvoiceItemDetails() {
        return invoiceItemDetails;
    }


    /**
     * Sets the invoiceItemDetails value for this PaymentItemType.
     * 
     * @param invoiceItemDetails   * Invoice item details
     */
    public void setInvoiceItemDetails(eBLBaseComponents.apis.ebay.InvoiceItemType invoiceItemDetails) {
        this.invoiceItemDetails = invoiceItemDetails;
    }


    /**
     * Gets the couponID value for this PaymentItemType.
     * 
     * @return couponID   * Coupon ID Number
     */
    public java.lang.String getCouponID() {
        return couponID;
    }


    /**
     * Sets the couponID value for this PaymentItemType.
     * 
     * @param couponID   * Coupon ID Number
     */
    public void setCouponID(java.lang.String couponID) {
        this.couponID = couponID;
    }


    /**
     * Gets the couponAmount value for this PaymentItemType.
     * 
     * @return couponAmount   * Amount Value of The Coupon
     */
    public java.lang.String getCouponAmount() {
        return couponAmount;
    }


    /**
     * Sets the couponAmount value for this PaymentItemType.
     * 
     * @param couponAmount   * Amount Value of The Coupon
     */
    public void setCouponAmount(java.lang.String couponAmount) {
        this.couponAmount = couponAmount;
    }


    /**
     * Gets the couponAmountCurrency value for this PaymentItemType.
     * 
     * @return couponAmountCurrency   * Currency of the Coupon Amount
     */
    public java.lang.String getCouponAmountCurrency() {
        return couponAmountCurrency;
    }


    /**
     * Sets the couponAmountCurrency value for this PaymentItemType.
     * 
     * @param couponAmountCurrency   * Currency of the Coupon Amount
     */
    public void setCouponAmountCurrency(java.lang.String couponAmountCurrency) {
        this.couponAmountCurrency = couponAmountCurrency;
    }


    /**
     * Gets the loyaltyCardDiscountAmount value for this PaymentItemType.
     * 
     * @return loyaltyCardDiscountAmount   * Amount of Discount on this Loyalty Card
     */
    public java.lang.String getLoyaltyCardDiscountAmount() {
        return loyaltyCardDiscountAmount;
    }


    /**
     * Sets the loyaltyCardDiscountAmount value for this PaymentItemType.
     * 
     * @param loyaltyCardDiscountAmount   * Amount of Discount on this Loyalty Card
     */
    public void setLoyaltyCardDiscountAmount(java.lang.String loyaltyCardDiscountAmount) {
        this.loyaltyCardDiscountAmount = loyaltyCardDiscountAmount;
    }


    /**
     * Gets the loyaltyCardDiscountCurrency value for this PaymentItemType.
     * 
     * @return loyaltyCardDiscountCurrency   * Currency of the Discount
     */
    public java.lang.String getLoyaltyCardDiscountCurrency() {
        return loyaltyCardDiscountCurrency;
    }


    /**
     * Sets the loyaltyCardDiscountCurrency value for this PaymentItemType.
     * 
     * @param loyaltyCardDiscountCurrency   * Currency of the Discount
     */
    public void setLoyaltyCardDiscountCurrency(java.lang.String loyaltyCardDiscountCurrency) {
        this.loyaltyCardDiscountCurrency = loyaltyCardDiscountCurrency;
    }


    /**
     * Gets the amount value for this PaymentItemType.
     * 
     * @return amount   * Cost of item
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentItemType.
     * 
     * @param amount   * Cost of item
     */
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the options value for this PaymentItemType.
     * 
     * @return options   * Item options selected in PayPal shopping cart
     */
    public eBLBaseComponents.apis.ebay.OptionType[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this PaymentItemType.
     * 
     * @param options   * Item options selected in PayPal shopping cart
     */
    public void setOptions(eBLBaseComponents.apis.ebay.OptionType[] options) {
        this.options = options;
    }

    public eBLBaseComponents.apis.ebay.OptionType getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, eBLBaseComponents.apis.ebay.OptionType _value) {
        this.options[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentItemType)) return false;
        PaymentItemType other = (PaymentItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ebayItemTxnId==null && other.getEbayItemTxnId()==null) || 
             (this.ebayItemTxnId!=null &&
              this.ebayItemTxnId.equals(other.getEbayItemTxnId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.salesTax==null && other.getSalesTax()==null) || 
             (this.salesTax!=null &&
              this.salesTax.equals(other.getSalesTax()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              this.shippingAmount.equals(other.getShippingAmount()))) &&
            ((this.handlingAmount==null && other.getHandlingAmount()==null) || 
             (this.handlingAmount!=null &&
              this.handlingAmount.equals(other.getHandlingAmount()))) &&
            ((this.invoiceItemDetails==null && other.getInvoiceItemDetails()==null) || 
             (this.invoiceItemDetails!=null &&
              this.invoiceItemDetails.equals(other.getInvoiceItemDetails()))) &&
            ((this.couponID==null && other.getCouponID()==null) || 
             (this.couponID!=null &&
              this.couponID.equals(other.getCouponID()))) &&
            ((this.couponAmount==null && other.getCouponAmount()==null) || 
             (this.couponAmount!=null &&
              this.couponAmount.equals(other.getCouponAmount()))) &&
            ((this.couponAmountCurrency==null && other.getCouponAmountCurrency()==null) || 
             (this.couponAmountCurrency!=null &&
              this.couponAmountCurrency.equals(other.getCouponAmountCurrency()))) &&
            ((this.loyaltyCardDiscountAmount==null && other.getLoyaltyCardDiscountAmount()==null) || 
             (this.loyaltyCardDiscountAmount!=null &&
              this.loyaltyCardDiscountAmount.equals(other.getLoyaltyCardDiscountAmount()))) &&
            ((this.loyaltyCardDiscountCurrency==null && other.getLoyaltyCardDiscountCurrency()==null) || 
             (this.loyaltyCardDiscountCurrency!=null &&
              this.loyaltyCardDiscountCurrency.equals(other.getLoyaltyCardDiscountCurrency()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions())));
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
        if (getEbayItemTxnId() != null) {
            _hashCode += getEbayItemTxnId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getSalesTax() != null) {
            _hashCode += getSalesTax().hashCode();
        }
        if (getShippingAmount() != null) {
            _hashCode += getShippingAmount().hashCode();
        }
        if (getHandlingAmount() != null) {
            _hashCode += getHandlingAmount().hashCode();
        }
        if (getInvoiceItemDetails() != null) {
            _hashCode += getInvoiceItemDetails().hashCode();
        }
        if (getCouponID() != null) {
            _hashCode += getCouponID().hashCode();
        }
        if (getCouponAmount() != null) {
            _hashCode += getCouponAmount().hashCode();
        }
        if (getCouponAmountCurrency() != null) {
            _hashCode += getCouponAmountCurrency().hashCode();
        }
        if (getLoyaltyCardDiscountAmount() != null) {
            _hashCode += getLoyaltyCardDiscountAmount().hashCode();
        }
        if (getLoyaltyCardDiscountCurrency() != null) {
            _hashCode += getLoyaltyCardDiscountCurrency().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
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
        new org.apache.axis.description.TypeDesc(PaymentItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebayItemTxnId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayItemTxnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SalesTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HandlingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceItemDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceItemDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CouponID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CouponAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponAmountCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CouponAmountCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loyaltyCardDiscountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LoyaltyCardDiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loyaltyCardDiscountCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LoyaltyCardDiscountCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
