/**
 * CustomSecurityHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Custom Securiy Header.
 */
public class CustomSecurityHeaderType  implements java.io.Serializable {
    private java.lang.String eBayAuthToken;

    private java.lang.String hardExpirationWarning;

    private eBLBaseComponents.apis.ebay.UserIdPasswordType credentials;

    public CustomSecurityHeaderType() {
    }

    public CustomSecurityHeaderType(
           java.lang.String eBayAuthToken,
           java.lang.String hardExpirationWarning,
           eBLBaseComponents.apis.ebay.UserIdPasswordType credentials) {
           this.eBayAuthToken = eBayAuthToken;
           this.hardExpirationWarning = hardExpirationWarning;
           this.credentials = credentials;
    }


    /**
     * Gets the eBayAuthToken value for this CustomSecurityHeaderType.
     * 
     * @return eBayAuthToken
     */
    public java.lang.String getEBayAuthToken() {
        return eBayAuthToken;
    }


    /**
     * Sets the eBayAuthToken value for this CustomSecurityHeaderType.
     * 
     * @param eBayAuthToken
     */
    public void setEBayAuthToken(java.lang.String eBayAuthToken) {
        this.eBayAuthToken = eBayAuthToken;
    }


    /**
     * Gets the hardExpirationWarning value for this CustomSecurityHeaderType.
     * 
     * @return hardExpirationWarning
     */
    public java.lang.String getHardExpirationWarning() {
        return hardExpirationWarning;
    }


    /**
     * Sets the hardExpirationWarning value for this CustomSecurityHeaderType.
     * 
     * @param hardExpirationWarning
     */
    public void setHardExpirationWarning(java.lang.String hardExpirationWarning) {
        this.hardExpirationWarning = hardExpirationWarning;
    }


    /**
     * Gets the credentials value for this CustomSecurityHeaderType.
     * 
     * @return credentials
     */
    public eBLBaseComponents.apis.ebay.UserIdPasswordType getCredentials() {
        return credentials;
    }


    /**
     * Sets the credentials value for this CustomSecurityHeaderType.
     * 
     * @param credentials
     */
    public void setCredentials(eBLBaseComponents.apis.ebay.UserIdPasswordType credentials) {
        this.credentials = credentials;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomSecurityHeaderType)) return false;
        CustomSecurityHeaderType other = (CustomSecurityHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eBayAuthToken==null && other.getEBayAuthToken()==null) || 
             (this.eBayAuthToken!=null &&
              this.eBayAuthToken.equals(other.getEBayAuthToken()))) &&
            ((this.hardExpirationWarning==null && other.getHardExpirationWarning()==null) || 
             (this.hardExpirationWarning!=null &&
              this.hardExpirationWarning.equals(other.getHardExpirationWarning()))) &&
            ((this.credentials==null && other.getCredentials()==null) || 
             (this.credentials!=null &&
              this.credentials.equals(other.getCredentials())));
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
        if (getEBayAuthToken() != null) {
            _hashCode += getEBayAuthToken().hashCode();
        }
        if (getHardExpirationWarning() != null) {
            _hashCode += getHardExpirationWarning().hashCode();
        }
        if (getCredentials() != null) {
            _hashCode += getCredentials().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomSecurityHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CustomSecurityHeaderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayAuthToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "eBayAuthToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardExpirationWarning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HardExpirationWarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("credentials");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Credentials"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIdPasswordType"));
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
