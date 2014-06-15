/**
 * BillUserRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BillUserRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.MerchantPullPaymentType merchantPullPaymentDetails;

    /* This flag indicates that the response should include FMFDetails */
    private java.lang.Integer returnFMFDetails;

    public BillUserRequestType() {
    }

    public BillUserRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.MerchantPullPaymentType merchantPullPaymentDetails,
           java.lang.Integer returnFMFDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.merchantPullPaymentDetails = merchantPullPaymentDetails;
        this.returnFMFDetails = returnFMFDetails;
    }


    /**
     * Gets the merchantPullPaymentDetails value for this BillUserRequestType.
     * 
     * @return merchantPullPaymentDetails
     */
    public eBLBaseComponents.apis.ebay.MerchantPullPaymentType getMerchantPullPaymentDetails() {
        return merchantPullPaymentDetails;
    }


    /**
     * Sets the merchantPullPaymentDetails value for this BillUserRequestType.
     * 
     * @param merchantPullPaymentDetails
     */
    public void setMerchantPullPaymentDetails(eBLBaseComponents.apis.ebay.MerchantPullPaymentType merchantPullPaymentDetails) {
        this.merchantPullPaymentDetails = merchantPullPaymentDetails;
    }


    /**
     * Gets the returnFMFDetails value for this BillUserRequestType.
     * 
     * @return returnFMFDetails   * This flag indicates that the response should include FMFDetails
     */
    public java.lang.Integer getReturnFMFDetails() {
        return returnFMFDetails;
    }


    /**
     * Sets the returnFMFDetails value for this BillUserRequestType.
     * 
     * @param returnFMFDetails   * This flag indicates that the response should include FMFDetails
     */
    public void setReturnFMFDetails(java.lang.Integer returnFMFDetails) {
        this.returnFMFDetails = returnFMFDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillUserRequestType)) return false;
        BillUserRequestType other = (BillUserRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.merchantPullPaymentDetails==null && other.getMerchantPullPaymentDetails()==null) || 
             (this.merchantPullPaymentDetails!=null &&
              this.merchantPullPaymentDetails.equals(other.getMerchantPullPaymentDetails()))) &&
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
        if (getMerchantPullPaymentDetails() != null) {
            _hashCode += getMerchantPullPaymentDetails().hashCode();
        }
        if (getReturnFMFDetails() != null) {
            _hashCode += getReturnFMFDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillUserRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BillUserRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantPullPaymentDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MerchantPullPaymentType"));
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
