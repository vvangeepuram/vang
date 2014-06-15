/**
 * SetMobileCheckoutRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetMobileCheckoutRequestDetailsType  implements java.io.Serializable {
    /* The phone number of the buyer's mobile device, if available. */
    private eBLBaseComponents.apis.ebay.PhoneNumberType buyerPhone;

    /* Cost of this item before tax and shipping.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Required */
    private CoreComponentTypes.apis.ebay.BasicAmountType itemAmount;

    /* Tax amount for this item.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType tax;

    /* Shipping amount for this item.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional */
    private CoreComponentTypes.apis.ebay.BasicAmountType shipping;

    /* Description of the item that the customer is purchasing. 
     * 
     * 						
     * Required
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String itemName;

    /* Reference number of the item that the customer is purchasing.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String itemNumber;

    /* A free-form field for your own use, such as a tracking number
     * or other value you want returned to you in IPN.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters */
    private java.lang.String custom;

    /* Your own unique invoice or tracking number.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String invoiceID;

    /* URL to which the customer's browser is returned after choosing
     * to pay with PayPal. PayPal recommends that the value of ReturnURL
     * be the final review page on which the customer confirms the order
     * and payment. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: no limit. */
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
     * Character length and limitations: no limit */
    private java.lang.String cancelURL;

    /* The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Setting
     * this element overrides the setting you have specified in your Merchant
     * Account Profile. 
     * 
     * 						
     * Optional */
    private java.lang.Integer addressDisplayOptions;

    /* The value 1 indicates that you require that the customer specifies
     * a contact phone for the transactxion.  Default is 0 / none required.
     * 
     * 						
     * Optional */
    private java.lang.Integer sharePhone;

    /* Customer's shipping address. 
     * 
     * 						
     * Optional */
    private eBLBaseComponents.apis.ebay.AddressType shipToAddress;

    /* Email address of the buyer as entered during checkout. PayPal
     * uses this value to pre-fill the login portion of the PayPal login
     * page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limit: 127 single-byte alphanumeric characters */
    private java.lang.String buyerEmail;

    public SetMobileCheckoutRequestDetailsType() {
    }

    public SetMobileCheckoutRequestDetailsType(
           eBLBaseComponents.apis.ebay.PhoneNumberType buyerPhone,
           CoreComponentTypes.apis.ebay.BasicAmountType itemAmount,
           CoreComponentTypes.apis.ebay.BasicAmountType tax,
           CoreComponentTypes.apis.ebay.BasicAmountType shipping,
           java.lang.String itemName,
           java.lang.String itemNumber,
           java.lang.String custom,
           java.lang.String invoiceID,
           java.lang.String returnURL,
           java.lang.String cancelURL,
           java.lang.Integer addressDisplayOptions,
           java.lang.Integer sharePhone,
           eBLBaseComponents.apis.ebay.AddressType shipToAddress,
           java.lang.String buyerEmail) {
           this.buyerPhone = buyerPhone;
           this.itemAmount = itemAmount;
           this.tax = tax;
           this.shipping = shipping;
           this.itemName = itemName;
           this.itemNumber = itemNumber;
           this.custom = custom;
           this.invoiceID = invoiceID;
           this.returnURL = returnURL;
           this.cancelURL = cancelURL;
           this.addressDisplayOptions = addressDisplayOptions;
           this.sharePhone = sharePhone;
           this.shipToAddress = shipToAddress;
           this.buyerEmail = buyerEmail;
    }


    /**
     * Gets the buyerPhone value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return buyerPhone   * The phone number of the buyer's mobile device, if available.
     */
    public eBLBaseComponents.apis.ebay.PhoneNumberType getBuyerPhone() {
        return buyerPhone;
    }


    /**
     * Sets the buyerPhone value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param buyerPhone   * The phone number of the buyer's mobile device, if available.
     */
    public void setBuyerPhone(eBLBaseComponents.apis.ebay.PhoneNumberType buyerPhone) {
        this.buyerPhone = buyerPhone;
    }


    /**
     * Gets the itemAmount value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return itemAmount   * Cost of this item before tax and shipping.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Required
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemAmount() {
        return itemAmount;
    }


    /**
     * Sets the itemAmount value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param itemAmount   * Cost of this item before tax and shipping.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Required
     */
    public void setItemAmount(CoreComponentTypes.apis.ebay.BasicAmountType itemAmount) {
        this.itemAmount = itemAmount;
    }


    /**
     * Gets the tax value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return tax   * Tax amount for this item.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param tax   * Tax amount for this item.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     */
    public void setTax(CoreComponentTypes.apis.ebay.BasicAmountType tax) {
        this.tax = tax;
    }


    /**
     * Gets the shipping value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return shipping   * Shipping amount for this item.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param shipping   * Shipping amount for this item.
     * You must set the currencyID attribute to one of the three-character
     * currency codes for any of the supported PayPal currencies.
     * 
     * 						
     * Optional
     */
    public void setShipping(CoreComponentTypes.apis.ebay.BasicAmountType shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the itemName value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return itemName   * Description of the item that the customer is purchasing. 
     * 
     * 						
     * Required
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param itemName   * Description of the item that the customer is purchasing. 
     * 
     * 						
     * Required
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the itemNumber value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return itemNumber   * Reference number of the item that the customer is purchasing.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getItemNumber() {
        return itemNumber;
    }


    /**
     * Sets the itemNumber value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param itemNumber   * Reference number of the item that the customer is purchasing.
     * 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setItemNumber(java.lang.String itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * Gets the custom value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return custom   * A free-form field for your own use, such as a tracking number
     * or other value you want returned to you in IPN.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public java.lang.String getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param custom   * A free-form field for your own use, such as a tracking number
     * or other value you want returned to you in IPN.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters
     */
    public void setCustom(java.lang.String custom) {
        this.custom = custom;
    }


    /**
     * Gets the invoiceID value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return invoiceID   * Your own unique invoice or tracking number.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getInvoiceID() {
        return invoiceID;
    }


    /**
     * Sets the invoiceID value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param invoiceID   * Your own unique invoice or tracking number.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setInvoiceID(java.lang.String invoiceID) {
        this.invoiceID = invoiceID;
    }


    /**
     * Gets the returnURL value for this SetMobileCheckoutRequestDetailsType.
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
     * Character length and limitations: no limit.
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this SetMobileCheckoutRequestDetailsType.
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
     * Character length and limitations: no limit.
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the cancelURL value for this SetMobileCheckoutRequestDetailsType.
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
     * Character length and limitations: no limit
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this SetMobileCheckoutRequestDetailsType.
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
     * Character length and limitations: no limit
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the addressDisplayOptions value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return addressDisplayOptions   * The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Setting
     * this element overrides the setting you have specified in your Merchant
     * Account Profile. 
     * 
     * 						
     * Optional
     */
    public java.lang.Integer getAddressDisplayOptions() {
        return addressDisplayOptions;
    }


    /**
     * Sets the addressDisplayOptions value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param addressDisplayOptions   * The value 1 indicates that you require that the customer's
     * shipping address on file with PayPal be a confirmed address. Setting
     * this element overrides the setting you have specified in your Merchant
     * Account Profile. 
     * 
     * 						
     * Optional
     */
    public void setAddressDisplayOptions(java.lang.Integer addressDisplayOptions) {
        this.addressDisplayOptions = addressDisplayOptions;
    }


    /**
     * Gets the sharePhone value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return sharePhone   * The value 1 indicates that you require that the customer specifies
     * a contact phone for the transactxion.  Default is 0 / none required.
     * 
     * 						
     * Optional
     */
    public java.lang.Integer getSharePhone() {
        return sharePhone;
    }


    /**
     * Sets the sharePhone value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param sharePhone   * The value 1 indicates that you require that the customer specifies
     * a contact phone for the transactxion.  Default is 0 / none required.
     * 
     * 						
     * Optional
     */
    public void setSharePhone(java.lang.Integer sharePhone) {
        this.sharePhone = sharePhone;
    }


    /**
     * Gets the shipToAddress value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return shipToAddress   * Customer's shipping address. 
     * 
     * 						
     * Optional
     */
    public eBLBaseComponents.apis.ebay.AddressType getShipToAddress() {
        return shipToAddress;
    }


    /**
     * Sets the shipToAddress value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param shipToAddress   * Customer's shipping address. 
     * 
     * 						
     * Optional
     */
    public void setShipToAddress(eBLBaseComponents.apis.ebay.AddressType shipToAddress) {
        this.shipToAddress = shipToAddress;
    }


    /**
     * Gets the buyerEmail value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @return buyerEmail   * Email address of the buyer as entered during checkout. PayPal
     * uses this value to pre-fill the login portion of the PayPal login
     * page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limit: 127 single-byte alphanumeric characters
     */
    public java.lang.String getBuyerEmail() {
        return buyerEmail;
    }


    /**
     * Sets the buyerEmail value for this SetMobileCheckoutRequestDetailsType.
     * 
     * @param buyerEmail   * Email address of the buyer as entered during checkout. PayPal
     * uses this value to pre-fill the login portion of the PayPal login
     * page. 
     * 
     * 						
     * Optional
     * 
     * 						Character length and limit: 127 single-byte alphanumeric characters
     */
    public void setBuyerEmail(java.lang.String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMobileCheckoutRequestDetailsType)) return false;
        SetMobileCheckoutRequestDetailsType other = (SetMobileCheckoutRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buyerPhone==null && other.getBuyerPhone()==null) || 
             (this.buyerPhone!=null &&
              this.buyerPhone.equals(other.getBuyerPhone()))) &&
            ((this.itemAmount==null && other.getItemAmount()==null) || 
             (this.itemAmount!=null &&
              this.itemAmount.equals(other.getItemAmount()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.itemNumber==null && other.getItemNumber()==null) || 
             (this.itemNumber!=null &&
              this.itemNumber.equals(other.getItemNumber()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.invoiceID==null && other.getInvoiceID()==null) || 
             (this.invoiceID!=null &&
              this.invoiceID.equals(other.getInvoiceID()))) &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
            ((this.addressDisplayOptions==null && other.getAddressDisplayOptions()==null) || 
             (this.addressDisplayOptions!=null &&
              this.addressDisplayOptions.equals(other.getAddressDisplayOptions()))) &&
            ((this.sharePhone==null && other.getSharePhone()==null) || 
             (this.sharePhone!=null &&
              this.sharePhone.equals(other.getSharePhone()))) &&
            ((this.shipToAddress==null && other.getShipToAddress()==null) || 
             (this.shipToAddress!=null &&
              this.shipToAddress.equals(other.getShipToAddress()))) &&
            ((this.buyerEmail==null && other.getBuyerEmail()==null) || 
             (this.buyerEmail!=null &&
              this.buyerEmail.equals(other.getBuyerEmail())));
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
        if (getBuyerPhone() != null) {
            _hashCode += getBuyerPhone().hashCode();
        }
        if (getItemAmount() != null) {
            _hashCode += getItemAmount().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getItemNumber() != null) {
            _hashCode += getItemNumber().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getInvoiceID() != null) {
            _hashCode += getInvoiceID().hashCode();
        }
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
        }
        if (getAddressDisplayOptions() != null) {
            _hashCode += getAddressDisplayOptions().hashCode();
        }
        if (getSharePhone() != null) {
            _hashCode += getSharePhone().hashCode();
        }
        if (getShipToAddress() != null) {
            _hashCode += getShipToAddress().hashCode();
        }
        if (getBuyerEmail() != null) {
            _hashCode += getBuyerEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMobileCheckoutRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetMobileCheckoutRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhoneNumberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InvoiceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReturnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("addressDisplayOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressDisplayOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SharePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("buyerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerEmail"));
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
