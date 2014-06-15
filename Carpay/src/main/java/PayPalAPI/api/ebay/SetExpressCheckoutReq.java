/**
 * SetExpressCheckoutReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class SetExpressCheckoutReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.SetExpressCheckoutRequestType setExpressCheckoutRequest;

    public SetExpressCheckoutReq() {
    }

    public SetExpressCheckoutReq(
           PayPalAPI.api.ebay.SetExpressCheckoutRequestType setExpressCheckoutRequest) {
           this.setExpressCheckoutRequest = setExpressCheckoutRequest;
    }


    /**
     * Gets the setExpressCheckoutRequest value for this SetExpressCheckoutReq.
     * 
     * @return setExpressCheckoutRequest
     */
    public PayPalAPI.api.ebay.SetExpressCheckoutRequestType getSetExpressCheckoutRequest() {
        return setExpressCheckoutRequest;
    }


    /**
     * Sets the setExpressCheckoutRequest value for this SetExpressCheckoutReq.
     * 
     * @param setExpressCheckoutRequest
     */
    public void setSetExpressCheckoutRequest(PayPalAPI.api.ebay.SetExpressCheckoutRequestType setExpressCheckoutRequest) {
        this.setExpressCheckoutRequest = setExpressCheckoutRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetExpressCheckoutReq)) return false;
        SetExpressCheckoutReq other = (SetExpressCheckoutReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setExpressCheckoutRequest==null && other.getSetExpressCheckoutRequest()==null) || 
             (this.setExpressCheckoutRequest!=null &&
              this.setExpressCheckoutRequest.equals(other.getSetExpressCheckoutRequest())));
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
        if (getSetExpressCheckoutRequest() != null) {
            _hashCode += getSetExpressCheckoutRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetExpressCheckoutReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">SetExpressCheckoutReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setExpressCheckoutRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "SetExpressCheckoutRequestType"));
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
