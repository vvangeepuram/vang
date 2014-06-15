/**
 * BuyerDetailType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class BuyerDetailType  implements java.io.Serializable {
    /* Information that is used to indentify the Buyer. This is used
     * for auto authorization. Mandatory if Authorization is requested. */
    private eBLBaseComponents.apis.ebay.IdentificationInfoType identificationInfo;

    /* Correlation id related to risk process done for the device.
     * Max length is 36 Chars. */
    private java.lang.String riskSessionCorrelationID;

    public BuyerDetailType() {
    }

    public BuyerDetailType(
           eBLBaseComponents.apis.ebay.IdentificationInfoType identificationInfo,
           java.lang.String riskSessionCorrelationID) {
           this.identificationInfo = identificationInfo;
           this.riskSessionCorrelationID = riskSessionCorrelationID;
    }


    /**
     * Gets the identificationInfo value for this BuyerDetailType.
     * 
     * @return identificationInfo   * Information that is used to indentify the Buyer. This is used
     * for auto authorization. Mandatory if Authorization is requested.
     */
    public eBLBaseComponents.apis.ebay.IdentificationInfoType getIdentificationInfo() {
        return identificationInfo;
    }


    /**
     * Sets the identificationInfo value for this BuyerDetailType.
     * 
     * @param identificationInfo   * Information that is used to indentify the Buyer. This is used
     * for auto authorization. Mandatory if Authorization is requested.
     */
    public void setIdentificationInfo(eBLBaseComponents.apis.ebay.IdentificationInfoType identificationInfo) {
        this.identificationInfo = identificationInfo;
    }


    /**
     * Gets the riskSessionCorrelationID value for this BuyerDetailType.
     * 
     * @return riskSessionCorrelationID   * Correlation id related to risk process done for the device.
     * Max length is 36 Chars.
     */
    public java.lang.String getRiskSessionCorrelationID() {
        return riskSessionCorrelationID;
    }


    /**
     * Sets the riskSessionCorrelationID value for this BuyerDetailType.
     * 
     * @param riskSessionCorrelationID   * Correlation id related to risk process done for the device.
     * Max length is 36 Chars.
     */
    public void setRiskSessionCorrelationID(java.lang.String riskSessionCorrelationID) {
        this.riskSessionCorrelationID = riskSessionCorrelationID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BuyerDetailType)) return false;
        BuyerDetailType other = (BuyerDetailType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificationInfo==null && other.getIdentificationInfo()==null) || 
             (this.identificationInfo!=null &&
              this.identificationInfo.equals(other.getIdentificationInfo()))) &&
            ((this.riskSessionCorrelationID==null && other.getRiskSessionCorrelationID()==null) || 
             (this.riskSessionCorrelationID!=null &&
              this.riskSessionCorrelationID.equals(other.getRiskSessionCorrelationID())));
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
        if (getIdentificationInfo() != null) {
            _hashCode += getIdentificationInfo().hashCode();
        }
        if (getRiskSessionCorrelationID() != null) {
            _hashCode += getRiskSessionCorrelationID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BuyerDetailType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BuyerDetailType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentificationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "IdentificationInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("riskSessionCorrelationID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RiskSessionCorrelationID"));
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
