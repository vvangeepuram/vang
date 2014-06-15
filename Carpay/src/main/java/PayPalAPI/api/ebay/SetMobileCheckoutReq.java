/**
 * SetMobileCheckoutReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class SetMobileCheckoutReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.SetMobileCheckoutRequestType setMobileCheckoutRequest;

    public SetMobileCheckoutReq() {
    }

    public SetMobileCheckoutReq(
           PayPalAPI.api.ebay.SetMobileCheckoutRequestType setMobileCheckoutRequest) {
           this.setMobileCheckoutRequest = setMobileCheckoutRequest;
    }


    /**
     * Gets the setMobileCheckoutRequest value for this SetMobileCheckoutReq.
     * 
     * @return setMobileCheckoutRequest
     */
    public PayPalAPI.api.ebay.SetMobileCheckoutRequestType getSetMobileCheckoutRequest() {
        return setMobileCheckoutRequest;
    }


    /**
     * Sets the setMobileCheckoutRequest value for this SetMobileCheckoutReq.
     * 
     * @param setMobileCheckoutRequest
     */
    public void setSetMobileCheckoutRequest(PayPalAPI.api.ebay.SetMobileCheckoutRequestType setMobileCheckoutRequest) {
        this.setMobileCheckoutRequest = setMobileCheckoutRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMobileCheckoutReq)) return false;
        SetMobileCheckoutReq other = (SetMobileCheckoutReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setMobileCheckoutRequest==null && other.getSetMobileCheckoutRequest()==null) || 
             (this.setMobileCheckoutRequest!=null &&
              this.setMobileCheckoutRequest.equals(other.getSetMobileCheckoutRequest())));
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
        if (getSetMobileCheckoutRequest() != null) {
            _hashCode += getSetMobileCheckoutRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMobileCheckoutReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetMobileCheckoutReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setMobileCheckoutRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetMobileCheckoutRequestType"));
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
