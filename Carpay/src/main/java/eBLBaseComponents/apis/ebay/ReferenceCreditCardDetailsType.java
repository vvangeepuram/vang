/**
 * ReferenceCreditCardDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * CreditCardDetailsType for DCC Reference Transaction
 * 				Information about a Credit Card.
 */
public class ReferenceCreditCardDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.CreditCardNumberTypeType creditCardNumberType;

    private java.lang.Integer expMonth;

    private java.lang.Integer expYear;

    private eBLBaseComponents.apis.ebay.PersonNameType cardOwnerName;

    private eBLBaseComponents.apis.ebay.AddressType billingAddress;

    private java.lang.String CVV2;

    private java.lang.Integer startMonth;

    private java.lang.Integer startYear;

    private java.lang.String issueNumber;

    public ReferenceCreditCardDetailsType() {
    }

    public ReferenceCreditCardDetailsType(
           eBLBaseComponents.apis.ebay.CreditCardNumberTypeType creditCardNumberType,
           java.lang.Integer expMonth,
           java.lang.Integer expYear,
           eBLBaseComponents.apis.ebay.PersonNameType cardOwnerName,
           eBLBaseComponents.apis.ebay.AddressType billingAddress,
           java.lang.String CVV2,
           java.lang.Integer startMonth,
           java.lang.Integer startYear,
           java.lang.String issueNumber) {
           this.creditCardNumberType = creditCardNumberType;
           this.expMonth = expMonth;
           this.expYear = expYear;
           this.cardOwnerName = cardOwnerName;
           this.billingAddress = billingAddress;
           this.CVV2 = CVV2;
           this.startMonth = startMonth;
           this.startYear = startYear;
           this.issueNumber = issueNumber;
    }


    /**
     * Gets the creditCardNumberType value for this ReferenceCreditCardDetailsType.
     * 
     * @return creditCardNumberType
     */
    public eBLBaseComponents.apis.ebay.CreditCardNumberTypeType getCreditCardNumberType() {
        return creditCardNumberType;
    }


    /**
     * Sets the creditCardNumberType value for this ReferenceCreditCardDetailsType.
     * 
     * @param creditCardNumberType
     */
    public void setCreditCardNumberType(eBLBaseComponents.apis.ebay.CreditCardNumberTypeType creditCardNumberType) {
        this.creditCardNumberType = creditCardNumberType;
    }


    /**
     * Gets the expMonth value for this ReferenceCreditCardDetailsType.
     * 
     * @return expMonth
     */
    public java.lang.Integer getExpMonth() {
        return expMonth;
    }


    /**
     * Sets the expMonth value for this ReferenceCreditCardDetailsType.
     * 
     * @param expMonth
     */
    public void setExpMonth(java.lang.Integer expMonth) {
        this.expMonth = expMonth;
    }


    /**
     * Gets the expYear value for this ReferenceCreditCardDetailsType.
     * 
     * @return expYear
     */
    public java.lang.Integer getExpYear() {
        return expYear;
    }


    /**
     * Sets the expYear value for this ReferenceCreditCardDetailsType.
     * 
     * @param expYear
     */
    public void setExpYear(java.lang.Integer expYear) {
        this.expYear = expYear;
    }


    /**
     * Gets the cardOwnerName value for this ReferenceCreditCardDetailsType.
     * 
     * @return cardOwnerName
     */
    public eBLBaseComponents.apis.ebay.PersonNameType getCardOwnerName() {
        return cardOwnerName;
    }


    /**
     * Sets the cardOwnerName value for this ReferenceCreditCardDetailsType.
     * 
     * @param cardOwnerName
     */
    public void setCardOwnerName(eBLBaseComponents.apis.ebay.PersonNameType cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }


    /**
     * Gets the billingAddress value for this ReferenceCreditCardDetailsType.
     * 
     * @return billingAddress
     */
    public eBLBaseComponents.apis.ebay.AddressType getBillingAddress() {
        return billingAddress;
    }


    /**
     * Sets the billingAddress value for this ReferenceCreditCardDetailsType.
     * 
     * @param billingAddress
     */
    public void setBillingAddress(eBLBaseComponents.apis.ebay.AddressType billingAddress) {
        this.billingAddress = billingAddress;
    }


    /**
     * Gets the CVV2 value for this ReferenceCreditCardDetailsType.
     * 
     * @return CVV2
     */
    public java.lang.String getCVV2() {
        return CVV2;
    }


    /**
     * Sets the CVV2 value for this ReferenceCreditCardDetailsType.
     * 
     * @param CVV2
     */
    public void setCVV2(java.lang.String CVV2) {
        this.CVV2 = CVV2;
    }


    /**
     * Gets the startMonth value for this ReferenceCreditCardDetailsType.
     * 
     * @return startMonth
     */
    public java.lang.Integer getStartMonth() {
        return startMonth;
    }


    /**
     * Sets the startMonth value for this ReferenceCreditCardDetailsType.
     * 
     * @param startMonth
     */
    public void setStartMonth(java.lang.Integer startMonth) {
        this.startMonth = startMonth;
    }


    /**
     * Gets the startYear value for this ReferenceCreditCardDetailsType.
     * 
     * @return startYear
     */
    public java.lang.Integer getStartYear() {
        return startYear;
    }


    /**
     * Sets the startYear value for this ReferenceCreditCardDetailsType.
     * 
     * @param startYear
     */
    public void setStartYear(java.lang.Integer startYear) {
        this.startYear = startYear;
    }


    /**
     * Gets the issueNumber value for this ReferenceCreditCardDetailsType.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this ReferenceCreditCardDetailsType.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenceCreditCardDetailsType)) return false;
        ReferenceCreditCardDetailsType other = (ReferenceCreditCardDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditCardNumberType==null && other.getCreditCardNumberType()==null) || 
             (this.creditCardNumberType!=null &&
              this.creditCardNumberType.equals(other.getCreditCardNumberType()))) &&
            ((this.expMonth==null && other.getExpMonth()==null) || 
             (this.expMonth!=null &&
              this.expMonth.equals(other.getExpMonth()))) &&
            ((this.expYear==null && other.getExpYear()==null) || 
             (this.expYear!=null &&
              this.expYear.equals(other.getExpYear()))) &&
            ((this.cardOwnerName==null && other.getCardOwnerName()==null) || 
             (this.cardOwnerName!=null &&
              this.cardOwnerName.equals(other.getCardOwnerName()))) &&
            ((this.billingAddress==null && other.getBillingAddress()==null) || 
             (this.billingAddress!=null &&
              this.billingAddress.equals(other.getBillingAddress()))) &&
            ((this.CVV2==null && other.getCVV2()==null) || 
             (this.CVV2!=null &&
              this.CVV2.equals(other.getCVV2()))) &&
            ((this.startMonth==null && other.getStartMonth()==null) || 
             (this.startMonth!=null &&
              this.startMonth.equals(other.getStartMonth()))) &&
            ((this.startYear==null && other.getStartYear()==null) || 
             (this.startYear!=null &&
              this.startYear.equals(other.getStartYear()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              this.issueNumber.equals(other.getIssueNumber())));
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
        if (getCreditCardNumberType() != null) {
            _hashCode += getCreditCardNumberType().hashCode();
        }
        if (getExpMonth() != null) {
            _hashCode += getExpMonth().hashCode();
        }
        if (getExpYear() != null) {
            _hashCode += getExpYear().hashCode();
        }
        if (getCardOwnerName() != null) {
            _hashCode += getCardOwnerName().hashCode();
        }
        if (getBillingAddress() != null) {
            _hashCode += getBillingAddress().hashCode();
        }
        if (getCVV2() != null) {
            _hashCode += getCVV2().hashCode();
        }
        if (getStartMonth() != null) {
            _hashCode += getStartMonth().hashCode();
        }
        if (getStartYear() != null) {
            _hashCode += getStartYear().hashCode();
        }
        if (getIssueNumber() != null) {
            _hashCode += getIssueNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenceCreditCardDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReferenceCreditCardDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumberType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardNumberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardNumberTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExpMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExpYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CardOwnerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PersonNameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BillingAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AddressType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVV2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CVV2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMonth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StartMonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startYear");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StartYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IssueNumber"));
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
