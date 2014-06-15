/**
 * SetEbayMobileCheckoutRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetEbayMobileCheckoutRequestDetailsType  implements java.io.Serializable {
    /* The value 'Auction' indicates that user is coming to checkout
     * after an auction ended. A value of 'BuyItNow' indicates if the user
     * is coming to checkout by clicking on the 'buy it now' button in a
     * chinese auction. A value of 'FixedPriceItem' indicates that user clicked
     * on 'Buy it now' on  a fixed price item. A value of Autopay indicates
     * autopay (or immediate pay) which is not supported at the moment.
     * 					
     * 					
     * 					Required */
    private eBLBaseComponents.apis.ebay.EbayCheckoutType checkoutType;

    /* An item number assigned to the item in eBay database. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String itemId;

    /* An Transaction id assigned to the item in eBay database. In
     * case of Chinese auction Item Id itself indicates Transaction Id. Transaction
     * Id in this case is Zero.
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String transactionId;

    /* An id indicating the site on which the item was listed. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 2 alphanumeric characters */
    private java.lang.String siteId;

    /* Buyers ebay Id. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String buyerId;

    /* Indicating the client type. Weather it is WAP or J2ME. A value
     * of 'WAP' indicates WAP. A value of 'J2MEClient' indicates J2ME client.
     * 
     * 						
     * 						
     * 						Required */
    private eBLBaseComponents.apis.ebay.DyneticClientType clientType;

    /* The phone number of the buyer's mobile device, if available. */
    private eBLBaseComponents.apis.ebay.PhoneNumberType buyerPhone;

    /* URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 						
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: no limit. */
    private java.lang.String returnURL;

    /* URL to which the customer is returned if he does not approve
     * the use of PayPal to pay you. PayPal recommends that the value of
     * CancelURL be the original page on which the customer chose to pay
     * with PayPal. 
     * 
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: no limit */
    private java.lang.String cancelURL;

    /* Specify quantity in case it is an immediate pay (or autopay)
     * item. 
     * 						
     * 						
     * 						Optional */
    private java.lang.Integer quantity;

    /* Cost of this item before tax and shipping.You must set the
     * currencyID attribute to one of the three-character currency codes
     * for any of the supported PayPal currencies.Used only for autopay items.
     * 						
     * 						
     * 						Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType itemAmount;

    public SetEbayMobileCheckoutRequestDetailsType() {
    }

    public SetEbayMobileCheckoutRequestDetailsType(
           eBLBaseComponents.apis.ebay.EbayCheckoutType checkoutType,
           java.lang.String itemId,
           java.lang.String transactionId,
           java.lang.String siteId,
           java.lang.String buyerId,
           eBLBaseComponents.apis.ebay.DyneticClientType clientType,
           eBLBaseComponents.apis.ebay.PhoneNumberType buyerPhone,
           java.lang.String returnURL,
           java.lang.String cancelURL,
           java.lang.Integer quantity,
           CoreComponentTypes.apis.ebay.BasicAmountType itemAmount) {
           this.checkoutType = checkoutType;
           this.itemId = itemId;
           this.transactionId = transactionId;
           this.siteId = siteId;
           this.buyerId = buyerId;
           this.clientType = clientType;
           this.buyerPhone = buyerPhone;
           this.returnURL = returnURL;
           this.cancelURL = cancelURL;
           this.quantity = quantity;
           this.itemAmount = itemAmount;
    }


    /**
     * Gets the checkoutType value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return checkoutType   * The value 'Auction' indicates that user is coming to checkout
     * after an auction ended. A value of 'BuyItNow' indicates if the user
     * is coming to checkout by clicking on the 'buy it now' button in a
     * chinese auction. A value of 'FixedPriceItem' indicates that user clicked
     * on 'Buy it now' on  a fixed price item. A value of Autopay indicates
     * autopay (or immediate pay) which is not supported at the moment.
     * 					
     * 					
     * 					Required
     */
    public eBLBaseComponents.apis.ebay.EbayCheckoutType getCheckoutType() {
        return checkoutType;
    }


    /**
     * Sets the checkoutType value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param checkoutType   * The value 'Auction' indicates that user is coming to checkout
     * after an auction ended. A value of 'BuyItNow' indicates if the user
     * is coming to checkout by clicking on the 'buy it now' button in a
     * chinese auction. A value of 'FixedPriceItem' indicates that user clicked
     * on 'Buy it now' on  a fixed price item. A value of Autopay indicates
     * autopay (or immediate pay) which is not supported at the moment.
     * 					
     * 					
     * 					Required
     */
    public void setCheckoutType(eBLBaseComponents.apis.ebay.EbayCheckoutType checkoutType) {
        this.checkoutType = checkoutType;
    }


    /**
     * Gets the itemId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return itemId   * An item number assigned to the item in eBay database. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param itemId   * An item number assigned to the item in eBay database. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the transactionId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return transactionId   * An Transaction id assigned to the item in eBay database. In
     * case of Chinese auction Item Id itself indicates Transaction Id. Transaction
     * Id in this case is Zero.
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param transactionId   * An Transaction id assigned to the item in eBay database. In
     * case of Chinese auction Item Id itself indicates Transaction Id. Transaction
     * Id in this case is Zero.
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the siteId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return siteId   * An id indicating the site on which the item was listed. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 2 alphanumeric characters
     */
    public java.lang.String getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param siteId   * An id indicating the site on which the item was listed. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 2 alphanumeric characters
     */
    public void setSiteId(java.lang.String siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the buyerId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return buyerId   * Buyers ebay Id. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param buyerId   * Buyers ebay Id. 
     * 						
     * 						
     * 						Required
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setBuyerId(java.lang.String buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the clientType value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return clientType   * Indicating the client type. Weather it is WAP or J2ME. A value
     * of 'WAP' indicates WAP. A value of 'J2MEClient' indicates J2ME client.
     * 
     * 						
     * 						
     * 						Required
     */
    public eBLBaseComponents.apis.ebay.DyneticClientType getClientType() {
        return clientType;
    }


    /**
     * Sets the clientType value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param clientType   * Indicating the client type. Weather it is WAP or J2ME. A value
     * of 'WAP' indicates WAP. A value of 'J2MEClient' indicates J2ME client.
     * 
     * 						
     * 						
     * 						Required
     */
    public void setClientType(eBLBaseComponents.apis.ebay.DyneticClientType clientType) {
        this.clientType = clientType;
    }


    /**
     * Gets the buyerPhone value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return buyerPhone   * The phone number of the buyer's mobile device, if available.
     */
    public eBLBaseComponents.apis.ebay.PhoneNumberType getBuyerPhone() {
        return buyerPhone;
    }


    /**
     * Sets the buyerPhone value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param buyerPhone   * The phone number of the buyer's mobile device, if available.
     */
    public void setBuyerPhone(eBLBaseComponents.apis.ebay.PhoneNumberType buyerPhone) {
        this.buyerPhone = buyerPhone;
    }


    /**
     * Gets the returnURL value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return returnURL   * URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 						
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: no limit.
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param returnURL   * URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 						
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: no limit.
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the cancelURL value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return cancelURL   * URL to which the customer is returned if he does not approve
     * the use of PayPal to pay you. PayPal recommends that the value of
     * CancelURL be the original page on which the customer chose to pay
     * with PayPal. 
     * 
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: no limit
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param cancelURL   * URL to which the customer is returned if he does not approve
     * the use of PayPal to pay you. PayPal recommends that the value of
     * CancelURL be the original page on which the customer chose to pay
     * with PayPal. 
     * 
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: no limit
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the quantity value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return quantity   * Specify quantity in case it is an immediate pay (or autopay)
     * item. 
     * 						
     * 						
     * 						Optional
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param quantity   * Specify quantity in case it is an immediate pay (or autopay)
     * item. 
     * 						
     * 						
     * 						Optional
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the itemAmount value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @return itemAmount   * Cost of this item before tax and shipping.You must set the
     * currencyID attribute to one of the three-character currency codes
     * for any of the supported PayPal currencies.Used only for autopay items.
     * 						
     * 						
     * 						Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemAmount() {
        return itemAmount;
    }


    /**
     * Sets the itemAmount value for this SetEbayMobileCheckoutRequestDetailsType.
     * 
     * @param itemAmount   * Cost of this item before tax and shipping.You must set the
     * currencyID attribute to one of the three-character currency codes
     * for any of the supported PayPal currencies.Used only for autopay items.
     * 						
     * 						
     * 						Optional
     */
    public void setItemAmount(CoreComponentTypes.apis.ebay.BasicAmountType itemAmount) {
        this.itemAmount = itemAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetEbayMobileCheckoutRequestDetailsType)) return false;
        SetEbayMobileCheckoutRequestDetailsType other = (SetEbayMobileCheckoutRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.checkoutType==null && other.getCheckoutType()==null) || 
             (this.checkoutType!=null &&
              this.checkoutType.equals(other.getCheckoutType()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.buyerId==null && other.getBuyerId()==null) || 
             (this.buyerId!=null &&
              this.buyerId.equals(other.getBuyerId()))) &&
            ((this.clientType==null && other.getClientType()==null) || 
             (this.clientType!=null &&
              this.clientType.equals(other.getClientType()))) &&
            ((this.buyerPhone==null && other.getBuyerPhone()==null) || 
             (this.buyerPhone!=null &&
              this.buyerPhone.equals(other.getBuyerPhone()))) &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.itemAmount==null && other.getItemAmount()==null) || 
             (this.itemAmount!=null &&
              this.itemAmount.equals(other.getItemAmount())));
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
        if (getCheckoutType() != null) {
            _hashCode += getCheckoutType().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getBuyerId() != null) {
            _hashCode += getBuyerId().hashCode();
        }
        if (getClientType() != null) {
            _hashCode += getClientType().hashCode();
        }
        if (getBuyerPhone() != null) {
            _hashCode += getBuyerPhone().hashCode();
        }
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getItemAmount() != null) {
            _hashCode += getItemAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetEbayMobileCheckoutRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetEbayMobileCheckoutRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkoutType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CheckoutType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EbayCheckoutType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ClientType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DyneticClientType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhoneNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReturnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CancelURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
