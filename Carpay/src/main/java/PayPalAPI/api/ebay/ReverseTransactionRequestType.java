/**
 * ReverseTransactionRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ReverseTransactionRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.ReverseTransactionRequestDetailsType reverseTransactionRequestDetails;

    public ReverseTransactionRequestType() {
    }

    public ReverseTransactionRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.ReverseTransactionRequestDetailsType reverseTransactionRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.reverseTransactionRequestDetails = reverseTransactionRequestDetails;
    }


    /**
     * Gets the reverseTransactionRequestDetails value for this ReverseTransactionRequestType.
     * 
     * @return reverseTransactionRequestDetails
     */
    public eBLBaseComponents.apis.ebay.ReverseTransactionRequestDetailsType getReverseTransactionRequestDetails() {
        return reverseTransactionRequestDetails;
    }


    /**
     * Sets the reverseTransactionRequestDetails value for this ReverseTransactionRequestType.
     * 
     * @param reverseTransactionRequestDetails
     */
    public void setReverseTransactionRequestDetails(eBLBaseComponents.apis.ebay.ReverseTransactionRequestDetailsType reverseTransactionRequestDetails) {
        this.reverseTransactionRequestDetails = reverseTransactionRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseTransactionRequestType)) return false;
        ReverseTransactionRequestType other = (ReverseTransactionRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reverseTransactionRequestDetails==null && other.getReverseTransactionRequestDetails()==null) || 
             (this.reverseTransactionRequestDetails!=null &&
              this.reverseTransactionRequestDetails.equals(other.getReverseTransactionRequestDetails())));
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
        if (getReverseTransactionRequestDetails() != null) {
            _hashCode += getReverseTransactionRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseTransactionRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseTransactionRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReverseTransactionRequestDetailsType"));
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
