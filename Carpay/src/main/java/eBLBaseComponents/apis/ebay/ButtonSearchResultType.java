/**
 * ButtonSearchResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ButtonSearchResultType  implements java.io.Serializable {
    private java.lang.String hostedButtonID;

    private java.lang.String buttonType;

    private java.lang.String itemName;

    private java.util.Calendar modifyDate;

    public ButtonSearchResultType() {
    }

    public ButtonSearchResultType(
           java.lang.String hostedButtonID,
           java.lang.String buttonType,
           java.lang.String itemName,
           java.util.Calendar modifyDate) {
           this.hostedButtonID = hostedButtonID;
           this.buttonType = buttonType;
           this.itemName = itemName;
           this.modifyDate = modifyDate;
    }


    /**
     * Gets the hostedButtonID value for this ButtonSearchResultType.
     * 
     * @return hostedButtonID
     */
    public java.lang.String getHostedButtonID() {
        return hostedButtonID;
    }


    /**
     * Sets the hostedButtonID value for this ButtonSearchResultType.
     * 
     * @param hostedButtonID
     */
    public void setHostedButtonID(java.lang.String hostedButtonID) {
        this.hostedButtonID = hostedButtonID;
    }


    /**
     * Gets the buttonType value for this ButtonSearchResultType.
     * 
     * @return buttonType
     */
    public java.lang.String getButtonType() {
        return buttonType;
    }


    /**
     * Sets the buttonType value for this ButtonSearchResultType.
     * 
     * @param buttonType
     */
    public void setButtonType(java.lang.String buttonType) {
        this.buttonType = buttonType;
    }


    /**
     * Gets the itemName value for this ButtonSearchResultType.
     * 
     * @return itemName
     */
    public java.lang.String getItemName() {
        return itemName;
    }


    /**
     * Sets the itemName value for this ButtonSearchResultType.
     * 
     * @param itemName
     */
    public void setItemName(java.lang.String itemName) {
        this.itemName = itemName;
    }


    /**
     * Gets the modifyDate value for this ButtonSearchResultType.
     * 
     * @return modifyDate
     */
    public java.util.Calendar getModifyDate() {
        return modifyDate;
    }


    /**
     * Sets the modifyDate value for this ButtonSearchResultType.
     * 
     * @param modifyDate
     */
    public void setModifyDate(java.util.Calendar modifyDate) {
        this.modifyDate = modifyDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ButtonSearchResultType)) return false;
        ButtonSearchResultType other = (ButtonSearchResultType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostedButtonID==null && other.getHostedButtonID()==null) || 
             (this.hostedButtonID!=null &&
              this.hostedButtonID.equals(other.getHostedButtonID()))) &&
            ((this.buttonType==null && other.getButtonType()==null) || 
             (this.buttonType!=null &&
              this.buttonType.equals(other.getButtonType()))) &&
            ((this.itemName==null && other.getItemName()==null) || 
             (this.itemName!=null &&
              this.itemName.equals(other.getItemName()))) &&
            ((this.modifyDate==null && other.getModifyDate()==null) || 
             (this.modifyDate!=null &&
              this.modifyDate.equals(other.getModifyDate())));
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
        if (getHostedButtonID() != null) {
            _hashCode += getHostedButtonID().hashCode();
        }
        if (getButtonType() != null) {
            _hashCode += getButtonType().hashCode();
        }
        if (getItemName() != null) {
            _hashCode += getItemName().hashCode();
        }
        if (getModifyDate() != null) {
            _hashCode += getModifyDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ButtonSearchResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonSearchResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostedButtonID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HostedButtonID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buttonType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ButtonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ItemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ModifyDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
