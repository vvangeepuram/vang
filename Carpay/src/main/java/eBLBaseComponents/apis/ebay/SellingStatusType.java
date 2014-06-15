/**
 * SellingStatusType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains the listed items price details which consists of
 * 			following information: BuyItNowPrice, ConvertedBuyItNowPrice,
 * 			ConvertedPrice, ConvertedStartPrice, CurrentPrice, MinimumToBid,
 * 
 * 			ReservePrice, and StartPrice.  need to take in account get seller
 * events when defining minoccurs = 0
 */
public class SellingStatusType  implements java.io.Serializable {
    /* Number of bids placed so far against the item. Not
     * 			               returned for International Fixed Price items. */
    private java.lang.Integer bidCount;

    /* Smallest amount a bid must be above the current high 
     * 			               bid. Not returned International Fixed Price items. */
    private CoreComponentTypes.apis.ebay.AmountType bidIncrement;

    /* Converted current price of listed item. */
    private CoreComponentTypes.apis.ebay.AmountType convertedCurrentPrice;

    /* For auction-format listings, current minimum asking price 
     * 					or the current highest bid for the item if bids have been 
     * 					placed. Shows minimum bid if no bids have been placed 
     * 					against the item. This field does not reflect the actual current
     * 
     * 					price of the item if it's a Type=7 or Type=9 (Fixed Price) 
     * 					item and the price has been revised. (See StartPrice for 
     * 					revised asking price.) */
    private CoreComponentTypes.apis.ebay.AmountType currentPrice;

    /* Contains one User node representing the current high 
     * 			                 bidder. GetItem returns a high bidder for auctions
     * that have 
     * 			                 ended and have a winning bidder. For Fixed Price
     * listings, 
     * 			                 in-progress auctions, or auction items that received
     * no 
     * 			                 bids, GetItem returns a HighBidder node with empty
     * tags. */
    private eBLBaseComponents.apis.ebay.UserType highBidder;

    /* Applicable to ad-format items only. Indicates how many 
     * 			                  leads to potential buyers are associated with
     * this item. 
     * 			                  For other item types (other than ad-format items),
     * returns
     * 			                  a value of 0 (zero). */
    private java.lang.Integer leadCount;

    /* Minimum acceptable bid for the item. Not returned for 
     * 			                  International Fixed Price items. */
    private CoreComponentTypes.apis.ebay.AmountType minimumToBid;

    /* Number of items purchased so far. (Subtract from the value
     * 					     returned in the Quantity field to calculate the number of
     * items
     * 					     remaining.) */
    private int quantitySold;

    /* Returns true if the reserve price was met or no reserve
     * 						price was specified. */
    private java.lang.Boolean reserveMet;

    private java.lang.Boolean secondChanceEligible;

    public SellingStatusType() {
    }

    public SellingStatusType(
           java.lang.Integer bidCount,
           CoreComponentTypes.apis.ebay.AmountType bidIncrement,
           CoreComponentTypes.apis.ebay.AmountType convertedCurrentPrice,
           CoreComponentTypes.apis.ebay.AmountType currentPrice,
           eBLBaseComponents.apis.ebay.UserType highBidder,
           java.lang.Integer leadCount,
           CoreComponentTypes.apis.ebay.AmountType minimumToBid,
           int quantitySold,
           java.lang.Boolean reserveMet,
           java.lang.Boolean secondChanceEligible) {
           this.bidCount = bidCount;
           this.bidIncrement = bidIncrement;
           this.convertedCurrentPrice = convertedCurrentPrice;
           this.currentPrice = currentPrice;
           this.highBidder = highBidder;
           this.leadCount = leadCount;
           this.minimumToBid = minimumToBid;
           this.quantitySold = quantitySold;
           this.reserveMet = reserveMet;
           this.secondChanceEligible = secondChanceEligible;
    }


    /**
     * Gets the bidCount value for this SellingStatusType.
     * 
     * @return bidCount   * Number of bids placed so far against the item. Not
     * 			               returned for International Fixed Price items.
     */
    public java.lang.Integer getBidCount() {
        return bidCount;
    }


    /**
     * Sets the bidCount value for this SellingStatusType.
     * 
     * @param bidCount   * Number of bids placed so far against the item. Not
     * 			               returned for International Fixed Price items.
     */
    public void setBidCount(java.lang.Integer bidCount) {
        this.bidCount = bidCount;
    }


    /**
     * Gets the bidIncrement value for this SellingStatusType.
     * 
     * @return bidIncrement   * Smallest amount a bid must be above the current high 
     * 			               bid. Not returned International Fixed Price items.
     */
    public CoreComponentTypes.apis.ebay.AmountType getBidIncrement() {
        return bidIncrement;
    }


    /**
     * Sets the bidIncrement value for this SellingStatusType.
     * 
     * @param bidIncrement   * Smallest amount a bid must be above the current high 
     * 			               bid. Not returned International Fixed Price items.
     */
    public void setBidIncrement(CoreComponentTypes.apis.ebay.AmountType bidIncrement) {
        this.bidIncrement = bidIncrement;
    }


    /**
     * Gets the convertedCurrentPrice value for this SellingStatusType.
     * 
     * @return convertedCurrentPrice   * Converted current price of listed item.
     */
    public CoreComponentTypes.apis.ebay.AmountType getConvertedCurrentPrice() {
        return convertedCurrentPrice;
    }


    /**
     * Sets the convertedCurrentPrice value for this SellingStatusType.
     * 
     * @param convertedCurrentPrice   * Converted current price of listed item.
     */
    public void setConvertedCurrentPrice(CoreComponentTypes.apis.ebay.AmountType convertedCurrentPrice) {
        this.convertedCurrentPrice = convertedCurrentPrice;
    }


    /**
     * Gets the currentPrice value for this SellingStatusType.
     * 
     * @return currentPrice   * For auction-format listings, current minimum asking price 
     * 					or the current highest bid for the item if bids have been 
     * 					placed. Shows minimum bid if no bids have been placed 
     * 					against the item. This field does not reflect the actual current
     * 
     * 					price of the item if it's a Type=7 or Type=9 (Fixed Price) 
     * 					item and the price has been revised. (See StartPrice for 
     * 					revised asking price.)
     */
    public CoreComponentTypes.apis.ebay.AmountType getCurrentPrice() {
        return currentPrice;
    }


    /**
     * Sets the currentPrice value for this SellingStatusType.
     * 
     * @param currentPrice   * For auction-format listings, current minimum asking price 
     * 					or the current highest bid for the item if bids have been 
     * 					placed. Shows minimum bid if no bids have been placed 
     * 					against the item. This field does not reflect the actual current
     * 
     * 					price of the item if it's a Type=7 or Type=9 (Fixed Price) 
     * 					item and the price has been revised. (See StartPrice for 
     * 					revised asking price.)
     */
    public void setCurrentPrice(CoreComponentTypes.apis.ebay.AmountType currentPrice) {
        this.currentPrice = currentPrice;
    }


    /**
     * Gets the highBidder value for this SellingStatusType.
     * 
     * @return highBidder   * Contains one User node representing the current high 
     * 			                 bidder. GetItem returns a high bidder for auctions
     * that have 
     * 			                 ended and have a winning bidder. For Fixed Price
     * listings, 
     * 			                 in-progress auctions, or auction items that received
     * no 
     * 			                 bids, GetItem returns a HighBidder node with empty
     * tags.
     */
    public eBLBaseComponents.apis.ebay.UserType getHighBidder() {
        return highBidder;
    }


    /**
     * Sets the highBidder value for this SellingStatusType.
     * 
     * @param highBidder   * Contains one User node representing the current high 
     * 			                 bidder. GetItem returns a high bidder for auctions
     * that have 
     * 			                 ended and have a winning bidder. For Fixed Price
     * listings, 
     * 			                 in-progress auctions, or auction items that received
     * no 
     * 			                 bids, GetItem returns a HighBidder node with empty
     * tags.
     */
    public void setHighBidder(eBLBaseComponents.apis.ebay.UserType highBidder) {
        this.highBidder = highBidder;
    }


    /**
     * Gets the leadCount value for this SellingStatusType.
     * 
     * @return leadCount   * Applicable to ad-format items only. Indicates how many 
     * 			                  leads to potential buyers are associated with
     * this item. 
     * 			                  For other item types (other than ad-format items),
     * returns
     * 			                  a value of 0 (zero).
     */
    public java.lang.Integer getLeadCount() {
        return leadCount;
    }


    /**
     * Sets the leadCount value for this SellingStatusType.
     * 
     * @param leadCount   * Applicable to ad-format items only. Indicates how many 
     * 			                  leads to potential buyers are associated with
     * this item. 
     * 			                  For other item types (other than ad-format items),
     * returns
     * 			                  a value of 0 (zero).
     */
    public void setLeadCount(java.lang.Integer leadCount) {
        this.leadCount = leadCount;
    }


    /**
     * Gets the minimumToBid value for this SellingStatusType.
     * 
     * @return minimumToBid   * Minimum acceptable bid for the item. Not returned for 
     * 			                  International Fixed Price items.
     */
    public CoreComponentTypes.apis.ebay.AmountType getMinimumToBid() {
        return minimumToBid;
    }


    /**
     * Sets the minimumToBid value for this SellingStatusType.
     * 
     * @param minimumToBid   * Minimum acceptable bid for the item. Not returned for 
     * 			                  International Fixed Price items.
     */
    public void setMinimumToBid(CoreComponentTypes.apis.ebay.AmountType minimumToBid) {
        this.minimumToBid = minimumToBid;
    }


    /**
     * Gets the quantitySold value for this SellingStatusType.
     * 
     * @return quantitySold   * Number of items purchased so far. (Subtract from the value
     * 					     returned in the Quantity field to calculate the number of
     * items
     * 					     remaining.)
     */
    public int getQuantitySold() {
        return quantitySold;
    }


    /**
     * Sets the quantitySold value for this SellingStatusType.
     * 
     * @param quantitySold   * Number of items purchased so far. (Subtract from the value
     * 					     returned in the Quantity field to calculate the number of
     * items
     * 					     remaining.)
     */
    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }


    /**
     * Gets the reserveMet value for this SellingStatusType.
     * 
     * @return reserveMet   * Returns true if the reserve price was met or no reserve
     * 						price was specified.
     */
    public java.lang.Boolean getReserveMet() {
        return reserveMet;
    }


    /**
     * Sets the reserveMet value for this SellingStatusType.
     * 
     * @param reserveMet   * Returns true if the reserve price was met or no reserve
     * 						price was specified.
     */
    public void setReserveMet(java.lang.Boolean reserveMet) {
        this.reserveMet = reserveMet;
    }


    /**
     * Gets the secondChanceEligible value for this SellingStatusType.
     * 
     * @return secondChanceEligible
     */
    public java.lang.Boolean getSecondChanceEligible() {
        return secondChanceEligible;
    }


    /**
     * Sets the secondChanceEligible value for this SellingStatusType.
     * 
     * @param secondChanceEligible
     */
    public void setSecondChanceEligible(java.lang.Boolean secondChanceEligible) {
        this.secondChanceEligible = secondChanceEligible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellingStatusType)) return false;
        SellingStatusType other = (SellingStatusType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bidCount==null && other.getBidCount()==null) || 
             (this.bidCount!=null &&
              this.bidCount.equals(other.getBidCount()))) &&
            ((this.bidIncrement==null && other.getBidIncrement()==null) || 
             (this.bidIncrement!=null &&
              this.bidIncrement.equals(other.getBidIncrement()))) &&
            ((this.convertedCurrentPrice==null && other.getConvertedCurrentPrice()==null) || 
             (this.convertedCurrentPrice!=null &&
              this.convertedCurrentPrice.equals(other.getConvertedCurrentPrice()))) &&
            ((this.currentPrice==null && other.getCurrentPrice()==null) || 
             (this.currentPrice!=null &&
              this.currentPrice.equals(other.getCurrentPrice()))) &&
            ((this.highBidder==null && other.getHighBidder()==null) || 
             (this.highBidder!=null &&
              this.highBidder.equals(other.getHighBidder()))) &&
            ((this.leadCount==null && other.getLeadCount()==null) || 
             (this.leadCount!=null &&
              this.leadCount.equals(other.getLeadCount()))) &&
            ((this.minimumToBid==null && other.getMinimumToBid()==null) || 
             (this.minimumToBid!=null &&
              this.minimumToBid.equals(other.getMinimumToBid()))) &&
            this.quantitySold == other.getQuantitySold() &&
            ((this.reserveMet==null && other.getReserveMet()==null) || 
             (this.reserveMet!=null &&
              this.reserveMet.equals(other.getReserveMet()))) &&
            ((this.secondChanceEligible==null && other.getSecondChanceEligible()==null) || 
             (this.secondChanceEligible!=null &&
              this.secondChanceEligible.equals(other.getSecondChanceEligible())));
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
        if (getBidCount() != null) {
            _hashCode += getBidCount().hashCode();
        }
        if (getBidIncrement() != null) {
            _hashCode += getBidIncrement().hashCode();
        }
        if (getConvertedCurrentPrice() != null) {
            _hashCode += getConvertedCurrentPrice().hashCode();
        }
        if (getCurrentPrice() != null) {
            _hashCode += getCurrentPrice().hashCode();
        }
        if (getHighBidder() != null) {
            _hashCode += getHighBidder().hashCode();
        }
        if (getLeadCount() != null) {
            _hashCode += getLeadCount().hashCode();
        }
        if (getMinimumToBid() != null) {
            _hashCode += getMinimumToBid().hashCode();
        }
        _hashCode += getQuantitySold();
        if (getReserveMet() != null) {
            _hashCode += getReserveMet().hashCode();
        }
        if (getSecondChanceEligible() != null) {
            _hashCode += getSecondChanceEligible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellingStatusType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellingStatusType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BidCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bidIncrement");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BidIncrement"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convertedCurrentPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ConvertedCurrentPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrentPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highBidder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HighBidder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LeadCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumToBid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MinimumToBid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantitySold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "QuantitySold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reserveMet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReserveMet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondChanceEligible");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SecondChanceEligible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
