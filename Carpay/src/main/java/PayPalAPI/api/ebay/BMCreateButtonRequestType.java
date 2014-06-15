/**
 * BMCreateButtonRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMCreateButtonRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Type of Button to create.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of the following: BUYNOW, CART, GIFTCERTIFICATE.
     * SUBSCRIBE, PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE */
    private eBLBaseComponents.apis.ebay.ButtonTypeType buttonType;

    /* button code.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of the following: hosted, encrypted or cleartext */
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
     * 						Must Be either PRODUCTS or SERVICES */
    private eBLBaseComponents.apis.ebay.ButtonSubTypeType buttonSubType;

    /* Button Variable information
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 63 single-byte alphanumeric
     * characters */
    private java.lang.String[] buttonVar;

    private PayPalAPI.api.ebay.OptionDetailsType[] optionDetails;

    /* Details of each option for the button. */
    private java.lang.String[] textBox;

    /* Button image to use.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of: REG, SML, or CC */
    private eBLBaseComponents.apis.ebay.ButtonImageType buttonImage;

    /* Button URL for custom button image.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String buttonImageURL;

    /* Text to use on Buy Now Button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be either BUYNOW or PAYNOW */
    private eBLBaseComponents.apis.ebay.BuyNowTextType buyNowText;

    /* Text to use on Subscribe button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be either BUYNOW or SUBSCRIBE */
    private eBLBaseComponents.apis.ebay.SubscribeTextType subscribeText;

    /* Button Country.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be valid ISO country code */
    private eBLBaseComponents.apis.ebay.CountryCodeType buttonCountry;

    /* Button language code.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 3 single-byte alphanumeric
     * characters */
    private java.lang.String buttonLanguage;

    public BMCreateButtonRequestType() {
    }

    public BMCreateButtonRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
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
            detailLevel,
            errorLanguage,
            version,
            _any);
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
     * Gets the buttonType value for this BMCreateButtonRequestType.
     * 
     * @return buttonType   * Type of Button to create.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of the following: BUYNOW, CART, GIFTCERTIFICATE.
     * SUBSCRIBE, PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
     */
    public eBLBaseComponents.apis.ebay.ButtonTypeType getButtonType() {
        return buttonType;
    }


    /**
     * Sets the buttonType value for this BMCreateButtonRequestType.
     * 
     * @param buttonType   * Type of Button to create.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of the following: BUYNOW, CART, GIFTCERTIFICATE.
     * SUBSCRIBE, PAYMENTPLAN, AUTOBILLING, DONATE, VIEWCART or UNSUBSCRIBE
     */
    public void setButtonType(eBLBaseComponents.apis.ebay.ButtonTypeType buttonType) {
        this.buttonType = buttonType;
    }


    /**
     * Gets the buttonCode value for this BMCreateButtonRequestType.
     * 
     * @return buttonCode   * button code.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of the following: hosted, encrypted or cleartext
     */
    public eBLBaseComponents.apis.ebay.ButtonCodeType getButtonCode() {
        return buttonCode;
    }


    /**
     * Sets the buttonCode value for this BMCreateButtonRequestType.
     * 
     * @param buttonCode   * button code.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of the following: hosted, encrypted or cleartext
     */
    public void setButtonCode(eBLBaseComponents.apis.ebay.ButtonCodeType buttonCode) {
        this.buttonCode = buttonCode;
    }


    /**
     * Gets the buttonSubType value for this BMCreateButtonRequestType.
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
     * 						Must Be either PRODUCTS or SERVICES
     */
    public eBLBaseComponents.apis.ebay.ButtonSubTypeType getButtonSubType() {
        return buttonSubType;
    }


    /**
     * Sets the buttonSubType value for this BMCreateButtonRequestType.
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
     * 						Must Be either PRODUCTS or SERVICES
     */
    public void setButtonSubType(eBLBaseComponents.apis.ebay.ButtonSubTypeType buttonSubType) {
        this.buttonSubType = buttonSubType;
    }


    /**
     * Gets the buttonVar value for this BMCreateButtonRequestType.
     * 
     * @return buttonVar   * Button Variable information
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 63 single-byte alphanumeric
     * characters
     */
    public java.lang.String[] getButtonVar() {
        return buttonVar;
    }


    /**
     * Sets the buttonVar value for this BMCreateButtonRequestType.
     * 
     * @param buttonVar   * Button Variable information
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 63 single-byte alphanumeric
     * characters
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
     * Gets the optionDetails value for this BMCreateButtonRequestType.
     * 
     * @return optionDetails
     */
    public PayPalAPI.api.ebay.OptionDetailsType[] getOptionDetails() {
        return optionDetails;
    }


    /**
     * Sets the optionDetails value for this BMCreateButtonRequestType.
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
     * Gets the textBox value for this BMCreateButtonRequestType.
     * 
     * @return textBox   * Details of each option for the button.
     */
    public java.lang.String[] getTextBox() {
        return textBox;
    }


    /**
     * Sets the textBox value for this BMCreateButtonRequestType.
     * 
     * @param textBox   * Details of each option for the button.
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
     * Gets the buttonImage value for this BMCreateButtonRequestType.
     * 
     * @return buttonImage   * Button image to use.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of: REG, SML, or CC
     */
    public eBLBaseComponents.apis.ebay.ButtonImageType getButtonImage() {
        return buttonImage;
    }


    /**
     * Sets the buttonImage value for this BMCreateButtonRequestType.
     * 
     * @param buttonImage   * Button image to use.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be one of: REG, SML, or CC
     */
    public void setButtonImage(eBLBaseComponents.apis.ebay.ButtonImageType buttonImage) {
        this.buttonImage = buttonImage;
    }


    /**
     * Gets the buttonImageURL value for this BMCreateButtonRequestType.
     * 
     * @return buttonImageURL   * Button URL for custom button image.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getButtonImageURL() {
        return buttonImageURL;
    }


    /**
     * Sets the buttonImageURL value for this BMCreateButtonRequestType.
     * 
     * @param buttonImageURL   * Button URL for custom button image.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setButtonImageURL(java.lang.String buttonImageURL) {
        this.buttonImageURL = buttonImageURL;
    }


    /**
     * Gets the buyNowText value for this BMCreateButtonRequestType.
     * 
     * @return buyNowText   * Text to use on Buy Now Button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be either BUYNOW or PAYNOW
     */
    public eBLBaseComponents.apis.ebay.BuyNowTextType getBuyNowText() {
        return buyNowText;
    }


    /**
     * Sets the buyNowText value for this BMCreateButtonRequestType.
     * 
     * @param buyNowText   * Text to use on Buy Now Button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be either BUYNOW or PAYNOW
     */
    public void setBuyNowText(eBLBaseComponents.apis.ebay.BuyNowTextType buyNowText) {
        this.buyNowText = buyNowText;
    }


    /**
     * Gets the subscribeText value for this BMCreateButtonRequestType.
     * 
     * @return subscribeText   * Text to use on Subscribe button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be either BUYNOW or SUBSCRIBE
     */
    public eBLBaseComponents.apis.ebay.SubscribeTextType getSubscribeText() {
        return subscribeText;
    }


    /**
     * Sets the subscribeText value for this BMCreateButtonRequestType.
     * 
     * @param subscribeText   * Text to use on Subscribe button.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be either BUYNOW or SUBSCRIBE
     */
    public void setSubscribeText(eBLBaseComponents.apis.ebay.SubscribeTextType subscribeText) {
        this.subscribeText = subscribeText;
    }


    /**
     * Gets the buttonCountry value for this BMCreateButtonRequestType.
     * 
     * @return buttonCountry   * Button Country.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be valid ISO country code
     */
    public eBLBaseComponents.apis.ebay.CountryCodeType getButtonCountry() {
        return buttonCountry;
    }


    /**
     * Sets the buttonCountry value for this BMCreateButtonRequestType.
     * 
     * @param buttonCountry   * Button Country.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Must be valid ISO country code
     */
    public void setButtonCountry(eBLBaseComponents.apis.ebay.CountryCodeType buttonCountry) {
        this.buttonCountry = buttonCountry;
    }


    /**
     * Gets the buttonLanguage value for this BMCreateButtonRequestType.
     * 
     * @return buttonLanguage   * Button language code.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 3 single-byte alphanumeric
     * characters
     */
    public java.lang.String getButtonLanguage() {
        return buttonLanguage;
    }


    /**
     * Sets the buttonLanguage value for this BMCreateButtonRequestType.
     * 
     * @param buttonLanguage   * Button language code.
     * 										
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     *                                                                  
     * 
     * 						Character length and limitations: 3 single-byte alphanumeric
     * characters
     */
    public void setButtonLanguage(java.lang.String buttonLanguage) {
        this.buttonLanguage = buttonLanguage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMCreateButtonRequestType)) return false;
        BMCreateButtonRequestType other = (BMCreateButtonRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
        new org.apache.axis.description.TypeDesc(BMCreateButtonRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMCreateButtonRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
