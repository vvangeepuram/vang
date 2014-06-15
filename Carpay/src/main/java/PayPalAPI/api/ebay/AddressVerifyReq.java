/**
 * AddressVerifyReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class AddressVerifyReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.AddressVerifyRequestType addressVerifyRequest;

    public AddressVerifyReq() {
    }

    public AddressVerifyReq(
           PayPalAPI.api.ebay.AddressVerifyRequestType addressVerifyRequest) {
           this.addressVerifyRequest = addressVerifyRequest;
    }


    /**
     * Gets the addressVerifyRequest value for this AddressVerifyReq.
     * 
     * @return addressVerifyRequest
     */
    public PayPalAPI.api.ebay.AddressVerifyRequestType getAddressVerifyRequest() {
        return addressVerifyRequest;
    }


    /**
     * Sets the addressVerifyRequest value for this AddressVerifyReq.
     * 
     * @param addressVerifyRequest
     */
    public void setAddressVerifyRequest(PayPalAPI.api.ebay.AddressVerifyRequestType addressVerifyRequest) {
        this.addressVerifyRequest = addressVerifyRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddressVerifyReq)) return false;
        AddressVerifyReq other = (AddressVerifyReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressVerifyRequest==null && other.getAddressVerifyRequest()==null) || 
             (this.addressVerifyRequest!=null &&
              this.addressVerifyRequest.equals(other.getAddressVerifyRequest())));
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
        if (getAddressVerifyRequest() != null) {
            _hashCode += getAddressVerifyRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddressVerifyReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">AddressVerifyReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressVerifyRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AddressVerifyRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "AddressVerifyRequestType"));
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
