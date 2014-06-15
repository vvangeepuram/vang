/**
 * ListingDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains the listed item details which consists of following information:
 * .
 */
public class ListingDetailsType  implements java.io.Serializable {
    private java.lang.Boolean adult;

    private java.lang.Boolean bindingAuction;

    private java.lang.Boolean checkoutEnabled;

    /* Converted value of the BuyItNowPrice in the currency 
     * 			               indicated by SiteCurrency. This value must be refreshed
     * 
     * 			               every 24 hours to pick up the current conversion
     * rates. */
    private CoreComponentTypes.apis.ebay.AmountType convertedBuyItNowPrice;

    /* Converted value of the StartPrice field in the currency 
     * 			               indicated by SiteCurrency. This value must be refreshed
     * 
     * 			               every 24 hours to pick up the current conversion
     * rates. */
    private CoreComponentTypes.apis.ebay.AmountType convertedStartPrice;

    /* Indicates the converted reserve price for a reserve auction.
     * Returned 
     * 					 only if DetailLevel = 4. ReservePrice is only returned for auctions
     * with 
     * 					 a reserve price where the user calling GetItem is the item's
     * seller. 
     * 					 Returned as null for International Fixed Price items. For more
     * information 
     * 					 on reserve price auctions, see http://pages.ebay.com/help/basics/f-format.html#1. */
    private CoreComponentTypes.apis.ebay.AmountType convertedReservePrice;

    private java.lang.Boolean hasReservePrice;

    private java.lang.String regionName;

    /* Indicates the new ItemID for a relisted item. When an item
     * is 
     * 			               	relisted, the old (expired) listing is annotated
     * with the new 
     * 			               	(relist) ItemID. This field only appears when the
     * old listing is 
     * 			               	retrieved. */
    private java.lang.String relistedItemID;

    /* The ItemID for the original listing (i.e., OriginalItemID specific
     * 
     * 			               to Second Chance Offer items). */
    private java.lang.String secondChanceOriginalItemID;

    /* Time stamp for the start of the listing (in GMT). For regular
     * items, 
     * 			              StartTime is not sent in at listing time. */
    private java.util.Calendar startTime;

    /* Time stamp for the end of the listing (in GMT). */
    private java.util.Calendar endTime;

    private org.apache.axis.types.URI viewItemURL;

    public ListingDetailsType() {
    }

    public ListingDetailsType(
           java.lang.Boolean adult,
           java.lang.Boolean bindingAuction,
           java.lang.Boolean checkoutEnabled,
           CoreComponentTypes.apis.ebay.AmountType convertedBuyItNowPrice,
           CoreComponentTypes.apis.ebay.AmountType convertedStartPrice,
           CoreComponentTypes.apis.ebay.AmountType convertedReservePrice,
           java.lang.Boolean hasReservePrice,
           java.lang.String regionName,
           java.lang.String relistedItemID,
           java.lang.String secondChanceOriginalItemID,
           java.util.Calendar startTime,
           java.util.Calendar endTime,
           org.apache.axis.types.URI viewItemURL) {
           this.adult = adult;
           this.bindingAuction = bindingAuction;
           this.checkoutEnabled = checkoutEnabled;
           this.convertedBuyItNowPrice = convertedBuyItNowPrice;
           this.convertedStartPrice = convertedStartPrice;
           this.convertedReservePrice = convertedReservePrice;
           this.hasReservePrice = hasReservePrice;
           this.regionName = regionName;
           this.relistedItemID = relistedItemID;
           this.secondChanceOriginalItemID = secondChanceOriginalItemID;
           this.startTime = startTime;
           this.endTime = endTime;
           this.viewItemURL = viewItemURL;
    }


    /**
     * Gets the adult value for this ListingDetailsType.
     * 
     * @return adult
     */
    public java.lang.Boolean getAdult() {
        return adult;
    }


    /**
     * Sets the adult value for this ListingDetailsType.
     * 
     * @param adult
     */
    public void setAdult(java.lang.Boolean adult) {
        this.adult = adult;
    }


    /**
     * Gets the bindingAuction value for this ListingDetailsType.
     * 
     * @return bindingAuction
     */
    public java.lang.Boolean getBindingAuction() {
        return bindingAuction;
    }


    /**
     * Sets the bindingAuction value for this ListingDetailsType.
     * 
     * @param bindingAuction
     */
    public void setBindingAuction(java.lang.Boolean bindingAuction) {
        this.bindingAuction = bindingAuction;
    }


    /**
     * Gets the checkoutEnabled value for this ListingDetailsType.
     * 
     * @return checkoutEnabled
     */
    public java.lang.Boolean getCheckoutEnabled() {
        return checkoutEnabled;
    }


    /**
     * Sets the checkoutEnabled value for this ListingDetailsType.
     * 
     * @param checkoutEnabled
     */
    public void setCheckoutEnabled(java.lang.Boolean checkoutEnabled) {
        this.checkoutEnabled = checkoutEnabled;
    }


    /**
     * Gets the convertedBuyItNowPrice value for this ListingDetailsType.
     * 
     * @return convertedBuyItNowPrice   * Converted value of the BuyItNowPrice in the currency 
     * 			               indicated by SiteCurrency. This value must be refreshed
     * 
     * 			               every 24 hours to pick up the current conversion
     * rates.
     */
    public CoreComponentTypes.apis.ebay.AmountType getConvertedBuyItNowPrice() {
        return convertedBuyItNowPrice;
    }


    /**
     * Sets the convertedBuyItNowPrice value for this ListingDetailsType.
     * 
     * @param convertedBuyItNowPrice   * Converted value of the BuyItNowPrice in the currency 
     * 			               indicated by SiteCurrency. This value must be refreshed
     * 
     * 			               every 24 hours to pick up the current conversion
     * rates.
     */
    public void setConvertedBuyItNowPrice(CoreComponentTypes.apis.ebay.AmountType convertedBuyItNowPrice) {
        this.convertedBuyItNowPrice = convertedBuyItNowPrice;
    }


    /**
     * Gets the convertedStartPrice value for this ListingDetailsType.
     * 
     * @return convertedStartPrice   * Converted value of the StartPrice field in the currency 
     * 			               indicated by SiteCurrency. This value must be refreshed
     * 
     * 			               every 24 hours to pick up the current conversion
     * rates.
     */
    public CoreComponentTypes.apis.ebay.AmountType getConvertedStartPrice() {
        return convertedStartPrice;
    }


    /**
     * Sets the convertedStartPrice value for this ListingDetailsType.
     * 
     * @param convertedStartPrice   * Converted value of the StartPrice field in the currency 
     * 			               indicated by SiteCurrency. This value must be refreshed
     * 
     * 			               every 24 hours to pick up the current conversion
     * rates.
     */
    public void setConvertedStartPrice(CoreComponentTypes.apis.ebay.AmountType convertedStartPrice) {
        this.convertedStartPrice = convertedStartPrice;
    }


    /**
     * Gets the convertedReservePrice value for this ListingDetailsType.
     * 
     * @return convertedReservePrice   * Indicates the converted reserve price for a reserve auction.
     * Returned 
     * 					 only if DetailLevel = 4. ReservePrice is only returned for auctions
     * with 
     * 					 a reserve price where the user calling GetItem is the item's
     * seller. 
     * 					 Returned as null for International Fixed Price items. For more
     * information 
     * 					 on reserve price auctions, see http://pages.ebay.com/help/basics/f-format.html#1.
     */
    public CoreComponentTypes.apis.ebay.AmountType getConvertedReservePrice() {
        return convertedReservePrice;
    }


    /**
     * Sets the convertedReservePrice value for this ListingDetailsType.
     * 
     * @param convertedReservePrice   * Indicates the converted reserve price for a reserve auction.
     * Returned 
     * 					 only if DetailLevel = 4. ReservePrice is only returned for auctions
     * with 
     * 					 a reserve price where the user calling GetItem is the item's
     * seller. 
     * 					 Returned as null for International Fixed Price items. For more
     * information 
     * 					 on reserve price auctions, see http://pages.ebay.com/help/basics/f-format.html#1.
     */
    public void setConvertedReservePrice(CoreComponentTypes.apis.ebay.AmountType convertedReservePrice) {
        this.convertedReservePrice = convertedReservePrice;
    }


    /**
     * Gets the hasReservePrice value for this ListingDetailsType.
     * 
     * @return hasReservePrice
     */
    public java.lang.Boolean getHasReservePrice() {
        return hasReservePrice;
    }


    /**
     * Sets the hasReservePrice value for this ListingDetailsType.
     * 
     * @param hasReservePrice
     */
    public void setHasReservePrice(java.lang.Boolean hasReservePrice) {
        this.hasReservePrice = hasReservePrice;
    }


    /**
     * Gets the regionName value for this ListingDetailsType.
     * 
     * @return regionName
     */
    public java.lang.String getRegionName() {
        return regionName;
    }


    /**
     * Sets the regionName value for this ListingDetailsType.
     * 
     * @param regionName
     */
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }


    /**
     * Gets the relistedItemID value for this ListingDetailsType.
     * 
     * @return relistedItemID   * Indicates the new ItemID for a relisted item. When an item
     * is 
     * 			               	relisted, the old (expired) listing is annotated
     * with the new 
     * 			               	(relist) ItemID. This field only appears when the
     * old listing is 
     * 			               	retrieved.
     */
    public java.lang.String getRelistedItemID() {
        return relistedItemID;
    }


    /**
     * Sets the relistedItemID value for this ListingDetailsType.
     * 
     * @param relistedItemID   * Indicates the new ItemID for a relisted item. When an item
     * is 
     * 			               	relisted, the old (expired) listing is annotated
     * with the new 
     * 			               	(relist) ItemID. This field only appears when the
     * old listing is 
     * 			               	retrieved.
     */
    public void setRelistedItemID(java.lang.String relistedItemID) {
        this.relistedItemID = relistedItemID;
    }


    /**
     * Gets the secondChanceOriginalItemID value for this ListingDetailsType.
     * 
     * @return secondChanceOriginalItemID   * The ItemID for the original listing (i.e., OriginalItemID specific
     * 
     * 			               to Second Chance Offer items).
     */
    public java.lang.String getSecondChanceOriginalItemID() {
        return secondChanceOriginalItemID;
    }


    /**
     * Sets the secondChanceOriginalItemID value for this ListingDetailsType.
     * 
     * @param secondChanceOriginalItemID   * The ItemID for the original listing (i.e., OriginalItemID specific
     * 
     * 			               to Second Chance Offer items).
     */
    public void setSecondChanceOriginalItemID(java.lang.String secondChanceOriginalItemID) {
        this.secondChanceOriginalItemID = secondChanceOriginalItemID;
    }


    /**
     * Gets the startTime value for this ListingDetailsType.
     * 
     * @return startTime   * Time stamp for the start of the listing (in GMT). For regular
     * items, 
     * 			              StartTime is not sent in at listing time.
     */
    public java.util.Calendar getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this ListingDetailsType.
     * 
     * @param startTime   * Time stamp for the start of the listing (in GMT). For regular
     * items, 
     * 			              StartTime is not sent in at listing time.
     */
    public void setStartTime(java.util.Calendar startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the endTime value for this ListingDetailsType.
     * 
     * @return endTime   * Time stamp for the end of the listing (in GMT).
     */
    public java.util.Calendar getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this ListingDetailsType.
     * 
     * @param endTime   * Time stamp for the end of the listing (in GMT).
     */
    public void setEndTime(java.util.Calendar endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the viewItemURL value for this ListingDetailsType.
     * 
     * @return viewItemURL
     */
    public org.apache.axis.types.URI getViewItemURL() {
        return viewItemURL;
    }


    /**
     * Sets the viewItemURL value for this ListingDetailsType.
     * 
     * @param viewItemURL
     */
    public void setViewItemURL(org.apache.axis.types.URI viewItemURL) {
        this.viewItemURL = viewItemURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ListingDetailsType)) return false;
        ListingDetailsType other = (ListingDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adult==null && other.getAdult()==null) || 
             (this.adult!=null &&
              this.adult.equals(other.getAdult()))) &&
            ((this.bindingAuction==null && other.getBindingAuction()==null) || 
             (this.bindingAuction!=null &&
              this.bindingAuction.equals(other.getBindingAuction()))) &&
            ((this.checkoutEnabled==null && other.getCheckoutEnabled()==null) || 
             (this.checkoutEnabled!=null &&
              this.checkoutEnabled.equals(other.getCheckoutEnabled()))) &&
            ((this.convertedBuyItNowPrice==null && other.getConvertedBuyItNowPrice()==null) || 
             (this.convertedBuyItNowPrice!=null &&
              this.convertedBuyItNowPrice.equals(other.getConvertedBuyItNowPrice()))) &&
            ((this.convertedStartPrice==null && other.getConvertedStartPrice()==null) || 
             (this.convertedStartPrice!=null &&
              this.convertedStartPrice.equals(other.getConvertedStartPrice()))) &&
            ((this.convertedReservePrice==null && other.getConvertedReservePrice()==null) || 
             (this.convertedReservePrice!=null &&
              this.convertedReservePrice.equals(other.getConvertedReservePrice()))) &&
            ((this.hasReservePrice==null && other.getHasReservePrice()==null) || 
             (this.hasReservePrice!=null &&
              this.hasReservePrice.equals(other.getHasReservePrice()))) &&
            ((this.regionName==null && other.getRegionName()==null) || 
             (this.regionName!=null &&
              this.regionName.equals(other.getRegionName()))) &&
            ((this.relistedItemID==null && other.getRelistedItemID()==null) || 
             (this.relistedItemID!=null &&
              this.relistedItemID.equals(other.getRelistedItemID()))) &&
            ((this.secondChanceOriginalItemID==null && other.getSecondChanceOriginalItemID()==null) || 
             (this.secondChanceOriginalItemID!=null &&
              this.secondChanceOriginalItemID.equals(other.getSecondChanceOriginalItemID()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.viewItemURL==null && other.getViewItemURL()==null) || 
             (this.viewItemURL!=null &&
              this.viewItemURL.equals(other.getViewItemURL())));
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
        if (getAdult() != null) {
            _hashCode += getAdult().hashCode();
        }
        if (getBindingAuction() != null) {
            _hashCode += getBindingAuction().hashCode();
        }
        if (getCheckoutEnabled() != null) {
            _hashCode += getCheckoutEnabled().hashCode();
        }
        if (getConvertedBuyItNowPrice() != null) {
            _hashCode += getConvertedBuyItNowPrice().hashCode();
        }
        if (getConvertedStartPrice() != null) {
            _hashCode += getConvertedStartPrice().hashCode();
        }
        if (getConvertedReservePrice() != null) {
            _hashCode += getConvertedReservePrice().hashCode();
        }
        if (getHasReservePrice() != null) {
            _hashCode += getHasReservePrice().hashCode();
        }
        if (getRegionName() != null) {
            _hashCode += getRegionName().hashCode();
        }
        if (getRelistedItemID() != null) {
            _hashCode += getRelistedItemID().hashCode();
        }
        if (getSecondChanceOriginalItemID() != null) {
            _hashCode += getSecondChanceOriginalItemID().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getViewItemURL() != null) {
            _hashCode += getViewItemURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ListingDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ListingDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Adult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindingAuction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BindingAuction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkoutEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CheckoutEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedBuyItNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConvertedBuyItNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedStartPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConvertedStartPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedReservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConvertedReservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasReservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HasReservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RegionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relistedItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RelistedItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondChanceOriginalItemID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SecondChanceOriginalItemID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EndTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewItemURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ViewItemURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
