/**
 * GetAccessPermissionDetailsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetAccessPermissionDetailsResponseDetailsType  implements java.io.Serializable {
    /* The first name of the User.
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String firstName;

    /* The Last name of the user.
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters */
    private java.lang.String lastName;

    /* The email address of the user.
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters. */
    private java.lang.String email;

    /* contains information about API Services */
    private java.lang.String[] accessPermissionName;

    /* contains information about API Services */
    private java.lang.String[] accessPermissionStatus;

    /* Encrypted PayPal customer account identification number.
     * 						
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: 127 single-byte characters. */
    private java.lang.String payerID;

    public GetAccessPermissionDetailsResponseDetailsType() {
    }

    public GetAccessPermissionDetailsResponseDetailsType(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String email,
           java.lang.String[] accessPermissionName,
           java.lang.String[] accessPermissionStatus,
           java.lang.String payerID) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.accessPermissionName = accessPermissionName;
           this.accessPermissionStatus = accessPermissionStatus;
           this.payerID = payerID;
    }


    /**
     * Gets the firstName value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @return firstName   * The first name of the User.
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @param firstName   * The first name of the User.
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @return lastName   * The Last name of the user.
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @param lastName   * The Last name of the user.
     * 						
     * 						Character length and limitations: 127 single-byte alphanumeric
     * characters
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the email value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @return email   * The email address of the user.
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @param email   * The email address of the user.
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the accessPermissionName value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @return accessPermissionName   * contains information about API Services
     */
    public java.lang.String[] getAccessPermissionName() {
        return accessPermissionName;
    }


    /**
     * Sets the accessPermissionName value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @param accessPermissionName   * contains information about API Services
     */
    public void setAccessPermissionName(java.lang.String[] accessPermissionName) {
        this.accessPermissionName = accessPermissionName;
    }

    public java.lang.String getAccessPermissionName(int i) {
        return this.accessPermissionName[i];
    }

    public void setAccessPermissionName(int i, java.lang.String _value) {
        this.accessPermissionName[i] = _value;
    }


    /**
     * Gets the accessPermissionStatus value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @return accessPermissionStatus   * contains information about API Services
     */
    public java.lang.String[] getAccessPermissionStatus() {
        return accessPermissionStatus;
    }


    /**
     * Sets the accessPermissionStatus value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @param accessPermissionStatus   * contains information about API Services
     */
    public void setAccessPermissionStatus(java.lang.String[] accessPermissionStatus) {
        this.accessPermissionStatus = accessPermissionStatus;
    }

    public java.lang.String getAccessPermissionStatus(int i) {
        return this.accessPermissionStatus[i];
    }

    public void setAccessPermissionStatus(int i, java.lang.String _value) {
        this.accessPermissionStatus[i] = _value;
    }


    /**
     * Gets the payerID value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @return payerID   * Encrypted PayPal customer account identification number.
     * 						
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: 127 single-byte characters.
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this GetAccessPermissionDetailsResponseDetailsType.
     * 
     * @param payerID   * Encrypted PayPal customer account identification number.
     * 						
     * 						
     * 						
     * 						
     * 						
     * 						Character length and limitations: 127 single-byte characters.
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAccessPermissionDetailsResponseDetailsType)) return false;
        GetAccessPermissionDetailsResponseDetailsType other = (GetAccessPermissionDetailsResponseDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.accessPermissionName==null && other.getAccessPermissionName()==null) || 
             (this.accessPermissionName!=null &&
              java.util.Arrays.equals(this.accessPermissionName, other.getAccessPermissionName()))) &&
            ((this.accessPermissionStatus==null && other.getAccessPermissionStatus()==null) || 
             (this.accessPermissionStatus!=null &&
              java.util.Arrays.equals(this.accessPermissionStatus, other.getAccessPermissionStatus()))) &&
            ((this.payerID==null && other.getPayerID()==null) || 
             (this.payerID!=null &&
              this.payerID.equals(other.getPayerID())));
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getAccessPermissionName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessPermissionName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessPermissionName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessPermissionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessPermissionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessPermissionStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAccessPermissionDetailsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetAccessPermissionDetailsResponseDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPermissionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccessPermissionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPermissionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "AccessPermissionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payerID");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
