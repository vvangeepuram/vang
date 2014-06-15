/**
 * OrderDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class OrderDetailsType  implements java.io.Serializable {
    /* Description of the Order. */
    private java.lang.String description;

    /* Expected maximum amount that the merchant may pull using DoReferenceTransaction */
    private CoreComponentTypes.apis.ebay.BasicAmountType maxAmount;

    public OrderDetailsType() {
    }

    public OrderDetailsType(
           java.lang.String description,
           CoreComponentTypes.apis.ebay.BasicAmountType maxAmount) {
           this.description = description;
           this.maxAmount = maxAmount;
    }


    /**
     * Gets the description value for this OrderDetailsType.
     * 
     * @return description   * Description of the Order.
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OrderDetailsType.
     * 
     * @param description   * Description of the Order.
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the maxAmount value for this OrderDetailsType.
     * 
     * @return maxAmount   * Expected maximum amount that the merchant may pull using DoReferenceTransaction
     */
    public CoreComponentTypes.apis.ebay.BasicAmountType getMaxAmount() {
        return maxAmount;
    }


    /**
     * Sets the maxAmount value for this OrderDetailsType.
     * 
     * @param maxAmount   * Expected maximum amount that the merchant may pull using DoReferenceTransaction
     */
    public void setMaxAmount(CoreComponentTypes.apis.ebay.BasicAmountType maxAmount) {
        this.maxAmount = maxAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDetailsType)) return false;
        OrderDetailsType other = (OrderDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.maxAmount==null && other.getMaxAmount()==null) || 
             (this.maxAmount!=null &&
              this.maxAmount.equals(other.getMaxAmount())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMaxAmount() != null) {
            _hashCode += getMaxAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OrderDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxAmount"));
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
