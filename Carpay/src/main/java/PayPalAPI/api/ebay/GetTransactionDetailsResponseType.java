/**
 * GetTransactionDetailsResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class GetTransactionDetailsResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.PaymentTransactionType paymentTransactionDetails;

    private eBLBaseComponents.apis.ebay.ThreeDSecureInfoType threeDSecureDetails;

    public GetTransactionDetailsResponseType() {
    }

    public GetTransactionDetailsResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.PaymentTransactionType paymentTransactionDetails,
           eBLBaseComponents.apis.ebay.ThreeDSecureInfoType threeDSecureDetails) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.paymentTransactionDetails = paymentTransactionDetails;
        this.threeDSecureDetails = threeDSecureDetails;
    }


    /**
     * Gets the paymentTransactionDetails value for this GetTransactionDetailsResponseType.
     * 
     * @return paymentTransactionDetails
     */
    public eBLBaseComponents.apis.ebay.PaymentTransactionType getPaymentTransactionDetails() {
        return paymentTransactionDetails;
    }


    /**
     * Sets the paymentTransactionDetails value for this GetTransactionDetailsResponseType.
     * 
     * @param paymentTransactionDetails
     */
    public void setPaymentTransactionDetails(eBLBaseComponents.apis.ebay.PaymentTransactionType paymentTransactionDetails) {
        this.paymentTransactionDetails = paymentTransactionDetails;
    }


    /**
     * Gets the threeDSecureDetails value for this GetTransactionDetailsResponseType.
     * 
     * @return threeDSecureDetails
     */
    public eBLBaseComponents.apis.ebay.ThreeDSecureInfoType getThreeDSecureDetails() {
        return threeDSecureDetails;
    }


    /**
     * Sets the threeDSecureDetails value for this GetTransactionDetailsResponseType.
     * 
     * @param threeDSecureDetails
     */
    public void setThreeDSecureDetails(eBLBaseComponents.apis.ebay.ThreeDSecureInfoType threeDSecureDetails) {
        this.threeDSecureDetails = threeDSecureDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTransactionDetailsResponseType)) return false;
        GetTransactionDetailsResponseType other = (GetTransactionDetailsResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.paymentTransactionDetails==null && other.getPaymentTransactionDetails()==null) || 
             (this.paymentTransactionDetails!=null &&
              this.paymentTransactionDetails.equals(other.getPaymentTransactionDetails()))) &&
            ((this.threeDSecureDetails==null && other.getThreeDSecureDetails()==null) || 
             (this.threeDSecureDetails!=null &&
              this.threeDSecureDetails.equals(other.getThreeDSecureDetails())));
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
        if (getPaymentTransactionDetails() != null) {
            _hashCode += getPaymentTransactionDetails().hashCode();
        }
        if (getThreeDSecureDetails() != null) {
            _hashCode += getThreeDSecureDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetTransactionDetailsResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "GetTransactionDetailsResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentTransactionDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PaymentTransactionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDSecureDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureInfoType"));
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
