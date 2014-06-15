/**
 * GetBillingAgreementCustomerDetailsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetBillingAgreementCustomerDetailsResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType getBillingAgreementCustomerDetailsResponseDetails;

    public GetBillingAgreementCustomerDetailsResponseType() {
    }

    public GetBillingAgreementCustomerDetailsResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType getBillingAgreementCustomerDetailsResponseDetails) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.getBillingAgreementCustomerDetailsResponseDetails = getBillingAgreementCustomerDetailsResponseDetails;
    }


    /**
     * Gets the getBillingAgreementCustomerDetailsResponseDetails value for this GetBillingAgreementCustomerDetailsResponseType.
     * 
     * @return getBillingAgreementCustomerDetailsResponseDetails
     */
    public eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType getGetBillingAgreementCustomerDetailsResponseDetails() {
        return getBillingAgreementCustomerDetailsResponseDetails;
    }


    /**
     * Sets the getBillingAgreementCustomerDetailsResponseDetails value for this GetBillingAgreementCustomerDetailsResponseType.
     * 
     * @param getBillingAgreementCustomerDetailsResponseDetails
     */
    public void setGetBillingAgreementCustomerDetailsResponseDetails(eBLBaseComponents.apis.ebay.GetBillingAgreementCustomerDetailsResponseDetailsType getBillingAgreementCustomerDetailsResponseDetails) {
        this.getBillingAgreementCustomerDetailsResponseDetails = getBillingAgreementCustomerDetailsResponseDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBillingAgreementCustomerDetailsResponseType)) return false;
        GetBillingAgreementCustomerDetailsResponseType other = (GetBillingAgreementCustomerDetailsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.getBillingAgreementCustomerDetailsResponseDetails==null && other.getGetBillingAgreementCustomerDetailsResponseDetails()==null) || 
             (this.getBillingAgreementCustomerDetailsResponseDetails!=null &&
              this.getBillingAgreementCustomerDetailsResponseDetails.equals(other.getGetBillingAgreementCustomerDetailsResponseDetails())));
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
        if (getGetBillingAgreementCustomerDetailsResponseDetails() != null) {
            _hashCode += getGetBillingAgreementCustomerDetailsResponseDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBillingAgreementCustomerDetailsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetBillingAgreementCustomerDetailsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBillingAgreementCustomerDetailsResponseDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetBillingAgreementCustomerDetailsResponseDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetBillingAgreementCustomerDetailsResponseDetailsType"));
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
