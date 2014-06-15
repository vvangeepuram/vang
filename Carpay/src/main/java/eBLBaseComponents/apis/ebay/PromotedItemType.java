/**
 * PromotedItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Merchandizing info for an Item. This contains a list of crosssell
 * 				or upsell items.
 */
public class PromotedItemType  implements java.io.Serializable {
    /* Item ID for the base item. Based on this item other items are
     * 
     * 						promoted. it is teh only tag that would show up in all calls
     * that use promoted item type. 
     * 						some are not in soap yet, such as get and ser promotion rules */
    private java.lang.String itemID;

    /* URL for the picture of the promoted item. */
    private java.lang.String pictureURL;

    /* Where to display in the list of items.currentl y even forget
     * and set does not have to be minoccur =0 
     * 						but if we ever were to do revise promotion tems, it can be omitted */
    private java.lang.Integer position;

    /* Promotion Price. Price at which the buyer can buy the item
     * now. */
    private CoreComponentTypes.apis.ebay.AmountType promotionPrice;

    private eBLBaseComponents.apis.ebay.PromotionItemPriceTypeCodeType promotionPriceType;

    private eBLBaseComponents.apis.ebay.PromotionItemSelectionCodeType selectionType;

    /* Item Title for the promoted item. */
    private java.lang.String title;

    private eBLBaseComponents.apis.ebay.ListingTypeCodeType listingType;

    public PromotedItemType() {
    }

    public PromotedItemType(
           java.lang.String itemID,
           java.lang.String pictureURL,
           java.lang.Integer position,
           CoreComponentTypes.apis.ebay.AmountType promotionPrice,
           eBLBaseComponents.apis.ebay.PromotionItemPriceTypeCodeType promotionPriceType,
           eBLBaseComponents.apis.ebay.PromotionItemSelectionCodeType selectionType,
           java.lang.String title,
           eBLBaseComponents.apis.ebay.ListingTypeCodeType listingType) {
           this.itemID = itemID;
           this.pictureURL = pictureURL;
           this.position = position;
           this.promotionPrice = promotionPrice;
           this.promotionPriceType = promotionPriceType;
           this.selectionType = selectionType;
           this.title = title;
           this.listingType = listingType;
    }


    /**
     * Gets the itemID value for this PromotedItemType.
     * 
     * @return itemID   * Item ID for the base item. Based on this item other items are
     * 
     * 						promoted. it is teh only tag that would show up in all calls
     * that use promoted item type. 
     * 						some are not in soap yet, such as get and ser promotion rules
     */
    public java.lang.String getItemID() {
        return itemID;
    }


    /**
     * Sets the itemID value for this PromotedItemType.
     * 
     * @param itemID   * Item ID for the base item. Based on this item other items are
     * 
     * 						promoted. it is teh only tag that would show up in all calls
     * that use promoted item type. 
     * 						some are not in soap yet, such as get and ser promotion rules
     */
    public void setItemID(java.lang.String itemID) {
        this.itemID = itemID;
    }


    /**
     * Gets the pictureURL value for this PromotedItemType.
     * 
     * @return pictureURL   * URL for the picture of the promoted item.
     */
    public java.lang.String getPictureURL() {
        return pictureURL;
    }


    /**
     * Sets the pictureURL value for this PromotedItemType.
     * 
     * @param pictureURL   * URL for the picture of the promoted item.
     */
    public void setPictureURL(java.lang.String pictureURL) {
        this.pictureURL = pictureURL;
    }


    /**
     * Gets the position value for this PromotedItemType.
     * 
     * @return position   * Where to display in the list of items.currentl y even forget
     * and set does not have to be minoccur =0 
     * 						but if we ever were to do revise promotion tems, it can be omitted
     */
    public java.lang.Integer getPosition() {
        return position;
    }


    /**
     * Sets the position value for this PromotedItemType.
     * 
     * @param position   * Where to display in the list of items.currentl y even forget
     * and set does not have to be minoccur =0 
     * 						but if we ever were to do revise promotion tems, it can be omitted
     */
    public void setPosition(java.lang.Integer position) {
        this.position = position;
    }


    /**
     * Gets the promotionPrice value for this PromotedItemType.
     * 
     * @return promotionPrice   * Promotion Price. Price at which the buyer can buy the item
     * now.
     */
    public CoreComponentTypes.apis.ebay.AmountType getPromotionPrice() {
        return promotionPrice;
    }


    /**
     * Sets the promotionPrice value for this PromotedItemType.
     * 
     * @param promotionPrice   * Promotion Price. Price at which the buyer can buy the item
     * now.
     */
    public void setPromotionPrice(CoreComponentTypes.apis.ebay.AmountType promotionPrice) {
        this.promotionPrice = promotionPrice;
    }


    /**
     * Gets the promotionPriceType value for this PromotedItemType.
     * 
     * @return promotionPriceType
     */
    public eBLBaseComponents.apis.ebay.PromotionItemPriceTypeCodeType getPromotionPriceType() {
        return promotionPriceType;
    }


    /**
     * Sets the promotionPriceType value for this PromotedItemType.
     * 
     * @param promotionPriceType
     */
    public void setPromotionPriceType(eBLBaseComponents.apis.ebay.PromotionItemPriceTypeCodeType promotionPriceType) {
        this.promotionPriceType = promotionPriceType;
    }


    /**
     * Gets the selectionType value for this PromotedItemType.
     * 
     * @return selectionType
     */
    public eBLBaseComponents.apis.ebay.PromotionItemSelectionCodeType getSelectionType() {
        return selectionType;
    }


    /**
     * Sets the selectionType value for this PromotedItemType.
     * 
     * @param selectionType
     */
    public void setSelectionType(eBLBaseComponents.apis.ebay.PromotionItemSelectionCodeType selectionType) {
        this.selectionType = selectionType;
    }


    /**
     * Gets the title value for this PromotedItemType.
     * 
     * @return title   * Item Title for the promoted item.
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PromotedItemType.
     * 
     * @param title   * Item Title for the promoted item.
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the listingType value for this PromotedItemType.
     * 
     * @return listingType
     */
    public eBLBaseComponents.apis.ebay.ListingTypeCodeType getListingType() {
        return listingType;
    }


    /**
     * Sets the listingType value for this PromotedItemType.
     * 
     * @param listingType
     */
    public void setListingType(eBLBaseComponents.apis.ebay.ListingTypeCodeType listingType) {
        this.listingType = listingType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotedItemType)) return false;
        PromotedItemType other = (PromotedItemType) obj;
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
            ((this.pictureURL==null && other.getPictureURL()==null) || 
             (this.pictureURL!=null &&
              this.pictureURL.equals(other.getPictureURL()))) &&
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.promotionPrice==null && other.getPromotionPrice()==null) || 
             (this.promotionPrice!=null &&
              this.promotionPrice.equals(other.getPromotionPrice()))) &&
            ((this.promotionPriceType==null && other.getPromotionPriceType()==null) || 
             (this.promotionPriceType!=null &&
              this.promotionPriceType.equals(other.getPromotionPriceType()))) &&
            ((this.selectionType==null && other.getSelectionType()==null) || 
             (this.selectionType!=null &&
              this.selectionType.equals(other.getSelectionType()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.listingType==null && other.getListingType()==null) || 
             (this.listingType!=null &&
              this.listingType.equals(other.getListingType())));
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
        if (getPictureURL() != null) {
            _hashCode += getPictureURL().hashCode();
        }
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getPromotionPrice() != null) {
            _hashCode += getPromotionPrice().hashCode();
        }
        if (getPromotionPriceType() != null) {
            _hashCode += getPromotionPriceType().hashCode();
        }
        if (getSelectionType() != null) {
            _hashCode += getSelectionType().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getListingType() != null) {
            _hashCode += getListingType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotedItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotedItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pictureURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PictureURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionPriceType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionPriceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionItemPriceTypeCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectionType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SelectionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PromotionItemSelectionCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingTypeCodeType"));
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
