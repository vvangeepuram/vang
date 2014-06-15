/**
 * DoDirectPaymentRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoDirectPaymentRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails;

    /* This flag indicates that the response should include FMFDetails */
    private java.lang.Integer returnFMFDetails;

    public DoDirectPaymentRequestType() {
    }

    public DoDirectPaymentRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails,
           java.lang.Integer returnFMFDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.doDirectPaymentRequestDetails = doDirectPaymentRequestDetails;
        this.returnFMFDetails = returnFMFDetails;
    }


    /**
     * Gets the doDirectPaymentRequestDetails value for this DoDirectPaymentRequestType.
     * 
     * @return doDirectPaymentRequestDetails
     */
    public eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType getDoDirectPaymentRequestDetails() {
        return doDirectPaymentRequestDetails;
    }


    /**
     * Sets the doDirectPaymentRequestDetails value for this DoDirectPaymentRequestType.
     * 
     * @param doDirectPaymentRequestDetails
     */
    public void setDoDirectPaymentRequestDetails(eBLBaseComponents.apis.ebay.DoDirectPaymentRequestDetailsType doDirectPaymentRequestDetails) {
        this.doDirectPaymentRequestDetails = doDirectPaymentRequestDetails;
    }


    /**
     * Gets the returnFMFDetails value for this DoDirectPaymentRequestType.
     * 
     * @return returnFMFDetails   * This flag indicates that the response should include FMFDetails
     */
    public java.lang.Integer getReturnFMFDetails() {
        return returnFMFDetails;
    }


    /**
     * Sets the returnFMFDetails value for this DoDirectPaymentRequestType.
     * 
     * @param returnFMFDetails   * This flag indicates that the response should include FMFDetails
     */
    public void setReturnFMFDetails(java.lang.Integer returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoDirectPaymentRequestType)) return false;
        DoDirectPaymentRequestType other = (DoDirectPaymentRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doDirectPaymentRequestDetails==null && other.getDoDirectPaymentRequestDetails()==null) || 
             (this.doDirectPaymentRequestDetails!=null &&
              this.doDirectPaymentRequestDetails.equals(other.getDoDirectPaymentRequestDetails()))) &&
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
        if (getDoDirectPaymentRequestDetails() != null) {
            _hashCode += getDoDirectPaymentRequestDetails().hashCode();
        }
        if (getReturnFMFDetails() != null) {
            _hashCode += getReturnFMFDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoDirectPaymentRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoDirectPaymentRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doDirectPaymentRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoDirectPaymentRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoDirectPaymentRequestDetailsType"));
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
