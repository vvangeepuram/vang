/**
 * GetMobileStatusRequestDetailsType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class GetMobileStatusRequestDetailsType  implements java.io.Serializable {
    /* Phone number for status inquiry */
    private eBLBaseComponents.apis.ebay.PhoneNumberType phone;

    public GetMobileStatusRequestDetailsType() {
    }

    public GetMobileStatusRequestDetailsType(
           eBLBaseComponents.apis.ebay.PhoneNumberType phone) {
           this.phone = phone;
    }


    /**
     * Gets the phone value for this GetMobileStatusRequestDetailsType.
     * 
     * @return phone   * Phone number for status inquiry
     */
    public eBLBaseComponents.apis.ebay.PhoneNumberType getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this GetMobileStatusRequestDetailsType.
     * 
     * @param phone   * Phone number for status inquiry
     */
    public void setPhone(eBLBaseComponents.apis.ebay.PhoneNumberType phone) {
        this.phone = phone;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMobileStatusRequestDetailsType)) return false;
        GetMobileStatusRequestDetailsType other = (GetMobileStatusRequestDetailsType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone())));
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
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetMobileStatusRequestDetailsType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "GetMobileStatusRequestDetailsType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "PhoneNumberType"));
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
