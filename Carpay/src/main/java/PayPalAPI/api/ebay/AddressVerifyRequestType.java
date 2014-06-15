/**
 * AddressVerifyRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class AddressVerifyRequestType  extends eBLBaseComponents.apis.ebay.AbstractRequestType  implements java.io.Serializable {
    /* Email address of buyer to be verified. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Maximum string length: 255 single-byte characters Input mask: ?@?.?? */
    private java.lang.String email;

    /* First line of buyer’s billing or shipping street address to
     * be verified. 
     * 
     * 										
     * 										
     * 										
     * 										For verification, input value of street address must match
     * the first three single-byte characters of the street address on file
     * for the PayPal account.
     * 
     * 										
     * Maximum string length: 35 single-byte characters Alphanumeric plus
     * - , . ‘ # \ Whitespace and case of input value are ignored. */
    private java.lang.String street;

    /* Postal code to be verified. 
     * 
     * 										
     * 										
     * 										
     * 										
     * 
     * For verification, input value of postal code must match the first
     * five single-byte characters of the postal code on file for the PayPal
     * account.
     * 
     * 										
     * Maximum string length: 16 single-byte characters Whitespace and case
     * of input value are ignored. */
    private java.lang.String zip;

    public AddressVerifyRequestType() {
    }

    public AddressVerifyRequestType(
           eBLBaseComponents.apis.ebay.DetailLevelCodeType[] detailLevel,
           java.lang.String errorLanguage,
           java.lang.String version,
           org.apache.axis.message.MessageElement [] _any,
           java.lang.String email,
           java.lang.String street,
           java.lang.String zip) {
        super(
            detailLevel,
            errorLanguage,
            version,
            _any);
        this.email = email;
        this.street = street;
        this.zip = zip;
    }


    /**
     * Gets the email value for this AddressVerifyRequestType.
     * 
     * @return email   * Email address of buyer to be verified. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Maximum string length: 255 single-byte characters Input mask: ?@?.??
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this AddressVerifyRequestType.
     * 
     * @param email   * Email address of buyer to be verified. 
     * 
     * 										
     * 										
     * 										
     * 										
     * Maximum string length: 255 single-byte characters Input mask: ?@?.??
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the street value for this AddressVerifyRequestType.
     * 
     * @return street   * First line of buyer’s billing or shipping street address to
     * be verified. 
     * 
     * 										
     * 										
     * 										
     * 										For verification, input value of street address must match
     * the first three single-byte characters of the street address on file
     * for the PayPal account.
     * 
     * 										
     * Maximum string length: 35 single-byte characters Alphanumeric plus
     * - , . ‘ # \ Whitespace and case of input value are ignored.
     */
    public java.lang.String getStreet() {
        return street;
    }


    /**
     * Sets the street value for this AddressVerifyRequestType.
     * 
     * @param street   * First line of buyer’s billing or shipping street address to
     * be verified. 
     * 
     * 										
     * 										
     * 										
     * 										For verification, input value of street address must match
     * the first three single-byte characters of the street address on file
     * for the PayPal account.
     * 
     * 										
     * Maximum string length: 35 single-byte characters Alphanumeric plus
     * - , . ‘ # \ Whitespace and case of input value are ignored.
     */
    public void setStreet(java.lang.String street) {
        this.street = street;
    }


    /**
     * Gets the zip value for this AddressVerifyRequestType.
     * 
     * @return zip   * Postal code to be verified. 
     * 
     * 										
     * 										
     * 										
     * 										
     * 
     * For verification, input value of postal code must match the first
     * five single-byte characters of the postal code on file for the PayPal
     * account.
     * 
     * 										
     * Maximum string length: 16 single-byte characters Whitespace and case
     * of input value are ignored.
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this AddressVerifyRequestType.
     * 
     * @param zip   * Postal code to be verified. 
     * 
     * 										
     * 										
     * 										
     * 										
     * 
     * For verification, input value of postal code must match the first
     * five single-byte characters of the postal code on file for the PayPal
     * account.
     * 
     * 										
     * Maximum string length: 16 single-byte characters Whitespace and case
     * of input value are ignored.
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressVerifyRequestType)) return false;
        AddressVerifyRequestType other = (AddressVerifyRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.street==null && other.getStreet()==null) || 
             (this.street!=null &&
              this.street.equals(other.getStreet()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip())));
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
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getStreet() != null) {
            _hashCode += getStreet().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressVerifyRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AddressVerifyRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Street"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "Zip"));
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
