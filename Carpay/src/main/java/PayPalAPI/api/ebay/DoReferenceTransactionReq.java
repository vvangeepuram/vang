/**
 * DoReferenceTransactionReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class DoReferenceTransactionReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.DoReferenceTransactionRequestType doReferenceTransactionRequest;

    public DoReferenceTransactionReq() {
    }

    public DoReferenceTransactionReq(
           PayPalAPI.api.ebay.DoReferenceTransactionRequestType doReferenceTransactionRequest) {
           this.doReferenceTransactionRequest = doReferenceTransactionRequest;
    }


    /**
     * Gets the doReferenceTransactionRequest value for this DoReferenceTransactionReq.
     * 
     * @return doReferenceTransactionRequest
     */
    public PayPalAPI.api.ebay.DoReferenceTransactionRequestType getDoReferenceTransactionRequest() {
        return doReferenceTransactionRequest;
    }


    /**
     * Sets the doReferenceTransactionRequest value for this DoReferenceTransactionReq.
     * 
     * @param doReferenceTransactionRequest
     */
    public void setDoReferenceTransactionRequest(PayPalAPI.api.ebay.DoReferenceTransactionRequestType doReferenceTransactionRequest) {
        this.doReferenceTransactionRequest = doReferenceTransactionRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoReferenceTransactionReq)) return false;
        DoReferenceTransactionReq other = (DoReferenceTransactionReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.doReferenceTransactionRequest==null && other.getDoReferenceTransactionRequest()==null) || 
             (this.doReferenceTransactionRequest!=null &&
              this.doReferenceTransactionRequest.equals(other.getDoReferenceTransactionRequest())));
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
        if (getDoReferenceTransactionRequest() != null) {
            _hashCode += getDoReferenceTransactionRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoReferenceTransactionReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">DoReferenceTransactionReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doReferenceTransactionRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "DoReferenceTransactionRequestType"));
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
