/**
 * BMGetInventoryReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMGetInventoryReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.BMGetInventoryRequestType BMGetInventoryRequest;

    public BMGetInventoryReq() {
    }

    public BMGetInventoryReq(
           PayPalAPI.api.ebay.BMGetInventoryRequestType BMGetInventoryRequest) {
           this.BMGetInventoryRequest = BMGetInventoryRequest;
    }


    /**
     * Gets the BMGetInventoryRequest value for this BMGetInventoryReq.
     * 
     * @return BMGetInventoryRequest
     */
    public PayPalAPI.api.ebay.BMGetInventoryRequestType getBMGetInventoryRequest() {
        return BMGetInventoryRequest;
    }


    /**
     * Sets the BMGetInventoryRequest value for this BMGetInventoryReq.
     * 
     * @param BMGetInventoryRequest
     */
    public void setBMGetInventoryRequest(PayPalAPI.api.ebay.BMGetInventoryRequestType BMGetInventoryRequest) {
        this.BMGetInventoryRequest = BMGetInventoryRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMGetInventoryReq)) return false;
        BMGetInventoryReq other = (BMGetInventoryReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BMGetInventoryRequest==null && other.getBMGetInventoryRequest()==null) || 
             (this.BMGetInventoryRequest!=null &&
              this.BMGetInventoryRequest.equals(other.getBMGetInventoryRequest())));
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
        if (getBMGetInventoryRequest() != null) {
            _hashCode += getBMGetInventoryRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMGetInventoryReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMGetInventoryReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMGetInventoryRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetInventoryRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMGetInventoryRequestType"));
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
