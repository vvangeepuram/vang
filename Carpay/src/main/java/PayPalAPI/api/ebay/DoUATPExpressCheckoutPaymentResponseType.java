/**
 * DoUATPExpressCheckoutPaymentResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoUATPExpressCheckoutPaymentResponseType  extends PayPalAPI.api.ebay.DoExpressCheckoutPaymentResponseType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.UATPDetailsType UATPDetails;

    public DoUATPExpressCheckoutPaymentResponseType() {
    }

    public DoUATPExpressCheckoutPaymentResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType doExpressCheckoutPaymentResponseDetails,
           eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails,
           eBLBaseComponents.apis.ebay.UATPDetailsType UATPDetails) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any,
            doExpressCheckoutPaymentResponseDetails,
            FMFDetails);
        this.UATPDetails = UATPDetails;
    }


    /**
     * Gets the UATPDetails value for this DoUATPExpressCheckoutPaymentResponseType.
     * 
     * @return UATPDetails
     */
    public eBLBaseComponents.apis.ebay.UATPDetailsType getUATPDetails() {
        return UATPDetails;
    }


    /**
     * Sets the UATPDetails value for this DoUATPExpressCheckoutPaymentResponseType.
     * 
     * @param UATPDetails
     */
    public void setUATPDetails(eBLBaseComponents.apis.ebay.UATPDetailsType UATPDetails) {
        this.UATPDetails = UATPDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoUATPExpressCheckoutPaymentResponseType)) return false;
        DoUATPExpressCheckoutPaymentResponseType other = (DoUATPExpressCheckoutPaymentResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.UATPDetails==null && other.getUATPDetails()==null) || 
             (this.UATPDetails!=null &&
              this.UATPDetails.equals(other.getUATPDetails())));
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
        if (getUATPDetails() != null) {
            _hashCode += getUATPDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoUATPExpressCheckoutPaymentResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UATPDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UATPDetailsType"));
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
