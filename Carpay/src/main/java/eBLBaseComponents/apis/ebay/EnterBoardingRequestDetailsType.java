/**
 * EnterBoardingRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class EnterBoardingRequestDetailsType  implements java.io.Serializable {
    /* Onboarding program code given to you by PayPal.
     * 			
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 64 alphanumeric characters */
    private java.lang.String programCode;

    /* A list of comma-separated values that indicate the PayPal products
     * you are implementing for this merchant:
     * 			
     * 						
     * Direct Payment (dp) allows payments by credit card without requiring
     * the customer to have a PayPal account. 
     * 
     * 						
     * Express Checkout (ec) allows customers to fund transactions with their
     * PayPal account. 
     * 
     * 						
     * Authorization and Capture (auth_settle) allows merchants to verify
     * availability of funds in a PayPal account, but capture them at a later
     * time. 
     * 
     * 						
     * Administrative APIs (admin_api) is a collection of the PayPal APIs
     * for transaction searching, getting transaction details, refunding,
     * and mass payments. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 64 alphanumeric characters */
    private java.lang.String productList;

    /* Any custom information you want to store for this partner
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 256 alphanumeric characters */
    private java.lang.String partnerCustom;

    /* The URL for the logo displayed on the PayPal Partner Welcome
     * Page.
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 2,048 alphanumeric characters */
    private java.lang.String imageUrl;

    /* Marketing category tha configures the graphic displayed n the
     * PayPal Partner Welcome page. */
    private eBLBaseComponents.apis.ebay.MarketingCategoryType marketingCategory;

    /* Information about the merchantâs business */
    private eBLBaseComponents.apis.ebay.BusinessInfoType businessInfo;

    /* Information about the merchant (the business owner) */
    private eBLBaseComponents.apis.ebay.BusinessOwnerInfoType ownerInfo;

    /* Information about the merchant's bank account */
    private eBLBaseComponents.apis.ebay.BankAccountDetailsType bankAccount;

    public EnterBoardingRequestDetailsType() {
    }

    public EnterBoardingRequestDetailsType(
           java.lang.String programCode,
           java.lang.String productList,
           java.lang.String partnerCustom,
           java.lang.String imageUrl,
           eBLBaseComponents.apis.ebay.MarketingCategoryType marketingCategory,
           eBLBaseComponents.apis.ebay.BusinessInfoType businessInfo,
           eBLBaseComponents.apis.ebay.BusinessOwnerInfoType ownerInfo,
           eBLBaseComponents.apis.ebay.BankAccountDetailsType bankAccount) {
           this.programCode = programCode;
           this.productList = productList;
           this.partnerCustom = partnerCustom;
           this.imageUrl = imageUrl;
           this.marketingCategory = marketingCategory;
           this.businessInfo = businessInfo;
           this.ownerInfo = ownerInfo;
           this.bankAccount = bankAccount;
    }


    /**
     * Gets the programCode value for this EnterBoardingRequestDetailsType.
     * 
     * @return programCode   * Onboarding program code given to you by PayPal.
     * 			
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 64 alphanumeric characters
     */
    public java.lang.String getProgramCode() {
        return programCode;
    }


    /**
     * Sets the programCode value for this EnterBoardingRequestDetailsType.
     * 
     * @param programCode   * Onboarding program code given to you by PayPal.
     * 			
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 64 alphanumeric characters
     */
    public void setProgramCode(java.lang.String programCode) {
        this.programCode = programCode;
    }


    /**
     * Gets the productList value for this EnterBoardingRequestDetailsType.
     * 
     * @return productList   * A list of comma-separated values that indicate the PayPal products
     * you are implementing for this merchant:
     * 			
     * 						
     * Direct Payment (dp) allows payments by credit card without requiring
     * the customer to have a PayPal account. 
     * 
     * 						
     * Express Checkout (ec) allows customers to fund transactions with their
     * PayPal account. 
     * 
     * 						
     * Authorization and Capture (auth_settle) allows merchants to verify
     * availability of funds in a PayPal account, but capture them at a later
     * time. 
     * 
     * 						
     * Administrative APIs (admin_api) is a collection of the PayPal APIs
     * for transaction searching, getting transaction details, refunding,
     * and mass payments. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 64 alphanumeric characters
     */
    public java.lang.String getProductList() {
        return productList;
    }


    /**
     * Sets the productList value for this EnterBoardingRequestDetailsType.
     * 
     * @param productList   * A list of comma-separated values that indicate the PayPal products
     * you are implementing for this merchant:
     * 			
     * 						
     * Direct Payment (dp) allows payments by credit card without requiring
     * the customer to have a PayPal account. 
     * 
     * 						
     * Express Checkout (ec) allows customers to fund transactions with their
     * PayPal account. 
     * 
     * 						
     * Authorization and Capture (auth_settle) allows merchants to verify
     * availability of funds in a PayPal account, but capture them at a later
     * time. 
     * 
     * 						
     * Administrative APIs (admin_api) is a collection of the PayPal APIs
     * for transaction searching, getting transaction details, refunding,
     * and mass payments. 
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 64 alphanumeric characters
     */
    public void setProductList(java.lang.String productList) {
        this.productList = productList;
    }


    /**
     * Gets the partnerCustom value for this EnterBoardingRequestDetailsType.
     * 
     * @return partnerCustom   * Any custom information you want to store for this partner
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 256 alphanumeric characters
     */
    public java.lang.String getPartnerCustom() {
        return partnerCustom;
    }


    /**
     * Sets the partnerCustom value for this EnterBoardingRequestDetailsType.
     * 
     * @param partnerCustom   * Any custom information you want to store for this partner
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 256 alphanumeric characters
     */
    public void setPartnerCustom(java.lang.String partnerCustom) {
        this.partnerCustom = partnerCustom;
    }


    /**
     * Gets the imageUrl value for this EnterBoardingRequestDetailsType.
     * 
     * @return imageUrl   * The URL for the logo displayed on the PayPal Partner Welcome
     * Page.
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 2,048 alphanumeric characters
     */
    public java.lang.String getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this EnterBoardingRequestDetailsType.
     * 
     * @param imageUrl   * The URL for the logo displayed on the PayPal Partner Welcome
     * Page.
     * 
     * 						
     * Optional
     * 
     * 						
     * Character length and limitations: 2,048 alphanumeric characters
     */
    public void setImageUrl(java.lang.String imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the marketingCategory value for this EnterBoardingRequestDetailsType.
     * 
     * @return marketingCategory   * Marketing category tha configures the graphic displayed n the
     * PayPal Partner Welcome page.
     */
    public eBLBaseComponents.apis.ebay.MarketingCategoryType getMarketingCategory() {
        return marketingCategory;
    }


    /**
     * Sets the marketingCategory value for this EnterBoardingRequestDetailsType.
     * 
     * @param marketingCategory   * Marketing category tha configures the graphic displayed n the
     * PayPal Partner Welcome page.
     */
    public void setMarketingCategory(eBLBaseComponents.apis.ebay.MarketingCategoryType marketingCategory) {
        this.marketingCategory = marketingCategory;
    }


    /**
     * Gets the businessInfo value for this EnterBoardingRequestDetailsType.
     * 
     * @return businessInfo   * Information about the merchantâs business
     */
    public eBLBaseComponents.apis.ebay.BusinessInfoType getBusinessInfo() {
        return businessInfo;
    }


    /**
     * Sets the businessInfo value for this EnterBoardingRequestDetailsType.
     * 
     * @param businessInfo   * Information about the merchantâs business
     */
    public void setBusinessInfo(eBLBaseComponents.apis.ebay.BusinessInfoType businessInfo) {
        this.businessInfo = businessInfo;
    }


    /**
     * Gets the ownerInfo value for this EnterBoardingRequestDetailsType.
     * 
     * @return ownerInfo   * Information about the merchant (the business owner)
     */
    public eBLBaseComponents.apis.ebay.BusinessOwnerInfoType getOwnerInfo() {
        return ownerInfo;
    }


    /**
     * Sets the ownerInfo value for this EnterBoardingRequestDetailsType.
     * 
     * @param ownerInfo   * Information about the merchant (the business owner)
     */
    public void setOwnerInfo(eBLBaseComponents.apis.ebay.BusinessOwnerInfoType ownerInfo) {
        this.ownerInfo = ownerInfo;
    }


    /**
     * Gets the bankAccount value for this EnterBoardingRequestDetailsType.
     * 
     * @return bankAccount   * Information about the merchant's bank account
     */
    public eBLBaseComponents.apis.ebay.BankAccountDetailsType getBankAccount() {
        return bankAccount;
    }


    /**
     * Sets the bankAccount value for this EnterBoardingRequestDetailsType.
     * 
     * @param bankAccount   * Information about the merchant's bank account
     */
    public void setBankAccount(eBLBaseComponents.apis.ebay.BankAccountDetailsType bankAccount) {
        this.bankAccount = bankAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnterBoardingRequestDetailsType)) return false;
        EnterBoardingRequestDetailsType other = (EnterBoardingRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.programCode==null && other.getProgramCode()==null) || 
             (this.programCode!=null &&
              this.programCode.equals(other.getProgramCode()))) &&
            ((this.productList==null && other.getProductList()==null) || 
             (this.productList!=null &&
              this.productList.equals(other.getProductList()))) &&
            ((this.partnerCustom==null && other.getPartnerCustom()==null) || 
             (this.partnerCustom!=null &&
              this.partnerCustom.equals(other.getPartnerCustom()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            ((this.marketingCategory==null && other.getMarketingCategory()==null) || 
             (this.marketingCategory!=null &&
              this.marketingCategory.equals(other.getMarketingCategory()))) &&
            ((this.businessInfo==null && other.getBusinessInfo()==null) || 
             (this.businessInfo!=null &&
              this.businessInfo.equals(other.getBusinessInfo()))) &&
            ((this.ownerInfo==null && other.getOwnerInfo()==null) || 
             (this.ownerInfo!=null &&
              this.ownerInfo.equals(other.getOwnerInfo()))) &&
            ((this.bankAccount==null && other.getBankAccount()==null) || 
             (this.bankAccount!=null &&
              this.bankAccount.equals(other.getBankAccount())));
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
        if (getProgramCode() != null) {
            _hashCode += getProgramCode().hashCode();
        }
        if (getProductList() != null) {
            _hashCode += getProductList().hashCode();
        }
        if (getPartnerCustom() != null) {
            _hashCode += getPartnerCustom().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        if (getMarketingCategory() != null) {
            _hashCode += getMarketingCategory().hashCode();
        }
        if (getBusinessInfo() != null) {
            _hashCode += getBusinessInfo().hashCode();
        }
        if (getOwnerInfo() != null) {
            _hashCode += getOwnerInfo().hashCode();
        }
        if (getBankAccount() != null) {
            _hashCode += getBankAccount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnterBoardingRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnterBoardingRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProgramCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ProductList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PartnerCustom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ImageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketingCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MarketingCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MarketingCategoryType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OwnerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessOwnerInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BankAccountDetailsType"));
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
