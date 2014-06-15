/**
 * DoExpressCheckoutPaymentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoExpressCheckoutPaymentRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails;

    /* This flag indicates that the response should include FMFDetails */
    private java.lang.Integer returnFMFDetails;

    public DoExpressCheckoutPaymentRequestType() {
    }

    public DoExpressCheckoutPaymentRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails,
           java.lang.Integer returnFMFDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.doExpressCheckoutPaymentRequestDetails = doExpressCheckoutPaymentRequestDetails;
        this.returnFMFDetails = returnFMFDetails;
    }


    /**
     * Gets the doExpressCheckoutPaymentRequestDetails value for this DoExpressCheckoutPaymentRequestType.
     * 
     * @return doExpressCheckoutPaymentRequestDetails
     */
    public eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentRequestDetailsType getDoExpressCheckoutPaymentRequestDetails() {
        return doExpressCheckoutPaymentRequestDetails;
    }


    /**
     * Sets the doExpressCheckoutPaymentRequestDetails value for this DoExpressCheckoutPaymentRequestType.
     * 
     * @param doExpressCheckoutPaymentRequestDetails
     */
    public void setDoExpressCheckoutPaymentRequestDetails(eBLBaseComponents.apis.ebay.DoExpressCheckoutPaymentRequestDetailsType doExpressCheckoutPaymentRequestDetails) {
        this.doExpressCheckoutPaymentRequestDetails = doExpressCheckoutPaymentRequestDetails;
    }


    /**
     * Gets the returnFMFDetails value for this DoExpressCheckoutPaymentRequestType.
     * 
     * @return returnFMFDetails   * This flag indicates that the response should include FMFDetails
     */
    public java.lang.Integer getReturnFMFDetails() {
        return returnFMFDetails;
    }


    /**
     * Sets the returnFMFDetails value for this DoExpressCheckoutPaymentRequestType.
     * 
     * @param returnFMFDetails   * This flag indicates that the response should include FMFDetails
     */
    public void setReturnFMFDetails(java.lang.Integer returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoExpressCheckoutPaymentRequestType)) return false;
        DoExpressCheckoutPaymentRequestType other = (DoExpressCheckoutPaymentRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doExpressCheckoutPaymentRequestDetails==null && other.getDoExpressCheckoutPaymentRequestDetails()==null) || 
             (this.doExpressCheckoutPaymentRequestDetails!=null &&
              this.doExpressCheckoutPaymentRequestDetails.equals(other.getDoExpressCheckoutPaymentRequestDetails()))) &&
            ((this.returnFMFDetails==null && other.getReturnFMFDetails()==null) || 
             (this.returnFMFDetails!=null &&
              this.returnFMFDetails.equals(other.getReturnFMFDetails())));
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
        if (getDoExpressCheckoutPaymentRequestDetails() != null) {
            _hashCode += getDoExpressCheckoutPaymentRequestDetails().hashCode();
        }
        if (getReturnFMFDetails() != null) {
            _hashCode += getReturnFMFDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoExpressCheckoutPaymentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doExpressCheckoutPaymentRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoExpressCheckoutPaymentRequestDetailsType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnFMFDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReturnFMFDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
