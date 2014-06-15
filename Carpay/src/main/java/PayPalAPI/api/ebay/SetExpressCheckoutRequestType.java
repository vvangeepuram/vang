/**
 * SetExpressCheckoutRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class SetExpressCheckoutRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails;

    public SetExpressCheckoutRequestType() {
    }

    public SetExpressCheckoutRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           eBLBaseComponents.apis.ebay.SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.setExpressCheckoutRequestDetails = setExpressCheckoutRequestDetails;
    }


    /**
     * Gets the setExpressCheckoutRequestDetails value for this SetExpressCheckoutRequestType.
     * 
     * @return setExpressCheckoutRequestDetails
     */
    public eBLBaseComponents.apis.ebay.SetExpressCheckoutRequestDetailsType getSetExpressCheckoutRequestDetails() {
        return setExpressCheckoutRequestDetails;
    }


    /**
     * Sets the setExpressCheckoutRequestDetails value for this SetExpressCheckoutRequestType.
     * 
     * @param setExpressCheckoutRequestDetails
     */
    public void setSetExpressCheckoutRequestDetails(eBLBaseComponents.apis.ebay.SetExpressCheckoutRequestDetailsType setExpressCheckoutRequestDetails) {
        this.setExpressCheckoutRequestDetails = setExpressCheckoutRequestDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetExpressCheckoutRequestType)) return false;
        SetExpressCheckoutRequestType other = (SetExpressCheckoutRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.setExpressCheckoutRequestDetails==null && other.getSetExpressCheckoutRequestDetails()==null) || 
             (this.setExpressCheckoutRequestDetails!=null &&
              this.setExpressCheckoutRequestDetails.equals(other.getSetExpressCheckoutRequestDetails())));
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
        if (getSetExpressCheckoutRequestDetails() != null) {
            _hashCode += getSetExpressCheckoutRequestDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetExpressCheckoutRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setExpressCheckoutRequestDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetExpressCheckoutRequestDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SetExpressCheckoutRequestDetailsType"));
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
