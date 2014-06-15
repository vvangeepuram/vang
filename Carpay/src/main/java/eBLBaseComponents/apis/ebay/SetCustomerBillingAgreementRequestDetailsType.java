/**
 * SetCustomerBillingAgreementRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class SetCustomerBillingAgreementRequestDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.BillingAgreementDetailsType billingAgreementDetails;

    private java.lang.String returnURL;

    private java.lang.String cancelURL;

    private java.lang.String localeCode;

    private java.lang.String pageStyle;

    private java.lang.String cppHeaderImage;

    private java.lang.String cppHeaderBorderColor;

    private java.lang.String cppHeaderBackColor;

    private java.lang.String cppPayflowColor;

    private java.lang.String buyerEmail;

    /* The value 1 indicates that you require that the customer's
     * billing address on file. Setting this element overrides the setting
     * you have specified in Admin.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character. */
    private java.lang.String reqBillingAddress;

    public SetCustomerBillingAgreementRequestDetailsType() {
    }

    public SetCustomerBillingAgreementRequestDetailsType(
           eBLBaseComponents.apis.ebay.BillingAgreementDetailsType billingAgreementDetails,
           java.lang.String returnURL,
           java.lang.String cancelURL,
           java.lang.String localeCode,
           java.lang.String pageStyle,
           java.lang.String cppHeaderImage,
           java.lang.String cppHeaderBorderColor,
           java.lang.String cppHeaderBackColor,
           java.lang.String cppPayflowColor,
           java.lang.String buyerEmail,
           java.lang.String reqBillingAddress) {
           this.billingAgreementDetails = billingAgreementDetails;
           this.returnURL = returnURL;
           this.cancelURL = cancelURL;
           this.localeCode = localeCode;
           this.pageStyle = pageStyle;
           this.cppHeaderImage = cppHeaderImage;
           this.cppHeaderBorderColor = cppHeaderBorderColor;
           this.cppHeaderBackColor = cppHeaderBackColor;
           this.cppPayflowColor = cppPayflowColor;
           this.buyerEmail = buyerEmail;
           this.reqBillingAddress = reqBillingAddress;
    }


    /**
     * Gets the billingAgreementDetails value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return billingAgreementDetails
     */
    public eBLBaseComponents.apis.ebay.BillingAgreementDetailsType getBillingAgreementDetails() {
        return billingAgreementDetails;
    }


    /**
     * Sets the billingAgreementDetails value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param billingAgreementDetails
     */
    public void setBillingAgreementDetails(eBLBaseComponents.apis.ebay.BillingAgreementDetailsType billingAgreementDetails) {
        this.billingAgreementDetails = billingAgreementDetails;
    }


    /**
     * Gets the returnURL value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return returnURL
     */
    public java.lang.String getReturnURL() {
        return returnURL;
    }


    /**
     * Sets the returnURL value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param returnURL
     */
    public void setReturnURL(java.lang.String returnURL) {
        this.returnURL = returnURL;
    }


    /**
     * Gets the cancelURL value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return cancelURL
     */
    public java.lang.String getCancelURL() {
        return cancelURL;
    }


    /**
     * Sets the cancelURL value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param cancelURL
     */
    public void setCancelURL(java.lang.String cancelURL) {
        this.cancelURL = cancelURL;
    }


    /**
     * Gets the localeCode value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return localeCode
     */
    public java.lang.String getLocaleCode() {
        return localeCode;
    }


    /**
     * Sets the localeCode value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param localeCode
     */
    public void setLocaleCode(java.lang.String localeCode) {
        this.localeCode = localeCode;
    }


    /**
     * Gets the pageStyle value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return pageStyle
     */
    public java.lang.String getPageStyle() {
        return pageStyle;
    }


    /**
     * Sets the pageStyle value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param pageStyle
     */
    public void setPageStyle(java.lang.String pageStyle) {
        this.pageStyle = pageStyle;
    }


    /**
     * Gets the cppHeaderImage value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return cppHeaderImage
     */
    public java.lang.String getCppHeaderImage() {
        return cppHeaderImage;
    }


    /**
     * Sets the cppHeaderImage value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param cppHeaderImage
     */
    public void setCppHeaderImage(java.lang.String cppHeaderImage) {
        this.cppHeaderImage = cppHeaderImage;
    }


    /**
     * Gets the cppHeaderBorderColor value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return cppHeaderBorderColor
     */
    public java.lang.String getCppHeaderBorderColor() {
        return cppHeaderBorderColor;
    }


    /**
     * Sets the cppHeaderBorderColor value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param cppHeaderBorderColor
     */
    public void setCppHeaderBorderColor(java.lang.String cppHeaderBorderColor) {
        this.cppHeaderBorderColor = cppHeaderBorderColor;
    }


    /**
     * Gets the cppHeaderBackColor value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return cppHeaderBackColor
     */
    public java.lang.String getCppHeaderBackColor() {
        return cppHeaderBackColor;
    }


    /**
     * Sets the cppHeaderBackColor value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param cppHeaderBackColor
     */
    public void setCppHeaderBackColor(java.lang.String cppHeaderBackColor) {
        this.cppHeaderBackColor = cppHeaderBackColor;
    }


    /**
     * Gets the cppPayflowColor value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return cppPayflowColor
     */
    public java.lang.String getCppPayflowColor() {
        return cppPayflowColor;
    }


    /**
     * Sets the cppPayflowColor value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param cppPayflowColor
     */
    public void setCppPayflowColor(java.lang.String cppPayflowColor) {
        this.cppPayflowColor = cppPayflowColor;
    }


    /**
     * Gets the buyerEmail value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return buyerEmail
     */
    public java.lang.String getBuyerEmail() {
        return buyerEmail;
    }


    /**
     * Sets the buyerEmail value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param buyerEmail
     */
    public void setBuyerEmail(java.lang.String buyerEmail) {
        this.buyerEmail = buyerEmail;
    }


    /**
     * Gets the reqBillingAddress value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @return reqBillingAddress   * The value 1 indicates that you require that the customer's
     * billing address on file. Setting this element overrides the setting
     * you have specified in Admin.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character.
     */
    public java.lang.String getReqBillingAddress() {
        return reqBillingAddress;
    }


    /**
     * Sets the reqBillingAddress value for this SetCustomerBillingAgreementRequestDetailsType.
     * 
     * @param reqBillingAddress   * The value 1 indicates that you require that the customer's
     * billing address on file. Setting this element overrides the setting
     * you have specified in Admin.
     * 
     * 						
     * Optional
     * 
     * 						Character length and limitations: One single-byte numeric character.
     */
    public void setReqBillingAddress(java.lang.String reqBillingAddress) {
        this.reqBillingAddress = reqBillingAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetCustomerBillingAgreementRequestDetailsType)) return false;
        SetCustomerBillingAgreementRequestDetailsType other = (SetCustomerBillingAgreementRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAgreementDetails==null && other.getBillingAgreementDetails()==null) || 
             (this.billingAgreementDetails!=null &&
              this.billingAgreementDetails.equals(other.getBillingAgreementDetails()))) &&
            ((this.returnURL==null && other.getReturnURL()==null) || 
             (this.returnURL!=null &&
              this.returnURL.equals(other.getReturnURL()))) &&
            ((this.cancelURL==null && other.getCancelURL()==null) || 
             (this.cancelURL!=null &&
              this.cancelURL.equals(other.getCancelURL()))) &&
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
            ((this.buyerEmail==null && other.getBuyerEmail()==null) || 
             (this.buyerEmail!=null &&
              this.buyerEmail.equals(other.getBuyerEmail()))) &&
            ((this.reqBillingAddress==null && other.getReqBillingAddress()==null) || 
             (this.reqBillingAddress!=null &&
              this.reqBillingAddress.equals(other.getReqBillingAddress())));
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
        if (getBillingAgreementDetails() != null) {
            _hashCode += getBillingAgreementDetails().hashCode();
        }
        if (getReturnURL() != null) {
            _hashCode += getReturnURL().hashCode();
        }
        if (getCancelURL() != null) {
            _hashCode += getCancelURL().hashCode();
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
        if (getBuyerEmail() != null) {
            _hashCode += getBuyerEmail().hashCode();
        }
        if (getReqBillingAddress() != null) {
            _hashCode += getReqBillingAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetCustomerBillingAgreementRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetCustomerBillingAgreementRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAgreementDetailsType"));
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
        elemField.setNillable(false);
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
        elemField.setFieldName("buyerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqBillingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqBillingAddress"));
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
