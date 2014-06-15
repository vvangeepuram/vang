/**
 * MerchantStoreDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class MerchantStoreDetailsType  implements java.io.Serializable {
    /* Store IDOptional
     * 								Character length and limits: 50 single-byte characters */
    private java.lang.String storeID;

    /* Terminal IDOptional
     * 								Character length and limits: 50 single-byte characters */
    private java.lang.String terminalID;

    public MerchantStoreDetailsType() {
    }

    public MerchantStoreDetailsType(
           java.lang.String storeID,
           java.lang.String terminalID) {
           this.storeID = storeID;
           this.terminalID = terminalID;
    }


    /**
     * Gets the storeID value for this MerchantStoreDetailsType.
     * 
     * @return storeID   * Store IDOptional
     * 								Character length and limits: 50 single-byte characters
     */
    public java.lang.String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this MerchantStoreDetailsType.
     * 
     * @param storeID   * Store IDOptional
     * 								Character length and limits: 50 single-byte characters
     */
    public void setStoreID(java.lang.String storeID) {
        this.storeID = storeID;
    }


    /**
     * Gets the terminalID value for this MerchantStoreDetailsType.
     * 
     * @return terminalID   * Terminal IDOptional
     * 								Character length and limits: 50 single-byte characters
     */
    public java.lang.String getTerminalID() {
        return terminalID;
    }


    /**
     * Sets the terminalID value for this MerchantStoreDetailsType.
     * 
     * @param terminalID   * Terminal IDOptional
     * 								Character length and limits: 50 single-byte characters
     */
    public void setTerminalID(java.lang.String terminalID) {
        this.terminalID = terminalID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantStoreDetailsType)) return false;
        MerchantStoreDetailsType other = (MerchantStoreDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID()))) &&
            ((this.terminalID==null && other.getTerminalID()==null) || 
             (this.terminalID!=null &&
              this.terminalID.equals(other.getTerminalID())));
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
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
        }
        if (getTerminalID() != null) {
            _hashCode += getTerminalID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantStoreDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantStoreDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminalID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "TerminalID"));
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
