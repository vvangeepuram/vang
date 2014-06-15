/**
 * DoNonReferencedCreditRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoNonReferencedCreditRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails;

    public DoNonReferencedCreditRequestType() {
    }

    public DoNonReferencedCreditRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.doNonReferencedCreditRequestDetails = doNonReferencedCreditRequestDetails;
    }


    /**
     * Gets the doNonReferencedCreditRequestDetails value for this DoNonReferencedCreditRequestType.
     * 
     * @return doNonReferencedCreditRequestDetails
     */
    public eBLBaseComponents.apis.ebay.DoNonReferencedCreditRequestDetailsType getDoNonReferencedCreditRequestDetails() {
        return doNonReferencedCreditRequestDetails;
    }


    /**
     * Sets the doNonReferencedCreditRequestDetails value for this DoNonReferencedCreditRequestType.
     * 
     * @param doNonReferencedCreditRequestDetails
     */
    public void setDoNonReferencedCreditRequestDetails(eBLBaseComponents.apis.ebay.DoNonReferencedCreditRequestDetailsType doNonReferencedCreditRequestDetails) {
        this.doNonReferencedCreditRequestDetails = doNonReferencedCreditRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoNonReferencedCreditRequestType)) return false;
        DoNonReferencedCreditRequestType other = (DoNonReferencedCreditRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.doNonReferencedCreditRequestDetails==null && other.getDoNonReferencedCreditRequestDetails()==null) || 
             (this.doNonReferencedCreditRequestDetails!=null &&
              this.doNonReferencedCreditRequestDetails.equals(other.getDoNonReferencedCreditRequestDetails())));
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
        if (getDoNonReferencedCreditRequestDetails() != null) {
            _hashCode += getDoNonReferencedCreditRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoNonReferencedCreditRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoNonReferencedCreditRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNonReferencedCreditRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DoNonReferencedCreditRequestDetailsType"));
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
