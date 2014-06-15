/**
 * IncentiveBucketType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IncentiveBucketType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.IncentiveItemType[] items;

    private java.lang.String bucketId;

    private java.lang.String sellerId;

    private java.lang.String externalSellerId;

    private CoreComponentTypes.apis.ebay.BasicAmountType bucketSubtotalAmt;

    private CoreComponentTypes.apis.ebay.BasicAmountType bucketShippingAmt;

    private CoreComponentTypes.apis.ebay.BasicAmountType bucketInsuranceAmt;

    private CoreComponentTypes.apis.ebay.BasicAmountType bucketSalesTaxAmt;

    private CoreComponentTypes.apis.ebay.BasicAmountType bucketTotalAmt;

    public IncentiveBucketType() {
    }

    public IncentiveBucketType(
           eBLBaseComponents.apis.ebay.IncentiveItemType[] items,
           java.lang.String bucketId,
           java.lang.String sellerId,
           java.lang.String externalSellerId,
           CoreComponentTypes.apis.ebay.BasicAmountType bucketSubtotalAmt,
           CoreComponentTypes.apis.ebay.BasicAmountType bucketShippingAmt,
           CoreComponentTypes.apis.ebay.BasicAmountType bucketInsuranceAmt,
           CoreComponentTypes.apis.ebay.BasicAmountType bucketSalesTaxAmt,
           CoreComponentTypes.apis.ebay.BasicAmountType bucketTotalAmt) {
           this.items = items;
           this.bucketId = bucketId;
           this.sellerId = sellerId;
           this.externalSellerId = externalSellerId;
           this.bucketSubtotalAmt = bucketSubtotalAmt;
           this.bucketShippingAmt = bucketShippingAmt;
           this.bucketInsuranceAmt = bucketInsuranceAmt;
           this.bucketSalesTaxAmt = bucketSalesTaxAmt;
           this.bucketTotalAmt = bucketTotalAmt;
    }


    /**
     * Gets the items value for this IncentiveBucketType.
     * 
     * @return items
     */
    public eBLBaseComponents.apis.ebay.IncentiveItemType[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this IncentiveBucketType.
     * 
     * @param items
     */
    public void setItems(eBLBaseComponents.apis.ebay.IncentiveItemType[] items) {
        this.items = items;
    }

    public eBLBaseComponents.apis.ebay.IncentiveItemType getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, eBLBaseComponents.apis.ebay.IncentiveItemType _value) {
        this.items[i] = _value;
    }


    /**
     * Gets the bucketId value for this IncentiveBucketType.
     * 
     * @return bucketId
     */
    public java.lang.String getBucketId() {
        return bucketId;
    }


    /**
     * Sets the bucketId value for this IncentiveBucketType.
     * 
     * @param bucketId
     */
    public void setBucketId(java.lang.String bucketId) {
        this.bucketId = bucketId;
    }


    /**
     * Gets the sellerId value for this IncentiveBucketType.
     * 
     * @return sellerId
     */
    public java.lang.String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this IncentiveBucketType.
     * 
     * @param sellerId
     */
    public void setSellerId(java.lang.String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the externalSellerId value for this IncentiveBucketType.
     * 
     * @return externalSellerId
     */
    public java.lang.String getExternalSellerId() {
        return externalSellerId;
    }


    /**
     * Sets the externalSellerId value for this IncentiveBucketType.
     * 
     * @param externalSellerId
     */
    public void setExternalSellerId(java.lang.String externalSellerId) {
        this.externalSellerId = externalSellerId;
    }


    /**
     * Gets the bucketSubtotalAmt value for this IncentiveBucketType.
     * 
     * @return bucketSubtotalAmt
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBucketSubtotalAmt() {
        return bucketSubtotalAmt;
    }


    /**
     * Sets the bucketSubtotalAmt value for this IncentiveBucketType.
     * 
     * @param bucketSubtotalAmt
     */
    public void setBucketSubtotalAmt(CoreComponentTypes.apis.ebay.BasicAmountType bucketSubtotalAmt) {
        this.bucketSubtotalAmt = bucketSubtotalAmt;
    }


    /**
     * Gets the bucketShippingAmt value for this IncentiveBucketType.
     * 
     * @return bucketShippingAmt
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBucketShippingAmt() {
        return bucketShippingAmt;
    }


    /**
     * Sets the bucketShippingAmt value for this IncentiveBucketType.
     * 
     * @param bucketShippingAmt
     */
    public void setBucketShippingAmt(CoreComponentTypes.apis.ebay.BasicAmountType bucketShippingAmt) {
        this.bucketShippingAmt = bucketShippingAmt;
    }


    /**
     * Gets the bucketInsuranceAmt value for this IncentiveBucketType.
     * 
     * @return bucketInsuranceAmt
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBucketInsuranceAmt() {
        return bucketInsuranceAmt;
    }


    /**
     * Sets the bucketInsuranceAmt value for this IncentiveBucketType.
     * 
     * @param bucketInsuranceAmt
     */
    public void setBucketInsuranceAmt(CoreComponentTypes.apis.ebay.BasicAmountType bucketInsuranceAmt) {
        this.bucketInsuranceAmt = bucketInsuranceAmt;
    }


    /**
     * Gets the bucketSalesTaxAmt value for this IncentiveBucketType.
     * 
     * @return bucketSalesTaxAmt
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBucketSalesTaxAmt() {
        return bucketSalesTaxAmt;
    }


    /**
     * Sets the bucketSalesTaxAmt value for this IncentiveBucketType.
     * 
     * @param bucketSalesTaxAmt
     */
    public void setBucketSalesTaxAmt(CoreComponentTypes.apis.ebay.BasicAmountType bucketSalesTaxAmt) {
        this.bucketSalesTaxAmt = bucketSalesTaxAmt;
    }


    /**
     * Gets the bucketTotalAmt value for this IncentiveBucketType.
     * 
     * @return bucketTotalAmt
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getBucketTotalAmt() {
        return bucketTotalAmt;
    }


    /**
     * Sets the bucketTotalAmt value for this IncentiveBucketType.
     * 
     * @param bucketTotalAmt
     */
    public void setBucketTotalAmt(CoreComponentTypes.apis.ebay.BasicAmountType bucketTotalAmt) {
        this.bucketTotalAmt = bucketTotalAmt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveBucketType)) return false;
        IncentiveBucketType other = (IncentiveBucketType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.bucketId==null && other.getBucketId()==null) || 
             (this.bucketId!=null &&
              this.bucketId.equals(other.getBucketId()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            ((this.externalSellerId==null && other.getExternalSellerId()==null) || 
             (this.externalSellerId!=null &&
              this.externalSellerId.equals(other.getExternalSellerId()))) &&
            ((this.bucketSubtotalAmt==null && other.getBucketSubtotalAmt()==null) || 
             (this.bucketSubtotalAmt!=null &&
              this.bucketSubtotalAmt.equals(other.getBucketSubtotalAmt()))) &&
            ((this.bucketShippingAmt==null && other.getBucketShippingAmt()==null) || 
             (this.bucketShippingAmt!=null &&
              this.bucketShippingAmt.equals(other.getBucketShippingAmt()))) &&
            ((this.bucketInsuranceAmt==null && other.getBucketInsuranceAmt()==null) || 
             (this.bucketInsuranceAmt!=null &&
              this.bucketInsuranceAmt.equals(other.getBucketInsuranceAmt()))) &&
            ((this.bucketSalesTaxAmt==null && other.getBucketSalesTaxAmt()==null) || 
             (this.bucketSalesTaxAmt!=null &&
              this.bucketSalesTaxAmt.equals(other.getBucketSalesTaxAmt()))) &&
            ((this.bucketTotalAmt==null && other.getBucketTotalAmt()==null) || 
             (this.bucketTotalAmt!=null &&
              this.bucketTotalAmt.equals(other.getBucketTotalAmt())));
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
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBucketId() != null) {
            _hashCode += getBucketId().hashCode();
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getExternalSellerId() != null) {
            _hashCode += getExternalSellerId().hashCode();
        }
        if (getBucketSubtotalAmt() != null) {
            _hashCode += getBucketSubtotalAmt().hashCode();
        }
        if (getBucketShippingAmt() != null) {
            _hashCode += getBucketShippingAmt().hashCode();
        }
        if (getBucketInsuranceAmt() != null) {
            _hashCode += getBucketInsuranceAmt().hashCode();
        }
        if (getBucketSalesTaxAmt() != null) {
            _hashCode += getBucketSalesTaxAmt().hashCode();
        }
        if (getBucketTotalAmt() != null) {
            _hashCode += getBucketTotalAmt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveBucketType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveBucketType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Items"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalSellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketSubtotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketSubtotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketShippingAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketShippingAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketInsuranceAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketInsuranceAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketSalesTaxAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketSalesTaxAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bucketTotalAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BucketTotalAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
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
