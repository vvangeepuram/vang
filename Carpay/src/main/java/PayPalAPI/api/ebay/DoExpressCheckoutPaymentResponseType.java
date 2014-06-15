/**
 * DoExpressCheckoutPaymentResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoExpressCheckoutPaymentResponseType  extends eBLBaseComponents.apis.ebay.AbstractResponseType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType doExpressCheckoutPaymentResponseDetails;

    private eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails;

    public DoExpressCheckoutPaymentResponseType() {
    }

    public DoExpressCheckoutPaymentResponseType(
           java.util.Calendar timestamp,
           eBLBaseComponents.apis.ebay.AckCodeType ack,
           java.lang.String correlationID,
           eBLBaseComponents.apis.ebay.ErrorType[] errors,
           java.lang.String version,
           java.lang.String build,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType doExpressCheckoutPaymentResponseDetails,
           eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails) {
        super(
            timestamp,
            ack,
            correlationID,
            errors,
            version,
            build,
            _any);
        this.doExpressCheckoutPaymentResponseDetails = doExpressCheckoutPaymentResponseDetails;
        this.FMFDetails = FMFDetails;
    }


    /**
     * Gets the doExpressCheckoutPaymentResponseDetails value for this DoExpressCheckoutPaymentResponseType.
     * 
     * @return doExpressCheckoutPaymentResponseDetails
     */
    public eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType getDoExpressCheckoutPaymentResponseDetails() {
        return doExpressCheckoutPaymentResponseDetails;
    }


    /**
     * Sets the doExpressCheckoutPaymentResponseDetails value for this DoExpressCheckoutPaymentResponseType.
     * 
     * @param doExpressCheckoutPaymentResponseDetails
     */
    public void setDoExpressCheckoutPaymentResponseDetails(eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentResponseDetailsType doExpressCheckoutPaymentResponseDetails) {
        this.doExpressCheckoutPaymentResponseDetails = doExpressCheckoutPaymentResponseDetails;
    }


    /**
     * Gets the FMFDetails value for this DoExpressCheckoutPaymentResponseType.
     * 
     * @return FMFDetails
     */
    public eBLBaseComponents.apis.ebay.FMFDetailsType getFMFDetails() {
        return FMFDetails;
    }


    /**
     * Sets the FMFDetails value for this DoExpressCheckoutPaymentResponseType.
     * 
     * @param FMFDetails
     */
    public void setFMFDetails(eBLBaseComponents.apis.ebay.FMFDetailsType FMFDetails) {
        this.FMFDetails = FMFDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoExpressCheckoutPaymentResponseType)) return false;
        DoExpressCheckoutPaymentResponseType other = (DoExpressCheckoutPaymentResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doExpressCheckoutPaymentResponseDetails==null && other.getDoExpressCheckoutPaymentResponseDetails()==null) || 
             (this.doExpressCheckoutPaymentResponseDetails!=null &&
              this.doExpressCheckoutPaymentResponseDetails.equals(other.getDoExpressCheckoutPaymentResponseDetails()))) &&
            ((this.FMFDetails==null && other.getFMFDetails()==null) || 
             (this.FMFDetails!=null &&
              this.FMFDetails.equals(other.getFMFDetails())));
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
        if (getDoExpressCheckoutPaymentResponseDetails() != null) {
            _hashCode += getDoExpressCheckoutPaymentResponseDetails().hashCode();
        }
        if (getFMFDetails() != null) {
            _hashCode += getFMFDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoExpressCheckoutPaymentResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doExpressCheckoutPaymentResponseDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentResponseDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentResponseDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FMFDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "FMFDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FMFDetailsType"));
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
