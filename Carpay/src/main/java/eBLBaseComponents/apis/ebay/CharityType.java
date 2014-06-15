/**
 * CharityType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * Contains information about a Charity listing.in case of revision
 * - all data can be min occur = 0
 */
public class CharityType  implements java.io.Serializable {
    private java.lang.String charityName;

    private java.lang.Integer charityNumber;

    private java.lang.Float donationPercent;

    public CharityType() {
    }

    public CharityType(
           java.lang.String charityName,
           java.lang.Integer charityNumber,
           java.lang.Float donationPercent) {
           this.charityName = charityName;
           this.charityNumber = charityNumber;
           this.donationPercent = donationPercent;
    }


    /**
     * Gets the charityName value for this CharityType.
     * 
     * @return charityName
     */
    public java.lang.String getCharityName() {
        return charityName;
    }


    /**
     * Sets the charityName value for this CharityType.
     * 
     * @param charityName
     */
    public void setCharityName(java.lang.String charityName) {
        this.charityName = charityName;
    }


    /**
     * Gets the charityNumber value for this CharityType.
     * 
     * @return charityNumber
     */
    public java.lang.Integer getCharityNumber() {
        return charityNumber;
    }


    /**
     * Sets the charityNumber value for this CharityType.
     * 
     * @param charityNumber
     */
    public void setCharityNumber(java.lang.Integer charityNumber) {
        this.charityNumber = charityNumber;
    }


    /**
     * Gets the donationPercent value for this CharityType.
     * 
     * @return donationPercent
     */
    public java.lang.Float getDonationPercent() {
        return donationPercent;
    }


    /**
     * Sets the donationPercent value for this CharityType.
     * 
     * @param donationPercent
     */
    public void setDonationPercent(java.lang.Float donationPercent) {
        this.donationPercent = donationPercent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CharityType)) return false;
        CharityType other = (CharityType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.charityName==null && other.getCharityName()==null) || 
             (this.charityName!=null &&
              this.charityName.equals(other.getCharityName()))) &&
            ((this.charityNumber==null && other.getCharityNumber()==null) || 
             (this.charityNumber!=null &&
              this.charityNumber.equals(other.getCharityNumber()))) &&
            ((this.donationPercent==null && other.getDonationPercent()==null) || 
             (this.donationPercent!=null &&
              this.donationPercent.equals(other.getDonationPercent())));
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
        if (getCharityName() != null) {
            _hashCode += getCharityName().hashCode();
        }
        if (getCharityNumber() != null) {
            _hashCode += getCharityNumber().hashCode();
        }
        if (getDonationPercent() != null) {
            _hashCode += getDonationPercent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CharityType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CharityType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charityName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CharityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "CharityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donationPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "DonationPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
