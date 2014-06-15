/**
 * BuyerDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Details about the buyer's account passed in by the merchant or
 * partner.
 * 				Optional.
 */
public class BuyerDetailsType  implements java.io.Serializable {
    /* The client's unique ID for this user. */
    private java.lang.String buyerId;

    /* The user name of the user at the marketplaces site. */
    private java.lang.String buyerUserName;

    /* Date when the user registered with the marketplace. */
    private java.util.Calendar buyerRegistrationDate;

    /* Details about payer's tax info.
     * 						Refer to the TaxIdDetailsType for more details. */
    private eBLBaseComponents.apis.ebay.TaxIdDetailsType taxIdDetails;

    /* Contains information that identifies the buyer. e.g. email
     * address or the external remember me id. */
    private eBLBaseComponents.apis.ebay.IdentificationInfoType identificationInfo;

    public BuyerDetailsType() {
    }

    public BuyerDetailsType(
           java.lang.String buyerId,
           java.lang.String buyerUserName,
           java.util.Calendar buyerRegistrationDate,
           eBLBaseComponents.apis.ebay.TaxIdDetailsType taxIdDetails,
           eBLBaseComponents.apis.ebay.IdentificationInfoType identificationInfo) {
           this.buyerId = buyerId;
           this.buyerUserName = buyerUserName;
           this.buyerRegistrationDate = buyerRegistrationDate;
           this.taxIdDetails = taxIdDetails;
           this.identificationInfo = identificationInfo;
    }


    /**
     * Gets the buyerId value for this BuyerDetailsType.
     * 
     * @return buyerId   * The client's unique ID for this user.
     */
    public java.lang.String getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this BuyerDetailsType.
     * 
     * @param buyerId   * The client's unique ID for this user.
     */
    public void setBuyerId(java.lang.String buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the buyerUserName value for this BuyerDetailsType.
     * 
     * @return buyerUserName   * The user name of the user at the marketplaces site.
     */
    public java.lang.String getBuyerUserName() {
        return buyerUserName;
    }


    /**
     * Sets the buyerUserName value for this BuyerDetailsType.
     * 
     * @param buyerUserName   * The user name of the user at the marketplaces site.
     */
    public void setBuyerUserName(java.lang.String buyerUserName) {
        this.buyerUserName = buyerUserName;
    }


    /**
     * Gets the buyerRegistrationDate value for this BuyerDetailsType.
     * 
     * @return buyerRegistrationDate   * Date when the user registered with the marketplace.
     */
    public java.util.Calendar getBuyerRegistrationDate() {
        return buyerRegistrationDate;
    }


    /**
     * Sets the buyerRegistrationDate value for this BuyerDetailsType.
     * 
     * @param buyerRegistrationDate   * Date when the user registered with the marketplace.
     */
    public void setBuyerRegistrationDate(java.util.Calendar buyerRegistrationDate) {
        this.buyerRegistrationDate = buyerRegistrationDate;
    }


    /**
     * Gets the taxIdDetails value for this BuyerDetailsType.
     * 
     * @return taxIdDetails   * Details about payer's tax info.
     * 						Refer to the TaxIdDetailsType for more details.
     */
    public eBLBaseComponents.apis.ebay.TaxIdDetailsType getTaxIdDetails() {
        return taxIdDetails;
    }


    /**
     * Sets the taxIdDetails value for this BuyerDetailsType.
     * 
     * @param taxIdDetails   * Details about payer's tax info.
     * 						Refer to the TaxIdDetailsType for more details.
     */
    public void setTaxIdDetails(eBLBaseComponents.apis.ebay.TaxIdDetailsType taxIdDetails) {
        this.taxIdDetails = taxIdDetails;
    }


    /**
     * Gets the identificationInfo value for this BuyerDetailsType.
     * 
     * @return identificationInfo   * Contains information that identifies the buyer. e.g. email
     * address or the external remember me id.
     */
    public eBLBaseComponents.apis.ebay.IdentificationInfoType getIdentificationInfo() {
        return identificationInfo;
    }


    /**
     * Sets the identificationInfo value for this BuyerDetailsType.
     * 
     * @param identificationInfo   * Contains information that identifies the buyer. e.g. email
     * address or the external remember me id.
     */
    public void setIdentificationInfo(eBLBaseComponents.apis.ebay.IdentificationInfoType identificationInfo) {
        this.identificationInfo = identificationInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuyerDetailsType)) return false;
        BuyerDetailsType other = (BuyerDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buyerId==null && other.getBuyerId()==null) || 
             (this.buyerId!=null &&
              this.buyerId.equals(other.getBuyerId()))) &&
            ((this.buyerUserName==null && other.getBuyerUserName()==null) || 
             (this.buyerUserName!=null &&
              this.buyerUserName.equals(other.getBuyerUserName()))) &&
            ((this.buyerRegistrationDate==null && other.getBuyerRegistrationDate()==null) || 
             (this.buyerRegistrationDate!=null &&
              this.buyerRegistrationDate.equals(other.getBuyerRegistrationDate()))) &&
            ((this.taxIdDetails==null && other.getTaxIdDetails()==null) || 
             (this.taxIdDetails!=null &&
              this.taxIdDetails.equals(other.getTaxIdDetails()))) &&
            ((this.identificationInfo==null && other.getIdentificationInfo()==null) || 
             (this.identificationInfo!=null &&
              this.identificationInfo.equals(other.getIdentificationInfo())));
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
        if (getBuyerId() != null) {
            _hashCode += getBuyerId().hashCode();
        }
        if (getBuyerUserName() != null) {
            _hashCode += getBuyerUserName().hashCode();
        }
        if (getBuyerRegistrationDate() != null) {
            _hashCode += getBuyerRegistrationDate().hashCode();
        }
        if (getTaxIdDetails() != null) {
            _hashCode += getTaxIdDetails().hashCode();
        }
        if (getIdentificationInfo() != null) {
            _hashCode += getIdentificationInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuyerDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerRegistrationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerRegistrationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TaxIdDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentificationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentificationInfoType"));
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
