/**
 * PaymentDetailsItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PaymentDetailsItemType 
 * 				Information about a Payment Item.
 */
public class PaymentDetailsItemType  implements java.io.Serializable {
    /* Item name. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 single-byte characters */
    private java.lang.String name;

    /* Item number. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 single-byte characters */
    private java.lang.String number;

    /* Item quantity. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Any positive integer */
    private java.math.BigInteger quantity;

    /* Item sales tax. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: any valid currency amount;
     * currency code is set the same as for OrderTotal. */
    private CoreComponentTypes.apis.ebay.BasicAmountType tax;

    /* Cost of item 
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies. 
     * 
     * 						
     * Optional
     * 
     * 						Limitations: Must not exceed $10,000 USD in any currency. No
     * currency symbol. Decimal separator must be a period (.), and the thousands
     * separator must be a comma (,). */
    private CoreComponentTypes.apis.ebay.BasicAmountType amount;

    /* Ebay specific details.
     * 
     * 						
     * Optional */
    private eBLBaseComponents.apis.ebay.EbayItemPaymentDetailsItemType ebayItemPaymentDetailsItem;

    /* Promotional financing code for item. Part of the Merchant Services
     * Promotion Financing feature. */
    private java.lang.String promoCode;

    private eBLBaseComponents.apis.ebay.ProductCategoryType productCategory;

    /* Item description. 
     * 						Optional
     * 						Character length and limitations: 127 single-byte characters */
    private java.lang.String description;

    /* Information about the Item weight. */
    private CoreComponentTypes.apis.ebay.MeasureType itemWeight;

    /* Information about the Item length. */
    private CoreComponentTypes.apis.ebay.MeasureType itemLength;

    /* Information about the Item width. */
    private CoreComponentTypes.apis.ebay.MeasureType itemWidth;

    /* Information about the Item height. */
    private CoreComponentTypes.apis.ebay.MeasureType itemHeight;

    /* URL for the item.
     * 						Optional
     * 						Character length and limitations: no limit. */
    private java.lang.String itemURL;

    /* Enhanced data for each item in the cart.
     * 						Optional */
    private EnhancedDataTypes.apis.ebay.EnhancedItemDataType enhancedItemData;

    /* Item category - physical or digital. 
     *                                 Optional */
    private eBLBaseComponents.apis.ebay.ItemCategoryType itemCategory;

    public PaymentDetailsItemType() {
    }

    public PaymentDetailsItemType(
           java.lang.String name,
           java.lang.String number,
           java.math.BigInteger quantity,
           CoreComponentTypes.apis.ebay.BasicAmountType tax,
           CoreComponentTypes.apis.ebay.BasicAmountType amount,
           eBLBaseComponents.apis.ebay.EbayItemPaymentDetailsItemType ebayItemPaymentDetailsItem,
           java.lang.String promoCode,
           eBLBaseComponents.apis.ebay.ProductCategoryType productCategory,
           java.lang.String description,
           CoreComponentTypes.apis.ebay.MeasureType itemWeight,
           CoreComponentTypes.apis.ebay.MeasureType itemLength,
           CoreComponentTypes.apis.ebay.MeasureType itemWidth,
           CoreComponentTypes.apis.ebay.MeasureType itemHeight,
           java.lang.String itemURL,
           EnhancedDataTypes.apis.ebay.EnhancedItemDataType enhancedItemData,
           eBLBaseComponents.apis.ebay.ItemCategoryType itemCategory) {
           this.name = name;
           this.number = number;
           this.quantity = quantity;
           this.tax = tax;
           this.amount = amount;
           this.ebayItemPaymentDetailsItem = ebayItemPaymentDetailsItem;
           this.promoCode = promoCode;
           this.productCategory = productCategory;
           this.description = description;
           this.itemWeight = itemWeight;
           this.itemLength = itemLength;
           this.itemWidth = itemWidth;
           this.itemHeight = itemHeight;
           this.itemURL = itemURL;
           this.enhancedItemData = enhancedItemData;
           this.itemCategory = itemCategory;
    }


    /**
     * Gets the name value for this PaymentDetailsItemType.
     * 
     * @return name   * Item name. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 single-byte characters
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PaymentDetailsItemType.
     * 
     * @param name   * Item name. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 single-byte characters
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the number value for this PaymentDetailsItemType.
     * 
     * @return number   * Item number. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 single-byte characters
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this PaymentDetailsItemType.
     * 
     * @param number   * Item number. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 127 single-byte characters
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the quantity value for this PaymentDetailsItemType.
     * 
     * @return quantity   * Item quantity. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Any positive integer
     */
    public java.math.BigInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PaymentDetailsItemType.
     * 
     * @param quantity   * Item quantity. 
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: Any positive integer
     */
    public void setQuantity(java.math.BigInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the tax value for this PaymentDetailsItemType.
     * 
     * @return tax   * Item sales tax. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: any valid currency amount;
     * currency code is set the same as for OrderTotal.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this PaymentDetailsItemType.
     * 
     * @param tax   * Item sales tax. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: any valid currency amount;
     * currency code is set the same as for OrderTotal.
     */
    public void setTax(CoreComponentTypes.apis.ebay.BasicAmountType tax) {
        this.tax = tax;
    }


    /**
     * Gets the amount value for this PaymentDetailsItemType.
     * 
     * @return amount   * Cost of item 
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
    public CoreComponentTypes.apis.ebay.BasicAmountType getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this PaymentDetailsItemType.
     * 
     * @param amount   * Cost of item 
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
    public void setAmount(CoreComponentTypes.apis.ebay.BasicAmountType amount) {
        this.amount = amount;
    }


    /**
     * Gets the ebayItemPaymentDetailsItem value for this PaymentDetailsItemType.
     * 
     * @return ebayItemPaymentDetailsItem   * Ebay specific details.
     * 
     * 						
     * Optional
     */
    public eBLBaseComponents.apis.ebay.EbayItemPaymentDetailsItemType getEbayItemPaymentDetailsItem() {
        return ebayItemPaymentDetailsItem;
    }


    /**
     * Sets the ebayItemPaymentDetailsItem value for this PaymentDetailsItemType.
     * 
     * @param ebayItemPaymentDetailsItem   * Ebay specific details.
     * 
     * 						
     * Optional
     */
    public void setEbayItemPaymentDetailsItem(eBLBaseComponents.apis.ebay.EbayItemPaymentDetailsItemType ebayItemPaymentDetailsItem) {
        this.ebayItemPaymentDetailsItem = ebayItemPaymentDetailsItem;
    }


    /**
     * Gets the promoCode value for this PaymentDetailsItemType.
     * 
     * @return promoCode   * Promotional financing code for item. Part of the Merchant Services
     * Promotion Financing feature.
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this PaymentDetailsItemType.
     * 
     * @param promoCode   * Promotional financing code for item. Part of the Merchant Services
     * Promotion Financing feature.
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the productCategory value for this PaymentDetailsItemType.
     * 
     * @return productCategory
     */
    public eBLBaseComponents.apis.ebay.ProductCategoryType getProductCategory() {
        return productCategory;
    }


    /**
     * Sets the productCategory value for this PaymentDetailsItemType.
     * 
     * @param productCategory
     */
    public void setProductCategory(eBLBaseComponents.apis.ebay.ProductCategoryType productCategory) {
        this.productCategory = productCategory;
    }


    /**
     * Gets the description value for this PaymentDetailsItemType.
     * 
     * @return description   * Item description. 
     * 						Optional
     * 						Character length and limitations: 127 single-byte characters
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PaymentDetailsItemType.
     * 
     * @param description   * Item description. 
     * 						Optional
     * 						Character length and limitations: 127 single-byte characters
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the itemWeight value for this PaymentDetailsItemType.
     * 
     * @return itemWeight   * Information about the Item weight.
     */
    public CoreComponentTypes.apis.ebay.MeasureType getItemWeight() {
        return itemWeight;
    }


    /**
     * Sets the itemWeight value for this PaymentDetailsItemType.
     * 
     * @param itemWeight   * Information about the Item weight.
     */
    public void setItemWeight(CoreComponentTypes.apis.ebay.MeasureType itemWeight) {
        this.itemWeight = itemWeight;
    }


    /**
     * Gets the itemLength value for this PaymentDetailsItemType.
     * 
     * @return itemLength   * Information about the Item length.
     */
    public CoreComponentTypes.apis.ebay.MeasureType getItemLength() {
        return itemLength;
    }


    /**
     * Sets the itemLength value for this PaymentDetailsItemType.
     * 
     * @param itemLength   * Information about the Item length.
     */
    public void setItemLength(CoreComponentTypes.apis.ebay.MeasureType itemLength) {
        this.itemLength = itemLength;
    }


    /**
     * Gets the itemWidth value for this PaymentDetailsItemType.
     * 
     * @return itemWidth   * Information about the Item width.
     */
    public CoreComponentTypes.apis.ebay.MeasureType getItemWidth() {
        return itemWidth;
    }


    /**
     * Sets the itemWidth value for this PaymentDetailsItemType.
     * 
     * @param itemWidth   * Information about the Item width.
     */
    public void setItemWidth(CoreComponentTypes.apis.ebay.MeasureType itemWidth) {
        this.itemWidth = itemWidth;
    }


    /**
     * Gets the itemHeight value for this PaymentDetailsItemType.
     * 
     * @return itemHeight   * Information about the Item height.
     */
    public CoreComponentTypes.apis.ebay.MeasureType getItemHeight() {
        return itemHeight;
    }


    /**
     * Sets the itemHeight value for this PaymentDetailsItemType.
     * 
     * @param itemHeight   * Information about the Item height.
     */
    public void setItemHeight(CoreComponentTypes.apis.ebay.MeasureType itemHeight) {
        this.itemHeight = itemHeight;
    }


    /**
     * Gets the itemURL value for this PaymentDetailsItemType.
     * 
     * @return itemURL   * URL for the item.
     * 						Optional
     * 						Character length and limitations: no limit.
     */
    public java.lang.String getItemURL() {
        return itemURL;
    }


    /**
     * Sets the itemURL value for this PaymentDetailsItemType.
     * 
     * @param itemURL   * URL for the item.
     * 						Optional
     * 						Character length and limitations: no limit.
     */
    public void setItemURL(java.lang.String itemURL) {
        this.itemURL = itemURL;
    }


    /**
     * Gets the enhancedItemData value for this PaymentDetailsItemType.
     * 
     * @return enhancedItemData   * Enhanced data for each item in the cart.
     * 						Optional
     */
    public EnhancedDataTypes.apis.ebay.EnhancedItemDataType getEnhancedItemData() {
        return enhancedItemData;
    }


    /**
     * Sets the enhancedItemData value for this PaymentDetailsItemType.
     * 
     * @param enhancedItemData   * Enhanced data for each item in the cart.
     * 						Optional
     */
    public void setEnhancedItemData(EnhancedDataTypes.apis.ebay.EnhancedItemDataType enhancedItemData) {
        this.enhancedItemData = enhancedItemData;
    }


    /**
     * Gets the itemCategory value for this PaymentDetailsItemType.
     * 
     * @return itemCategory   * Item category - physical or digital. 
     *                                 Optional
     */
    public eBLBaseComponents.apis.ebay.ItemCategoryType getItemCategory() {
        return itemCategory;
    }


    /**
     * Sets the itemCategory value for this PaymentDetailsItemType.
     * 
     * @param itemCategory   * Item category - physical or digital. 
     *                                 Optional
     */
    public void setItemCategory(eBLBaseComponents.apis.ebay.ItemCategoryType itemCategory) {
        this.itemCategory = itemCategory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaymentDetailsItemType)) return false;
        PaymentDetailsItemType other = (PaymentDetailsItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.ebayItemPaymentDetailsItem==null && other.getEbayItemPaymentDetailsItem()==null) || 
             (this.ebayItemPaymentDetailsItem!=null &&
              this.ebayItemPaymentDetailsItem.equals(other.getEbayItemPaymentDetailsItem()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.productCategory==null && other.getProductCategory()==null) || 
             (this.productCategory!=null &&
              this.productCategory.equals(other.getProductCategory()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.itemWeight==null && other.getItemWeight()==null) || 
             (this.itemWeight!=null &&
              this.itemWeight.equals(other.getItemWeight()))) &&
            ((this.itemLength==null && other.getItemLength()==null) || 
             (this.itemLength!=null &&
              this.itemLength.equals(other.getItemLength()))) &&
            ((this.itemWidth==null && other.getItemWidth()==null) || 
             (this.itemWidth!=null &&
              this.itemWidth.equals(other.getItemWidth()))) &&
            ((this.itemHeight==null && other.getItemHeight()==null) || 
             (this.itemHeight!=null &&
              this.itemHeight.equals(other.getItemHeight()))) &&
            ((this.itemURL==null && other.getItemURL()==null) || 
             (this.itemURL!=null &&
              this.itemURL.equals(other.getItemURL()))) &&
            ((this.enhancedItemData==null && other.getEnhancedItemData()==null) || 
             (this.enhancedItemData!=null &&
              this.enhancedItemData.equals(other.getEnhancedItemData()))) &&
            ((this.itemCategory==null && other.getItemCategory()==null) || 
             (this.itemCategory!=null &&
              this.itemCategory.equals(other.getItemCategory())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getEbayItemPaymentDetailsItem() != null) {
            _hashCode += getEbayItemPaymentDetailsItem().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getProductCategory() != null) {
            _hashCode += getProductCategory().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getItemWeight() != null) {
            _hashCode += getItemWeight().hashCode();
        }
        if (getItemLength() != null) {
            _hashCode += getItemLength().hashCode();
        }
        if (getItemWidth() != null) {
            _hashCode += getItemWidth().hashCode();
        }
        if (getItemHeight() != null) {
            _hashCode += getItemHeight().hashCode();
        }
        if (getItemURL() != null) {
            _hashCode += getItemURL().hashCode();
        }
        if (getEnhancedItemData() != null) {
            _hashCode += getEnhancedItemData().hashCode();
        }
        if (getItemCategory() != null) {
            _hashCode += getItemCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaymentDetailsItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentDetailsItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
        elemField.setFieldName("ebayItemPaymentDetailsItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayItemPaymentDetailsItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayItemPaymentDetailsItemType"));
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
        elemField.setFieldName("productCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLength");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemWidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "MeasureType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedItemData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedItemData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedItemDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCategoryType"));
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
