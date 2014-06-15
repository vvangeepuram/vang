/**
 * ItemTrackingDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ItemTrackingDetailsType  implements java.io.Serializable {
    /* Item Number. */
    private java.lang.String itemNumber;

    /* Option Quantity. */
    private java.lang.String itemQty;

    /* Item Quantity Delta. */
    private java.lang.String itemQtyDelta;

    /* Item Alert. */
    private java.lang.String itemAlert;

    /* Item Cost. */
    private java.lang.String itemCost;

    public ItemTrackingDetailsType() {
    }

    public ItemTrackingDetailsType(
           java.lang.String itemNumber,
           java.lang.String itemQty,
           java.lang.String itemQtyDelta,
           java.lang.String itemAlert,
           java.lang.String itemCost) {
           this.itemNumber = itemNumber;
           this.itemQty = itemQty;
           this.itemQtyDelta = itemQtyDelta;
           this.itemAlert = itemAlert;
           this.itemCost = itemCost;
    }


    /**
     * Gets the itemNumber value for this ItemTrackingDetailsType.
     * 
     * @return itemNumber   * Item Number.
     */
    public java.lang.String getItemNumber() {
        return itemNumber;
    }


    /**
     * Sets the itemNumber value for this ItemTrackingDetailsType.
     * 
     * @param itemNumber   * Item Number.
     */
    public void setItemNumber(java.lang.String itemNumber) {
        this.itemNumber = itemNumber;
    }


    /**
     * Gets the itemQty value for this ItemTrackingDetailsType.
     * 
     * @return itemQty   * Option Quantity.
     */
    public java.lang.String getItemQty() {
        return itemQty;
    }


    /**
     * Sets the itemQty value for this ItemTrackingDetailsType.
     * 
     * @param itemQty   * Option Quantity.
     */
    public void setItemQty(java.lang.String itemQty) {
        this.itemQty = itemQty;
    }


    /**
     * Gets the itemQtyDelta value for this ItemTrackingDetailsType.
     * 
     * @return itemQtyDelta   * Item Quantity Delta.
     */
    public java.lang.String getItemQtyDelta() {
        return itemQtyDelta;
    }


    /**
     * Sets the itemQtyDelta value for this ItemTrackingDetailsType.
     * 
     * @param itemQtyDelta   * Item Quantity Delta.
     */
    public void setItemQtyDelta(java.lang.String itemQtyDelta) {
        this.itemQtyDelta = itemQtyDelta;
    }


    /**
     * Gets the itemAlert value for this ItemTrackingDetailsType.
     * 
     * @return itemAlert   * Item Alert.
     */
    public java.lang.String getItemAlert() {
        return itemAlert;
    }


    /**
     * Sets the itemAlert value for this ItemTrackingDetailsType.
     * 
     * @param itemAlert   * Item Alert.
     */
    public void setItemAlert(java.lang.String itemAlert) {
        this.itemAlert = itemAlert;
    }


    /**
     * Gets the itemCost value for this ItemTrackingDetailsType.
     * 
     * @return itemCost   * Item Cost.
     */
    public java.lang.String getItemCost() {
        return itemCost;
    }


    /**
     * Sets the itemCost value for this ItemTrackingDetailsType.
     * 
     * @param itemCost   * Item Cost.
     */
    public void setItemCost(java.lang.String itemCost) {
        this.itemCost = itemCost;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemTrackingDetailsType)) return false;
        ItemTrackingDetailsType other = (ItemTrackingDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemNumber==null && other.getItemNumber()==null) || 
             (this.itemNumber!=null &&
              this.itemNumber.equals(other.getItemNumber()))) &&
            ((this.itemQty==null && other.getItemQty()==null) || 
             (this.itemQty!=null &&
              this.itemQty.equals(other.getItemQty()))) &&
            ((this.itemQtyDelta==null && other.getItemQtyDelta()==null) || 
             (this.itemQtyDelta!=null &&
              this.itemQtyDelta.equals(other.getItemQtyDelta()))) &&
            ((this.itemAlert==null && other.getItemAlert()==null) || 
             (this.itemAlert!=null &&
              this.itemAlert.equals(other.getItemAlert()))) &&
            ((this.itemCost==null && other.getItemCost()==null) || 
             (this.itemCost!=null &&
              this.itemCost.equals(other.getItemCost())));
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
        if (getItemNumber() != null) {
            _hashCode += getItemNumber().hashCode();
        }
        if (getItemQty() != null) {
            _hashCode += getItemQty().hashCode();
        }
        if (getItemQtyDelta() != null) {
            _hashCode += getItemQtyDelta().hashCode();
        }
        if (getItemAlert() != null) {
            _hashCode += getItemAlert().hashCode();
        }
        if (getItemCost() != null) {
            _hashCode += getItemCost().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemTrackingDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemTrackingDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemQtyDelta");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemQtyDelta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAlert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemAlert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemCost"));
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
