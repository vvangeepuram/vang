/**
 * CompleteRecoupResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class CompleteRecoupResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private EnhancedDataTypes.apis.ebay.EnhancedCompleteRecoupResponseDetailsType enhancedCompleteRecoupResponseDetails;

    public CompleteRecoupResponseType() {
    }

    public CompleteRecoupResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           EnhancedDataTypes.apis.ebay.EnhancedCompleteRecoupResponseDetailsType enhancedCompleteRecoupResponseDetails) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.enhancedCompleteRecoupResponseDetails = enhancedCompleteRecoupResponseDetails;
    }


    /**
     * Gets the enhancedCompleteRecoupResponseDetails value for this CompleteRecoupResponseType.
     * 
     * @return enhancedCompleteRecoupResponseDetails
     */
    public EnhancedDataTypes.apis.ebay.EnhancedCompleteRecoupResponseDetailsType getEnhancedCompleteRecoupResponseDetails() {
        return enhancedCompleteRecoupResponseDetails;
    }


    /**
     * Sets the enhancedCompleteRecoupResponseDetails value for this CompleteRecoupResponseType.
     * 
     * @param enhancedCompleteRecoupResponseDetails
     */
    public void setEnhancedCompleteRecoupResponseDetails(EnhancedDataTypes.apis.ebay.EnhancedCompleteRecoupResponseDetailsType enhancedCompleteRecoupResponseDetails) {
        this.enhancedCompleteRecoupResponseDetails = enhancedCompleteRecoupResponseDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompleteRecoupResponseType)) return false;
        CompleteRecoupResponseType other = (CompleteRecoupResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.enhancedCompleteRecoupResponseDetails==null && other.getEnhancedCompleteRecoupResponseDetails()==null) || 
             (this.enhancedCompleteRecoupResponseDetails!=null &&
              this.enhancedCompleteRecoupResponseDetails.equals(other.getEnhancedCompleteRecoupResponseDetails())));
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
        if (getEnhancedCompleteRecoupResponseDetails() != null) {
            _hashCode += getEnhancedCompleteRecoupResponseDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompleteRecoupResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CompleteRecoupResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedCompleteRecoupResponseDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupResponseDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:EnhancedDataTypes", "EnhancedCompleteRecoupResponseDetailsType"));
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
