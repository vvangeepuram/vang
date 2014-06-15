/**
 * BMLOfferInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * BMLOfferInfoType
 * 				Specific information for BML.
 */
public class BMLOfferInfoType  implements java.io.Serializable {
    /* Unique identification for merchant/buyer/offer combo. */
    private java.lang.String offerTrackingID;

    public BMLOfferInfoType() {
    }

    public BMLOfferInfoType(
           java.lang.String offerTrackingID) {
           this.offerTrackingID = offerTrackingID;
    }


    /**
     * Gets the offerTrackingID value for this BMLOfferInfoType.
     * 
     * @return offerTrackingID   * Unique identification for merchant/buyer/offer combo.
     */
    public java.lang.String getOfferTrackingID() {
        return offerTrackingID;
    }


    /**
     * Sets the offerTrackingID value for this BMLOfferInfoType.
     * 
     * @param offerTrackingID   * Unique identification for merchant/buyer/offer combo.
     */
    public void setOfferTrackingID(java.lang.String offerTrackingID) {
        this.offerTrackingID = offerTrackingID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMLOfferInfoType)) return false;
        BMLOfferInfoType other = (BMLOfferInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerTrackingID==null && other.getOfferTrackingID()==null) || 
             (this.offerTrackingID!=null &&
              this.offerTrackingID.equals(other.getOfferTrackingID())));
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
        if (getOfferTrackingID() != null) {
            _hashCode += getOfferTrackingID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMLOfferInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BMLOfferInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerTrackingID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferTrackingID"));
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
