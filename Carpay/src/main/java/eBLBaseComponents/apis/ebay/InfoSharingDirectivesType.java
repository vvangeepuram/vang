/**
 * InfoSharingDirectivesType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;

public class InfoSharingDirectivesType  implements java.io.Serializable {
    /* If Billing Address should be returned in GetExpressCheckoutDetails
     * response, this parameter should be set to yes here */
    private java.lang.String reqBillingAddress;

    public InfoSharingDirectivesType() {
    }

    public InfoSharingDirectivesType(
           java.lang.String reqBillingAddress) {
           this.reqBillingAddress = reqBillingAddress;
    }


    /**
     * Gets the reqBillingAddress value for this InfoSharingDirectivesType.
     * 
     * @return reqBillingAddress   * If Billing Address should be returned in GetExpressCheckoutDetails
     * response, this parameter should be set to yes here
     */
    public java.lang.String getReqBillingAddress() {
        return reqBillingAddress;
    }


    /**
     * Sets the reqBillingAddress value for this InfoSharingDirectivesType.
     * 
     * @param reqBillingAddress   * If Billing Address should be returned in GetExpressCheckoutDetails
     * response, this parameter should be set to yes here
     */
    public void setReqBillingAddress(java.lang.String reqBillingAddress) {
        this.reqBillingAddress = reqBillingAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoSharingDirectivesType)) return false;
        InfoSharingDirectivesType other = (InfoSharingDirectivesType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reqBillingAddress==null && other.getReqBillingAddress()==null) || 
             (this.reqBillingAddress!=null &&
              this.reqBillingAddress.equals(other.getReqBillingAddress())));
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
        if (getReqBillingAddress() != null) {
            _hashCode += getReqBillingAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoSharingDirectivesType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "InfoSharingDirectivesType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqBillingAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ReqBillingAddress"));
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
