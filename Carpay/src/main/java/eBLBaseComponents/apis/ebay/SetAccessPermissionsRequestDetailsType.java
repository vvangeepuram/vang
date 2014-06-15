/**
 * SetAccessPermissionsRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetAccessPermissionsRequestDetailsType  implements java.io.Serializable {
    /* URL to which the customer's browser is returned after choosing
     * to login with PayPal.
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit. */
    private java.lang.String returnURL;

    /* URL to which the customer is returned if he does not approve
     * the use of PayPal login. 
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit */
    private java.lang.String cancelURL;

    /* URL to which the customer's browser is returned after user
     * logs out from PayPal. 
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit. */
    private java.lang.String logoutURL;

    /* The type of the flow.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String initFlowType;

    /* The used to decide SkipLogin allowed or not.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String skipLoginPage;

    /* contains information about API Services */
    private java.lang.String[] requiredAccessPermissions;

    /* contains information about API Services */
    private java.lang.String[] optionalAccessPermissions;

    /* Locale of pages displayed by PayPal during Authentication Login.
     * 				
     * 				
     * 				Optional
     * 				
     * 				
     * 					Character length and limitations: Five single-byte alphabetic
     * characters, upper- or lowercase. 
     * 					
     * 					
     * Allowable values: 
     * 
     * AU or en_AU
     * 
     * DE or de_DE
     * 
     * FR or fr_FR
     * 
     * GB or en_GB
     * 
     * IT or it_IT
     * 
     * JP or ja_JP
     * 
     * US or en_US */
    private java.lang.String localeCode;

    /* Sets the Custom Payment Page Style for flow pages associated
     * with this button/link. PageStyle corresponds to the HTML variable
     * page_style for customizing flow pages. The value is the same as the
     * Page Style Name you chose when adding or editing the page style from
     * the Profile subtab of the My Account tab of your PayPal account. 
     * 					
     * 					
     * 				Optional
     * 				
     * 				Character length and limitations: 30 single-byte alphabetic characters. */
    private java.lang.String pageStyle;

    /* A URL for the image you want to appear at the top left of the
     * flow page. The image has a maximum size of 750 pixels wide by 90 pixels
     * high. PayPal recommends that you provide an image that is stored on
     * a secure (https) server. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				
     * 				Character length and limitations: 127 */
    private java.lang.String cppHeaderImage;

    /* Sets the border color around the header of the flow page. The
     * border is a 2-pixel perimeter around the header space, which is 750
     * pixels wide by 90 pixels high. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitations: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String cppHeaderBorderColor;

    /* Sets the background color for the header of the flow page.
     * 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String cppHeaderBackColor;

    /* Sets the background color for the payment page. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String cppPayflowColor;

    /* First Name of the user, this information is used if user chooses
     * to signup with PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String firstName;

    /* Last Name of the user, this information is used if user chooses
     * to signup with PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII */
    private java.lang.String lastName;

    /* User address, this information is used when user chooses to
     * signup for PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					
     * 					If you include a shipping address and set the AddressOverride
     * element on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse. */
    private eBLBaseComponents.apis.ebay.AddressType address;

    public SetAccessPermissionsRequestDetailsType() {
    }

    public SetAccessPermissionsRequestDetailsType(
           java.lang.String returnURL,
           java.lang.String cancelURL,
           java.lang.String logoutURL,
           java.lang.String initFlowType,
           java.lang.String skipLoginPage,
           java.lang.String[] requiredAccessPermissions,
           java.lang.String[] optionalAccessPermissions,
           java.lang.String localeCode,
           java.lang.String pageStyle,
           java.lang.String cppHeaderImage,
           java.lang.String cppHeaderBorderColor,
           java.lang.String cppHeaderBackColor,
           java.lang.String cppPayflowColor,
           java.lang.String firstName,
           java.lang.String lastName,
           eBLBaseComponents.apis.ebay.AddressType address) {
           this.returnURL = returnURL;
           this.cancelURL = cancelURL;
           this.logoutURL = logoutURL;
           this.initFlowType = initFlowType;
           this.skipLoginPage = skipLoginPage;
           this.requiredAccessPermissions = requiredAccessPermissions;
           this.optionalAccessPermissions = optionalAccessPermissions;
           this.localeCode = localeCode;
           this.pageStyle = pageStyle;
           this.cppHeaderImage = cppHeaderImage;
           this.cppHeaderBorderColor = cppHeaderBorderColor;
           this.cppHeaderBackColor = cppHeaderBackColor;
           this.cppPayflowColor = cppPayflowColor;
           this.firstName = firstName;
           this.lastName = lastName;
           this.address = address;
    }


    /**
     * Gets the returnURL value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return returnURL   * URL to which the customer's browser is returned after choosing
     * to login with PayPal.
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit.
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param returnURL   * URL to which the customer's browser is returned after choosing
     * to login with PayPal.
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit.
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the cancelURL value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return cancelURL   * URL to which the customer is returned if he does not approve
     * the use of PayPal login. 
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param cancelURL   * URL to which the customer is returned if he does not approve
     * the use of PayPal login. 
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the logoutURL value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return logoutURL   * URL to which the customer's browser is returned after user
     * logs out from PayPal. 
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit.
     */
    public java.lang.String getLogoutURL() {
        return logoutURL;
    }


    /**
     * Sets the logoutURL value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param logoutURL   * URL to which the customer's browser is returned after user
     * logs out from PayPal. 
     * 					
     * 					
     * 					
     * 					
     * 					
     * 					Character length and limitations: no limit.
     */
    public void setLogoutURL(java.lang.String logoutURL) {
        this.logoutURL = logoutURL;
    }


    /**
     * Gets the initFlowType value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return initFlowType   * The type of the flow.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getInitFlowType() {
        return initFlowType;
    }


    /**
     * Sets the initFlowType value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param initFlowType   * The type of the flow.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setInitFlowType(java.lang.String initFlowType) {
        this.initFlowType = initFlowType;
    }


    /**
     * Gets the skipLoginPage value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return skipLoginPage   * The used to decide SkipLogin allowed or not.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getSkipLoginPage() {
        return skipLoginPage;
    }


    /**
     * Sets the skipLoginPage value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param skipLoginPage   * The used to decide SkipLogin allowed or not.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setSkipLoginPage(java.lang.String skipLoginPage) {
        this.skipLoginPage = skipLoginPage;
    }


    /**
     * Gets the requiredAccessPermissions value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return requiredAccessPermissions   * contains information about API Services
     */
    public java.lang.String[] getRequiredAccessPermissions() {
        return requiredAccessPermissions;
    }


    /**
     * Sets the requiredAccessPermissions value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param requiredAccessPermissions   * contains information about API Services
     */
    public void setRequiredAccessPermissions(java.lang.String[] requiredAccessPermissions) {
        this.requiredAccessPermissions = requiredAccessPermissions;
    }

    public java.lang.String getRequiredAccessPermissions(int i) {
        return this.requiredAccessPermissions[i];
    }

    public void setRequiredAccessPermissions(int i, java.lang.String _value) {
        this.requiredAccessPermissions[i] = _value;
    }


    /**
     * Gets the optionalAccessPermissions value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return optionalAccessPermissions   * contains information about API Services
     */
    public java.lang.String[] getOptionalAccessPermissions() {
        return optionalAccessPermissions;
    }


    /**
     * Sets the optionalAccessPermissions value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param optionalAccessPermissions   * contains information about API Services
     */
    public void setOptionalAccessPermissions(java.lang.String[] optionalAccessPermissions) {
        this.optionalAccessPermissions = optionalAccessPermissions;
    }

    public java.lang.String getOptionalAccessPermissions(int i) {
        return this.optionalAccessPermissions[i];
    }

    public void setOptionalAccessPermissions(int i, java.lang.String _value) {
        this.optionalAccessPermissions[i] = _value;
    }


    /**
     * Gets the localeCode value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return localeCode   * Locale of pages displayed by PayPal during Authentication Login.
     * 				
     * 				
     * 				Optional
     * 				
     * 				
     * 					Character length and limitations: Five single-byte alphabetic
     * characters, upper- or lowercase. 
     * 					
     * 					
     * Allowable values: 
     * 
     * AU or en_AU
     * 
     * DE or de_DE
     * 
     * FR or fr_FR
     * 
     * GB or en_GB
     * 
     * IT or it_IT
     * 
     * JP or ja_JP
     * 
     * US or en_US
     */
    public java.lang.String getLocaleCode() {
        return localeCode;
    }


    /**
     * Sets the localeCode value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param localeCode   * Locale of pages displayed by PayPal during Authentication Login.
     * 				
     * 				
     * 				Optional
     * 				
     * 				
     * 					Character length and limitations: Five single-byte alphabetic
     * characters, upper- or lowercase. 
     * 					
     * 					
     * Allowable values: 
     * 
     * AU or en_AU
     * 
     * DE or de_DE
     * 
     * FR or fr_FR
     * 
     * GB or en_GB
     * 
     * IT or it_IT
     * 
     * JP or ja_JP
     * 
     * US or en_US
     */
    public void setLocaleCode(java.lang.String localeCode) {
        this.localeCode = localeCode;
    }


    /**
     * Gets the pageStyle value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return pageStyle   * Sets the Custom Payment Page Style for flow pages associated
     * with this button/link. PageStyle corresponds to the HTML variable
     * page_style for customizing flow pages. The value is the same as the
     * Page Style Name you chose when adding or editing the page style from
     * the Profile subtab of the My Account tab of your PayPal account. 
     * 					
     * 					
     * 				Optional
     * 				
     * 				Character length and limitations: 30 single-byte alphabetic characters.
     */
    public java.lang.String getPageStyle() {
        return pageStyle;
    }


    /**
     * Sets the pageStyle value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param pageStyle   * Sets the Custom Payment Page Style for flow pages associated
     * with this button/link. PageStyle corresponds to the HTML variable
     * page_style for customizing flow pages. The value is the same as the
     * Page Style Name you chose when adding or editing the page style from
     * the Profile subtab of the My Account tab of your PayPal account. 
     * 					
     * 					
     * 				Optional
     * 				
     * 				Character length and limitations: 30 single-byte alphabetic characters.
     */
    public void setPageStyle(java.lang.String pageStyle) {
        this.pageStyle = pageStyle;
    }


    /**
     * Gets the cppHeaderImage value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return cppHeaderImage   * A URL for the image you want to appear at the top left of the
     * flow page. The image has a maximum size of 750 pixels wide by 90 pixels
     * high. PayPal recommends that you provide an image that is stored on
     * a secure (https) server. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				
     * 				Character length and limitations: 127
     */
    public java.lang.String getCppHeaderImage() {
        return cppHeaderImage;
    }


    /**
     * Sets the cppHeaderImage value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param cppHeaderImage   * A URL for the image you want to appear at the top left of the
     * flow page. The image has a maximum size of 750 pixels wide by 90 pixels
     * high. PayPal recommends that you provide an image that is stored on
     * a secure (https) server. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				
     * 				Character length and limitations: 127
     */
    public void setCppHeaderImage(java.lang.String cppHeaderImage) {
        this.cppHeaderImage = cppHeaderImage;
    }


    /**
     * Gets the cppHeaderBorderColor value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return cppHeaderBorderColor   * Sets the border color around the header of the flow page. The
     * border is a 2-pixel perimeter around the header space, which is 750
     * pixels wide by 90 pixels high. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitations: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getCppHeaderBorderColor() {
        return cppHeaderBorderColor;
    }


    /**
     * Sets the cppHeaderBorderColor value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param cppHeaderBorderColor   * Sets the border color around the header of the flow page. The
     * border is a 2-pixel perimeter around the header space, which is 750
     * pixels wide by 90 pixels high. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitations: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setCppHeaderBorderColor(java.lang.String cppHeaderBorderColor) {
        this.cppHeaderBorderColor = cppHeaderBorderColor;
    }


    /**
     * Gets the cppHeaderBackColor value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return cppHeaderBackColor   * Sets the background color for the header of the flow page.
     * 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getCppHeaderBackColor() {
        return cppHeaderBackColor;
    }


    /**
     * Sets the cppHeaderBackColor value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param cppHeaderBackColor   * Sets the background color for the header of the flow page.
     * 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setCppHeaderBackColor(java.lang.String cppHeaderBackColor) {
        this.cppHeaderBackColor = cppHeaderBackColor;
    }


    /**
     * Gets the cppPayflowColor value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return cppPayflowColor   * Sets the background color for the payment page. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getCppPayflowColor() {
        return cppPayflowColor;
    }


    /**
     * Sets the cppPayflowColor value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param cppPayflowColor   * Sets the background color for the payment page. 
     * 				
     * 				
     * 				Optional
     * 				
     * 				Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setCppPayflowColor(java.lang.String cppPayflowColor) {
        this.cppPayflowColor = cppPayflowColor;
    }


    /**
     * Gets the firstName value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return firstName   * First Name of the user, this information is used if user chooses
     * to signup with PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param firstName   * First Name of the user, this information is used if user chooses
     * to signup with PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return lastName   * Last Name of the user, this information is used if user chooses
     * to signup with PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param lastName   * Last Name of the user, this information is used if user chooses
     * to signup with PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					Character length and limitation: Six character HTML hexadecimal
     * color code in ASCII
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the address value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @return address   * User address, this information is used when user chooses to
     * signup for PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					
     * 					If you include a shipping address and set the AddressOverride
     * element on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse.
     */
    public eBLBaseComponents.apis.ebay.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this SetAccessPermissionsRequestDetailsType.
     * 
     * @param address   * User address, this information is used when user chooses to
     * signup for PayPal.
     * 					
     * 					
     * 					Optional
     * 					
     * 					
     * 					If you include a shipping address and set the AddressOverride
     * element on the request, PayPal returns this same address in GetExpressCheckoutDetailsResponse.
     */
    public void setAddress(eBLBaseComponents.apis.ebay.AddressType address) {
        this.address = address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetAccessPermissionsRequestDetailsType)) return false;
        SetAccessPermissionsRequestDetailsType other = (SetAccessPermissionsRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
            ((this.logoutURL==null && other.getLogoutURL()==null) || 
             (this.logoutURL!=null &&
              this.logoutURL.equals(other.getLogoutURL()))) &&
            ((this.initFlowType==null && other.getInitFlowType()==null) || 
             (this.initFlowType!=null &&
              this.initFlowType.equals(other.getInitFlowType()))) &&
            ((this.skipLoginPage==null && other.getSkipLoginPage()==null) || 
             (this.skipLoginPage!=null &&
              this.skipLoginPage.equals(other.getSkipLoginPage()))) &&
            ((this.requiredAccessPermissions==null && other.getRequiredAccessPermissions()==null) || 
             (this.requiredAccessPermissions!=null &&
              java.util.Arrays.equals(this.requiredAccessPermissions, other.getRequiredAccessPermissions()))) &&
            ((this.optionalAccessPermissions==null && other.getOptionalAccessPermissions()==null) || 
             (this.optionalAccessPermissions!=null &&
              java.util.Arrays.equals(this.optionalAccessPermissions, other.getOptionalAccessPermissions()))) &&
            ((this.localeCode==null && other.getLocaleCode()==null) || 
             (this.localeCode!=null &&
              this.localeCode.equals(other.getLocaleCode()))) &&
            ((this.pageStyle==null && other.getPageStyle()==null) || 
             (this.pageStyle!=null &&
              this.pageStyle.equals(other.getPageStyle()))) &&
            ((this.cppHeaderImage==null && other.getCppHeaderImage()==null) || 
             (this.cppHeaderImage!=null &&
              this.cppHeaderImage.equals(other.getCppHeaderImage()))) &&
            ((this.cppHeaderBorderColor==null && other.getCppHeaderBorderColor()==null) || 
             (this.cppHeaderBorderColor!=null &&
              this.cppHeaderBorderColor.equals(other.getCppHeaderBorderColor()))) &&
            ((this.cppHeaderBackColor==null && other.getCppHeaderBackColor()==null) || 
             (this.cppHeaderBackColor!=null &&
              this.cppHeaderBackColor.equals(other.getCppHeaderBackColor()))) &&
            ((this.cppPayflowColor==null && other.getCppPayflowColor()==null) || 
             (this.cppPayflowColor!=null &&
              this.cppPayflowColor.equals(other.getCppPayflowColor()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress())));
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
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
        }
        if (getLogoutURL() != null) {
            _hashCode += getLogoutURL().hashCode();
        }
        if (getInitFlowType() != null) {
            _hashCode += getInitFlowType().hashCode();
        }
        if (getSkipLoginPage() != null) {
            _hashCode += getSkipLoginPage().hashCode();
        }
        if (getRequiredAccessPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequiredAccessPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequiredAccessPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptionalAccessPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptionalAccessPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptionalAccessPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocaleCode() != null) {
            _hashCode += getLocaleCode().hashCode();
        }
        if (getPageStyle() != null) {
            _hashCode += getPageStyle().hashCode();
        }
        if (getCppHeaderImage() != null) {
            _hashCode += getCppHeaderImage().hashCode();
        }
        if (getCppHeaderBorderColor() != null) {
            _hashCode += getCppHeaderBorderColor().hashCode();
        }
        if (getCppHeaderBackColor() != null) {
            _hashCode += getCppHeaderBackColor().hashCode();
        }
        if (getCppPayflowColor() != null) {
            _hashCode += getCppPayflowColor().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAccessPermissionsRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetAccessPermissionsRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReturnURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CancelURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LogoutURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initFlowType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InitFlowType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipLoginPage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SkipLoginPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requiredAccessPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RequiredAccessPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionalAccessPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OptionalAccessPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LocaleCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStyle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PageStyle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppHeaderImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-header-image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppHeaderBorderColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-header-border-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppHeaderBackColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-header-back-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cppPayflowColor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "cpp-payflow-color"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
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
