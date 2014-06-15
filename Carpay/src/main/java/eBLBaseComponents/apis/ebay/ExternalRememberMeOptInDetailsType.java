/**
 * ExternalRememberMeOptInDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class ExternalRememberMeOptInDetailsType  implements java.io.Serializable {
    /* 1 = opt in to external remember me.
     * 								0 or omitted = no opt-in
     * 								Other values are invalid */
    private java.lang.String externalRememberMeOptIn;

    /* E-mail address or secure merchant account ID of merchant to
     * associate with new external remember-me. Currently,
     * 								the owner must be either the API actor or omitted/none.  In
     * the future, we may allow the owner to be a 3rd party
     * 								merchant account. */
    private eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails;

    public ExternalRememberMeOptInDetailsType() {
    }

    public ExternalRememberMeOptInDetailsType(
           java.lang.String externalRememberMeOptIn,
           eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails) {
           this.externalRememberMeOptIn = externalRememberMeOptIn;
           this.externalRememberMeOwnerDetails = externalRememberMeOwnerDetails;
    }


    /**
     * Gets the externalRememberMeOptIn value for this ExternalRememberMeOptInDetailsType.
     * 
     * @return externalRememberMeOptIn   * 1 = opt in to external remember me.
     * 								0 or omitted = no opt-in
     * 								Other values are invalid
     */
    public java.lang.String getExternalRememberMeOptIn() {
        return externalRememberMeOptIn;
    }


    /**
     * Sets the externalRememberMeOptIn value for this ExternalRememberMeOptInDetailsType.
     * 
     * @param externalRememberMeOptIn   * 1 = opt in to external remember me.
     * 								0 or omitted = no opt-in
     * 								Other values are invalid
     */
    public void setExternalRememberMeOptIn(java.lang.String externalRememberMeOptIn) {
        this.externalRememberMeOptIn = externalRememberMeOptIn;
    }


    /**
     * Gets the externalRememberMeOwnerDetails value for this ExternalRememberMeOptInDetailsType.
     * 
     * @return externalRememberMeOwnerDetails   * E-mail address or secure merchant account ID of merchant to
     * associate with new external remember-me. Currently,
     * 								the owner must be either the API actor or omitted/none.  In
     * the future, we may allow the owner to be a 3rd party
     * 								merchant account.
     */
    public eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType getExternalRememberMeOwnerDetails() {
        return externalRememberMeOwnerDetails;
    }


    /**
     * Sets the externalRememberMeOwnerDetails value for this ExternalRememberMeOptInDetailsType.
     * 
     * @param externalRememberMeOwnerDetails   * E-mail address or secure merchant account ID of merchant to
     * associate with new external remember-me. Currently,
     * 								the owner must be either the API actor or omitted/none.  In
     * the future, we may allow the owner to be a 3rd party
     * 								merchant account.
     */
    public void setExternalRememberMeOwnerDetails(eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails) {
        this.externalRememberMeOwnerDetails = externalRememberMeOwnerDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRememberMeOptInDetailsType)) return false;
        ExternalRememberMeOptInDetailsType other = (ExternalRememberMeOptInDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRememberMeOptIn==null && other.getExternalRememberMeOptIn()==null) || 
             (this.externalRememberMeOptIn!=null &&
              this.externalRememberMeOptIn.equals(other.getExternalRememberMeOptIn()))) &&
            ((this.externalRememberMeOwnerDetails==null && other.getExternalRememberMeOwnerDetails()==null) || 
             (this.externalRememberMeOwnerDetails!=null &&
              this.externalRememberMeOwnerDetails.equals(other.getExternalRememberMeOwnerDetails())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getExternalRememberMeOptIn() != null) {
            _hashCode += getExternalRememberMeOptIn().hashCode();
        }
        if (getExternalRememberMeOwnerDetails() != null) {
            _hashCode += getExternalRememberMeOwnerDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRememberMeOptInDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOptInDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOptIn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOptIn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOwnerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOwnerDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeOwnerDetailsType"));
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
