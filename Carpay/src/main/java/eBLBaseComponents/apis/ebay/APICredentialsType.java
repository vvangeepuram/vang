/**
 * APICredentialsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * APICredentialsType
 */
public class APICredentialsType  implements java.io.Serializable {
    /* Merchantâs PayPal API username
     * Character length and limitations: 128 alphanumeric characters */
    private java.lang.String username;

    /* Merchantâs PayPal API password
     * Character length and limitations: 40 alphanumeric characters */
    private java.lang.String password;

    /* Merchantâs PayPal API signature, if one exists.
     * 
     * 						Character length and limitations: 256 alphanumeric characters */
    private java.lang.String signature;

    /* Merchantâs PayPal API certificate in PEM format, if one exists
     * 			
     * 						
     * 			The certificate consists of two parts: the private key (2,048 bytes)
     * and the certificate proper (4,000 bytes).
     * 
     * 						
     * 						Character length and limitations: 6,048 alphanumeric characters */
    private java.lang.String certificate;

    /* Merchantâs PayPal API authentication mechanism.
     * 			
     * 						
     * Auth-None: no authentication mechanism on file
     * 
     * 						Cert: API certificate
     * 
     * 						Sign: API signature
     * 
     * 						Character length and limitations: 9 alphanumeric characters */
    private eBLBaseComponents.apis.ebay.APIAuthenticationType type;

    public APICredentialsType() {
    }

    public APICredentialsType(
           java.lang.String username,
           java.lang.String password,
           java.lang.String signature,
           java.lang.String certificate,
           eBLBaseComponents.apis.ebay.APIAuthenticationType type) {
           this.username = username;
           this.password = password;
           this.signature = signature;
           this.certificate = certificate;
           this.type = type;
    }


    /**
     * Gets the username value for this APICredentialsType.
     * 
     * @return username   * Merchantâs PayPal API username
     * Character length and limitations: 128 alphanumeric characters
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this APICredentialsType.
     * 
     * @param username   * Merchantâs PayPal API username
     * Character length and limitations: 128 alphanumeric characters
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this APICredentialsType.
     * 
     * @return password   * Merchantâs PayPal API password
     * Character length and limitations: 40 alphanumeric characters
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this APICredentialsType.
     * 
     * @param password   * Merchantâs PayPal API password
     * Character length and limitations: 40 alphanumeric characters
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the signature value for this APICredentialsType.
     * 
     * @return signature   * Merchantâs PayPal API signature, if one exists.
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this APICredentialsType.
     * 
     * @param signature   * Merchantâs PayPal API signature, if one exists.
     * 
     * 						Character length and limitations: 256 alphanumeric characters
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the certificate value for this APICredentialsType.
     * 
     * @return certificate   * Merchantâs PayPal API certificate in PEM format, if one exists
     * 			
     * 						
     * 			The certificate consists of two parts: the private key (2,048 bytes)
     * and the certificate proper (4,000 bytes).
     * 
     * 						
     * 						Character length and limitations: 6,048 alphanumeric characters
     */
    public java.lang.String getCertificate() {
        return certificate;
    }


    /**
     * Sets the certificate value for this APICredentialsType.
     * 
     * @param certificate   * Merchantâs PayPal API certificate in PEM format, if one exists
     * 			
     * 						
     * 			The certificate consists of two parts: the private key (2,048 bytes)
     * and the certificate proper (4,000 bytes).
     * 
     * 						
     * 						Character length and limitations: 6,048 alphanumeric characters
     */
    public void setCertificate(java.lang.String certificate) {
        this.certificate = certificate;
    }


    /**
     * Gets the type value for this APICredentialsType.
     * 
     * @return type   * Merchantâs PayPal API authentication mechanism.
     * 			
     * 						
     * Auth-None: no authentication mechanism on file
     * 
     * 						Cert: API certificate
     * 
     * 						Sign: API signature
     * 
     * 						Character length and limitations: 9 alphanumeric characters
     */
    public eBLBaseComponents.apis.ebay.APIAuthenticationType getType() {
        return type;
    }


    /**
     * Sets the type value for this APICredentialsType.
     * 
     * @param type   * Merchantâs PayPal API authentication mechanism.
     * 			
     * 						
     * Auth-None: no authentication mechanism on file
     * 
     * 						Cert: API certificate
     * 
     * 						Sign: API signature
     * 
     * 						Character length and limitations: 9 alphanumeric characters
     */
    public void setType(eBLBaseComponents.apis.ebay.APIAuthenticationType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APICredentialsType)) return false;
        APICredentialsType other = (APICredentialsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.certificate==null && other.getCertificate()==null) || 
             (this.certificate!=null &&
              this.certificate.equals(other.getCertificate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getCertificate() != null) {
            _hashCode += getCertificate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APICredentialsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APICredentialsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signature");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Signature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certificate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Certificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "APIAuthenticationType"));
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
