/**
 * EnterBoardingReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class EnterBoardingReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.EnterBoardingRequestType enterBoardingRequest;

    public EnterBoardingReq() {
    }

    public EnterBoardingReq(
           PayPalAPI.api.ebay.EnterBoardingRequestType enterBoardingRequest) {
           this.enterBoardingRequest = enterBoardingRequest;
    }


    /**
     * Gets the enterBoardingRequest value for this EnterBoardingReq.
     * 
     * @return enterBoardingRequest
     */
    public PayPalAPI.api.ebay.EnterBoardingRequestType getEnterBoardingRequest() {
        return enterBoardingRequest;
    }


    /**
     * Sets the enterBoardingRequest value for this EnterBoardingReq.
     * 
     * @param enterBoardingRequest
     */
    public void setEnterBoardingRequest(PayPalAPI.api.ebay.EnterBoardingRequestType enterBoardingRequest) {
        this.enterBoardingRequest = enterBoardingRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnterBoardingReq)) return false;
        EnterBoardingReq other = (EnterBoardingReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enterBoardingRequest==null && other.getEnterBoardingRequest()==null) || 
             (this.enterBoardingRequest!=null &&
              this.enterBoardingRequest.equals(other.getEnterBoardingRequest())));
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
        if (getEnterBoardingRequest() != null) {
            _hashCode += getEnterBoardingRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnterBoardingReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">EnterBoardingReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enterBoardingRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "EnterBoardingRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "EnterBoardingRequestType"));
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
