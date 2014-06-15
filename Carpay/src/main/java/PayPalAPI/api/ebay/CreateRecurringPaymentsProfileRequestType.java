/**
 * CreateRecurringPaymentsProfileRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class CreateRecurringPaymentsProfileRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails;

    public CreateRecurringPaymentsProfileRequestType() {
    }

    public CreateRecurringPaymentsProfileRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.createRecurringPaymentsProfileRequestDetails = createRecurringPaymentsProfileRequestDetails;
    }


    /**
     * Gets the createRecurringPaymentsProfileRequestDetails value for this CreateRecurringPaymentsProfileRequestType.
     * 
     * @return createRecurringPaymentsProfileRequestDetails
     */
    public eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileRequestDetailsType getCreateRecurringPaymentsProfileRequestDetails() {
        return createRecurringPaymentsProfileRequestDetails;
    }


    /**
     * Sets the createRecurringPaymentsProfileRequestDetails value for this CreateRecurringPaymentsProfileRequestType.
     * 
     * @param createRecurringPaymentsProfileRequestDetails
     */
    public void setCreateRecurringPaymentsProfileRequestDetails(eBLBaseComponents.apis.ebay.CreateRecurringPaymentsProfileRequestDetailsType createRecurringPaymentsProfileRequestDetails) {
        this.createRecurringPaymentsProfileRequestDetails = createRecurringPaymentsProfileRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateRecurringPaymentsProfileRequestType)) return false;
        CreateRecurringPaymentsProfileRequestType other = (CreateRecurringPaymentsProfileRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createRecurringPaymentsProfileRequestDetails==null && other.getCreateRecurringPaymentsProfileRequestDetails()==null) || 
             (this.createRecurringPaymentsProfileRequestDetails!=null &&
              this.createRecurringPaymentsProfileRequestDetails.equals(other.getCreateRecurringPaymentsProfileRequestDetails())));
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
        if (getCreateRecurringPaymentsProfileRequestDetails() != null) {
            _hashCode += getCreateRecurringPaymentsProfileRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateRecurringPaymentsProfileRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "CreateRecurringPaymentsProfileRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createRecurringPaymentsProfileRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CreateRecurringPaymentsProfileRequestDetailsType"));
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
