/**
 * ExternalRememberMeOptOutRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ExternalRememberMeOptOutRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* The merchant passes in the ExternalRememberMeID to identify
     * the user to opt out.  This is a 17-character
     * 										alphanumeric (encrypted) string that identifies the buyer's
     * remembered login with a merchant and has
     * 										meaning only to the merchant. */
    private java.lang.String externalRememberMeID;

    /* E-mail address or secure merchant account ID of merchant to
     * associate with
     * 										external remember-me. */
    private eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails;

    public ExternalRememberMeOptOutRequestType() {
    }

    public ExternalRememberMeOptOutRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String externalRememberMeID,
           eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.externalRememberMeID = externalRememberMeID;
        this.externalRememberMeOwnerDetails = externalRememberMeOwnerDetails;
    }


    /**
     * Gets the externalRememberMeID value for this ExternalRememberMeOptOutRequestType.
     * 
     * @return externalRememberMeID   * The merchant passes in the ExternalRememberMeID to identify
     * the user to opt out.  This is a 17-character
     * 										alphanumeric (encrypted) string that identifies the buyer's
     * remembered login with a merchant and has
     * 										meaning only to the merchant.
     */
    public java.lang.String getExternalRememberMeID() {
        return externalRememberMeID;
    }


    /**
     * Sets the externalRememberMeID value for this ExternalRememberMeOptOutRequestType.
     * 
     * @param externalRememberMeID   * The merchant passes in the ExternalRememberMeID to identify
     * the user to opt out.  This is a 17-character
     * 										alphanumeric (encrypted) string that identifies the buyer's
     * remembered login with a merchant and has
     * 										meaning only to the merchant.
     */
    public void setExternalRememberMeID(java.lang.String externalRememberMeID) {
        this.externalRememberMeID = externalRememberMeID;
    }


    /**
     * Gets the externalRememberMeOwnerDetails value for this ExternalRememberMeOptOutRequestType.
     * 
     * @return externalRememberMeOwnerDetails   * E-mail address or secure merchant account ID of merchant to
     * associate with
     * 										external remember-me.
     */
    public eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType getExternalRememberMeOwnerDetails() {
        return externalRememberMeOwnerDetails;
    }


    /**
     * Sets the externalRememberMeOwnerDetails value for this ExternalRememberMeOptOutRequestType.
     * 
     * @param externalRememberMeOwnerDetails   * E-mail address or secure merchant account ID of merchant to
     * associate with
     * 										external remember-me.
     */
    public void setExternalRememberMeOwnerDetails(eBLBaseComponents.apis.ebay.ExternalRememberMeOwnerDetailsType externalRememberMeOwnerDetails) {
        this.externalRememberMeOwnerDetails = externalRememberMeOwnerDetails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRememberMeOptOutRequestType)) return false;
        ExternalRememberMeOptOutRequestType other = (ExternalRememberMeOptOutRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalRememberMeID==null && other.getExternalRememberMeID()==null) || 
             (this.externalRememberMeID!=null &&
              this.externalRememberMeID.equals(other.getExternalRememberMeID()))) &&
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
        int _hashCode = super.hashCode();
        if (getExternalRememberMeID() != null) {
            _hashCode += getExternalRememberMeID().hashCode();
        }
        if (getExternalRememberMeOwnerDetails() != null) {
            _hashCode += getExternalRememberMeOwnerDetails().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRememberMeOptOutRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOptOutRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeOwnerDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExternalRememberMeOwnerDetails"));
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
