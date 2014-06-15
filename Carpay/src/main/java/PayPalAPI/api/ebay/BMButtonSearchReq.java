/**
 * BMButtonSearchReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package PayPalAPI.api.ebay;

public class BMButtonSearchReq  implements java.io.Serializable {
    private PayPalAPI.api.ebay.BMButtonSearchRequestType BMButtonSearchRequest;

    public BMButtonSearchReq() {
    }

    public BMButtonSearchReq(
           PayPalAPI.api.ebay.BMButtonSearchRequestType BMButtonSearchRequest) {
           this.BMButtonSearchRequest = BMButtonSearchRequest;
    }


    /**
     * Gets the BMButtonSearchRequest value for this BMButtonSearchReq.
     * 
     * @return BMButtonSearchRequest
     */
    public PayPalAPI.api.ebay.BMButtonSearchRequestType getBMButtonSearchRequest() {
        return BMButtonSearchRequest;
    }


    /**
     * Sets the BMButtonSearchRequest value for this BMButtonSearchReq.
     * 
     * @param BMButtonSearchRequest
     */
    public void setBMButtonSearchRequest(PayPalAPI.api.ebay.BMButtonSearchRequestType BMButtonSearchRequest) {
        this.BMButtonSearchRequest = BMButtonSearchRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BMButtonSearchReq)) return false;
        BMButtonSearchReq other = (BMButtonSearchReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.BMButtonSearchRequest==null && other.getBMButtonSearchRequest()==null) || 
             (this.BMButtonSearchRequest!=null &&
              this.BMButtonSearchRequest.equals(other.getBMButtonSearchRequest())));
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
        if (getBMButtonSearchRequest() != null) {
            _hashCode += getBMButtonSearchRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BMButtonSearchReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", ">BMButtonSearchReq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BMButtonSearchRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMButtonSearchRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:api:PayPalAPI", "BMButtonSearchRequestType"));
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
