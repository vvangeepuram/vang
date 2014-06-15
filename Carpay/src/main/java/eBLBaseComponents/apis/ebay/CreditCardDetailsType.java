/**
 * CreditCardDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * CreditCardDetailsType 
 *                 Information about a Credit Card.
 */
public class CreditCardDetailsType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.CreditCardTypeType creditCardType;

    private java.lang.String creditCardNumber;

    private java.lang.Integer expMonth;

    private java.lang.Integer expYear;

    private eBLBaseComponents.apis.ebay.PayerInfoType cardOwner;

    private java.lang.String CVV2;

    private java.lang.Integer startMonth;

    private java.lang.Integer startYear;

    private java.lang.String issueNumber;

    private eBLBaseComponents.apis.ebay.ThreeDSecureRequestType threeDSecureRequest;

    public CreditCardDetailsType() {
    }

    public CreditCardDetailsType(
           eBLBaseComponents.apis.ebay.CreditCardTypeType creditCardType,
           java.lang.String creditCardNumber,
           java.lang.Integer expMonth,
           java.lang.Integer expYear,
           eBLBaseComponents.apis.ebay.PayerInfoType cardOwner,
           java.lang.String CVV2,
           java.lang.Integer startMonth,
           java.lang.Integer startYear,
           java.lang.String issueNumber,
           eBLBaseComponents.apis.ebay.ThreeDSecureRequestType threeDSecureRequest) {
           this.creditCardType = creditCardType;
           this.creditCardNumber = creditCardNumber;
           this.expMonth = expMonth;
           this.expYear = expYear;
           this.cardOwner = cardOwner;
           this.CVV2 = CVV2;
           this.startMonth = startMonth;
           this.startYear = startYear;
           this.issueNumber = issueNumber;
           this.threeDSecureRequest = threeDSecureRequest;
    }


    /**
     * Gets the creditCardType value for this CreditCardDetailsType.
     * 
     * @return creditCardType
     */
    public eBLBaseComponents.apis.ebay.CreditCardTypeType getCreditCardType() {
        return creditCardType;
    }


    /**
     * Sets the creditCardType value for this CreditCardDetailsType.
     * 
     * @param creditCardType
     */
    public void setCreditCardType(eBLBaseComponents.apis.ebay.CreditCardTypeType creditCardType) {
        this.creditCardType = creditCardType;
    }


    /**
     * Gets the creditCardNumber value for this CreditCardDetailsType.
     * 
     * @return creditCardNumber
     */
    public java.lang.String getCreditCardNumber() {
        return creditCardNumber;
    }


    /**
     * Sets the creditCardNumber value for this CreditCardDetailsType.
     * 
     * @param creditCardNumber
     */
    public void setCreditCardNumber(java.lang.String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }


    /**
     * Gets the expMonth value for this CreditCardDetailsType.
     * 
     * @return expMonth
     */
    public java.lang.Integer getExpMonth() {
        return expMonth;
    }


    /**
     * Sets the expMonth value for this CreditCardDetailsType.
     * 
     * @param expMonth
     */
    public void setExpMonth(java.lang.Integer expMonth) {
        this.expMonth = expMonth;
    }


    /**
     * Gets the expYear value for this CreditCardDetailsType.
     * 
     * @return expYear
     */
    public java.lang.Integer getExpYear() {
        return expYear;
    }


    /**
     * Sets the expYear value for this CreditCardDetailsType.
     * 
     * @param expYear
     */
    public void setExpYear(java.lang.Integer expYear) {
        this.expYear = expYear;
    }


    /**
     * Gets the cardOwner value for this CreditCardDetailsType.
     * 
     * @return cardOwner
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getCardOwner() {
        return cardOwner;
    }


    /**
     * Sets the cardOwner value for this CreditCardDetailsType.
     * 
     * @param cardOwner
     */
    public void setCardOwner(eBLBaseComponents.apis.ebay.PayerInfoType cardOwner) {
        this.cardOwner = cardOwner;
    }


    /**
     * Gets the CVV2 value for this CreditCardDetailsType.
     * 
     * @return CVV2
     */
    public java.lang.String getCVV2() {
        return CVV2;
    }


    /**
     * Sets the CVV2 value for this CreditCardDetailsType.
     * 
     * @param CVV2
     */
    public void setCVV2(java.lang.String CVV2) {
        this.CVV2 = CVV2;
    }


    /**
     * Gets the startMonth value for this CreditCardDetailsType.
     * 
     * @return startMonth
     */
    public java.lang.Integer getStartMonth() {
        return startMonth;
    }


    /**
     * Sets the startMonth value for this CreditCardDetailsType.
     * 
     * @param startMonth
     */
    public void setStartMonth(java.lang.Integer startMonth) {
        this.startMonth = startMonth;
    }


    /**
     * Gets the startYear value for this CreditCardDetailsType.
     * 
     * @return startYear
     */
    public java.lang.Integer getStartYear() {
        return startYear;
    }


    /**
     * Sets the startYear value for this CreditCardDetailsType.
     * 
     * @param startYear
     */
    public void setStartYear(java.lang.Integer startYear) {
        this.startYear = startYear;
    }


    /**
     * Gets the issueNumber value for this CreditCardDetailsType.
     * 
     * @return issueNumber
     */
    public java.lang.String getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this CreditCardDetailsType.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(java.lang.String issueNumber) {
        this.issueNumber = issueNumber;
    }


    /**
     * Gets the threeDSecureRequest value for this CreditCardDetailsType.
     * 
     * @return threeDSecureRequest
     */
    public eBLBaseComponents.apis.ebay.ThreeDSecureRequestType getThreeDSecureRequest() {
        return threeDSecureRequest;
    }


    /**
     * Sets the threeDSecureRequest value for this CreditCardDetailsType.
     * 
     * @param threeDSecureRequest
     */
    public void setThreeDSecureRequest(eBLBaseComponents.apis.ebay.ThreeDSecureRequestType threeDSecureRequest) {
        this.threeDSecureRequest = threeDSecureRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreditCardDetailsType)) return false;
        CreditCardDetailsType other = (CreditCardDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.creditCardType==null && other.getCreditCardType()==null) || 
             (this.creditCardType!=null &&
              this.creditCardType.equals(other.getCreditCardType()))) &&
            ((this.creditCardNumber==null && other.getCreditCardNumber()==null) || 
             (this.creditCardNumber!=null &&
              this.creditCardNumber.equals(other.getCreditCardNumber()))) &&
            ((this.expMonth==null && other.getExpMonth()==null) || 
             (this.expMonth!=null &&
              this.expMonth.equals(other.getExpMonth()))) &&
            ((this.expYear==null && other.getExpYear()==null) || 
             (this.expYear!=null &&
              this.expYear.equals(other.getExpYear()))) &&
            ((this.cardOwner==null && other.getCardOwner()==null) || 
             (this.cardOwner!=null &&
              this.cardOwner.equals(other.getCardOwner()))) &&
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
              this.issueNumber.equals(other.getIssueNumber()))) &&
            ((this.threeDSecureRequest==null && other.getThreeDSecureRequest()==null) || 
             (this.threeDSecureRequest!=null &&
              this.threeDSecureRequest.equals(other.getThreeDSecureRequest())));
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
        if (getCreditCardType() != null) {
            _hashCode += getCreditCardType().hashCode();
        }
        if (getCreditCardNumber() != null) {
            _hashCode += getCreditCardNumber().hashCode();
        }
        if (getExpMonth() != null) {
            _hashCode += getExpMonth().hashCode();
        }
        if (getExpYear() != null) {
            _hashCode += getExpYear().hashCode();
        }
        if (getCardOwner() != null) {
            _hashCode += getCardOwner().hashCode();
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
        if (getThreeDSecureRequest() != null) {
            _hashCode += getThreeDSecureRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditCardDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardTypeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreditCardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cardOwner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CardOwner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDSecureRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequestType"));
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
