/**
 * ExecuteCheckoutOperationsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class ExecuteCheckoutOperationsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest;

    public ExecuteCheckoutOperationsReq() {
    }

    public ExecuteCheckoutOperationsReq(
           PayPalAPI.api.ebay.ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest) {
           this.executeCheckoutOperationsRequest = executeCheckoutOperationsRequest;
    }


    /**
     * Gets the executeCheckoutOperationsRequest value for this ExecuteCheckoutOperationsReq.
     * 
     * @return executeCheckoutOperationsRequest
     */
    public PayPalAPI.api.ebay.ExecuteCheckoutOperationsRequestType getExecuteCheckoutOperationsRequest() {
        return executeCheckoutOperationsRequest;
    }


    /**
     * Sets the executeCheckoutOperationsRequest value for this ExecuteCheckoutOperationsReq.
     * 
     * @param executeCheckoutOperationsRequest
     */
    public void setExecuteCheckoutOperationsRequest(PayPalAPI.api.ebay.ExecuteCheckoutOperationsRequestType executeCheckoutOperationsRequest) {
        this.executeCheckoutOperationsRequest = executeCheckoutOperationsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecuteCheckoutOperationsReq)) return false;
        ExecuteCheckoutOperationsReq other = (ExecuteCheckoutOperationsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.executeCheckoutOperationsRequest==null && other.getExecuteCheckoutOperationsRequest()==null) || 
             (this.executeCheckoutOperationsRequest!=null &&
              this.executeCheckoutOperationsRequest.equals(other.getExecuteCheckoutOperationsRequest())));
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
        if (getExecuteCheckoutOperationsRequest() != null) {
            _hashCode += getExecuteCheckoutOperationsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecuteCheckoutOperationsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">ExecuteCheckoutOperationsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("executeCheckoutOperationsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "ExecuteCheckoutOperationsRequestType"));
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
