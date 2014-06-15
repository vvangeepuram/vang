/**
 * ManageRecurringPaymentsProfileStatusRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ManageRecurringPaymentsProfileStatusRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusRequestDetailsType manageRecurringPaymentsProfileStatusRequestDetails;

    public ManageRecurringPaymentsProfileStatusRequestType() {
    }

    public ManageRecurringPaymentsProfileStatusRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusRequestDetailsType manageRecurringPaymentsProfileStatusRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.manageRecurringPaymentsProfileStatusRequestDetails = manageRecurringPaymentsProfileStatusRequestDetails;
    }


    /**
     * Gets the manageRecurringPaymentsProfileStatusRequestDetails value for this ManageRecurringPaymentsProfileStatusRequestType.
     * 
     * @return manageRecurringPaymentsProfileStatusRequestDetails
     */
    public eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusRequestDetailsType getManageRecurringPaymentsProfileStatusRequestDetails() {
        return manageRecurringPaymentsProfileStatusRequestDetails;
    }


    /**
     * Sets the manageRecurringPaymentsProfileStatusRequestDetails value for this ManageRecurringPaymentsProfileStatusRequestType.
     * 
     * @param manageRecurringPaymentsProfileStatusRequestDetails
     */
    public void setManageRecurringPaymentsProfileStatusRequestDetails(eBLBaseComponents.apis.ebay.ManageRecurringPaymentsProfileStatusRequestDetailsType manageRecurringPaymentsProfileStatusRequestDetails) {
        this.manageRecurringPaymentsProfileStatusRequestDetails = manageRecurringPaymentsProfileStatusRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManageRecurringPaymentsProfileStatusRequestType)) return false;
        ManageRecurringPaymentsProfileStatusRequestType other = (ManageRecurringPaymentsProfileStatusRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.manageRecurringPaymentsProfileStatusRequestDetails==null && other.getManageRecurringPaymentsProfileStatusRequestDetails()==null) || 
             (this.manageRecurringPaymentsProfileStatusRequestDetails!=null &&
              this.manageRecurringPaymentsProfileStatusRequestDetails.equals(other.getManageRecurringPaymentsProfileStatusRequestDetails())));
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
        if (getManageRecurringPaymentsProfileStatusRequestDetails() != null) {
            _hashCode += getManageRecurringPaymentsProfileStatusRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ManageRecurringPaymentsProfileStatusRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ManageRecurringPaymentsProfileStatusRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manageRecurringPaymentsProfileStatusRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ManageRecurringPaymentsProfileStatusRequestDetailsType"));
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
