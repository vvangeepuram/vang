/**
 * BMUpdateButtonReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMUpdateButtonReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.BMUpdateButtonRequestType BMUpdateButtonRequest;

    public BMUpdateButtonReq() {
    }

    public BMUpdateButtonReq(
           PayPalAPI.api.ebay.BMUpdateButtonRequestType BMUpdateButtonRequest) {
           this.BMUpdateButtonRequest = BMUpdateButtonRequest;
    }


    /**
     * Gets the BMUpdateButtonRequest value for this BMUpdateButtonReq.
     * 
     * @return BMUpdateButtonRequest
     */
    public PayPalAPI.api.ebay.BMUpdateButtonRequestType getBMUpdateButtonRequest() {
        return BMUpdateButtonRequest;
    }


    /**
     * Sets the BMUpdateButtonRequest value for this BMUpdateButtonReq.
     * 
     * @param BMUpdateButtonRequest
     */
    public void setBMUpdateButtonRequest(PayPalAPI.api.ebay.BMUpdateButtonRequestType BMUpdateButtonRequest) {
        this.BMUpdateButtonRequest = BMUpdateButtonRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMUpdateButtonReq)) return false;
        BMUpdateButtonReq other = (BMUpdateButtonReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BMUpdateButtonRequest==null && other.getBMUpdateButtonRequest()==null) || 
             (this.BMUpdateButtonRequest!=null &&
              this.BMUpdateButtonRequest.equals(other.getBMUpdateButtonRequest())));
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
        if (getBMUpdateButtonRequest() != null) {
            _hashCode += getBMUpdateButtonRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMUpdateButtonReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMUpdateButtonReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMUpdateButtonRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMUpdateButtonRequestType"));
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
