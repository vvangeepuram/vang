/**
 * GetExpressCheckoutDetailsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetExpressCheckoutDetailsResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetailsResponseDetails;

    public GetExpressCheckoutDetailsResponseType() {
    }

    public GetExpressCheckoutDetailsResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetailsResponseDetails) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.getExpressCheckoutDetailsResponseDetails = getExpressCheckoutDetailsResponseDetails;
    }


    /**
     * Gets the getExpressCheckoutDetailsResponseDetails value for this GetExpressCheckoutDetailsResponseType.
     * 
     * @return getExpressCheckoutDetailsResponseDetails
     */
    public eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType getGetExpressCheckoutDetailsResponseDetails() {
        return getExpressCheckoutDetailsResponseDetails;
    }


    /**
     * Sets the getExpressCheckoutDetailsResponseDetails value for this GetExpressCheckoutDetailsResponseType.
     * 
     * @param getExpressCheckoutDetailsResponseDetails
     */
    public void setGetExpressCheckoutDetailsResponseDetails(eBLBaseComponents.apis.ebay.GetExpressCheckoutDetailsResponseDetailsType getExpressCheckoutDetailsResponseDetails) {
        this.getExpressCheckoutDetailsResponseDetails = getExpressCheckoutDetailsResponseDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetExpressCheckoutDetailsResponseType)) return false;
        GetExpressCheckoutDetailsResponseType other = (GetExpressCheckoutDetailsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.getExpressCheckoutDetailsResponseDetails==null && other.getGetExpressCheckoutDetailsResponseDetails()==null) || 
             (this.getExpressCheckoutDetailsResponseDetails!=null &&
              this.getExpressCheckoutDetailsResponseDetails.equals(other.getGetExpressCheckoutDetailsResponseDetails())));
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
        if (getGetExpressCheckoutDetailsResponseDetails() != null) {
            _hashCode += getGetExpressCheckoutDetailsResponseDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetExpressCheckoutDetailsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetExpressCheckoutDetailsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getExpressCheckoutDetailsResponseDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetExpressCheckoutDetailsResponseDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetExpressCheckoutDetailsResponseDetailsType"));
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
