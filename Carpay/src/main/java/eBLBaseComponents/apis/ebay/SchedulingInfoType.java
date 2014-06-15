/**
 * SchedulingInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains information for Scheduling limits for the user. All dtails
 * must be present,unless we will have revise call one day,
 *                        just in case we might let's make min occur
 * = 0
 */
public class SchedulingInfoType  implements java.io.Serializable {
    private java.lang.Integer maxScheduledMinutes;

    private java.lang.Integer minScheduledMinutes;

    private java.lang.Integer maxScheduledItems;

    public SchedulingInfoType() {
    }

    public SchedulingInfoType(
           java.lang.Integer maxScheduledMinutes,
           java.lang.Integer minScheduledMinutes,
           java.lang.Integer maxScheduledItems) {
           this.maxScheduledMinutes = maxScheduledMinutes;
           this.minScheduledMinutes = minScheduledMinutes;
           this.maxScheduledItems = maxScheduledItems;
    }


    /**
     * Gets the maxScheduledMinutes value for this SchedulingInfoType.
     * 
     * @return maxScheduledMinutes
     */
    public java.lang.Integer getMaxScheduledMinutes() {
        return maxScheduledMinutes;
    }


    /**
     * Sets the maxScheduledMinutes value for this SchedulingInfoType.
     * 
     * @param maxScheduledMinutes
     */
    public void setMaxScheduledMinutes(java.lang.Integer maxScheduledMinutes) {
        this.maxScheduledMinutes = maxScheduledMinutes;
    }


    /**
     * Gets the minScheduledMinutes value for this SchedulingInfoType.
     * 
     * @return minScheduledMinutes
     */
    public java.lang.Integer getMinScheduledMinutes() {
        return minScheduledMinutes;
    }


    /**
     * Sets the minScheduledMinutes value for this SchedulingInfoType.
     * 
     * @param minScheduledMinutes
     */
    public void setMinScheduledMinutes(java.lang.Integer minScheduledMinutes) {
        this.minScheduledMinutes = minScheduledMinutes;
    }


    /**
     * Gets the maxScheduledItems value for this SchedulingInfoType.
     * 
     * @return maxScheduledItems
     */
    public java.lang.Integer getMaxScheduledItems() {
        return maxScheduledItems;
    }


    /**
     * Sets the maxScheduledItems value for this SchedulingInfoType.
     * 
     * @param maxScheduledItems
     */
    public void setMaxScheduledItems(java.lang.Integer maxScheduledItems) {
        this.maxScheduledItems = maxScheduledItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulingInfoType)) return false;
        SchedulingInfoType other = (SchedulingInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.maxScheduledMinutes==null && other.getMaxScheduledMinutes()==null) || 
             (this.maxScheduledMinutes!=null &&
              this.maxScheduledMinutes.equals(other.getMaxScheduledMinutes()))) &&
            ((this.minScheduledMinutes==null && other.getMinScheduledMinutes()==null) || 
             (this.minScheduledMinutes!=null &&
              this.minScheduledMinutes.equals(other.getMinScheduledMinutes()))) &&
            ((this.maxScheduledItems==null && other.getMaxScheduledItems()==null) || 
             (this.maxScheduledItems!=null &&
              this.maxScheduledItems.equals(other.getMaxScheduledItems())));
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
        if (getMaxScheduledMinutes() != null) {
            _hashCode += getMaxScheduledMinutes().hashCode();
        }
        if (getMinScheduledMinutes() != null) {
            _hashCode += getMinScheduledMinutes().hashCode();
        }
        if (getMaxScheduledItems() != null) {
            _hashCode += getMaxScheduledItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SchedulingInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SchedulingInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxScheduledMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxScheduledMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minScheduledMinutes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MinScheduledMinutes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxScheduledItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MaxScheduledItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
