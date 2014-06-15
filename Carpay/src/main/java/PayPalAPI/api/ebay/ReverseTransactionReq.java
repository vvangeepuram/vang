/**
 * ReverseTransactionReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ReverseTransactionReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.ReverseTransactionRequestType reverseTransactionRequest;

    public ReverseTransactionReq() {
    }

    public ReverseTransactionReq(
           PayPalAPI.api.ebay.ReverseTransactionRequestType reverseTransactionRequest) {
           this.reverseTransactionRequest = reverseTransactionRequest;
    }


    /**
     * Gets the reverseTransactionRequest value for this ReverseTransactionReq.
     * 
     * @return reverseTransactionRequest
     */
    public PayPalAPI.api.ebay.ReverseTransactionRequestType getReverseTransactionRequest() {
        return reverseTransactionRequest;
    }


    /**
     * Sets the reverseTransactionRequest value for this ReverseTransactionReq.
     * 
     * @param reverseTransactionRequest
     */
    public void setReverseTransactionRequest(PayPalAPI.api.ebay.ReverseTransactionRequestType reverseTransactionRequest) {
        this.reverseTransactionRequest = reverseTransactionRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReverseTransactionReq)) return false;
        ReverseTransactionReq other = (ReverseTransactionReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reverseTransactionRequest==null && other.getReverseTransactionRequest()==null) || 
             (this.reverseTransactionRequest!=null &&
              this.reverseTransactionRequest.equals(other.getReverseTransactionRequest())));
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
        if (getReverseTransactionRequest() != null) {
            _hashCode += getReverseTransactionRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReverseTransactionReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ReverseTransactionReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverseTransactionRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ReverseTransactionRequestType"));
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
