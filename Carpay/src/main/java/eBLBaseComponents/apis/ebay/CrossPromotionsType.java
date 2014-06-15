/**
 * CrossPromotionsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Merchandizing info for an Item. This contains a list of crosssell
 * 				or upsell items.
 * 				PrimaryScheme, PromotionMethod,SellerId,ItemId, ShippingDiscount
 * 				do not have be min occur 0
 */
public class CrossPromotionsType  implements java.io.Serializable {
    /* Item ID for the base item. Based on this item other items are
     * 
     * 						promoted. */
    private java.lang.String itemID;

    private eBLBaseComponents.apis.ebay.PromotionSchemeCodeType primaryScheme;

    private eBLBaseComponents.apis.ebay.PromotionMethodCodeType promotionMethod;

    /* Id of the Seller who is promoting this item. */
    private java.lang.String sellerID;

    /* Shipping Discount offered or not by the seller. */
    private boolean shippingDiscount;

    /* Key of the Seller who is promoting this item. */
    private java.lang.String sellerKey;

    /* Store Name for the seller. */
    private java.lang.String storeName;

    private eBLBaseComponents.apis.ebay.PromotedItemType[] promotedItem;

    public CrossPromotionsType() {
    }

    public CrossPromotionsType(
           java.lang.String itemID,
           eBLBaseComponents.apis.ebay.PromotionSchemeCodeType primaryScheme,
           eBLBaseComponents.apis.ebay.PromotionMethodCodeType promotionMethod,
           java.lang.String sellerID,
           boolean shippingDiscount,
           java.lang.String sellerKey,
           java.lang.String storeName,
           eBLBaseComponents.apis.ebay.PromotedItemType[] promotedItem) {
           this.itemID = itemID;
           this.primaryScheme = primaryScheme;
           this.promotionMethod = promotionMethod;
           this.sellerID = sellerID;
           this.shippingDiscount = shippingDiscount;
           this.sellerKey = sellerKey;
           this.storeName = storeName;
           this.promotedItem = promotedItem;
    }


    /**
     * Gets the itemID value for this CrossPromotionsType.
     * 
     * @return itemID   * Item ID for the base item. Based on this item other items are
     * 
     * 						promoted.
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this CrossPromotionsType.
     * 
     * @param itemID   * Item ID for the base item. Based on this item other items are
     * 
     * 						promoted.
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the primaryScheme value for this CrossPromotionsType.
     * 
     * @return primaryScheme
     */
    public eBLBaseComponents.apis.ebay.PromotionSchemeCodeType getPrimaryScheme() {
        return primaryScheme;
    }


    /**
     * Sets the primaryScheme value for this CrossPromotionsType.
     * 
     * @param primaryScheme
     */
    public void setPrimaryScheme(eBLBaseComponents.apis.ebay.PromotionSchemeCodeType primaryScheme) {
        this.primaryScheme = primaryScheme;
    }


    /**
     * Gets the promotionMethod value for this CrossPromotionsType.
     * 
     * @return promotionMethod
     */
    public eBLBaseComponents.apis.ebay.PromotionMethodCodeType getPromotionMethod() {
        return promotionMethod;
    }


    /**
     * Sets the promotionMethod value for this CrossPromotionsType.
     * 
     * @param promotionMethod
     */
    public void setPromotionMethod(eBLBaseComponents.apis.ebay.PromotionMethodCodeType promotionMethod) {
        this.promotionMethod = promotionMethod;
    }


    /**
     * Gets the sellerID value for this CrossPromotionsType.
     * 
     * @return sellerID   * Id of the Seller who is promoting this item.
     */
    public java.lang.String getSellerID() {
        return sellerID;
    }


    /**
     * Sets the sellerID value for this CrossPromotionsType.
     * 
     * @param sellerID   * Id of the Seller who is promoting this item.
     */
    public void setSellerID(java.lang.String sellerID) {
        this.sellerID = sellerID;
    }


    /**
     * Gets the shippingDiscount value for this CrossPromotionsType.
     * 
     * @return shippingDiscount   * Shipping Discount offered or not by the seller.
     */
    public boolean isShippingDiscount() {
        return shippingDiscount;
    }


    /**
     * Sets the shippingDiscount value for this CrossPromotionsType.
     * 
     * @param shippingDiscount   * Shipping Discount offered or not by the seller.
     */
    public void setShippingDiscount(boolean shippingDiscount) {
        this.shippingDiscount = shippingDiscount;
    }


    /**
     * Gets the sellerKey value for this CrossPromotionsType.
     * 
     * @return sellerKey   * Key of the Seller who is promoting this item.
     */
    public java.lang.String getSellerKey() {
        return sellerKey;
    }


    /**
     * Sets the sellerKey value for this CrossPromotionsType.
     * 
     * @param sellerKey   * Key of the Seller who is promoting this item.
     */
    public void setSellerKey(java.lang.String sellerKey) {
        this.sellerKey = sellerKey;
    }


    /**
     * Gets the storeName value for this CrossPromotionsType.
     * 
     * @return storeName   * Store Name for the seller.
     */
    public java.lang.String getStoreName() {
        return storeName;
    }


    /**
     * Sets the storeName value for this CrossPromotionsType.
     * 
     * @param storeName   * Store Name for the seller.
     */
    public void setStoreName(java.lang.String storeName) {
        this.storeName = storeName;
    }


    /**
     * Gets the promotedItem value for this CrossPromotionsType.
     * 
     * @return promotedItem
     */
    public eBLBaseComponents.apis.ebay.PromotedItemType[] getPromotedItem() {
        return promotedItem;
    }


    /**
     * Sets the promotedItem value for this CrossPromotionsType.
     * 
     * @param promotedItem
     */
    public void setPromotedItem(eBLBaseComponents.apis.ebay.PromotedItemType[] promotedItem) {
        this.promotedItem = promotedItem;
    }

    public eBLBaseComponents.apis.ebay.PromotedItemType getPromotedItem(int i) {
        return this.promotedItem[i];
    }

    public void setPromotedItem(int i, eBLBaseComponents.apis.ebay.PromotedItemType _value) {
        this.promotedItem[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrossPromotionsType)) return false;
        CrossPromotionsType other = (CrossPromotionsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemID==null && other.getItemID()==null) || 
             (this.itemID!=null &&
              this.itemID.equals(other.getItemID()))) &&
            ((this.primaryScheme==null && other.getPrimaryScheme()==null) || 
             (this.primaryScheme!=null &&
              this.primaryScheme.equals(other.getPrimaryScheme()))) &&
            ((this.promotionMethod==null && other.getPromotionMethod()==null) || 
             (this.promotionMethod!=null &&
              this.promotionMethod.equals(other.getPromotionMethod()))) &&
            ((this.sellerID==null && other.getSellerID()==null) || 
             (this.sellerID!=null &&
              this.sellerID.equals(other.getSellerID()))) &&
            this.shippingDiscount == other.isShippingDiscount() &&
            ((this.sellerKey==null && other.getSellerKey()==null) || 
             (this.sellerKey!=null &&
              this.sellerKey.equals(other.getSellerKey()))) &&
            ((this.storeName==null && other.getStoreName()==null) || 
             (this.storeName!=null &&
              this.storeName.equals(other.getStoreName()))) &&
            ((this.promotedItem==null && other.getPromotedItem()==null) || 
             (this.promotedItem!=null &&
              java.util.Arrays.equals(this.promotedItem, other.getPromotedItem())));
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
        if (getItemID() != null) {
            _hashCode += getItemID().hashCode();
        }
        if (getPrimaryScheme() != null) {
            _hashCode += getPrimaryScheme().hashCode();
        }
        if (getPromotionMethod() != null) {
            _hashCode += getPromotionMethod().hashCode();
        }
        if (getSellerID() != null) {
            _hashCode += getSellerID().hashCode();
        }
        _hashCode += (isShippingDiscount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSellerKey() != null) {
            _hashCode += getSellerKey().hashCode();
        }
        if (getStoreName() != null) {
            _hashCode += getStoreName().hashCode();
        }
        if (getPromotedItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotedItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotedItem(), i);
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
        new org.apache.axis.description.TypeDesc(CrossPromotionsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CrossPromotionsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryScheme");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PrimaryScheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionSchemeCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionMethodCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ShippingDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerKey");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotedItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotedItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotedItemType"));
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
