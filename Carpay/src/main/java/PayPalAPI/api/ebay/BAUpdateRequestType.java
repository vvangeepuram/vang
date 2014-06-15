/**
 * BAUpdateRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BAUpdateRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private java.lang.String referenceID;

    private java.lang.String billingAgreementDescription;

    private eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType billingAgreementStatus;

    private java.lang.String billingAgreementCustom;

    public BAUpdateRequestType() {
    }

    public BAUpdateRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String referenceID,
           java.lang.String billingAgreementDescription,
           eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType billingAgreementStatus,
           java.lang.String billingAgreementCustom) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.referenceID = referenceID;
        this.billingAgreementDescription = billingAgreementDescription;
        this.billingAgreementStatus = billingAgreementStatus;
        this.billingAgreementCustom = billingAgreementCustom;
    }


    /**
     * Gets the referenceID value for this BAUpdateRequestType.
     * 
     * @return referenceID
     */
    public java.lang.String getReferenceID() {
        return referenceID;
    }


    /**
     * Sets the referenceID value for this BAUpdateRequestType.
     * 
     * @param referenceID
     */
    public void setReferenceID(java.lang.String referenceID) {
        this.referenceID = referenceID;
    }


    /**
     * Gets the billingAgreementDescription value for this BAUpdateRequestType.
     * 
     * @return billingAgreementDescription
     */
    public java.lang.String getBillingAgreementDescription() {
        return billingAgreementDescription;
    }


    /**
     * Sets the billingAgreementDescription value for this BAUpdateRequestType.
     * 
     * @param billingAgreementDescription
     */
    public void setBillingAgreementDescription(java.lang.String billingAgreementDescription) {
        this.billingAgreementDescription = billingAgreementDescription;
    }


    /**
     * Gets the billingAgreementStatus value for this BAUpdateRequestType.
     * 
     * @return billingAgreementStatus
     */
    public eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType getBillingAgreementStatus() {
        return billingAgreementStatus;
    }


    /**
     * Sets the billingAgreementStatus value for this BAUpdateRequestType.
     * 
     * @param billingAgreementStatus
     */
    public void setBillingAgreementStatus(eBLBaseComponents.apis.ebay.MerchantPullStatusCodeType billingAgreementStatus) {
        this.billingAgreementStatus = billingAgreementStatus;
    }


    /**
     * Gets the billingAgreementCustom value for this BAUpdateRequestType.
     * 
     * @return billingAgreementCustom
     */
    public java.lang.String getBillingAgreementCustom() {
        return billingAgreementCustom;
    }


    /**
     * Sets the billingAgreementCustom value for this BAUpdateRequestType.
     * 
     * @param billingAgreementCustom
     */
    public void setBillingAgreementCustom(java.lang.String billingAgreementCustom) {
        this.billingAgreementCustom = billingAgreementCustom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BAUpdateRequestType)) return false;
        BAUpdateRequestType other = (BAUpdateRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.referenceID==null && other.getReferenceID()==null) || 
             (this.referenceID!=null &&
              this.referenceID.equals(other.getReferenceID()))) &&
            ((this.billingAgreementDescription==null && other.getBillingAgreementDescription()==null) || 
             (this.billingAgreementDescription!=null &&
              this.billingAgreementDescription.equals(other.getBillingAgreementDescription()))) &&
            ((this.billingAgreementStatus==null && other.getBillingAgreementStatus()==null) || 
             (this.billingAgreementStatus!=null &&
              this.billingAgreementStatus.equals(other.getBillingAgreementStatus()))) &&
            ((this.billingAgreementCustom==null && other.getBillingAgreementCustom()==null) || 
             (this.billingAgreementCustom!=null &&
              this.billingAgreementCustom.equals(other.getBillingAgreementCustom())));
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
        if (getReferenceID() != null) {
            _hashCode += getReferenceID().hashCode();
        }
        if (getBillingAgreementDescription() != null) {
            _hashCode += getBillingAgreementDescription().hashCode();
        }
        if (getBillingAgreementStatus() != null) {
            _hashCode += getBillingAgreementStatus().hashCode();
        }
        if (getBillingAgreementCustom() != null) {
            _hashCode += getBillingAgreementCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BAUpdateRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BAUpdateRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReferenceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillingAgreementDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillingAgreementStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullStatusCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAgreementCustom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillingAgreementCustom"));
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
