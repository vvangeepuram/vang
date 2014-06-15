/**
 * UserIdPasswordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class UserIdPasswordType  implements java.io.Serializable {
    private java.lang.String appId;

    private java.lang.String devId;

    private java.lang.String authCert;

    /* The username is the identifier for an account. */
    private java.lang.String username;

    /* Password contains the current password associated with the
     * username. */
    private java.lang.String password;

    /* Signature for Three Token authentication. */
    private java.lang.String signature;

    /* This field identifies an account (e.g., payment) on whose behalf
     * the operation is being performed. 
     * 						For instance one account holder may delegate the abililty to
     * perform certain operations 
     * 						to another account holder.  This delegation is done through
     * a separate mechanism.  
     * 						If the base username has not been authorized by the subject
     * the request will be rejected. */
    private java.lang.String subject;

    /* Authentication Session Token for authentication and authorization. */
    private java.lang.String authToken;

    public UserIdPasswordType() {
    }

    public UserIdPasswordType(
           java.lang.String appId,
           java.lang.String devId,
           java.lang.String authCert,
           java.lang.String username,
           java.lang.String password,
           java.lang.String signature,
           java.lang.String subject,
           java.lang.String authToken) {
           this.appId = appId;
           this.devId = devId;
           this.authCert = authCert;
           this.username = username;
           this.password = password;
           this.signature = signature;
           this.subject = subject;
           this.authToken = authToken;
    }


    /**
     * Gets the appId value for this UserIdPasswordType.
     * 
     * @return appId
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this UserIdPasswordType.
     * 
     * @param appId
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the devId value for this UserIdPasswordType.
     * 
     * @return devId
     */
    public java.lang.String getDevId() {
        return devId;
    }


    /**
     * Sets the devId value for this UserIdPasswordType.
     * 
     * @param devId
     */
    public void setDevId(java.lang.String devId) {
        this.devId = devId;
    }


    /**
     * Gets the authCert value for this UserIdPasswordType.
     * 
     * @return authCert
     */
    public java.lang.String getAuthCert() {
        return authCert;
    }


    /**
     * Sets the authCert value for this UserIdPasswordType.
     * 
     * @param authCert
     */
    public void setAuthCert(java.lang.String authCert) {
        this.authCert = authCert;
    }


    /**
     * Gets the username value for this UserIdPasswordType.
     * 
     * @return username   * The username is the identifier for an account.
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this UserIdPasswordType.
     * 
     * @param username   * The username is the identifier for an account.
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this UserIdPasswordType.
     * 
     * @return password   * Password contains the current password associated with the
     * username.
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this UserIdPasswordType.
     * 
     * @param password   * Password contains the current password associated with the
     * username.
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the signature value for this UserIdPasswordType.
     * 
     * @return signature   * Signature for Three Token authentication.
     */
    public java.lang.String getSignature() {
        return signature;
    }


    /**
     * Sets the signature value for this UserIdPasswordType.
     * 
     * @param signature   * Signature for Three Token authentication.
     */
    public void setSignature(java.lang.String signature) {
        this.signature = signature;
    }


    /**
     * Gets the subject value for this UserIdPasswordType.
     * 
     * @return subject   * This field identifies an account (e.g., payment) on whose behalf
     * the operation is being performed. 
     * 						For instance one account holder may delegate the abililty to
     * perform certain operations 
     * 						to another account holder.  This delegation is done through
     * a separate mechanism.  
     * 						If the base username has not been authorized by the subject
     * the request will be rejected.
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this UserIdPasswordType.
     * 
     * @param subject   * This field identifies an account (e.g., payment) on whose behalf
     * the operation is being performed. 
     * 						For instance one account holder may delegate the abililty to
     * perform certain operations 
     * 						to another account holder.  This delegation is done through
     * a separate mechanism.  
     * 						If the base username has not been authorized by the subject
     * the request will be rejected.
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the authToken value for this UserIdPasswordType.
     * 
     * @return authToken   * Authentication Session Token for authentication and authorization.
     */
    public java.lang.String getAuthToken() {
        return authToken;
    }


    /**
     * Sets the authToken value for this UserIdPasswordType.
     * 
     * @param authToken   * Authentication Session Token for authentication and authorization.
     */
    public void setAuthToken(java.lang.String authToken) {
        this.authToken = authToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserIdPasswordType)) return false;
        UserIdPasswordType other = (UserIdPasswordType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.devId==null && other.getDevId()==null) || 
             (this.devId!=null &&
              this.devId.equals(other.getDevId()))) &&
            ((this.authCert==null && other.getAuthCert()==null) || 
             (this.authCert!=null &&
              this.authCert.equals(other.getAuthCert()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.signature==null && other.getSignature()==null) || 
             (this.signature!=null &&
              this.signature.equals(other.getSignature()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.authToken==null && other.getAuthToken()==null) || 
             (this.authToken!=null &&
              this.authToken.equals(other.getAuthToken())));
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
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getDevId() != null) {
            _hashCode += getDevId().hashCode();
        }
        if (getAuthCert() != null) {
            _hashCode += getAuthCert().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSignature() != null) {
            _hashCode += getSignature().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getAuthToken() != null) {
            _hashCode += getAuthToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserIdPasswordType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "UserIdPasswordType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AppId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DevId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authToken");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AuthToken"));
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
