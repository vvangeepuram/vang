/**
 * RememberMeIDInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class RememberMeIDInfoType  implements java.io.Serializable {
    /* External remember-me ID returned by GetExpressCheckoutDetails
     * on successful opt-in. The
     * 						ExternalRememberMeID is a 17-character alphanumeric (encrypted)
     * string that identifies
     * 						the buyer's remembered login with a merchant and has meaning
     * only to the merchant.	If
     * 						present, requests that the web flow attempt bypass of login. */
    private java.lang.String externalRememberMeID;

    public RememberMeIDInfoType() {
    }

    public RememberMeIDInfoType(
           java.lang.String externalRememberMeID) {
           this.externalRememberMeID = externalRememberMeID;
    }


    /**
     * Gets the externalRememberMeID value for this RememberMeIDInfoType.
     * 
     * @return externalRememberMeID   * External remember-me ID returned by GetExpressCheckoutDetails
     * on successful opt-in. The
     * 						ExternalRememberMeID is a 17-character alphanumeric (encrypted)
     * string that identifies
     * 						the buyer's remembered login with a merchant and has meaning
     * only to the merchant.	If
     * 						present, requests that the web flow attempt bypass of login.
     */
    public java.lang.String getExternalRememberMeID() {
        return externalRememberMeID;
    }


    /**
     * Sets the externalRememberMeID value for this RememberMeIDInfoType.
     * 
     * @param externalRememberMeID   * External remember-me ID returned by GetExpressCheckoutDetails
     * on successful opt-in. The
     * 						ExternalRememberMeID is a 17-character alphanumeric (encrypted)
     * string that identifies
     * 						the buyer's remembered login with a merchant and has meaning
     * only to the merchant.	If
     * 						present, requests that the web flow attempt bypass of login.
     */
    public void setExternalRememberMeID(java.lang.String externalRememberMeID) {
        this.externalRememberMeID = externalRememberMeID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RememberMeIDInfoType)) return false;
        RememberMeIDInfoType other = (RememberMeIDInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRememberMeID==null && other.getExternalRememberMeID()==null) || 
             (this.externalRememberMeID!=null &&
              this.externalRememberMeID.equals(other.getExternalRememberMeID())));
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
        if (getExternalRememberMeID() != null) {
            _hashCode += getExternalRememberMeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RememberMeIDInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "RememberMeIDInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRememberMeID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ExternalRememberMeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
