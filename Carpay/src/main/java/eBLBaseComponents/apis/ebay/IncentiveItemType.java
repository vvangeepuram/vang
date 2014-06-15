/**
 * IncentiveItemType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class IncentiveItemType  implements java.io.Serializable {
    private java.lang.String itemId;

    private java.util.Calendar purchaseTime;

    private java.lang.String itemCategoryList;

    private CoreComponentTypes.apis.ebay.BasicAmountType itemPrice;

    private java.math.BigInteger itemQuantity;

    public IncentiveItemType() {
    }

    public IncentiveItemType(
           java.lang.String itemId,
           java.util.Calendar purchaseTime,
           java.lang.String itemCategoryList,
           CoreComponentTypes.apis.ebay.BasicAmountType itemPrice,
           java.math.BigInteger itemQuantity) {
           this.itemId = itemId;
           this.purchaseTime = purchaseTime;
           this.itemCategoryList = itemCategoryList;
           this.itemPrice = itemPrice;
           this.itemQuantity = itemQuantity;
    }


    /**
     * Gets the itemId value for this IncentiveItemType.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this IncentiveItemType.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the purchaseTime value for this IncentiveItemType.
     * 
     * @return purchaseTime
     */
    public java.util.Calendar getPurchaseTime() {
        return purchaseTime;
    }


    /**
     * Sets the purchaseTime value for this IncentiveItemType.
     * 
     * @param purchaseTime
     */
    public void setPurchaseTime(java.util.Calendar purchaseTime) {
        this.purchaseTime = purchaseTime;
    }


    /**
     * Gets the itemCategoryList value for this IncentiveItemType.
     * 
     * @return itemCategoryList
     */
    public java.lang.String getItemCategoryList() {
        return itemCategoryList;
    }


    /**
     * Sets the itemCategoryList value for this IncentiveItemType.
     * 
     * @param itemCategoryList
     */
    public void setItemCategoryList(java.lang.String itemCategoryList) {
        this.itemCategoryList = itemCategoryList;
    }


    /**
     * Gets the itemPrice value for this IncentiveItemType.
     * 
     * @return itemPrice
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getItemPrice() {
        return itemPrice;
    }


    /**
     * Sets the itemPrice value for this IncentiveItemType.
     * 
     * @param itemPrice
     */
    public void setItemPrice(CoreComponentTypes.apis.ebay.BasicAmountType itemPrice) {
        this.itemPrice = itemPrice;
    }


    /**
     * Gets the itemQuantity value for this IncentiveItemType.
     * 
     * @return itemQuantity
     */
    public java.math.BigInteger getItemQuantity() {
        return itemQuantity;
    }


    /**
     * Sets the itemQuantity value for this IncentiveItemType.
     * 
     * @param itemQuantity
     */
    public void setItemQuantity(java.math.BigInteger itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IncentiveItemType)) return false;
        IncentiveItemType other = (IncentiveItemType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.purchaseTime==null && other.getPurchaseTime()==null) || 
             (this.purchaseTime!=null &&
              this.purchaseTime.equals(other.getPurchaseTime()))) &&
            ((this.itemCategoryList==null && other.getItemCategoryList()==null) || 
             (this.itemCategoryList!=null &&
              this.itemCategoryList.equals(other.getItemCategoryList()))) &&
            ((this.itemPrice==null && other.getItemPrice()==null) || 
             (this.itemPrice!=null &&
              this.itemPrice.equals(other.getItemPrice()))) &&
            ((this.itemQuantity==null && other.getItemQuantity()==null) || 
             (this.itemQuantity!=null &&
              this.itemQuantity.equals(other.getItemQuantity())));
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
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getPurchaseTime() != null) {
            _hashCode += getPurchaseTime().hashCode();
        }
        if (getItemCategoryList() != null) {
            _hashCode += getItemCategoryList().hashCode();
        }
        if (getItemPrice() != null) {
            _hashCode += getItemPrice().hashCode();
        }
        if (getItemQuantity() != null) {
            _hashCode += getItemQuantity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IncentiveItemType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IncentiveItemType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PurchaseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCategoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCategoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:CoreComponentTypes", "BasicAmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
