/**
 * ThreeDSecureInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eBLBaseComponents.apis.ebay;


/**
 * 3DSecureInfoType
 *                 Information about 3D Secure parameters.
 */
public class ThreeDSecureInfoType  implements java.io.Serializable {
    private eBLBaseComponents.apis.ebay.ThreeDSecureRequestType threeDSecureRequest;

    private eBLBaseComponents.apis.ebay.ThreeDSecureResponseType threeDSecureResponse;

    public ThreeDSecureInfoType() {
    }

    public ThreeDSecureInfoType(
           eBLBaseComponents.apis.ebay.ThreeDSecureRequestType threeDSecureRequest,
           eBLBaseComponents.apis.ebay.ThreeDSecureResponseType threeDSecureResponse) {
           this.threeDSecureRequest = threeDSecureRequest;
           this.threeDSecureResponse = threeDSecureResponse;
    }


    /**
     * Gets the threeDSecureRequest value for this ThreeDSecureInfoType.
     * 
     * @return threeDSecureRequest
     */
    public eBLBaseComponents.apis.ebay.ThreeDSecureRequestType getThreeDSecureRequest() {
        return threeDSecureRequest;
    }


    /**
     * Sets the threeDSecureRequest value for this ThreeDSecureInfoType.
     * 
     * @param threeDSecureRequest
     */
    public void setThreeDSecureRequest(eBLBaseComponents.apis.ebay.ThreeDSecureRequestType threeDSecureRequest) {
        this.threeDSecureRequest = threeDSecureRequest;
    }


    /**
     * Gets the threeDSecureResponse value for this ThreeDSecureInfoType.
     * 
     * @return threeDSecureResponse
     */
    public eBLBaseComponents.apis.ebay.ThreeDSecureResponseType getThreeDSecureResponse() {
        return threeDSecureResponse;
    }


    /**
     * Sets the threeDSecureResponse value for this ThreeDSecureInfoType.
     * 
     * @param threeDSecureResponse
     */
    public void setThreeDSecureResponse(eBLBaseComponents.apis.ebay.ThreeDSecureResponseType threeDSecureResponse) {
        this.threeDSecureResponse = threeDSecureResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThreeDSecureInfoType)) return false;
        ThreeDSecureInfoType other = (ThreeDSecureInfoType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.threeDSecureRequest==null && other.getThreeDSecureRequest()==null) || 
             (this.threeDSecureRequest!=null &&
              this.threeDSecureRequest.equals(other.getThreeDSecureRequest()))) &&
            ((this.threeDSecureResponse==null && other.getThreeDSecureResponse()==null) || 
             (this.threeDSecureResponse!=null &&
              this.threeDSecureResponse.equals(other.getThreeDSecureResponse())));
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
        if (getThreeDSecureRequest() != null) {
            _hashCode += getThreeDSecureRequest().hashCode();
        }
        if (getThreeDSecureResponse() != null) {
            _hashCode += getThreeDSecureResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThreeDSecureInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDSecureRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threeDSecureResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:ebay:apis:eBLBaseComponents", "ThreeDSecureResponseType"));
        elemField.setMinOccurs(0);
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
