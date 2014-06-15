/**
 * BMManageButtonStatusReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMManageButtonStatusReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.BMManageButtonStatusRequestType BMManageButtonStatusRequest;

    public BMManageButtonStatusReq() {
    }

    public BMManageButtonStatusReq(
           PayPalAPI.api.ebay.BMManageButtonStatusRequestType BMManageButtonStatusRequest) {
           this.BMManageButtonStatusRequest = BMManageButtonStatusRequest;
    }


    /**
     * Gets the BMManageButtonStatusRequest value for this BMManageButtonStatusReq.
     * 
     * @return BMManageButtonStatusRequest
     */
    public PayPalAPI.api.ebay.BMManageButtonStatusRequestType getBMManageButtonStatusRequest() {
        return BMManageButtonStatusRequest;
    }


    /**
     * Sets the BMManageButtonStatusRequest value for this BMManageButtonStatusReq.
     * 
     * @param BMManageButtonStatusRequest
     */
    public void setBMManageButtonStatusRequest(PayPalAPI.api.ebay.BMManageButtonStatusRequestType BMManageButtonStatusRequest) {
        this.BMManageButtonStatusRequest = BMManageButtonStatusRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMManageButtonStatusReq)) return false;
        BMManageButtonStatusReq other = (BMManageButtonStatusReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BMManageButtonStatusRequest==null && other.getBMManageButtonStatusRequest()==null) || 
             (this.BMManageButtonStatusRequest!=null &&
              this.BMManageButtonStatusRequest.equals(other.getBMManageButtonStatusRequest())));
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
        if (getBMManageButtonStatusRequest() != null) {
            _hashCode += getBMManageButtonStatusRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMManageButtonStatusReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMManageButtonStatusReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMManageButtonStatusRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMManageButtonStatusRequestType"));
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
