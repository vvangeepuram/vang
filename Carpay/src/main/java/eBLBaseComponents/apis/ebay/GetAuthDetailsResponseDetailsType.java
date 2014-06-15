/**
 * GetAuthDetailsResponseDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetAuthDetailsResponseDetailsType  implements java.io.Serializable {
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

    /* Encrypted PayPal customer account identification number.
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 127 single-byte characters. */
    private java.lang.String payerID;

    public GetAuthDetailsResponseDetailsType() {
    }

    public GetAuthDetailsResponseDetailsType(
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String email,
           java.lang.String payerID) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.email = email;
           this.payerID = payerID;
    }


    /**
     * Gets the firstName value for this GetAuthDetailsResponseDetailsType.
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
     * Sets the firstName value for this GetAuthDetailsResponseDetailsType.
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
     * Gets the lastName value for this GetAuthDetailsResponseDetailsType.
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
     * Sets the lastName value for this GetAuthDetailsResponseDetailsType.
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
     * Gets the email value for this GetAuthDetailsResponseDetailsType.
     * 
     * @return email   * The email address of the user.
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters.
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this GetAuthDetailsResponseDetailsType.
     * 
     * @param email   * The email address of the user.
     * 						Character length and limitations: 256 single-byte alphanumeric
     * characters.
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the payerID value for this GetAuthDetailsResponseDetailsType.
     * 
     * @return payerID   * Encrypted PayPal customer account identification number.
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 127 single-byte characters.
     */
    public java.lang.String getPayerID() {
        return payerID;
    }


    /**
     * Sets the payerID value for this GetAuthDetailsResponseDetailsType.
     * 
     * @param payerID   * Encrypted PayPal customer account identification number.
     * 
     * 						
     * 						
     * 						
     * 						
     * Character length and limitations: 127 single-byte characters.
     */
    public void setPayerID(java.lang.String payerID) {
        this.payerID = payerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAuthDetailsResponseDetailsType)) return false;
        GetAuthDetailsResponseDetailsType other = (GetAuthDetailsResponseDetailsType) obj;
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
        if (getPayerID() != null) {
            _hashCode += getPayerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAuthDetailsResponseDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetAuthDetailsResponseDetailsType"));
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
