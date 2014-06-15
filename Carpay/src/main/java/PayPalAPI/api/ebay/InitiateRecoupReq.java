/**
 * InitiateRecoupReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class InitiateRecoupReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.InitiateRecoupRequestType initiateRecoupRequest;

    public InitiateRecoupReq() {
    }

    public InitiateRecoupReq(
           PayPalAPI.api.ebay.InitiateRecoupRequestType initiateRecoupRequest) {
           this.initiateRecoupRequest = initiateRecoupRequest;
    }


    /**
     * Gets the initiateRecoupRequest value for this InitiateRecoupReq.
     * 
     * @return initiateRecoupRequest
     */
    public PayPalAPI.api.ebay.InitiateRecoupRequestType getInitiateRecoupRequest() {
        return initiateRecoupRequest;
    }


    /**
     * Sets the initiateRecoupRequest value for this InitiateRecoupReq.
     * 
     * @param initiateRecoupRequest
     */
    public void setInitiateRecoupRequest(PayPalAPI.api.ebay.InitiateRecoupRequestType initiateRecoupRequest) {
        this.initiateRecoupRequest = initiateRecoupRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InitiateRecoupReq)) return false;
        InitiateRecoupReq other = (InitiateRecoupReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.initiateRecoupRequest==null && other.getInitiateRecoupRequest()==null) || 
             (this.initiateRecoupRequest!=null &&
              this.initiateRecoupRequest.equals(other.getInitiateRecoupRequest())));
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
        if (getInitiateRecoupRequest() != null) {
            _hashCode += getInitiateRecoupRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InitiateRecoupReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">InitiateRecoupReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiateRecoupRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InitiateRecoupRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "InitiateRecoupRequestType"));
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
