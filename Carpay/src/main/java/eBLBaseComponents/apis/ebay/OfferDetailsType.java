/**
 * OfferDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * OfferDetailsType
 * 				Specific information for an offer.
 */
public class OfferDetailsType  implements java.io.Serializable {
    /* Code used to identify the promotion offer. */
    private java.lang.String offerCode;

    /* Specific infromation for BML, Similar structure could be added
     * for sepcific
     * 						 promotion needs like CrossPromotions */
    private eBLBaseComponents.apis.ebay.BMLOfferInfoType BMLOfferInfo;

    public OfferDetailsType() {
    }

    public OfferDetailsType(
           java.lang.String offerCode,
           eBLBaseComponents.apis.ebay.BMLOfferInfoType BMLOfferInfo) {
           this.offerCode = offerCode;
           this.BMLOfferInfo = BMLOfferInfo;
    }


    /**
     * Gets the offerCode value for this OfferDetailsType.
     * 
     * @return offerCode   * Code used to identify the promotion offer.
     */
    public java.lang.String getOfferCode() {
        return offerCode;
    }


    /**
     * Sets the offerCode value for this OfferDetailsType.
     * 
     * @param offerCode   * Code used to identify the promotion offer.
     */
    public void setOfferCode(java.lang.String offerCode) {
        this.offerCode = offerCode;
    }


    /**
     * Gets the BMLOfferInfo value for this OfferDetailsType.
     * 
     * @return BMLOfferInfo   * Specific infromation for BML, Similar structure could be added
     * for sepcific
     * 						 promotion needs like CrossPromotions
     */
    public eBLBaseComponents.apis.ebay.BMLOfferInfoType getBMLOfferInfo() {
        return BMLOfferInfo;
    }


    /**
     * Sets the BMLOfferInfo value for this OfferDetailsType.
     * 
     * @param BMLOfferInfo   * Specific infromation for BML, Similar structure could be added
     * for sepcific
     * 						 promotion needs like CrossPromotions
     */
    public void setBMLOfferInfo(eBLBaseComponents.apis.ebay.BMLOfferInfoType BMLOfferInfo) {
        this.BMLOfferInfo = BMLOfferInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferDetailsType)) return false;
        OfferDetailsType other = (OfferDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerCode==null && other.getOfferCode()==null) || 
             (this.offerCode!=null &&
              this.offerCode.equals(other.getOfferCode()))) &&
            ((this.BMLOfferInfo==null && other.getBMLOfferInfo()==null) || 
             (this.BMLOfferInfo!=null &&
              this.BMLOfferInfo.equals(other.getBMLOfferInfo())));
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
        if (getOfferCode() != null) {
            _hashCode += getOfferCode().hashCode();
        }
        if (getBMLOfferInfo() != null) {
            _hashCode += getBMLOfferInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "OfferCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMLOfferInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BMLOfferInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BMLOfferInfoType"));
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
