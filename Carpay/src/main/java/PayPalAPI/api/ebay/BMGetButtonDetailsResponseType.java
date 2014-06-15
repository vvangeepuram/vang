/**
 * BMGetButtonDetailsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMGetButtonDetailsResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private java.lang.String website;

    private java.lang.String email;

    private java.lang.String mobile;

    private java.lang.String hostedButtonID;

    /* Type of button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of the following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN,
     * AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE */
    private eBLBaseComponents.apis.ebay.ButtonTypeType buttonType;

    /* Type of button code.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of the following: hosted, encrypted or cleartext */
    private eBLBaseComponents.apis.ebay.ButtonCodeType buttonCode;

    /* Button sub type.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Either PRODUCTS or SERVICES */
    private eBLBaseComponents.apis.ebay.ButtonSubTypeType buttonSubType;

    /* Button Variable information
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Character length and limitations: 63 single-byte alphanumeric characters */
    private java.lang.String[] buttonVar;

    private PayPalAPI.api.ebay.OptionDetailsType[] optionDetails;

    /* Text field */
    private java.lang.String[] textBox;

    /* Button image to use.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of: REG, SML, or CC */
    private eBLBaseComponents.apis.ebay.ButtonImageType buttonImage;

    /* Button URL for custom button image. */
    private java.lang.String buttonImageURL;

    /* Text to use on Buy Now Button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Either BUYNOW or PAYNOW */
    private eBLBaseComponents.apis.ebay.BuyNowTextType buyNowText;

    /* Text to use on Subscribe button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Must be either BUYNOW or SUBSCRIBE */
    private eBLBaseComponents.apis.ebay.SubscribeTextType subscribeText;

    /* Button Country.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Valid ISO country code or 'International' */
    private eBLBaseComponents.apis.ebay.CountryCodeType buttonCountry;

    /* Button language code.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Character length and limitations: 3 single-byte alphanumeric characters */
    private java.lang.String buttonLanguage;

    public BMGetButtonDetailsResponseType() {
    }

    public BMGetButtonDetailsResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String website,
           java.lang.String email,
           java.lang.String mobile,
           java.lang.String hostedButtonID,
           eBLBaseComponents.apis.ebay.ButtonTypeType buttonType,
           eBLBaseComponents.apis.ebay.ButtonCodeType buttonCode,
           eBLBaseComponents.apis.ebay.ButtonSubTypeType buttonSubType,
           java.lang.String[] buttonVar,
           PayPalAPI.api.ebay.OptionDetailsType[] optionDetails,
           java.lang.String[] textBox,
           eBLBaseComponents.apis.ebay.ButtonImageType buttonImage,
           java.lang.String buttonImageURL,
           eBLBaseComponents.apis.ebay.BuyNowTextType buyNowText,
           eBLBaseComponents.apis.ebay.SubscribeTextType subscribeText,
           eBLBaseComponents.apis.ebay.CountryCodeType buttonCountry,
           java.lang.String buttonLanguage) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.website = website;
        this.email = email;
        this.mobile = mobile;
        this.hostedButtonID = hostedButtonID;
        this.buttonType = buttonType;
        this.buttonCode = buttonCode;
        this.buttonSubType = buttonSubType;
        this.buttonVar = buttonVar;
        this.optionDetails = optionDetails;
        this.textBox = textBox;
        this.buttonImage = buttonImage;
        this.buttonImageURL = buttonImageURL;
        this.buyNowText = buyNowText;
        this.subscribeText = subscribeText;
        this.buttonCountry = buttonCountry;
        this.buttonLanguage = buttonLanguage;
    }


    /**
     * Gets the website value for this BMGetButtonDetailsResponseType.
     * 
     * @return website
     */
    public java.lang.String getWebsite() {
        return website;
    }


    /**
     * Sets the website value for this BMGetButtonDetailsResponseType.
     * 
     * @param website
     */
    public void setWebsite(java.lang.String website) {
        this.website = website;
    }


    /**
     * Gets the email value for this BMGetButtonDetailsResponseType.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this BMGetButtonDetailsResponseType.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the mobile value for this BMGetButtonDetailsResponseType.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this BMGetButtonDetailsResponseType.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the hostedButtonID value for this BMGetButtonDetailsResponseType.
     * 
     * @return hostedButtonID
     */
    public java.lang.String getHostedButtonID() {
        return hostedButtonID;
    }


    /**
     * Sets the hostedButtonID value for this BMGetButtonDetailsResponseType.
     * 
     * @param hostedButtonID
     */
    public void setHostedButtonID(java.lang.String hostedButtonID) {
        this.hostedButtonID = hostedButtonID;
    }


    /**
     * Gets the buttonType value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonType   * Type of button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of the following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN,
     * AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
     */
    public eBLBaseComponents.apis.ebay.ButtonTypeType getButtonType() {
        return buttonType;
    }


    /**
     * Sets the buttonType value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonType   * Type of button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of the following: BUYNOW, CART, GIFTCERTIFICATE. SUBSCRIBE, PAYMENTPLAN,
     * AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
     */
    public void setButtonType(eBLBaseComponents.apis.ebay.ButtonTypeType buttonType) {
        this.buttonType = buttonType;
    }


    /**
     * Gets the buttonCode value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonCode   * Type of button code.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of the following: hosted, encrypted or cleartext
     */
    public eBLBaseComponents.apis.ebay.ButtonCodeType getButtonCode() {
        return buttonCode;
    }


    /**
     * Sets the buttonCode value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonCode   * Type of button code.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of the following: hosted, encrypted or cleartext
     */
    public void setButtonCode(eBLBaseComponents.apis.ebay.ButtonCodeType buttonCode) {
        this.buttonCode = buttonCode;
    }


    /**
     * Gets the buttonSubType value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonSubType   * Button sub type.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Either PRODUCTS or SERVICES
     */
    public eBLBaseComponents.apis.ebay.ButtonSubTypeType getButtonSubType() {
        return buttonSubType;
    }


    /**
     * Sets the buttonSubType value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonSubType   * Button sub type.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Either PRODUCTS or SERVICES
     */
    public void setButtonSubType(eBLBaseComponents.apis.ebay.ButtonSubTypeType buttonSubType) {
        this.buttonSubType = buttonSubType;
    }


    /**
     * Gets the buttonVar value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonVar   * Button Variable information
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Character length and limitations: 63 single-byte alphanumeric characters
     */
    public java.lang.String[] getButtonVar() {
        return buttonVar;
    }


    /**
     * Sets the buttonVar value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonVar   * Button Variable information
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Character length and limitations: 63 single-byte alphanumeric characters
     */
    public void setButtonVar(java.lang.String[] buttonVar) {
        this.buttonVar = buttonVar;
    }

    public java.lang.String getButtonVar(int i) {
        return this.buttonVar[i];
    }

    public void setButtonVar(int i, java.lang.String _value) {
        this.buttonVar[i] = _value;
    }


    /**
     * Gets the optionDetails value for this BMGetButtonDetailsResponseType.
     * 
     * @return optionDetails
     */
    public PayPalAPI.api.ebay.OptionDetailsType[] getOptionDetails() {
        return optionDetails;
    }


    /**
     * Sets the optionDetails value for this BMGetButtonDetailsResponseType.
     * 
     * @param optionDetails
     */
    public void setOptionDetails(PayPalAPI.api.ebay.OptionDetailsType[] optionDetails) {
        this.optionDetails = optionDetails;
    }

    public PayPalAPI.api.ebay.OptionDetailsType getOptionDetails(int i) {
        return this.optionDetails[i];
    }

    public void setOptionDetails(int i, PayPalAPI.api.ebay.OptionDetailsType _value) {
        this.optionDetails[i] = _value;
    }


    /**
     * Gets the textBox value for this BMGetButtonDetailsResponseType.
     * 
     * @return textBox   * Text field
     */
    public java.lang.String[] getTextBox() {
        return textBox;
    }


    /**
     * Sets the textBox value for this BMGetButtonDetailsResponseType.
     * 
     * @param textBox   * Text field
     */
    public void setTextBox(java.lang.String[] textBox) {
        this.textBox = textBox;
    }

    public java.lang.String getTextBox(int i) {
        return this.textBox[i];
    }

    public void setTextBox(int i, java.lang.String _value) {
        this.textBox[i] = _value;
    }


    /**
     * Gets the buttonImage value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonImage   * Button image to use.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of: REG, SML, or CC
     */
    public eBLBaseComponents.apis.ebay.ButtonImageType getButtonImage() {
        return buttonImage;
    }


    /**
     * Sets the buttonImage value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonImage   * Button image to use.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * One of: REG, SML, or CC
     */
    public void setButtonImage(eBLBaseComponents.apis.ebay.ButtonImageType buttonImage) {
        this.buttonImage = buttonImage;
    }


    /**
     * Gets the buttonImageURL value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonImageURL   * Button URL for custom button image.
     */
    public java.lang.String getButtonImageURL() {
        return buttonImageURL;
    }


    /**
     * Sets the buttonImageURL value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonImageURL   * Button URL for custom button image.
     */
    public void setButtonImageURL(java.lang.String buttonImageURL) {
        this.buttonImageURL = buttonImageURL;
    }


    /**
     * Gets the buyNowText value for this BMGetButtonDetailsResponseType.
     * 
     * @return buyNowText   * Text to use on Buy Now Button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Either BUYNOW or PAYNOW
     */
    public eBLBaseComponents.apis.ebay.BuyNowTextType getBuyNowText() {
        return buyNowText;
    }


    /**
     * Sets the buyNowText value for this BMGetButtonDetailsResponseType.
     * 
     * @param buyNowText   * Text to use on Buy Now Button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Either BUYNOW or PAYNOW
     */
    public void setBuyNowText(eBLBaseComponents.apis.ebay.BuyNowTextType buyNowText) {
        this.buyNowText = buyNowText;
    }


    /**
     * Gets the subscribeText value for this BMGetButtonDetailsResponseType.
     * 
     * @return subscribeText   * Text to use on Subscribe button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Must be either BUYNOW or SUBSCRIBE
     */
    public eBLBaseComponents.apis.ebay.SubscribeTextType getSubscribeText() {
        return subscribeText;
    }


    /**
     * Sets the subscribeText value for this BMGetButtonDetailsResponseType.
     * 
     * @param subscribeText   * Text to use on Subscribe button.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Must be either BUYNOW or SUBSCRIBE
     */
    public void setSubscribeText(eBLBaseComponents.apis.ebay.SubscribeTextType subscribeText) {
        this.subscribeText = subscribeText;
    }


    /**
     * Gets the buttonCountry value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonCountry   * Button Country.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Valid ISO country code or 'International'
     */
    public eBLBaseComponents.apis.ebay.CountryCodeType getButtonCountry() {
        return buttonCountry;
    }


    /**
     * Sets the buttonCountry value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonCountry   * Button Country.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Valid ISO country code or 'International'
     */
    public void setButtonCountry(eBLBaseComponents.apis.ebay.CountryCodeType buttonCountry) {
        this.buttonCountry = buttonCountry;
    }


    /**
     * Gets the buttonLanguage value for this BMGetButtonDetailsResponseType.
     * 
     * @return buttonLanguage   * Button language code.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Character length and limitations: 3 single-byte alphanumeric characters
     */
    public java.lang.String getButtonLanguage() {
        return buttonLanguage;
    }


    /**
     * Sets the buttonLanguage value for this BMGetButtonDetailsResponseType.
     * 
     * @param buttonLanguage   * Button language code.
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * Character length and limitations: 3 single-byte alphanumeric characters
     */
    public void setButtonLanguage(java.lang.String buttonLanguage) {
        this.buttonLanguage = buttonLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMGetButtonDetailsResponseType)) return false;
        BMGetButtonDetailsResponseType other = (BMGetButtonDetailsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.website==null && other.getWebsite()==null) || 
             (this.website!=null &&
              this.website.equals(other.getWebsite()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.hostedButtonID==null && other.getHostedButtonID()==null) || 
             (this.hostedButtonID!=null &&
              this.hostedButtonID.equals(other.getHostedButtonID()))) &&
            ((this.buttonType==null && other.getButtonType()==null) || 
             (this.buttonType!=null &&
              this.buttonType.equals(other.getButtonType()))) &&
            ((this.buttonCode==null && other.getButtonCode()==null) || 
             (this.buttonCode!=null &&
              this.buttonCode.equals(other.getButtonCode()))) &&
            ((this.buttonSubType==null && other.getButtonSubType()==null) || 
             (this.buttonSubType!=null &&
              this.buttonSubType.equals(other.getButtonSubType()))) &&
            ((this.buttonVar==null && other.getButtonVar()==null) || 
             (this.buttonVar!=null &&
              java.util.Arrays.equals(this.buttonVar, other.getButtonVar()))) &&
            ((this.optionDetails==null && other.getOptionDetails()==null) || 
             (this.optionDetails!=null &&
              java.util.Arrays.equals(this.optionDetails, other.getOptionDetails()))) &&
            ((this.textBox==null && other.getTextBox()==null) || 
             (this.textBox!=null &&
              java.util.Arrays.equals(this.textBox, other.getTextBox()))) &&
            ((this.buttonImage==null && other.getButtonImage()==null) || 
             (this.buttonImage!=null &&
              this.buttonImage.equals(other.getButtonImage()))) &&
            ((this.buttonImageURL==null && other.getButtonImageURL()==null) || 
             (this.buttonImageURL!=null &&
              this.buttonImageURL.equals(other.getButtonImageURL()))) &&
            ((this.buyNowText==null && other.getBuyNowText()==null) || 
             (this.buyNowText!=null &&
              this.buyNowText.equals(other.getBuyNowText()))) &&
            ((this.subscribeText==null && other.getSubscribeText()==null) || 
             (this.subscribeText!=null &&
              this.subscribeText.equals(other.getSubscribeText()))) &&
            ((this.buttonCountry==null && other.getButtonCountry()==null) || 
             (this.buttonCountry!=null &&
              this.buttonCountry.equals(other.getButtonCountry()))) &&
            ((this.buttonLanguage==null && other.getButtonLanguage()==null) || 
             (this.buttonLanguage!=null &&
              this.buttonLanguage.equals(other.getButtonLanguage())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getWebsite() != null) {
            _hashCode += getWebsite().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getHostedButtonID() != null) {
            _hashCode += getHostedButtonID().hashCode();
        }
        if (getButtonType() != null) {
            _hashCode += getButtonType().hashCode();
        }
        if (getButtonCode() != null) {
            _hashCode += getButtonCode().hashCode();
        }
        if (getButtonSubType() != null) {
            _hashCode += getButtonSubType().hashCode();
        }
        if (getButtonVar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getButtonVar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getButtonVar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptionDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTextBox() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTextBox());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTextBox(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getButtonImage() != null) {
            _hashCode += getButtonImage().hashCode();
        }
        if (getButtonImageURL() != null) {
            _hashCode += getButtonImageURL().hashCode();
        }
        if (getBuyNowText() != null) {
            _hashCode += getBuyNowText().hashCode();
        }
        if (getSubscribeText() != null) {
            _hashCode += getSubscribeText().hashCode();
        }
        if (getButtonCountry() != null) {
            _hashCode += getButtonCountry().hashCode();
        }
        if (getButtonLanguage() != null) {
            _hashCode += getButtonLanguage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMGetButtonDetailsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedButtonID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "HostedButtonID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSubTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonVar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonVar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "OptionDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textBox");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "TextBox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonImageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonImageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonImageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyNowText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BuyNowText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyNowTextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribeText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SubscribeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubscribeTextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CountryCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ButtonLanguage"));
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
