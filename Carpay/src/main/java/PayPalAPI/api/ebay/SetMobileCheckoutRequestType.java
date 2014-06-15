/**
 * SetMobileCheckoutRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class SetMobileCheckoutRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails;

    public SetMobileCheckoutRequestType() {
    }

    public SetMobileCheckoutRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.setMobileCheckoutRequestDetails = setMobileCheckoutRequestDetails;
    }


    /**
     * Gets the setMobileCheckoutRequestDetails value for this SetMobileCheckoutRequestType.
     * 
     * @return setMobileCheckoutRequestDetails
     */
    public eBLBaseComponents.apis.ebay.SetMobileCheckoutRequestDetailsType getSetMobileCheckoutRequestDetails() {
        return setMobileCheckoutRequestDetails;
    }


    /**
     * Sets the setMobileCheckoutRequestDetails value for this SetMobileCheckoutRequestType.
     * 
     * @param setMobileCheckoutRequestDetails
     */
    public void setSetMobileCheckoutRequestDetails(eBLBaseComponents.apis.ebay.SetMobileCheckoutRequestDetailsType setMobileCheckoutRequestDetails) {
        this.setMobileCheckoutRequestDetails = setMobileCheckoutRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMobileCheckoutRequestType)) return false;
        SetMobileCheckoutRequestType other = (SetMobileCheckoutRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.setMobileCheckoutRequestDetails==null && other.getSetMobileCheckoutRequestDetails()==null) || 
             (this.setMobileCheckoutRequestDetails!=null &&
              this.setMobileCheckoutRequestDetails.equals(other.getSetMobileCheckoutRequestDetails())));
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
        if (getSetMobileCheckoutRequestDetails() != null) {
            _hashCode += getSetMobileCheckoutRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMobileCheckoutRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setMobileCheckoutRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetMobileCheckoutRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetMobileCheckoutRequestDetailsType"));
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
