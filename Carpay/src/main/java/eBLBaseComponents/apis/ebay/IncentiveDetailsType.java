/**
 * IncentiveDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Information about the incentives that were applied from Ebay RYP
 * page and PayPal RYP page.
 */
public class IncentiveDetailsType  implements java.io.Serializable {
    /* Unique Identifier consisting of redemption code, user friendly
     * descripotion, incentive type, campaign code, incenitve application
     * order and site redeemed o
     * n. */
    private java.lang.String uniqueIdentifier;

    /* Defines if the incentive has been applied on Ebay or PayPal. */
    private eBLBaseComponents.apis.ebay.IncentiveSiteAppliedOnType siteAppliedOn;

    /* The total discount amount for the incentive, summation of discounts
     * up across all the buckets/items. */
    private CoreComponentTypes.apis.ebay.BasicAmountType totalDiscountAmount;

    /* Status of incentive processing. Sussess or Error. */
    private eBLBaseComponents.apis.ebay.IncentiveAppliedStatusType status;

    /* Error code if there are any errors. Zero otherwise. */
    private java.math.BigInteger errorCode;

    /* Details of incentive application on individual bucket/item. */
    private eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType[] incentiveAppliedDetails;

    public IncentiveDetailsType() {
    }

    public IncentiveDetailsType(
           java.lang.String uniqueIdentifier,
           eBLBaseComponents.apis.ebay.IncentiveSiteAppliedOnType siteAppliedOn,
           CoreComponentTypes.apis.ebay.BasicAmountType totalDiscountAmount,
           eBLBaseComponents.apis.ebay.IncentiveAppliedStatusType status,
           java.math.BigInteger errorCode,
           eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType[] incentiveAppliedDetails) {
           this.uniqueIdentifier = uniqueIdentifier;
           this.siteAppliedOn = siteAppliedOn;
           this.totalDiscountAmount = totalDiscountAmount;
           this.status = status;
           this.errorCode = errorCode;
           this.incentiveAppliedDetails = incentiveAppliedDetails;
    }


    /**
     * Gets the uniqueIdentifier value for this IncentiveDetailsType.
     * 
     * @return uniqueIdentifier   * Unique Identifier consisting of redemption code, user friendly
     * descripotion, incentive type, campaign code, incenitve application
     * order and site redeemed o
     * n.
     */
    public java.lang.String getUniqueIdentifier() {
        return uniqueIdentifier;
    }


    /**
     * Sets the uniqueIdentifier value for this IncentiveDetailsType.
     * 
     * @param uniqueIdentifier   * Unique Identifier consisting of redemption code, user friendly
     * descripotion, incentive type, campaign code, incenitve application
     * order and site redeemed o
     * n.
     */
    public void setUniqueIdentifier(java.lang.String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
    }


    /**
     * Gets the siteAppliedOn value for this IncentiveDetailsType.
     * 
     * @return siteAppliedOn   * Defines if the incentive has been applied on Ebay or PayPal.
     */
    public eBLBaseComponents.apis.ebay.IncentiveSiteAppliedOnType getSiteAppliedOn() {
        return siteAppliedOn;
    }


    /**
     * Sets the siteAppliedOn value for this IncentiveDetailsType.
     * 
     * @param siteAppliedOn   * Defines if the incentive has been applied on Ebay or PayPal.
     */
    public void setSiteAppliedOn(eBLBaseComponents.apis.ebay.IncentiveSiteAppliedOnType siteAppliedOn) {
        this.siteAppliedOn = siteAppliedOn;
    }


    /**
     * Gets the totalDiscountAmount value for this IncentiveDetailsType.
     * 
     * @return totalDiscountAmount   * The total discount amount for the incentive, summation of discounts
     * up across all the buckets/items.
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getTotalDiscountAmount() {
        return totalDiscountAmount;
    }


    /**
     * Sets the totalDiscountAmount value for this IncentiveDetailsType.
     * 
     * @param totalDiscountAmount   * The total discount amount for the incentive, summation of discounts
     * up across all the buckets/items.
     */
    public void setTotalDiscountAmount(CoreComponentTypes.apis.ebay.BasicAmountType totalDiscountAmount) {
        this.totalDiscountAmount = totalDiscountAmount;
    }


    /**
     * Gets the status value for this IncentiveDetailsType.
     * 
     * @return status   * Status of incentive processing. Sussess or Error.
     */
    public eBLBaseComponents.apis.ebay.IncentiveAppliedStatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this IncentiveDetailsType.
     * 
     * @param status   * Status of incentive processing. Sussess or Error.
     */
    public void setStatus(eBLBaseComponents.apis.ebay.IncentiveAppliedStatusType status) {
        this.status = status;
    }


    /**
     * Gets the errorCode value for this IncentiveDetailsType.
     * 
     * @return errorCode   * Error code if there are any errors. Zero otherwise.
     */
    public java.math.BigInteger getErrorCode() {
        return errorCode;
    }


    /**
     * Sets the errorCode value for this IncentiveDetailsType.
     * 
     * @param errorCode   * Error code if there are any errors. Zero otherwise.
     */
    public void setErrorCode(java.math.BigInteger errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Gets the incentiveAppliedDetails value for this IncentiveDetailsType.
     * 
     * @return incentiveAppliedDetails   * Details of incentive application on individual bucket/item.
     */
    public eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType[] getIncentiveAppliedDetails() {
        return incentiveAppliedDetails;
    }


    /**
     * Sets the incentiveAppliedDetails value for this IncentiveDetailsType.
     * 
     * @param incentiveAppliedDetails   * Details of incentive application on individual bucket/item.
     */
    public void setIncentiveAppliedDetails(eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType[] incentiveAppliedDetails) {
        this.incentiveAppliedDetails = incentiveAppliedDetails;
    }

    public eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType getIncentiveAppliedDetails(int i) {
        return this.incentiveAppliedDetails[i];
    }

    public void setIncentiveAppliedDetails(int i, eBLBaseComponents.apis.ebay.IncentiveAppliedDetailsType _value) {
        this.incentiveAppliedDetails[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveDetailsType)) return false;
        IncentiveDetailsType other = (IncentiveDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uniqueIdentifier==null && other.getUniqueIdentifier()==null) || 
             (this.uniqueIdentifier!=null &&
              this.uniqueIdentifier.equals(other.getUniqueIdentifier()))) &&
            ((this.siteAppliedOn==null && other.getSiteAppliedOn()==null) || 
             (this.siteAppliedOn!=null &&
              this.siteAppliedOn.equals(other.getSiteAppliedOn()))) &&
            ((this.totalDiscountAmount==null && other.getTotalDiscountAmount()==null) || 
             (this.totalDiscountAmount!=null &&
              this.totalDiscountAmount.equals(other.getTotalDiscountAmount()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.errorCode==null && other.getErrorCode()==null) || 
             (this.errorCode!=null &&
              this.errorCode.equals(other.getErrorCode()))) &&
            ((this.incentiveAppliedDetails==null && other.getIncentiveAppliedDetails()==null) || 
             (this.incentiveAppliedDetails!=null &&
              java.util.Arrays.equals(this.incentiveAppliedDetails, other.getIncentiveAppliedDetails())));
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
        if (getUniqueIdentifier() != null) {
            _hashCode += getUniqueIdentifier().hashCode();
        }
        if (getSiteAppliedOn() != null) {
            _hashCode += getSiteAppliedOn().hashCode();
        }
        if (getTotalDiscountAmount() != null) {
            _hashCode += getTotalDiscountAmount().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getErrorCode() != null) {
            _hashCode += getErrorCode().hashCode();
        }
        if (getIncentiveAppliedDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncentiveAppliedDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncentiveAppliedDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UniqueIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteAppliedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SiteAppliedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveSiteAppliedOnType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDiscountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TotalDiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedStatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ErrorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveAppliedDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedDetailsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
