/**
 * InitiateRecoupRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class InitiateRecoupRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private EnhancedDataTypes.apis.ebay.EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails;

    public InitiateRecoupRequestType() {
    }

    public InitiateRecoupRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           EnhancedDataTypes.apis.ebay.EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.enhancedInitiateRecoupRequestDetails = enhancedInitiateRecoupRequestDetails;
    }


    /**
     * Gets the enhancedInitiateRecoupRequestDetails value for this InitiateRecoupRequestType.
     * 
     * @return enhancedInitiateRecoupRequestDetails
     */
    public EnhancedDataTypes.apis.ebay.EnhancedInitiateRecoupRequestDetailsType getEnhancedInitiateRecoupRequestDetails() {
        return enhancedInitiateRecoupRequestDetails;
    }


    /**
     * Sets the enhancedInitiateRecoupRequestDetails value for this InitiateRecoupRequestType.
     * 
     * @param enhancedInitiateRecoupRequestDetails
     */
    public void setEnhancedInitiateRecoupRequestDetails(EnhancedDataTypes.apis.ebay.EnhancedInitiateRecoupRequestDetailsType enhancedInitiateRecoupRequestDetails) {
        this.enhancedInitiateRecoupRequestDetails = enhancedInitiateRecoupRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateRecoupRequestType)) return false;
        InitiateRecoupRequestType other = (InitiateRecoupRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enhancedInitiateRecoupRequestDetails==null && other.getEnhancedInitiateRecoupRequestDetails()==null) || 
             (this.enhancedInitiateRecoupRequestDetails!=null &&
              this.enhancedInitiateRecoupRequestDetails.equals(other.getEnhancedInitiateRecoupRequestDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEnhancedInitiateRecoupRequestDetails() != null) {
            _hashCode += getEnhancedInitiateRecoupRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateRecoupRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InitiateRecoupRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedInitiateRecoupRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedInitiateRecoupRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedInitiateRecoupRequestDetailsType"));
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
