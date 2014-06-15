/**
 * IncentiveAppliedToType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IncentiveAppliedToType  implements java.io.Serializable {
    private java.lang.String bucketId;

    private java.lang.String itemId;

    private CoreComponentTypes.apis.ebay.BasicAmountType incentiveAmount;

    private java.lang.String subType;

    public IncentiveAppliedToType() {
    }

    public IncentiveAppliedToType(
           java.lang.String bucketId,
           java.lang.String itemId,
           CoreComponentTypes.apis.ebay.BasicAmountType incentiveAmount,
           java.lang.String subType) {
           this.bucketId = bucketId;
           this.itemId = itemId;
           this.incentiveAmount = incentiveAmount;
           this.subType = subType;
    }


    /**
     * Gets the bucketId value for this IncentiveAppliedToType.
     * 
     * @return bucketId
     */
    public java.lang.String getBucketId() {
        return bucketId;
    }


    /**
     * Sets the bucketId value for this IncentiveAppliedToType.
     * 
     * @param bucketId
     */
    public void setBucketId(java.lang.String bucketId) {
        this.bucketId = bucketId;
    }


    /**
     * Gets the itemId value for this IncentiveAppliedToType.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this IncentiveAppliedToType.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the incentiveAmount value for this IncentiveAppliedToType.
     * 
     * @return incentiveAmount
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getIncentiveAmount() {
        return incentiveAmount;
    }


    /**
     * Sets the incentiveAmount value for this IncentiveAppliedToType.
     * 
     * @param incentiveAmount
     */
    public void setIncentiveAmount(CoreComponentTypes.apis.ebay.BasicAmountType incentiveAmount) {
        this.incentiveAmount = incentiveAmount;
    }


    /**
     * Gets the subType value for this IncentiveAppliedToType.
     * 
     * @return subType
     */
    public java.lang.String getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this IncentiveAppliedToType.
     * 
     * @param subType
     */
    public void setSubType(java.lang.String subType) {
        this.subType = subType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveAppliedToType)) return false;
        IncentiveAppliedToType other = (IncentiveAppliedToType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bucketId==null && other.getBucketId()==null) || 
             (this.bucketId!=null &&
              this.bucketId.equals(other.getBucketId()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.incentiveAmount==null && other.getIncentiveAmount()==null) || 
             (this.incentiveAmount!=null &&
              this.incentiveAmount.equals(other.getIncentiveAmount()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType())));
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
        if (getBucketId() != null) {
            _hashCode += getBucketId().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getIncentiveAmount() != null) {
            _hashCode += getIncentiveAmount().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveAppliedToType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAppliedToType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incentiveAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SubType"));
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
