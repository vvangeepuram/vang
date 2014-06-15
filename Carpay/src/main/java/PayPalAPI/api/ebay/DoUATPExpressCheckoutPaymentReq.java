/**
 * DoUATPExpressCheckoutPaymentReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoUATPExpressCheckoutPaymentReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentRequestType doUATPExpressCheckoutPaymentRequest;

    public DoUATPExpressCheckoutPaymentReq() {
    }

    public DoUATPExpressCheckoutPaymentReq(
           PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentRequestType doUATPExpressCheckoutPaymentRequest) {
           this.doUATPExpressCheckoutPaymentRequest = doUATPExpressCheckoutPaymentRequest;
    }


    /**
     * Gets the doUATPExpressCheckoutPaymentRequest value for this DoUATPExpressCheckoutPaymentReq.
     * 
     * @return doUATPExpressCheckoutPaymentRequest
     */
    public PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentRequestType getDoUATPExpressCheckoutPaymentRequest() {
        return doUATPExpressCheckoutPaymentRequest;
    }


    /**
     * Sets the doUATPExpressCheckoutPaymentRequest value for this DoUATPExpressCheckoutPaymentReq.
     * 
     * @param doUATPExpressCheckoutPaymentRequest
     */
    public void setDoUATPExpressCheckoutPaymentRequest(PayPalAPI.api.ebay.DoUATPExpressCheckoutPaymentRequestType doUATPExpressCheckoutPaymentRequest) {
        this.doUATPExpressCheckoutPaymentRequest = doUATPExpressCheckoutPaymentRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoUATPExpressCheckoutPaymentReq)) return false;
        DoUATPExpressCheckoutPaymentReq other = (DoUATPExpressCheckoutPaymentReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doUATPExpressCheckoutPaymentRequest==null && other.getDoUATPExpressCheckoutPaymentRequest()==null) || 
             (this.doUATPExpressCheckoutPaymentRequest!=null &&
              this.doUATPExpressCheckoutPaymentRequest.equals(other.getDoUATPExpressCheckoutPaymentRequest())));
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
        if (getDoUATPExpressCheckoutPaymentRequest() != null) {
            _hashCode += getDoUATPExpressCheckoutPaymentRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoUATPExpressCheckoutPaymentReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoUATPExpressCheckoutPaymentReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doUATPExpressCheckoutPaymentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoUATPExpressCheckoutPaymentRequestType"));
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
