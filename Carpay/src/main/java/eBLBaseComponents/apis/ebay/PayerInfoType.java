/**
 * PayerInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * PayerInfoType 
 * 				Payer information
 */
public class PayerInfoType  implements java.io.Serializable {
    /* Email address of payer 
     * Character length and limitations: 127 single-byte characters */
    private java.lang.String payer;

    /* Unique customer ID 
     * Character length and limitations: 17 single-byte characters */
    private java.lang.String payerID;

    /* Status of payer's email address */
    private eBLBaseComponents.apis.ebay.PayPalUserStatusCodeType payerStatus;

    /* Name of payer */
    private eBLBaseComponents.apis.ebay.PersonNameType payerName;

    /* Payment sender's country of residence using standard two-character
     * ISO 3166 country codes. 
     * Character length and limitations: Two single-byte characters */
    private eBLBaseComponents.apis.ebay.CountryCodeType payerCountry;

    /* Payer's business name. 
     * Character length and limitations: 127 single-byte characters */
    private java.lang.String payerBusiness;

    /* Payer's business address */
    private eBLBaseComponents.apis.ebay.AddressType address;

    /* Business contact telephone number */
    private java.lang.String contactPhone;

    /* Items such as merchant coupons, loyalty cards, and manufacturer
     * coupons in the PayPal wallet. */
    private eBLBaseComponents.apis.ebay.WalletItemsType[] walletItems;

    /* Details about payer's tax info.
     * 						Refer to the TaxIdDetailsType for more details. */
    private eBLBaseComponents.apis.ebay.TaxIdDetailsType taxIdDetails;

    /* Holds any enhanced information about the payer */
    private EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType enhancedPayerInfo;

    public PayerInfoType() {
    }

    public PayerInfoType(
           java.lang.String payer,
           java.lang.String payerID,
           eBLBaseComponents.apis.ebay.PayPalUserStatusCodeType payerStatus,
           eBLBaseComponents.apis.ebay.PersonNameType payerName,
           eBLBaseComponents.apis.ebay.CountryCodeType payerCountry,
           java.lang.String payerBusiness,
           eBLBaseComponents.apis.ebay.AddressType address,
           java.lang.String contactPhone,
           eBLBaseComponents.apis.ebay.WalletItemsType[] walletItems,
           eBLBaseComponents.apis.ebay.TaxIdDetailsType taxIdDetails,
           EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType enhancedPayerInfo) {
           this.payer = payer;
           this.payerID = payerID;
           this.payerStatus = payerStatus;
           this.payerName = payerName;
           this.payerCountry = payerCountry;
           this.payerBusiness = payerBusiness;
           this.address = address;
           this.contactPhone = contactPhone;
           this.walletItems = walletItems;
           this.taxIdDetails = taxIdDetails;
           this.enhancedPayerInfo = enhancedPayerInfo;
    }


    /**
     * Gets the payer value for this PayerInfoType.
     * 
     * @return payer   * Email address of payer 
     * Character length and limitations: 127 single-byte characters
     */
    public java.lang.String getPayer() {
        return payer;
    }


    /**
     * Sets the payer value for this PayerInfoType.
     * 
     * @param payer   * Email address of payer 
     * Character length and limitations: 127 single-byte characters
     */
    public void setPayer(java.lang.String payer) {
        this.payer = payer;
    }


    /**
     * Gets the payerID value for this PayerInfoType.
     * 
     * @return payerID   * Unique customer ID 
     * Character length and limitations: 17 single-byte characters
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this PayerInfoType.
     * 
     * @param payerID   * Unique customer ID 
     * Character length and limitations: 17 single-byte characters
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }


    /**
     * Gets the payerStatus value for this PayerInfoType.
     * 
     * @return payerStatus   * Status of payer's email address
     */
    public eBLBaseComponents.apis.ebay.PayPalUserStatusCodeType getPayerStatus() {
        return payerStatus;
    }


    /**
     * Sets the payerStatus value for this PayerInfoType.
     * 
     * @param payerStatus   * Status of payer's email address
     */
    public void setPayerStatus(eBLBaseComponents.apis.ebay.PayPalUserStatusCodeType payerStatus) {
        this.payerStatus = payerStatus;
    }


    /**
     * Gets the payerName value for this PayerInfoType.
     * 
     * @return payerName   * Name of payer
     */
    public eBLBaseComponents.apis.ebay.PersonNameType getPayerName() {
        return payerName;
    }


    /**
     * Sets the payerName value for this PayerInfoType.
     * 
     * @param payerName   * Name of payer
     */
    public void setPayerName(eBLBaseComponents.apis.ebay.PersonNameType payerName) {
        this.payerName = payerName;
    }


    /**
     * Gets the payerCountry value for this PayerInfoType.
     * 
     * @return payerCountry   * Payment sender's country of residence using standard two-character
     * ISO 3166 country codes. 
     * Character length and limitations: Two single-byte characters
     */
    public eBLBaseComponents.apis.ebay.CountryCodeType getPayerCountry() {
        return payerCountry;
    }


    /**
     * Sets the payerCountry value for this PayerInfoType.
     * 
     * @param payerCountry   * Payment sender's country of residence using standard two-character
     * ISO 3166 country codes. 
     * Character length and limitations: Two single-byte characters
     */
    public void setPayerCountry(eBLBaseComponents.apis.ebay.CountryCodeType payerCountry) {
        this.payerCountry = payerCountry;
    }


    /**
     * Gets the payerBusiness value for this PayerInfoType.
     * 
     * @return payerBusiness   * Payer's business name. 
     * Character length and limitations: 127 single-byte characters
     */
    public java.lang.String getPayerBusiness() {
        return payerBusiness;
    }


    /**
     * Sets the payerBusiness value for this PayerInfoType.
     * 
     * @param payerBusiness   * Payer's business name. 
     * Character length and limitations: 127 single-byte characters
     */
    public void setPayerBusiness(java.lang.String payerBusiness) {
        this.payerBusiness = payerBusiness;
    }


    /**
     * Gets the address value for this PayerInfoType.
     * 
     * @return address   * Payer's business address
     */
    public eBLBaseComponents.apis.ebay.AddressType getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PayerInfoType.
     * 
     * @param address   * Payer's business address
     */
    public void setAddress(eBLBaseComponents.apis.ebay.AddressType address) {
        this.address = address;
    }


    /**
     * Gets the contactPhone value for this PayerInfoType.
     * 
     * @return contactPhone   * Business contact telephone number
     */
    public java.lang.String getContactPhone() {
        return contactPhone;
    }


    /**
     * Sets the contactPhone value for this PayerInfoType.
     * 
     * @param contactPhone   * Business contact telephone number
     */
    public void setContactPhone(java.lang.String contactPhone) {
        this.contactPhone = contactPhone;
    }


    /**
     * Gets the walletItems value for this PayerInfoType.
     * 
     * @return walletItems   * Items such as merchant coupons, loyalty cards, and manufacturer
     * coupons in the PayPal wallet.
     */
    public eBLBaseComponents.apis.ebay.WalletItemsType[] getWalletItems() {
        return walletItems;
    }


    /**
     * Sets the walletItems value for this PayerInfoType.
     * 
     * @param walletItems   * Items such as merchant coupons, loyalty cards, and manufacturer
     * coupons in the PayPal wallet.
     */
    public void setWalletItems(eBLBaseComponents.apis.ebay.WalletItemsType[] walletItems) {
        this.walletItems = walletItems;
    }

    public eBLBaseComponents.apis.ebay.WalletItemsType getWalletItems(int i) {
        return this.walletItems[i];
    }

    public void setWalletItems(int i, eBLBaseComponents.apis.ebay.WalletItemsType _value) {
        this.walletItems[i] = _value;
    }


    /**
     * Gets the taxIdDetails value for this PayerInfoType.
     * 
     * @return taxIdDetails   * Details about payer's tax info.
     * 						Refer to the TaxIdDetailsType for more details.
     */
    public eBLBaseComponents.apis.ebay.TaxIdDetailsType getTaxIdDetails() {
        return taxIdDetails;
    }


    /**
     * Sets the taxIdDetails value for this PayerInfoType.
     * 
     * @param taxIdDetails   * Details about payer's tax info.
     * 						Refer to the TaxIdDetailsType for more details.
     */
    public void setTaxIdDetails(eBLBaseComponents.apis.ebay.TaxIdDetailsType taxIdDetails) {
        this.taxIdDetails = taxIdDetails;
    }


    /**
     * Gets the enhancedPayerInfo value for this PayerInfoType.
     * 
     * @return enhancedPayerInfo   * Holds any enhanced information about the payer
     */
    public EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType getEnhancedPayerInfo() {
        return enhancedPayerInfo;
    }


    /**
     * Sets the enhancedPayerInfo value for this PayerInfoType.
     * 
     * @param enhancedPayerInfo   * Holds any enhanced information about the payer
     */
    public void setEnhancedPayerInfo(EnhancedDataTypes.apis.ebay.EnhancedPayerInfoType enhancedPayerInfo) {
        this.enhancedPayerInfo = enhancedPayerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PayerInfoType)) return false;
        PayerInfoType other = (PayerInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.payer==null && other.getPayer()==null) || 
             (this.payer!=null &&
              this.payer.equals(other.getPayer()))) &&
            ((this.payerID==null && other.getPayerID()==null) || 
             (this.payerID!=null &&
              this.payerID.equals(other.getPayerID()))) &&
            ((this.payerStatus==null && other.getPayerStatus()==null) || 
             (this.payerStatus!=null &&
              this.payerStatus.equals(other.getPayerStatus()))) &&
            ((this.payerName==null && other.getPayerName()==null) || 
             (this.payerName!=null &&
              this.payerName.equals(other.getPayerName()))) &&
            ((this.payerCountry==null && other.getPayerCountry()==null) || 
             (this.payerCountry!=null &&
              this.payerCountry.equals(other.getPayerCountry()))) &&
            ((this.payerBusiness==null && other.getPayerBusiness()==null) || 
             (this.payerBusiness!=null &&
              this.payerBusiness.equals(other.getPayerBusiness()))) &&
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.contactPhone==null && other.getContactPhone()==null) || 
             (this.contactPhone!=null &&
              this.contactPhone.equals(other.getContactPhone()))) &&
            ((this.walletItems==null && other.getWalletItems()==null) || 
             (this.walletItems!=null &&
              java.util.Arrays.equals(this.walletItems, other.getWalletItems()))) &&
            ((this.taxIdDetails==null && other.getTaxIdDetails()==null) || 
             (this.taxIdDetails!=null &&
              this.taxIdDetails.equals(other.getTaxIdDetails()))) &&
            ((this.enhancedPayerInfo==null && other.getEnhancedPayerInfo()==null) || 
             (this.enhancedPayerInfo!=null &&
              this.enhancedPayerInfo.equals(other.getEnhancedPayerInfo())));
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
        if (getPayer() != null) {
            _hashCode += getPayer().hashCode();
        }
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        if (getPayerStatus() != null) {
            _hashCode += getPayerStatus().hashCode();
        }
        if (getPayerName() != null) {
            _hashCode += getPayerName().hashCode();
        }
        if (getPayerCountry() != null) {
            _hashCode += getPayerCountry().hashCode();
        }
        if (getPayerBusiness() != null) {
            _hashCode += getPayerBusiness().hashCode();
        }
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getContactPhone() != null) {
            _hashCode += getContactPhone().hashCode();
        }
        if (getWalletItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWalletItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWalletItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxIdDetails() != null) {
            _hashCode += getTaxIdDetails().hashCode();
        }
        if (getEnhancedPayerInfo() != null) {
            _hashCode += getEnhancedPayerInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PayerInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Payer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayPalUserStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PersonNameType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CountryCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerBusiness"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ContactPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("walletItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "WalletItemsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedPayerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "EnhancedPayerInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedPayerInfoType"));
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
