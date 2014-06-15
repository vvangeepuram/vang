/**
 * SellerType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Information about user used by selling applications
 * 				there are number of required elements - they will always show
 * up for seller node
 * 				there is not such a call to do revise seller info. only added
 * minoccur=0 to elements that will not show up in every 
 * 				type of request/responce
 */
public class SellerType  implements java.io.Serializable {
    private boolean allowPaymentEdit;

    private eBLBaseComponents.apis.ebay.CurrencyCodeType billingCurrency;

    private boolean checkoutEnabled;

    private boolean CIPBankAccountStored;

    private boolean goodStanding;

    private boolean liveAuctionAuthorized;

    /* Indicates whether the user has elected to participate 
     * 					            		as a seller in the Merchandising Manager feature. */
    private eBLBaseComponents.apis.ebay.MerchandizingPrefCodeType merchandizingPref;

    private boolean qualifiesForB2BVAT;

    private eBLBaseComponents.apis.ebay.SellerLevelCodeType sellerLevel;

    private eBLBaseComponents.apis.ebay.AddressType sellerPaymentAddress;

    private eBLBaseComponents.apis.ebay.SchedulingInfoType schedulingInfo;

    private boolean storeOwner;

    private org.apache.axis.types.URI storeURL;

    public SellerType() {
    }

    public SellerType(
           boolean allowPaymentEdit,
           eBLBaseComponents.apis.ebay.CurrencyCodeType billingCurrency,
           boolean checkoutEnabled,
           boolean CIPBankAccountStored,
           boolean goodStanding,
           boolean liveAuctionAuthorized,
           eBLBaseComponents.apis.ebay.MerchandizingPrefCodeType merchandizingPref,
           boolean qualifiesForB2BVAT,
           eBLBaseComponents.apis.ebay.SellerLevelCodeType sellerLevel,
           eBLBaseComponents.apis.ebay.AddressType sellerPaymentAddress,
           eBLBaseComponents.apis.ebay.SchedulingInfoType schedulingInfo,
           boolean storeOwner,
           org.apache.axis.types.URI storeURL) {
           this.allowPaymentEdit = allowPaymentEdit;
           this.billingCurrency = billingCurrency;
           this.checkoutEnabled = checkoutEnabled;
           this.CIPBankAccountStored = CIPBankAccountStored;
           this.goodStanding = goodStanding;
           this.liveAuctionAuthorized = liveAuctionAuthorized;
           this.merchandizingPref = merchandizingPref;
           this.qualifiesForB2BVAT = qualifiesForB2BVAT;
           this.sellerLevel = sellerLevel;
           this.sellerPaymentAddress = sellerPaymentAddress;
           this.schedulingInfo = schedulingInfo;
           this.storeOwner = storeOwner;
           this.storeURL = storeURL;
    }


    /**
     * Gets the allowPaymentEdit value for this SellerType.
     * 
     * @return allowPaymentEdit
     */
    public boolean isAllowPaymentEdit() {
        return allowPaymentEdit;
    }


    /**
     * Sets the allowPaymentEdit value for this SellerType.
     * 
     * @param allowPaymentEdit
     */
    public void setAllowPaymentEdit(boolean allowPaymentEdit) {
        this.allowPaymentEdit = allowPaymentEdit;
    }


    /**
     * Gets the billingCurrency value for this SellerType.
     * 
     * @return billingCurrency
     */
    public eBLBaseComponents.apis.ebay.CurrencyCodeType getBillingCurrency() {
        return billingCurrency;
    }


    /**
     * Sets the billingCurrency value for this SellerType.
     * 
     * @param billingCurrency
     */
    public void setBillingCurrency(eBLBaseComponents.apis.ebay.CurrencyCodeType billingCurrency) {
        this.billingCurrency = billingCurrency;
    }


    /**
     * Gets the checkoutEnabled value for this SellerType.
     * 
     * @return checkoutEnabled
     */
    public boolean isCheckoutEnabled() {
        return checkoutEnabled;
    }


    /**
     * Sets the checkoutEnabled value for this SellerType.
     * 
     * @param checkoutEnabled
     */
    public void setCheckoutEnabled(boolean checkoutEnabled) {
        this.checkoutEnabled = checkoutEnabled;
    }


    /**
     * Gets the CIPBankAccountStored value for this SellerType.
     * 
     * @return CIPBankAccountStored
     */
    public boolean isCIPBankAccountStored() {
        return CIPBankAccountStored;
    }


    /**
     * Sets the CIPBankAccountStored value for this SellerType.
     * 
     * @param CIPBankAccountStored
     */
    public void setCIPBankAccountStored(boolean CIPBankAccountStored) {
        this.CIPBankAccountStored = CIPBankAccountStored;
    }


    /**
     * Gets the goodStanding value for this SellerType.
     * 
     * @return goodStanding
     */
    public boolean isGoodStanding() {
        return goodStanding;
    }


    /**
     * Sets the goodStanding value for this SellerType.
     * 
     * @param goodStanding
     */
    public void setGoodStanding(boolean goodStanding) {
        this.goodStanding = goodStanding;
    }


    /**
     * Gets the liveAuctionAuthorized value for this SellerType.
     * 
     * @return liveAuctionAuthorized
     */
    public boolean isLiveAuctionAuthorized() {
        return liveAuctionAuthorized;
    }


    /**
     * Sets the liveAuctionAuthorized value for this SellerType.
     * 
     * @param liveAuctionAuthorized
     */
    public void setLiveAuctionAuthorized(boolean liveAuctionAuthorized) {
        this.liveAuctionAuthorized = liveAuctionAuthorized;
    }


    /**
     * Gets the merchandizingPref value for this SellerType.
     * 
     * @return merchandizingPref   * Indicates whether the user has elected to participate 
     * 					            		as a seller in the Merchandising Manager feature.
     */
    public eBLBaseComponents.apis.ebay.MerchandizingPrefCodeType getMerchandizingPref() {
        return merchandizingPref;
    }


    /**
     * Sets the merchandizingPref value for this SellerType.
     * 
     * @param merchandizingPref   * Indicates whether the user has elected to participate 
     * 					            		as a seller in the Merchandising Manager feature.
     */
    public void setMerchandizingPref(eBLBaseComponents.apis.ebay.MerchandizingPrefCodeType merchandizingPref) {
        this.merchandizingPref = merchandizingPref;
    }


    /**
     * Gets the qualifiesForB2BVAT value for this SellerType.
     * 
     * @return qualifiesForB2BVAT
     */
    public boolean isQualifiesForB2BVAT() {
        return qualifiesForB2BVAT;
    }


    /**
     * Sets the qualifiesForB2BVAT value for this SellerType.
     * 
     * @param qualifiesForB2BVAT
     */
    public void setQualifiesForB2BVAT(boolean qualifiesForB2BVAT) {
        this.qualifiesForB2BVAT = qualifiesForB2BVAT;
    }


    /**
     * Gets the sellerLevel value for this SellerType.
     * 
     * @return sellerLevel
     */
    public eBLBaseComponents.apis.ebay.SellerLevelCodeType getSellerLevel() {
        return sellerLevel;
    }


    /**
     * Sets the sellerLevel value for this SellerType.
     * 
     * @param sellerLevel
     */
    public void setSellerLevel(eBLBaseComponents.apis.ebay.SellerLevelCodeType sellerLevel) {
        this.sellerLevel = sellerLevel;
    }


    /**
     * Gets the sellerPaymentAddress value for this SellerType.
     * 
     * @return sellerPaymentAddress
     */
    public eBLBaseComponents.apis.ebay.AddressType getSellerPaymentAddress() {
        return sellerPaymentAddress;
    }


    /**
     * Sets the sellerPaymentAddress value for this SellerType.
     * 
     * @param sellerPaymentAddress
     */
    public void setSellerPaymentAddress(eBLBaseComponents.apis.ebay.AddressType sellerPaymentAddress) {
        this.sellerPaymentAddress = sellerPaymentAddress;
    }


    /**
     * Gets the schedulingInfo value for this SellerType.
     * 
     * @return schedulingInfo
     */
    public eBLBaseComponents.apis.ebay.SchedulingInfoType getSchedulingInfo() {
        return schedulingInfo;
    }


    /**
     * Sets the schedulingInfo value for this SellerType.
     * 
     * @param schedulingInfo
     */
    public void setSchedulingInfo(eBLBaseComponents.apis.ebay.SchedulingInfoType schedulingInfo) {
        this.schedulingInfo = schedulingInfo;
    }


    /**
     * Gets the storeOwner value for this SellerType.
     * 
     * @return storeOwner
     */
    public boolean isStoreOwner() {
        return storeOwner;
    }


    /**
     * Sets the storeOwner value for this SellerType.
     * 
     * @param storeOwner
     */
    public void setStoreOwner(boolean storeOwner) {
        this.storeOwner = storeOwner;
    }


    /**
     * Gets the storeURL value for this SellerType.
     * 
     * @return storeURL
     */
    public org.apache.axis.types.URI getStoreURL() {
        return storeURL;
    }


    /**
     * Sets the storeURL value for this SellerType.
     * 
     * @param storeURL
     */
    public void setStoreURL(org.apache.axis.types.URI storeURL) {
        this.storeURL = storeURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerType)) return false;
        SellerType other = (SellerType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowPaymentEdit == other.isAllowPaymentEdit() &&
            ((this.billingCurrency==null && other.getBillingCurrency()==null) || 
             (this.billingCurrency!=null &&
              this.billingCurrency.equals(other.getBillingCurrency()))) &&
            this.checkoutEnabled == other.isCheckoutEnabled() &&
            this.CIPBankAccountStored == other.isCIPBankAccountStored() &&
            this.goodStanding == other.isGoodStanding() &&
            this.liveAuctionAuthorized == other.isLiveAuctionAuthorized() &&
            ((this.merchandizingPref==null && other.getMerchandizingPref()==null) || 
             (this.merchandizingPref!=null &&
              this.merchandizingPref.equals(other.getMerchandizingPref()))) &&
            this.qualifiesForB2BVAT == other.isQualifiesForB2BVAT() &&
            ((this.sellerLevel==null && other.getSellerLevel()==null) || 
             (this.sellerLevel!=null &&
              this.sellerLevel.equals(other.getSellerLevel()))) &&
            ((this.sellerPaymentAddress==null && other.getSellerPaymentAddress()==null) || 
             (this.sellerPaymentAddress!=null &&
              this.sellerPaymentAddress.equals(other.getSellerPaymentAddress()))) &&
            ((this.schedulingInfo==null && other.getSchedulingInfo()==null) || 
             (this.schedulingInfo!=null &&
              this.schedulingInfo.equals(other.getSchedulingInfo()))) &&
            this.storeOwner == other.isStoreOwner() &&
            ((this.storeURL==null && other.getStoreURL()==null) || 
             (this.storeURL!=null &&
              this.storeURL.equals(other.getStoreURL())));
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
        _hashCode += (isAllowPaymentEdit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBillingCurrency() != null) {
            _hashCode += getBillingCurrency().hashCode();
        }
        _hashCode += (isCheckoutEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCIPBankAccountStored() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGoodStanding() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLiveAuctionAuthorized() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMerchandizingPref() != null) {
            _hashCode += getMerchandizingPref().hashCode();
        }
        _hashCode += (isQualifiesForB2BVAT() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSellerLevel() != null) {
            _hashCode += getSellerLevel().hashCode();
        }
        if (getSellerPaymentAddress() != null) {
            _hashCode += getSellerPaymentAddress().hashCode();
        }
        if (getSchedulingInfo() != null) {
            _hashCode += getSchedulingInfo().hashCode();
        }
        _hashCode += (isStoreOwner() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStoreURL() != null) {
            _hashCode += getStoreURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPaymentEdit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AllowPaymentEdit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CurrencyCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkoutEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CheckoutEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CIPBankAccountStored");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CIPBankAccountStored"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goodStanding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GoodStanding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveAuctionAuthorized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LiveAuctionAuthorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchandizingPref");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchandizingPref"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchandizingPrefCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifiesForB2BVAT");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "QualifiesForB2BVAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerLevelCodeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerPaymentAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerPaymentAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedulingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SchedulingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SchedulingInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreURL"));
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
