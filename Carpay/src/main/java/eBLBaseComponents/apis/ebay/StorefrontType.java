/**
 * StorefrontType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains the eBay Stores-specific item attributes 
 * 	       		department number and store location. StorefrontInfo 
 * 	       		is shown for any item that belongs to an eBay Store 
 * 	       		owner, regardless of whether it is fixed price or 
 * 	       		auction type. Returned as null for international 
 * 	       		fixed price items.
 */
public class StorefrontType  implements java.io.Serializable {
    /* assumed this type is specific to add/get/revise item, then
     * each StorefrontType nust have category id, for store details this
     * node makes no sense to use */
    private int storeCategoryID;

    /* in case or revise item for example - to change store category
     * (department) you do not need to change store URL, so it will notbe
     * in request */
    private org.apache.axis.types.URI storeURL;

    public StorefrontType() {
    }

    public StorefrontType(
           int storeCategoryID,
           org.apache.axis.types.URI storeURL) {
           this.storeCategoryID = storeCategoryID;
           this.storeURL = storeURL;
    }


    /**
     * Gets the storeCategoryID value for this StorefrontType.
     * 
     * @return storeCategoryID   * assumed this type is specific to add/get/revise item, then
     * each StorefrontType nust have category id, for store details this
     * node makes no sense to use
     */
    public int getStoreCategoryID() {
        return storeCategoryID;
    }


    /**
     * Sets the storeCategoryID value for this StorefrontType.
     * 
     * @param storeCategoryID   * assumed this type is specific to add/get/revise item, then
     * each StorefrontType nust have category id, for store details this
     * node makes no sense to use
     */
    public void setStoreCategoryID(int storeCategoryID) {
        this.storeCategoryID = storeCategoryID;
    }


    /**
     * Gets the storeURL value for this StorefrontType.
     * 
     * @return storeURL   * in case or revise item for example - to change store category
     * (department) you do not need to change store URL, so it will notbe
     * in request
     */
    public org.apache.axis.types.URI getStoreURL() {
        return storeURL;
    }


    /**
     * Sets the storeURL value for this StorefrontType.
     * 
     * @param storeURL   * in case or revise item for example - to change store category
     * (department) you do not need to change store URL, so it will notbe
     * in request
     */
    public void setStoreURL(org.apache.axis.types.URI storeURL) {
        this.storeURL = storeURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StorefrontType)) return false;
        StorefrontType other = (StorefrontType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.storeCategoryID == other.getStoreCategoryID() &&
            ((this.storeURL==null && other.getStoreURL()==null) || 
             (this.storeURL!=null &&
              this.storeURL.equals(other.getStoreURL())));
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
        _hashCode += getStoreCategoryID();
        if (getStoreURL() != null) {
            _hashCode += getStoreURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StorefrontType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StorefrontType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreCategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeURL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "StoreURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
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
