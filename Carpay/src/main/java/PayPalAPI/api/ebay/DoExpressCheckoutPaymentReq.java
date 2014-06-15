/**
 * DoExpressCheckoutPaymentReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoExpressCheckoutPaymentReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoExpressCheckoutPaymentRequestType doExpressCheckoutPaymentRequest;

    public DoExpressCheckoutPaymentReq() {
    }

    public DoExpressCheckoutPaymentReq(
           PayPalAPI.api.ebay.DoExpressCheckoutPaymentRequestType doExpressCheckoutPaymentRequest) {
           this.doExpressCheckoutPaymentRequest = doExpressCheckoutPaymentRequest;
    }


    /**
     * Gets the doExpressCheckoutPaymentRequest value for this DoExpressCheckoutPaymentReq.
     * 
     * @return doExpressCheckoutPaymentRequest
     */
    public PayPalAPI.api.ebay.DoExpressCheckoutPaymentRequestType getDoExpressCheckoutPaymentRequest() {
        return doExpressCheckoutPaymentRequest;
    }


    /**
     * Sets the doExpressCheckoutPaymentRequest value for this DoExpressCheckoutPaymentReq.
     * 
     * @param doExpressCheckoutPaymentRequest
     */
    public void setDoExpressCheckoutPaymentRequest(PayPalAPI.api.ebay.DoExpressCheckoutPaymentRequestType doExpressCheckoutPaymentRequest) {
        this.doExpressCheckoutPaymentRequest = doExpressCheckoutPaymentRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoExpressCheckoutPaymentReq)) return false;
        DoExpressCheckoutPaymentReq other = (DoExpressCheckoutPaymentReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doExpressCheckoutPaymentRequest==null && other.getDoExpressCheckoutPaymentRequest()==null) || 
             (this.doExpressCheckoutPaymentRequest!=null &&
              this.doExpressCheckoutPaymentRequest.equals(other.getDoExpressCheckoutPaymentRequest())));
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
        if (getDoExpressCheckoutPaymentRequest() != null) {
            _hashCode += getDoExpressCheckoutPaymentRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoExpressCheckoutPaymentReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoExpressCheckoutPaymentReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doExpressCheckoutPaymentRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoExpressCheckoutPaymentRequestType"));
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
