/**
 * BMGetButtonDetailsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMGetButtonDetailsReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.BMGetButtonDetailsRequestType BMGetButtonDetailsRequest;

    public BMGetButtonDetailsReq() {
    }

    public BMGetButtonDetailsReq(
           PayPalAPI.api.ebay.BMGetButtonDetailsRequestType BMGetButtonDetailsRequest) {
           this.BMGetButtonDetailsRequest = BMGetButtonDetailsRequest;
    }


    /**
     * Gets the BMGetButtonDetailsRequest value for this BMGetButtonDetailsReq.
     * 
     * @return BMGetButtonDetailsRequest
     */
    public PayPalAPI.api.ebay.BMGetButtonDetailsRequestType getBMGetButtonDetailsRequest() {
        return BMGetButtonDetailsRequest;
    }


    /**
     * Sets the BMGetButtonDetailsRequest value for this BMGetButtonDetailsReq.
     * 
     * @param BMGetButtonDetailsRequest
     */
    public void setBMGetButtonDetailsRequest(PayPalAPI.api.ebay.BMGetButtonDetailsRequestType BMGetButtonDetailsRequest) {
        this.BMGetButtonDetailsRequest = BMGetButtonDetailsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMGetButtonDetailsReq)) return false;
        BMGetButtonDetailsReq other = (BMGetButtonDetailsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BMGetButtonDetailsRequest==null && other.getBMGetButtonDetailsRequest()==null) || 
             (this.BMGetButtonDetailsRequest!=null &&
              this.BMGetButtonDetailsRequest.equals(other.getBMGetButtonDetailsRequest())));
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
        if (getBMGetButtonDetailsRequest() != null) {
            _hashCode += getBMGetButtonDetailsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMGetButtonDetailsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMGetButtonDetailsReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMGetButtonDetailsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetButtonDetailsRequestType"));
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
