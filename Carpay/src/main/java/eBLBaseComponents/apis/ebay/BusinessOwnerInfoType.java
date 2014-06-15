/**
 * BusinessOwnerInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * BusinessOwnerInfoType
 */
public class BusinessOwnerInfoType  implements java.io.Serializable {
    /* Details about the business owner */
    private eBLBaseComponents.apis.ebay.PayerInfoType owner;

    /* Business ownerâs home telephone number
     * 
     * 						Character length and limitations: 32 alphanumeric characters */
    private java.lang.String homePhone;

    /* Business ownerâs mobile telephone number
     * 
     * 						
     * Character length and limitations: 32 alphanumeric characters */
    private java.lang.String mobilePhone;

    /* Business ownerâs social security number
     * 
     * 						
     * Character length and limitations: 9 alphanumeric characters */
    private java.lang.String SSN;

    public BusinessOwnerInfoType() {
    }

    public BusinessOwnerInfoType(
           eBLBaseComponents.apis.ebay.PayerInfoType owner,
           java.lang.String homePhone,
           java.lang.String mobilePhone,
           java.lang.String SSN) {
           this.owner = owner;
           this.homePhone = homePhone;
           this.mobilePhone = mobilePhone;
           this.SSN = SSN;
    }


    /**
     * Gets the owner value for this BusinessOwnerInfoType.
     * 
     * @return owner   * Details about the business owner
     */
    public eBLBaseComponents.apis.ebay.PayerInfoType getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this BusinessOwnerInfoType.
     * 
     * @param owner   * Details about the business owner
     */
    public void setOwner(eBLBaseComponents.apis.ebay.PayerInfoType owner) {
        this.owner = owner;
    }


    /**
     * Gets the homePhone value for this BusinessOwnerInfoType.
     * 
     * @return homePhone   * Business ownerâs home telephone number
     * 
     * 						Character length and limitations: 32 alphanumeric characters
     */
    public java.lang.String getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this BusinessOwnerInfoType.
     * 
     * @param homePhone   * Business ownerâs home telephone number
     * 
     * 						Character length and limitations: 32 alphanumeric characters
     */
    public void setHomePhone(java.lang.String homePhone) {
        this.homePhone = homePhone;
    }


    /**
     * Gets the mobilePhone value for this BusinessOwnerInfoType.
     * 
     * @return mobilePhone   * Business ownerâs mobile telephone number
     * 
     * 						
     * Character length and limitations: 32 alphanumeric characters
     */
    public java.lang.String getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this BusinessOwnerInfoType.
     * 
     * @param mobilePhone   * Business ownerâs mobile telephone number
     * 
     * 						
     * Character length and limitations: 32 alphanumeric characters
     */
    public void setMobilePhone(java.lang.String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }


    /**
     * Gets the SSN value for this BusinessOwnerInfoType.
     * 
     * @return SSN   * Business ownerâs social security number
     * 
     * 						
     * Character length and limitations: 9 alphanumeric characters
     */
    public java.lang.String getSSN() {
        return SSN;
    }


    /**
     * Sets the SSN value for this BusinessOwnerInfoType.
     * 
     * @param SSN   * Business ownerâs social security number
     * 
     * 						
     * Character length and limitations: 9 alphanumeric characters
     */
    public void setSSN(java.lang.String SSN) {
        this.SSN = SSN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessOwnerInfoType)) return false;
        BusinessOwnerInfoType other = (BusinessOwnerInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              this.homePhone.equals(other.getHomePhone()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              this.mobilePhone.equals(other.getMobilePhone()))) &&
            ((this.SSN==null && other.getSSN()==null) || 
             (this.SSN!=null &&
              this.SSN.equals(other.getSSN())));
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
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getHomePhone() != null) {
            _hashCode += getHomePhone().hashCode();
        }
        if (getMobilePhone() != null) {
            _hashCode += getMobilePhone().hashCode();
        }
        if (getSSN() != null) {
            _hashCode += getSSN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessOwnerInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "BusinessOwnerInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PayerInfoType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "HomePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "MobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSN");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "SSN"));
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
